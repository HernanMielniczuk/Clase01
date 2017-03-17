package com.example.alumno.clase01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ningún elemento del xml (los que se ven en pantalla) se debe instanciar en java (new miObjeto()).
        // El setContentView se encarga de gestionar las instancias. Todo el manejo de objetos se debe hacer
        // luego del SetContentView porque ya estarían creados.

        // En la clase R se guardan los mapeos (valores int) de todos los elementos que cree.
        // int i = R.id.tvSaludo;
        TextView tv = (TextView)findViewById(R.id.tvSaludo);
        tv.setText("Otra cosa");


// VCS (o AVD Manager - icono celular violeta y android) -->

    }
}
