package com.bun.miitmdid.utilsforrequestpermission;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.liteav.TXLiteAVCode;

/* loaded from: classes6.dex */
public class PermissionTransparentActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public int f28979a = TXLiteAVCode.WARNING_CAMERA_DEVICE_EMPTY;

    /* renamed from: b, reason: collision with root package name */
    public String[] f28980b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    @Override // android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public native void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr);
}
