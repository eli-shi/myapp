package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawable = getResources().getDrawable(R.drawable.banner);

        Button search = (Button) findViewById(R.id.button);
        EditText inputName = (EditText) findViewById(R.id.nameInput);
        EditText inputSurname = (EditText) findViewById(R.id.surnameInput);
        TextView outputSchedule = (TextView) findViewById(R.id.schedule);

        ArrayList<Student> studentsList = new ArrayList<Student>();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/student");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot item_snapshot : dataSnapshot.getChildren()) {
                    Student student = item_snapshot.getValue(Student.class);
                    studentsList.add(student);
                    Log.i("students", student.name);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        search.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onClick(View view) {
                Log.v("Name", inputName.getText().toString());
                Log.v("Surname", inputSurname.getText().toString());
                if (inputSurname.getText().toString().isEmpty() || inputName.getText().toString().isEmpty()) {
                    Toast.makeText(view.getContext(), "please input all the required information", Toast.LENGTH_SHORT).show();
                    return;
                }
                boolean studentFound = false;
                for (int index = 0; index < studentsList.size(); index++) {
                    if (studentsList.get(index).name.equals(inputName.getText().toString()) && studentsList.get(index).surname.equals(inputSurname.getText().toString())) {
                        Student student = studentsList.get(index);
                        outputSchedule.setText(getFormattedSchedule(student.getSchedule(), 0, 0));
                        studentFound = true;
                    }
                }
                if (studentFound == false) {
                    Toast.makeText(view.getContext(), "This student does not exist", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


    private String beauty = new String();


    @RequiresApi(api = Build.VERSION_CODES.N)
    private String getFormattedSchedule(List<List<String>> schedule, int rowIndex, int collumIndex) {

        for (rowIndex = 0; rowIndex < 5; rowIndex++) {
            beauty = beauty + weekdays[rowIndex] + " - ";
            for (collumIndex = 0; collumIndex < 5; collumIndex++) {
                if (collumIndex != 4) {
                    beauty = beauty + schedule.get(rowIndex).get(collumIndex) + ", ";
                } else {
                    beauty = beauty + schedule.get(rowIndex).get(collumIndex) + "\n";
                }
            }
        }
        return beauty;
    }
}