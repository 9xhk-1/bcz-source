package androidx.sqlite.db;

import java.util.regex.Pattern;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSupportSQLiteQueryBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.android.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
/* loaded from: classes3.dex */
public final class SupportSQLiteQueryBuilder {

    @k
    public static final Companion Companion = new Companion(null);
    private static final Pattern limitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    @l
    private Object[] bindArgs;

    @l
    private String[] columns;
    private boolean distinct;

    @l
    private String groupBy;

    @l
    private String having;

    @l
    private String limit;

    @l
    private String orderBy;

    @l
    private String selection;

    @k
    private final String table;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public final SupportSQLiteQueryBuilder builder(@k String tableName) {
            g0.p(tableName, "tableName");
            return new SupportSQLiteQueryBuilder(tableName, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SupportSQLiteQueryBuilder(String str, v vVar) {
        this(str);
    }

    private final void appendClause(StringBuilder sb2, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb2.append(str);
        sb2.append(str2);
    }

    private final void appendColumns(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr[i11];
            if (i11 > 0) {
                sb2.append(j2.O);
            }
            sb2.append(str);
        }
        sb2.append(' ');
    }

    @o
    @k
    public static final SupportSQLiteQueryBuilder builder(@k String str) {
        return Companion.builder(str);
    }

    @k
    public final SupportSQLiteQueryBuilder columns(@l String[] strArr) {
        this.columns = strArr;
        return this;
    }

    @k
    public final SupportSQLiteQuery create() {
        String str;
        String str2 = this.groupBy;
        if ((str2 == null || str2.length() == 0) && (str = this.having) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("SELECT ");
        if (this.distinct) {
            sb2.append("DISTINCT ");
        }
        String[] strArr = this.columns;
        if (strArr == null || strArr.length == 0) {
            sb2.append("* ");
        } else {
            g0.m(strArr);
            appendColumns(sb2, strArr);
        }
        sb2.append("FROM ");
        sb2.append(this.table);
        appendClause(sb2, " WHERE ", this.selection);
        appendClause(sb2, " GROUP BY ", this.groupBy);
        appendClause(sb2, " HAVING ", this.having);
        appendClause(sb2, " ORDER BY ", this.orderBy);
        appendClause(sb2, " LIMIT ", this.limit);
        return new SimpleSQLiteQuery(sb2.toString(), this.bindArgs);
    }

    @k
    public final SupportSQLiteQueryBuilder distinct() {
        this.distinct = true;
        return this;
    }

    @k
    public final SupportSQLiteQueryBuilder groupBy(@l String str) {
        this.groupBy = str;
        return this;
    }

    @k
    public final SupportSQLiteQueryBuilder having(@l String str) {
        this.having = str;
        return this;
    }

    @k
    public final SupportSQLiteQueryBuilder limit(@k String limit) {
        g0.p(limit, "limit");
        boolean matches = limitPattern.matcher(limit).matches();
        if (limit.length() == 0 || matches) {
            this.limit = limit;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
    }

    @k
    public final SupportSQLiteQueryBuilder orderBy(@l String str) {
        this.orderBy = str;
        return this;
    }

    @k
    public final SupportSQLiteQueryBuilder selection(@l String str, @l Object[] objArr) {
        this.selection = str;
        this.bindArgs = objArr;
        return this;
    }

    private SupportSQLiteQueryBuilder(String str) {
        this.table = str;
    }
}
