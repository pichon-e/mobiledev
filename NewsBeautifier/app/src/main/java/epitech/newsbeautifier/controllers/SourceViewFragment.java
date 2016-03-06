package epitech.newsbeautifier.controllers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import epitech.newsbeautifier.Consts;
import epitech.newsbeautifier.R;
import epitech.newsbeautifier.adapters.NewsItemAdapter;
import epitech.newsbeautifier.models.News;
import epitech.newsbeautifier.models.User;

/**
 * Created by Nicolas on 06/03/2016.
 */
public class SourceViewFragment extends Fragment {

    View                myFragmentView;
    private List<News>  news_list;
    private ListView    news_listview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myFragmentView = inflater.inflate(R.layout.fragment_news, container, false);
        Consts.getFab().setVisibility(View.VISIBLE);

        return myFragmentView;
    }

    @Override
    public void onResume()
    {
        super.onResume();
        update();
    }

    public void update() {
        List<News> news = User.getInstance().getNews();
        news_listview = (ListView) myFragmentView.findViewById(R.id.news_listview);
        news_list = new ArrayList<News>();

        for (int i = 0; i < 10; i++) {
            News newsAdd = new News();
            newsAdd.setName("News " + i);
            news_list.add(newsAdd);
        }

        news_listview.setAdapter(new NewsItemAdapter(getActivity(), news_list));
    }
}