package ulbra.saolucas.troca_de_telas;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity {
    Button btntelaprincipal, btntela2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaPrincipal();
    }
    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        btntela2 = (Button) findViewById(R.id.btntela2);
        btntela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2(); } });
    }

    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        btntelaprincipal = (Button) findViewById (R.id.btntelaprincipal);
        btntelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });
    } }