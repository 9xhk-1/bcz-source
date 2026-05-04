package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfoCompat.AccessibilityActionCompat f32610a;

    public a(Context context, int i11) {
        this.f32610a = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i11));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.f32610a);
    }
}
