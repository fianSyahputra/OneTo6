package muhammadalviansyahputra.awc.onetosix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by fian on 5/12/2015.
 */
public class Menang extends Activity implements View.OnClickListener {


    TextView teks;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menang);

        teks = (TextView)findViewById(R.id.textViewMenang);
        teks.setText("GAME OVER ! "+DataSkor.getWinner()+" TELAH MENANG");
        back = (Button)findViewById(R.id.buttonBackMenang);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DataSkor.resetSkor();
        Intent i = new Intent(this , MainActivity.class);
        finish();
        startActivity(i);
    }
}
