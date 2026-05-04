package qg;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class c implements tv.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<m0> f82110a;

    public c(tv.t<m0> repoProvider) {
        this.f82110a = repoProvider;
    }

    public static c a(tv.t<m0> repoProvider) {
        return new c(repoProvider);
    }

    public static a c(m0 repo) {
        return new a(repo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f82110a.get());
    }
}
