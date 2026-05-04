package z1;

import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f100584d = -1;

    /* renamed from: a, reason: collision with root package name */
    public o f100585a;

    /* renamed from: b, reason: collision with root package name */
    public int f100586b;

    /* renamed from: c, reason: collision with root package name */
    public int f100587c;

    public int a() {
        return this.f100587c;
    }

    public int b() {
        return this.f100586b;
    }

    public boolean c() {
        return this.f100586b == -1;
    }

    public void d() {
        this.f100585a.f().b(0);
        if (c()) {
            return;
        }
        q1.g.f81384g.glBlendFunc(this.f100586b, this.f100587c);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        d dVar = (d) obj;
        return this.f100587c == dVar.f100587c && this.f100586b == dVar.f100586b && this.f100585a.f() == dVar.f100585a.f();
    }

    public int hashCode() {
        return ((((this.f100585a.f() != null ? this.f100585a.f().hashCode() : 0) * 31) + this.f100586b) * 31) + this.f100587c;
    }
}
