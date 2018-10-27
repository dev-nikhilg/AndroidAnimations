package guptanikhil.com.androidanimations.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import guptanikhil.com.androidanimations.Adapters.MainActivityAdapter;
import guptanikhil.com.androidanimations.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainActivityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();
    }

    private void initLayout() {
        recyclerView = findViewById(R.id.recyclerView);

    }

    public enum AnimationTypesEnum {

    }
}
