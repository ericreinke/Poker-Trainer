package eric.example.com.pokertrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button handRankBtn= (Button)findViewById(R.id.handRankBtn);
        handRankBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent handRankIntent = new Intent(getApplicationContext(),ThirdActivity.class);

                startActivity(handRankIntent);
            }
        });

        final Button startingHandsBtn = (Button)findViewById(R.id.startingHandsBtn);
        startingHandsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startingHandsIntent = new Intent(getApplicationContext(),ThirdActivity.class);

                startActivity(startingHandsIntent);
            }
        });

        final Button positioningBtn = (Button)findViewById(R.id.positioningBtn);
        positioningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent positioningIntent = new Intent(getApplicationContext(),ThirdActivity.class);

                startActivity(positioningIntent);
            }
        });

    }
}
