package com.badlogic.gdx.math;

import a3.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i implements j0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f12598a;

    /* renamed from: b, reason: collision with root package name */
    public float f12599b;

    /* renamed from: c, reason: collision with root package name */
    public float f12600c;

    /* renamed from: d, reason: collision with root package name */
    public float f12601d;

    /* renamed from: e, reason: collision with root package name */
    public float f12602e;

    /* renamed from: f, reason: collision with root package name */
    public float f12603f;

    /* renamed from: g, reason: collision with root package name */
    public float f12604g;

    /* renamed from: h, reason: collision with root package name */
    public final u f12605h;

    public i(int i11) {
        this.f12605h = i11 > 1 ? new u(i11) : null;
        reset();
    }

    public void a(float f11) {
        this.f12603f = f11;
        float f12 = this.f12599b + f11;
        this.f12599b = f12;
        int i11 = this.f12598a + 1;
        this.f12598a = i11;
        this.f12602e = f12 / i11;
        u uVar = this.f12605h;
        if (uVar != null) {
            uVar.a(f11);
            this.f12604g = this.f12605h.f();
        } else {
            this.f12604g = f11;
        }
        u uVar2 = this.f12605h;
        if (uVar2 == null || uVar2.k()) {
            float f13 = this.f12604g;
            if (f13 < this.f12600c) {
                this.f12600c = f13;
            }
            if (f13 > this.f12601d) {
                this.f12601d = f13;
            }
        }
    }

    @Override // a3.j0.a
    public void reset() {
        this.f12598a = 0;
        this.f12599b = 0.0f;
        this.f12600c = Float.MAX_VALUE;
        this.f12601d = -3.4028235E38f;
        this.f12602e = 0.0f;
        this.f12603f = 0.0f;
        this.f12604g = 0.0f;
        u uVar = this.f12605h;
        if (uVar != null) {
            uVar.b();
        }
    }

    public String toString() {
        return "FloatCounter{count=" + this.f12598a + ", total=" + this.f12599b + ", min=" + this.f12600c + ", max=" + this.f12601d + ", average=" + this.f12602e + ", latest=" + this.f12603f + ", value=" + this.f12604g + l50.b.f69928j;
    }
}
