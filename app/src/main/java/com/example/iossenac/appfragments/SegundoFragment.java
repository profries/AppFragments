package com.example.iossenac.appfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class SegundoFragment extends Fragment {
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_segundo, container, false);
        TextView texto = view.findViewById(R.id.textoFragment2);
        texto.setText("Meu Fragment 2");
        return view;
    }
}
