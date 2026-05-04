package com.mob.secverify.pure.a;

import android.net.ConnectivityManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f40739a;

    private a(ConnectivityManager connectivityManager) {
        this.f40739a = connectivityManager;
    }

    public static a a(ConnectivityManager connectivityManager) {
        return new a(connectivityManager);
    }

    public int a(int i11, String str) {
        return this.f40739a.startUsingNetworkFeature(i11, str);
    }

    public boolean a(int i11, int i12) {
        return this.f40739a.requestRouteToHost(i11, i12);
    }
}
