package epitech.newsbeautifier.models;

import java.util.List;

/**
 * Created by Nicolas on 05/03/2016.
 */
public class User {
    private static User     _currentUser = null;
    private List<Source>    sources;

    public static User getInstance() {
        if (_currentUser == null) {
            _currentUser = new User();
        }

        return _currentUser;
    }

    public List<Source> getSources() {
        return sources;
    }
}
