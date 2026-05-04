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
public final class a implements h<ExpImpl> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.managers.experience.data.remote.a$a, reason: collision with other inner class name */
    public static final class C0268a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16461a = new a();
    }

    public static a a() {
        return C0268a.f16461a;
    }

    public static ExpImpl c() {
        return new ExpImpl();
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpImpl get() {
        return c();
    }
}
