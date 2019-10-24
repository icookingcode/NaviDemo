package com.guc.navidemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by guc on 2019/10/23.
 * 描述：
 */
public class SecondFragment extends Fragment {
    private Button mBtnNext;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        mBtnNext = view.findViewById(R.id.next_btn);
        mBtnNext.setOnClickListener((v) -> {
            MyDialogFragment dialogFragment = new MyDialogFragment();
            dialogFragment.show(getActivity().getSupportFragmentManager(), "dialog");
        });
        return view;
    }
}
