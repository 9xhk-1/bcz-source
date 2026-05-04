package ow;

import a00.w1;
import c40.k1;
import c40.l2;
import io.ktor.utils.io.b0;
import ix.q0;
import ix.r0;
import ix.y0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nio/ktor/client/engine/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1#2:109\n1863#3,2:110\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nio/ktor/client/engine/UtilsKt\n*L\n47#1:110,2\n*E\n"})
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f78466a = "ktor-client";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Set<String> f78467b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k1 f78468a;

        public a(k1 k1Var) {
            this.f78468a = k1Var;
        }

        public final void a(Throwable th2) {
            this.f78468a.dispose();
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            a(th2);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l2 f78469a;

        public b(l2 l2Var) {
            this.f78469a = l2Var;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                return;
            }
            this.f78469a.cancel(new CancellationException(th2.getMessage()));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            a(th2);
            return g2.f100423a;
        }
    }

    static {
        y0 y0Var = y0.f63006a;
        f78467b = w1.u(y0Var.G(), y0Var.L(), y0Var.X(), y0Var.S(), y0Var.W());
    }

    @m80.l
    public static final Object c(@m80.k l2 l2Var, @m80.k j00.c<? super g2> cVar) {
        l2 l2Var2 = (l2) cVar.getContext().get(l2.f7886e0);
        if (l2Var2 == null) {
            return g2.f100423a;
        }
        l2Var.z0(new a(l2.a.g(l2Var2, true, false, new b(l2Var), 2, null)));
        return g2.f100423a;
    }

    public static final Object d(l2 l2Var, j00.c<? super g2> cVar) {
        d0.e(3);
        throw null;
    }

    @m80.l
    @b0
    public static final Object e(@m80.k j00.c<? super kotlin.coroutines.d> cVar) {
        d.b bVar = cVar.getContext().get(o.f78459b);
        g0.m(bVar);
        return ((o) bVar).b();
    }

    @m80.k
    public static final String f() {
        return f78466a;
    }

    @b0
    public static final void h(@m80.k final q0 requestHeaders, @m80.k final v content, @m80.k final x00.p<? super String, ? super String, g2> block) {
        String str;
        String str2;
        g0.p(requestHeaders, "requestHeaders");
        g0.p(content, "content");
        g0.p(block, "block");
        fx.k.b(new x00.l() { // from class: ow.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i11;
                i11 = u.i(q0.this, content, (r0) obj);
                return i11;
            }
        }).d(new x00.p() { // from class: ow.t
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 j11;
                j11 = u.j(x00.p.this, (String) obj, (List) obj2);
                return j11;
            }
        });
        y0 y0Var = y0.f63006a;
        if (requestHeaders.get(y0Var.L0()) == null && content.d().get(y0Var.L0()) == null && k()) {
            block.invoke(y0Var.L0(), f78466a);
        }
        ix.k b11 = content.b();
        if ((b11 == null || (str = b11.toString()) == null) && (str = content.d().get(y0Var.C())) == null) {
            str = requestHeaders.get(y0Var.C());
        }
        Long a11 = content.a();
        if ((a11 == null || (str2 = a11.toString()) == null) && (str2 = content.d().get(y0Var.z())) == null) {
            str2 = requestHeaders.get(y0Var.z());
        }
        if (str != null) {
            block.invoke(y0Var.C(), str);
        }
        if (str2 != null) {
            block.invoke(y0Var.z(), str2);
        }
    }

    public static final g2 i(q0 q0Var, v vVar, r0 buildHeaders) {
        g0.p(buildHeaders, "$this$buildHeaders");
        buildHeaders.j(q0Var);
        buildHeaders.j(vVar.d());
        return g2.f100423a;
    }

    public static final g2 j(x00.p pVar, String key, List values) {
        g0.p(key, "key");
        g0.p(values, "values");
        y0 y0Var = y0.f63006a;
        if (g0.g(y0Var.z(), key)) {
            return g2.f100423a;
        }
        if (g0.g(y0Var.C(), key)) {
            return g2.f100423a;
        }
        if (f78467b.contains(key)) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                pVar.invoke(key, (String) it.next());
            }
        } else {
            pVar.invoke(key, a00.r0.r3(values, g0.g(y0Var.D(), key) ? "; " : ",", null, null, 0, null, null, 62, null));
        }
        return g2.f100423a;
    }

    public static final boolean k() {
        return !io.ktor.util.a.f61985a.a();
    }

    @b0
    public static /* synthetic */ void g() {
    }
}
