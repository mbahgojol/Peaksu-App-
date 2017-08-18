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
import com.go.peaksu.angka.DalapanActivity;
import com.go.peaksu.angka.DuaActivity;
import com.go.peaksu.angka.GenepActivity;
import com.go.peaksu.angka.HijiActivity;
import com.go.peaksu.angka.LimaActivity;
import com.go.peaksu.angka.NolActivity;
import com.go.peaksu.angka.OpatActivity;
import com.go.peaksu.angka.SalapanActivity;
import com.go.peaksu.angka.TiluActivity;
import com.go.peaksu.angka.TujuhActivity;

public class MenuAngka extends AppCompatActivity {
    public Button penjelasan;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.menuangka);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("Menu Rarangken");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void klikTombolMenu(View v) {
        switch (v.getId()) {
            case R.id.angka1:
                startActivity(new Intent(this, HijiActivity.class));
                return;
            case R.id.angka2:
                startActivity(new Intent(this, DuaActivity.class));
                return;
            case R.id.angka3:
                startActivity(new Intent(this, TiluActivity.class));
                return;
            case R.id.angka4:
                startActivity(new Intent(this, OpatActivity.class));
                return;
            case R.id.angka5:
                startActivity(new Intent(this, LimaActivity.class));
                return;
            case R.id.angka6:
                startActivity(new Intent(this, GenepActivity.class));
                return;
            case R.id.angka7:
                startActivity(new Intent(this, TujuhActivity.class));
                return;
            case R.id.angka8:
                startActivity(new Intent(this, DalapanActivity.class));
                return;
            case R.id.angka9:
                startActivity(new Intent(this, SalapanActivity.class));
                return;
            case R.id.angka0:
                startActivity(new Intent(this, NolActivity.class));
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
