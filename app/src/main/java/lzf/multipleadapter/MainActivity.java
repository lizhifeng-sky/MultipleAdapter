package lzf.multipleadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import lzf.multipleadapter.type.OneType;
import lzf.multipleadapter.type.ThreeType;
import lzf.multipleadapter.type.TwoType;
import lzf.multipleadapter.type.TypeInterface;


public class MainActivity extends AppCompatActivity {
    private List<TypeInterface> models;
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initData();
        adapter = new MyAdapter(models, this);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        models = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            models.add(new OneType("1" + "      " + i));
        }
        for (int j = 0; j < 30; j++) {
            models.add(new TwoType("2" + "      " + j));
        }
        for (int k = 0; k < 10; k++) {
            models.add(new ThreeType("3" + "      " + k));
        }
    }
}
