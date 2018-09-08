package iics.hipe.ariannelarissa.mylayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HipeArianneLarissaLab1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button consButt = (Button) findViewById(R.id.constraintButton);
        Button linButt = (Button) findViewById(R.id.linearButton);
        Button relButt = (Button) findViewById(R.id.relativeButton);
        consButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent even = new Intent(HipeArianneLarissaLab1.this, HOME.class);
                startActivity(even);
            }

        });

        linButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent even = new Intent(HipeArianneLarissaLab1.this, HOME.class);
                startActivity(even);
            }
        });
    }
}
