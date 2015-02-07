package com.codepath.instagramviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by edmundye on 2/6/15.
 */
public class InstagramCommentsAdapter extends ArrayAdapter<String> {

    public InstagramCommentsAdapter(Context context, List<String> comments) {
        super(context, android.R.layout.simple_list_item_1, comments);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_comment, parent, false);
        }
        TextView tvComment = (TextView) convertView.findViewById(R.id.comment);
        tvComment.setText(getItem(position));
        return convertView;
    }

}
