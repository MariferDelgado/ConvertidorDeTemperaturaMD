package facci.com.conversordetemperaturamd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityAcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_acerca_de);
    }
    public void regresar(View v ){
        Intent regreso = new Intent(this, MainActivityMD.class);
        startActivity(regreso);
}
}