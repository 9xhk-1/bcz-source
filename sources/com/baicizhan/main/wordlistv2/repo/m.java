package com.baicizhan.main.wordlistv2.repo;

import com.baicizhan.main.wordlistv2.repo.db.WordListDb;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@x
@tv.e
/* loaded from: classes5.dex */
public final class m implements tv.h<wj.b> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<WordListDb> f27978a;

    public m(tv.t<WordListDb> dbProvider) {
        this.f27978a = dbProvider;
    }

    public static m a(tv.t<WordListDb> dbProvider) {
        return new m(dbProvider);
    }

    public static wj.b c(WordListDb db2) {
        return (wj.b) tv.s.f(l.f27976a.a(db2));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public wj.b get() {
        return c(this.f27978a.get());
    }
}
