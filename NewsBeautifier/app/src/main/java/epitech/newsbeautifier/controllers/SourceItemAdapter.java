package epitech.newsbeautifier.controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.List;

import epitech.newsbeautifier.R;
import epitech.newsbeautifier.models.Source;

/**
 * Created by Nicolas on 05/03/2016.
 */
public class SourceItemAdapter extends ArrayAdapter<Source> {


    public SourceItemAdapter(Context context, List<Source> radiators) {
        super(context, R.layout.item_source, R.id.source_name, radiators);
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {

        final LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.item_source, parent, false);
        return rowView;
    }
}
