package com.baicizhan.base;

import android.R;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.baicizhan.client.business.util.UiUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class BaseAppCompatActivity extends LoadingDialogActivity {
    protected boolean mClosedFit = false;
    private boolean mHasSet = false;
    private boolean mCareModeApplied = false;
    protected Handler mHandler = new Handler();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseAppCompatActivity.this.applyCareModeToAllViews();
        }
    }

    public final void H0() {
        if (this.mHasSet) {
            return;
        }
        if (enableImmerseStatusBar()) {
            setupImmerseStatusBar();
        }
        setStatusBarColor();
        this.mHasSet = true;
    }

    public void applyCareModeToAllViews() {
        if (this.mCareModeApplied || !com.baicizhan.base.a.a(this)) {
            return;
        }
        View findViewById = getWindow().getDecorView().findViewById(R.id.content);
        if (findViewById instanceof ViewGroup) {
            d.d((ViewGroup) findViewById, this);
        }
        handleDataBindingViews();
        this.mCareModeApplied = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(d.a(newBase));
    }

    public boolean enableCustomSystemBar() {
        return false;
    }

    public boolean enableImmerseStatusBar() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (enableCustomSystemBar() || !onEarlySystemBarSetting()) {
            return;
        }
        H0();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT == 26 && UiUtils.isTranslucentOrFloating(this)) {
            qb.c.q("BaseAppCompatActivity", "fix transparent crash in Oreo", new Object[0]);
            UiUtils.fixOrientation(this);
        }
        super.onCreate(savedInstanceState);
        if (com.baicizhan.base.a.a(this)) {
            this.mHandler.post(new a());
        }
    }

    @Override // com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public boolean onEarlySystemBarSetting() {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ka.a.r(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ka.a.t(this);
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (enableCustomSystemBar()) {
            return;
        }
        H0();
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int requestedOrientation) {
        if (Build.VERSION.SDK_INT == 26 && UiUtils.isTranslucentOrFloating(this)) {
            qb.c.q("BaseAppCompatActivity", "fix transparent crash in Oreo: set orientation", new Object[0]);
            UiUtils.fixOrientation(this);
        }
        super.setRequestedOrientation(requestedOrientation);
    }

    public void setStatusBarColor() {
        TypedValue typedValue = new TypedValue();
        if (!getTheme().resolveAttribute(R.attr.windowLightStatusBar, typedValue, true) || typedValue.data < 0) {
            zb.a.f(this, true);
        } else {
            zb.a.f(this, false);
        }
    }

    public void setupImmerseStatusBar() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.flags &= -67108865;
        window.setAttributes(attributes);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
    }

    public void updateStatusBar() {
        setStatusBarColor();
    }

    public void handleDataBindingViews() {
    }
}
