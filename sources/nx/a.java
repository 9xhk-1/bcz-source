package nx;

import a00.a0;
import a00.h0;
import ix.n0;
import ix.o0;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAcceptEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AcceptEncoding.kt\nio/ktor/http/header/AcceptEncoding\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1755#2,3:116\n*S KotlinDebug\n*F\n+ 1 AcceptEncoding.kt\nio/ktor/http/header/AcceptEncoding\n*L\n85#1:116,3\n*E\n"})
/* loaded from: classes8.dex */
public final class a extends o0 {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C0918a f75390e = new C0918a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f75391f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f75392g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f75393h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f75394i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f75395j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f75396k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f75397l;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f75398d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: nx.a$a, reason: collision with other inner class name */
    public static final class C0918a {
        public /* synthetic */ C0918a(v vVar) {
            this();
        }

        @k
        public final a a() {
            return a.f75397l;
        }

        @k
        public final a b() {
            return a.f75394i;
        }

        @k
        public final a c() {
            return a.f75392g;
        }

        @k
        public final a d() {
            return a.f75393h;
        }

        @k
        public final a e() {
            return a.f75391f;
        }

        @k
        public final a f() {
            return a.f75396k;
        }

        @k
        public final a g() {
            return a.f75395j;
        }

        @k
        public final String h(@k a... encodings) {
            g0.p(encodings, "encodings");
            return a0.Eh(encodings, j2.O, null, null, 0, null, null, 62, null);
        }

        public C0918a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i11 = 2;
        f75391f = new a("gzip", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f75392g = new a("compress", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f75393h = new a("deflate", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f75394i = new a("br", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f75395j = new a("zstd", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f75396k = new a("identity", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f75397l = new a("*", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(String str, List list, int i11, v vVar) {
        this(str, (List<n0>) ((i11 & 2) != 0 ? h0.J() : list));
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f0.c2(this.f75398d, aVar.f75398d, true) && g0.g(b(), aVar.b());
    }

    public int hashCode() {
        String lowerCase = this.f75398d.toLowerCase(Locale.ROOT);
        g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase.hashCode() + (b().hashCode() * 31);
    }

    @k
    public final String k() {
        return this.f75398d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r4 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(@m80.k nx.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = r7.f75398d
            java.lang.String r1 = "*"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L1c
            java.lang.String r0 = r7.f75398d
            java.lang.String r4 = r6.f75398d
            boolean r0 = u30.f0.c2(r0, r4, r3)
            if (r0 != 0) goto L1c
            return r2
        L1c:
            java.util.List r7 = r7.b()
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r7.next()
            ix.n0 r0 = (ix.n0) r0
            java.lang.String r4 = r0.a()
            java.lang.String r0 = r0.b()
            boolean r5 = kotlin.jvm.internal.g0.g(r4, r1)
            if (r5 == 0) goto L76
            boolean r4 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r4 == 0) goto L46
        L44:
            r0 = r3
            goto L87
        L46:
            java.util.List r4 = r6.b()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L5b
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L5b
        L59:
            r0 = r2
            goto L87
        L5b:
            java.util.Iterator r4 = r4.iterator()
        L5f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            ix.n0 r5 = (ix.n0) r5
            java.lang.String r5 = r5.h()
            boolean r5 = u30.f0.c2(r5, r0, r3)
            if (r5 == 0) goto L5f
            goto L44
        L76:
            java.lang.String r4 = r6.c(r4)
            boolean r5 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r5 == 0) goto L83
            if (r4 == 0) goto L59
            goto L44
        L83:
            boolean r0 = u30.f0.c2(r4, r0, r3)
        L87:
            if (r0 != 0) goto L24
            return r2
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nx.a.l(nx.a):boolean");
    }

    @k
    public final a m(double d11) {
        return g0.g(String.valueOf(d11), c("q")) ? this : new a(this.f75398d, d11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k String acceptEncoding, @k List<n0> parameters) {
        super(acceptEncoding, parameters);
        g0.p(acceptEncoding, "acceptEncoding");
        g0.p(parameters, "parameters");
        this.f75398d = acceptEncoding;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@k String acceptEncoding, double d11) {
        this(acceptEncoding, (List<n0>) a00.g0.l(new n0("q", String.valueOf(d11))));
        g0.p(acceptEncoding, "acceptEncoding");
    }
}
