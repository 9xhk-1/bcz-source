package p40;

import c40.h1;
import c40.v2;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestMainDispatcherJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* loaded from: classes8.dex */
public final class h {
    @k
    public static final e b(@k h1 h1Var) {
        v2 e11 = h1.e();
        if (e11 instanceof e) {
            return (e) e11;
        }
        throw new IllegalArgumentException(("TestMainDispatcher is not set as main dispatcher, have " + e11 + " instead.").toString());
    }

    public static final Void c(Throwable th2) {
        throw new IllegalStateException("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", th2);
    }

    public static /* synthetic */ Void d(Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        return c(th2);
    }
}
