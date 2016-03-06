package epitech.newsbeautifier.controllers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import epitech.newsbeautifier.R;
import epitech.newsbeautifier.models.Source;

/**
 * Created by Nicolas on 06/03/2016.
 */
public class AddSourceFragment extends Fragment {
    View myFragmentView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myFragmentView = inflater.inflate(R.layout.fragment_add_source, container, false);

        Button installNewSource = (Button) myFragmentView.findViewById(R.id.new_source_button);
        final EditText sourceName = (EditText) myFragmentView.findViewById(R.id.source_name);
        installNewSource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sourceName.getText().length() > 0) {

                }
            }
        });

        return myFragmentView;
    }

    // Reset radiator opened and its gravity
    @Override
    public void onResume()
    {
        super.onResume();
    }

}
