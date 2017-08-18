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

import com.go.peaksu.R;
import com.go.peaksu.swara.AActivity;
import com.go.peaksu.swara.EActivity;
import com.go.peaksu.swara.EeActivity;
import com.go.peaksu.swara.EuActivity;
import com.go.peaksu.swara.IActivity;
import com.go.peaksu.swara.OActivity;
import com.go.peaksu.swara.UActivity;

public class MenuSwara extends AppCompatActivity {
    public Button penjelasan;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.menuswara);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("Menu Swara");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void klikTombolMenu(View v) {
        switch (v.getId()) {
            case R.id.a:
                startActivity(new Intent(this, AActivity.class));
                return;
            case R.id.e:
                startActivity(new Intent(this, EActivity.class));
                return;
            case R.id.eu:
                startActivity(new Intent(this, EuActivity.class));
                return;
            case R.id.i:
                startActivity(new Intent(this, IActivity.class));
                return;
            case R.id.u:
                startActivity(new Intent(this, UActivity.class));
                return;
            case R.id.o:
                startActivity(new Intent(this, OActivity.class));
                return;
            case R.id.e2:
                startActivity(new Intent(this, EeActivity.class));
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
