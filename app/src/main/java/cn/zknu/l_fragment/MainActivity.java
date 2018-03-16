package cn.zknu.l_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnStatic,btnDynamic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStatic=(Button)findViewById(R.id.btn_static);
        btnDynamic=(Button)findViewById(R.id.btn_dynamic);

        btnStatic.setOnClickListener(this);
        btnDynamic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_static:
                startActivity(new Intent(this,StaticActivity.class));
                break;
            case R.id.btn_dynamic:
                startActivity(new Intent(this,DynamicActivity.class));
                break;
        }
    }
}
