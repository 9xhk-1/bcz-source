package com.meizu.flyme.openidsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static volatile b f39984e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f39985f = false;

    /* renamed from: h, reason: collision with root package name */
    private BroadcastReceiver f39991h;

    /* renamed from: a, reason: collision with root package name */
    public OpenId f39986a = new OpenId("udid");

    /* renamed from: b, reason: collision with root package name */
    public OpenId f39987b = new OpenId("oaid");

    /* renamed from: d, reason: collision with root package name */
    public OpenId f39989d = new OpenId("vaid");

    /* renamed from: c, reason: collision with root package name */
    public OpenId f39988c = new OpenId("aaid");

    /* renamed from: g, reason: collision with root package name */
    private SupportInfo f39990g = new SupportInfo();

    private b() {
    }

    private static native ValueData a(Cursor cursor);

    public static final native b a();

    private static native String a(PackageManager packageManager, String str);

    public static native void a(String str);

    public static native void a(boolean z11);

    private static native boolean a(Context context);

    private native String b(Context context, OpenId openId);

    private static native String b(PackageManager packageManager, String str);

    private native synchronized void b(Context context);

    public final native String a(Context context, OpenId openId);

    public final native boolean a(Context context, boolean z11);
}
