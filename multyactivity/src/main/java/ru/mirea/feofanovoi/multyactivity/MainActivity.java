package ru.mirea.feofanovoi.multyactivity;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< Updated upstream
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
=======
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
>>>>>>> Stashed changes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
<<<<<<< Updated upstream
    textView = findViewById(R.id.textView);
    String inputText = getIntent().getStringExtra("inputText");
        textView.setText(inputText);

    public void onClickActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
=======

>>>>>>> Stashed changes
}