package j40;

import c40.g2;
import c40.i1;
import c40.m0;
import c40.v1;
import g10.u;
import h40.a1;
import h40.c1;
import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends v1 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f63183b = new a();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final m0 f63184c;

    static {
        int e11;
        j jVar = j.f63203a;
        e11 = c1.e(i1.f7868a, u.u(64, a1.a()), 0, 0, 12, null);
        f63184c = m0.limitedParallelism$default(jVar, e11, null, 2, null);
    }

    @Override // c40.v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        f63184c.dispatch(dVar, runnable);
    }

    @Override // c40.m0
    @g2
    public void dispatchYield(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        f63184c.dispatchYield(dVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@m80.k Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // c40.m0
    @m80.k
    public m0 limitedParallelism(int i11, @m80.l String str) {
        return j.f63203a.limitedParallelism(i11, str);
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // c40.v1
    @m80.k
    public Executor q() {
        return this;
    }
}
