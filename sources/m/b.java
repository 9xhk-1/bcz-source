package m;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final SupportSQLiteStatement f71724a;

    public b(@m80.k SupportSQLiteStatement statement) {
        g0.p(statement, "statement");
        this.f71724a = statement;
    }

    @Override // l.f
    public void a(int i11, @m80.l Boolean bool) {
        if (bool == null) {
            this.f71724a.bindNull(i11 + 1);
        } else {
            this.f71724a.bindLong(i11 + 1, bool.booleanValue() ? 1L : 0L);
        }
    }

    @Override // l.f
    public void b(int i11, @m80.l Double d11) {
        if (d11 == null) {
            this.f71724a.bindNull(i11 + 1);
        } else {
            this.f71724a.bindDouble(i11 + 1, d11.doubleValue());
        }
    }

    @Override // l.f
    public void bindString(int i11, @m80.l String str) {
        if (str == null) {
            this.f71724a.bindNull(i11 + 1);
        } else {
            this.f71724a.bindString(i11 + 1, str);
        }
    }

    @Override // l.f
    public void c(int i11, @m80.l Long l11) {
        if (l11 == null) {
            this.f71724a.bindNull(i11 + 1);
        } else {
            this.f71724a.bindLong(i11 + 1, l11.longValue());
        }
    }

    @Override // m.p
    public void close() {
        this.f71724a.close();
    }

    @Override // m.p
    public <R> R d(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
        g0.p(mapper, "mapper");
        throw new UnsupportedOperationException();
    }

    @Override // l.f
    public void e(int i11, @m80.l byte[] bArr) {
        if (bArr == null) {
            this.f71724a.bindNull(i11 + 1);
        } else {
            this.f71724a.bindBlob(i11 + 1, bArr);
        }
    }

    @Override // m.p
    public long execute() {
        return this.f71724a.executeUpdateDelete();
    }
}
