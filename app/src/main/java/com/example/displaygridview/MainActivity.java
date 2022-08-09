package com.example.displaygridview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    UserPojo userPojo;
    UserAdapter userAdapter;
    List<UserPojo> userPojoList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.customGrid);
        userAdapter=new UserAdapter(this,userPojoList);
        gridView.setAdapter(userAdapter);

       loadUserData1();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("imageKey",userPojoList.get(i).getEmpImage());
                intent.putExtra("idKey",userPojoList.get(i).getEmpid());
                intent.putExtra("nameKey",userPojoList.get(i).getEmpname());
                intent.putExtra("salKey",userPojoList.get(i).getEmpsal());
                intent.putExtra("designationKey",userPojoList.get(i).getEmpDesignation());
                startActivity(intent);



            }
        });


    }

    private void loadUserData1() {

        userPojo=new UserPojo(R.drawable.emp1,"Ruk1234","Ruksana","50,000","Android Developer");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.emp2,"Raju4323","Raju","50,000","Android Developer");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.emp3,"Sai2212","Sai","50,000","Android Developer");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.emp4,"Aish5643","Aishwarya","50,000",".Net Developer");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.emp5,"Tama3454","Tamanna","80,000","Android Developer");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.emp1,"Gopi2343","Gopika","50,000",".Net Developer");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.emp2,"Niksan9896","Santosh","500000","cloud Developer");
        userPojoList.add(userPojo);


        userAdapter.notifyDataSetChanged();


    }
}