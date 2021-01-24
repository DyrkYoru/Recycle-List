 package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

 public class MainActivity extends AppCompatActivity {

//    ListView listView;
//    String[] models = {"Apple", "Asus", "Acer", "Dell", "HP", "Huawei", "Lenovo", "MSI", "Samsung", "Sony"};
//    String[] description = {
//            "American multinational technology Company",
//            "Taiwanese multinational computer, phone hardware and electronics Company",
//            "Taiwanese multinational hardware and electronics Company",
//            "American multinational computer technology Company",
//            "American multinational information technology Company",
//            "Chinese multinational technology Company",
//            "Chinese multinational technology Company",
//            "Taiwanese multinational information technology Company",
//            "South Korean multinational technology Company",
//            "Japanese multinational technology Company"
//    };
//    int[] images = {R.drawable.apple, R.drawable.acer, R.drawable.asus, R.drawable.dell, R.drawable.hp,
//    R.drawable.huawei, R.drawable.lenovo, R.drawable.msi, R.drawable.samsung, R.drawable.sony};
//    ArrayList<Model> arrayList = new ArrayList<>();
//    ListViewAdapter modelAdapter;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Action Bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Laptop Brands");

         Model[] myListData = new Model[] {
                 new Model("Apple", "American multinational technology Company", R.drawable.apple),
                 new Model("Asus", "Taiwanese multinational computer, phone hardware and electronics Company",R.drawable.asus),
                 new Model("Acer","Taiwanese multinational hardware and electronics Company", R.drawable.acer),
                 new Model("Dell", "American multinational computer technology Company", R.drawable.dell),
                 new Model("HP", "American multinational information technology Company", R.drawable.hp),
                 new Model("Huawei", "Chinese multinational technology Company", R.drawable.huawei),
                 new Model("Lenovo", "Chinese multinational technology Company", R.drawable.lenovo),
                 new Model("MSI", "Taiwanese multinational information technology Company", R.drawable.msi),
                 new Model("Samsung", "South Korean multinational technology Company", R.drawable.samsung),
                 new Model("Sony", "Japanese multinational technology Company", R.drawable.sony),
         };

         RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);
         ListViewAdapter adapter = new ListViewAdapter(Arrays.asList(myListData));
         recyclerView.setHasFixedSize(true);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         recyclerView.setAdapter(adapter);
     }

//     listView = findViewById(R.id.listview);
//        for (int i =0; i < models.length; i++){
//            Model model = new Model(models[i], description[i], images[i]);
//            //bind all strings in an array
//            arrayList.add(model);
//        }


//         //pass results to listViewAdapter class
//         modelAdapter = new ListViewAdapter(this, arrayList);
//
//         //bind the adapter to the List View
//         listView.setAdapter(modelAdapter);
 }