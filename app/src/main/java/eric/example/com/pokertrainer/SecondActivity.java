package eric.example.com.pokertrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView firstHandTextView = (TextView)findViewById(R.id.firstHandTextView);
        TextView secondHandTextView= (TextView)findViewById(R.id.secondHandTextView);

        int[] deck =new int[52];
        String[] suits= {"C","S","D", "H"};
        String[] ranks= {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};

        //Initialize Deck (in order)
        for (int i=0; i<deck.length; i++){
            deck[i]=i;
        }

        //Randomize Cards
        for(int i=0; i<deck.length; i++){
            int index = (int)(Math.random() * deck.length);
            int temp=deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
        }
        String firstHandString =   (ranks[deck[0]%13]+suits[deck[0]/13]+" "+
                                    ranks[deck[1]%13]+suits[deck[1]/13]+" "+
                                    ranks[deck[2]%13]+suits[deck[2]/13]+" "+
                                    ranks[deck[3]%13]+suits[deck[3]/13]+" "+
                                    ranks[deck[4]%13]+suits[deck[4]/13]+" ");
        String secondHandString =   (ranks[deck[5]%13]+suits[deck[5]/13]+" "+
                                    ranks[deck[6]%13]+suits[deck[6]/13]+" "+
                                    ranks[deck[7]%13]+suits[deck[7]/13]+" "+
                                    ranks[deck[8]%13]+suits[deck[8]/13]+" "+
                                    ranks[deck[9]%13]+suits[deck[9]/13]+" ");

        firstHandTextView.setText(firstHandString);
        secondHandTextView.setText(secondHandString);


    }
}
