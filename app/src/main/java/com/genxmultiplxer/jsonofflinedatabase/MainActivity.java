package com.genxmultiplxer.jsonofflinedatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {





    String[] Name;
    String[] Phone;
    String[] Sl;

    CustomAdaptor adaptor;
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = getResources().getStringArray(R.array.thana);
        Phone = getResources().getStringArray(R.array.PhoneNo);
        Sl = getResources().getStringArray(R.array.sl);

        listView=findViewById(R.id.listViewId);

        adaptor = new CustomAdaptor(this, Name, Phone, Sl);
        listView.setAdapter(adaptor);





        /*

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Data pass or second Activity Call setp 1:  here activity calling
            //    Intent intent = new Intent(StudenInfo.this, Country_Details_Activity.class);

                //Data pass or second Activity Call setp 2: Data passing to sencnd activity from first activity

          //      intent.putExtra("CountryImages", images[position]);
              //  intent.putExtra("CountryNames", studentName[position]);
               // intent.putExtra("idNo", idNo[position]);

                Toast.makeText(MainActivity.this,"Mobile No is: "+"0"+Phone[position],Toast.LENGTH_SHORT).show();

             //   startActivity(intent);
            }
        });
*/
      //  addItemsFromJSON();

    }

/*
    private void getJson() {
        String json;
        try {
            InputStream is=getAssets().open("jshondb.json");
            int size=is.available();
            byte[] buffer=new byte[size];
            is.read();
            is.close();
            json=new String(buffer,"UTF-8");


            try {
                JSONObject jsonObject = new JSONObject(json);

                JSONArray jsonArray = jsonObject.getJSONArray("brand_list");

                for (int i = 0; i < jsonArray.length(); i++) {

                    JSONObject object = jsonArray.getJSONObject(i);



                    String brand_id = object.getString("brand_id");
                    String brand_name = object.getString("brand_name");
                    String brand_image = object.getString("brand_image");
                    String total_mobile = object.getString("total_mobile");



                    list__catwise_filtered.add(new model(brand_id,brand_name,brand_image,total_mobile));

                }
                catwisefilterAdapter = new CatwisefilterAdapter(getApplicationContext(), list__catwise_filtered);
                recyclerView_catwise_filtered.setAdapter(catwisefilterAdapter);
                catwisefilterAdapter.notifyDataSetChanged();


            } catch (JSONException e) {
                e.printStackTrace();
            }


        }catch (IOException e){





    }
}



    private void addItemsFromJSON() {
        try {

            String jsonDataString = readJSONDataFromFile();
            JSONArray jsonArray = new JSONArray(jsonDataString);

            for (int i=0; i<jsonArray.length(); ++i) {

                JSONObject itemObj = jsonArray.getJSONObject(i);

                String brand_id = itemObj.getString("brand_id");
                String brand_name = itemObj.getString("brand_name");
                String brand_image = itemObj.getString("brand_image");
                String total_mobile = itemObj.getString("total_mobile");

                model holidays = new model(brand_id, brand_name,brand_image,total_mobile);
                list__catwise_filtered.add(holidays);
            }
            catwisefilterAdapter = new CatwisefilterAdapter(getApplicationContext(), list__catwise_filtered);
            recyclerView_catwise_filtered.setAdapter(catwisefilterAdapter);
            catwisefilterAdapter.notifyDataSetChanged();

        } catch (JSONException | IOException e) {

        }
    }

    private String readJSONDataFromFile() throws IOException{

        InputStream inputStream = null;
        StringBuilder builder = new StringBuilder();

        try {

            String jsonString = null;
            inputStream = getResources().openRawResource(R.raw.jshondb);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream, "UTF-8"));

            while ((jsonString = bufferedReader.readLine()) != null) {
                builder.append(jsonString);
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return new String(builder);
    }
*/
}
