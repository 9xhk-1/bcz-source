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
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final t<com.baicizhan.main.activity.mytab.task.data.h> f18819a;

    public f(t<com.baicizhan.main.activity.mytab.task.data.h> tasksRepositoryProvider) {
        this.f18819a = tasksRepositoryProvider;
    }

    public static f a(t<com.baicizhan.main.activity.mytab.task.data.h> tasksRepositoryProvider) {
        return new f(tasksRepositoryProvider);
    }

    public static d c(com.baicizhan.main.activity.mytab.task.data.h tasksRepository) {
        return new d(tasksRepository);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f18819a.get());
    }
}
