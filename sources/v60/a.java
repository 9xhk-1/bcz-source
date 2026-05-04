package v60;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class a implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f93116g = new C1253a().a();

    /* renamed from: a, reason: collision with root package name */
    public final int f93117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93118b;

    /* renamed from: c, reason: collision with root package name */
    public final Charset f93119c;

    /* renamed from: d, reason: collision with root package name */
    public final CodingErrorAction f93120d;

    /* renamed from: e, reason: collision with root package name */
    public final CodingErrorAction f93121e;

    /* renamed from: f, reason: collision with root package name */
    public final c f93122f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v60.a$a, reason: collision with other inner class name */
    public static class C1253a {

        /* renamed from: a, reason: collision with root package name */
        public int f93123a;

        /* renamed from: b, reason: collision with root package name */
        public int f93124b = -1;

        /* renamed from: c, reason: collision with root package name */
        public Charset f93125c;

        /* renamed from: d, reason: collision with root package name */
        public CodingErrorAction f93126d;

        /* renamed from: e, reason: collision with root package name */
        public CodingErrorAction f93127e;

        /* renamed from: f, reason: collision with root package name */
        public c f93128f;

        public a a() {
            Charset charset = this.f93125c;
            if (charset == null && (this.f93126d != null || this.f93127e != null)) {
                charset = org.apache.http.b.f77708f;
            }
            Charset charset2 = charset;
            int i11 = this.f93123a;
            if (i11 <= 0) {
                i11 = 8192;
            }
            int i12 = i11;
            int i13 = this.f93124b;
            return new a(i12, i13 >= 0 ? i13 : i12, charset2, this.f93126d, this.f93127e, this.f93128f);
        }

        public C1253a b(int i11) {
            this.f93123a = i11;
            return this;
        }

        public C1253a c(Charset charset) {
            this.f93125c = charset;
            return this;
        }

        public C1253a d(int i11) {
            this.f93124b = i11;
            return this;
        }

        public C1253a e(CodingErrorAction codingErrorAction) {
            this.f93126d = codingErrorAction;
            if (codingErrorAction != null && this.f93125c == null) {
                this.f93125c = org.apache.http.b.f77708f;
            }
            return this;
        }

        public C1253a f(c cVar) {
            this.f93128f = cVar;
            return this;
        }

        public C1253a g(CodingErrorAction codingErrorAction) {
            this.f93127e = codingErrorAction;
            if (codingErrorAction != null && this.f93125c == null) {
                this.f93125c = org.apache.http.b.f77708f;
            }
            return this;
        }
    }

    public a(int i11, int i12, Charset charset, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, c cVar) {
        this.f93117a = i11;
        this.f93118b = i12;
        this.f93119c = charset;
        this.f93120d = codingErrorAction;
        this.f93121e = codingErrorAction2;
        this.f93122f = cVar;
    }

    public static C1253a b(a aVar) {
        e80.a.j(aVar, "Connection config");
        return new C1253a().b(aVar.d()).c(aVar.e()).d(aVar.f()).e(aVar.g()).g(aVar.i()).f(aVar.h());
    }

    public static C1253a c() {
        return new C1253a();
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() throws CloneNotSupportedException {
        return (a) super.clone();
    }

    public int d() {
        return this.f93117a;
    }

    public Charset e() {
        return this.f93119c;
    }

    public int f() {
        return this.f93118b;
    }

    public CodingErrorAction g() {
        return this.f93120d;
    }

    public c h() {
        return this.f93122f;
    }

    public CodingErrorAction i() {
        return this.f93121e;
    }

    public String toString() {
        return "[bufferSize=" + this.f93117a + ", fragmentSizeHint=" + this.f93118b + ", charset=" + this.f93119c + ", malformedInputAction=" + this.f93120d + ", unmappableInputAction=" + this.f93121e + ", messageConstraints=" + this.f93122f + "]";
    }
}
