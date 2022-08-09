package com.example.displaygridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView empImage;
    TextView id, name, sal, designation;
    String idStr, nameStr, salStr, designationStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        empImage=findViewById(R.id.imagedisplay);
        id=findViewById(R.id.eIDTxt);
        name=findViewById(R.id.enameTxt);
        sal=findViewById(R.id.esalTxt);
        designation=findViewById(R.id.edesignationTxt);

        idStr=getIntent().getStringExtra("idKey");
        nameStr=getIntent().getStringExtra("nameKey");
        salStr=getIntent().getStringExtra("salKey");
        designationStr=getIntent().getStringExtra("designationKey");

        int emImage=getIntent().getIntExtra("imageKey",0);
        empImage.setImageResource(emImage);

        id.setText("EmpID: "+idStr);
        name.setText("Name: "+nameStr);
        sal.setText("Salary: "+salStr);
        designation.setText("Designation: "+designationStr);







    }
}