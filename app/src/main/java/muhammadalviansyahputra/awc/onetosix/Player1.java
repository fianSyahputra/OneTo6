package muhammadalviansyahputra.awc.onetosix;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

/**
 * Created by fian on 5/12/2015.
 */
public class Player1 extends Activity implements  AdapterView.OnItemClickListener {

    String skor;
    TextView view;
    ListView list;
    String []pilihan = {"Tambahkan satu","Tambahkan dua","Tambahkan tiga","Tambahkan empat","Tambahkan lima","Tambahkan enam"};
    int angka[] = {1,2,3,4,5,6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player1);

        if (DataSkor.getAngka()!=0){
                Toast.makeText(this,"Player 2 menambahkan "+DataSkor.getAngka(),Toast.LENGTH_SHORT).show();
        }
    list = (ListView) findViewById(R.id.listViewPlayer1);
    ArrayAdapter adapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1,pilihan);
    view = (TextView)findViewById(R.id.textViewSkor);
    skor = ""+DataSkor.getSkor();
      view.setText(skor);
        list.setAdapter(adapter);
    list.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        int tahanSkor = DataSkor.getSkor();
        tahanSkor+=angka[position];
        DataSkor.setSkor(tahanSkor);
       DataSkor.setAngka(angka[position]);
        if (DataSkor.getSkor()>=50){
            DataSkor.setWinner("Player 1");
         Intent menang = new Intent(this , Menang.class);
            finish();
            startActivity(menang);
        }else {
            Intent intent = new Intent(this , Player2.class);
            finish();
            startActivity(intent);

        }

    }
}
