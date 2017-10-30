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
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_list, container, false);

        final ArrayList<Card> cards = new ArrayList<Card>();

        cards.add(new Card(getString(R.string.park_name_0), 4.5, getString(R.string.park_type_0), R.drawable.municipal_rose_garden));
        cards.add(new Card(getString(R.string.park_name_1), 4.5, getString(R.string.park_type_1), R.drawable.happy_hollow_park));
        cards.add(new Card(getString(R.string.park_name_2), 4.5, getString(R.string.park_type_2), R.drawable.los_gatos_creek_trail));
        cards.add(new Card(getString(R.string.park_name_3), 4.5, getString(R.string.park_type_3), R.drawable.japanese_friendship_garden));
        cards.add(new Card(getString(R.string.park_name_4), 4.5, getString(R.string.park_type_4), R.drawable.quicksilver_trail));
        cards.add(new Card(getString(R.string.park_name_5), 4.5, getString(R.string.park_type_5), R.drawable.alum_rock_park));
        cards.add(new Card(getString(R.string.park_name_6), 4.5, getString(R.string.park_type_6), R.drawable.heritage_rose_garden));
        cards.add(new Card(getString(R.string.park_name_7), 4, getString(R.string.park_type_7), R.drawable.cesar_chavez));

        CardAdapter cardAdapter = new CardAdapter(getActivity(), cards, R.color.landmark_park);

        ListView listView = (ListView) rootView.findViewById(R.id.card_list);
        listView.setAdapter(cardAdapter);

        return rootView;
    }

}
