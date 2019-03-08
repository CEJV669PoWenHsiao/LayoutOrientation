package cejv669.concordia.com.layoutorientation;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String eventMessage;
    final String logTag = "OrientationLab";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.txtOrientation);

        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            tv.setText("Landscape Change");
        }

        if (orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            tv.setText("Portrait Change");
        }

        eventMessage = "Event: OnCreate";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        eventMessage = "Event: OnStart";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        eventMessage = "Event: onResume";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        eventMessage = "Event: onPause";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        eventMessage = "Event: onStop";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        eventMessage = "Event: onDestroy";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        eventMessage = "Event: onRestart";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }
}
