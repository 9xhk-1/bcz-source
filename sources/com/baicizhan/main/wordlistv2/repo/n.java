package com.baicizhan.main.wordlistv2.repo;

import android.content.Context;
import com.baicizhan.main.wordlistv2.repo.db.WordListDb;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"dagger.hilt.android.qualifiers.ApplicationContext"})
@x("javax.inject.Singleton")
@tv.e
/* loaded from: classes5.dex */
public final class n implements tv.h<WordListDb> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<Context> f27979a;

    public n(tv.t<Context> appProvider) {
        this.f27979a = appProvider;
    }

    public static n a(tv.t<Context> appProvider) {
        return new n(appProvider);
    }

    public static WordListDb c(Context app2) {
        return (WordListDb) tv.s.f(l.f27976a.b(app2));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WordListDb get() {
        return c(this.f27979a.get());
    }
}
