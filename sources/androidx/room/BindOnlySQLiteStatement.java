package androidx.room;

import androidx.annotation.IntRange;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final class BindOnlySQLiteStatement implements SQLiteStatement {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final String ONLY_BIND_CALLS_ALLOWED_ERROR = "Only bind*() calls are allowed on the RoomRawQuery received statement.";
    private final /* synthetic */ SQLiteStatement $$delegate_0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public BindOnlySQLiteStatement(@m80.k SQLiteStatement delegate) {
        g0.p(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo5620bindBlob(@IntRange(from = 1) int i11, @m80.k byte[] value) {
        g0.p(value, "value");
        this.$$delegate_0.mo5620bindBlob(i11, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(@IntRange(from = 1) int i11, boolean z11) {
        this.$$delegate_0.bindBoolean(i11, z11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo5621bindDouble(@IntRange(from = 1) int i11, double d11) {
        this.$$delegate_0.mo5621bindDouble(i11, d11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(@IntRange(from = 1) int i11, float f11) {
        this.$$delegate_0.bindFloat(i11, f11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(@IntRange(from = 1) int i11, int i12) {
        this.$$delegate_0.bindInt(i11, i12);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo5622bindLong(@IntRange(from = 1) int i11, long j11) {
        this.$$delegate_0.mo5622bindLong(i11, j11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo5623bindNull(@IntRange(from = 1) int i11) {
        this.$$delegate_0.mo5623bindNull(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo5624bindText(@IntRange(from = 1) int i11, @m80.k String value) {
        g0.p(value, "value");
        this.$$delegate_0.mo5624bindText(i11, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo5625clearBindings() {
        this.$$delegate_0.mo5625clearBindings();
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @m80.k
    public byte[] getBlob(int i11) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(@IntRange(from = 0) int i11) {
        return this.$$delegate_0.getBoolean(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @m80.k
    public String getColumnName(int i11) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @m80.k
    public List<String> getColumnNames() {
        return this.$$delegate_0.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int i11) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i11) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(@IntRange(from = 0) int i11) {
        return this.$$delegate_0.getFloat(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(@IntRange(from = 0) int i11) {
        return this.$$delegate_0.getInt(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i11) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @m80.k
    public String getText(int i11) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i11) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }
}
