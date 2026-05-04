package androidx.sqlite.db;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {

    @k
    public static final Companion Companion = new Companion(null);

    @l
    private final Object[] bindArgs;

    @k
    private final String query;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        public final void bind(@k SupportSQLiteProgram statement, @l Object[] objArr) {
            g0.p(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i11 = 0;
            while (i11 < length) {
                Object obj = objArr[i11];
                i11++;
                bind(statement, i11, obj);
            }
        }

        private Companion() {
        }

        private final void bind(SupportSQLiteProgram supportSQLiteProgram, int i11, Object obj) {
            if (obj == null) {
                supportSQLiteProgram.bindNull(i11);
                return;
            }
            if (obj instanceof byte[]) {
                supportSQLiteProgram.bindBlob(i11, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                supportSQLiteProgram.bindDouble(i11, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                supportSQLiteProgram.bindDouble(i11, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                supportSQLiteProgram.bindLong(i11, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                supportSQLiteProgram.bindLong(i11, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                supportSQLiteProgram.bindLong(i11, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                supportSQLiteProgram.bindLong(i11, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                supportSQLiteProgram.bindString(i11, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                supportSQLiteProgram.bindLong(i11, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i11 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }
    }

    public SimpleSQLiteQuery(@k String query, @l Object[] objArr) {
        g0.p(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    @o
    public static final void bind(@k SupportSQLiteProgram supportSQLiteProgram, @l Object[] objArr) {
        Companion.bind(supportSQLiteProgram, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@k SupportSQLiteProgram statement) {
        g0.p(statement, "statement");
        Companion.bind(statement, this.bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        Object[] objArr = this.bindArgs;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @k
    public String getSql() {
        return this.query;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(@k String query) {
        this(query, null);
        g0.p(query, "query");
    }
}
