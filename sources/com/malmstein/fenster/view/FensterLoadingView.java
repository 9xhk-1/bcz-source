package com.malmstein.fenster.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.malmstein.fenster.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class FensterLoadingView extends FrameLayout {
    public FensterLoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void a() {
        setVisibility(8);
    }

    public void b() {
        setVisibility(0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.view_loading, this);
    }

    public FensterLoadingView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
