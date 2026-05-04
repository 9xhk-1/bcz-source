package com.bun.miitmdid;

import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public Class<?> f28929a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Object f28930b;

    /* renamed from: c, reason: collision with root package name */
    public String f28931c;

    /* renamed from: d, reason: collision with root package name */
    public Class<?>[] f28932d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f28933e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Class<?> f28934f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28935g = false;

    public h(Class<?> cls, @Nullable Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        this.f28929a = cls;
        this.f28930b = obj;
        this.f28931c = str;
        this.f28932d = clsArr;
        this.f28933e = objArr;
    }

    public native Object a();

    @Nullable
    public Class<?> b() {
        return this.f28934f;
    }

    public native boolean c();

    public h(Class<?> cls, @Nullable Object obj, String str, Class<?>[] clsArr, Object[] objArr, Class<?> cls2) {
        this.f28929a = cls;
        this.f28930b = obj;
        this.f28931c = str;
        this.f28932d = clsArr;
        this.f28933e = objArr;
        this.f28934f = cls2;
    }
}
