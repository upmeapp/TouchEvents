package assaf.zfani.touchevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView corText,eventText;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_UP:
                eventText.setText("Action UP");
                break;
            case MotionEvent.ACTION_MOVE:
                eventText.setText("Action Move");
                break;
            case MotionEvent.ACTION_DOWN:
                eventText.setText("Action Down");
                break;
            case MotionEvent.ACTION_CANCEL:
                eventText.setText("Action Cancel");
                break;
        }
        corText.setText(event.getX() +"," + event.getY());
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        corText = (TextView)findViewById(R.id.textViewCoordinate);
        eventText = (TextView)findViewById(R.id.textViewEvent);

    }
}
