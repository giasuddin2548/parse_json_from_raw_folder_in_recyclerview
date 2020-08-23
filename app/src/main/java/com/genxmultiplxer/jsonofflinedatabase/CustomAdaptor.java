package com.genxmultiplxer.jsonofflinedatabase;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdaptor extends BaseAdapter { //searchView step 2 implement Filterable the overrider its method
    // step:1 extends Base adaptor here, step:2 Override Basedapter four mathod here
    //step 3: adapter die mainjava class theke pataono data gulo recive korar jonno ekhane tader jonno abar Global Varivle decliare
    //korte hobe
    Context context;

    String[] name, phoneNo,sl;

    //step 6:XML file ke view te convert korte LayoutInflater lage tai ekhane private LayoutInflater declalor korte hobe
    private LayoutInflater inflater;

// step:4 Global variable er constructor create korte hobe ekhane


    public CustomAdaptor(Context context, String[] name, String[] phoneNo, String[] sl) {
        this.context = context;
        this.name = name;
        this.phoneNo = phoneNo;
        this.sl = sl;

    }

    @Override// BaseAdapter override mathod 1
    public int getCount() {

        return name.length;//step 5: ekhane return 0 bad die return country name.lenth dite hobe er meaning hocche ami
        // joto gula item dekhte cacchi toto gula item ekhane return korbe
    }

    @Override// BaseAdapter override mathod 2
    public Object getItem(int position) {
        return null;
    }

    @Override// BaseAdapter override mathod 3
    public long getItemId(int position) {
        return 0;
    }

    @Override// BaseAdapter override mathod 4
    public View getView(final int position, View convertView, ViewGroup parent) {
        //step 7;
        if(convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.sample_layout,parent,false);

        }
        //step 8:

        TextView textView=(TextView) convertView.findViewById(R.id.taxtView_thanaNameId);
        TextView textView2=(TextView) convertView.findViewById(R.id.taxtView_thanaPhoneId);
        TextView textView_sl=(TextView) convertView.findViewById(R.id.textView_thana_slId);
        ImageView imageView=convertView.findViewById(R.id.imageId);


        //step 9




            textView.setText(name[position]);
        textView2.setText(phoneNo[position]);
        textView_sl.setText(sl[position]);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Mobile No is: "+"0"+phoneNo[position],Toast.LENGTH_SHORT).show();
            }
        });


        //step 10
        return convertView;



    }



    //searchView step 3 start



    //searchView step 3 end here
}
