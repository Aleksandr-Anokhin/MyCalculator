package com.example.mycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Calculator calculator;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_dot;
    private Button button_reset;
    private Button button_plus;
    private Button button_minus;
    private Button button_equally;
    private Button button_share;
    private Button button_multiply;
    private Button button_percent;
    TextView buttonText;
    private final String KEY_CALCULATOR = "Calculator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(KEY_CALCULATOR, (Parcelable) calculator);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator = savedInstanceState.getParcelable(KEY_CALCULATOR);
        setTextView();
    }

    private void setTextView() {
    }

    private void initView() {
        findViews();
        setClickListeners();
    }

    private void setClickListeners() {
        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_dot.setOnClickListener(this);
        button_reset.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_equally.setOnClickListener(this);
        button_share.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_percent.setOnClickListener(this);
    }

    private void findViews() {
        button_0 = findViewById(R.id.key_0);
        button_1 = findViewById(R.id.key_1);
        button_2 = findViewById(R.id.key_2);
        button_3 = findViewById(R.id.key_3);
        button_4 = findViewById(R.id.key_4);
        button_5 = findViewById(R.id.key_5);
        button_6 = findViewById(R.id.key_6);
        button_7 = findViewById(R.id.key_7);
        button_8 = findViewById(R.id.key_8);
        button_9 = findViewById(R.id.key_9);
        button_dot = findViewById(R.id.key_dot);
        button_reset = findViewById(R.id.key_reset);
        button_plus = findViewById(R.id.key_plus);
        button_minus = findViewById(R.id.key_minus);
        button_equally = findViewById(R.id.key_equally);
        button_share = findViewById(R.id.key_share);
        button_multiply = findViewById(R.id.key_multiply);
        button_percent = findViewById(R.id.key_percent);
        buttonText = findViewById(R.id.buttonText);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.key_0):
                buttonText.setText("0");
                break;
            case (R.id.key_1):
                buttonText.setText("1");;
                break;
            case (R.id.key_2):
                buttonText.setText("2");;
                break;
            case (R.id.key_3):
                buttonText.setText("3");;
                break;
            case (R.id.key_4):
                buttonText.setText("4");;
                break;
            case (R.id.key_5):
                buttonText.setText("5");;
                break;
            case (R.id.key_6):
                buttonText.setText("6");;
                break;
            case (R.id.key_7):
                buttonText.setText("7");;
                break;
            case (R.id.key_8):
                buttonText.setText("8");;
                break;
            case (R.id.key_9):
                buttonText.setText("9");;
                break;
            case (R.id.key_dot):
                buttonText.setText(".");;
                break;
            case (R.id.key_plus):
                buttonText.setText("+");;
                break;
            case (R.id.key_minus):
                buttonText.setText("-");;
                break;
            case (R.id.key_equally):
                buttonText.setText("=");;
                break;
            case (R.id.key_share):
                buttonText.setText("/");;
                break;
            case (R.id.key_multiply):
                buttonText.setText("*");;
                break;
            case (R.id.key_percent):
                buttonText.setText("%");;
                break;
        }

    }
 }