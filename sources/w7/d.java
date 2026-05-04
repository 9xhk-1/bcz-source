package w7;

import a00.l1;
import com.microsoft.thrifty.service.a;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import ws.i;
import x00.p;
import y7.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public y7.d f95463a = new d.a(0, null, null, null, 0, 31, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public x00.a<? extends Map<String, String>> f95464b = new x00.a() { // from class: w7.c
        @Override // x00.a
        public final Object invoke() {
            Map e11;
            e11 = d.e();
            return e11;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public p<? super i, ? super a.InterfaceC0480a, ? extends T> f95465c;

    public static final Map e() {
        return l1.z();
    }

    @k
    public final p<i, a.InterfaceC0480a, T> b() {
        p<? super i, ? super a.InterfaceC0480a, ? extends T> pVar = this.f95465c;
        if (pVar != null) {
            return pVar;
        }
        g0.S("clientBuilder");
        return null;
    }

    @k
    public final x00.a<Map<String, String>> c() {
        return this.f95464b;
    }

    @k
    public final y7.d d() {
        return this.f95463a;
    }

    public final void f(@k p<? super i, ? super a.InterfaceC0480a, ? extends T> pVar) {
        g0.p(pVar, "<set-?>");
        this.f95465c = pVar;
    }

    public final void g(@k x00.a<? extends Map<String, String>> aVar) {
        g0.p(aVar, "<set-?>");
        this.f95464b = aVar;
    }

    public final void h(@k y7.d dVar) {
        g0.p(dVar, "<set-?>");
        this.f95463a = dVar;
    }
}
