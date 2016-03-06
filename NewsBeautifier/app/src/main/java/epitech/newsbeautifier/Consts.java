package epitech.newsbeautifier;

import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;

import epitech.newsbeautifier.models.User;

/**
 * Created by Nicolas on 06/03/2016.
 */
public class Consts {

    private User                        user;
    private static Activity             activity;
    private static FragmentManager      fragmentManager;
    private static FloatingActionButton fab;


    public User getUser() {
        return user;
    }

    public static Activity getActivity() {
        return activity;
    }

    public static FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    public static FloatingActionButton getFab() {
        return fab;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static void setActivity(Activity activity) {
        Consts.activity = activity;
    }

    public static void setFragmentManager(FragmentManager fragmentManager) {
        Consts.fragmentManager = fragmentManager;
    }

    public static void setFab(FloatingActionButton fab) {
        Consts.fab = fab;
    }
}
