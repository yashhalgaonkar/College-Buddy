package com.example.yashh.collegebuddy;

import android.content.Intent;
import android.media.Image;
import android.media.MediaMetadata;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Assigning IDs..
        mainGrid=(GridLayout) findViewById(R.id.mainGrid);

        //Set event
        setSingleEvent(mainGrid);
        }

       //To add onClick Listeners...
    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child items of main grid
        for(int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView=(CardView) mainGrid.getChildAt(i);
            final int finalI=i;
            //Set onClick Listeners to all card views..
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (finalI){ //Switch between activities...
                        case 0:
                            Intent a=new Intent(MainActivity.this,AttActivity.class);
                            startActivity(a);
                            break;
                        case 1:
                            Intent b=new Intent(MainActivity.this,SubActivity.class);
                            startActivity(b);
                            break;
                        case 2:
                            Intent c=new Intent(MainActivity.this,ExtActivity.class);
                            startActivity(c);
                            break;
                        case 3:
                            Intent d=new Intent(MainActivity.this,ttActivity.class);
                            startActivity(d);
                            break;
                        case 4:
                            Intent e=new Intent(MainActivity.this,offActivity.class);
                            startActivity(e);
                            break;
                        case 5:
                            Intent f=new Intent(MainActivity.this,vitActivity.class);
                            startActivity(f);
                            break;


                    }
                }
            });

        }
    }
}
