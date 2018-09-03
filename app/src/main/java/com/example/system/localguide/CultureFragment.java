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
public class CultureFragment extends Fragment {


    public CultureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list, container, false);
        // Created an array of lists
        ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Holi", R.string.holi_des, R.drawable.holi));
        lists.add(new List("Dahi Handi", R.string.dahi_des, R.drawable.dahi_handi));
        lists.add(new List("Ganpati", R.string.ganpati_des, R.drawable.ganpati));

        // Find the root view so we can add child views to it
        ListAdapter adapter = new ListAdapter(getActivity(), lists);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
