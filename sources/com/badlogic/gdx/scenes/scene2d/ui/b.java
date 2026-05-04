package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.ui.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b<T extends a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<T> f12851a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<T> f12852b;

    /* renamed from: c, reason: collision with root package name */
    public int f12853c;

    /* renamed from: d, reason: collision with root package name */
    public int f12854d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12855e;

    /* renamed from: f, reason: collision with root package name */
    public T f12856f;

    public b() {
        this.f12851a = new com.badlogic.gdx.utils.a<>();
        this.f12852b = new com.badlogic.gdx.utils.a<>(1);
        this.f12854d = 1;
        this.f12855e = true;
        this.f12853c = 1;
    }

    public void a(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("button cannot be null.");
        }
        t11.B1 = null;
        boolean z11 = t11.o5() || this.f12851a.f13179b < this.f12853c;
        t11.r5(false);
        t11.B1 = this;
        this.f12851a.a(t11);
        t11.r5(z11);
    }

    public void b(T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException("buttons cannot be null.");
        }
        for (T t11 : tArr) {
            a(t11);
        }
    }

    public boolean c(T t11, boolean z11) {
        if (t11.f12828z1 == z11) {
            return false;
        }
        if (z11) {
            int i11 = this.f12854d;
            if (i11 != -1 && this.f12852b.f13179b >= i11) {
                if (!this.f12855e) {
                    return false;
                }
                int i12 = 0;
                while (true) {
                    int i13 = this.f12853c;
                    this.f12853c = 0;
                    this.f12856f.r5(false);
                    this.f12853c = i13;
                    if (t11.f12828z1 == z11) {
                        return false;
                    }
                    if (this.f12852b.f13179b < this.f12854d) {
                        break;
                    }
                    int i14 = i12 + 1;
                    if (i12 > 10) {
                        return false;
                    }
                    i12 = i14;
                }
            }
            this.f12852b.a(t11);
            this.f12856f = t11;
        } else {
            com.badlogic.gdx.utils.a<T> aVar = this.f12852b;
            if (aVar.f13179b <= this.f12853c) {
                return false;
            }
            aVar.C(t11, true);
        }
        return true;
    }

    public void d() {
        this.f12851a.clear();
        this.f12852b.clear();
    }

    public com.badlogic.gdx.utils.a<T> e() {
        return this.f12852b;
    }

    public com.badlogic.gdx.utils.a<T> f() {
        return this.f12851a;
    }

    @a3.d0
    public T g() {
        com.badlogic.gdx.utils.a<T> aVar = this.f12852b;
        if (aVar.f13179b > 0) {
            return aVar.get(0);
        }
        return null;
    }

    public int h() {
        com.badlogic.gdx.utils.a<T> aVar = this.f12852b;
        if (aVar.f13179b > 0) {
            return this.f12851a.q(aVar.get(0), true);
        }
        return -1;
    }

    public void i(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("button cannot be null.");
        }
        t11.B1 = null;
        this.f12851a.C(t11, true);
        this.f12852b.C(t11, true);
    }

    public void j(T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException("buttons cannot be null.");
        }
        for (T t11 : tArr) {
            i(t11);
        }
    }

    public void k(String str) {
        if (str == null) {
            throw new IllegalArgumentException("text cannot be null.");
        }
        int i11 = this.f12851a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            T t11 = this.f12851a.get(i12);
            if ((t11 instanceof v) && str.contentEquals(((v) t11).A5())) {
                t11.r5(true);
                return;
            }
        }
    }

    public void l(int i11) {
        if (i11 == 0) {
            i11 = -1;
        }
        this.f12854d = i11;
    }

    public void m(int i11) {
        this.f12853c = i11;
    }

    public void n(boolean z11) {
        this.f12855e = z11;
    }

    public void o() {
        int i11 = this.f12853c;
        this.f12853c = 0;
        int i12 = this.f12851a.f13179b;
        for (int i13 = 0; i13 < i12; i13++) {
            this.f12851a.get(i13).r5(false);
        }
        this.f12853c = i11;
    }

    public b(T... tArr) {
        this.f12851a = new com.badlogic.gdx.utils.a<>();
        this.f12852b = new com.badlogic.gdx.utils.a<>(1);
        this.f12854d = 1;
        this.f12855e = true;
        this.f12853c = 0;
        b(tArr);
        this.f12853c = 1;
    }
}
