package kr.hs.emirim.s2019w37.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class javaMainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    CheckBox check1;
    CheckBox check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1.findViewById(R.id.toastButton);
        button1.setOnClickListener(this);
        check1.findViewById(R.id.checkbox1);
        check1.setOnClickListener(this);
        check2.findViewById(R.id.checkbox2);
        check2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        //TODO : 클릭되면 할 일
        switch (view.getId()){
            case R.id.toastButton:
                Toast.makeText(this, "나 클릭되었어요", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkbox1:
            case R.id.checkbox2:
                CheckBox check = (CheckBox) view;
                Toast.makeText(this, "내가 좋아하는 것은 " + check.getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
