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
import com.rehash.utility.screens.sublist.loginScreens.LoginInBoxScreen;
import com.rehash.utility.screens.sublist.loginScreens.SimpleLoginScreen;
import com.rehash.utility.screens.sublist.registerScreens.SimpleRegisterActivity;
import com.rehash.utility.user.RegisterScreenUser;

import java.util.ArrayList;

public class RegisterScreenAdapter extends RecyclerView.Adapter<RegisterScreenAdapter.myholder> {

    Context context;
    ArrayList<RegisterScreenUser> screensArray;

    public RegisterScreenAdapter(Context context, ArrayList<RegisterScreenUser> screensArray) {
        this.context = context;
        this.screensArray = screensArray;
    }

    @NonNull
    @Override
    public RegisterScreenAdapter.myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adater_login_screen, parent, false);
        RegisterScreenAdapter.myholder holder = new RegisterScreenAdapter.myholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RegisterScreenAdapter.myholder holder, final int position) {
        final RegisterScreenUser user = screensArray.get(position);

        holder.loginScreenTitle.setText(user.getTitle());
        holder.loginScreenDesc.setText(user.getDesc());
        holder.ivForScreens.setImageResource(user.getImage());
        holder.ivForScreens.setBackgroundColor(Color.parseColor("#CCF195"));
        holder.root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){

                    Intent intent = new Intent(context, SimpleRegisterActivity.class);
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
        TextView loginScreenTitle;
        TextView loginScreenDesc;
        ImageView ivForScreens;
        View root;

        public myholder(@NonNull View itemView) {
            super(itemView);

            ivForScreens = itemView.findViewById(R.id.iv_for_screens);
            loginScreenTitle = itemView.findViewById(R.id.tv_for_title);
            loginScreenDesc = itemView.findViewById(R.id.tv_for_desc);
            root = itemView.findViewById(R.id.root);
        }
    }
}
