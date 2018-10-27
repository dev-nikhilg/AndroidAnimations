package guptanikhil.com.androidanimations.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

import guptanikhil.com.androidanimations.R;
import guptanikhil.com.androidanimations.Views.MainActivity;

public class MainActivityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
        implements View.OnClickListener {

    private List<MainActivity.AnimationTypesEnum> list;
    private RecyclerViewClickListener clickListener;

    public MainActivityAdapter(
            List<MainActivity.AnimationTypesEnum> list,
            RecyclerViewClickListener clickListener
    ) {
        this.list = list;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_main_activity_item, viewGroup, false);

        v.setOnClickListener(this);

        MainActivityListViewHolder vh = new MainActivityListViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MainActivityListViewHolder vh = (MainActivityListViewHolder) viewHolder;

        vh.textView.setText(list.get(i).getStringDescription());
        vh.containerView.setTag(i);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public void onClick(View v) {
        int pos = (int) v.getTag();
        clickListener.recyclerViewItemClicked(list.get(pos));
    }

    // ViewHolder class implementation
    private class MainActivityListViewHolder extends RecyclerView.ViewHolder {

        public View containerView;
        public TextView textView;

        public MainActivityListViewHolder(@NonNull View itemView) {
            super(itemView);

            containerView = itemView;
            textView = itemView.findViewById(R.id.textView);
        }
    }

    // click listener interface
    public interface RecyclerViewClickListener {
        void recyclerViewItemClicked(MainActivity.AnimationTypesEnum animationType);
    }
}
