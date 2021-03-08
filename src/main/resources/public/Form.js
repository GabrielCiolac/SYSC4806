$(document).ready(function() {
    $('#addForm').submit(function (event){
        console.log("running")
        event.preventDefault();
        var title = $("#title").val();
        console.log(title)
        var formData = JSON.stringify({title: title});
        console.log(formData)
        $.ajax({
            type: "POST",
            url: "forms",
            contentType: "application/json",
            dataType: "json",
            data: formData
        })
    })

    function getQuestions(){
        $.ajax({
            type: "get",
            url: "form/{id}",
            success:function(form){
                console.log(form);
               for(var question in form){

               }
            }
        })
    }


    // for open ended, might need separate methods for each type
    function postQuestion(){
        var questionObj= {
            question: $("#question").val()
        }
        $.ajax({
            type: "POST",
            url: "form/{id}",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(questionObj),
            success:function(data){
                // question was added
            }
        })
    }
});