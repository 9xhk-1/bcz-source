package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class BaseActivity extends Activity {
    public final boolean a() {
        boolean z11;
        Exception e11;
        Method method;
        try {
            TypedArray obtainStyledAttributes = obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            z11 = ((Boolean) method.invoke(null, obtainStyledAttributes)).booleanValue();
        } catch (Exception e12) {
            z11 = false;
            e11 = e12;
        }
        try {
            method.setAccessible(false);
            return z11;
        } catch (Exception e13) {
            e11 = e13;
            e11.printStackTrace();
            return z11;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT == 26 && a()) {
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                declaredField.setAccessible(true);
                ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
                declaredField.setAccessible(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i11) {
        if (Build.VERSION.SDK_INT == 26 && a()) {
            return;
        }
        super.setRequestedOrientation(i11);
    }
}
