package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 = {
            {"DoctorName: Dr. John Smith", "HospitalAddress: 123 Main Street, Cityville, State", "Experience: 15 years", "PhoneNumber: 555-123-4567", "12345"},
            {"DoctorName: Dr. Sarah Johnson", "HospitalAddress: 456 Elm Avenue, Townsville, State", "Experience: 10 years", "PhoneNumber: 555-987-6543", "67890"},
            {"DoctorName: Dr. Michael Brown", "HospitalAddress: 789 Oak Road, Villageton, State", "Experience: 20 years", "PhoneNumber: 555-234-5678", "54321"},
            {"DoctorName: Dr. Emily Davis", "HospitalAddress: 101 Pine Lane, Hamletville, State", "Experience: 5 years", "PhoneNumber: 555-789-0123", "98765"},
            {"DoctorName: Dr. David Wilson", "HospitalAddress: 222 Cedar Street, Countryside, State", "Experience: 12 years", "PhoneNumber: 555-345-6789", "23456"}
    };
    private String[][] doctor_details2 = {
            {"DoctorName: Dr. John Smith", "HospitalAddress: 123 Main Street, Cityville, State", "Experience: 15 years", "PhoneNumber: 555-123-4567", "12345"},
            {"DoctorName: Dr. Sarah Johnson", "HospitalAddress: 456 Elm Avenue, Townsville, State", "Experience: 10 years", "PhoneNumber: 555-987-6543", "67890"},
            {"DoctorName: Dr. Michael Brown", "HospitalAddress: 789 Oak Road, Villageton, State", "Experience: 20 years", "PhoneNumber: 555-234-5678", "54321"},
            {"DoctorName: Dr. Emily Davis", "HospitalAddress: 101 Pine Lane, Hamletville, State", "Experience: 5 years", "PhoneNumber: 555-789-0123", "98765"},
            {"DoctorName: Dr. David Wilson", "HospitalAddress: 222 Cedar Street, Countryside, State", "Experience: 12 years", "PhoneNumber: 555-345-6789", "23456"}
    };
    private String[][] doctor_details3 = {
            {"DoctorName: Dr. John Smith", "HospitalAddress: 123 Main Street, Cityville, State", "Experience: 15 years", "PhoneNumber: 555-123-4567", "12345"},
            {"DoctorName: Dr. Sarah Johnson", "HospitalAddress: 456 Elm Avenue, Townsville, State", "Experience: 10 years", "PhoneNumber: 555-987-6543", "67890"},
            {"DoctorName: Dr. Michael Brown", "HospitalAddress: 789 Oak Road, Villageton, State", "Experience: 20 years", "PhoneNumber: 555-234-5678", "54321"},
            {"DoctorName: Dr. Emily Davis", "HospitalAddress: 101 Pine Lane, Hamletville, State", "Experience: 5 years", "PhoneNumber: 555-789-0123", "98765"},
            {"DoctorName: Dr. David Wilson", "HospitalAddress: 222 Cedar Street, Countryside, State", "Experience: 12 years", "PhoneNumber: 555-345-6789", "23456"}
    };
    private String[][] doctor_details4 = {
            {"DoctorName: Dr. John Smith", "HospitalAddress: 123 Main Street, Cityville, State", "Experience: 15 years", "PhoneNumber: 555-123-4567", "12345"},
            {"DoctorName: Dr. Sarah Johnson", "HospitalAddress: 456 Elm Avenue, Townsville, State", "Experience: 10 years", "PhoneNumber: 555-987-6543", "67890"},
            {"DoctorName: Dr. Michael Brown", "HospitalAddress: 789 Oak Road, Villageton, State", "Experience: 20 years", "PhoneNumber: 555-234-5678", "54321"},
            {"DoctorName: Dr. Emily Davis", "HospitalAddress: 101 Pine Lane, Hamletville, State", "Experience: 5 years", "PhoneNumber: 555-789-0123", "98765"},
            {"DoctorName: Dr. David Wilson", "HospitalAddress: 222 Cedar Street, Countryside, State", "Experience: 12 years", "PhoneNumber: 555-345-6789", "23456"}
    };
    private String[][] doctor_details5 = {
            {"DoctorName: Dr. John Smith", "HospitalAddress: 123 Main Street, Cityville, State", "Experience: 15 years", "PhoneNumber: 555-123-4567", "12345"},
            {"DoctorName: Dr. Sarah Johnson", "HospitalAddress: 456 Elm Avenue, Townsville, State", "Experience: 10 years", "PhoneNumber: 555-987-6543", "67890"},
            {"DoctorName: Dr. Michael Brown", "HospitalAddress: 789 Oak Road, Villageton, State", "Experience: 20 years", "PhoneNumber: 555-234-5678", "54321"},
            {"DoctorName: Dr. Emily Davis", "HospitalAddress: 101 Pine Lane, Hamletville, State", "Experience: 5 years", "PhoneNumber: 555-789-0123", "98765"},
            {"DoctorName: Dr. David Wilson", "HospitalAddress: 222 Cedar Street, Countryside, State", "Experience: 12 years", "PhoneNumber: 555-345-6789", "23456"}
    };
    String[][] doctor_details = {};
    ArrayList list;
    SimpleAdapter sa;
    HashMap<String, String> item;


    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);
        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);
        if (title.compareTo("Family Physicians") == 0){
            doctor_details = doctor_details1;
        }
        if (title.compareTo("Dietician") == 0){
            doctor_details = doctor_details2;
        }
        if (title.compareTo("Surgeon") == 0){
            doctor_details = doctor_details3;
        }
        if (title.compareTo("Dentist") == 0){
            doctor_details = doctor_details4;
        }
        if (title.compareTo("Cardiologist") == 0){
            doctor_details = doctor_details5;
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailsActivity.this, FindDoctorActivity.class));
            }
        });
        list = new ArrayList();
        for (int i = 0; i < doctor_details.length; i++){
            item = new HashMap<String, String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Cons Fees: " + doctor_details[i][4] + "/-");
            list.add(item);
        }
        sa = new SimpleAdapter(this, list, R.layout.multi_lines,
                new String[]{"line1", "line2", "line3", "line4", "line5"},
                new int[]{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e}
        );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent it = new Intent(DoctorDetailsActivity.this, BookAppointmentActivity.class);
                it.putExtra("text1", title);
                it.putExtra("text2", doctor_details[i][0]);
                it.putExtra("text3", doctor_details[i][1]);
                it.putExtra("text4", doctor_details[i][3]);
                it.putExtra("text5", doctor_details[i][4]);
                startActivity(it);
            }
        });

    }
}