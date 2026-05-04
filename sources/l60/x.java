package l60;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class x extends i1 {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public i1 f70505g;

    public x(@m80.k i1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f70505g = delegate;
    }

    @Override // l60.i1
    public void a(@m80.k Condition condition) {
        kotlin.jvm.internal.g0.p(condition, "condition");
        this.f70505g.a(condition);
    }

    @Override // l60.i1
    public void b() {
        this.f70505g.b();
    }

    @Override // l60.i1
    @m80.k
    public i1 c() {
        return this.f70505g.c();
    }

    @Override // l60.i1
    @m80.k
    public i1 d() {
        return this.f70505g.d();
    }

    @Override // l60.i1
    public long f() {
        return this.f70505g.f();
    }

    @Override // l60.i1
    @m80.k
    public i1 g(long j11) {
        return this.f70505g.g(j11);
    }

    @Override // l60.i1
    public boolean h() {
        return this.f70505g.h();
    }

    @Override // l60.i1
    public void j() throws IOException {
        this.f70505g.j();
    }

    @Override // l60.i1
    @m80.k
    public i1 k(long j11, @m80.k TimeUnit unit) {
        kotlin.jvm.internal.g0.p(unit, "unit");
        return this.f70505g.k(j11, unit);
    }

    @Override // l60.i1
    public long l() {
        return this.f70505g.l();
    }

    @Override // l60.i1
    public void m(@m80.k Object monitor) {
        kotlin.jvm.internal.g0.p(monitor, "monitor");
        this.f70505g.m(monitor);
    }

    @w00.j(name = "delegate")
    @m80.k
    public final i1 n() {
        return this.f70505g;
    }

    @m80.k
    public final x o(@m80.k i1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f70505g = delegate;
        return this;
    }

    public final /* synthetic */ void p(i1 i1Var) {
        kotlin.jvm.internal.g0.p(i1Var, "<set-?>");
        this.f70505g = i1Var;
    }
}
