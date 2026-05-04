package v60;

import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class f implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final f f93136i = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final int f93137a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93139c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f93140d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93141e;

    /* renamed from: f, reason: collision with root package name */
    public final int f93142f;

    /* renamed from: g, reason: collision with root package name */
    public final int f93143g;

    /* renamed from: h, reason: collision with root package name */
    public final int f93144h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f93145a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f93146b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f93148d;

        /* renamed from: f, reason: collision with root package name */
        public int f93150f;

        /* renamed from: g, reason: collision with root package name */
        public int f93151g;

        /* renamed from: h, reason: collision with root package name */
        public int f93152h;

        /* renamed from: c, reason: collision with root package name */
        public int f93147c = -1;

        /* renamed from: e, reason: collision with root package name */
        public boolean f93149e = true;

        public f a() {
            return new f(this.f93145a, this.f93146b, this.f93147c, this.f93148d, this.f93149e, this.f93150f, this.f93151g, this.f93152h);
        }

        public a b(int i11) {
            this.f93152h = i11;
            return this;
        }

        public a c(int i11) {
            this.f93151g = i11;
            return this;
        }

        public a d(int i11) {
            this.f93150f = i11;
            return this;
        }

        public a e(boolean z11) {
            this.f93148d = z11;
            return this;
        }

        public a f(int i11) {
            this.f93147c = i11;
            return this;
        }

        public a g(boolean z11) {
            this.f93146b = z11;
            return this;
        }

        public a h(int i11) {
            this.f93145a = i11;
            return this;
        }

        public a i(boolean z11) {
            this.f93149e = z11;
            return this;
        }
    }

    public f(int i11, boolean z11, int i12, boolean z12, boolean z13, int i13, int i14, int i15) {
        this.f93137a = i11;
        this.f93138b = z11;
        this.f93139c = i12;
        this.f93140d = z12;
        this.f93141e = z13;
        this.f93142f = i13;
        this.f93143g = i14;
        this.f93144h = i15;
    }

    public static a b(f fVar) {
        e80.a.j(fVar, "Socket config");
        return new a().h(fVar.h()).g(fVar.j()).f(fVar.g()).e(fVar.i()).i(fVar.l()).d(fVar.f()).c(fVar.e()).b(fVar.d());
    }

    public static a c() {
        return new a();
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f clone() throws CloneNotSupportedException {
        return (f) super.clone();
    }

    public int d() {
        return this.f93144h;
    }

    public int e() {
        return this.f93143g;
    }

    public int f() {
        return this.f93142f;
    }

    public int g() {
        return this.f93139c;
    }

    public int h() {
        return this.f93137a;
    }

    public boolean i() {
        return this.f93140d;
    }

    public boolean j() {
        return this.f93138b;
    }

    public boolean l() {
        return this.f93141e;
    }

    public String toString() {
        return "[soTimeout=" + this.f93137a + ", soReuseAddress=" + this.f93138b + ", soLinger=" + this.f93139c + ", soKeepAlive=" + this.f93140d + ", tcpNoDelay=" + this.f93141e + ", sndBufSize=" + this.f93142f + ", rcvBufSize=" + this.f93143g + ", backlogSize=" + this.f93144h + "]";
    }
}
