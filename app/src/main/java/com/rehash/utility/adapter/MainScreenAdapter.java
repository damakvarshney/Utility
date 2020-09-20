package com.rehash.utility.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rehash.utility.R;
import com.rehash.utility.screens.LoginScreens;
import com.rehash.utility.screens.MainScreen;
import com.rehash.utility.screens.RegisterScreen;
import com.rehash.utility.user.MainScreenUser;

import java.util.ArrayList;

public class MainScreenAdapter extends RecyclerView.Adapter<MainScreenAdapter.myholder> {

    Context context;
    ArrayList<MainScreenUser> screensArray;

    public MainScreenAdapter(Context context, ArrayList<MainScreenUser> screensArray) {
        this.context = context;
        this.screensArray = screensArray;
    }

    @NonNull
    @Override
    public MainScreenAdapter.myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_main_screen, parent, false);
        myholder holder = new myholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainScreenAdapter.myholder holder, final int position) {
       final MainScreenUser user = screensArray.get(position);

        holder.tvScreenNames.setText(user.getScreenName());
        holder.ivForScreens.setImageResource(user.getImage());
        holder.ivForScreens.setBackgroundColor(Color.parseColor("#1e90ff"));
        holder.root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){

                    Intent intent = new Intent(context, LoginScreens.class);
                    context.startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(context, RegisterScreen.class);
                    context.startActivity(intent);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return screensArray.size();
    }

    public class myholder extends RecyclerView.ViewHolder {
        TextView tvScreenNames;
        ImageView ivForScreens;
        View root;

        public myholder(@NonNull View itemView) {
            super(itemView);

            ivForScreens = itemView.findViewById(R.id.iv_for_screens);
            tvScreenNames = itemView.findViewById(R.id.tv_screen_name);
            root = itemView.findViewById(R.id.root);
        }
    }
}
