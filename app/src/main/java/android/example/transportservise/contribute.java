package android.example.transportservise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contribute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribute);

        Button btnact;

        btnact=findViewById(R.id.btnact);
        btnact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://alldatmatterz.com/article/269/5-Rules-of-DTC-Buses"));
                startActivity(browserIntent);




            }
        });
    }
}
