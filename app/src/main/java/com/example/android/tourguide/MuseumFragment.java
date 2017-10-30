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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_list, container, false);

        final ArrayList<Card> cards = new ArrayList<Card>();

        cards.add(new Card(getString(R.string.museum_name_0), 4.5, getString(R.string.museum_type_0), R.drawable.rosicrucian_egyptian));
        cards.add(new Card(getString(R.string.museum_name_1), 4, getString(R.string.museum_type_1), R.drawable.tech_museum));
        cards.add(new Card(getString(R.string.museum_name_2), 4.5, getString(R.string.museum_type_2), R.drawable.children_discovery));
        cards.add(new Card(getString(R.string.museum_name_3), 4, getString(R.string.museum_type_3), R.drawable.museum_of_art));
        cards.add(new Card(getString(R.string.museum_name_4), 4.5, getString(R.string.museum_type_4), R.drawable.alamden_mercury));
        cards.add(new Card(getString(R.string.museum_name_5), 4, getString(R.string.museum_type_5), R.drawable.sanjose_quilt));
        cards.add(new Card(getString(R.string.museum_name_6), 5, getString(R.string.museum_type_6), R.drawable.japanese_american));
        cards.add(new Card(getString(R.string.museum_name_7), 4, getString(R.string.museum_type_7), R.drawable.history_museum));

        CardAdapter cardAdapter = new CardAdapter(getActivity(), cards, R.color.landmark_museum);

        ListView listView = (ListView) rootView.findViewById(R.id.card_list);
        listView.setAdapter(cardAdapter);

        return rootView;
    }

}
