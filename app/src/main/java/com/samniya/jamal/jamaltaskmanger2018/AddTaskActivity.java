package com.samniya.jamal.jamaltaskmanger2018;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class AddTaskActivity extends Activity {

    private EditText titleET,taskET,editText3;
    private SeekBar seekBar1,seekBar2;
    private TextView iTv,nTv;
    private Button saveBtn1,datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        titleET=findViewById(R.id.titleET);
        editText3=findViewById(R.id.editText3);
        taskET=findViewById(R.id.taskET);
        seekBar1=findViewById(R.id.seekBar1);
        seekBar2=findViewById(R.id.seekBar2);
        iTv=findViewById(R.id.iTv);
        nTv=findViewById(R.id.nTv);
        saveBtn1=findViewById(R.id.saveBtn1);
        datePicker=findViewById(R.id.datePicker);

        saveBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });










    }
}
