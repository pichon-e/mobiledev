package epitech.newsbeautifier.models;

import java.util.ArrayList;

/**
 * Created by Nicolas on 05/03/2016.
 */
public class Source {
    private String      name;
    private ArrayList   news;

    // GETTERS
    public ArrayList getNews() {
        return news;
    }

    public String getName() {
        return name;
    }


    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setNews(ArrayList news) {
        this.news = news;
    }
}
