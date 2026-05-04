package l00;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i implements j00.c<g2> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Result<g2> f69119a;

    public final void b() {
        synchronized (this) {
            while (true) {
                try {
                    Result<g2> result = this.f69119a;
                    if (result == null) {
                        g0.n(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        kotlin.e.n(result.m6317unboximpl());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @m80.l
    public final Result<g2> c() {
        return this.f69119a;
    }

    public final void d(@m80.l Result<g2> result) {
        this.f69119a = result;
    }

    @Override // j00.c
    @m80.k
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // j00.c
    public void resumeWith(@m80.k Object obj) {
        synchronized (this) {
            this.f69119a = Result.m6307boximpl(obj);
            g0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            g2 g2Var = g2.f100423a;
        }
    }
}
