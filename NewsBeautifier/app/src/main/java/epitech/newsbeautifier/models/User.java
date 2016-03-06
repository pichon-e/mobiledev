package epitech.newsbeautifier.models;

import java.util.List;

/**
 * Created by Nicolas on 05/03/2016.
 */
public class User {
    private static User     _currentUser = null;
    private List<Source>    sources;
    private List<News>      news;
    private List<News>      favorites;

    public static User getInstance() {
        if (_currentUser == null) {
            _currentUser = new User();
        }

        return _currentUser;
    }

    // GETTERS
    public List<Source> getSources() {
        return sources;
    }

    public List<News> getNews() {
        return news;
    }

    public List<News> getFavorites() {
        return favorites;
    }

    // OTHER FUNCTIONS
    public void addFavorite(News news) {
        favorites.add(news);
    }
}
