package com.doteam.spcall.soccer;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.doteam.spcall.R;
//신제주 구제주 서귀포로 갈라지는부분
public class Soccer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer);


        Button newjejubtn = (Button) findViewById(R.id.newjejubtn);
        Button oldjejubtn = (Button) findViewById(R.id.oldjejubtn);
        Button seogwibtn = (Button)  findViewById(R.id.seogwibtn);



        newjejubtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {


                //데이터 베이스랑 연동시켜서 버튼누르면 액티비티 하나가 정보가 바뀌는 형식


                Intent i = new Intent(getApplicationContext(),LocationList.class);
                startActivity(i);
            }
        });


        oldjejubtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
            //DB연동부분

                Intent i = new Intent(getApplicationContext(),LocationList.class);
                startActivity(i);
            }
        });

        seogwibtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {



                Intent i = new Intent(getApplicationContext(),LocationList.class);
                startActivity(i);
            }
        });


    }
}
