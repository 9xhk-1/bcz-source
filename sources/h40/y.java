package h40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
/* loaded from: classes8.dex */
public final class y {
    public static final void a(int i11) {
        if (i11 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i11).toString());
    }

    @m80.k
    public static final c40.m0 b(@m80.k c40.m0 m0Var, @m80.l String str) {
        return str != null ? new m0(m0Var, str) : m0Var;
    }
}
