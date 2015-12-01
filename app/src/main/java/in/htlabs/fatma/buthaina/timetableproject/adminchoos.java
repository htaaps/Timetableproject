package in.htlabs.fatma.buthaina.timetableproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by CTE on 30/11/2015.
 */
public class adminchoos extends AppCompatActivity implements View.OnClickListener {
    Spinner cs_sp_course, cs_sp_section, cs_sp_teacher;
    Button cs_bt_get_course, cs_bt_get_section, cs_bt_get_teacher, cs_bt_select, cs_bt_send, cs_bt_exit;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);


    }

    private void joinViews() {


        //Views initialization

        cs_sp_course = (Spinner) findViewById(R.id.cs_sp_course);
        cs_sp_section = (Spinner) findViewById(R.id.cs_sp_section);
        cs_sp_teacher = (Spinner) findViewById(R.id.cs_sp_teacher);
        cs_bt_get_course = (Button) findViewById(R.id.cs_bt_get_course);
//        cs_bt_get_section = (Button) findViewById(R.id.cs_bt_cs_bt_get_section);
//        cs_bt_get_teacher = (Button) findViewById(R.id.cs_bt_cs_bt_get_teacher);
//        cs_bt_select = (Button) findViewById(R.id.cs_bt_cs_bt_select);
//        cs_bt_send = (Button) findViewById(R.id.cs_bt_cs_bt_send);
        cs_bt_exit = (Button) findViewById(R.id.cs_bt_exit);

        cs_bt_get_course.setOnClickListener(this);
        cs_bt_get_section.setOnClickListener(this);
        cs_bt_get_teacher.setOnClickListener(this);
        cs_bt_select.setOnClickListener(this);
        cs_bt_send.setOnClickListener(this);
        cs_bt_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}


