package c40;

import c40.n0;
import kotlinx.coroutines.DispatchException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends kotlin.coroutines.a implements n0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.p<kotlin.coroutines.d, Throwable, yz.g2> f7895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.p<? super kotlin.coroutines.d, ? super Throwable, yz.g2> pVar, n0.b bVar) {
            super(bVar);
            this.f7895a = pVar;
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            this.f7895a.invoke(dVar, th2);
        }
    }

    @m80.k
    public static final n0 a(@m80.k x00.p<? super kotlin.coroutines.d, ? super Throwable, yz.g2> pVar) {
        return new a(pVar, n0.f7891d0);
    }

    @g2
    public static final void b(@m80.k kotlin.coroutines.d dVar, @m80.k Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        try {
            n0 n0Var = (n0) dVar.get(n0.f7891d0);
            if (n0Var != null) {
                n0Var.handleException(dVar, th2);
            } else {
                h40.j.a(dVar, th2);
            }
        } catch (Throwable th3) {
            h40.j.a(dVar, c(th2, th3));
        }
    }

    @m80.k
    public static final Throwable c(@m80.k Throwable th2, @m80.k Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        yz.r.a(runtimeException, th2);
        return runtimeException;
    }
}
