package epitech.newsbeautifier.controllers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import epitech.newsbeautifier.Consts;
import epitech.newsbeautifier.R;

/**
 * Created by Nicolas on 06/03/2016.
 */
public class NewsViewFragment extends Fragment {

    View    myFragmentView;
    String  newsName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myFragmentView = inflater.inflate(R.layout.fragment_news_view, container, false);
        Consts.getFab().setVisibility(View.VISIBLE);
        Consts.getActivity().setTitle(newsName);
        return myFragmentView;
    }

    public void setNewName(String name) {
        newsName = name;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Consts.getFab().setVisibility(View.GONE);
    }
}