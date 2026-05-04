package g9;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: j, reason: collision with root package name */
    public static final String f53503j = SQLiteOpenHelper.class.getSimpleName();

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f53504k = false;

    /* renamed from: a, reason: collision with root package name */
    public final Context f53505a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53506b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteDatabase.CursorFactory f53507c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53508d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53509e;

    /* renamed from: f, reason: collision with root package name */
    public SQLiteDatabase f53510f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53511g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f53512h;

    /* renamed from: i, reason: collision with root package name */
    public final DatabaseErrorHandler f53513i;

    public a(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        this(context, name, factory, version, null);
    }

    public synchronized void a() {
        if (this.f53511g) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.f53510f;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f53510f.close();
            this.f53510f = null;
        }
    }

    public final SQLiteDatabase b(boolean writable) {
        SQLiteDatabase sQLiteDatabase = this.f53510f;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.f53510f = null;
            } else if (!writable || !this.f53510f.isReadOnly()) {
                return this.f53510f;
            }
        }
        if (this.f53511g) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabase2 = this.f53510f;
        try {
            this.f53511g = true;
            if (sQLiteDatabase2 == null) {
                String str = this.f53506b;
                if (str == null) {
                    sQLiteDatabase2 = SQLiteDatabase.create(null);
                } else {
                    try {
                        sQLiteDatabase2 = this.f53505a.openOrCreateDatabase(str, this.f53512h ? 24 : 16, this.f53507c, this.f53513i);
                    } catch (SQLiteException e11) {
                        if (writable) {
                            throw e11;
                        }
                        Log.e(f53503j, "Couldn't open " + this.f53506b + " for writing (will try read-only):", e11);
                        sQLiteDatabase2 = SQLiteDatabase.openDatabase(this.f53505a.getDatabasePath(this.f53506b).getPath(), this.f53507c, 17, this.f53513i);
                    }
                }
            } else if (writable && sQLiteDatabase2.isReadOnly()) {
                throw new RuntimeException("reopenReadWrite called check");
            }
            g(sQLiteDatabase2);
            int version = sQLiteDatabase2.getVersion();
            if (version != this.f53508d) {
                if (sQLiteDatabase2.isReadOnly()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase2.getVersion() + " to " + this.f53508d + ": " + this.f53506b);
                }
                if (version > 0 && version < this.f53509e) {
                    File file = new File(sQLiteDatabase2.getPath());
                    f(sQLiteDatabase2);
                    sQLiteDatabase2.close();
                    if (SQLiteDatabase.deleteDatabase(file)) {
                        this.f53511g = false;
                        SQLiteDatabase b11 = b(writable);
                        this.f53511g = false;
                        if (sQLiteDatabase2 != this.f53510f) {
                            sQLiteDatabase2.close();
                        }
                        return b11;
                    }
                    throw new IllegalStateException("Unable to delete obsolete database " + this.f53506b + " with version " + version);
                }
                sQLiteDatabase2.beginTransaction();
                try {
                    if (version == 0) {
                        h(sQLiteDatabase2);
                    } else {
                        int i11 = this.f53508d;
                        if (version > i11) {
                            i(sQLiteDatabase2, version, i11);
                        } else {
                            k(sQLiteDatabase2, version, i11);
                        }
                    }
                    sQLiteDatabase2.setVersion(this.f53508d);
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase2.endTransaction();
                } catch (Throwable th2) {
                    sQLiteDatabase2.endTransaction();
                    throw th2;
                }
            }
            j(sQLiteDatabase2);
            if (sQLiteDatabase2.isReadOnly()) {
                Log.w(f53503j, "Opened " + this.f53506b + " in read-only mode");
            }
            this.f53510f = sQLiteDatabase2;
            this.f53511g = false;
            return sQLiteDatabase2;
        } catch (Throwable th3) {
            this.f53511g = false;
            if (sQLiteDatabase2 != null && sQLiteDatabase2 != this.f53510f) {
                sQLiteDatabase2.close();
            }
            throw th3;
        }
    }

    public String c() {
        return this.f53506b;
    }

    public SQLiteDatabase d() {
        SQLiteDatabase b11;
        synchronized (this) {
            b11 = b(false);
        }
        return b11;
    }

    public SQLiteDatabase e() {
        SQLiteDatabase b11;
        synchronized (this) {
            b11 = b(true);
        }
        return b11;
    }

    public abstract void h(SQLiteDatabase db2);

    public void i(SQLiteDatabase db2, int oldVersion, int newVersion) {
        throw new SQLiteException("Can't downgrade database from version " + oldVersion + " to " + newVersion);
    }

    public abstract void k(SQLiteDatabase db2, int oldVersion, int newVersion);

    public void l(boolean enabled) {
        synchronized (this) {
            try {
                if (this.f53512h != enabled) {
                    SQLiteDatabase sQLiteDatabase = this.f53510f;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.f53510f.isReadOnly()) {
                        if (enabled) {
                            this.f53510f.enableWriteAheadLogging();
                        } else {
                            this.f53510f.disableWriteAheadLogging();
                        }
                    }
                    this.f53512h = enabled;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        this(context, name, factory, version, 0, errorHandler);
    }

    public a(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, int minimumSupportedVersion, DatabaseErrorHandler errorHandler) {
        if (version >= 1) {
            this.f53505a = context;
            this.f53506b = name;
            this.f53507c = factory;
            this.f53508d = version;
            this.f53513i = errorHandler;
            this.f53509e = Math.max(0, minimumSupportedVersion);
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was " + version);
    }

    public void f(SQLiteDatabase db2) {
    }

    public void g(SQLiteDatabase db2) {
    }

    public void j(SQLiteDatabase db2) {
    }
}
