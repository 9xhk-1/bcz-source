package androidx.sqlite;

import androidx.annotation.IntRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSQLiteStatement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLiteStatement.kt\nandroidx/sqlite/SQLiteStatement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
/* loaded from: classes3.dex */
public interface SQLiteStatement extends AutoCloseable {
    /* renamed from: bindBlob */
    void mo5620bindBlob(@IntRange(from = 1) int i11, @k byte[] bArr);

    default void bindBoolean(@IntRange(from = 1) int i11, boolean z11) {
        mo5622bindLong(i11, z11 ? 1L : 0L);
    }

    /* renamed from: bindDouble */
    void mo5621bindDouble(@IntRange(from = 1) int i11, double d11);

    default void bindFloat(@IntRange(from = 1) int i11, float f11) {
        mo5621bindDouble(i11, f11);
    }

    default void bindInt(@IntRange(from = 1) int i11, int i12) {
        mo5622bindLong(i11, i12);
    }

    /* renamed from: bindLong */
    void mo5622bindLong(@IntRange(from = 1) int i11, long j11);

    /* renamed from: bindNull */
    void mo5623bindNull(@IntRange(from = 1) int i11);

    /* renamed from: bindText */
    void mo5624bindText(@IntRange(from = 1) int i11, @k String str);

    /* renamed from: clearBindings */
    void mo5625clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    @k
    byte[] getBlob(@IntRange(from = 0) int i11);

    default boolean getBoolean(@IntRange(from = 0) int i11) {
        return getLong(i11) != 0;
    }

    int getColumnCount();

    @k
    String getColumnName(@IntRange(from = 0) int i11);

    @k
    default List<String> getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i11 = 0; i11 < columnCount; i11++) {
            arrayList.add(getColumnName(i11));
        }
        return arrayList;
    }

    int getColumnType(@IntRange(from = 0) int i11);

    double getDouble(@IntRange(from = 0) int i11);

    default float getFloat(@IntRange(from = 0) int i11) {
        return (float) getDouble(i11);
    }

    default int getInt(@IntRange(from = 0) int i11) {
        return (int) getLong(i11);
    }

    long getLong(@IntRange(from = 0) int i11);

    @k
    String getText(@IntRange(from = 0) int i11);

    boolean isNull(@IntRange(from = 0) int i11);

    void reset();

    boolean step();
}
