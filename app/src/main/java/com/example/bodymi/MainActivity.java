package com.example.bodymi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editwht,edithti,edithtF;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout llMain;
        editwht=findViewById(R.id.editwht);
        edithti=findViewById(R.id.edithti);
        edithtF=findViewById(R.id.edithtF);
        btnCalculate=findViewById(R.id.btnCalculate);
        txtResult=findViewById(R.id.txtResult);
        llMain=findViewById(R.id.llMain);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wht= Integer.parseInt(editwht.getText().toString());
                int in= Integer.parseInt(edithti.getText().toString());
                int ft= Integer.parseInt(edithtF.getText().toString());
                int totalIn=ft*12+in;
                double totalCm=totalIn*2.53;
                double totalM=totalCm/100;
                double bmi=wht/(totalM*totalM);
                if(bmi>25){
                    txtResult.setText("You're Overweight!");
                    llMain.setBackgroundColor(getResources().getColor(R.color.blue));
                }
                else if(bmi<18){
                    txtResult.setText("You're UnderWeight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.red));
                }
                else{
                    txtResult.setText("You're Healthy");
                    llMain.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }
        });
    }
}