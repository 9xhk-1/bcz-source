package c40;

import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
/* loaded from: classes8.dex */
public final class d3<T> extends q2 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final p<T> f7832e;

    /* JADX WARN: Multi-variable type inference failed */
    public d3(@m80.k p<? super T> pVar) {
        this.f7832e = pVar;
    }

    @Override // c40.q2
    public boolean C() {
        return false;
    }

    @Override // c40.q2
    public void D(@m80.l Throwable th2) {
        Object f12 = B().f1();
        if (f12 instanceof c0) {
            p<T> pVar = this.f7832e;
            Result.a aVar = Result.Companion;
            pVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(((c0) f12).f7827a)));
        } else {
            p<T> pVar2 = this.f7832e;
            Result.a aVar2 = Result.Companion;
            pVar2.resumeWith(Result.m6308constructorimpl(s2.h(f12)));
        }
    }
}
