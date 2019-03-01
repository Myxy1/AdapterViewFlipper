package com.example.diak.adapterviewflipper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] kepek;
    String[] nevek;
    LayoutInflater layoutInflater;

    //konstruktor felvétel
    public CustomAdapter(Context context, String[] nev, int[] kep){

        this.context = context;
        this.kepek = kep;
        this.nevek = nev;
        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return nevek.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pozicio, View view, ViewGroup parent) {
        view = layoutInflater.inflate(R.layout.lista_ertekek, null);
        TextView textViewNev = (TextView) view.findViewById(R.id.textViewNev);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        textViewNev.setText(nevek[pozicio]);
        imageView.setImageResource(kepek[pozicio]);
        return view;
    }
}
