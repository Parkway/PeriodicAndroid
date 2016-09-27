package parkway.periodicandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void atomgame(View view) {
        Intent atoms = new Intent(MainActivity.this, atomgame.class);
        MainActivity.this.startActivity(atoms);
    }
    public void elementgame(View view) {
        Intent elements = new Intent(MainActivity.this, elementgame.class);
        MainActivity.this.startActivity(elements);
    }
    public void helpme(View view) {
        goToUrl("https://en.wikipedia.org/wiki/Periodic_table");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
