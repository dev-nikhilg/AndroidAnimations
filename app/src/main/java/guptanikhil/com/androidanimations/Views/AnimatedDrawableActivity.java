package guptanikhil.com.androidanimations.Views;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import guptanikhil.com.androidanimations.R;

public class AnimatedDrawableActivity extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable smileyAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animated_drawable);

        initLayout();
    }

    private void initLayout() {
        // setup toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.animation_drawable);

        // init image view
        imageView = findViewById(R.id.imageView);

        // set hand animation drawable as background of imageview
        imageView.setBackgroundResource(R.drawable.smiley_face_animation_drawable);

        // get imageview background and cast it to animationDrawable
        smileyAnimationDrawable = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    protected void onStart() {
        super.onStart();
        smileyAnimationDrawable.start();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
