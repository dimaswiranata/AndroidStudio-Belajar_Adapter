package myadapterfg.wiranata.com;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<Response> data = new ArrayList<>();

    public MainAdapter(List<Response> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bindDataToView(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivBadge;
        private TextView tvTeamName;
        private TextView tvTeamKey;
        private TextView tvPlayer;
        private TextView tvCoach;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            ivBadge = itemView.findViewById(R.id.team_batch);
            tvCoach = itemView.findViewById(R.id.pelatih);
            tvPlayer = itemView.findViewById(R.id.pemain);
            tvTeamName = itemView.findViewById(R.id.team_name);
            tvTeamKey = itemView.findViewById(R.id.team_key);
        }

        public void bindDataToView(Response team){
            team.setCoachNum(1);
            team.setPlayerNum(20);
            Glide.with(itemView.getContext()).load(team.getTeamBadge()).into(ivBadge);
            tvTeamName.setText(team.getTeamName());
            tvTeamKey.setText(team.getTeamKey());
            tvCoach.setText(String.valueOf(team.getCoachNum()));
            tvPlayer.setText(String.valueOf(team.getPlayerNum()));
        }
    }
}
