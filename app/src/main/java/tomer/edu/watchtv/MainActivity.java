package tomer.edu.watchtv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnORT;
    Button btnRTR;
    Button btnCh10;
    Button btn112;
    Button btnOnePlusOne;
    Button btnAnimal;
    Button btnNEOGEO;
    Button btnNTV;
    Button btnYOUTUBE;
    Button btnGlazTv;
    Button btnZopTv;
    Button btnKuvaldaTv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnORT = (Button) findViewById(R.id.btnORT);
        btnRTR = (Button) findViewById(R.id.btnRTR);
        btnCh10 = (Button) findViewById(R.id.btnCh10);
        btn112 = (Button) findViewById(R.id.btn112);
        btnOnePlusOne = (Button) findViewById(R.id.btnOnePlusOne);
        btnAnimal = (Button) findViewById(R.id.btnAnimal);
        btnNEOGEO = (Button) findViewById(R.id.btnNEOGEO);
        btnNTV = (Button) findViewById(R.id.btnNTV);
        btnYOUTUBE = (Button) findViewById(R.id.btnYOUTUBE);
        btnGlazTv = (Button) findViewById(R.id.btnGlazTv);
        btnZopTv = (Button) findViewById(R.id.btnGlazTv);
        btnKuvaldaTv = (Button) findViewById(R.id.btnKuvaldaTv);

    }

    public void showORT(View view) {
        //https://www.1tv.ru/live
        Uri data = Uri.parse("https://www.1tv.ru/live");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void showRTR(View view) {
        //http://www.glaz.tv/online-tv/rtr-planeta
        Uri data = Uri.parse("http://www.glaz.tv/online-tv/rtr-planeta");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }


    public void showCh10(View view) {
        //http://10tv.nana10.co.il/Article/?ArticleID=1055909
        Uri data = Uri.parse("http://10tv.nana10.co.il/Article/?ArticleID=1055909");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void show112(View view) {
        Uri data = Uri.parse("http://112.ua/live");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void showOneplusOne(View view) {
        Uri data = Uri.parse("http://1plus1.ua/online");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void showAnimal(View view) {
        Uri data = Uri.parse("http://onelike.tv/animal-planet.html");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void showNEOGEO(View view) {
        Uri data = Uri.parse("http://qartulitvlive.com/national-geographic/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void showNTV(View view) {
        Uri data = Uri.parse("http://www.moskvatv.org/page/ntv-russia-online.php");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void showYOUTUBE(View view) {
        Uri data = Uri.parse("https://www.youtube.com/user/YouTubeRussia");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void showGlazTv(View view) {
        Uri data = Uri.parse("http://www.glaz.tv/online-tv/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }


    public void showZopTv(View view) {
        Uri data = Uri.parse("http://www.zoptv.com/live/disney-russia");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }

    public void showKuvaldaTv(View view) {
        Uri data = Uri.parse("http://kuvalda.tv/disney-online");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, data);
        startActivity(webIntent);
    }
}
