package fonket.jobmatch.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;

import fonket.jobmatch.R;
import fonket.jobmatch.data.Nodes;
import fonket.jobmatch.models.Routine;

/**
 * Created by felip on 11-07-2017.
 */

public class RoutineAdapter extends FirebaseRecyclerAdapter<Routine, RoutineAdapter.RoutineHolder>{

    public RoutineAdapter() {
        //super(Routine.class, R.layout.list_item_routine, RoutineHolder.class, new Nodes().routine());
        super(Routine.class, R.layout.list_item_routine, RoutineHolder.class, new Nodes().query());

    }

    @Override
    protected void populateViewHolder(RoutineHolder viewHolder, Routine model, int position) {

        viewHolder.exerciseTv.setText(model.getExercise());
        viewHolder.timeTv.setText(model.getDuration());
    }

    public static class RoutineHolder extends RecyclerView.ViewHolder {

        CheckBox checkBox = (CheckBox) itemView.findViewById(R.id.exerciseCb);
        TextView exerciseTv = (TextView) itemView.findViewById(R.id.exerciseTv);
        TextView timeTv = (TextView) itemView.findViewById(R.id.timeTv);

        public RoutineHolder(View itemView) {
            super(itemView);

        }
    }
}
