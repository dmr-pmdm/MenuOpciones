package com.example.menuopciones;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                Toast.makeText(MainActivity.this, "Has elegido la estrella", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(MainActivity.this,"Has elegido la "+item.getTitle().toString().toLowerCase(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(MainActivity.this, "Has elegido la opción 3", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
