package com.example.calcu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLimpiar, btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho,
            btnNueve, btnSumar, btnRestar, btnDividir, btnMulti, btnPotencia, btnModulo, btnRaiz,
            btnPunto, btnIgual;
    EditText etProceso, etConcatenar;
    double num1, num2, resultado;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimpiar = (Button)findViewById(R.id.limpiar);
        btnCero = (Button)findViewById(R.id.cero);
        btnUno = (Button)findViewById(R.id.uno);
        btnDos = (Button)findViewById(R.id.dos);
        btnTres = (Button)findViewById(R.id.tres);
        btnCuatro = (Button)findViewById(R.id.cuatro);
        btnCinco = (Button)findViewById(R.id.cinco);
        btnSeis = (Button)findViewById(R.id.seis);
        btnSiete = (Button)findViewById(R.id.siete);
        btnOcho = (Button)findViewById(R.id.ocho);
        btnNueve = (Button)findViewById(R.id.nueve);
        btnPunto = (Button)findViewById(R.id.punto);
        btnSumar = (Button)findViewById(R.id.raiz);
        btnRestar = (Button)findViewById(R.id.restar);
        btnDividir = (Button)findViewById(R.id.dividir);
        btnMulti = (Button)findViewById(R.id.multi);
        btnPotencia = (Button)findViewById(R.id.potencia);
        btnIgual = (Button)findViewById(R.id.igual);
        btnModulo = (Button)findViewById(R.id.modulo);
        etProceso = (EditText)findViewById(R.id.display);


        btnCero.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "0");
        });
        btnUno.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "1");
        });
        btnDos.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "2");
        });
        btnTres.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "3");
        });
        btnCuatro.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "4");
        });
        btnCinco.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "5");
        });
        btnSeis.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "6");
        });
        btnSiete.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "7");
        });
        btnOcho.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "8");
        });
        btnNueve.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "9");
        });
        btnPunto.setOnClickListener((v)-> {
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + ".");
        });
        btnSumar.setOnClickListener((v)-> {
            operador = "+";
            etConcatenar = (EditText)findViewById(R.id.display);
            num1 = Double.parseDouble(etConcatenar.getText().toString());
            etProceso.setText("");
        });
        btnRestar.setOnClickListener((v)-> {
            operador = "+";
            etConcatenar = (EditText)findViewById(R.id.display);
            num1 = Double.parseDouble(etConcatenar.getText().toString());
            etProceso.setText("");
        });
        btnMulti.setOnClickListener((v)-> {
            operador = "*";
            etConcatenar = (EditText)findViewById(R.id.display);
            num1 = Double.parseDouble(etConcatenar.getText().toString());
            etProceso.setText("");
        });
        btnDividir.setOnClickListener((v)-> {
            operador = "/";
            etConcatenar = (EditText)findViewById(R.id.display);
            num1 = Double.parseDouble(etConcatenar.getText().toString());
            etProceso.setText("");
        });
        btnRaiz.setOnClickListener((v)-> {
            etProceso.setText("");
            operador = "sqrt";
            etConcatenar = (EditText)findViewById(R.id.display);
            etProceso.setText(etConcatenar.getText().toString() + "sqrt");
            num1 = Double.parseDouble(etConcatenar.getText().toString());
        });
        btnPotencia.setOnClickListener((v)-> {
            operador = "x2";
            etConcatenar = (EditText)findViewById(R.id.display);
            num1 = Double.parseDouble(etConcatenar.getText().toString());
            etProceso.setText("");
        });
        btnModulo.setOnClickListener((v)-> {
            operador = "%";
            etConcatenar = (EditText)findViewById(R.id.display);
            num1 = Double.parseDouble(etConcatenar.getText().toString());
            etProceso.setText("");
        });
        btnIgual.setOnClickListener((v)->{
            etConcatenar = (EditText)findViewById(R.id.display);
            num2 = Double.parseDouble(etConcatenar.getText().toString());
            if(operador.equals("+")){
                etProceso.setText("");
                resultado = num1 + num2;
            }
            if(operador.equals("-")){
                etProceso.setText("");
                resultado = num1 - num2;
            }
            if(operador.equals("*")){
                etProceso.setText("");
                resultado = num1 * num2;
            }
            if(operador.equals("/")){
                etProceso.setText("");
                if(num2 != 0){
                    resultado = num1 + num2;
                }else {
                    etProceso.setText("Math Error");
                }
            }
            if(operador.equals("x2")){
                etProceso.setText("");
                resultado = Math.pow(num1, num2);
            }
            if(operador.equals("sqrt")){
                resultado = Math.sqrt(num1);
            }
            if(operador.equals("%")){
                etProceso.setText("");
                resultado = num1 % num2;
            }
            etProceso.setText(String.valueOf(resultado));
        });
        btnLimpiar.setOnClickListener((v)->{
            num1 = 0;
            num2 = 0;
            etProceso.setText("");
        });
    }
}