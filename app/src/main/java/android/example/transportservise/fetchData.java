package android.example.transportservise;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class fetchData extends AsyncTask<Void,Void,Void> {
    String data = "";
    String data1 = "";
    //String doubleParsed = "";
    //String tripleParsed = "";
    //String dataParsed = "";
    String singleParsed, doubleParsed, tripleParsed, fourParsed, dataParsed = "";

    //String name ="delhi";
    EditText txt_city;

    //String name = "@id/btn";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://api.waqi.info/feed/delhi/anand-vihar/?token=75eb85f5a96abc95c4a658cddf276ac265612016");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }


            JSONObject JO = new JSONObject(data);
            singleParsed = "status: " + JO.get("status") + "\n";
            //JSONObject jsonObject = new JSONObject(data1);
            //doubleParsed =  "AQI: 😎" + JSONObject.getInt("aqi") +"\n";
            //JSONObject JO1= new JSONObject(data1);
            JSONObject Stu = JO.getJSONObject("data");
            doubleParsed = "AQI: 😎" + String.valueOf(Stu.get("aqi")) + "\n";
            JSONObject city = Stu.getJSONObject("city");
            JSONArray JA = city.getJSONArray("geo");
            //for(int i=0; i<JA.length();i++){
            tripleParsed = "Latitude🔥🔥🔥" + JA.get(0) + "\n";
            fourParsed = "Longitude🔥🔥🔥" + JA.get(1) + "\n";
            //JSONObject JA1 = (JSONObject) JA.get(i);
            //doubleParsed = "" + JO.getInt("aqi");
            dataParsed = singleParsed + doubleParsed + tripleParsed + fourParsed;

            /*JSONArray JA = new JSONArray(data);
                for(int i=0;i<JA.length();i++) {
                    JSONObject JO = (JSONObject) JA.get(i);
                    singleParsed =
                            "Name:" + JO.get("name") + "\n" +
                            "Password:" + JO.get("password") + "\n" +
                            "Contact:" + JO.get("contact") + "\n" +
                            "Country:" + JO.get("country") + "\n";



                    dataParsed = dataParsed + singleParsed  + "\n";
               }*/


        } catch (MalformedURLException e) {
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        pollution.data.setText(this.dataParsed);

    }
}