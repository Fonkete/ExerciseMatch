package fonket.jobmatch.views;

import fonket.jobmatch.models.Routine;

/**
 * Created by felip on 11-07-2017.
 */

public class CreaExercise {

    public ExerciseBack callback;

    public CreaExercise(ExerciseBack callback) {
        this.callback = callback;
    }

    public void validation(String name, String time){
        if (name.trim().length()>0){
            if (time.trim().length()>0){
                Routine routine = new Routine();
                routine.setExercise(name);
                //routine.setDuration(Integer.parseInt(time));//

            }

        }
    }
}
