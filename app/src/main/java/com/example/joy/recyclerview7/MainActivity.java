package com.example.joy.recyclerview7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   private List<MobileModel> list=new ArrayList();
   private RecyclerView recyclerView;
   private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---initialize-----------
        recyclerView=findViewById(R.id.recyclerView);

        adapter=new CustomAdapter(list,MainActivity.this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        //----adding data to list----------------------
        list.add(new MobileModel("Apple","Apple Inc. is an American multinational technology company headquartered in Cupertino, California that designs, develops, and sells consumer electronics, computer software, and online services. The company's hardware products include the iPhone smartphone, the iPad tablet computer, the Mac personal computer",R.drawable.apple_topic));
        list.add(new MobileModel("Samsung","Samsung Group is a South Korean multinational conglomerate headquartered in Samsung Town, Seoul. It comprises numerous affiliated businesses, most of them united under the Samsung brand, and is the largest South Korean chaebol (business conglomerate). Samsung was founded by Lee Byung-chul in 1938",R.drawable.sam));
        list.add(new MobileModel("HTC","HTC Corporation is a Taiwanese consumer electronics company headquartered in Xindian District, New Taipei City, Taiwan. Founded in 1997",R.drawable.htc));
        list.add(new MobileModel("MI","7 years of innovation. Mi 6 demonstrates our constant refinement of design and the pushing of materials technology boundaries.",R.drawable.mi));
        list.add(new MobileModel("Sony","Gateway to Sony Products and Services, Games, Music, Movies, Financial Services and Sony Websites Worldwide, and Group Information, Corporate Information, Investor Relations, Corporate Social Responsibility, Career, Design, Brand, and more",R.drawable.sony));
        list.add(new MobileModel("OPPO","OPPO is a global electronics and technology service provider that delivers the latest and most exquisite mobile electronic devices in over 20 countries.",R.drawable.oppo));
        list.add(new MobileModel("Huawei","Huawei is a leading global information and communications technology (ICT) solutions provider. Driven by a commitment to sound operations, ongoing innovation, and open collaboration",R.drawable.huawe));


        adapter.notifyDataSetChanged();


    }
}
