package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    String VALUEBUTTON1 ="1";
    String VALUEBUTTON2 ="2";
    String VALUEBUTTON3 ="3";
    String VALUEBUTTON4 ="4";
    String VALUEBUTTON5 ="5";
    String VALUEBUTTON6 ="6";
    String VALUEBUTTON7 ="7";
    String VALUEBUTTON8 ="8";
    String VALUEBUTTON9 ="9";
    String VALUEBUTTON0 ="0";
    String VALUEBUTTONPOINT =".";

    String currentValue = "";
    int currentAction = 0; // 1 - сложение; 2 - вычитание; 3 - умножение; 4 - деление;
    Double arg1;
    Double arg2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initClickListeners();

    }

    private void initViews() {
        textView = findViewById(R.id.textView1);
    }

    private void setTextButton( String value) {
        textView.setText(String.format(Locale.getDefault(), "%s",value) );
    }


    private void initClickListeners(){
        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButton0ClickListener();

        initButtonPointClickListener();

        initButtonAddClickListener();
        initButtonSubClickListener();
        initButtonMulClickListener();
        initButtonDivClickListener();

        initButtonResultClickListener();
    }
    private void initButton1ClickListener() {
        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON1);
                currentValue = currentValue + VALUEBUTTON1;

            }
        });
    }


    private void initButton2ClickListener() {
        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON2);
                currentValue = currentValue + VALUEBUTTON2;
            }
        });
    }

    private void initButton3ClickListener() {
        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON3);
                currentValue = currentValue + VALUEBUTTON3;
            }
        });
    }

    private void initButton4ClickListener() {
        Button button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON4);
                currentValue = currentValue + VALUEBUTTON4;
            }
        });
    }

    private void initButton5ClickListener() {
        Button button5 = findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON5);
                currentValue = currentValue + VALUEBUTTON5;
            }
        });
    }

    private void initButton6ClickListener() {
        Button button6 = findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON6);
                currentValue = currentValue + VALUEBUTTON6;
            }
        });
    }

    private void initButton7ClickListener() {
        Button button7 = findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON7);
                currentValue = currentValue + VALUEBUTTON7;
            }
        });
    }

    private void initButton8ClickListener() {
        Button button8 = findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON8);
                currentValue = currentValue + VALUEBUTTON8;
            }
        });
    }

    private void initButton9ClickListener() {
        Button button9 = findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON9);
                currentValue = currentValue + VALUEBUTTON9;
            }
        });
    }

    private void initButton0ClickListener() {
        Button button0 = findViewById(R.id.button0);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTON0);
                currentValue = currentValue + VALUEBUTTON0;
            }
        });
    }


    private void initButtonPointClickListener() {
        Button buttonPoint = findViewById(R.id.buttonPoint);

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextButton(currentValue + VALUEBUTTONPOINT);
                currentValue = currentValue + VALUEBUTTONPOINT;
            }
        });
    }


    private void initButtonAddClickListener() {
        Button buttonAdd = findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentAction = 1;
                arg1 = Double.parseDouble(currentValue);
                currentValue = "";
                setTextButton(currentValue);
            }
        });
    }


    private void initButtonSubClickListener() {
        Button buttonSub = findViewById(R.id.buttonSub);

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentValue == "") {
                    currentValue = "-";
                    setTextButton(currentValue);
                } else {
                    currentAction = 2;
                    arg1 = Double.parseDouble(currentValue);
                    currentValue = "";
                    setTextButton(currentValue);
                }
            }
        });
    }

    private void initButtonMulClickListener() {
        Button buttonMul = findViewById(R.id.buttonMul);

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentAction = 3;
                arg1 = Double.parseDouble(currentValue);
                currentValue = "";
                setTextButton(currentValue);
            }
        });
    }

    private void initButtonDivClickListener() {
        Button buttonDiv = findViewById(R.id.buttonDiv);

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentAction = 4;
                arg1 = Double.parseDouble(currentValue);
                currentValue = "";
                setTextButton(currentValue);
            }
        });
    }

    private void initButtonResultClickListener() {
        Button buttonResult = findViewById(R.id.buttonResult);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentValue.equals("")) {
                    setTextButton("0");
                } else {
                    arg2 = Double.parseDouble(currentValue);
                    currentValue = "";

                    switch (currentAction) {
                        case 1: result = arg1 + arg2;
                            break;
                        case 2: result = arg1 - arg2;
                            break;
                        case 3: result = arg1 * arg2;
                            break;
                        case 4: result = arg1 / arg2;
                            break;
                        default: result = 0.0;
                            break;
                    }
                    String res = Double.toString(result);
                    setTextButton(res);
                }
            }
        });
    }
}