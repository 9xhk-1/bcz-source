package s20;

import a00.h0;
import e30.r0;
import e30.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f87462a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p10.a0 f87463b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ArrayList<r0> f87464c;

    @Override // e30.u1
    @m80.k
    public Collection<r0> c() {
        return this.f87464c;
    }

    @Override // e30.u1
    @m80.k
    public u1 d(@m80.k f30.g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @m80.l
    public Void e() {
        return null;
    }

    @Override // e30.u1
    @m80.k
    public List<c1> getParameters() {
        return h0.J();
    }

    @Override // e30.u1
    @m80.k
    public n10.j q() {
        return this.f87463b.q();
    }

    @Override // e30.u1
    public /* bridge */ /* synthetic */ p10.d r() {
        return (p10.d) e();
    }

    @Override // e30.u1
    public boolean s() {
        return false;
    }

    @m80.k
    public String toString() {
        return "IntegerValueType(" + this.f87462a + ')';
    }
}
