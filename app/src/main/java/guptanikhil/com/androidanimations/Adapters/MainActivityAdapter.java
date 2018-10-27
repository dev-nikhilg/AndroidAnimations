package guptanikhil.com.androidanimations.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import guptanikhil.com.androidanimations.R;
import guptanikhil.com.androidanimations.Views.MainActivity;

public class MainActivityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<MainActivity.AnimationTypesEnum> list;

    public MainActivityAdapter(List<MainActivity.AnimationTypesEnum> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_main_activity_item, viewGroup, false);
        MainActivityListViewHolder vh = new MainActivityListViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MainActivityListViewHolder vh = (MainActivityListViewHolder) viewHolder;

        // TODO - get string description from enum type and display
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    private class MainActivityListViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public MainActivityListViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
        }

        public void setText(String text) {
            textView.setText(text);
        }
    }
}
