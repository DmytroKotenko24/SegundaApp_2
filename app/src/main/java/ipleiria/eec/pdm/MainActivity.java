package ipleiria.eec.pdm;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.ColorUtils;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumero1;
    private EditText txtNumero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtNumero1 = findViewById(R.id.editTextNumeroUm);
        txtNumero2 = findViewById(R.id.editTextNumeroDois);
    }

    public void onClickSoma(View view) {

        //verificar se os campos estao preenchidos
        if (txtNumero1.getText().toString().isEmpty() || txtNumero2.getText().toString().isEmpty()) {
            Toast.makeText(this, R.string.preencherCampos, Toast.LENGTH_LONG).show();
            return;
        }
        else {
            //converter os valores para double
            double numero1 = Double.parseDouble(txtNumero1.getText().toString());
            double numero2 = Double.parseDouble(txtNumero2.getText().toString());

            //calcular a soma
            double soma = numero1 + numero2;

            //mostrar o resultado
            resultado = findViewById(R.id.textViewResultado);
            resultado.setText(getString(R.string.txtResultado) + ": " + soma);

        }

    }
}