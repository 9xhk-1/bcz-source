package j;

import j.t;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class z<R> implements y, x<R> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t.b f63098a;

    public z(@m80.k t.b transaction) {
        g0.p(transaction, "transaction");
        this.f63098a = transaction;
    }

    @Override // j.y
    /* renamed from: a, reason: collision with other method in class */
    public void mo6305a(@m80.k x00.l<? super y, g2> body) {
        g0.p(body, "body");
        u r11 = this.f63098a.r();
        g0.n(r11, "null cannot be cast to non-null type app.cash.sqldelight.Transacter");
        ((t) r11).m(false, body);
    }

    @Override // j.x
    @m80.k
    public Void b(R r11) {
        this.f63098a.g();
        throw new l(r11);
    }

    @Override // j.w
    public void d(@m80.k x00.a<g2> function) {
        g0.p(function, "function");
        this.f63098a.d(function);
    }

    @Override // j.w
    public void e(@m80.k x00.a<g2> function) {
        g0.p(function, "function");
        this.f63098a.e(function);
    }

    @m80.k
    public final t.b g() {
        return this.f63098a;
    }

    @Override // j.y
    @m80.k
    public Void rollback() {
        this.f63098a.g();
        throw new l(null, 1, null);
    }

    @Override // j.x
    public <R> R a(@m80.k x00.l<? super x<R>, ? extends R> body) {
        g0.p(body, "body");
        u r11 = this.f63098a.r();
        g0.n(r11, "null cannot be cast to non-null type app.cash.sqldelight.Transacter");
        return (R) ((t) r11).n(false, body);
    }
}
