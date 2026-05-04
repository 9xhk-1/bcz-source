package u0;

import java.io.IOException;
import kotlin.Result;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n implements t50.c, x00.l<Throwable, g2> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t50.b f91460a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c40.n<okhttp3.n> f91461b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@m80.k t50.b bVar, @m80.k c40.n<? super okhttp3.n> nVar) {
        this.f91460a = bVar;
        this.f91461b = nVar;
    }

    public void a(@m80.l Throwable th2) {
        try {
            this.f91460a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // t50.c
    public void c(@m80.k t50.b bVar, @m80.k okhttp3.n nVar) {
        c40.n<okhttp3.n> nVar2 = this.f91461b;
        Result.a aVar = Result.Companion;
        nVar2.resumeWith(Result.m6308constructorimpl(nVar));
    }

    @Override // t50.c
    public void d(@m80.k t50.b bVar, @m80.k IOException iOException) {
        if (bVar.isCanceled()) {
            return;
        }
        c40.n<okhttp3.n> nVar = this.f91461b;
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(iOException)));
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
        a(th2);
        return g2.f100423a;
    }
}
