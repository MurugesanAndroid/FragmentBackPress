package mis.tvscs.com.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentSecond extends BaseFragment implements View.OnClickListener{

    private OnActivityBackPressedListener mCallBackListener;

    private Context mContext;

    Button FragmentSecond;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();
        mCallBackListener = (OnActivityBackPressedListener) (mContext);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_second, container, false);

        FragmentSecond=view.findViewById(R.id.FragmentSecond);
        FragmentSecond.setOnClickListener(this);


        mCallBackListener.setActionBarTitle("");
        return view;
    }

    public OnActivityBackPressedListener getmCallBackListener() {
        return mCallBackListener;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.FragmentSecond:

                addFragment(new FragmentThird(),true,"FragmentThird");

                break;
        }
    }
}
