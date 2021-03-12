package com.example.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TableLayout table;
    private ArrayList<TableRow> tableRowList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableRowList = new ArrayList<>();
        table = findViewById(R.id.table_layout);
    }

    public void addRow(View view) {
        TableRow tableRow;
        tableRow = new TableRow(this);

        TextView text = new TextView(this);
        text.setText("new text view 1 | " + tableRowList.size());
        tableRow.addView(text, 0);

        TextView text2 = new TextView(this);
        text.setText("new text view 2 | " + tableRowList.size());
        tableRow.addView(text, 1);

        table.addView(tableRow);

        tableRowList.add(tableRow);

    }

    public void removeRow(View view) {
        TableRow row = tableRowList.remove(tableRowList.size() -1);

        table.removeView(row);
    }
}