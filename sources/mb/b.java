package mb;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f73055a;

    public b(SQLiteDatabase conn) {
        this.f73055a = conn;
    }

    public void a() throws Exception {
        if (qb.d.b()) {
            qb.c.b("", "begin transaction", new Object[0]);
        }
        this.f73055a.beginTransaction();
    }

    public void b() throws Exception {
        try {
            if (qb.d.b()) {
                qb.c.b("", "commit", new Object[0]);
            }
            this.f73055a.setTransactionSuccessful();
            this.f73055a.endTransaction();
        } catch (Throwable th2) {
            this.f73055a.endTransaction();
            throw th2;
        }
    }

    public SQLiteDatabase c() {
        return this.f73055a;
    }

    public c d(String sql, Object... args) throws Exception {
        return e(true, sql, args);
    }

    public c e(boolean autoClose, String sql, Object... args) throws Exception {
        d dVar = new d(new c(this.f73055a, sql, args), autoClose);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; args != null && i11 < args.length; i11++) {
            if (i11 > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(args[i11]);
        }
        if (qb.d.b()) {
            qb.c.b("", "execute sql %s args %s", sql, stringBuffer.toString());
        }
        return dVar.a();
    }

    public void f() throws Exception {
        try {
            if (qb.d.b()) {
                qb.c.b("", "rollback", new Object[0]);
            }
        } finally {
            this.f73055a.endTransaction();
        }
    }
}
