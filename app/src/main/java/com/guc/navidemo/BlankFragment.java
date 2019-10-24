package com.guc.navidemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

/**
 * Created by guc on 2019/10/23.
 * 描述：
 */
public class BlankFragment extends Fragment {
    private Button mBtnNext;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank,container,false);
        mBtnNext = view.findViewById(R.id.next_btn);
        mBtnNext.setOnClickListener((v)->{
            NavDirections navDirections = new NavDirections() {
                @Override
                public int getActionId() {
                    return R.id.action_blankFragment_to_secondFragment;
                }

                @NonNull
                @Override
                public Bundle getArguments() {
                    return null;
                }
            };
            Navigation.findNavController(v).navigate(navDirections);
        });
        return view;
    }
}
