package com.example.radio_button;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text;
Button zero,one,two,three,four,five,sex,seven,eight,nine,equal,delete,sum,sup,mul,dev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =findViewById(R.id.textView);

        // zero button
 findViewById(R.id.zero).setOnClickListener(view -> text.setText(text.getText()+"0"));

 // one button
       findViewById(R.id.one).setOnClickListener(view -> text.setText(text.getText()+"1"));
       //two button
       findViewById(R.id.two).setOnClickListener(view ->    text.setText(text.getText()+"2")
               );
       // three button
      findViewById(R.id.three).setOnClickListener(view ->text.setText(text.getText()+"3") );
      // four button
      findViewById(R.id.four).setOnClickListener(view ->text.setText(text.getText()+"4") );
     // five button
       findViewById(R.id.five).setOnClickListener(view ->text.setText(text.getText()+"5") );
       // sex button
      findViewById(R.id.sex).setOnClickListener(view ->text.setText(text.getText()+"6") );
      //seven button
        findViewById(R.id.seven).setOnClickListener(view ->text.setText(text.getText()+"7") );
        //eight button
       findViewById(R.id.eight).setOnClickListener(view ->text.setText(text.getText()+"8") );
      // nine button
       findViewById(R.id.nine).setOnClickListener(view ->text.setText(text.getText()+"9") );

     // delete button
       findViewById(R.id.delete).setOnClickListener(view ->text.setText("") );

       // sum button
        findViewById(R.id.sum).setOnClickListener(view ->text.setText(text.getText()+" + ") );
        // sup button
        findViewById(R.id.sup).setOnClickListener(view ->text.setText(text.getText()+" -") );
        // mul button
        findViewById(R.id.mul).setOnClickListener(view ->text.setText(text.getText()+" * ") );
        //dev button
        findViewById(R.id.dev).setOnClickListener(view ->text.setText(text.getText()+" /") );
        // equal button
        findViewById(R.id.egle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m=text.getText().toString();
                String item[]=m.split(" ");
                int re= Integer.parseInt(item[0]);
                int number=0;
                for (int i=1;i<item.length;i+=2) {
if (item[i].equals("+"))
    re += Integer.parseInt(item[number+2]);

    else if (item[i].equals("-"))
        re = (re-Integer.parseInt(item[number+2]));

    else if (item[i].equals("*"))
        re = re*Integer.parseInt(item[number+2]);

    else if (item[i].equals("/"))
        re=( re/Integer.parseInt(item[number+2]));

                }
text.setText(""+re);

            }
        });




    }
}