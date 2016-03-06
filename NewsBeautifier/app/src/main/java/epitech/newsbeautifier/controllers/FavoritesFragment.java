package epitech.newsbeautifier.controllers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import epitech.newsbeautifier.R;
import epitech.newsbeautifier.adapters.NewsItemAdapter;
import epitech.newsbeautifier.models.News;
import epitech.newsbeautifier.models.User;

/**
 * Created by Nicolas on 06/03/2016.
 */
public class FavoritesFragment extends Fragment {

    View myFragmentView;

    static ListView favorites_listview;
    static List<News> favorites_list;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myFragmentView = inflater.inflate(R.layout.fragment_favorites, container, false);

        return myFragmentView;
    }

    @Override
    public void onResume() {
        super.onResume();
        update();
    }

    public void update() {
        List<News> favorites = User.getInstance().getFavorites();
        favorites_listview = (ListView) myFragmentView.findViewById(R.id.favorites_listview);
        favorites_list = new ArrayList<News>();

        for (int i = 0; i < 10; i++) {
            News news = new News();
            news.setName("Favoris " + i);
            favorites_list.add(news);
        }

        favorites_listview.setAdapter(new NewsItemAdapter(getActivity(), favorites_list));
    }
}