package v60;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final c f93129c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final int f93130a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93131b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f93132a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f93133b = -1;

        public c a() {
            return new c(this.f93132a, this.f93133b);
        }

        public a b(int i11) {
            this.f93133b = i11;
            return this;
        }

        public a c(int i11) {
            this.f93132a = i11;
            return this;
        }
    }

    public c(int i11, int i12) {
        this.f93130a = i11;
        this.f93131b = i12;
    }

    public static a b(c cVar) {
        e80.a.j(cVar, "Message constraints");
        return new a().b(cVar.d()).c(cVar.e());
    }

    public static a c() {
        return new a();
    }

    public static c f(int i11) {
        return new c(e80.a.h(i11, "Max line length"), -1);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c clone() throws CloneNotSupportedException {
        return (c) super.clone();
    }

    public int d() {
        return this.f93131b;
    }

    public int e() {
        return this.f93130a;
    }

    public String toString() {
        return "[maxLineLength=" + this.f93130a + ", maxHeaderCount=" + this.f93131b + "]";
    }
}
