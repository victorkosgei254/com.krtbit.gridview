package com.kritbit.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<CourseModel> {
    public MyAdapter(@NonNull Context context, ArrayList<CourseModel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_card_item,
                    parent,false);

        }

        CourseModel courseModel = getItem(position);
        TextView courseTitle = listItemView.findViewById(R.id.card_text_view);
        ImageView courseImage = listItemView.findViewById(R.id.card_image_view);
        courseTitle.setText(courseModel.getText());
        courseImage.setImageResource(courseModel.getImage());


        return listItemView;
    }
}
