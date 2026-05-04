package ix;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpHeaderValueParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HeaderValue\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n295#2,2:225\n1#3:227\n*S KotlinDebug\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HeaderValue\n*L\n38#1:225,2\n*E\n"})
/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62939a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<n0> f62940b;

    /* renamed from: c, reason: collision with root package name */
    public final double f62941c;

    public m0(@m80.k String value, @m80.k List<n0> params) {
        Double d11;
        Object obj;
        String h11;
        Double Z0;
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(params, "params");
        this.f62939a = value;
        this.f62940b = params;
        Iterator<T> it = params.iterator();
        while (true) {
            d11 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.g0.g(((n0) obj).g(), "q")) {
                    break;
                }
            }
        }
        n0 n0Var = (n0) obj;
        double d12 = 1.0d;
        if (n0Var != null && (h11 = n0Var.h()) != null && (Z0 = u30.d0.Z0(h11)) != null) {
            double doubleValue = Z0.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d11 = Z0;
            }
            if (d11 != null) {
                d12 = d11.doubleValue();
            }
        }
        this.f62941c = d12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m0 d(m0 m0Var, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = m0Var.f62939a;
        }
        if ((i11 & 2) != 0) {
            list = m0Var.f62940b;
        }
        return m0Var.c(str, list);
    }

    @m80.k
    public final String a() {
        return this.f62939a;
    }

    @m80.k
    public final List<n0> b() {
        return this.f62940b;
    }

    @m80.k
    public final m0 c(@m80.k String value, @m80.k List<n0> params) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(params, "params");
        return new m0(value, params);
    }

    @m80.k
    public final List<n0> e() {
        return this.f62940b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.g0.g(this.f62939a, m0Var.f62939a) && kotlin.jvm.internal.g0.g(this.f62940b, m0Var.f62940b);
    }

    public final double f() {
        return this.f62941c;
    }

    @m80.k
    public final String g() {
        return this.f62939a;
    }

    public int hashCode() {
        return (this.f62939a.hashCode() * 31) + this.f62940b.hashCode();
    }

    @m80.k
    public String toString() {
        return "HeaderValue(value=" + this.f62939a + ", params=" + this.f62940b + ')';
    }

    public /* synthetic */ m0(String str, List list, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? a00.h0.J() : list);
    }
}
