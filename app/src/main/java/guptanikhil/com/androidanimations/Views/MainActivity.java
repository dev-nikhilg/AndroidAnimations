package guptanikhil.com.androidanimations.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import guptanikhil.com.androidanimations.Adapters.MainActivityAdapter;
import guptanikhil.com.androidanimations.R;

public class MainActivity extends AppCompatActivity implements MainActivityAdapter.RecyclerViewClickListener {

    private RecyclerView recyclerView;
    private MainActivityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();
    }

    private void initLayout() {
        // initialise recycler view
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        ));

        // initialise and set adapter
        adapter = new MainActivityAdapter(getAnimationTypesList(), this);
        recyclerView.setAdapter(adapter);


    }

    private List<AnimationTypesEnum> getAnimationTypesList() {
        return Arrays.asList(AnimationTypesEnum.values());
    }

    @Override
    public void recyclerViewItemClicked(AnimationTypesEnum animationType) {
        switch (animationType) {
            case ANIMATION_DRAWABLE:
                Intent intent = new Intent(this, AnimatedDrawableActivity.class);
                startActivity(intent);
        }
    }

    public enum AnimationTypesEnum {
        ANIMATION_DRAWABLE;

        public String getStringDescription() {
            switch (this) {
                case ANIMATION_DRAWABLE:
                    return "Animation Drawable";
            }
            return "";
        }
    }
}
