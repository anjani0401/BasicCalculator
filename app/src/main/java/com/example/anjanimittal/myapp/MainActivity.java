package com.example.anjanimittal.myapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText ed1,ed2;
    TextView tv;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        tv = (TextView)findViewById(R.id.textView);
        add = (Button)findViewById(R.id.button);
        sub = (Button)findViewById(R.id.button2);
        mul = (Button)findViewById(R.id.button3);
        div = (Button)findViewById(R.id.button4);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button)
        {
            Integer val1 = Integer.parseInt(ed1.getText().toString());
            Integer val2 = Integer.parseInt(ed2.getText().toString());
            Integer sum = val1+val2;
            tv.setText(""+sum);
        }
        else if (v.getId() == R.id.button2)
        {
            Integer val1 = Integer.parseInt(ed1.getText().toString());
            Integer val2 = Integer.parseInt(ed2.getText().toString());
            Integer min = val1-val2;
            tv.setText(""+min);
        }
        else if (v.getId() == R.id.button4)
        {
            Integer val1 = Integer.parseInt(ed1.getText().toString());
            Integer val2 = Integer.parseInt(ed2.getText().toString());
            Integer divi = val1/val2;
            tv.setText(""+divi);
        }
        else if (v.getId() == R.id.button3)
        {
            Integer val1 = Integer.parseInt(ed1.getText().toString());
            Integer val2 = Integer.parseInt(ed2.getText().toString());
            Integer mult = val1*val2;
            tv.setText(""+mult);
        }
        else
        {
            tv.setText("press a button");
        }
    }
}
