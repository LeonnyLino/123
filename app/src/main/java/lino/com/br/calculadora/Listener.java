package lino.com.br.calculadora;

import android.view.View;
import android.widget.EditText;

/**
 * Created by LeonnyLino on 30/03/2018.
 */

public class Listener implements View.OnClickListener {
    private EditText txtVisor;
    private String operadores;
    private double operador1, operador2;

    public Listener(CalculadoraActivity activity) {
        this.txtVisor = (EditText) activity.findViewById(R.id.visor);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn0:

                tecladoNumerico(0);
                break;

            case R.id.btn1:

                tecladoNumerico(1);
                break;

            case R.id.btn2:

                tecladoNumerico(2);
                break;

            case R.id.btn3:

                tecladoNumerico(3);
                break;

            case R.id.btn4:

                tecladoNumerico(4);
                break;

            case R.id.btn5:

                tecladoNumerico(5);
                break;

            case R.id.btn6:

                tecladoNumerico(6);
                break;

            case R.id.btn7:

                tecladoNumerico(7);
                break;

            case R.id.btn8:

                tecladoNumerico(8);
                break;

            case R.id.btn9:

                tecladoNumerico(9);
                break;

            case R.id.btnLimpar:

                txtVisor.setText("");
                break;

            case R.id.btnIgual:

                igual();
                break;

            case R.id.btnSoma:

                operacoes("+");
                break;

            case R.id.btnSubtrair:

                operacoes("-");
                break;

            case R.id.btnMult:

                operacoes("*");
                break;

            case R.id.btnDiv:

                operacoes("/");
                break;

        }

    }

    private void tecladoNumerico(int valor) {

        if (txtVisor.getText().toString().trim().equals("0")) {

            txtVisor.setText("");
            String textVisor = txtVisor.getText().toString();
            String n = String.valueOf(valor);
            String setValor = textVisor + n;
            txtVisor.setText(setValor);

        } else {

            String textVisor = txtVisor.getText().toString();
            String n = String.valueOf(valor);
            String setValor = textVisor + n;
            txtVisor.setText(setValor);

        }
    }

    private void operacoes(String operadores) {

        this.operadores = operadores;

        if (operadores == "+") {

            operador1 = Double.parseDouble(txtVisor.getText().toString().trim());
            txtVisor.setText("");

        } else if (operadores == "-") {

            operador1 = Double.parseDouble(txtVisor.getText().toString().trim());
            txtVisor.setText("");

        } else if (operadores == "*") {

            operador1 = Double.parseDouble(txtVisor.getText().toString().trim());
            txtVisor.setText("");

        } else if (operadores == "/") {

            operador1 = Double.parseDouble(txtVisor.getText().toString().trim());
            txtVisor.setText("");

        }

    }

    private void igual() {

        if(!txtVisor.getText().toString().trim().equals("")){

            if (operadores == "+") {

                operador2 = operador1 + Double.parseDouble(txtVisor.getText().toString().trim());

            } else if (operadores == "-") {

                operador2 = operador1 - Double.parseDouble(txtVisor.getText().toString().trim());

            } else if (operadores == "*") {

                operador2 = operador1 * Double.parseDouble(txtVisor.getText().toString().trim());

            } else if (operadores == "/") {

                if(operador1 == 0){

                    operador2 = 0;

                } else {

                    operador2 = operador1 / Double.parseDouble(txtVisor.getText().toString().trim());

                }

            }

        }else{

            operador2 = 0;

        }

        txtVisor.setText(String.valueOf(operador2));

    }

}
