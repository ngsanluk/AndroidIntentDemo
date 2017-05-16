package hk.com.sunnyng.androidintentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle bundle = getIntent().getExtras();
        double amount = bundle.getDouble("amount");
        double result = amount * 0.8;
        TextView resultTV = (TextView) findViewById(R.id.result);
        resultTV.setText(
                "HKD" + amount
                + " = "
                + "CNY" + result
        );

    }


    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
