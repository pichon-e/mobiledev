package epitech.newsbeautifier.models;

/**
 * Created by Nicolas on 05/03/2016.
 */
public class News {
    private String  name;
    private String  content;


    // GETTERS
    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
