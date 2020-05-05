package com.komal.jetpackcomponentsdemo.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.komal.jetpackcomponentsdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        int id = DetailFragmentArgs.fromBundle(getArguments()).getId();
        Toast.makeText(getContext(),"id: "+id,Toast.LENGTH_LONG).show();
        return view;
    }
}
