package com.go.peaksu.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.go.peaksu.R;
import com.go.peaksu.ngalagena.BaActivity;
import com.go.peaksu.ngalagena.CaActivity;
import com.go.peaksu.ngalagena.DaActivity;
import com.go.peaksu.ngalagena.GaActivity;
import com.go.peaksu.ngalagena.HaActivity;
import com.go.peaksu.ngalagena.JaActivity;
import com.go.peaksu.ngalagena.KaActivity;
import com.go.peaksu.ngalagena.LaActivity;
import com.go.peaksu.ngalagena.MaActivity;
import com.go.peaksu.ngalagena.NaActivity;
import com.go.peaksu.ngalagena.NgaActivity;
import com.go.peaksu.ngalagena.NyaActivity;
import com.go.peaksu.ngalagena.PaActivity;
import com.go.peaksu.ngalagena.RaActivity;
import com.go.peaksu.ngalagena.SaActivity;
import com.go.peaksu.ngalagena.TaActivity;
import com.go.peaksu.ngalagena.WaActivity;
import com.go.peaksu.ngalagena.YaActivity;


public class MenuDasar extends AppCompatActivity {
    public Button penjelasan;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.menudasar);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("Menu Dasar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public void klikTombolMenu(View v) {
        switch (v.getId()) {
            case R.id.ba:
                startActivity(new Intent(this, BaActivity.class));
                return;
            case R.id.ca:
                startActivity(new Intent(this, CaActivity.class));
                return;
            case R.id.da:
                startActivity(new Intent(this, DaActivity.class));
                return;
            case R.id.ga:
                startActivity(new Intent(this, GaActivity.class));
                return;
            case R.id.ha:
                startActivity(new Intent(this, HaActivity.class));
                return;
            case R.id.ja:
                startActivity(new Intent(this, JaActivity.class));
                return;
            case R.id.ka:
                startActivity(new Intent(this, KaActivity.class));
                return;
            case R.id.la:
                startActivity(new Intent(this, LaActivity.class));
                return;
            case R.id.ma:
                startActivity(new Intent(this, MaActivity.class));
                return;
            case R.id.nga:
                startActivity(new Intent(this, NgaActivity.class));
                return;
            case R.id.nya:
                startActivity(new Intent(this, NyaActivity.class));
                return;
            case R.id.ta:
                startActivity(new Intent(this, TaActivity.class));
                return;
            case R.id.na:
                startActivity(new Intent(this, NaActivity.class));
                return;
            case R.id.pa:
                startActivity(new Intent(this, PaActivity.class));
                return;
            case R.id.ya:
                startActivity(new Intent(this, YaActivity.class));
                return;
            case R.id.ra:
                startActivity(new Intent(this, RaActivity.class));
                return;
            case R.id.wa:
                startActivity(new Intent(this, WaActivity.class));
                return;
            case R.id.sa:
                startActivity(new Intent(this, SaActivity.class));
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
