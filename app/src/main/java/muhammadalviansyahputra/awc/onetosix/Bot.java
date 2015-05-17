package muhammadalviansyahputra.awc.onetosix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by fian on 5/13/2015.
 */
public class Bot extends Activity implements View.OnClickListener {

    Button back;

    int pilihanBot[] = {1,2,3,4,5,6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bot);
        back = (Button) findViewById(R.id.buttonBotBack);
        TextView teks = (TextView) findViewById(R.id.textViewPilihanBot);

        int pegangSkor = DataSkor.getSkor();
        Random random = new Random();
        String ok = "";
        String pilihanDificulty = BotDificulty.getPilihan();

            if (pilihanDificulty == "normal") {
                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 43) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }

                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 50) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }
                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "") {
                        i = random.nextInt(6);
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        break;
                    }
                }
            }
       else if (pilihanDificulty == "hard") {
                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 29) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }
                for (int i = 0; i < pilihanBot.length; i++) {

                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 36) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }

                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 43) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }

                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 50) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }
                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "") {
                        i = random.nextInt(6);
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        break;
                    }
                }

            }

            else if (pilihanDificulty == "chaos") {

                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 8) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }

                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 15) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }
                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 22) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }

                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 29) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }
                for (int i = 0; i < pilihanBot.length; i++) {

                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 36) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }

                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 43) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }

                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "" && pilihanBot[i] + DataSkor.getSkor() == 50) {
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        ok = "bla";
                        break;
                    }
                }
                for (int i = 0; i < pilihanBot.length; i++) {
                    if (ok == "") {
                        i = random.nextInt(6);
                        pegangSkor += pilihanBot[i];
                        DataSkor.setAngka(pilihanBot[i]);
                        DataSkor.setSkor(pegangSkor);
                        break;
                    }
                }

            }
            back.setOnClickListener(this);
            teks.setText("BOT TELAH MENAMBAHKAN " + DataSkor.getAngka()+" Skor sekarang : "+DataSkor.getSkor());

        }


        @Override
        public void onClick (View v){

            if (DataSkor.getSkor()>=50){
                DataSkor.setWinner("Bot");
            Intent menang = new Intent(this,Menang.class);
                finish();
                startActivity(menang);

            }else {
                Intent intent = new Intent(this, Pvb.class);
                finish();
                startActivity(intent);
            }
        }
    }
