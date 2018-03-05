package ru.suleymanovtat.listtitleapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = findViewById(R.id.list);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<Сontact> сontacts = new ArrayList<>();

        сontacts.add(new Сontact("А", "", "А", true));
        сontacts.add(new Сontact("Алмас", "+7(111)111-11-11", "", false));
        сontacts.add(new Сontact("Алсу", "+7(222)222-22-22", "", false));
        сontacts.add(new Сontact("Айрат", "+7(333)333-33-33", "", false));
        сontacts.add(new Сontact("Айдар", "+7(555)555-55-55", "", false));
        сontacts.add(new Сontact("Айзат", "+7(000)000-00-00", "", false));

        сontacts.add(new Сontact("И", "", "И", true));
        сontacts.add(new Сontact("Ильмир", "+7(777)777-77-77", "", false));
        сontacts.add(new Сontact("Ильдар", "+7(888)888-88-88", "", false));
        сontacts.add(new Сontact("Ильнур", "+7(666)666-66-66", "", false));
        сontacts.add(new Сontact("Ильсур", "+7(555)555-55-55", "", false));
        сontacts.add(new Сontact("Ильнар", "+7(444)444-44-44", "", false));

        сontacts.add(new Сontact("Р", "", "Р", true));
        сontacts.add(new Сontact("Рамиль", "+7(777)777-77-77", "", false));
        сontacts.add(new Сontact("Раил", "+7(888)888-88-88", "", false));
        сontacts.add(new Сontact("Рамир", "+7(666)666-66-66", "", false));
        сontacts.add(new Сontact("Руслан", "+7(555)555-55-55", "", false));
        сontacts.add(new Сontact("Рамис", "+7(444)444-44-44", "", false));
        HeaderAdapter mAdapter = new HeaderAdapter(сontacts);
        mRecyclerView.setAdapter(mAdapter);
    }
}
