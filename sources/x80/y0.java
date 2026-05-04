package x80;

import ha0.r;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;
import w80.l2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ha0.r<l2> f97903a = ha0.r.b().c(new y80.d()).e(new Function() { // from class: x80.t0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return y0.d((r.d) obj);
        }
    }).e(new Function() { // from class: x80.u0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return y0.c((r.d) obj);
        }
    }).f(new Function() { // from class: x80.v0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return y0.b((r.d) obj);
        }
    }).f(new Function() { // from class: x80.w0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return y0.a((r.d) obj);
        }
    }).f(new Function() { // from class: x80.x0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return y0.e((r.d) obj);
        }
    }).g();

    public static /* synthetic */ TestDescriptor.a a(r.d dVar) {
        return new n1(((l2) dVar.c()).J());
    }

    public static /* synthetic */ TestDescriptor.a b(r.d dVar) {
        return new x(((l2) dVar.c()).J());
    }

    public static /* synthetic */ ha0.u c(r.d dVar) {
        return new a2(((l2) dVar.c()).J());
    }

    public static /* synthetic */ ha0.u d(r.d dVar) {
        return new m0(dVar.a(), ((l2) dVar.c()).J());
    }

    public static /* synthetic */ TestDescriptor.a e(r.d dVar) {
        return new TestDescriptor.a() { // from class: x80.s0
            @Override // org.junit.platform.engine.TestDescriptor.a
            public final void a(TestDescriptor testDescriptor) {
                testDescriptor.m();
            }
        };
    }

    public void f(ca0.q request, l2 engineDescriptor) {
        f97903a.d(request, engineDescriptor);
    }
}
