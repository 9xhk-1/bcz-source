package com.baicizhan.base;

import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.l;
import u30.f0;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public class ComposeBaseActivity extends BaseAppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15902a = 8;

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean enableImmerseStatusBar() {
        return false;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (f0.c2(Build.MODEL, "MuMu", true) && f0.c2(Build.MANUFACTURER, "Netease", true)) {
            g.i("该功能暂不支持此机型", 0);
            finish();
        }
    }
}
