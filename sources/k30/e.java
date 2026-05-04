package k30;

import e30.r0;
import kotlin.jvm.internal.g0;
import m80.k;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c1 f65739a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r0 f65740b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r0 f65741c;

    public e(@k c1 typeParameter, @k r0 inProjection, @k r0 outProjection) {
        g0.p(typeParameter, "typeParameter");
        g0.p(inProjection, "inProjection");
        g0.p(outProjection, "outProjection");
        this.f65739a = typeParameter;
        this.f65740b = inProjection;
        this.f65741c = outProjection;
    }

    @k
    public final r0 a() {
        return this.f65740b;
    }

    @k
    public final r0 b() {
        return this.f65741c;
    }

    @k
    public final c1 c() {
        return this.f65739a;
    }

    public final boolean d() {
        return f30.e.f50430a.a(this.f65740b, this.f65741c);
    }
}
