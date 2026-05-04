package com.mob.secverify.pure.core;

import android.util.SparseArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static SparseArray<b> f40774e;

    /* renamed from: f, reason: collision with root package name */
    private static SparseArray<b> f40775f;

    /* renamed from: a, reason: collision with root package name */
    public int f40776a;

    /* renamed from: b, reason: collision with root package name */
    public String f40777b;

    /* renamed from: c, reason: collision with root package name */
    public String f40778c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40779d;

    public b(int i11, String str, String str2, boolean z11) {
        this.f40776a = i11;
        this.f40777b = str;
        this.f40778c = str2;
        this.f40779d = z11;
    }

    public static SparseArray<b> a() {
        return f40774e;
    }

    public static SparseArray<b> b() {
        return f40775f;
    }

    public static void a(SparseArray<b> sparseArray) {
        f40774e = sparseArray;
    }

    public static void b(SparseArray<b> sparseArray) {
        f40775f = sparseArray;
    }
}
