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

                Student jasonWelch = new Student("Jason", "Welch", new String[][]{
                        {"Armenian A", "Comp.Sci.", "Physics", "Math", "History"},
                        {"Comp.Sci", "Physics", "History", "English B", "Free Period"},
                        {"Armenian A", "Free Period", "Comp.Sci.", "Free Period", "Free Period"},
                        {"Free Period", "Math", "English B", "Theory of Knowledge", "Free Period"},
                        {"Math", "P.E.", "Assembly Agenda", "History", "English B", "Free Period"}
                });
                Student victorHill = new Student("Victor", "Hill", new String[][]{
                        {"Physics", "Comp.Sci.", "Free Period", "History N", "History"},
                        {"Comp.Sci", "Spanish", "History", "P.E.", "Free Period"},
                        {"Free Period", "Spanish", "Comp.Sci", "Math", "Physics"},
                        {"Physics", "Free Period", "Math", "Theory of Knowledge", "English A"},
                        {"Math", "Free Period", "Assembly Agenda", "History", "English A"}
                });
                Student isaacYoung = new Student("Isaac", "Young", new String[][]{
                        {"Spanish", "Economics", "Physics", "History N", "History"},
                        {"Theory of Knowledge", "Physics", "History", "P.E.", "Free Period"},
                        {"Spanish", "Free Period", "Math", "English A", "Economics"},
                        {"Math", "Free Period", "Free Period", "Economics", "English B"},
                        {"Free Period", "Free Period", "Assembly Agenda", "History", "English A"}
                });
                Student lilyAbraham = new Student("Lily", "Abraham", new String[][]{
                        {"Comp.Sci.", "Russian B", "Economics", "History N", "Free Period"},
                        {"Theory of Knowledge", "English B", "Economics", "Math", "Free Period"},
                        {"Comp.Sci.", "Free Period", "Geography", "English B", "Economics"},
                        {"Geography", "Russian B", "Math", "Free Period", "English B"},
                        {"Free Period", "P.E.", "Assembly Agenda", "Geography", "Free Period"}
                });
                Student stephenWelch = new Student("Stephen", "Welch", new String[][]{
                        {"Spanish", "Economics", "Physics", "History N", "Free Period"},
                        {"Theory of Knowledge", "Physics", "Free Period", "Math", "Free Period"},
                        {"Spanish", "Free Period", "Geography", "English A", "Economics"},
                        {"Geography", "Free Period", "Math", "Economics", "English A"},
                        {"Free Period", "P.E.", "Assembly Agenda", "Geography", "English A"}
                });
                Student theresaMetcalfe = new Student("Theresa", "Metcalfe", new String[][]{
                        {"Free Period", "Biology", "Economics", "History N", "Free Period"},
                        {"Theory of Knowledge", "Spanish", "Economics", "Math", "Biology"},
                        {"Biology", "Spanish", "Geography", "English A", "Economics"},
                        {"Geography", "Free Period", "Math", "Free Period", "English A"},
                        {"Free Period", "P.E.", "Assembly Agenda", "Geography", "English A"}
                });
                Student virginiaClarkson = new Student("Virginia", "Clarkson", new String[][]{
                        {"Comp.Sci.", "Economics", "Physics", "English B", "History N"},
                        {"Theory of Knowledge", "Physics", "Armenian A", "Math", "Armenian A"},
                        {"Comp.Sci.", "Free Period", "Free Period", "Armenia A", "Economics"},
                        {"Free Period", "Free Period", "Math", "Armenian A", "English B"},
                        {"Free Period", "P.E.", "Assembly Agenda", "Free Period", "English B"}
                });
                Student samanthaBlack = new Student("Samantha", "Black", new String[][]{
                        {"Comp.Sci.", "Economics", "Physics", "English B", "History N"},
                        {"Theory of Knowledge", "Free Period", "History", "P.E.", "Free Period"},
                        {"Comp.Sci.", "Armenian A", "Math", "History N", "Economics"},
                        {"Math", "Armenian A", "Free Period", "Economics", "English B"},
                        {"English B", "Free Period", "Assembly Agenda", "History", "Free Period"}
                });
                Student jacobQuinn = new Student("Jacob", "Quinn", new String[][]{
                        {"Spanish", "Free Period", "Biology", "Economics", "Free Period"},
                        {"Biology", "Free Period", "Armenian A", "English B", "Armenian A"},
                        {"Spanish", "Theory of Knowledge", "Math", "Armenian A", "Free Period"},
                        {"Math", "Economics", "English B", "Armenian A", "Free Period"},
                        {"Economics", "P.E.", "Assembly Agenda", "History N", "English B"}
                });
                Student chloePowell = new Student("Cloe", "Powell", new String[][]{
                        {"Armenian A", "Comp.Sci.", "Free Period", "Economics", "History"},
                        {"Comp.Sci", "English B", "History", "P.E.", "Free Period"},
                        {"Armenian A", "Theory of Knowledge", "Math", "English B", "History N"},
                        {"Math", "Economics", "Free Period", "Free Period", "English B"},
                        {"Economics", "Free Period", "Assembly Agenda", "History", "Free Period"}
                });
                Student owenRoss = new Student("Owen", "Ross", new String[][]{
                        {"Spanish", "Free Period", "Biology", "Economics", "History N"},
                        {"Biology", "Free Period", "Armenian A", "English B", "Armenian A"},
                        {"Spanish", "Theory of Knowledge", "Math", "Armenian A", "Free Period"},
                        {"Math", "Economics", "English B", "Armenian A", "Free Period"},
                        {"Economics", "P.E.", "Assembly Agenda", "Free Period", "English B"},
                });
                Student samButler = new Student("Sam", "Butler", new String[][]{
                        {"Comp.Sci.", "Economics", "Physics", "Math", "History N"},
                        {"Theory of Knowledge", "Physics", "Armenian A", "English B", "Free Period"},
                        {"Comp.Sci.", "Free Period", "Free Period", "Armenian A", "Economics"},
                        {"Free Period", "Math", "English B", "Economics", "Free Period"},
                        {"Math", "P.E.", "Assembly Agenda", "Free Period", "English B"},
                });
                Student michaelMcLean = new Student("Michael", "McLean", new String[][]{
                        {"Armenian A", "Comp.Sci", "Free Period", "Economics", "History"},
                        {"Comp.Sci", "English B", "History", "P.E.", "Free Period"},
                        {"Armenian A", "Theory of Knowledge", "Math", "English B", "History N"},
                        {"Math", "Economics", "Free Period", "Free Period", "English B"},
                        {"Economics", "Free Period", "Assembly Agenda", "History", "Free Period"}
                });
                Student emmaCameron = new Student("Emma", "Cameron", new String[][]{
                        {"Armenian N", "Comp.Sci.", "Free Period", "Economics", "History"},
                        {"Comp.Sci.", "Spanish", "History", "Math", "Free Period"},
                        {"Free Period", "Spanish", "Comp.Sci.", "History N", "Free Period"},
                        {"Free Period", "Economics", "Math", "Theory of Knowledge", "English A"},
                        {"Economics", "P.E.", "Assembly Agenda", "History", "English A"}
                });
                Student sallyMacLeod = new Student("Sally", "McLeod", new String[][]{
                        {"Free Period", "Economics", "Physics", "English B", "History N"},
                        {"Theory of Knowledge", "Physics", "Free Period", "Math", "Free Period"},
                        {"Free Period", "Armenian A", "Geography", "Free Period", "Economics"},
                        {"Geography", "Armenian A", "Math", "Economics", "English B"},
                        {"English B", "P.E.", "Assembly Agenda", "Geography", "Free Period"},
                });
                Student avaYoung = new Student("Ava", "Young", new String[][]{
                        {"Armenian A", "Comp.Sci.", "Free Period", "English B", "History N"},
                        {"Comp.Sci.", "Spanish", "Economics", "P.E.", "Free Period"},
                        {"Armenian A", "Spanish", "Free Period", "Math", "Economics"},
                        {"Free Period", "Free Period", "Math", "Theory of Knowledge", "English A"},
                        {"English B", "Free Period", "Assembly Agenda", "Math", "Free Period"}
                });
                Student jasmineBuckland = new Student("Jasmine", "Buckland", new String[][]{
                        {"Spanish", "Free Period", "Physics", "English B", "History N"},
                        {"Theory of Knowledge", "Physics", "Armenian A", "Math", "Armenian A"},
                        {"Spanish", "Free Period", "Geography", "Armenian A", "Free Period"},
                        {"Geography", "Free Period", "Math", "Armenian A", "English B"},
                        {"English B", "P.E.", "Assembly Agenda", "Geography", "Free Period"}
                });
                Student mattSmith = new Student("Matt", "Smith", new String[][]{
                        {"Armenian A", "Comp.Sci", "Free Period", "Economics", "History"},
                        {"Comp.Sci.", "English B", "History ", "P.E.", "Free Period"},
                        {"Armenian A", "Theory of Knowledge", "Math", "English B", "History N"},
                        {"Math", "Economics", "Free Period", "Free Period", "English B"},
                        {"Economics", "Free Period", "Assembly Agenda", "History", "Free Period"}
                });
                Student connorKnox = new Student("Connor", "Knox", new String[][]{
                        {"Spanish", "Economics", "Physics", "English B", "History N"},
                        {"Theory of Knowledge", "Physics", "Free Period", "P.E.", "Free Period"},
                        {"Spanish", "Armenian A", "Free Period", "Math", "Economics"},
                        {"Free Period", "Armenian A", "Math", "Economics", "English B"},
                        {"Math", "Free Period", "Assembly Agenda", "Math", "Free Period"}
                });
                Student natalieBailey = new Student("Natalie", "Bailey", new String[][]{
                        {"Spanish", "Free Period", "Biology", "Economics", "History N"},
                        {"Biology", "Free Period", "Armenian A", "English B", "Armenian A"},
                        {"Spanish", "Theory of Knowledge", "Math", "Armenian A", "Free Period"},
                        {"Math", "Economics", "English B", "Armenian A", "Free Period"},
                        {"Economics", "P.E.", "Assembly Agenda", "Free Period", "English B"}
                });
                Student kevinArnold = new Student("Kevin", "Arnold", new String[][]{
                        {"History N", "Economics", "Biology", "Free Period", "History"},
                        {"Biology", "English B", "History", "P.E.", "Free Period"},
                        {"Theory of Knowledge", "Armenian A", "Math", "English B", "Economics"},
                        {"Math", "Armenian A", "Free Period", "Economics", "English B"},
                        {"Free Period", "Free Period", "Assembly Agenda", "History", "Free Period"}
                });
                Student adamSanderson = new Student("Adam", "Sanderson", new String[][]{
                        {"Comp.Sci.", "Economics", "Physics", "Math", "History N"},
                        {"Comp.sci.", "Physics", "Armenian A", "English B", "Free Period"},
                        {"Free Period", "Theory of Knowledge", "Comp.Sci.", "Armenian A", "Economics"},
                        {"Free Period", "Math", "English B", "Economics", "Free Period"},
                        {"Math", "P.E.", "Assembly Agenda", "Free Period", "English B"}
                });
                Student brianWright = new Student("Brian", "Wright", new String[][]{
                        {"Armenian A", "Free Period", "Biology", "Economics", "History N"},
                        {"Biology", "Free Period", "Geography", "English B", "Armenian A"},
                        {"Armenian A", "Theory of Knowledge", "Math", "Free Period", "Geography"},
                        {"Math", "Economics", "English B", "Armenian A", "Free Period"},
                        {"Economics", "P.E.", "Assembly Agenda", "Free Period", "English B"}
                });
                Student donnaHunter = new Student("Donna", "Hunter", new String[][]{
                        {"Chemistry", "Biology", "Economics", "English B", "History N"},
                        {"Chemistry", "Free Period", "Economics", "Math", "Biology"},
                        {"Biology", "Armenian A", "Free Period", "Free Period", "Economics"},
                        {"Chemistry", "Armenian A", "Math", "Theory of Knowledge", "English B"},
                        {"English B", "P.E.", "Assembly Agenda", "Free Period", "Free Period"}
                });
                Student cameronTucker = new Student("Cameron", "Tucker", new String[][]{
                        {"Free Period", "Comp.Sci.", "Physics", "English B", "History N"},
                        {"Comp.Sci", "Physics", "Geography", "P.E.", "Free Period"},
                        {"Free Period", "Armenian A", "Comp.Sci", "Math", "Geography"},
                        {"Free Period", "Armenian A", "Math", "Theory of Knowledge", "English B"},
                        {"English B", "Free Period", "Assembly Agenda", "Math", "Free Period"}
                });
                Student alexandraNolan = new Student("Alexandra", "Nolan", new String[][]{
                        {"Armenian A", "Comp.Sci.", "Free Period", "Economics", "History N"},
                        {"Comp.Sci.", "English B", "Geography", "P.E.", "Free Period"},
                        {"Armenian A", "Theory of Knowledge", "Free Period", "Math", "Geography"},
                        {"Free Period", "Economics", "Math", "Free Period", "English B"},
                        {"Economics", "Free Period", "Assembly Agenda", "Math", "English B"}
                });
                Student kimberlyTaylor = new Student("Kimberly", "Taylor", new String[][]{
                        {"Chemistry", "Biology", "Free Period", "English B", "History"},
                        {"Chemistry", "Free Period", "History", "Math", "Biology"},
                        {"Biology", "Armenian A", "Free Period", "Free Period", "History N"},
                        {"Chemistry", "Armenian A", "Math", "Theory of Knowledge", "English B"},
                        {"English B", "P.E.", "Assembly Agenda", "Geography", "Free Period"}
                });
                Student lukeKnox = new Student("Luke", "Knox", new String[][]{
                        {"Comp.Sci.", "Economics", "Free Period", "English B", "History N"},
                        {"Theory of Knowledge", "Free Period", "Armenian A", "Math", "Free Period"},
                        {"Comp.Sci.", "Free Period", "Geography", "Armenian A", "Economics"},
                        {"Geography", "Free Period", "Math", "Economics", "English B"},
                        {"English B", "P.E.", "Assembly Agenda", "Geography", "Free Period"}
                });
                Student robertKnox = new Student("Robert", "Knox", new String[][]{
                        {"Chemistry", "Biology", "Free Period", "English B", "History N"},
                        {"Chemistry", "Free Period", "Geography", "Free Period", "Biology"},
                        {"Biology", "Armenian A", "Free Period", "Math", "Geography"},
                        {"Chemistry", "Armenian A", "Math", "Theory of Knowledge", "English B"},
                        {"English B", "P.E.", "Assembly Agenda", "Math", "Free Period"}
                });
                Student madeleineTaylor = new Student("Madeleine", "Taylor", new String[][]{
                        {"Chemistry", "Biology", "Free Period", "English B", "History N"},
                        {"Chemistry", "Free Period", "Geography", "Math", "Biology"},
                        {"Biology", "Armenian A", "Free Period", "Free Period", "Geography"},
                        {"Chemistry", "Armenian A", "Math", "Theory of Knowledge", "English B"},
                        {"English B", "P.E.", "Assembly Agenda", "Free Period", "Free Period"}
                });
                Student emilyMurray = new Student("Emily", "Murray", new String[][]{
                        {"Armenia A", "Comp.Sci.", "Free Period", "Economics", "History N"},
                        {"Comp.Sci.", "English B", "Geography", "P.E.", "Armenian A"},
                        {"Armenian A", "Theory of Knowledge", "Math", "English B", "Geography"},
                        {"Math", "Economics", "Free Period", "Armenian A", "English B"},
                        {"Economics", "Free Period", "Assembly Agenda", "Free Period", "English B"}
                });
                Student joshuaPaige = new Student("Joshua", "Paige", new String[][]{
                        {"Armenian A", "Comp.Sci.", "Free Period", "Free Period", "History"},
                        {"Comp.Sci.", "Spanish", "History", "English B", "Armenian A"},
                        {"Theory of Knowledge", "Spanish", "Math", "Armenian", "Free Period"},
                        {"Math", "History N", "English B", "Armenian A", "Free Period"},
                        {"Free Period", "Free Period", "Assembly Agenda", "History", "English B"}
                });

                ArrayList<Student> studentsList = new ArrayList<Student>();
                studentsList.add(joshuaPaige);
                studentsList.add(emilyMurray);
                studentsList.add(madeleineTaylor);
                studentsList.add(robertKnox);
                studentsList.add(lukeKnox);
                studentsList.add(kimberlyTaylor);
                studentsList.add(alexandraNolan);
                studentsList.add(cameronTucker);
                studentsList.add(donnaHunter);
                studentsList.add(brianWright);
                studentsList.add(adamSanderson);
                studentsList.add(kevinArnold);
                studentsList.add(natalieBailey);
                studentsList.add(connorKnox);
                studentsList.add(mattSmith);
                studentsList.add(jasmineBuckland);
                studentsList.add(avaYoung);
                studentsList.add(sallyMacLeod);
                studentsList.add(emmaCameron);
                studentsList.add(michaelMcLean);
                studentsList.add(samButler);
                studentsList.add(owenRoss);
                studentsList.add(chloePowell);
                studentsList.add(jacobQuinn);
                studentsList.add(virginiaClarkson);
                studentsList.add(samanthaBlack);
                studentsList.add(theresaMetcalfe);
                studentsList.add(stephenWelch);
                studentsList.add(lilyAbraham);
                studentsList.add(isaacYoung);
                studentsList.add(victorHill);
                studentsList.add(jasonWelch);


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