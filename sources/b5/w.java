package b5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class w implements d5.f<x0, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c7.h f6080a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6081b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<x0> f6082c;

    public w(@m80.k c7.h appRepo) {
        kotlin.jvm.internal.g0.p(appRepo, "appRepo");
        this.f6080a = appRepo;
        this.f6081b = "biz.appinfo.get";
    }

    @Override // d5.f
    @m80.l
    public Object a(@m80.k x0 x0Var, @m80.k j00.c<? super c1> cVar) {
        return new d(this.f6080a.a(), this.f6080a.b());
    }

    @Override // d5.f
    @m80.l
    public f50.e<x0> b() {
        return this.f6082c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6081b;
    }
}
