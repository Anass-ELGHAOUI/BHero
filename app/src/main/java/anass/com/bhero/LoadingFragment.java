package anass.com.bhero;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;

import static butterknife.ButterKnife.bind;
import static butterknife.ButterKnife.unbind;

public class LoadingFragment extends Fragment {


    MainActivity activity;

    public static LoadingFragment newInstance() {
        LoadingFragment fragment = new LoadingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.loading_fragment, container, false);
        bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("loading fragment", "lunched");
        activity = (MainActivity) getActivity();
        init();
    }

    public void init() {

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
