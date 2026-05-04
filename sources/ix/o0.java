package ix;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHeaderValueWithParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParametersKt\n*L\n1#1,152:1\n1#2:153\n86#3,5:154\n*S KotlinDebug\n*F\n+ 1 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters\n*L\n52#1:154,5\n*E\n"})
/* loaded from: classes8.dex */
public abstract class o0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f62966c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62967a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<n0> f62968b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final <R> R a(@m80.k String value, @m80.k x00.p<? super String, ? super List<n0>, ? extends R> init) {
            kotlin.jvm.internal.g0.p(value, "value");
            kotlin.jvm.internal.g0.p(init, "init");
            m0 m0Var = (m0) a00.r0.u3(x0.f(value));
            return init.invoke(m0Var.g(), m0Var.e());
        }

        public a() {
        }
    }

    public o0(@m80.k String content, @m80.k List<n0> parameters) {
        kotlin.jvm.internal.g0.p(content, "content");
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        this.f62967a = content;
        this.f62968b = parameters;
    }

    @m80.k
    public final String a() {
        return this.f62967a;
    }

    @m80.k
    public final List<n0> b() {
        return this.f62968b;
    }

    @m80.l
    public final String c(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        int L = a00.h0.L(this.f62968b);
        if (L < 0) {
            return null;
        }
        int i11 = 0;
        while (true) {
            n0 n0Var = this.f62968b.get(i11);
            if (u30.f0.c2(n0Var.g(), name, true)) {
                return n0Var.h();
            }
            if (i11 == L) {
                return null;
            }
            i11++;
        }
    }

    @m80.k
    public String toString() {
        if (this.f62968b.isEmpty()) {
            return this.f62967a;
        }
        int length = this.f62967a.length();
        int i11 = 0;
        int i12 = 0;
        for (n0 n0Var : this.f62968b) {
            i12 += n0Var.g().length() + n0Var.h().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + i12);
        sb2.append(this.f62967a);
        int L = a00.h0.L(this.f62968b);
        if (L >= 0) {
            while (true) {
                n0 n0Var2 = this.f62968b.get(i11);
                sb2.append("; ");
                sb2.append(n0Var2.g());
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                String h11 = n0Var2.h();
                if (p0.f(h11)) {
                    sb2.append(p0.g(h11));
                } else {
                    sb2.append(h11);
                }
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.m(sb3);
        return sb3;
    }

    public /* synthetic */ o0(String str, List list, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? a00.h0.J() : list);
    }
}
