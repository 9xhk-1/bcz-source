package yp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f100236a;

    /* renamed from: b, reason: collision with root package name */
    public final xp.b f100237b;

    /* renamed from: c, reason: collision with root package name */
    public final xp.b f100238c;

    /* renamed from: d, reason: collision with root package name */
    public final xp.c f100239d;

    public b(xp.b bVar, xp.b bVar2, xp.c cVar, boolean z11) {
        this.f100237b = bVar;
        this.f100238c = bVar2;
        this.f100239d = cVar;
        this.f100236a = z11;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public xp.c b() {
        return this.f100239d;
    }

    public xp.b c() {
        return this.f100237b;
    }

    public xp.b d() {
        return this.f100238c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a(this.f100237b, bVar.f100237b) && a(this.f100238c, bVar.f100238c) && a(this.f100239d, bVar.f100239d);
    }

    public boolean f() {
        return this.f100236a;
    }

    public boolean g() {
        return this.f100238c == null;
    }

    public int hashCode() {
        return (e(this.f100237b) ^ e(this.f100238c)) ^ e(this.f100239d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f100237b);
        sb2.append(" , ");
        sb2.append(this.f100238c);
        sb2.append(" : ");
        xp.c cVar = this.f100239d;
        sb2.append(cVar == null ? "null" : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
