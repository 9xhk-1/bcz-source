package kb0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f66310a;

    /* renamed from: b, reason: collision with root package name */
    public String f66311b;

    /* renamed from: c, reason: collision with root package name */
    public String f66312c;

    /* renamed from: d, reason: collision with root package name */
    public int f66313d = -1;

    public f(String str, String str2, String str3) {
        this.f66310a = str;
        this.f66311b = str2;
        this.f66312c = str3;
    }

    public String a() {
        return this.f66310a;
    }

    public String b() {
        return this.f66311b;
    }

    public String c() {
        return this.f66312c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f66310a.equals(fVar.f66310a) && this.f66311b.equals(fVar.f66311b) && this.f66312c.equals(fVar.f66312c);
    }

    public int hashCode() {
        if (this.f66313d == -1) {
            this.f66313d = (this.f66310a.hashCode() ^ this.f66311b.hashCode()) ^ this.f66312c.hashCode();
        }
        return this.f66313d;
    }
}
