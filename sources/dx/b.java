package dx;

import a00.a0;
import io.ktor.utils.io.b0;
import ix.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import y40.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n1863#2,2:236\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormBuilder\n*L\n150#1:236,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<q<?>> f48204a = new ArrayList();

    public static /* synthetic */ void l(b bVar, String str, a aVar, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.b(str, aVar, q0Var);
    }

    public static /* synthetic */ void m(b bVar, String str, r rVar, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.c(str, rVar, q0Var);
    }

    public static /* synthetic */ void n(b bVar, String str, Iterable iterable, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.d(str, iterable, q0Var);
    }

    public static /* synthetic */ void o(b bVar, String str, Number number, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.e(str, number, q0Var);
    }

    public static /* synthetic */ void p(b bVar, String str, Object obj, q0 q0Var, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.f(str, obj, q0Var);
    }

    public static /* synthetic */ void q(b bVar, String str, String str2, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.g(str, str2, q0Var);
    }

    public static /* synthetic */ void r(b bVar, String str, c0 c0Var, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.h(str, c0Var, q0Var);
    }

    public static /* synthetic */ void s(b bVar, String str, boolean z11, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.i(str, z11, q0Var);
    }

    public static /* synthetic */ void t(b bVar, String str, byte[] bArr, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.j(str, bArr, q0Var);
    }

    public static /* synthetic */ void u(b bVar, String str, String[] strArr, q0 q0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            q0Var = q0.f62976a.b();
        }
        bVar.k(str, strArr, q0Var);
    }

    public static /* synthetic */ void w(b bVar, String str, q0 q0Var, Long l11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            q0Var = q0.f62976a.b();
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        bVar.v(str, q0Var, l11, aVar);
    }

    public final <T> void a(@m80.k q<T> part) {
        g0.p(part, "part");
        this.f48204a.add(part);
    }

    public final void b(@m80.k String key, @m80.k a value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        this.f48204a.add(new q<>(key, value, headers));
    }

    public final void c(@m80.k String key, @m80.k r value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        this.f48204a.add(new q<>(key, value, headers));
    }

    public final void d(@m80.k String key, @m80.k Iterable<String> values, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(values, "values");
        g0.p(headers, "headers");
        if (f0.b2(key, okhttp3.i.f77289p, false, 2, null)) {
            Iterator<String> it = values.iterator();
            while (it.hasNext()) {
                this.f48204a.add(new q<>(key, it.next(), headers));
            }
            return;
        }
        throw new IllegalArgumentException(("Array parameter must be suffixed with square brackets ie `" + key + "[]`").toString());
    }

    public final void e(@m80.k String key, @m80.k Number value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        this.f48204a.add(new q<>(key, value, headers));
    }

    @b0
    public final <T> void f(@m80.k String key, @m80.k T value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        this.f48204a.add(new q<>(key, value, headers));
    }

    public final void g(@m80.k String key, @m80.k String value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        this.f48204a.add(new q<>(key, value, headers));
    }

    public final void h(@m80.k String key, @m80.k c0 value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        this.f48204a.add(new q<>(key, value, headers));
    }

    public final void i(@m80.k String key, boolean z11, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(headers, "headers");
        this.f48204a.add(new q<>(key, Boolean.valueOf(z11), headers));
    }

    public final void j(@m80.k String key, @m80.k byte[] value, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(value, "value");
        g0.p(headers, "headers");
        this.f48204a.add(new q<>(key, value, headers));
    }

    public final void k(@m80.k String key, @m80.k String[] values, @m80.k q0 headers) {
        g0.p(key, "key");
        g0.p(values, "values");
        g0.p(headers, "headers");
        d(key, a0.K5(values), headers);
    }

    public final void v(@m80.k String key, @m80.k q0 headers, @m80.l Long l11, @m80.k x00.a<? extends c0> block) {
        g0.p(key, "key");
        g0.p(headers, "headers");
        g0.p(block, "block");
        this.f48204a.add(new q<>(key, new r(l11, block), headers));
    }

    @m80.k
    public final List<q<?>> x() {
        return this.f48204a;
    }
}
