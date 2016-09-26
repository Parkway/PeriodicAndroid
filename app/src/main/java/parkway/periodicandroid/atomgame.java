package parkway.periodicandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class atomgame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atomgame);
    }
    public void main(String[] args) {
        System.out.println("I have selected . What is the atomic number for this element?");
    }
}
