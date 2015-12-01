package in.htlabs.fatma.buthaina.timetableproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by CTE on 25/11/2015.
 */
public class main extends AppCompatActivity implements View.OnClickListener {
    Button admin,student,teacher;
    Intent i;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        admin=(Button)findViewById(R.id.admin);
        teacher=(Button)findViewById(R.id.teacher);
        student=(Button)findViewById(R.id.student);

        admin.setOnClickListener(this);
        teacher.setOnClickListener(this);
        student.setOnClickListener(this);
}
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.admin:

                i = new Intent(this,admin.class);
                startActivity(i);
                break;

            case R.id.teacher:

                i = new Intent(this,teacher.class);
                startActivity(i);
                break;

            case R.id.student:

                i = new Intent(this,student.class);
                startActivity(i);
                break;
        }
    }
}