package jeemaincutoffbyamit.example.jeemaincutoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private Button button,button2;
    String csab_quota = "",csab_caste="";



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
                    intent.putExtra("CASTE",csab_caste);
                    intent.putExtra("CATEGORY",csab_quota);
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
                    intent.putExtra("CASTE",csab_caste);
                    intent.putExtra("CATEGORY",csab_quota);
                    startActivity(intent);
                }

            }
        });


    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio__csab_ai:
                if (checked)
                    csab_quota = "AI";
                    break;
            case R.id.radio__csab_os:
                if (checked)
                    csab_quota = "OS";
                    break;
            case R.id.radio__csab_hs:
                if (checked)
                    csab_quota = "HS";
                    break;
        }
    }



    public void onRadioButton_Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio__csab_gen:
                if (checked)
                    csab_caste = "OPEN";
                break;
            case R.id.radio__csab_ews:
                if (checked)
                    csab_caste = "EWS";
                break;
            case R.id.radio__csab_obc:
                if (checked)
                    csab_caste = "OBC-NCL";
                break;
            case R.id.radio__csab_sc:
                if (checked)
                    csab_caste = "SC";
                break;
            case R.id.radio__csab_st:
                if (checked)
                    csab_caste = "ST";
                break;
        }
    }


}