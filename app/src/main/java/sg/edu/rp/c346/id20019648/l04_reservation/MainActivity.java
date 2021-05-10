package sg.edu.rp.c346.id20019648.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    TextView tvDisplayName;
    TextView tvDisplayTelephone;
    TextView tvMsg;
    CheckBox cb;
    Button btnReserve;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        tvDisplayName = findViewById(R.id.textViewName);
        tvDisplayTelephone = findViewById(R.id.textViewTelephone);
        tvMsg = findViewById(R.id.textViewMsg);
        cb = findViewById(R.id.checkBoxSmoking);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
                dp.updateDate(2020, 6, 1);
                cb.setChecked(false);

            }
        });

        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "The reservation is confirmed!";
            }

        });

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });



    }
}