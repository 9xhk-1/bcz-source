package j;

import j.t;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class s<R> implements r, q<R> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t.b f63089a;

    public s(@m80.k t.b transaction) {
        g0.p(transaction, "transaction");
        this.f63089a = transaction;
    }

    @Override // j.q
    @m80.k
    public Void b(R r11) {
        this.f63089a.g();
        throw new l(r11);
    }

    @Override // j.q
    @m80.l
    public <R> Object c(@m80.k x00.p<? super q<R>, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        u r11 = this.f63089a.r();
        g0.n(r11, "null cannot be cast to non-null type app.cash.sqldelight.SuspendingTransacter");
        return ((o) r11).s(false, pVar, cVar);
    }

    @Override // j.w
    public void d(@m80.k x00.a<g2> function) {
        g0.p(function, "function");
        this.f63089a.d(function);
    }

    @Override // j.w
    public void e(@m80.k x00.a<g2> function) {
        g0.p(function, "function");
        this.f63089a.e(function);
    }

    @Override // j.r
    @m80.l
    public Object f(@m80.k x00.p<? super r, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        u r11 = this.f63089a.r();
        g0.n(r11, "null cannot be cast to non-null type app.cash.sqldelight.SuspendingTransacter");
        Object a11 = ((o) r11).a(false, pVar, cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @m80.k
    public final t.b g() {
        return this.f63089a;
    }

    @Override // j.r
    @m80.k
    public Void rollback() {
        this.f63089a.g();
        throw new l(null, 1, null);
    }
}
