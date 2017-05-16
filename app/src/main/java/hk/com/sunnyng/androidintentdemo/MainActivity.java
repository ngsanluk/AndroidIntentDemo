package hk.com.sunnyng.androidintentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void doExchange(View v) {
        EditText amountText = (EditText) findViewById(R.id.amount);
        double amount = Double.parseDouble(amountText.getText().toString());


        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("amount", amount);

//        String url = "http://www.xe.com/currencyconverter/convert/?From=HKD&To=CNY&Amount=" + amountText.getText().toString();
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        startActivity(intent);
    }

}
