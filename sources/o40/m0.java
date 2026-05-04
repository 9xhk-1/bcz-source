package o40;

import c40.h1;
import c40.y1;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "TestDispatchers")
@u0({"SMAP\nTestDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestDispatchers.kt\nkotlinx/coroutines/test/TestDispatchers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
/* loaded from: classes8.dex */
public final class m0 {
    @y1
    public static final void a(@m80.k h1 h1Var) {
        p40.h.b(h1Var).a0();
    }

    @y1
    public static final void b(@m80.k h1 h1Var, @m80.k c40.m0 m0Var) {
        if (m0Var instanceof p40.e) {
            throw new IllegalArgumentException("Dispatchers.setMain(Dispatchers.Main) is prohibited, probably Dispatchers.resetMain() should be used instead");
        }
        p40.h.b(h1Var).d0(m0Var);
    }
}
