package com.baicizhan.main.home.experiment.repo;

import android.content.Context;
import com.baicizhan.client.business.managers.booklist.BookListManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"dagger.hilt.android.qualifiers.ApplicationContext"})
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class e0 implements tv.h<c0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<q9.x> f21489a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<BookListManager> f21490b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<Context> f21491c;

    public e0(tv.t<q9.x> studyMgrProvider, tv.t<BookListManager> bookMgrProvider, tv.t<Context> contextProvider) {
        this.f21489a = studyMgrProvider;
        this.f21490b = bookMgrProvider;
        this.f21491c = contextProvider;
    }

    public static e0 a(tv.t<q9.x> studyMgrProvider, tv.t<BookListManager> bookMgrProvider, tv.t<Context> contextProvider) {
        return new e0(studyMgrProvider, bookMgrProvider, contextProvider);
    }

    public static c0 c(q9.x studyMgr, BookListManager bookMgr, Context context) {
        return new c0(studyMgr, bookMgr, context);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(this.f21489a.get(), this.f21490b.get(), this.f21491c.get());
    }
}
