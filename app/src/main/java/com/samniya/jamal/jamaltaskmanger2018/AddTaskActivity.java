package com.samniya.jamal.jamaltaskmanger2018;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.samniya.jamal.jamaltaskmanger2018.taskFragments.MyTasksFragmentFragment;

public class AddTaskActivity extends Activity {

    private EditText titleET, taskET, editText3;
    private SeekBar seekBar1, seekBar2;
    private TextView iTv, nTv;
    private Button saveBtn1, datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        titleET = findViewById(R.id.titleET);
        editText3 = findViewById(R.id.editText3);
        taskET = findViewById(R.id.taskET);
        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);
        iTv = findViewById(R.id.iTv);
        nTv = findViewById(R.id.nTv);
        saveBtn1 = findViewById(R.id.saveBtn1);
        datePicker = findViewById(R.id.datePicker);

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


        private void dataHandler () {
            boolean isOk = true;//if all the fields filled well
            String Title = titleET.getText().toString();
            String Task = taskET.getText().toString();
            String DueDate = editText3.getText().toString();
            int Necessary = seekBar1.getProgress();
            int important= seekBar2.getProgress();

            if (Title.length() < 4)
            {
                titleET.setError("Title have to be at least 4 letters");
                isOk=false;

            }
            if (Task.length()==0)
            {
                taskET.setError("Text can not be empty");
                isOk=false;


            }
            if (DueDate.length()<4)
            {
                editText3.setError("have to be at least 4 chars");

            }
            

                if (isOk)
                {
                    MyTask1 task1=new MyTask1();
                    task1.setCreatedAT(new Date());
                    task1.setDueDate(new Date(duedate1));
                    task1.setText(text1);
                    task1.setTitle(title1);
                    task1.setImportant(important1);
                    task1.setNecessary(necessary);


                    FirebaseAuth auth= FirebaseAuth.getInstance();
                    task1.setOwner(auth.getCurrentUser().getEmail());

                    DatabaseReference reference= FirebaseDatabase.getInstance().getReference();


                    String key=reference.child("MyTasks").push().getKey();
                    task1.setKey(key);

                    reference.child("MyTasks").child(key).setValue(task1).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(AddTAskActivity.this, "Add Successful", Toast.LENGTH_LONG).show();
                            }
                            else
                            {
                                Toast.makeText(AddTAskActivity.this,"add Failed",Toast.LENGTH_LONG).show();
                            }


                        }
                    });

                }


        }



}

       
