package com.komal.jetpackcomponentsdemo.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.komal.jetpackcomponentsdemo.R;


public class ListFragment extends Fragment {

    private Button button;
    private Button btnSett;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        button = view.findViewById(R.id.button1);
        btnSett = view.findViewById(R.id.button_sett);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDetailFrag();
            }
        });
        btnSett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSettings();
            }
        });
        return view;
    }

    private void launchSettings() {
        ListFragmentDirections.ActListToSett  actionSettings = ListFragmentDirections.actListToSett();
        Navigation.findNavController(btnSett).navigate(actionSettings);
    }

    private void launchDetailFrag() {
        ListFragmentDirections.ActionDetail actionDetail = ListFragmentDirections.actionDetail();
        actionDetail.setId(13);
        Navigation.findNavController(button).navigate(actionDetail);
    }
}
