package com.anakinfoxe.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate action bar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        // instantiate all the buttons
        Button btnSpotifyStreamer = (Button) findViewById(R.id.btn_spotify_streamer);
        btnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast toast = Toast.makeText(context,
                        "This button will launch my Spotify Streamer app!", duration);
                toast.show();
            }
        });

        Button btnScoresApp = (Button) findViewById(R.id.btn_scores_app);
        btnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context,
                        "This button will launch my Football Scores app!", duration);
                toast.show();
            }
        });

        Button btnLibraryApp = (Button) findViewById(R.id.btn_library_app);
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context,
                        "This button will launch my Library app!", duration);
                toast.show();
            }
        });

        Button btnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context,
                        "This button will launch my Build It Bigger app!", duration);
                toast.show();
            }
        });

        Button btnXyzReader = (Button) findViewById(R.id.btn_xyz_reader);
        btnXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context,
                        "This button will launch my XYZ Reader app!", duration);
                toast.show();
            }
        });

        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context,
                        "This button will launch my Capstone app!", duration);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
