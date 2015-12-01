package in.htlabs.fatma.buthaina.timetableproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by CTE on 16/11/2015.
 */
public class start extends AppCompatActivity implements View.OnClickListener {

    Button start;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        start=(Button)findViewById(R.id.start);
        start.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.start:

                i = new Intent(this, main.class);
                startActivity(i);
                break;
        }
        }
    }