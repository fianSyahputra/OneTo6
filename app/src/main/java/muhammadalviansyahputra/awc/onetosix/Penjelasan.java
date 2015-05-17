package muhammadalviansyahputra.awc.onetosix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fian on 5/12/2015.
 */
public class Penjelasan extends Activity implements View.OnClickListener {


    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.penjelasan);

        a= (Button) findViewById(R.id.buttonBack);
        a.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(this , MainActivity.class);
        finish();
        startActivity(i);

    }
}
