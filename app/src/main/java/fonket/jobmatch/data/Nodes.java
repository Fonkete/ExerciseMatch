package fonket.jobmatch.data;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

/**
 * Created by felip on 05-07-2017.
 */

public class Nodes {

private String user = new CurrentUser().uid();

private DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference routine(){
        return root.child("routine").child(new CurrentUser().uid());
    }

    public Query query () {
        String uid = FirebaseAuth.getInstance().getCurrentUser().getUid();
        return root.child("routine");
    }
}
