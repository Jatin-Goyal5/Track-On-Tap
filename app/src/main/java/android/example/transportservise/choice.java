package android.example.transportservise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choice extends AppCompatActivity {
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        button10= (Button)findViewById(R.id.Button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(choice.this,busroute.class);
                startActivity(i);

            }
        });

        button11= (Button)findViewById(R.id.Button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(choice.this,pollution.class);
                startActivity(i);

            }
        });

        button12= (Button)findViewById(R.id.Button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(choice.this,track.class);
                startActivity(i);

            }
        });

        button13= (Button)findViewById(R.id.Button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(choice.this,complain.class);
                startActivity(i);

            }
        });

        button14= (Button)findViewById(R.id.Button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(choice.this,emergency.class);
                startActivity(i);

            }
        });

        button15= (Button)findViewById(R.id.Button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(choice.this,contribute.class);
                startActivity(i);

            }
        });

    }
}
