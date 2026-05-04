package o40;

import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestDispatcher.kt\nkotlinx/coroutines/test/CancellableContinuationRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final c40.n<g2> f75732a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c40.m0 f75733b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@m80.k c40.n<? super g2> nVar, @m80.k c40.m0 m0Var) {
        this.f75732a = nVar;
        this.f75733b = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f75732a.l(this.f75733b, g2.f100423a);
    }
}
