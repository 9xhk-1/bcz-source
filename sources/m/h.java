package m;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidSqliteDriver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSqliteDriver.kt\napp/cash/sqldelight/driver/android/AndroidQuery\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n1#2:353\n*E\n"})
/* loaded from: classes3.dex */
public final class h implements SupportSQLiteQuery, p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f71735a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final SupportSQLiteDatabase f71736b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71737c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Long f71738d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<x00.l<SupportSQLiteProgram, g2>> f71739e;

    public h(@m80.k String sql, @m80.k SupportSQLiteDatabase database, int i11, @m80.l Long l11) {
        g0.p(sql, "sql");
        g0.p(database, "database");
        this.f71735a = sql;
        this.f71736b = database;
        this.f71737c = i11;
        this.f71738d = l11;
        int argCount = getArgCount();
        ArrayList arrayList = new ArrayList(argCount);
        for (int i12 = 0; i12 < argCount; i12++) {
            arrayList.add(null);
        }
        this.f71739e = arrayList;
    }

    public static final g2 k(Boolean bool, int i11, SupportSQLiteProgram it) {
        g0.p(it, "it");
        if (bool == null) {
            it.bindNull(i11 + 1);
        } else {
            it.bindLong(i11 + 1, bool.booleanValue() ? 1L : 0L);
        }
        return g2.f100423a;
    }

    public static final g2 l(byte[] bArr, int i11, SupportSQLiteProgram it) {
        g0.p(it, "it");
        int i12 = i11 + 1;
        if (bArr == null) {
            it.bindNull(i12);
        } else {
            it.bindBlob(i12, bArr);
        }
        return g2.f100423a;
    }

    public static final g2 m(Double d11, int i11, SupportSQLiteProgram it) {
        g0.p(it, "it");
        int i12 = i11 + 1;
        if (d11 == null) {
            it.bindNull(i12);
        } else {
            it.bindDouble(i12, d11.doubleValue());
        }
        return g2.f100423a;
    }

    public static final g2 n(Long l11, int i11, SupportSQLiteProgram it) {
        g0.p(it, "it");
        int i12 = i11 + 1;
        if (l11 == null) {
            it.bindNull(i12);
        } else {
            it.bindLong(i12, l11.longValue());
        }
        return g2.f100423a;
    }

    public static final g2 o(String str, int i11, SupportSQLiteProgram it) {
        g0.p(it, "it");
        int i12 = i11 + 1;
        if (str == null) {
            it.bindNull(i12);
        } else {
            it.bindString(i12, str);
        }
        return g2.f100423a;
    }

    @Override // l.f
    public void a(final int i11, @m80.l final Boolean bool) {
        this.f71739e.set(i11, new x00.l() { // from class: m.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 k11;
                k11 = h.k(bool, i11, (SupportSQLiteProgram) obj);
                return k11;
            }
        });
    }

    @Override // l.f
    public void b(final int i11, @m80.l final Double d11) {
        this.f71739e.set(i11, new x00.l() { // from class: m.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 m11;
                m11 = h.m(d11, i11, (SupportSQLiteProgram) obj);
                return m11;
            }
        });
    }

    @Override // l.f
    public void bindString(final int i11, @m80.l final String str) {
        this.f71739e.set(i11, new x00.l() { // from class: m.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = h.o(str, i11, (SupportSQLiteProgram) obj);
                return o11;
            }
        });
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@m80.k SupportSQLiteProgram statement) {
        g0.p(statement, "statement");
        for (x00.l<SupportSQLiteProgram, g2> lVar : this.f71739e) {
            g0.m(lVar);
            lVar.invoke(statement);
        }
    }

    @Override // l.f
    public void c(final int i11, @m80.l final Long l11) {
        this.f71739e.set(i11, new x00.l() { // from class: m.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n11;
                n11 = h.n(l11, i11, (SupportSQLiteProgram) obj);
                return n11;
            }
        });
    }

    @Override // m.p
    public <R> R d(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
        g0.p(mapper, "mapper");
        Cursor query = this.f71736b.query(this);
        try {
            R value = mapper.invoke(new a(query, this.f71738d)).getValue();
            r00.b.a(query, null);
            return value;
        } finally {
        }
    }

    @Override // l.f
    public void e(final int i11, @m80.l final byte[] bArr) {
        this.f71739e.set(i11, new x00.l() { // from class: m.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l11;
                l11 = h.l(bArr, i11, (SupportSQLiteProgram) obj);
                return l11;
            }
        });
    }

    @Override // m.p
    public /* bridge */ /* synthetic */ long execute() {
        return ((Number) p()).longValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.f71737c;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @m80.k
    public String getSql() {
        return this.f71735a;
    }

    @m80.k
    public Void p() {
        throw new UnsupportedOperationException();
    }

    @m80.k
    public String toString() {
        return getSql();
    }

    @Override // m.p
    public void close() {
    }
}
