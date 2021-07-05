package com.example.myfirstapp;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bts;
    Button bt_sq1;
    Button bt_sq2;
    Button bt_sq3;
    Button bt_sq4;
    Button bt_sq5;
    Button bt_sq6;
    Button bt_sq7;
    Button bt_sq8;
    Button bt_sq9;
    Button bt_sq10;
    Button bt_sq11;
    Button bt_sq12;
    Button bt_sq13;
    Button bt_sq14;
    Button bt_sq15;
    Button bt_sq16;
    Button bt_sq17;
    Button bt_sq18;
    Button bt_sq19;
    Button bt_sq20;
    Button bt_sq21;
    Button bt_sq22;
    Button bt_sq23;
    Button bt_sq24;
    Button bt_sq25;
    Button bt_sq26;
    Button bt_sq27;
    Button bt_sq28;
    Button bt_sq29;
    Button bt_sq30;
    Button b_status;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp1 = MediaPlayer.create(this,R.raw.cow_sound);
        MediaPlayer mp2 = MediaPlayer.create(this,R.raw.duck_sound);
        MediaPlayer mp3 = MediaPlayer.create(this,R.raw.horse_sound);
        MediaPlayer mp4 = MediaPlayer.create(this,R.raw.lamb_sound);
        MediaPlayer mp5 = MediaPlayer.create(this,R.raw.pig_sound);
        MediaPlayer mp6 = MediaPlayer.create(this,R.raw.rooster_sound);

        // Buttons
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button4);
        bt3 = (Button) findViewById(R.id.button2);
        bt4 = (Button) findViewById(R.id.button);
        bt5 = (Button) findViewById(R.id.button7);
        bt6 = (Button) findViewById(R.id.button8);
        bts = (Button) findViewById(R.id.button_start);
        b_status = (Button) findViewById(R.id.status_button);

        // Scores
        final int[] score_1 = {0};
        final int[] score_2 = {0};
        final int[] score_3 = {0};
        final int[] score_4 = {0};
        final int[] score_5 = {0};

        // Array sequence
        int[] arr = new int[30];
        int[] contador = {0};
        final int[] first = new int[1];
        final boolean[] failed = {true};
        final boolean[] primera = {true};

        // Button Start
        bts.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setBackgroundColor(Color.parseColor("#6200EE"));
                bt2.setBackgroundColor(Color.parseColor("#6200EE"));
                bt3.setBackgroundColor(Color.parseColor("#6200EE"));
                bt4.setBackgroundColor(Color.parseColor("#6200EE"));
                bt5.setBackgroundColor(Color.parseColor("#6200EE"));
                bt6.setBackgroundColor(Color.parseColor("#6200EE"));
                b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                boolean finished = false;
                Random rand = new Random();
                int[] sequence = {0};
                boolean[] sequence_bool = {true};

                if(primera[0]){
                    score_1[0] = 0;
                    score_2[0] = 0;
                    score_3[0] = 0;
                    score_4[0] = 0;
                    score_5[0] = 0;
                    primera[0] = false;
                }

                if(failed[0]){
                    b_status.setText("PUNTAJE");
                    for (int j = 0; j < 30; ++j) {
                        int randomNum = rand.nextInt((6 - 1) + 1) + 1;
                        arr[j] = randomNum;
                    }
                    contador[0] = 0;
                }
                // First Button of sequence
                if(arr[0] == 1) {
                    bt_sq1 = bt1;
                }
                if(arr[0] == 2) {
                    bt_sq1 = bt2;
                }
                if(arr[0] == 3) {
                    bt_sq1 = bt3;
                }
                if(arr[0] == 4) {
                    bt_sq1 = bt4;
                }
                if(arr[0] == 5) {
                    bt_sq1 = bt5;
                }
                if(arr[0] == 6) {
                    bt_sq1 = bt6;
                }

                // Second Button of sequence
                if(arr[1] == 1) {
                    bt_sq2 = bt1;
                }
                if(arr[1] == 2) {
                    bt_sq2 = bt2;
                }
                if(arr[1] == 3) {
                    bt_sq2 = bt3;
                }
                if(arr[1] == 4) {
                    bt_sq2 = bt4;
                }
                if(arr[1] == 5) {
                    bt_sq2 = bt5;
                }
                if(arr[1] == 6) {
                    bt_sq2 = bt6;
                }

                // Third Button of sequence
                if(arr[2] == 1) {
                    bt_sq3 = bt1;
                }
                if(arr[2] == 2) {
                    bt_sq3 = bt2;
                }
                if(arr[2] == 3) {
                    bt_sq3 = bt3;
                }
                if(arr[2] == 4) {
                    bt_sq3 = bt4;
                }
                if(arr[2] == 5) {
                    bt_sq3 = bt5;
                }
                if(arr[2] == 6) {
                    bt_sq3 = bt6;
                }

                // Fourth Button of sequence
                if(arr[3] == 1) {
                    bt_sq4 = bt1;
                }
                if(arr[3] == 2) {
                    bt_sq4 = bt2;
                }
                if(arr[3] == 3) {
                    bt_sq4 = bt3;
                }
                if(arr[3] == 4) {
                    bt_sq4 = bt4;
                }
                if(arr[3] == 5) {
                    bt_sq4 = bt5;
                }
                if(arr[3] == 6) {
                    bt_sq4 = bt6;
                }

                // 5 Button of sequence
                if(arr[4] == 1) {
                    bt_sq5 = bt1;
                }
                if(arr[4] == 2) {
                    bt_sq5 = bt2;
                }
                if(arr[4] == 3) {
                    bt_sq5 = bt3;
                }
                if(arr[4] == 4) {
                    bt_sq5 = bt4;
                }
                if(arr[4] == 5) {
                    bt_sq5 = bt5;
                }
                if(arr[4] == 6) {
                    bt_sq5 = bt6;
                }

                // 6 Button of sequence
                if(arr[5] == 1) {
                    bt_sq6 = bt1;
                }
                if(arr[5] == 2) {
                    bt_sq6 = bt2;
                }
                if(arr[5] == 3) {
                    bt_sq6 = bt3;
                }
                if(arr[5] == 4) {
                    bt_sq6 = bt4;
                }
                if(arr[5] == 5) {
                    bt_sq6 = bt5;
                }
                if(arr[5] == 6) {
                    bt_sq6 = bt6;
                }

                // 7 Button of sequence
                if(arr[6] == 1) {
                    bt_sq7 = bt1;
                }
                if(arr[6] == 2) {
                    bt_sq7 = bt2;
                }
                if(arr[6] == 3) {
                    bt_sq7 = bt3;
                }
                if(arr[6] == 4) {
                    bt_sq7 = bt4;
                }
                if(arr[6] == 5) {
                    bt_sq7 = bt5;
                }
                if(arr[6] == 6) {
                    bt_sq7 = bt6;
                }

                // 8 Button of sequence
                if(arr[7] == 1) {
                    bt_sq8 = bt1;
                }
                if(arr[7] == 2) {
                    bt_sq8 = bt2;
                }
                if(arr[7] == 3) {
                    bt_sq8 = bt3;
                }
                if(arr[7] == 4) {
                    bt_sq8 = bt4;
                }
                if(arr[7] == 5) {
                    bt_sq8 = bt5;
                }
                if(arr[7] == 6) {
                    bt_sq8 = bt6;
                }


                // 9 Button of sequence
                if(arr[8] == 1) {
                    bt_sq9 = bt1;
                }
                if(arr[8] == 2) {
                    bt_sq9 = bt2;
                }
                if(arr[8] == 3) {
                    bt_sq9 = bt3;
                }
                if(arr[8] == 4) {
                    bt_sq9 = bt4;
                }
                if(arr[8] == 5) {
                    bt_sq9 = bt5;
                }
                if(arr[8] == 6) {
                    bt_sq9 = bt6;
                }

                // 10 Button of sequence
                if(arr[9] == 1) {
                    bt_sq10 = bt1;
                }
                if(arr[9] == 2) {
                    bt_sq10 = bt2;
                }
                if(arr[9] == 3) {
                    bt_sq10 = bt3;
                }
                if(arr[9] == 4) {
                    bt_sq10 = bt4;
                }
                if(arr[9] == 5) {
                    bt_sq10 = bt5;
                }
                if(arr[9] == 6) {
                    bt_sq10 = bt6;
                }

                // 11 Button of sequence
                if(arr[10] == 1) {
                    bt_sq11 = bt1;
                }
                if(arr[10] == 2) {
                    bt_sq11 = bt2;
                }
                if(arr[10] == 3) {
                    bt_sq11 = bt3;
                }
                if(arr[10] == 4) {
                    bt_sq11 = bt4;
                }
                if(arr[10] == 5) {
                    bt_sq11 = bt5;
                }
                if(arr[10] == 6) {
                    bt_sq11 = bt6;
                }

                // 12 Button of sequence
                if(arr[11] == 1) {
                    bt_sq12 = bt1;
                }
                if(arr[11] == 2) {
                    bt_sq12 = bt2;
                }
                if(arr[11] == 3) {
                    bt_sq12 = bt3;
                }
                if(arr[11] == 4) {
                    bt_sq12 = bt4;
                }
                if(arr[11] == 5) {
                    bt_sq12 = bt5;
                }
                if(arr[11] == 6) {
                    bt_sq12 = bt6;
                }

                // 13 Button of sequence
                if(arr[12] == 1) {
                    bt_sq13 = bt1;
                }
                if(arr[12] == 2) {
                    bt_sq13 = bt2;
                }
                if(arr[12] == 3) {
                    bt_sq13 = bt3;
                }
                if(arr[12] == 4) {
                    bt_sq13 = bt4;
                }
                if(arr[12] == 5) {
                    bt_sq13 = bt5;
                }
                if(arr[12] == 6) {
                    bt_sq13 = bt6;
                }
                // 14 Button of sequence
                if(arr[13] == 1) {
                    bt_sq14 = bt1;
                }
                if(arr[13] == 2) {
                    bt_sq14 = bt2;
                }
                if(arr[13] == 3) {
                    bt_sq14 = bt3;
                }
                if(arr[13] == 4) {
                    bt_sq14 = bt4;
                }
                if(arr[13] == 5) {
                    bt_sq14 = bt5;
                }
                if(arr[13] == 6) {
                    bt_sq14 = bt6;
                }

                // 15 Button of sequence
                if(arr[14] == 1) {
                    bt_sq15 = bt1;
                }
                if(arr[14] == 2) {
                    bt_sq15 = bt2;
                }
                if(arr[14] == 3) {
                    bt_sq15 = bt3;
                }
                if(arr[14] == 4) {
                    bt_sq15 = bt4;
                }
                if(arr[14] == 5) {
                    bt_sq15 = bt5;
                }
                if(arr[14] == 6) {
                    bt_sq15 = bt6;
                }

                // 16 Button of sequence
                if(arr[15] == 1) {
                    bt_sq16 = bt1;
                }
                if(arr[15] == 2) {
                    bt_sq16 = bt2;
                }
                if(arr[15] == 3) {
                    bt_sq16 = bt3;
                }
                if(arr[15] == 4) {
                    bt_sq16 = bt4;
                }
                if(arr[15] == 5) {
                    bt_sq16 = bt5;
                }
                if(arr[15] == 6) {
                    bt_sq16 = bt6;
                }

                // 17 Button of sequence
                if(arr[16] == 1) {
                    bt_sq17 = bt1;
                }
                if(arr[16] == 2) {
                    bt_sq17 = bt2;
                }
                if(arr[16] == 3) {
                    bt_sq17 = bt3;
                }
                if(arr[16] == 4) {
                    bt_sq17 = bt4;
                }
                if(arr[16] == 5) {
                    bt_sq17 = bt5;
                }
                if(arr[16] == 6) {
                    bt_sq17 = bt6;
                }
                // 18 Button of sequence
                if(arr[17] == 1) {
                    bt_sq18 = bt1;
                }
                if(arr[17] == 2) {
                    bt_sq18 = bt2;
                }
                if(arr[17] == 3) {
                    bt_sq18 = bt3;
                }
                if(arr[17] == 4) {
                    bt_sq18 = bt4;
                }
                if(arr[17] == 5) {
                    bt_sq18 = bt5;
                }
                if(arr[17] == 6) {
                    bt_sq18 = bt6;
                }
                // 19 Button of sequence
                if(arr[18] == 1) {
                    bt_sq19 = bt1;
                }
                if(arr[18] == 2) {
                    bt_sq19 = bt2;
                }
                if(arr[18] == 3) {
                    bt_sq19 = bt3;
                }
                if(arr[18] == 4) {
                    bt_sq19 = bt4;
                }
                if(arr[18] == 5) {
                    bt_sq19 = bt5;
                }
                if(arr[18] == 6) {
                    bt_sq19 = bt6;
                }

                // 20 Button of sequence
                if(arr[19] == 1) {
                    bt_sq20 = bt1;
                }
                if(arr[19] == 2) {
                    bt_sq20 = bt2;
                }
                if(arr[19] == 3) {
                    bt_sq20 = bt3;
                }
                if(arr[19] == 4) {
                    bt_sq20 = bt4;
                }
                if(arr[19] == 5) {
                    bt_sq20 = bt5;
                }
                if(arr[19] == 6) {
                    bt_sq20 = bt6;
                }

                // 21 Button of sequence
                if(arr[20] == 1) {
                    bt_sq21 = bt1;
                }
                if(arr[20] == 2) {
                    bt_sq21 = bt2;
                }
                if(arr[20] == 3) {
                    bt_sq21 = bt3;
                }
                if(arr[20] == 4) {
                    bt_sq21 = bt4;
                }
                if(arr[20] == 5) {
                    bt_sq21 = bt5;
                }
                if(arr[20] == 6) {
                    bt_sq21 = bt6;
                }

                // 22 Button of sequence
                if(arr[21] == 1) {
                    bt_sq22 = bt1;
                }
                if(arr[21] == 2) {
                    bt_sq22 = bt2;
                }
                if(arr[21] == 3) {
                    bt_sq22 = bt3;
                }
                if(arr[21] == 4) {
                    bt_sq22 = bt4;
                }
                if(arr[21] == 5) {
                    bt_sq22 = bt5;
                }
                if(arr[21] == 6) {
                    bt_sq22 = bt6;
                }
                // 23 Button of sequence
                if(arr[22] == 1) {
                    bt_sq23 = bt1;
                }
                if(arr[22] == 2) {
                    bt_sq23 = bt2;
                }
                if(arr[22] == 3) {
                    bt_sq23 = bt3;
                }
                if(arr[22] == 4) {
                    bt_sq23 = bt4;
                }
                if(arr[22] == 5) {
                    bt_sq23 = bt5;
                }
                if(arr[22] == 6) {
                    bt_sq23 = bt6;
                }
                // 24 Button of sequence
                if(arr[23] == 1) {
                    bt_sq24 = bt1;
                }
                if(arr[23] == 2) {
                    bt_sq24 = bt2;
                }
                if(arr[23] == 3) {
                    bt_sq24 = bt3;
                }
                if(arr[23] == 4) {
                    bt_sq24 = bt4;
                }
                if(arr[23] == 5) {
                    bt_sq24 = bt5;
                }
                if(arr[23] == 6) {
                    bt_sq24 = bt6;
                }

                // 25 Button of sequence
                if(arr[24] == 1) {
                    bt_sq25 = bt1;
                }
                if(arr[24] == 2) {
                    bt_sq25 = bt2;
                }
                if(arr[24] == 3) {
                    bt_sq25 = bt3;
                }
                if(arr[24] == 4) {
                    bt_sq25 = bt4;
                }
                if(arr[24] == 5) {
                    bt_sq25 = bt5;
                }
                if(arr[24] == 6) {
                    bt_sq25 = bt6;
                }

                // 26 Button of sequence
                if(arr[25] == 1) {
                    bt_sq26 = bt1;
                }
                if(arr[25] == 2) {
                    bt_sq26 = bt2;
                }
                if(arr[25] == 3) {
                    bt_sq26 = bt3;
                }
                if(arr[25] == 4) {
                    bt_sq26 = bt4;
                }
                if(arr[25] == 5) {
                    bt_sq26 = bt5;
                }
                if(arr[25] == 6) {
                    bt_sq26 = bt6;
                }

                // 27 Button of sequence
                if(arr[26] == 1) {
                    bt_sq27 = bt1;
                }
                if(arr[26] == 2) {
                    bt_sq27 = bt2;
                }
                if(arr[26] == 3) {
                    bt_sq27 = bt3;
                }
                if(arr[26] == 4) {
                    bt_sq27 = bt4;
                }
                if(arr[26] == 5) {
                    bt_sq27 = bt5;
                }
                if(arr[26] == 6) {
                    bt_sq27 = bt6;
                }

                // 28 Button of sequence
                if(arr[27] == 1) {
                    bt_sq28 = bt1;
                }
                if(arr[27] == 2) {
                    bt_sq28 = bt2;
                }
                if(arr[27] == 3) {
                    bt_sq28 = bt3;
                }
                if(arr[27] == 4) {
                    bt_sq28 = bt4;
                }
                if(arr[27] == 5) {
                    bt_sq28 = bt5;
                }
                if(arr[27] == 6) {
                    bt_sq28 = bt6;
                }
                // 29 Button of sequence
                if(arr[28] == 1) {
                    bt_sq29 = bt1;
                }
                if(arr[28] == 2) {
                    bt_sq29 = bt2;
                }
                if(arr[28] == 3) {
                    bt_sq29 = bt3;
                }
                if(arr[28] == 4) {
                    bt_sq29 = bt4;
                }
                if(arr[28] == 5) {
                    bt_sq29 = bt5;
                }
                if(arr[28] == 6) {
                    bt_sq29 = bt6;
                }

                // 30 Button of sequence
                if(arr[29] == 1) {
                    bt_sq30 = bt1;
                }
                if(arr[29] == 2) {
                    bt_sq30 = bt2;
                }
                if(arr[29] == 3) {
                    bt_sq30 = bt3;
                }
                if(arr[29] == 4) {
                    bt_sq30 = bt4;
                }
                if(arr[29] == 5) {
                    bt_sq30 = bt5;
                }
                if(arr[29] == 6) {
                    bt_sq30 = bt6;
                }

                int[] seq_loop = {0};
                // Showing sequence of buttons
                while (seq_loop[0] < contador[0] + 1) {

                    if(seq_loop[0] == 0) {
                        // Showing colors on buttons with 2 sec between each of the colors.
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq1.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq1.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 3000);
                        first[0] = 1;
                    }

                    if(seq_loop[0] == 1) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq2.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 4000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq2.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 6000);
                    }

                    if(seq_loop[0] == 2) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq3.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 7000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq3.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 9000);
                    }

                    if(seq_loop[0] == 3) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq4.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 10000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq4.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 12000);
                    }

                    if(seq_loop[0] == 4) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq5.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 13000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq5.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 15000);
                    }

                    if(seq_loop[0] == 5) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq6.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 16000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq6.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 18000);
                    }

                    if(seq_loop[0] == 6) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq7.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 19000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq7.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 21000);
                    }

                    if(seq_loop[0] == 7) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq8.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 22000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq8.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 24000);
                    }

                    if(seq_loop[0] == 8) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq9.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 25000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq9.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 27000);
                    }

                    if(seq_loop[0] == 9) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq10.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 28000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq10.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 30000);
                    }

                    if(seq_loop[0] == 10) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq11.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 31000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq11.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 33000);
                    }

                    if(seq_loop[0] == 11) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq12.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 34000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq12.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 36000);
                    }

                    if(seq_loop[0] == 12) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq13.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 37000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq13.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 39000);
                    }

                    if(seq_loop[0] == 13) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq14.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 40000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq14.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 42000);
                    }

                    if(seq_loop[0] == 14) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq15.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 43000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq15.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 45000);
                    }

                    if(seq_loop[0] == 15) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq16.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 46000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq16.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 48000);
                    }

                    if(seq_loop[0] == 16) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq17.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 49000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq17.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 51000);
                    }

                    if(seq_loop[0] == 17) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq18.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 52000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq18.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 54000);
                    }

                    if(seq_loop[0] == 18) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq19.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 55000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq19.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 57000);
                    }

                    if(seq_loop[0] == 19) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq20.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 58000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq20.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 60000);
                    }

                    if(seq_loop[0] == 20) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq21.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 61000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq21.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 63000);
                    }

                    if(seq_loop[0] == 21) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq22.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 64000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq22.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 66000);
                    }

                    if(seq_loop[0] == 22) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq23.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 67000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq23.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 69000);
                    }

                    if(seq_loop[0] == 23) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq24.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 70000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq24.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 72000);
                    }

                    if(seq_loop[0] == 24) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq25.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 73000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq25.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 75000);
                    }

                    if(seq_loop[0] == 25) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq26.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 76000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq26.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 78000);
                    }

                    if(seq_loop[0] == 26) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq27.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 79000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq27.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 81000);
                    }

                    if(seq_loop[0] == 27) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq28.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 82000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq28.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 84000);
                    }

                    if(seq_loop[0] == 28) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq29.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 85000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq29.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 87000);
                    }

                    if(seq_loop[0] == 29) {
                        // Change Button
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq30.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 88000);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt_sq30.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 90000);
                    }
                    ++seq_loop[0];
                    failed[0] = false;
                    sequence[0] = 0;
                    sequence_bool[0] = true;
                }


                // Sequence detector.

                // Button 1
                final boolean[] next = {false};
                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        if(sequence[0] > contador[0] + 1){
//                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
//                        }
                        if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                                if (contador[0] > score_1[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = score_1[0];
                                    score_1[0] = contador[0];
                                }

                                else if(contador[0] > score_2[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = contador[0];
                                }

                                else if(contador[0] > score_3[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = contador[0];
                                }

                                else if(contador[0] > score_4[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = contador[0];

                                }

                                else if(contador[0] > score_5[0]){
                                    score_5[0] = contador[0];
                                }

                            b_status.setText("Falló el intento. \nPuntos obtenidos: " + contador[0] + "\nPuntajes más altos: \n" +
                                    "1. " + score_1[0] + " puntos \n" +
                                    "2. " + score_2[0] + " puntos \n" +
                                    "3. " + score_3[0] + " puntos \n" +
                                    "4. " + score_4[0] + " puntos \n" +
                                    "5. " + score_5[0] + " puntos \n");
                            failed[0] = true;
                        }
                        else {
                            sequence_bool[0] = false;
                            for (int m = 0; m < 30; ++m) {
                                if(arr[m] == 1){
                                    if(sequence[0] == m){
                                        sequence_bool[0] = true;
                                        sequence[0] = sequence[0] + 1;
                                        if(sequence[0] == seq_loop[0]){
                                            b_status.setBackgroundColor(Color.parseColor("#008000"));
                                            contador[0] = contador[0] + 1;
                                            b_status.setText("Su puntaje es: " + contador[0]);
                                        }
                                    }
                                }
                            }
                        }
                        mp1.start();
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt1.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 0);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt1.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 900);

                    }
                });

                // Button 2
                final boolean[] next2 = {false};
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        if(sequence[0] > contador[0] + 1){
//                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
//                        }
                        if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                                if (contador[0] > score_1[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = score_1[0];
                                    score_1[0] = contador[0];
                                }

                                else if(contador[0] > score_2[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = contador[0];
                                }

                                else if(contador[0] > score_3[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = contador[0];
                                }

                                else if(contador[0] > score_4[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = contador[0];

                                }

                                else if(contador[0] > score_5[0]){
                                    score_5[0] = contador[0];
                                }

                            b_status.setText("Falló el intento. \nPuntos obtenidos: " + contador[0] + "\nPuntajes más altos: \n" +
                                    "1. " + score_1[0] + " puntos \n" +
                                    "2. " + score_2[0] + " puntos \n" +
                                    "3. " + score_3[0] + " puntos \n" +
                                    "4. " + score_4[0] + " puntos \n" +
                                    "5. " + score_5[0] + " puntos \n");
                            failed[0] = true;
                        }
                        else {
                            sequence_bool[0] = false;
                            for (int m = 0; m < 30; ++m) {
                                if(arr[m] == 2){
                                    if(sequence[0] == m){
                                        sequence_bool[0] = true;
                                        sequence[0] = sequence[0] + 1;
                                        if(sequence[0] == seq_loop[0]){
                                            b_status.setBackgroundColor(Color.parseColor("#008000"));
                                            contador[0] = contador[0] + 1;
                                            b_status.setText("Su puntaje es: " + contador[0]);
                                        }
                                    }
                                }
                            }
                        }
                        mp2.start();
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt2.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 0);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt2.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 900);

                    }
                });

                // Button 3
                final boolean[] next3 = {false};
                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        if(sequence[0] > contador[0] + 1){
//                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
//                        }
                        if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                                if (contador[0] > score_1[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = score_1[0];
                                    score_1[0] = contador[0];
                                }

                                else if(contador[0] > score_2[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = contador[0];
                                }

                                else if(contador[0] > score_3[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = contador[0];
                                }

                                else if(contador[0] > score_4[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = contador[0];

                                }

                                else if(contador[0] > score_5[0]){
                                    score_5[0] = contador[0];
                                }

                            b_status.setText("Falló el intento. \nPuntos obtenidos: " + contador[0] + "\nPuntajes más altos: \n" +
                                    "1. " + score_1[0] + " puntos \n" +
                                    "2. " + score_2[0] + " puntos \n" +
                                    "3. " + score_3[0] + " puntos \n" +
                                    "4. " + score_4[0] + " puntos \n" +
                                    "5. " + score_5[0] + " puntos \n");
                            failed[0] = true;
                        }
                        else {
                            sequence_bool[0] = false;
                            for (int m = 0; m < 30; ++m) {
                                if(arr[m] == 3){
                                    if(sequence[0] == m){
                                        sequence_bool[0] = true;
                                        sequence[0] = sequence[0] + 1;
                                        if(sequence[0] == seq_loop[0]){
                                            b_status.setBackgroundColor(Color.parseColor("#008000"));
                                            contador[0] = contador[0] + 1;
                                            b_status.setText("Su puntaje es: " + contador[0]);
                                        }
                                    }
                                }
                            }
                        }
                        mp3.start();
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt3.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 0);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt3.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 900);

                    }
                });
                // Button 4
                final boolean[] next4 = {false};
                bt4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        if(sequence[0] > contador[0] + 1){
//                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
//                        }
                        if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                                if (contador[0] > score_1[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = score_1[0];
                                    score_1[0] = contador[0];
                                }

                                else if(contador[0] > score_2[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = contador[0];
                                }

                                else if(contador[0] > score_3[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = contador[0];
                                }

                                else if(contador[0] > score_4[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = contador[0];

                                }

                                else if(contador[0] > score_5[0]){
                                    score_5[0] = contador[0];
                                }

                            b_status.setText("Falló el intento. \nPuntos obtenidos: " + contador[0] + "\nPuntajes más altos: \n" +
                                    "1. " + score_1[0] + " puntos \n" +
                                    "2. " + score_2[0] + " puntos \n" +
                                    "3. " + score_3[0] + " puntos \n" +
                                    "4. " + score_4[0] + " puntos \n" +
                                    "5. " + score_5[0] + " puntos \n");
                            failed[0] = true;
                        }
                        else {
                            sequence_bool[0] = false;
                            for (int m = 0; m < 30; ++m) {
                                if(arr[m] == 4){
                                    if(sequence[0] == m){
                                        sequence_bool[0] = true;
                                        sequence[0] = sequence[0] + 1;
                                        if(sequence[0] == seq_loop[0]){
                                            b_status.setBackgroundColor(Color.parseColor("#008000"));
                                            contador[0] = contador[0] + 1;
                                            b_status.setText("Su puntaje es: " + contador[0]);
                                        }
                                    }
                                }
                            }
                        }
                        mp4.start();
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt4.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 0);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt4.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 900);

                    }
                });

                // Button 5
                final boolean[] next5 = {false};
                bt5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        if(sequence[0] > contador[0] + 1){
//                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
//                        }
                        if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                                if (contador[0] > score_1[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = score_1[0];
                                    score_1[0] = contador[0];
                                }

                                else if(contador[0] > score_2[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = contador[0];
                                }

                                else if(contador[0] > score_3[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = contador[0];
                                }

                                else if(contador[0] > score_4[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = contador[0];

                                }

                                else if(contador[0] > score_5[0]){
                                    score_5[0] = contador[0];
                                }

                            b_status.setText("Falló el intento. \nPuntos obtenidos: " + contador[0] + "\nPuntajes más altos: \n" +
                                    "1. " + score_1[0] + " puntos \n" +
                                    "2. " + score_2[0] + " puntos \n" +
                                    "3. " + score_3[0] + " puntos \n" +
                                    "4. " + score_4[0] + " puntos \n" +
                                    "5. " + score_5[0] + " puntos \n");
                            failed[0] = true;
                        }
                        else {
                            sequence_bool[0] = false;
                            for (int m = 0; m < 30; ++m) {
                                if(arr[m] == 5){
                                    if(sequence[0] == m){
                                        sequence_bool[0] = true;
                                        sequence[0] = sequence[0] + 1;
                                        if(sequence[0] == seq_loop[0]){
                                            b_status.setBackgroundColor(Color.parseColor("#008000"));
                                            contador[0] = contador[0] + 1;
                                            b_status.setText("Su puntaje es: " + contador[0]);
                                        }
                                    }
                                }
                            }
                        }
                        mp5.start();
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt5.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 0);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt5.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 900);

                    }
                });
                // Button 6
                final boolean[] next6 = {false};
                bt6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        if(sequence[0] > contador[0] + 1){
//                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
//                        }
                        if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                                if (contador[0] > score_1[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = score_1[0];
                                    score_1[0] = contador[0];
                                }

                                else if(contador[0] > score_2[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = score_2[0];
                                    score_2[0] = contador[0];
                                }

                                else if(contador[0] > score_3[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = score_3[0];
                                    score_3[0] = contador[0];
                                }

                                else if(contador[0] > score_4[0]){
                                    score_5[0] = score_4[0];
                                    score_4[0] = contador[0];

                                }

                                else if(contador[0] > score_5[0]){
                                    score_5[0] = contador[0];
                                }

                            b_status.setText("Falló el intento. \nPuntos obtenidos: " + contador[0] + "\nPuntajes más altos: \n" +
                                    "1. " + score_1[0] + " puntos \n" +
                                    "2. " + score_2[0] + " puntos \n" +
                                    "3. " + score_3[0] + " puntos \n" +
                                    "4. " + score_4[0] + " puntos \n" +
                                    "5. " + score_5[0] + " puntos \n");
                            failed[0] = true;
                        }
                        else {
                            sequence_bool[0] = false;
                            for (int m = 0; m < 30; ++m) {
                                if(arr[m] == 6){
                                    if(sequence[0] == m){
                                        sequence_bool[0] = true;
                                        sequence[0] = sequence[0] + 1;
                                        if(sequence[0] == seq_loop[0]){
                                            b_status.setBackgroundColor(Color.parseColor("#008000"));
                                            contador[0] = contador[0] + 1;
                                            b_status.setText("Su puntaje es: " + contador[0]);
                                        }
                                    }
                                }
                            }
                        }
                        mp6.start();
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt6.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            }
                        }, 0);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                bt6.setBackgroundColor(Color.parseColor("#6200EE"));
                            }
                        }, 900);
                    }
                });
            }
        });
    }}