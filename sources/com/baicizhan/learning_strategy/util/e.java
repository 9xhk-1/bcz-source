package com.baicizhan.learning_strategy.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public F f17828a;

    /* renamed from: b, reason: collision with root package name */
    public S f17829b;

    public e() {
    }

    public F a() {
        return this.f17828a;
    }

    public S b() {
        return this.f17829b;
    }

    public void c(F f11) {
        this.f17828a = f11;
    }

    public void d(S s11) {
        this.f17829b = s11;
    }

    public String toString() {
        return String.format("p<%s,%s>", this.f17828a, this.f17829b);
    }

    public e(F f11, S s11) {
        c(f11);
        d(s11);
    }
}
