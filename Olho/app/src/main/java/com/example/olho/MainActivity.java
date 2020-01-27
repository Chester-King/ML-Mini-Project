package com.example.olho;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference dat = database.getReference();
    TextView block1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        block1=findViewById(R.id.block1);

        dat.child("ML").child("Block1").child("State").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                block1.setText(String.valueOf(dataSnapshot.getValue()));
                if(String.valueOf(dataSnapshot.getValue()).equalsIgnoreCase("Yes")){
                    block1.setTextColor(Color.GREEN);
                }else{
                    block1.setTextColor(Color.RED);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
