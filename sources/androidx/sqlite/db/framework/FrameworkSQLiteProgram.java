package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {

    @k
    private final SQLiteProgram delegate;

    public FrameworkSQLiteProgram(@k SQLiteProgram delegate) {
        g0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i11, @k byte[] value) {
        g0.p(value, "value");
        this.delegate.bindBlob(i11, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i11, double d11) {
        this.delegate.bindDouble(i11, d11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i11, long j11) {
        this.delegate.bindLong(i11, j11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i11) {
        this.delegate.bindNull(i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i11, @k String value) {
        g0.p(value, "value");
        this.delegate.bindString(i11, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }
}
