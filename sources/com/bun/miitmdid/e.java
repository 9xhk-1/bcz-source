package com.bun.miitmdid;

import android.content.Context;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IPermissionCallbackListener;
import com.bun.miitmdid.interfaces.IdSupplier;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f28911a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f28912b = false;

    /* renamed from: c, reason: collision with root package name */
    public static AtomicLong f28913c = new AtomicLong(5000);

    /* renamed from: d, reason: collision with root package name */
    public static boolean f28914d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f28915e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f28916f = true;

    public e(boolean z11, long j11) {
        AtomicLong atomicLong;
        i0.a(z11);
        if (j11 <= 0) {
            atomicLong = f28913c;
            j11 = 5000;
        } else {
            atomicLong = f28913c;
        }
        atomicLong.set(j11);
    }

    public static native int a();

    public static native void a(Context context, IPermissionCallbackListener iPermissionCallbackListener);

    public static native boolean a(Context context, String str);

    public final native int a(int i11, IdSupplier idSupplier);

    public native int a(Context context, IIdentifierListener iIdentifierListener);

    public native void a(boolean z11, boolean z12, boolean z13);

    public e(boolean z11, long j11, boolean z12, boolean z13, boolean z14) {
        AtomicLong atomicLong;
        i0.a(z11);
        if (j11 <= 0) {
            atomicLong = f28913c;
            j11 = 5000;
        } else {
            atomicLong = f28913c;
        }
        atomicLong.set(j11);
        a(z12, z13, z14);
    }
}
