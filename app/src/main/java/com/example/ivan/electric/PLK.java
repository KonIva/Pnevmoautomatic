package com.example.ivan.electric;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class PLK extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewRoot= inflater.inflate(R.layout.plk, container, false);
        WebView webrelay=(WebView)viewRoot.findViewById(R.id.webrelay);
        webrelay.loadUrl("file:///android_asset/relay.html");
        return viewRoot;
    }
}
