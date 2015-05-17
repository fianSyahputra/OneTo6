package muhammadalviansyahputra.awc.onetosix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fian on 5/13/2015.
 */
public class BotDificulty extends Activity implements View.OnClickListener {

    Button normal , hard , chaos;
   private static String pilihan;

    public static String getPilihan(){
        return pilihan;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dificulty_bot);
        normal = (Button)findViewById(R.id.buttonBotNormal);
        hard = (Button)findViewById(R.id.buttonBotHard);
        chaos = (Button)findViewById(R.id.buttonBotChaos);

        normal.setOnClickListener(this);
        hard.setOnClickListener(this);
        chaos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==findViewById(R.id.buttonBotNormal)){
            pilihan = "normal";
            Intent i1 = new Intent(this , Pvb.class);
            finish();
            startActivity(i1);
        }
        else if (v==findViewById(R.id.buttonBotHard)){
            pilihan="hard";
            Intent i2 = new Intent(this , Pvb.class);
            finish();
            startActivity(i2);

        }
        else if (v==findViewById(R.id.buttonBotChaos)){
            pilihan="chaos";
            Intent i3 = new Intent(this , Pvb.class);
            finish();
            startActivity(i3);

        }

    }
}
