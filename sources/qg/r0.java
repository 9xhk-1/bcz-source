package qg;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class r0 implements tv.h<q0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<m0> f82153a;

    public r0(tv.t<m0> repoProvider) {
        this.f82153a = repoProvider;
    }

    public static r0 a(tv.t<m0> repoProvider) {
        return new r0(repoProvider);
    }

    public static q0 c(m0 repo) {
        return new q0(repo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q0 get() {
        return c(this.f82153a.get());
    }
}
