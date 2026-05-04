package com.baicizhan.main.activity.mytab.task.domain;

import tv.h;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@tv.e
/* loaded from: classes4.dex */
public final class a implements h<DoReceiveAwardUC> {

    /* renamed from: a, reason: collision with root package name */
    public final t<com.baicizhan.main.activity.mytab.task.data.h> f18806a;

    public a(t<com.baicizhan.main.activity.mytab.task.data.h> tasksRepoProvider) {
        this.f18806a = tasksRepoProvider;
    }

    public static a a(t<com.baicizhan.main.activity.mytab.task.data.h> tasksRepoProvider) {
        return new a(tasksRepoProvider);
    }

    public static DoReceiveAwardUC c(com.baicizhan.main.activity.mytab.task.data.h tasksRepo) {
        return new DoReceiveAwardUC(tasksRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DoReceiveAwardUC get() {
        return c(this.f18806a.get());
    }
}
