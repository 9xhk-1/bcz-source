package com.baicizhan.client.framework.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import mb.b;
import qb.c;
import qb.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ConnectionPool {

    /* renamed from: e, reason: collision with root package name */
    public static final ConnectionPool f17571e = new ConnectionPool();

    /* renamed from: a, reason: collision with root package name */
    public ThreadLocal<b> f17572a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public ConnectionMode f17573b = ConnectionMode.ONE_PER_FETCH;

    /* renamed from: c, reason: collision with root package name */
    public OpenMode f17574c = OpenMode.OPEN_OR_CREATE;

    /* renamed from: d, reason: collision with root package name */
    public Set<SQLiteDatabase> f17575d = new HashSet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ConnectionMode {
        ONE_PER_FETCH,
        ONE_PER_SESSION
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum OpenMode {
        OPEN_OR_CREATE,
        READ_ONLY,
        READ_WRITE
    }

    public static ConnectionPool f() {
        return f17571e;
    }

    public static void j() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                System.out.println("" + stackTraceElement);
            }
        }
    }

    public void a() {
        for (SQLiteDatabase sQLiteDatabase : this.f17575d) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    sQLiteDatabase.close();
                } catch (Exception e11) {
                    if (d.b()) {
                        c.p("", String.format("close [%s] error", sQLiteDatabase), e11);
                    }
                }
            }
        }
        if (d.b()) {
            c.i("", "ConnectionPool destroyed!", new Object[0]);
        }
    }

    public void b() {
        b bVar = this.f17572a.get();
        if (d.b()) {
            c.b("", "free connection %s to pool [mode=%s]", bVar != null ? bVar.f73055a.toString() : "null", this.f17573b.toString());
        }
        if (bVar != null) {
            SQLiteDatabase sQLiteDatabase = bVar.f73055a;
            try {
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
                this.f17572a.remove();
                synchronized (this.f17575d) {
                    this.f17575d.remove(sQLiteDatabase);
                }
            } catch (Exception e11) {
                if (d.b()) {
                    c.p("", "close connection error", e11);
                }
            }
        }
    }

    public b c(SQLiteOpenHelper helper) throws Exception {
        SQLiteDatabase sQLiteDatabase;
        try {
            b bVar = this.f17572a.get();
            if ((ConnectionMode.ONE_PER_FETCH.equals(this.f17573b) && bVar != null) || (bVar != null && (sQLiteDatabase = bVar.f73055a) != null && !sQLiteDatabase.isOpen())) {
                b();
            }
            if (this.f17572a.get() != null) {
                SQLiteDatabase sQLiteDatabase2 = this.f17572a.get().f73055a;
                b bVar2 = this.f17572a.get();
                if (d.b()) {
                    c.b("", "get  from pool [mode=%s openMode=%s]", this.f17573b.toString(), this.f17574c.toString());
                }
                return bVar2;
            }
            SQLiteDatabase readableDatabase = OpenMode.READ_ONLY.equals(this.f17574c) ? helper.getReadableDatabase() : helper.getWritableDatabase();
            synchronized (this.f17575d) {
                this.f17575d.add(readableDatabase);
            }
            b bVar3 = new b(readableDatabase);
            this.f17572a.set(bVar3);
            if (d.b()) {
                c.b("", "get  from pool [mode=%s openMode=%s]", this.f17573b.toString(), this.f17574c.toString());
            }
            return bVar3;
        } catch (Throwable th2) {
            if (d.b()) {
                c.b("", "get  from pool [mode=%s openMode=%s]", this.f17573b.toString(), this.f17574c.toString());
            }
            throw th2;
        }
    }

    public b d(File file) throws Exception {
        SQLiteDatabase sQLiteDatabase;
        try {
            b bVar = this.f17572a.get();
            if ((ConnectionMode.ONE_PER_FETCH.equals(this.f17573b) && bVar != null) || (bVar != null && (sQLiteDatabase = bVar.f73055a) != null && !sQLiteDatabase.isOpen())) {
                b();
            }
            if (this.f17572a.get() != null) {
                SQLiteDatabase sQLiteDatabase2 = this.f17572a.get().f73055a;
                b bVar2 = this.f17572a.get();
                if (d.b()) {
                    c.b("", "get from pool [mode=%s openMode= %s]", this.f17573b.toString(), this.f17574c.toString());
                }
                return bVar2;
            }
            SQLiteDatabase openOrCreateDatabase = OpenMode.OPEN_OR_CREATE.equals(this.f17574c) ? SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null) : SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, OpenMode.READ_ONLY.equals(this.f17574c) ? 1 : 0);
            synchronized (this.f17575d) {
                this.f17575d.add(openOrCreateDatabase);
            }
            b bVar3 = new b(openOrCreateDatabase);
            this.f17572a.set(bVar3);
            if (d.b()) {
                c.b("", "get from pool [mode=%s openMode= %s]", this.f17573b.toString(), this.f17574c.toString());
            }
            return bVar3;
        } catch (Throwable th2) {
            if (d.b()) {
                c.b("", "get from pool [mode=%s openMode= %s]", this.f17573b.toString(), this.f17574c.toString());
            }
            throw th2;
        }
    }

    public b e(String path) throws Exception {
        return d(new File(path));
    }

    public ConnectionMode g() {
        return this.f17573b;
    }

    public void h() throws Exception {
        i(ConnectionMode.ONE_PER_FETCH, OpenMode.OPEN_OR_CREATE);
    }

    public void i(ConnectionMode mode, OpenMode openMode) throws Exception {
        this.f17573b = mode;
        this.f17574c = openMode;
        if (d.b()) {
            c.i("", "ConnectionPool %s inited!", this.f17573b.toString());
        }
    }
}
