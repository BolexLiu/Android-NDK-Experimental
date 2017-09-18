package bolex.com.androidjna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sun.jna.Native;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("lavor");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(getTitles());
    }

    public native String getTitles();

}
