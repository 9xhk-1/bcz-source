package qg;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class t0 implements tv.h<s0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<m0> f82157a;

    public t0(tv.t<m0> repoProvider) {
        this.f82157a = repoProvider;
    }

    public static t0 a(tv.t<m0> repoProvider) {
        return new t0(repoProvider);
    }

    public static s0 c(m0 repo) {
        return new s0(repo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0 get() {
        return c(this.f82157a.get());
    }
}
