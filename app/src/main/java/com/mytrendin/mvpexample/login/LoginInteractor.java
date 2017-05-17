package com.mytrendin.mvpexample.login;

/**
 * Created by csa on 27-Apr-17.
 */

public interface LoginInteractor {

    interface onLoginListener{

        void onSuccess();
        void failure(String message);
        void onUserNameError();
        void onPasswordError();
    }

    void onLogin(String username, String password, onLoginListener listener);

}
