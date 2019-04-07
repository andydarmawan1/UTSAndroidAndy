package com.andy.uts_andydarmawan_mi2d;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.andy.uts_andydarmawan_mi2d.models.fragment.LoginFragment;
import com.andy.uts_andydarmawan_mi2d.models.fragment.NoteFragment;

public class MainActivity extends AppCompatActivity {

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
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

}
