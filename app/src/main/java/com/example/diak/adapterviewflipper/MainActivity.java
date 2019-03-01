package com.example.diak.adapterviewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;




public class MainActivity extends AppCompatActivity {

    private AdapterViewFlipper adapterViewFlipper;
    private int[] kepek = {
            R.drawable.park1,
            R.drawable.park2,
            R.drawable.park3,
            R.drawable.park4,
    };
    private String[] nevek = {
            "park1",
            "park2",
            "park3",
            "park4",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init()
    {
        adapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.adapterViewFlipper);
        CustomAdapter customAdapter = new CustomAdapter(this,nevek,kepek);

        

        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2600);
        adapterViewFlipper.setAutoStart(true);
    }
}
