package com.andy.uts_andydarmawan_mi2d;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.andy.uts_andydarmawan_mi2d.fragment.LoginFragment;
import com.andy.uts_andydarmawan_mi2d.fragment.NoteFragment;
import com.andy.uts_andydarmawan_mi2d.models.User;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnLoginFragmentListener {

    private Settings settings;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        settings = new Settings(this);
        session = new Session(settings);

        addFragment();
    }

    private void addFragment() {
        Fragment fragment = null;
        if (session.isLogin()) {
            fragment = new NoteFragment();
        } else {
            fragment = new LoginFragment();
            ((LoginFragment) fragment).setListener(this);
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    @Override
    public void onLoginClicked(View view, String username, String password) {
        User user = session.doLogin(username, password);
        String message = "Authentication failed";
        if (user != null) {
            message = "Welcome " + username;
            session.setUser(username);
            addFragment();
        }
//
    }
    }

