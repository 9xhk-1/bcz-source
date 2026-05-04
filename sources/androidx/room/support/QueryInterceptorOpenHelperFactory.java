package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import c40.r0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class QueryInterceptorOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    @m80.k
    private final SupportSQLiteOpenHelper.Factory delegate;

    @m80.k
    private final RoomDatabase.QueryCallback queryCallback;

    @m80.k
    private final r0 queryCallbackScope;

    public QueryInterceptorOpenHelperFactory(@m80.k SupportSQLiteOpenHelper.Factory delegate, @m80.k r0 queryCallbackScope, @m80.k RoomDatabase.QueryCallback queryCallback) {
        g0.p(delegate, "delegate");
        g0.p(queryCallbackScope, "queryCallbackScope");
        g0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @m80.k
    public SupportSQLiteOpenHelper create(@m80.k SupportSQLiteOpenHelper.Configuration configuration) {
        g0.p(configuration, "configuration");
        return new QueryInterceptorOpenHelper(this.delegate.create(configuration), this.queryCallbackScope, this.queryCallback);
    }
}
