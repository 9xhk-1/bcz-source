package qg;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x("javax.inject.Singleton")
@tv.e
/* loaded from: classes4.dex */
public final class f implements tv.h<l0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.plan.module.exam.a> f82117a;

    public f(tv.t<com.baicizhan.main.home.plan.module.exam.a> jsBridgeProvider) {
        this.f82117a = jsBridgeProvider;
    }

    public static f a(tv.t<com.baicizhan.main.home.plan.module.exam.a> jsBridgeProvider) {
        return new f(jsBridgeProvider);
    }

    public static l0 b(com.baicizhan.main.home.plan.module.exam.a jsBridge) {
        return (l0) tv.s.f(d.f82112a.b(jsBridge));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return b(this.f82117a.get());
    }
}
