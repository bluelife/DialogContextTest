package com.bluelife.test.dialogcontexttest;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int DIALOG_ALERT = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialog(DIALOG_ALERT);
                /*AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this.getApplicationContext());
                alert.setMessage("Simple");
                alert.setTitle("AlertDialog");
                alert.setPositiveButton("OK", null);
                alert.show();*/
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Dialog dialog=null;
        Context appContext = this.getApplicationContext();
        switch (id) {
            case DIALOG_ALERT:
                dialog = new Dialog(appContext);
                dialog.setTitle("dialog test");


        }
        return dialog;
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
    }
}
