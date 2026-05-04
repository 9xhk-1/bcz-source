package com.baicizhan.client.business.util;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UiUtils {
    public static int RGBA2ARGB(String rgbaColor) {
        if (TextUtils.isEmpty(rgbaColor)) {
            return -1;
        }
        if (rgbaColor.length() == 7) {
            return Color.parseColor(rgbaColor);
        }
        return Color.parseColor(rgbaColor.charAt(0) + rgbaColor.substring(7, 9) + rgbaColor.substring(1, 7));
    }

    public static /* synthetic */ void a(View view, int i11, int i12, int i13, int i14, View view2) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= xb.f.a(view.getContext(), i11);
        rect.bottom += xb.f.a(view.getContext(), i12);
        rect.left -= xb.f.a(view.getContext(), i13);
        rect.right += xb.f.a(view.getContext(), i14);
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    public static void expandTouchArea(final View view, final int leftDp, final int topDp, final int rightDp, final int bottomDp) {
        final View view2 = (View) view.getParent();
        view2.post(new Runnable() { // from class: com.baicizhan.client.business.util.b0
            @Override // java.lang.Runnable
            public final void run() {
                UiUtils.a(view, topDp, bottomDp, leftDp, rightDp, view2);
            }
        });
    }

    public static boolean fixOrientation(Activity activity) {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public static boolean isTranslucentOrFloating(Activity activity) {
        Exception e11;
        boolean z11;
        Method method;
        try {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            z11 = ((Boolean) method.invoke(null, obtainStyledAttributes)).booleanValue();
        } catch (Exception e12) {
            e11 = e12;
            z11 = false;
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

    public static void expandTouchArea(View view, int expandDp) {
        expandTouchArea(view, expandDp, expandDp, expandDp, expandDp);
    }
}
