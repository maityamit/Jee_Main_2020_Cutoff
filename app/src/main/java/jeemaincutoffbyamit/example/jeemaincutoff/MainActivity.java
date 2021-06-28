package jeemaincutoffbyamit.example.jeemaincutoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.csab_input);
        button = findViewById(R.id.csab_button);
        button2 = findViewById(R.id.josaa_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {

                    Toast.makeText(MainActivity.this, "Enter Something", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this,ResultshowActivity.class);
                    intent.putExtra("RANK",string);
                    intent.putExtra("TYPE","CSAB");
                    startActivity(intent);
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {

                    Toast.makeText(MainActivity.this, "Enter Something", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this,ResultshowActivity.class);
                    intent.putExtra("RANK",string);
                    intent.putExtra("TYPE","JOSAA");
                    startActivity(intent);
                }

            }
        });


    }
}