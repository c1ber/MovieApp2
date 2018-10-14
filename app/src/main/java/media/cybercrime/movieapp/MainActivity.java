package media.cybercrime.movieapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //AsyncTask
    public class FetchMovies extends AsyncTask<Void,Void,Void> {


        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }
}
