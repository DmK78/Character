package com.android.dmk78.character;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView textView;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        linearLayout=findViewById(R.id.linearLayout);

        spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors_array, R.layout.support_simple_spinner_dropdown_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);


    }

    public void showCharacter(View view) {

        String text = spinner.getSelectedItem().toString();
        switch (text){
            case "Красный": textView.setText(R.string.red);
                linearLayout.setBackgroundColor(Color.parseColor("#FF0000"));

            break;
            case "Оранжевый": textView.setText(R.string.orange);
                linearLayout.setBackgroundColor(Color.parseColor("#FF6600"));
                break;
            case "Желтый": textView.setText(R.string.yellow);
                linearLayout.setBackgroundColor(Color.parseColor("#FFFF00"));
                break;
            case "Зеленый": textView.setText(R.string.green);
                linearLayout.setBackgroundColor(Color.parseColor("#009900"));
                break;
            case "Голубой": textView.setText(R.string.cyan);
                linearLayout.setBackgroundColor(Color.parseColor("#33FFFF"));
                break;
            case "Синий": textView.setText(R.string.blue);
                linearLayout.setBackgroundColor(Color.parseColor("#0000CC"));
                break;
            case "Фиолетовый": textView.setText(R.string.violet);
                linearLayout.setBackgroundColor(Color.parseColor("#993399"));
                break;

            default:break;



        }


    }
}
