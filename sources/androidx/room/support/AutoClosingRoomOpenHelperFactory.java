package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class AutoClosingRoomOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    @m80.k
    private final AutoCloser autoCloser;

    @m80.k
    private final SupportSQLiteOpenHelper.Factory delegate;

    public AutoClosingRoomOpenHelperFactory(@m80.k SupportSQLiteOpenHelper.Factory delegate, @m80.k AutoCloser autoCloser) {
        g0.p(delegate, "delegate");
        g0.p(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @m80.k
    public AutoClosingRoomOpenHelper create(@m80.k SupportSQLiteOpenHelper.Configuration configuration) {
        g0.p(configuration, "configuration");
        return new AutoClosingRoomOpenHelper(this.delegate.create(configuration), this.autoCloser);
    }
}
