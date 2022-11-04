package com.cursoandroid.ph.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cursoandroid.ph.fragments.R;
import com.cursoandroid.ph.fragments.fragment.ChatFragment;
import com.cursoandroid.ph.fragments.fragment.ContactsFragment;

public class MainActivity extends AppCompatActivity {
    private Button buttonChat, buttonContacts;
    private Fragment fragmentChat, fragmentContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);
        fragmentChat = new ChatFragment();
        fragmentContacts = new ContactsFragment();
        buttonChat = findViewById(R.id.buttonChat);
        buttonContacts = findViewById(R.id.buttonContacts);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameFragments, fragmentChat);
        transaction.commit();

        buttonChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameFragments, fragmentChat);
                transaction.commit();
            }
        });

        buttonContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameFragments, fragmentContacts);
                transaction.commit();
            }
        });
    }
}