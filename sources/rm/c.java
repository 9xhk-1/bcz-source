package rm;

import java.util.List;
import rm.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c extends h.a {

    /* renamed from: e, reason: collision with root package name */
    public static h<c> f84256e;

    /* renamed from: c, reason: collision with root package name */
    public float f84257c;

    /* renamed from: d, reason: collision with root package name */
    public float f84258d;

    static {
        h<c> a11 = h.a(256, new c(0.0f, 0.0f));
        f84256e = a11;
        a11.l(0.5f);
    }

    public c() {
    }

    public static c b(float f11, float f12) {
        c b11 = f84256e.b();
        b11.f84257c = f11;
        b11.f84258d = f12;
        return b11;
    }

    public static void c(c cVar) {
        f84256e.h(cVar);
    }

    public static void d(List<c> list) {
        f84256e.g(list);
    }

    @Override // rm.h.a
    public h.a a() {
        return new c(0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f84257c == cVar.f84257c && this.f84258d == cVar.f84258d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f84257c) ^ Float.floatToIntBits(this.f84258d);
    }

    public String toString() {
        return this.f84257c + "x" + this.f84258d;
    }

    public c(float f11, float f12) {
        this.f84257c = f11;
        this.f84258d = f12;
    }
}
