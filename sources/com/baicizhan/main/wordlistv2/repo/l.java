package com.baicizhan.main.wordlistv2.repo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wordlistv2.repo.db.WordListDb;
import javax.inject.Singleton;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@pu.e({fv.a.class})
@nu.h
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final l f27976a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final int f27977b = 0;

    @nu.i
    @m80.k
    public final wj.b a(@m80.k WordListDb db2) {
        g0.p(db2, "db");
        return db2.g();
    }

    @Singleton
    @nu.i
    @m80.k
    public final WordListDb b(@cv.b @m80.k Context app2) {
        g0.p(app2, "app");
        return WordListDb.f27962a.a(app2);
    }
}
