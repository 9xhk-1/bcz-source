package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {

    @m80.k
    private final List<Object> bindArgsCache = new ArrayList();

    private final void saveArgsToCache(int i11, Object obj) {
        int size;
        int i12 = i11 - 1;
        if (i12 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i12) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i12) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i12, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i11, @m80.k byte[] value) {
        g0.p(value, "value");
        saveArgsToCache(i11, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i11, double d11) {
        saveArgsToCache(i11, Double.valueOf(d11));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i11, long j11) {
        saveArgsToCache(i11, Long.valueOf(j11));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i11) {
        saveArgsToCache(i11, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i11, @m80.k String value) {
        g0.p(value, "value");
        saveArgsToCache(i11, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
    }

    @m80.k
    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
