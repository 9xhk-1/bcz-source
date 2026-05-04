package com.baicizhan.main.activity.mytab.task.domain;

import com.baicizhan.main.activity.mytab.task.data.g;
import tv.h;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@tv.e
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final t<g> f18811a;

    /* renamed from: b, reason: collision with root package name */
    public final t<com.baicizhan.main.activity.mytab.task.data.h> f18812b;

    public c(t<g> achievementRepoProvider, t<com.baicizhan.main.activity.mytab.task.data.h> tasksRepoProvider) {
        this.f18811a = achievementRepoProvider;
        this.f18812b = tasksRepoProvider;
    }

    public static c a(t<g> achievementRepoProvider, t<com.baicizhan.main.activity.mytab.task.data.h> tasksRepoProvider) {
        return new c(achievementRepoProvider, tasksRepoProvider);
    }

    public static b c(g achievementRepo, com.baicizhan.main.activity.mytab.task.data.h tasksRepo) {
        return new b(achievementRepo, tasksRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f18811a.get(), this.f18812b.get());
    }
}
