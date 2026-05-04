package c40;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x1 {
    @m80.k
    public static final Executor b(@m80.k m0 m0Var) {
        Executor q11;
        v1 v1Var = m0Var instanceof v1 ? (v1) m0Var : null;
        return (v1Var == null || (q11 = v1Var.q()) == null) ? new g1(m0Var) : q11;
    }

    @w00.j(name = "from")
    @m80.k
    public static final m0 c(@m80.k Executor executor) {
        m0 m0Var;
        g1 g1Var = executor instanceof g1 ? (g1) executor : null;
        return (g1Var == null || (m0Var = g1Var.f7861a) == null) ? new w1(executor) : m0Var;
    }

    @w00.j(name = "from")
    @m80.k
    public static final v1 d(@m80.k ExecutorService executorService) {
        return new w1(executorService);
    }

    @y1
    public static /* synthetic */ void a() {
    }
}
