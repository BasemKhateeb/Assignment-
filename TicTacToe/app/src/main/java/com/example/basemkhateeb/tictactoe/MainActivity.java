package com.example.basemkhateeb.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.*;
import static android.R.color.*;


public class MainActivity extends ActionBarActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String alertTitle;

    int counter, flag, buttonColor, xscore, oscore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        flag = 0;
        xscore = 0;
        oscore = 0;


        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater(); //read XML
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_restart) {
            restart();

        }
        if (item.getItemId() == R.id.action_Exit) {
            Exit();
        }
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                if (b1.getText().equals("")) {
                    if (counter % 2 == 0)
                        b1.setText("X");
                    else b1.setText("O");
                    counter++;
                }
                break;
            case R.id.b2:
                if (b2.getText().equals("")) {
                    if (counter % 2 == 0)
                        b2.setText("X");
                    else b2.setText("O");
                    counter++;
                }
                break;
            case R.id.b3:
                if (b3.getText().equals("")) {
                    if (counter % 2 == 0)
                        b3.setText("X");
                    else b3.setText("O");
                    counter++;
                }
                break;
            case R.id.b4:
                if (b4.getText().equals("")) {
                    if (counter % 2 == 0)
                        b4.setText("X");
                    else b4.setText("O");
                    counter++;
                }
                break;
            case R.id.b5:
                if (b5.getText().equals("")) {
                    if (counter % 2 == 0)
                        b5.setText("X");
                    else b5.setText("O");
                    counter++;
                }
                break;
            case R.id.b6:
                if (b6.getText().equals("")) {
                    if (counter % 2 == 0)
                        b6.setText("X");
                    else b6.setText("O");
                    counter++;
                }
                break;
            case R.id.b7:
                if (b7.getText().equals("")) {
                    if (counter % 2 == 0)
                        b7.setText("X");
                    else b7.setText("O");
                    counter++;
                }
                break;
            case R.id.b8:
                if (b8.getText().equals("")) {
                    if (counter % 2 == 0)
                        b8.setText("X");
                    else b8.setText("O");
                    counter++;
                }
                break;
            case R.id.b9:
                if (b9.getText().equals("")) {
                    if (counter % 2 == 0)
                        b9.setText("X");
                    else b9.setText("O");
                    counter++;
                }
                break;


        }
        if (isWinner()) {

            if (flag == 1) {
                xscore++;
                alertTitle="Player 1 Has Won";
            }
            else {
                oscore++;
                alertTitle="Player 2 Has Won";
            }
            showAlert();


            b1.setClickable(false);
            b2.setClickable(false);
            b3.setClickable(false);
            b4.setClickable(false);
            b5.setClickable(false);
            b6.setClickable(false);
            b7.setClickable(false);
            b8.setClickable(false);
            b9.setClickable(false);


        }
        if(!(isWinner())&&isDraw()){
            showAlert();
        }

    }






    public boolean isWinner() {
        if (!(b1.getText().equals(""))) {
            if (b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText())) {
                if(b1.getText().equals("X")){
                    flag=1;
                }
               b1.setBackgroundColor(background_dark);
                b2.setBackgroundColor(background_dark);
                b3.setBackgroundColor(background_dark);
                return true;
            }
            else if (b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText())) {
                if(b1.getText().equals("X")){
                    flag=1;
                }
                b1.setBackgroundColor(background_dark);
                b4.setBackgroundColor(background_dark);
                b7.setBackgroundColor(background_dark);

                return true;
            }
            else if (b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText())) {
                if(b1.getText().equals("X")){
                    flag=1;
                }
                b1.setBackgroundColor(background_dark);
                b5.setBackgroundColor(background_dark);
                b9.setBackgroundColor(background_dark);
                return true;
            }
        }
        if (!(b2.getText().equals(""))) {
            if (b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText())) {
                if(b2.getText().equals("X")){
                    flag=1;
                }
                b2.setBackgroundColor(background_dark);
                b5.setBackgroundColor(background_dark);
                b8.setBackgroundColor(background_dark);
                return true;
            }

        }
        if (!(b4.getText().equals(""))){
            if (b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText())){
                if(b4.getText().equals("X")){
                    flag=1;
                }
                b4.setBackgroundColor(background_dark);
                b5.setBackgroundColor(background_dark);
                b6.setBackgroundColor(background_dark);
                return true;
            }
        }
        if (!(b3.getText().equals(""))) {
            if (b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText())) {
                if(b3.getText().equals("X")){
                    flag=1;
                }
                b3.setBackgroundColor(background_dark);
                b6.setBackgroundColor(background_dark);
                b9.setBackgroundColor(background_dark);
                return true;
            }
            else if(b3.getText().equals(b5.getText())&&b3.getText().equals(b7.getText())) {
                if(b3.getText().equals("X")){
                    flag=1;
                }
                b3.setBackgroundColor(background_dark);
                b5.setBackgroundColor(background_dark);
                b7.setBackgroundColor(background_dark);
                return true;
            }

        }
        if (!(b7.getText().equals(""))) {
            if (b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText())) {
                if (b7.getText().equals("X")) {
                    flag = 1;
                }
                b7.setBackgroundColor(background_dark);
                b8.setBackgroundColor(background_dark);
                b9.setBackgroundColor(background_dark);
                return true;
            }
        }
        return false;
    }
    public  void restart(){
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        counter=0;
        flag=0;
        b1.setClickable(true);
        b2.setClickable(true);
        b3.setClickable(true);
        b4.setClickable(true);
        b5.setClickable(true);
        b6.setClickable(true);
        b7.setClickable(true);
        b8.setClickable(true);
        b9.setClickable(true);
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");



    }
    public void Exit(){
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
    public void showAlert(){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        if(!(isWinner())&&isDraw()){
            alertTitle="It Is A Draw";
        }

        builder1.setTitle(alertTitle);
        builder1.setMessage("Player 1 score is :" + xscore + "\n" + "Player 2 Score is :" + oscore);
        builder1.setCancelable(true);
        builder1.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        restart();
                    }
                });
        AlertDialog alert1=builder1.create();
        alert1.show();
    }
    public boolean isDraw(){
        if (!(b1.getText().equals("")))
            if (!(b2.getText().equals("")))
                if (!(b3.getText().equals("")))
                    if (!(b4.getText().equals("")))
                        if (!(b5.getText().equals("")))
                            if (!(b6.getText().equals("")))
                                if (!(b7.getText().equals("")))
                                    if (!(b8.getText().equals("")))
                                        if (!(b9.getText().equals("")))

                                            return true;
        return  false;
    }


}
