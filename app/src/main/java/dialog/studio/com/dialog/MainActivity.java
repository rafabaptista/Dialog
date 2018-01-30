package dialog.studio.com.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button)findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //criar alert dialog
                dialog = new AlertDialog.Builder( MainActivity.this );

                //titulo
                dialog.setTitle("Título da Dialog");

                //mensagem
                dialog.setMessage("Mensagem da dialog");

                dialog.setCancelable(false); // não deixa fechar o dialog quando clica fora
                dialog.setIcon(android.R.drawable.ic_delete);

                //botão não
                dialog.setNegativeButton("NÃO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "Pressionado o botão NÃO", Toast.LENGTH_LONG).show();
                            }
                        });

                //boão sim
                dialog.setPositiveButton("SIM",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "Pressionado o botão SIM", Toast.LENGTH_LONG).show();
                            }
                        });

                dialog.create();
                dialog.show();

            }
        });
    }
}
