package com.baicizhan.main.home.plan.newexam;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class e2 implements tv.h<ExamVM> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<qg.a> f22642a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<qg.s0> f22643b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<qg.l0> f22644c;

    /* renamed from: d, reason: collision with root package name */
    public final tv.t<u9.f> f22645d;

    public e2(tv.t<qg.a> doExamStateRefreshUCProvider, tv.t<qg.s0> getExamStateUCProvider, tv.t<qg.l0> jsMgrProvider, tv.t<u9.f> taksRepoProvider) {
        this.f22642a = doExamStateRefreshUCProvider;
        this.f22643b = getExamStateUCProvider;
        this.f22644c = jsMgrProvider;
        this.f22645d = taksRepoProvider;
    }

    public static e2 a(tv.t<qg.a> doExamStateRefreshUCProvider, tv.t<qg.s0> getExamStateUCProvider, tv.t<qg.l0> jsMgrProvider, tv.t<u9.f> taksRepoProvider) {
        return new e2(doExamStateRefreshUCProvider, getExamStateUCProvider, jsMgrProvider, taksRepoProvider);
    }

    public static ExamVM c(qg.a doExamStateRefreshUC, qg.s0 getExamStateUC, qg.l0 jsMgr, u9.f taksRepo) {
        return new ExamVM(doExamStateRefreshUC, getExamStateUC, jsMgr, taksRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExamVM get() {
        return c(this.f22642a.get(), this.f22643b.get(), this.f22644c.get(), this.f22645d.get());
    }
}
