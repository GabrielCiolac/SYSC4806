import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Form {

    @Id
    private Long id;

    //TODO Replace String to Question Type
    private List<String> questionList;

    public Form(){

        questionList = new LinkedList<String>();

    }

    public Form(List<String> questionList){
        this.questionList = questionList;
    }

    /**
     * Adds question to the question list.
     * @param question
     */
    public void addQuestion(String question){
        questionList.add(question);
    }

    /**
     * Removing question from question list.
     * @param i index of the list
     */
    public void removeQuestion(int i){
        if(i >= 0 && i < questionList.size()){
            questionList.remove(i);
        }
    }

    /**
     * Get question from question list.
     */
    public String getQuestion(int i){
        if(i >= 0 && i < questionList.size()){
            return questionList.get(i);
        }
        return null;
    }

    /**
     * Clear all questions from the question list.
     */
    public void clearQuestion(){
        questionList.clear();
    }

    /**
     * Get question list.
     * @return
     */
    public List<String> getQuestionList(){
        return this.questionList;
    }

    /**
     * Set question list.
     * @param questionList
     */
    public void setQuestionList(List<String> questionList){
        this.questionList = questionList;
    }

    /**
     * Get id.
     * @return
     */
    public Long getId(){
        return this.id;
    }

    /**
     * Set id.
     * @param id
     */
    public void setId(Long id){
        this.id = id;
    }
}
