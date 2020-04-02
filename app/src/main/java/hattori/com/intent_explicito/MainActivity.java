package hattori.com.intent_explicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrirTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrirTela = (Button) findViewById(R.id.btnAbrirTela);
        abrirTelaQuandoClicar();

    }

    protected void abrirTelaQuandoClicar(){
        //evento de click
        btnAbrirTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //evento intent explicito chamando main2activity
                Intent it = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(it);
            }
        });
    }

}
