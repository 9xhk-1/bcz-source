package c40;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g1 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final m0 f7861a;

    public g1(@m80.k m0 m0Var) {
        this.f7861a = m0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@m80.k Runnable runnable) {
        m0 m0Var = this.f7861a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (h40.m.f(m0Var, emptyCoroutineContext)) {
            h40.m.e(this.f7861a, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    @m80.k
    public String toString() {
        return this.f7861a.toString();
    }
}
