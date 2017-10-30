package com.example.android.tourguide;


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
public class RestroomFragment extends Fragment {


    public RestroomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_list, container, false);

        final ArrayList<Card> cards = new ArrayList<Card>();

        cards.add(new Card(getString(R.string.rr_name_0), 0, getString(R.string.rr_addr_0)));
        cards.add(new Card(getString(R.string.rr_name_0), 0, getString(R.string.rr_addr_1)));
        cards.add(new Card(getString(R.string.rr_name_0), 0, getString(R.string.rr_addr_2)));
        cards.add(new Card(getString(R.string.rr_name_0), 3, getString(R.string.rr_addr_3)));
        cards.add(new Card(getString(R.string.rr_name_1), 4, getString(R.string.rr_addr_4), R.drawable.diridon));

        CardAdapter cardAdapter = new CardAdapter(getActivity(), cards, R.color.landmark_restroom);

        ListView listView = (ListView) rootView.findViewById(R.id.card_list);
        listView.setAdapter(cardAdapter);

        return rootView;
    }

}
