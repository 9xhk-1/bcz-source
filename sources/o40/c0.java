package o40;

import h40.k1;
import h40.l1;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineScheduler.kt\nkotlinx/coroutines/test/TestCoroutineSchedulerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,277:1\n1#2:278\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {
    public static final long d(long j11, long j12) {
        long j13 = j11 + j12;
        if (j13 >= 0) {
            return j13;
        }
        return Long.MAX_VALUE;
    }

    public static final void e(@m80.k b0 b0Var, @m80.k kotlin.coroutines.d dVar) {
        b0 b0Var2 = (b0) dVar.get(b0.f75722g);
        if (b0Var2 != null && b0Var2 != b0Var) {
            throw new IllegalStateException("Detected use of different schedulers. If you need to use several test coroutine dispatchers, create one `TestCoroutineScheduler` and pass it to each of them.");
        }
    }

    public static final Void f() {
        g();
        throw new KotlinNothingValueException();
    }

    public static final Void g() {
        throw new IllegalStateException("The test scheduler entered an invalid state. Please report this at https://github.com/Kotlin/kotlinx.coroutines/issues.");
    }

    public static final <T extends l1 & Comparable<? super T>> boolean h(k1<T> k1Var, x00.l<? super T, Boolean> lVar) {
        return k1Var.d(lVar) == null;
    }
}
