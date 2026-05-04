package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.4")
/* loaded from: classes8.dex */
public final class a1 implements h10.r {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f66964e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f66965f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f66966g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f66967h = 4;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.g f66968a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<h10.t> f66969b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final h10.r f66970c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66971d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66972a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66972a = iArr;
        }
    }

    @yz.y0(version = "1.6")
    public a1(@m80.k h10.g classifier, @m80.k List<h10.t> arguments, @m80.l h10.r rVar, int i11) {
        g0.p(classifier, "classifier");
        g0.p(arguments, "arguments");
        this.f66968a = classifier;
        this.f66969b = arguments;
        this.f66970c = rVar;
        this.f66971d = i11;
    }

    public static final CharSequence j(a1 a1Var, h10.t it) {
        g0.p(it, "it");
        return a1Var.g(it);
    }

    @Override // h10.r
    public boolean e() {
        return (this.f66971d & 1) != 0;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return g0.g(m(), a1Var.m()) && g0.g(getArguments(), a1Var.getArguments()) && g0.g(this.f66970c, a1Var.f66970c) && this.f66971d == a1Var.f66971d;
    }

    public final String g(h10.t tVar) {
        String valueOf;
        if (tVar.h() == null) {
            return "*";
        }
        h10.r g11 = tVar.g();
        a1 a1Var = g11 instanceof a1 ? (a1) g11 : null;
        if (a1Var == null || (valueOf = a1Var.h(true)) == null) {
            valueOf = String.valueOf(tVar.g());
        }
        int i11 = b.f66972a[tVar.h().ordinal()];
        if (i11 == 1) {
            return valueOf;
        }
        if (i11 == 2) {
            return "in " + valueOf;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + valueOf;
    }

    @Override // h10.b
    @m80.k
    public List<Annotation> getAnnotations() {
        return a00.h0.J();
    }

    @Override // h10.r
    @m80.k
    public List<h10.t> getArguments() {
        return this.f66969b;
    }

    public final String h(boolean z11) {
        String name;
        h10.g m11 = m();
        h10.d dVar = m11 instanceof h10.d ? (h10.d) m11 : null;
        Class<?> d11 = dVar != null ? w00.b.d(dVar) : null;
        if (d11 == null) {
            name = m().toString();
        } else if ((this.f66971d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (d11.isArray()) {
            name = l(d11);
        } else if (z11 && d11.isPrimitive()) {
            h10.g m12 = m();
            g0.n(m12, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = w00.b.g((h10.d) m12).getName();
        } else {
            name = d11.getName();
        }
        String str = name + (getArguments().isEmpty() ? "" : a00.r0.r3(getArguments(), j2.O, "<", ">", 0, null, new x00.l() { // from class: kotlin.jvm.internal.z0
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence j11;
                j11 = a1.j(a1.this, (h10.t) obj);
                return j11;
            }
        }, 24, null)) + (e() ? "?" : "");
        h10.r rVar = this.f66970c;
        if (!(rVar instanceof a1)) {
            return str;
        }
        String h11 = ((a1) rVar).h(true);
        if (g0.g(h11, str)) {
            return str;
        }
        if (g0.g(h11, str + s60.d.f88057a)) {
            return str + PublicSuffixDatabase.f77441i;
        }
        return '(' + str + zr.m.f102856e + h11 + ')';
    }

    public int hashCode() {
        return (((m().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.f66971d);
    }

    public final String l(Class<?> cls) {
        return g0.g(cls, boolean[].class) ? "kotlin.BooleanArray" : g0.g(cls, char[].class) ? "kotlin.CharArray" : g0.g(cls, byte[].class) ? "kotlin.ByteArray" : g0.g(cls, short[].class) ? "kotlin.ShortArray" : g0.g(cls, int[].class) ? "kotlin.IntArray" : g0.g(cls, float[].class) ? "kotlin.FloatArray" : g0.g(cls, long[].class) ? "kotlin.LongArray" : g0.g(cls, double[].class) ? "kotlin.DoubleArray" : j50.w.f63489a;
    }

    @Override // h10.r
    @m80.k
    public h10.g m() {
        return this.f66968a;
    }

    public final int n() {
        return this.f66971d;
    }

    @m80.l
    public final h10.r r() {
        return this.f66970c;
    }

    @m80.k
    public String toString() {
        return h(false) + o0.f67014b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(@m80.k h10.g classifier, @m80.k List<h10.t> arguments, boolean z11) {
        this(classifier, arguments, null, z11 ? 1 : 0);
        g0.p(classifier, "classifier");
        g0.p(arguments, "arguments");
    }

    @yz.y0(version = "1.6")
    public static /* synthetic */ void o() {
    }

    @yz.y0(version = "1.6")
    public static /* synthetic */ void s() {
    }
}
