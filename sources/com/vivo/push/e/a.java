package com.vivo.push.e;

import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f45014a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test", "com.vivo.hybrid"};

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<String> f45015b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.vivo.push.e.a$a, reason: collision with other inner class name */
    public static class C0530a {

        /* renamed from: a, reason: collision with root package name */
        private static a f45021a = new a(0);
    }

    public /* synthetic */ a(byte b11) {
        this();
    }

    public static a a() {
        return C0530a.f45021a;
    }

    public final ArrayList<String> b() {
        return new ArrayList<>(this.f45015b);
    }

    public final boolean c() {
        ArrayList<String> arrayList = this.f45015b;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }

    private a() {
        this.f45015b = null;
        this.f45015b = new ArrayList<>();
    }
}
