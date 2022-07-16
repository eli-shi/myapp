package com.example.myapplication;

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

        String students = Utils.getJsonFromAssets(this, "students.json");
        Gson gson = new Gson();
        Type listStudentType = new TypeToken<List<Student>>() {}.getType();
        List<Student> studentsList = gson.fromJson(students, listStudentType);



        search.setOnClickListener(
                        new View.OnClickListener() {
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
            private String beauty = weekdays[0] + " - ";

            private String getFormattedSchedule(String[][] schedule, int rowIndex, int collumIndex) {

                if (rowIndex > 4) return beauty;

                beauty += schedule[rowIndex][collumIndex];

                if (collumIndex == 4) {
                    rowIndex++;
                    collumIndex = 0;

                    if (rowIndex < 5) beauty += "\n" + weekdays[rowIndex] + " - ";
                } else {
                    collumIndex++;
                    beauty += ", ";
                }

                getFormattedSchedule(schedule, rowIndex, collumIndex);

                return beauty;
            }
    }