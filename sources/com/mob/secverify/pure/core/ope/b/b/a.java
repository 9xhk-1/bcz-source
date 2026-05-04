package com.mob.secverify.pure.core.ope.b.b;

import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40864a;

    /* renamed from: b, reason: collision with root package name */
    private int f40865b;

    /* renamed from: c, reason: collision with root package name */
    private T f40866c;

    public a(int i11, T t11, boolean z11) {
        this.f40865b = i11;
        this.f40866c = t11;
        this.f40864a = z11;
    }

    public final int a() {
        return this.f40865b;
    }

    public final T b() {
        return this.f40866c;
    }

    public final String toString() {
        return "{code:" + this.f40865b + ", response:" + this.f40866c + ", resultFormCache:" + this.f40864a + i.f11099d;
    }
}
