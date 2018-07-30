package by.sfsas.music.features.test;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.ViewHolder > {
    //private ArrayList<Playlist> mPlaylsits;


    public PlaylistAdapter(){

    }

    @NonNull
    @Override
    public ViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_track, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder  holder, int position) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(8));

        Glide.with(holder.mImageView.getContext())
                .load(R.drawable.i3)
                .apply(requestOptions)
                .into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    static  class ViewHolder  extends  RecyclerView.ViewHolder{
        ImageView mImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image);
        }
    }
}
