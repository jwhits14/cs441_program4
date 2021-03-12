package com.example.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TableLayout table;
    private ArrayList<TableRow> tableRowList;
    EditText user_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableRowList = new ArrayList<>();
        table = (TableLayout) findViewById(R.id.table_layout);
        user_input = findViewById(R.id.item_input);
    }

    public void addRow(View view) {
        TableRow tableRow;
        tableRow = new TableRow(this);

        TextView text = new TextView(this);
        text.setText(user_input.getText());
        tableRow.addView(text, 0);

        CheckBox check = new CheckBox(this);
        tableRow.addView(check, 1);

        Button button = new Button(this);
        button.setText("Remove");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.removeView(tableRow);
                tableRowList.remove(tableRow);
            }
        });
        tableRow.addView(button, 2);

        table.addView(tableRow);

        tableRowList.add(tableRow);

    }
}