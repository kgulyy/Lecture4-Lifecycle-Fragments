package ru.mail.park.lecture4.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import ru.mail.park.lecture4.R;
import ru.mail.park.lecture4.fragment.TaskGreenFragment;
import ru.mail.park.lecture4.fragment.TaskRedFragment;

public class TaskActivity extends AppCompatActivity implements Switcher {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        onSecondClick();
    }

    @Override
    public void onFirstClick() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new TaskRedFragment());
        transaction.commit();
    }

    @Override
    public void onSecondClick() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new TaskGreenFragment());
        transaction.commit();
    }
}

