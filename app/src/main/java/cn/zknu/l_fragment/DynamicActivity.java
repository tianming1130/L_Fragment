package cn.zknu.l_fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import cn.zknu.l_fragment.fragment.OneFragment;
import cn.zknu.l_fragment.fragment.ThreeFragment;
import cn.zknu.l_fragment.fragment.TwoFragment;

public class DynamicActivity extends AppCompatActivity implements View.OnClickListener,CallBackValue{

    private Button btnOne,btnTwo,btnThree;
    private FrameLayout mContainer;
    private FragmentManager mFragmentManager;
    private Fragment mFragment1, mFragment2,mFragment3;
    private TextView tvShowMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
        btnOne=(Button)findViewById(R.id.btn_one);
        btnTwo=(Button)findViewById(R.id.btn_two);
        btnThree=(Button)findViewById(R.id.btn_three);
        tvShowMsg=(TextView)findViewById(R.id.tv_show_msg);
        mContainer =(FrameLayout)findViewById(R.id.container);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);

        mFragmentManager =getSupportFragmentManager();
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft= mFragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.btn_one:
                if (mFragment1 ==null){
                    mFragment1 =new OneFragment();
                }
                ft.replace(R.id.container, mFragment1);
                break;
            case R.id.btn_two:
                if (mFragment2 ==null){
                    mFragment2 =new TwoFragment();
                }
                ft.replace(R.id.container, mFragment2);
                break;
            case R.id.btn_three:
                if (mFragment3==null){
                    mFragment3=new ThreeFragment();
                    Bundle bundle=new Bundle();
                    bundle.putString("key","Activity　to Fragment");
                    mFragment3.setArguments(bundle);
                }
                ft.replace(R.id.container, mFragment3);
                break;
        }
        ft.commit();
    }

    @Override
    public void sendMessageValue(String strValue) {
        tvShowMsg.setText(strValue);
    }
}
