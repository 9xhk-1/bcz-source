package r70;

import e80.g;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f83585a;

    /* renamed from: b, reason: collision with root package name */
    public final c f83586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83587c;

    /* renamed from: d, reason: collision with root package name */
    public String f83588d;

    public a(String str, int i11, c cVar) {
        e80.a.j(str, "Scheme name");
        if (i11 <= 0 || i11 > 65535) {
            throw new IllegalArgumentException("Port is invalid: " + i11);
        }
        this.f83585a = str.toLowerCase(Locale.ROOT);
        this.f83586b = cVar;
        this.f83587c = i11;
    }

    public final int a() {
        return this.f83587c;
    }

    public final c b() {
        return this.f83586b;
    }

    public final String c() {
        return this.f83585a;
    }

    public final int d(int i11) {
        return i11 <= 0 ? this.f83587c : i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f83585a.equals(aVar.f83585a) && this.f83587c == aVar.f83587c && this.f83586b.equals(aVar.f83586b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return g.d(g.d(g.c(17, this.f83587c), this.f83585a), this.f83586b);
    }

    public final String toString() {
        if (this.f83588d == null) {
            this.f83588d = this.f83585a + ':' + Integer.toString(this.f83587c);
        }
        return this.f83588d;
    }
}
