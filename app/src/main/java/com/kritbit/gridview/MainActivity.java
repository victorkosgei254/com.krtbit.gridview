package com.kritbit.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);

        //Data to be displayed into grid view
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel(R.drawable.ic_java,"Java Language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_python,"Python Programming Language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_golang,"Go Lang programming language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_html,"HTML, is a markup language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_php,"PHP, mostly used on wordpress sites"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_js,"JavaScript, mostly used in Web development and design"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_css,"CSS,Styling HTML"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_java,"Java Language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_python,"Python Programming Language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_golang,"Go Lang programming language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_html,"HTML, is a markup language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_php,"PHP, mostly used on wordpress sites"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_js,"JavaScript, mostly used in Web development and design"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_css,"CSS,Styling HTML"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_java,"Java Language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_python,"Python Programming Language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_golang,"Go Lang programming language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_html,"HTML, is a markup language"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_php,"PHP, mostly used on wordpress sites"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_js,"JavaScript, mostly used in Web development and design"));
        courseModelArrayList.add(new CourseModel(R.drawable.ic_css,"CSS,Styling HTML"));

        adapter= new MyAdapter(this,courseModelArrayList);
        gridView.setAdapter(adapter);

    }
}