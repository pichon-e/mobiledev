package epitech.newsbeautifier.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import epitech.newsbeautifier.Consts;
import epitech.newsbeautifier.R;
import epitech.newsbeautifier.controllers.NewsViewFragment;
import epitech.newsbeautifier.models.News;

/**
 * Created by Nicolas on 06/03/2016.
 */
public class NewsItemAdapter extends ArrayAdapter<News>{


    public NewsItemAdapter(Context context, List<News> news) {
        super(context, R.layout.item_news, R.id.news_name, news);
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {

        final LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.item_news, parent, false);

        ((TextView)rowView.findViewById(R.id.news_name)).setText(getItem(position).getName());

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = Consts.getFragmentManager();
                Fragment fragment = new NewsViewFragment();
                ((NewsViewFragment)fragment).setNewName((String)((TextView) v.findViewById(R.id.news_name)).getText());
                fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            }
        });
        return rowView;
    }
}
