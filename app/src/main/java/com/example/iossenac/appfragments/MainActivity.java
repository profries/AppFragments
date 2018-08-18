package com.example.iossenac.appfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();

        FragmentTransaction ft = manager.beginTransaction();
        ft.add(R.id.fragment_content,new PrimeiroFragment());
        ft.commit();
    }


    public void alterarParaFragment1(View view){
        FragmentManager manager = getSupportFragmentManager();

        FragmentTransaction ft = manager.beginTransaction();

        if(view.getId() == R.id.button) {
            ft.replace(R.id.fragment_content, new PrimeiroFragment());
        }
        else if(view.getId() == R.id.button2){
            ft.replace(R.id.fragment_content, new SegundoFragment());
        }

        ft.commit();
       }

//    public void alterarParaFragment1(View view){
//        FragmentManager manager = getSupportFragmentManager();
//
//        FragmentTransaction ft = manager.beginTransaction();
//        ft.replace(R.id.fragment_content,new PrimeiroFragment());
//        ft.commit();
//    }
//
//    public void alterarParaFragment2(View view){
//        FragmentManager manager = getSupportFragmentManager();
//
//        FragmentTransaction ft = manager.beginTransaction();
//        ft.replace(R.id.fragment_content,new SegundoFragment());
//        ft.commit();
//    }
}
