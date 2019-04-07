package com.andy.uts_andydarmawan_mi2d.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.andy.uts_andydarmawan_mi2d.MainActivity;
import com.andy.uts_andydarmawan_mi2d.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private OnLoginFragmentListener listener;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        final EditText usernameText = view.findViewById(R.id.text_username);
        final EditText passwordText = view.findViewById(R.id.text_password);
        Button loginButton = view.findViewById(R.id.button_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameText.getText().toString();
                String password = passwordText.getText().toString();
                listener.onLoginClicked(view, username, password);
            }
        });

        TextView registerLink = view.findViewById(R.id.link_register);
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onRegisterLinkClicked();
                }
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnLoginFragmentListener) {
            listener = (OnLoginFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnLoginFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public void setListener(OnLoginFragmentListener listener) {
        this.listener = listener;
    }

    public OnLoginFragmentListener getListener() {
        return listener;
    }

    public interface OnLoginFragmentListener {
        void onLoginClicked(View view, String username, String password);
        void onRegisterLinkClicked();

    }

}
