package com.example.bendenisshaffer.ourapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aksha on 12/6/2017.
 */

public class LandingPageAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public LandingPageAdapter(Context context, String[] values) {

        super(context, -1, values);
        this.context = context;
        this.values = values;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);
        // change the icon for Windows and iPhone
        if(position == 1)
            imageView.setImageResource(R.drawable.mian);


        String s = values[position];
        if (s.startsWith("iPhone")) {
            //imageView.setImageResource(R.drawable.no);
        } else {
            //imageView.setImageResource(R.drawable.ok);
        }

        return rowView;
    }

}
