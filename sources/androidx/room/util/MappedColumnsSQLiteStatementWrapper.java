package androidx.room.util;

import a00.k1;
import androidx.annotation.IntRange;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStatementUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/MappedColumnsSQLiteStatementWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n1#2:113\n13467#3,3:114\n*S KotlinDebug\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/MappedColumnsSQLiteStatementWrapper\n*L\n99#1:114,3\n*E\n"})
/* loaded from: classes3.dex */
public final class MappedColumnsSQLiteStatementWrapper implements SQLiteStatement {

    @k
    private final Map<String, Integer> columnNameToIndexMap;

    @k
    private final String[] columnNames;

    @k
    private final SQLiteStatement delegate;

    @k
    private final int[] mapping;

    public MappedColumnsSQLiteStatementWrapper(@k SQLiteStatement delegate, @k String[] columnNames, @k int[] mapping) {
        g0.p(delegate, "delegate");
        g0.p(columnNames, "columnNames");
        g0.p(mapping, "mapping");
        this.delegate = delegate;
        this.columnNames = columnNames;
        this.mapping = mapping;
        if (columnNames.length != mapping.length) {
            throw new IllegalArgumentException("Expected columnNames.size == mapping.size");
        }
        Map g11 = k1.g();
        int length = columnNames.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            g11.put(columnNames[i11], Integer.valueOf(this.mapping[i12]));
            i11++;
            i12++;
        }
        int columnCount = getColumnCount();
        for (int i13 = 0; i13 < columnCount; i13++) {
            if (!g11.containsKey(getColumnName(i13))) {
                g11.put(getColumnName(i13), Integer.valueOf(i13));
            }
        }
        this.columnNameToIndexMap = k1.d(g11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo5620bindBlob(@IntRange(from = 1) int i11, @k byte[] value) {
        g0.p(value, "value");
        this.delegate.mo5620bindBlob(i11, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(@IntRange(from = 1) int i11, boolean z11) {
        this.delegate.bindBoolean(i11, z11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo5621bindDouble(@IntRange(from = 1) int i11, double d11) {
        this.delegate.mo5621bindDouble(i11, d11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(@IntRange(from = 1) int i11, float f11) {
        this.delegate.bindFloat(i11, f11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(@IntRange(from = 1) int i11, int i12) {
        this.delegate.bindInt(i11, i12);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo5622bindLong(@IntRange(from = 1) int i11, long j11) {
        this.delegate.mo5622bindLong(i11, j11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo5623bindNull(@IntRange(from = 1) int i11) {
        this.delegate.mo5623bindNull(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo5624bindText(@IntRange(from = 1) int i11, @k String value) {
        g0.p(value, "value");
        this.delegate.mo5624bindText(i11, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo5625clearBindings() {
        this.delegate.mo5625clearBindings();
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    public byte[] getBlob(@IntRange(from = 0) int i11) {
        return this.delegate.getBlob(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(@IntRange(from = 0) int i11) {
        return this.delegate.getBoolean(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    public final int getColumnIndex(@k String name) {
        g0.p(name, "name");
        Integer num = this.columnNameToIndexMap.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    public String getColumnName(@IntRange(from = 0) int i11) {
        return this.delegate.getColumnName(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    public List<String> getColumnNames() {
        return this.delegate.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(@IntRange(from = 0) int i11) {
        return this.delegate.getColumnType(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(@IntRange(from = 0) int i11) {
        return this.delegate.getDouble(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(@IntRange(from = 0) int i11) {
        return this.delegate.getFloat(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(@IntRange(from = 0) int i11) {
        return this.delegate.getInt(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(@IntRange(from = 0) int i11) {
        return this.delegate.getLong(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    public String getText(@IntRange(from = 0) int i11) {
        return this.delegate.getText(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(@IntRange(from = 0) int i11) {
        return this.delegate.isNull(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.delegate.reset();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.delegate.step();
    }
}
