package com.mytrendin.mvpexample.login;

import android.text.TextUtils;

/**
 * Created by csa on 27-Apr-17.
 */

public class LoginInteractorImpl implements LoginInteractor {



    @Override
    public void onLogin(String username, String password, onLoginListener listener) {

        if (TextUtils.isEmpty(username)){

            listener.onUserNameError();
        } else if (TextUtils.isEmpty(password)){

            listener.onPasswordError();
        }else if(username.equals("username")&& password.equals("password")){

            listener.onSuccess();
        }else {

            listener.failure("Something ent wrong");
        }

    }
}
