package kr.co.company.rotateimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableImageSourceView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        Button button1 = (Button) findViewById(R.id.button1);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);

        button1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               int degree = Integer.parseInt(editText1.getText().toString());
               imageView1.setRotation(degree);
           }
        });
    }
}