package se.evinja.eventbustest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import de.greenrobot.event.EventBus;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v){ //Triggered by button-click in the activity_main layout
        String message = ((EditText) findViewById(R.id.editText)).getText().toString();
        MyEvent me = new MyEvent(message); //Create a event messa<ge to send
        EventBus.getDefault().post(me); //And put in on the bus
    }


}
