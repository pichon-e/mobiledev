package epitech.newsbeautifier.controllers;

import epitech.newsbeautifier.models.Source;

/**
 * Created by Nicolas on 05/03/2016.
 */
public class SourceLoader {
    private Source  source;


    public Source SourceLoader(String sourceName) {
        source = new Source();
        return source;
    }
}
