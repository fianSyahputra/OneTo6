package muhammadalviansyahputra.awc.onetosix;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {



    Button pvp , pvb , penjelasan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   pvp = (Button) findViewById(R.id.buttonPVP);
        pvb = (Button) findViewById(R.id.buttonPVB);
        penjelasan = (Button) findViewById(R.id.buttonPenjelasan);

        pvp.setOnClickListener(this);
         pvb.setOnClickListener(this);
        penjelasan.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v == findViewById(R.id.buttonPenjelasan)){

            Intent i1 = new Intent(this, Penjelasan.class);
            finish();
            startActivity(i1);

        } else if (v==findViewById(R.id.buttonPVP)){

            Intent i2 = new Intent(this , Player1.class);
            finish();
            startActivity(i2);
        } else if (v==findViewById(R.id.buttonPVB)){
            Intent i3 = new Intent(this , BotDificulty.class);
            finish();
            startActivity(i3);

        }



    }
}
