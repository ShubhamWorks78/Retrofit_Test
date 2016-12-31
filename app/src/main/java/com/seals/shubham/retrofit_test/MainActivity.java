package com.seals.shubham.retrofit_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.POST;

public class MainActivity extends AppCompatActivity {
    EditText User;
    EditText Pass;
    Button btn;
    public static final String base_url = "http://shubh.noads.biz/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User = (EditText)findViewById(R.id.editUser);
        Pass = (EditText)findViewById(R.id.editPass);
        btn = (Button)findViewById(R.id.btnReg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insertUser();
            }
        });
    }
    public void insertUser(){
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(base_url).build();
        ApiInterface apiIn = adapter.create(ApiInterface.class);
        apiIn.insertUser(
                User.getText().toString(),
                Pass.getText().toString(),
                new Callback<Response>() {
                    @Override
                    public void success(Response response, Response response2) {

                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
