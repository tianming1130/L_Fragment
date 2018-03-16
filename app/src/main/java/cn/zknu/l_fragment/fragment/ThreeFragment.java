package cn.zknu.l_fragment.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cn.zknu.l_fragment.CallBackValue;
import cn.zknu.l_fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThreeFragment extends Fragment {

    private TextView tvShowMsg;
    private Button button;
    private static final String TAG="ThreeFragment";
    private CallBackValue mCallBackValue;
    public ThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(TAG,"onCreateView");
        View v=inflater.inflate(R.layout.fragment_three, container, false);
        tvShowMsg=(TextView) v.findViewById(R.id.tv_show_msg);
        button=(Button)v.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (mCallBackValue!=null){
//                    mCallBackValue.sendMessageValue("Fragment to Activity!");
//                }
                ((CallBackValue)getActivity()).sendMessageValue("aa");
            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"onAttach");
        mCallBackValue=(CallBackValue)context;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"onActivityCreated");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
        Bundle bundle=getArguments();
        tvShowMsg.setText(bundle.getString("key"));
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"onDetach");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,"onDestroyView");
    }
}
