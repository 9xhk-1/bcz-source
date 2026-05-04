package ix;

import java.util.List;
import org.apache.http.HttpVersion;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f1 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f62772d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final f1 f62773e = new f1(HttpVersion.HTTP, 2, 0);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final f1 f62774f = new f1(HttpVersion.HTTP, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final f1 f62775g = new f1(HttpVersion.HTTP, 1, 0);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final f1 f62776h = new f1("SPDY", 3, 0);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final f1 f62777i = new f1("QUIC", 1, 0);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62779b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62780c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f1 a(@m80.k String name, int i11, int i12) {
            kotlin.jvm.internal.g0.p(name, "name");
            return (kotlin.jvm.internal.g0.g(name, HttpVersion.HTTP) && i11 == 1 && i12 == 0) ? b() : (kotlin.jvm.internal.g0.g(name, HttpVersion.HTTP) && i11 == 1 && i12 == 1) ? c() : (kotlin.jvm.internal.g0.g(name, HttpVersion.HTTP) && i11 == 2 && i12 == 0) ? d() : new f1(name, i11, i12);
        }

        @m80.k
        public final f1 b() {
            return f1.f62775g;
        }

        @m80.k
        public final f1 c() {
            return f1.f62774f;
        }

        @m80.k
        public final f1 d() {
            return f1.f62773e;
        }

        @m80.k
        public final f1 e() {
            return f1.f62777i;
        }

        @m80.k
        public final f1 f() {
            return f1.f62776h;
        }

        @m80.k
        public final f1 g(@m80.k CharSequence value) {
            kotlin.jvm.internal.g0.p(value, "value");
            List o52 = u30.k0.o5(value, new String[]{"/", "."}, false, 0, 6, null);
            if (o52.size() == 3) {
                return a((String) o52.get(0), Integer.parseInt((String) o52.get(1)), Integer.parseInt((String) o52.get(2)));
            }
            throw new IllegalStateException(("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: " + ((Object) value)).toString());
        }

        public a() {
        }
    }

    public f1(@m80.k String name, int i11, int i12) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f62778a = name;
        this.f62779b = i11;
        this.f62780c = i12;
    }

    public static /* synthetic */ f1 j(f1 f1Var, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = f1Var.f62778a;
        }
        if ((i13 & 2) != 0) {
            i11 = f1Var.f62779b;
        }
        if ((i13 & 4) != 0) {
            i12 = f1Var.f62780c;
        }
        return f1Var.i(str, i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.g0.g(this.f62778a, f1Var.f62778a) && this.f62779b == f1Var.f62779b && this.f62780c == f1Var.f62780c;
    }

    @m80.k
    public final String f() {
        return this.f62778a;
    }

    public final int g() {
        return this.f62779b;
    }

    public final int h() {
        return this.f62780c;
    }

    public int hashCode() {
        return (((this.f62778a.hashCode() * 31) + Integer.hashCode(this.f62779b)) * 31) + Integer.hashCode(this.f62780c);
    }

    @m80.k
    public final f1 i(@m80.k String name, int i11, int i12) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new f1(name, i11, i12);
    }

    public final int k() {
        return this.f62779b;
    }

    public final int l() {
        return this.f62780c;
    }

    @m80.k
    public final String m() {
        return this.f62778a;
    }

    @m80.k
    public String toString() {
        return this.f62778a + '/' + this.f62779b + '.' + this.f62780c;
    }
}
