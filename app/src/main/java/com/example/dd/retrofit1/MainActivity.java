package com.example.dd.retrofit1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager layoutManager;
    List<User> userList =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("123", "onCreate");
        getUserList();
    }
    private void getUserList() {
        Log.d("123", "getUserList");
        try {
            String url = "http://shaoniiuc.com/";
            Log.d("123", "http://shaoniiuc.com/");

            Retrofit retrofit = null;
            Log.d("123", "retrofit");

            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(url)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                Log.d("123", "build();");
            }


            APIService service = retrofit.create(APIService.class);
            Log.d("123", " APIService service = retrofit.create(APIService.class);");


            Call<List<User>> call = service.getUserData();
            Log.d("123", "Call<List<User>> call = service.getUserData();");

            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                    //Log.d("onResponse", response.message());
                    Log.d("123", "onResponse");

                    userList = response.body();
                    Log.d("123", "List<User> userList = response.body();");

                    RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler);
                    Log.d("123", "RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler);");

                    layoutManager = new LinearLayoutManager(MainActivity.this);
                    Log.d("123", "layoutManager = new LinearLayoutManager(MainActivity.this);");
                    recyclerView.setLayoutManager(layoutManager);
                    Log.d("123", "recyclerView.setLayoutManager(layoutManager);");

                    RecyclerViewAdapter recyclerViewAdapter =new RecyclerViewAdapter(getApplicationContext(), userList);
                    Log.d("123", "RecyclerViewAdapter recyclerViewAdapter =new RecyclerViewAdapter(getApplicationContext(), userList);");
                    recyclerView.setAdapter(recyclerViewAdapter);
                    Log.d("123", "recyclerView.setAdapter(recyclerViewAdapter);");
                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {
                    Log.d("123", t.getMessage());
                }
            });
        }catch (Exception e) {Log.d("123", "Exception");}
    }
}
