package ru.mail.park.lecture4.fragment;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import ru.mail.park.lecture4.R;
import ru.mail.park.lecture4.activity.Switcher;

public class TaskRedFragment extends BaseFragment {
    private Switcher switcher;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        switcher = (Switcher) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = new LinearLayout(getContext());
        layout.setBackgroundColor(Color.RED);

        Button button = new Button(getContext());
        button.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.BOTTOM)
        );
        button.setText(R.string.btn_switch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switcher.onSecondClick();
            }
        });
        layout.addView(button);

        return layout;
    }
}
