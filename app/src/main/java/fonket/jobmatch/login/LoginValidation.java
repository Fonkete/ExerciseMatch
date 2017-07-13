package fonket.jobmatch.login;

import fonket.jobmatch.data.CurrentUser;

/**
 * Created by felip on 20-06-2017.
 */

public class LoginValidation {

    private LoginCallback callback;

    public LoginValidation(LoginCallback callback) {
        this.callback = callback;
    }

    public void validate(){

        if (new CurrentUser().getCurrent() != null){
            callback.logged();
        } else {
            callback.signIn();
        }
    }
}
