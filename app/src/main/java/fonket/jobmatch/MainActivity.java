package fonket.jobmatch;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;

import fonket.jobmatch.adapters.RoutineAdapter;
import fonket.jobmatch.data.Nodes;
import fonket.jobmatch.models.Routine;
import fonket.jobmatch.views.ExerciseBack;

public class MainActivity extends AppCompatActivity implements ExerciseBack {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recycler = (RecyclerView) findViewById(R.id.Rv);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        RoutineAdapter adapter = new RoutineAdapter();
        recycler.setAdapter(adapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                //new Nodes().routine().child("prueba").setValue("prueba");//
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_exercise);
                dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                ImageButton saveBtn = (ImageButton) dialog.findViewById(R.id.saveBtn);
                saveBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText inputExercise = (EditText) dialog.findViewById(R.id.exerciseEt);
                        EditText inputTime = (EditText) dialog.findViewById(R.id.timeEt);
                        String name = inputExercise.getText().toString();
                        String time = inputTime.getText().toString();

                        new Nodes().routine().push().child("exercise").setValue(name);
                        new Nodes().routine().push().child("duration").setValue(time);
                        dialog.dismiss();


                    }
                });
                dialog.show();


            }
        });
    }

    @Override
    public void created(Routine routine) {

    }

    @Override
    public void noname() {

    }

    @Override
    public void notime() {

    }


}




