package ipleiria.eec.pdm;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

        txtNumero1 = findViewById(R.id.textViewNum1);
        txtNumero2 = findViewById(R.id.textViewNum2);
    }

    public void onClickSoma(View view) {

        if (txtNumero1.getText().toString().trim().isEmpty() || txtNumero2.getText().toString().trim().isEmpty()) {
            return;
        }

        /*
        if (Numero1.getText().toString().trim().equals("") || Numero2.getText().toString().trim().equals("")) {
            return;
        }
        int numero1 = Integer.parseInt(Numero1.getText().toString());
        int numero2 = Integer.parseInt(Numero2.getText().toString());
        int soma = numero1 + numero2;
        String resultado = getResources().getString(R.string.txtResultado) + " " + soma;
        Numero1.setText("");
        Numero2.setText("");
        Numero1.requestFocus();
        Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();
        */

    }
}