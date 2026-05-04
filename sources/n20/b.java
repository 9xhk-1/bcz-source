package n20;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import u30.f0;
import u30.k0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClassId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassId.kt\norg/jetbrains/kotlin/name/ClassId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,141:1\n1#2:142\n226#3:143\n226#3:144\n*S KotlinDebug\n*F\n+ 1 ClassId.kt\norg/jetbrains/kotlin/name/ClassId\n*L\n37#1:143\n47#1:144\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f74280d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c f74281a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c f74282b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74283c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return aVar.a(str, z11);
        }

        @w00.k
        @o
        @m80.k
        public final b a(@m80.k String string, boolean z11) {
            String z22;
            String str;
            g0.p(string, "string");
            int I3 = k0.I3(string, '`', 0, false, 6, null);
            if (I3 == -1) {
                I3 = string.length();
            }
            int Y3 = k0.Y3(string, "/", I3, false, 4, null);
            if (Y3 == -1) {
                z22 = f0.z2(string, "`", "", false, 4, null);
                str = "";
            } else {
                String substring = string.substring(0, Y3);
                g0.o(substring, "substring(...)");
                String y22 = f0.y2(substring, '/', '.', false, 4, null);
                String substring2 = string.substring(Y3 + 1);
                g0.o(substring2, "substring(...)");
                z22 = f0.z2(substring2, "`", "", false, 4, null);
                str = y22;
            }
            return new b(new c(str), new c(z22), z11);
        }

        @o
        @m80.k
        public final b c(@m80.k c topLevelFqName) {
            g0.p(topLevelFqName, "topLevelFqName");
            c e11 = topLevelFqName.e();
            g0.o(e11, "parent(...)");
            f g11 = topLevelFqName.g();
            g0.o(g11, "shortName(...)");
            return new b(e11, g11);
        }

        public a() {
        }
    }

    public b(@m80.k c packageFqName, @m80.k c relativeClassName, boolean z11) {
        g0.p(packageFqName, "packageFqName");
        g0.p(relativeClassName, "relativeClassName");
        this.f74281a = packageFqName;
        this.f74282b = relativeClassName;
        this.f74283c = z11;
        relativeClassName.d();
    }

    public static final String c(c cVar) {
        String b11 = cVar.b();
        g0.o(b11, "asString(...)");
        if (!k0.m3(b11, '/', false, 2, null)) {
            return b11;
        }
        return '`' + b11 + '`';
    }

    @o
    @m80.k
    public static final b k(@m80.k c cVar) {
        return f74280d.c(cVar);
    }

    @m80.k
    public final c a() {
        if (this.f74281a.d()) {
            return this.f74282b;
        }
        return new c(this.f74281a.b() + '.' + this.f74282b.b());
    }

    @m80.k
    public final String b() {
        if (this.f74281a.d()) {
            return c(this.f74282b);
        }
        StringBuilder sb2 = new StringBuilder();
        String b11 = this.f74281a.b();
        g0.o(b11, "asString(...)");
        sb2.append(f0.y2(b11, '.', '/', false, 4, null));
        sb2.append("/");
        sb2.append(c(this.f74282b));
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public final b d(@m80.k f name) {
        g0.p(name, "name");
        c cVar = this.f74281a;
        c c11 = this.f74282b.c(name);
        g0.o(c11, "child(...)");
        return new b(cVar, c11, this.f74283c);
    }

    @l
    public final b e() {
        c e11 = this.f74282b.e();
        g0.o(e11, "parent(...)");
        if (e11.d()) {
            return null;
        }
        return new b(this.f74281a, e11, this.f74283c);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f74281a, bVar.f74281a) && g0.g(this.f74282b, bVar.f74282b) && this.f74283c == bVar.f74283c;
    }

    @m80.k
    public final c f() {
        return this.f74281a;
    }

    @m80.k
    public final c g() {
        return this.f74282b;
    }

    @m80.k
    public final f h() {
        f g11 = this.f74282b.g();
        g0.o(g11, "shortName(...)");
        return g11;
    }

    public int hashCode() {
        return (((this.f74281a.hashCode() * 31) + this.f74282b.hashCode()) * 31) + Boolean.hashCode(this.f74283c);
    }

    public final boolean i() {
        return this.f74283c;
    }

    public final boolean j() {
        return !this.f74282b.e().d();
    }

    @m80.k
    public String toString() {
        if (!this.f74281a.d()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@m80.k n20.c r2, @m80.k n20.f r3) {
        /*
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "topLevelName"
            kotlin.jvm.internal.g0.p(r3, r0)
            n20.c r3 = n20.c.k(r3)
            java.lang.String r0 = "topLevel(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n20.b.<init>(n20.c, n20.f):void");
    }
}
