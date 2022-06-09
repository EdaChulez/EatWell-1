package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView arabiata1, cookies1, blackburger1, chickenburger1;
    private ImageView suffle1, roastsalad1, bolognese1, margherita1;
    private ImageView bigkingburger1, bbqchichkenburger1, cocacola1, tiramisu1;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        //arabiata1 = (ImageView) findViewById(R.id.arabiata1);
        cookies1 = (ImageView) findViewById(R.id.cookies1);
        blackburger1 = (ImageView) findViewById(R.id.blackburger1);
        chickenburger1 = (ImageView) findViewById(R.id.chickenburger1);

        //suffle1 = (ImageView) findViewById(R.id.arabiata1);
        roastsalad1 = (ImageView) findViewById(R.id.roastsalad1);
        bolognese1 = (ImageView) findViewById(R.id.bolognese1);
        margherita1 = (ImageView) findViewById(R.id.margherita1);

        bigkingburger1 = (ImageView) findViewById(R.id.bigkingburger1);
        bbqchichkenburger1 = (ImageView) findViewById(R.id.bbqchichkenburger1);
        cocacola1 = (ImageView) findViewById(R.id.cocacola1);
        tiramisu1 = (ImageView) findViewById(R.id.tiramisu1);


        arabiata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "arabiata1");
                startActivity(intent);
            }
        });
        cookies1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "cookies");
                startActivity(intent);
            }
        });


        blackburger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "blackburger");
                startActivity(intent);
            }
        });


        chickenburger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "chickenburger");
                startActivity(intent);
            }
        });


        suffle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "suffle");
                startActivity(intent);
            }
        });


        roastsalad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "roastsalad");
                startActivity(intent);
            }
        });



        bolognese1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "bolognese");
                startActivity(intent);
            }
        });


        margherita1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "margherita");
                startActivity(intent);
            }
        });



        bigkingburger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "bigkingburger");
                startActivity(intent);
            }
        });


        bbqchichkenburger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "bbqchichkenburger");
                startActivity(intent);
            }
        });


        cocacola1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Coca Cola");
                startActivity(intent);
            }
        });


        tiramisu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Tiramisu");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);

    }
}