package br.example.camila.notas;

import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.app.Dialog;
import android.app.DatePickerDialog;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by camila on 06/07/14.
 */
public class MoreFunctions {


    public static EditText edt_deData, edt_aData, edt_deTime,  edt_aTime;
    public static TextView txt_Titulo;
    public static Button btn_Ok;


    public static void alertDialogDate(final Button btn_ok, final DatePicker datePicker, View v, MyActivity activity, final EditText date, LayoutInflater layoutInflater ){

            datePicker.setCalendarViewShown(false);

        AlertDialog.Builder builder =  new AlertDialog.Builder(activity);
        final AlertDialog alert;

        alert = builder.create();
        alert.setView(v);
        alert.show();



        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();


                date.setText(day + "/" + month + "/" + year);


                alert.dismiss();
            }
        });


    }


    //Apenas para chamar o AlertDialog com o TimePicker
    public static void alertDialogTime( final TimePicker timePicker, final Button btn_ok,View v, final MyActivity activity,  final EditText edt_Time, LayoutInflater layoutInflater ){

        timePicker.setIs24HourView(true);

        AlertDialog.Builder builder =  new AlertDialog.Builder(activity);
        final AlertDialog alert;

        alert = builder.create();
        alert.setView(v);
        alert.show();



        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentHourText = timePicker.getCurrentHour().toString();

                String currentMinuteText = timePicker.getCurrentMinute().toString();

                edt_Time.setText(currentHourText + ":" + currentMinuteText);

                alert.dismiss();
            }
        });


    }


}
