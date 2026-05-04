package androidx.sqlite.db;

import java.io.Closeable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface SupportSQLiteProgram extends Closeable {
    void bindBlob(int i11, @k byte[] bArr);

    void bindDouble(int i11, double d11);

    void bindLong(int i11, long j11);

    void bindNull(int i11);

    void bindString(int i11, @k String str);

    void clearBindings();
}
