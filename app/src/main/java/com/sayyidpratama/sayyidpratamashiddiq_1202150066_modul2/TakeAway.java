package com.sayyidpratama.sayyidpratamashiddiq_1202150066_modul2;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by SP-SHOCK on 2/18/2018.
 */

public class TakeAway extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
    }


    public void Clicked(View view) {

            Intent intent = new Intent(this,Menu.class); //melakukan intent ke activity Menu
            startActivity(intent);
        }
    }

