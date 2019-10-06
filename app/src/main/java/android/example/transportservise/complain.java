package android.example.transportservise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class complain extends AppCompatActivity {


    Button btnact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);



    btnact = findViewById(R.id.btnact);
        btnact.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){

        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("mailto:dtcpc.delhi@nic.in"));
        startActivity(browserIntent);


    }
    });
}
}