package se.evinja.eventbustest;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import de.greenrobot.event.EventBus;

public class Receive extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_receive, container, false); //Inflate fragment
    }

    //This is th eevent that will be fired
    public void onEventMainThread(final MyEvent myevent) {
        TextView txt = (TextView) getView().findViewById(R.id.txtReceived);
        txt.setText(myevent.get());
    }

    @Override
    public void onResume() {
        super.onResume();
        EventBus.getDefault().register(this); //Register this fragment as a listener on the bus
    }

    @Override
    public void onPause() {
        EventBus.getDefault().unregister(this); //Unregister listeneing on the bus when fragment is paused
        super.onPause();
    }
}
