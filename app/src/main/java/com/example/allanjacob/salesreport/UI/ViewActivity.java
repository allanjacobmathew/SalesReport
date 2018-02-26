package com.example.allanjacob.salesreport.UI;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.allanjacob.salesreport.DataBase.SaleDetails;
import com.example.allanjacob.salesreport.DataBase.SaleDetailsViewModel;
import com.example.allanjacob.salesreport.R;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity implements Observer<PagedList<SaleDetails>>, TextWatcher{
    private Spinner item_sp;
    private  Spinner number_sp;
    private Button getdata;
    private EditText data_ed;
    PagedList<SaleDetails> saleDetails;
    private SaleDetailsViewModel saleDetailsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        item_sp=findViewById(R.id.item_ap);
        number_sp=findViewById(R.id.number_sp);
        getdata=findViewById(R.id.get_data);
        data_ed=findViewById(R.id.data_ed);


        data_ed.addTextChangedListener((TextWatcher) this);



        saleDetailsViewModel = ViewModelProviders.of(this).get(SaleDetailsViewModel.class);

        saleDetailsViewModel.getAllSale().observeForever(this);







    }

    private void loadSpinnerData() {




    }

    @Override
    public void onChanged(@Nullable PagedList<SaleDetails> saleDetails) {
        Toast.makeText(this, saleDetails.get(0).getItem(), Toast.LENGTH_SHORT).show();



    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
