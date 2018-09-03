package com.example.system.localguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EateryFragment extends Fragment {


    public EateryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list, container, false);
        // Created an array of lists
        ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Vada Pav", R.string.vada_pav, R.drawable.vada_pav));
        lists.add(new List("Cutting Chai", R.string.cutting_chai, R.drawable.cutting_chai));
        lists.add(new List("Bheja Fry", R.string.bheja_fry, R.drawable.bheja_fry));
        lists.add(new List("Bhel Puri", R.string.bhel_puri, R.drawable.bhel_puri));

        // Find the root view so we can add child views to it
        ListAdapter adapter = new ListAdapter(getActivity(), lists);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}
