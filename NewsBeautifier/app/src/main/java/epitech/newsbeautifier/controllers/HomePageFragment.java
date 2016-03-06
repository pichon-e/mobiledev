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
import epitech.newsbeautifier.adapters.SourceItemAdapter;
import epitech.newsbeautifier.models.Source;
import epitech.newsbeautifier.models.User;

public class HomePageFragment extends Fragment {

    View                        myFragmentView;

    static ListView             source_listview;
    static List<Source>         source_list;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myFragmentView = inflater.inflate(R.layout.fragment_source, container, false);

        return myFragmentView;
    }

    @Override
    public void onResume()
    {
        super.onResume();
        update();
    }

    public void update() {
        List<Source> sources = User.getInstance().getSources();
        source_listview = (ListView) myFragmentView.findViewById(R.id.source_listview);
        source_list = new ArrayList<Source>();

        for (int i = 0; i < 10; i++) {
            Source newSource = new Source();
            newSource.setName("Source " + i);
            source_list.add(newSource);
        }

        source_listview.setAdapter(new SourceItemAdapter(getActivity(), source_list));
    }

}

