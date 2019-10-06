package android.example.transportservise;

import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;




import android.Manifest;
import android.content.pm.PackageManager;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class emergency extends AppCompatActivity {

    Button button;
    EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        if(ContextCompat.checkSelfPermission(emergency.this,
                Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(emergency.this,
                    Manifest.permission.SEND_SMS)){
                ActivityCompat.requestPermissions(emergency.this,
                        new String[]{Manifest.permission.SEND_SMS},1);
            } else {
                ActivityCompat.requestPermissions(emergency.this,
                        new String[]{Manifest.permission.SEND_SMS}, 1);
            }
        }else{

        }

        button = (Button) findViewById(R.id.button);
        //editText=(EditText)findViewById(R.id.editText);
        //editText2=(EditText)findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String [] number = {"9717533570","8585937950","8920271691","9599759715"};
                String sms = "help!!!!";

                try{
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number[0], null,sms, null,null);
                    smsManager.sendTextMessage(number[1], null,sms, null,null);
                    smsManager.sendTextMessage(number[2], null,sms, null,null);
                    smsManager.sendTextMessage(number[3], null,sms, null,null);
                    Toast.makeText(emergency.this,"Ho gya Sir", Toast.LENGTH_SHORT).show();

                }catch (Exception e){
                    Toast.makeText(emergency.this, "Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1: {
                if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    if(ContextCompat.checkSelfPermission(emergency.this,
                            Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(this, "Apna Time Aayega", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(this, "Upon dobara aayega", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
}



