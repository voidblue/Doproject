package com.doteam.spcall.soccer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import com.doteam.spcall.R;
//신제주 구제주 서귀포를 다시 카테고리로 분류해 나누면서
//각 카테고리는 타이틀을 누르면 그 카테고리에 속하는 모든 구장을 보여줌
public class LocationList extends Activity {

    private ArrayList<String> mGroupList = null;
    private ArrayList<ArrayList<String>> mChildList = null;
    private ArrayList<String> mChildListContent = null;
    private ExpandableListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locationlist);

        setLayout();

        mGroupList = new ArrayList<String>();
        mChildList = new ArrayList<ArrayList<String>>();
        mChildListContent = new ArrayList<String>();

        mGroupList.add("예제1");
        mGroupList.add("예제2");

        mChildList.add(mChildListContent);
        mChildList.add(mChildListContent);

        //mListView.setAdapter(new BaseExpandableAdapter(this,mGroupList,mChildList));

        //mListView.setAdapter(new ExandableListView.OnGroupClickListener) {

    }
    private void setLayout() {

    }
}