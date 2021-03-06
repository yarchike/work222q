package com.example.work222q;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.action_open_notes:
                Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);
                return true;
            case R.id.action_bank:
                Intent intentBank = new Intent(MainActivity.this, BankActivity.class);
                startActivity(intentBank);
                return true;
            case R.id.action_city:
                Intent intentCity = new Intent(MainActivity.this, CityActivity.class);
                startActivity(intentCity);
                return true;
            case R.id.action_calendar:
                Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intentCalendar);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}
