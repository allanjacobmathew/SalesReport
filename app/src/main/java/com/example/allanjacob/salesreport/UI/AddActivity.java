package com.example.allanjacob.salesreport.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.allanjacob.salesreport.DataBase.SaleDetails;
import com.example.allanjacob.salesreport.R;
import com.example.allanjacob.salesreport.RoomApplication;

public class AddActivity extends AppCompatActivity {
    private Button add;
    private EditText item_ed;
    private  EditText number_id;
    private String item,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        item_ed=findViewById(R.id.item_add);
        number_id=findViewById(R.id.number_id);
        add=findViewById(R.id.add_btn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item=item_ed.getText().toString();
                number=number_id.getText().toString();
                dummyInsert();

            }
        });
    }

    private void dummyInsert() {
        SaleDetails details = new SaleDetails();

        details.setItem(item);
        details.setNumber(number);

        long l = RoomApplication.getInstance().getDb().saleDao().insertContact(details);


        Toast.makeText(this, "" + l, Toast.LENGTH_SHORT).show();


    }
}
