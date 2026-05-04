package kotlin.time;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.time.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f67755a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67756b;

    public /* synthetic */ c(m mVar, long j11, v vVar) {
        this(mVar, j11);
    }

    @Override // kotlin.time.m
    public long a() {
        return e.S(this.f67755a.a(), this.f67756b);
    }

    @Override // kotlin.time.m
    public /* bridge */ boolean b() {
        return m.a.a(this);
    }

    @Override // kotlin.time.m
    public /* bridge */ boolean c() {
        return m.a.b(this);
    }

    public final long d() {
        return this.f67756b;
    }

    @m80.k
    public final m e() {
        return this.f67755a;
    }

    @Override // kotlin.time.m
    @m80.k
    public m h(long j11) {
        return new c(this.f67755a, e.T(this.f67756b, j11), null);
    }

    @Override // kotlin.time.m
    @m80.k
    public /* bridge */ m j(long j11) {
        return m.a.c(this, j11);
    }

    public c(m mark, long j11) {
        g0.p(mark, "mark");
        this.f67755a = mark;
        this.f67756b = j11;
    }
}
