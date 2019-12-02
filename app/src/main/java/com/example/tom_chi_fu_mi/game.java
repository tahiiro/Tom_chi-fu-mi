package com.example.tom_chi_fu_mi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class game extends AppCompatActivity {

    private ImageView imgscore1;
    private ImageView imgscore2;
    private ImageView imgplayer;
    private ImageView imgmob;
    private ImageButton bpr;
    private ImageButton bf;
    private ImageButton bsi;
    private Button replay;
    int scorp=0,scorm=0;

    void aff_score(int a,ImageView b){                 //afficher le score

        switch (a){
            case 1: b.setImageResource(R.drawable.img1);
            break;
            case 2: b.setImageResource(R.drawable.img2);
            break;
            case 3: b.setImageResource(R.drawable.img3);
                break;
            case 4: b.setImageResource(R.drawable.img4);
                break;
            case 5: b.setImageResource(R.drawable.img5);
                bf.setEnabled(false);
                bsi.setEnabled(false);
                bpr.setEnabled(false);
                replay.setEnabled(true);
                replay.setVisibility(View.VISIBLE);
                break;


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        imgscore1=(ImageView)findViewById(R.id.imgscore1);
        imgscore2=(ImageView)findViewById(R.id.imgscore2);
        imgmob=(ImageView)findViewById(R.id.imgmob);
        imgplayer=(ImageView)findViewById(R.id.imgplayer);
        bpr=(ImageButton)findViewById(R.id.bpr);
        bf=(ImageButton)findViewById(R.id.bf);
        bsi=(ImageButton)findViewById(R.id.bsi);
        replay=(Button)findViewById(R.id.replay);
        replay.setEnabled(false);

        bpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgplayer.setImageResource(R.drawable.prp);
                if(0<=Math.random()&Math.random()<0.4){
                    imgmob.setImageResource(R.drawable.fm);
                    scorm++;
                   aff_score(scorm,imgscore2);
                }
                else {
                    if (0.4 <= Math.random() & Math.random() < 0.65) {
                        imgmob.setImageResource(R.drawable.sim);
                        scorp++;
                        aff_score(scorp,imgscore1);
                    } else {
                        imgmob.setImageResource(R.drawable.prm);
                    }
                }



            }
        });

        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgplayer.setImageResource(R.drawable.fp);
                if(0<=Math.random()&Math.random()<0.4){
                    imgmob.setImageResource(R.drawable.fm);
                }
                else {
                    if (0.4 <= Math.random() & Math.random() < 0.65) {
                        imgmob.setImageResource(R.drawable.sim);
                        scorm++;
                        aff_score(scorm,imgscore2);
                    } else {
                        imgmob.setImageResource(R.drawable.prm);
                        scorp++;
                        aff_score(scorp,imgscore1);
                    }
                }

            }
        });
        bsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgplayer.setImageResource(R.drawable.sip);
                if(0<=Math.random()&Math.random()<0.4){
                    imgmob.setImageResource(R.drawable.fm);
                    scorp++;
                    aff_score(scorp,imgscore1);
                }
                else {
                    if (0.4 <= Math.random() & Math.random() < 0.65) {
                        imgmob.setImageResource(R.drawable.sim);
                    } else {
                        imgmob.setImageResource(R.drawable.prm);
                        scorm++;
                        aff_score(scorm,imgscore2);
                    }
                }

            }
        });
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorm=0;
                scorp=0;
                imgscore1.setImageResource(R.drawable.img0);
                imgscore2.setImageResource(R.drawable.img0);
                bpr.setEnabled(true);
                bf.setEnabled(true);
                bsi.setEnabled(true);
                imgplayer.setImageResource(R.drawable.nill);
                imgmob.setImageResource(R.drawable.nill);
                replay.setVisibility(View.INVISIBLE);
            }
        });

    }
}