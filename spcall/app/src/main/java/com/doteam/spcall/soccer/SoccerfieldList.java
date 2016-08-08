package com.doteam.spcall.soccer;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.doteam.spcall.R;
//신제주 구제주 서귀포로 갈라지는부분
public class SoccerfieldList extends Activity {

    private SoccerfieldList_Adapter m_Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listview ;
        SoccerfieldList_Adapter adapter;
        setContentView(R.layout.activity_soccerfieldlist);


        // Adapter 생성
        adapter = new SoccerfieldList_Adapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(
                "Box", "Account Box Black 36dp") ;
        // 두 번째 아이템 추가.
        adapter.addItem("Circle", "Account Circle Black 36dp") ;
        // 세 번째 아이템 추가.
        adapter.addItem("Ind", "Assignment Ind Black 36dp") ;


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                SoccerListViewItem item = (SoccerListViewItem) parent.getItemAtPosition(position) ;

                String titleStr = item.getTitle() ;
                String descStr = item.getDesc() ;
                Toast.makeText(getApplicationContext(),position+"번째 메뉴",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Soccerfield.class);
                startActivity(i);
            }
        }) ;
    }


}

