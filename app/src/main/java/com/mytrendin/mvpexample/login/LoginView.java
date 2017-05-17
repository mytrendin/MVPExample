package com.mytrendin.mvpexample.login;

/**
 * Created by csa on 27-Apr-17.
 */

public interface LoginView {

    void setUsernameError();
    void setPasswordError();
    void setNavigation();
    void showMessage(String message);
}
