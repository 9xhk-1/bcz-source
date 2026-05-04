package mb;

import android.database.sqlite.SQLiteOpenHelper;
import com.baicizhan.client.framework.db.ConnectionPool;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public b f73054a;

    public a(String path) {
        this.f73054a = null;
        try {
            this.f73054a = ConnectionPool.f().e(path);
        } catch (Exception e11) {
            try {
                if (qb.d.b()) {
                    qb.c.p("", "get connection error", e11);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                if (qb.d.b()) {
                    qb.c.c("", "construct BaseDao error", e12);
                }
            }
        }
    }

    public boolean a(String sql, Object... args) {
        if (sql == null) {
            return false;
        }
        try {
            this.f73054a.d(sql, args).j();
            return true;
        } catch (Exception e11) {
            if (qb.d.b()) {
                b bVar = this.f73054a;
                qb.c.p("", String.format("execute [%s] error connection [%s]", sql, bVar != null ? bVar.c() : "null"), e11);
            }
            return false;
        }
    }

    public int b(String sql, Object... args) {
        if (sql == null) {
            return -1;
        }
        c cVar = null;
        try {
            try {
                cVar = this.f73054a.d(sql, args);
                int e11 = cVar.e();
                cVar.a();
                return e11;
            } catch (Exception e12) {
                if (qb.d.b()) {
                    b bVar = this.f73054a;
                    qb.c.p("", String.format("execute insert [%s] error connection [%s]", sql, bVar != null ? bVar.c() : "null"), e12);
                }
                if (cVar != null) {
                    cVar.a();
                }
                return -1;
            }
        } catch (Throwable th2) {
            if (cVar != null) {
                cVar.a();
            }
            throw th2;
        }
    }

    public <T> List<T> c(String sql, Class<T> cls, Object... args) {
        if (sql != null && cls != null) {
            try {
                return this.f73054a.d(sql, args).g(cls);
            } catch (Exception e11) {
                if (qb.d.b()) {
                    b bVar = this.f73054a;
                    qb.c.p("", String.format("execute query [%s] error connection [%s]", sql, bVar != null ? bVar.c() : "null"), e11);
                }
            }
        }
        return null;
    }

    public <T> T d(String str, Class<T> cls, Object... objArr) {
        if (str != null && cls != null) {
            try {
                return (T) this.f73054a.d(str, objArr).i(cls);
            } catch (Exception e11) {
                if (qb.d.b()) {
                    b bVar = this.f73054a;
                    qb.c.p("", String.format("execute query [%s] error connection [%s]", str, bVar != null ? bVar.c() : "null"), e11);
                }
            }
        }
        return null;
    }

    public boolean e(String sql, Object... args) {
        if (sql == null) {
            return false;
        }
        try {
            return this.f73054a.d(sql, args).j() > 0;
        } catch (Exception e11) {
            if (qb.d.b()) {
                b bVar = this.f73054a;
                qb.c.p("", String.format("execute update [%s] error connection [%s]", sql, bVar != null ? bVar.c() : "null"), e11);
            }
            return false;
        }
    }

    public void finalize() throws Throwable {
        ConnectionPool.f().b();
        if (qb.d.b()) {
            qb.c.b("", "BaseDao free connection", new Object[0]);
        }
        super.finalize();
    }

    public a(SQLiteOpenHelper helper) {
        this.f73054a = null;
        try {
            this.f73054a = ConnectionPool.f().c(helper);
        } catch (Exception e11) {
            try {
                if (qb.d.b()) {
                    qb.c.p("", "get connection error", e11);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                if (qb.d.b()) {
                    qb.c.c("", "construct BaseDao error", e12);
                }
            }
        }
    }
}
