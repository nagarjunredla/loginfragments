package com.intigrent.intigrent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LoginFragment extends Fragment {
    register_toggle_listener mc;

    public interface register_toggle_listener {
        public void register_toggle();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        mc = (register_toggle_listener) getActivity();
        Button b = (Button)view.findViewById(R.id.register_toggle);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mc.register_toggle();
            }
        });
        return view;
    }


}
