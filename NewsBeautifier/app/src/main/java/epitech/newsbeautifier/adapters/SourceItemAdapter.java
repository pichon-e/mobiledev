package epitech.newsbeautifier.adapters;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

import epitech.newsbeautifier.Consts;
import epitech.newsbeautifier.R;
import epitech.newsbeautifier.controllers.SourceViewFragment;
import epitech.newsbeautifier.models.Source;

/**
 * Created by Nicolas on 05/03/2016.
 */
public class SourceItemAdapter extends ArrayAdapter<Source> {


    public SourceItemAdapter(Context context, List<Source> sources) {
        super(context, R.layout.item_source, R.id.source_name, sources);
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {

        final LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.item_source, parent, false);

        ((TextView)rowView.findViewById(R.id.source_name)).setText(getItem(position).getName());

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = Consts.getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_frame, new SourceViewFragment()).commit();
            }
        });
        return rowView;
    }
}
