package co.mobiwise.collapsingtoolbarexample;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.collapsingToolbarLayout)
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initializeViewsAdapter();
        loadData();
    }

    /**
     * Initializes views and adapter
     */
    private void initializeViewsAdapter(){

        setSupportActionBar(toolbar);
        collapsingToolbarLayout.setTitle("My RadioList");

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        adapter = new RecyclerViewAdapter(getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    /**
     * load mock data to adapter
     */
    private void loadData(){
        Radio radio = new Radio("Joy Radio FM", R.drawable.temp, "102.5");
        List<Radio> radioList = new ArrayList<>();

        for (int i = 0 ; i < 20 ; i++)
            radioList.add(radio);

        adapter.setRadioList(radioList);
    }
}
