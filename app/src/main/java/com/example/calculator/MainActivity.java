package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual, buttonYuzde, buttonArti_Eksi, buttonVirgul;
    EditText crunchifyEditText;
    AppCompatImageButton buttonSil;
    TextView textView;
    float mValueOne, mValueTwo;
    int mValueVirgul1, mValueVirgul2;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, crunchifyYuzde, crunchifyVirgul;

    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.sifir);
        button1 = (Button) findViewById(R.id.bir);
        button2 = (Button) findViewById(R.id.iki);
        button3 = (Button) findViewById(R.id.uc);
        button4 = (Button) findViewById(R.id.dort);
        button5 = (Button) findViewById(R.id.bes);
        button6 = (Button) findViewById(R.id.alti);
        button7 = (Button) findViewById(R.id.yedi);
        button8 = (Button) findViewById(R.id.sekiz);
        button9 = (Button) findViewById(R.id.dokuz);
        buttonAdd = (Button) findViewById(R.id.arti);
        buttonSub = (Button) findViewById(R.id.eksi);
        buttonMul = (Button) findViewById(R.id.çarp);
        buttonDivision = (Button) findViewById(R.id.bolu);
        buttonC = (Button) findViewById(R.id.ac);
        buttonEqual = (Button) findViewById(R.id.esittir);
        buttonYuzde = findViewById(R.id.yüzde);
        buttonArti_Eksi = findViewById(R.id.arti_eksi);
        buttonSil = findViewById(R.id.sil);
        textView = findViewById(R.id.text);
        buttonVirgul = findViewById(R.id.virgül);
        crunchifyEditText = (EditText) findViewById(R.id.islem);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }

                crunchifyEditText.setText(crunchifyEditText.getText() + "1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }

                crunchifyEditText.setText(crunchifyEditText.getText() + "2");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }

                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }

                crunchifyEditText.setText(crunchifyEditText.getText() + "6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = crunchifyEditText.getText().toString();
                if (edit.contains(".0")) {
                    crunchifyEditText.setText("");
                }
                if (edit.startsWith("0")) {
                    crunchifyEditText.setText("");
                }
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = crunchifyEditText.getText().toString();
                if (crunchifyVirgul == true) {
                    virgul();
                    crunchifyVirgul = false;
                }
                if (temp.equals("") || temp.equals("0")) {
                    buttonAdd.setClickable(false);
                }
                if ((!temp.equals("") || !temp.equals("0"))) {

                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    textView.setText(mValueOne + "+");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                }

            }

        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = crunchifyEditText.getText().toString();
                if (crunchifyVirgul == true) {
                    virgul();
                    crunchifyVirgul = false;
                }
                if (temp.equals("") || temp.equals("0")) {
                    buttonAdd.setClickable(false);
                }
                if ((!temp.equals("") || !temp.equals("0"))) {

                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    textView.setText(mValueOne + "-");
                    mSubtract = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = crunchifyEditText.getText().toString();
                if (crunchifyVirgul == true) {
                    virgul();
                    crunchifyVirgul = false;
                }
                if (temp.equals("") || temp.equals("0")) {
                    buttonAdd.setClickable(false);
                }
                if ((!temp.equals("") || !temp.equals("0")) && crunchifyVirgul == false) {

                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    textView.setText(mValueOne + "X");
                    crunchifyMultiplication = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = crunchifyEditText.getText().toString();
                if (crunchifyVirgul == true) {
                    virgul();
                    crunchifyVirgul = false;
                }
                if (temp.equals("") || temp.equals("0")) {
                    buttonAdd.setClickable(false);
                }
                if ((!temp.equals("") || !temp.equals("0")) && crunchifyVirgul == false) {

                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    textView.setText(mValueOne + "/ ");
                    crunchifyDivision = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");
                String string1, string2;

                if (crunchifyAddition == true) {
                    if (crunchifyVirgul == true) {
                        virgul();
                        string2 = crunchifyEditText.getText().toString();
                        textView.setText(mValueOne + "+" + Float.parseFloat(string2) + "=");
                        crunchifyEditText.setText(mValueOne + Float.parseFloat(string2) + "");
                        crunchifyVirgul = false;

                    } else {
                        textView.setText(mValueOne + " + " + mValueTwo + " = ");
                        crunchifyEditText.setText(mValueOne + mValueTwo + "");
                        crunchifyAddition = false;
                    }
                }

                if (mSubtract == true) {
                    if (crunchifyVirgul == true) {
                        virgul();
                        string2 = crunchifyEditText.getText().toString();
                        textView.setText(mValueOne + "-" + Float.parseFloat(string2) + "=");
                        crunchifyEditText.setText(mValueOne - Float.parseFloat(string2) + "");
                        crunchifyVirgul = false;

                    } else {
                        textView.setText(mValueOne + " - " + mValueTwo + " = ");
                        crunchifyEditText.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }
                }

                if (crunchifyMultiplication == true) {
                    if (crunchifyVirgul == true) {
                        virgul();
                        string2 = crunchifyEditText.getText().toString();
                        textView.setText(mValueOne + "X" + Float.parseFloat(string2) + "=");
                        crunchifyEditText.setText(mValueOne * Float.parseFloat(string2) + "");
                        crunchifyVirgul = false;

                    } else {
                        textView.setText(mValueOne + " X " + mValueTwo + " = ");
                        crunchifyEditText.setText(mValueOne * mValueTwo + "");

                    }
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    if (crunchifyVirgul == true) {
                        virgul();
                        string2 = crunchifyEditText.getText().toString();
                        textView.setText(mValueOne + "/" + Float.parseFloat(string2) + "=");
                        crunchifyEditText.setText(mValueOne / Float.parseFloat(string2) + "");
                        crunchifyVirgul = false;

                    } else {
                        textView.setText(mValueOne + " / " + mValueTwo + " = ");
                        crunchifyEditText.setText(mValueOne / mValueTwo + "");
                        crunchifyDivision = false;
                    }
                }

                if (crunchifyYuzde == true) {
                    if (crunchifyVirgul == true) {
                        virgul();
                        string2 = crunchifyEditText.getText().toString();
                        textView.setText(mValueOne + "%" + Float.parseFloat(string2) + "=");
                        crunchifyEditText.setText(mValueOne % Float.parseFloat(string2) + "");
                        crunchifyVirgul = false;

                    } else {
                        textView.setText(mValueOne + " + " + mValueTwo + " = ");
                        crunchifyEditText.setText(mValueOne % mValueTwo + "");
                        crunchifyYuzde = false;
                    }
                }


                textView.append(crunchifyEditText.getText().toString());
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("0");
                textView.setText("");
            }
        });
        buttonYuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = crunchifyEditText.getText().toString();
                if (crunchifyVirgul == true) {
                    virgul();
                    crunchifyVirgul = false;
                }
                if (temp.equals("") || temp.equals("0")) {
                    buttonAdd.setClickable(false);
                }
                if ((!temp.equals("") || !temp.equals("0")) && crunchifyVirgul == false) {

                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    textView.setText(mValueOne + "%");
                    crunchifyYuzde = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonArti_Eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = crunchifyEditText.getText().toString(), temp1;
                if (temp.startsWith("-")) {
                    temp1 = temp.substring(1, temp.length() - 1);
                    crunchifyEditText.setText("+" + temp1);
                    textView.setText(crunchifyEditText.getText().toString());
                } else {
                    crunchifyEditText.setText("-" + crunchifyEditText.getText().toString());
                    textView.setText(crunchifyEditText.getText().toString());
                }
            }
        });
        buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(crunchifyEditText.getText().toString().equals(""))) {
                    String kopyaekran = crunchifyEditText.getText().toString();
                    kopyaekran = kopyaekran.substring(0, kopyaekran.length() - 1);
                    crunchifyEditText.setText(kopyaekran);
                }
            }
        });
        buttonVirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.equals("")) {
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + "0");
                    textView.append("0,");
                } else {
                    mValueVirgul1 = Integer.parseInt(crunchifyEditText.getText().toString());
                    crunchifyVirgul = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

    }

    public final void virgul() {
        crunchifyVirgul = true;
        mValueVirgul2 = Integer.parseInt(crunchifyEditText.getText().toString());
        int len = String.valueOf(mValueVirgul1).length() + String.valueOf(mValueVirgul2).length();
        int k = 1;
        for (int i = 0; i < len - 1; i++) {
            mValueVirgul1 *= 10;
            k *= 10;
        }
        float f = Float.parseFloat(String.valueOf(mValueVirgul1 + mValueVirgul2));
        float f1 = Float.parseFloat(String.valueOf(k));
        crunchifyEditText.setText(String.valueOf(f / f1));
        //textView.setText(textView.getText().toString() + crunchifyEditText.getText().toString());

    }
}

