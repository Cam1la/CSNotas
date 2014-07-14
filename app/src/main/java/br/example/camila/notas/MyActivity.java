package br.example.camila.notas;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        Button btnCadastro;

        btnCadastro = (Button) findViewById(R.id.btn_Cadastro);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.novanota);
            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


   /*Alert Dialog Date*/

public void includeDate(View v){

    MoreFunctions.edt_deData = (EditText) findViewById(R.id.edt_deData);
    MoreFunctions.edt_aData = (EditText) findViewById(R.id.edt_aData);

    MyActivity activity = MyActivity.this;
    LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View  view = layoutInflater.inflate(R.layout.datepiker, null, false);
    DatePicker datePicker = (DatePicker) view.findViewById(R.id.myDatePicker);
    MoreFunctions.btn_Ok = (Button) view.findViewById(R.id.btn_OkDate);

    if (v == v.findViewById(R.id.edt_deData)){

        MoreFunctions.alertDialogDate(MoreFunctions.btn_Ok,datePicker, view, activity, MoreFunctions.edt_deData, layoutInflater);

    }else if(v == v.findViewById(R.id.edt_aData)){

        MoreFunctions.alertDialogDate(MoreFunctions.btn_Ok,datePicker, view, activity, MoreFunctions.edt_aData, layoutInflater);

    }else{}


}


    public void includeTime(View v){

        MoreFunctions.edt_deTime = (EditText) findViewById(R.id.edt_deTime);
        MoreFunctions.edt_aTime = (EditText) findViewById(R.id.edt_aTime);


        MyActivity activity = MyActivity.this;
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View  view = layoutInflater.inflate(R.layout.timepiker, null, false);
        TimePicker timePicker = (TimePicker) view.findViewById(R.id.myTimePicker);
        MoreFunctions.btn_Ok = (Button) view.findViewById(R.id.btn_OkTime);


        if (v == v.findViewById(R.id.edt_deTime)){

            MoreFunctions.alertDialogTime(timePicker, MoreFunctions.btn_Ok,  view, activity, MoreFunctions.edt_deTime, layoutInflater);

        }else if(v == v.findViewById(R.id.edt_aTime)){

            MoreFunctions.alertDialogTime(timePicker, MoreFunctions.btn_Ok, view, activity, MoreFunctions.edt_aTime, layoutInflater);

        }else{}
    }




}
