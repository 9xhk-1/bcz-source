package com.baicizhan.client.business.managers.experience.data.remote;

import tv.e;
import tv.h;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@e
/* loaded from: classes4.dex */
public final class d implements h<TaskImpl> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f16462a = new d();
    }

    public static d a() {
        return a.f16462a;
    }

    public static TaskImpl c() {
        return new TaskImpl();
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TaskImpl get() {
        return c();
    }
}
