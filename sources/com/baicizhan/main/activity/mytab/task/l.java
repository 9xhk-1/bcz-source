package com.baicizhan.main.activity.mytab.task;

import com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class l implements tv.h<TaskVM> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.activity.mytab.task.data.g> f18847a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.activity.mytab.task.data.h> f18848b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.activity.mytab.task.domain.b> f18849c;

    /* renamed from: d, reason: collision with root package name */
    public final tv.t<DoReceiveAwardUC> f18850d;

    /* renamed from: e, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.activity.mytab.task.domain.d> f18851e;

    public l(tv.t<com.baicizhan.main.activity.mytab.task.data.g> achievementProvider, tv.t<com.baicizhan.main.activity.mytab.task.data.h> taskRepositoryProvider, tv.t<com.baicizhan.main.activity.mytab.task.domain.b> doSynUCProvider, tv.t<DoReceiveAwardUC> doReceiveAwardUCProvider, tv.t<com.baicizhan.main.activity.mytab.task.domain.d> getCoinTaskCentersProvider) {
        this.f18847a = achievementProvider;
        this.f18848b = taskRepositoryProvider;
        this.f18849c = doSynUCProvider;
        this.f18850d = doReceiveAwardUCProvider;
        this.f18851e = getCoinTaskCentersProvider;
    }

    public static l a(tv.t<com.baicizhan.main.activity.mytab.task.data.g> achievementProvider, tv.t<com.baicizhan.main.activity.mytab.task.data.h> taskRepositoryProvider, tv.t<com.baicizhan.main.activity.mytab.task.domain.b> doSynUCProvider, tv.t<DoReceiveAwardUC> doReceiveAwardUCProvider, tv.t<com.baicizhan.main.activity.mytab.task.domain.d> getCoinTaskCentersProvider) {
        return new l(achievementProvider, taskRepositoryProvider, doSynUCProvider, doReceiveAwardUCProvider, getCoinTaskCentersProvider);
    }

    public static TaskVM c(com.baicizhan.main.activity.mytab.task.data.g achievement, com.baicizhan.main.activity.mytab.task.data.h taskRepository, com.baicizhan.main.activity.mytab.task.domain.b doSynUC, DoReceiveAwardUC doReceiveAwardUC, com.baicizhan.main.activity.mytab.task.domain.d getCoinTaskCenters) {
        return new TaskVM(achievement, taskRepository, doSynUC, doReceiveAwardUC, getCoinTaskCenters);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TaskVM get() {
        return c(this.f18847a.get(), this.f18848b.get(), this.f18849c.get(), this.f18850d.get(), this.f18851e.get());
    }
}
