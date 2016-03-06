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

    // Reset radiator opened and its gravity
    @Override
    public void onResume()
    {
        super.onResume();
        update();
    }

    public void update() {
        // creation of radiators list and adapter element
        List<Source> sources = User.getInstance().getSources();
        source_listview = (ListView) myFragmentView.findViewById(R.id.fragment_source_list);
        source_list = new ArrayList<Source>();

        // Adapter setting
//        source_listview.setAdapter(new SourceItemAdapter(getActivity(), source_list));
    }

}

