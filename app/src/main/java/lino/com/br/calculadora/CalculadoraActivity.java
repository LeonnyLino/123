package lino.com.br.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalculadoraActivity extends AppCompatActivity{
    private EditText txtVisor;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnSoma;
    private Button btnSubt;
    private Button btnMulti;
    private Button btnDivi;
    //private Button btnIgual;
    //private Button btnLimpar;
    private Button btn0;
    private String operadores;
    private double operador1, operador2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        txtVisor = (EditText) findViewById(R.id.visor);
        int todosOsBotoes[] = {R.id.btn0, R.id.btn1, R.id.btn2 , R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9,
                                R.id.btnSoma, R.id.btnSubtrair, R.id.btnMult, R.id.btnDiv, R.id.btnIgual, R.id.btnLimpar};

        Listener click = new Listener(this);
        for(int id:todosOsBotoes){
            View view = findViewById(id);
            view.setOnClickListener(click);

        }






    }


}
