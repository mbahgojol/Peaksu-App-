package com.go.peaksu.ui;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.go.peaksu.R;
import com.go.peaksu.konsonan.FaActivity;
import com.go.peaksu.konsonan.KhaActivity;
import com.go.peaksu.konsonan.QaActivity;
import com.go.peaksu.konsonan.SyaActivity;
import com.go.peaksu.konsonan.VaActivity;
import com.go.peaksu.konsonan.XaActivity;
import com.go.peaksu.konsonan.ZaActivity;

public class MenuKonsonan extends AppCompatActivity {
    public Button penjelasan;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.konsonanmenu);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("Menu Konsonan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void klikTombolMenu(View v) {
        switch (v.getId()) {
            case R.id.fa:
                startActivity(new Intent(this, FaActivity.class));
                return;
            case R.id.kha:
                startActivity(new Intent(this, KhaActivity.class));
                return;
            case R.id.qa:
                startActivity(new Intent(this, QaActivity.class));
                return;
            case R.id.va:
                startActivity(new Intent(this, VaActivity.class));
                return;
            case R.id.xa:
                startActivity(new Intent(this, XaActivity.class));
                return;
            case R.id.za:
                startActivity(new Intent(this, ZaActivity.class));
                return;
            case R.id.sya:
                startActivity(new Intent(this, SyaActivity.class));
                return;
            default:
                return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return false;
    }
}
