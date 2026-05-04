package c40;

import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e3 extends q2 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final j00.c<yz.g2> f7842e;

    /* JADX WARN: Multi-variable type inference failed */
    public e3(@m80.k j00.c<? super yz.g2> cVar) {
        this.f7842e = cVar;
    }

    @Override // c40.q2
    public boolean C() {
        return false;
    }

    @Override // c40.q2
    public void D(@m80.l Throwable th2) {
        j00.c<yz.g2> cVar = this.f7842e;
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m6308constructorimpl(yz.g2.f100423a));
    }
}
