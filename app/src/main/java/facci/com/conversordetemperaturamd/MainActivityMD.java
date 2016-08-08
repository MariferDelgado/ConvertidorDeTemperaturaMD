package facci.com.conversordetemperaturamd;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import java.util.Locale;

public class MainActivityMD extends Activity {

    double RecibeTemperatura=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_md);

        final TextView txtRecebeTemp=(TextView)findViewById(R.id.txtRecebeTemp);
        final TextView txtFarenheit=(TextView)findViewById(R.id.txtFarenheit);
        final TextView txtKelvin=(TextView)findViewById(R.id.txtKelvin);

        final SeekBar seekBar1=(SeekBar)findViewById(R.id.seekBar);
        seekBar1.setMax(3000);

        seekBar1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            RecibeTemperatura =(double)(progress/10.0);

                String texto= formatNumber(progress/10.0);
                texto +="°C";
                txtRecebeTemp.setText(texto);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
             final Button btnConverter=(Button)findViewById(R.id.btnConverter);

            btnConverter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                    double Farenheit=(((RecibeTemperatura)*9/5+32));
                    String texto= formatNumber(Farenheit);
                    texto +="°F";
                    txtFarenheit.setText(texto);

                    double Kelvin=(RecibeTemperatura + 263);
                    String texto2=formatNumber(Kelvin);
                    texto +="°K";
                    txtKelvin.setText(texto2);
            }
        });
}
             private String formatNumber(double valor){
             return String.format(Locale.FRANCE,"%.2f", valor);
    }
}