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
});