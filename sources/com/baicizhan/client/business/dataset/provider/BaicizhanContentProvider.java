package com.baicizhan.client.business.dataset.provider;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.StoragePathDetector;
import h9.b;
import h9.d;
import h9.e;
import h9.f;
import h9.g;
import h9.h;
import h9.i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.j2;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BaicizhanContentProvider extends ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final String f16075d = "baicizhandb";

    /* renamed from: e, reason: collision with root package name */
    public static final int f16076e = 45;

    /* renamed from: f, reason: collision with root package name */
    public static final String f16077f = "CONFLICT_IGNORE";

    /* renamed from: g, reason: collision with root package name */
    public static final String f16078g = "baicizhan_contentprovider";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16079h = "baicizhan_root";

    /* renamed from: i, reason: collision with root package name */
    public static final String f16080i = "checkRoot";

    /* renamed from: j, reason: collision with root package name */
    public static final String f16081j = "setRoot";

    /* renamed from: k, reason: collision with root package name */
    public static final String f16082k = "normal";

    /* renamed from: a, reason: collision with root package name */
    public String f16083a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, SQLiteDatabase> f16084b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, ReentrantLock> f16085c = new HashMap();

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        String string = context.getSharedPreferences(f16078g, 0).getString(f16079h, "");
        if (!TextUtils.isEmpty(string)) {
            c.b("baicizhandb", "load root from preference " + string, new Object[0]);
            return string;
        }
        String detect = StoragePathDetector.detect(context, null);
        c.b("baicizhandb", "load root by detect " + detect, new Object[0]);
        return detect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r4.unlock();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.database.sqlite.SQLiteDatabase> r0 = r3.f16084b     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.remove(r4)     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0     // Catch: java.lang.Throwable -> L26
            java.util.Map<java.lang.String, java.util.concurrent.locks.ReentrantLock> r1 = r3.f16085c     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r1.remove(r4)     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.locks.ReentrantLock r4 = (java.util.concurrent.locks.ReentrantLock) r4     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L38
            if (r4 == 0) goto L1d
            r4.lock()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L1d
        L19:
            r0 = move-exception
            goto L32
        L1b:
            r0 = move-exception
            goto L28
        L1d:
            r0.close()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 == 0) goto L38
        L22:
            r4.unlock()     // Catch: java.lang.Throwable -> L26
            goto L38
        L26:
            r4 = move-exception
            goto L3a
        L28:
            java.lang.String r1 = "baicizhandb"
            java.lang.String r2 = ""
            qb.c.a(r1, r2, r0)     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L38
            goto L22
        L32:
            if (r4 == 0) goto L37
            r4.unlock()     // Catch: java.lang.Throwable -> L26
        L37:
            throw r0     // Catch: java.lang.Throwable -> L26
        L38:
            monitor-exit(r3)
            return
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.dataset.provider.BaicizhanContentProvider.a(java.lang.String):void");
    }

    @Override // android.content.ContentProvider
    @NonNull
    public ContentProviderResult[] applyBatch(@NonNull ArrayList<ContentProviderOperation> operations) throws OperationApplicationException {
        try {
            return super.applyBatch(operations);
        } catch (Exception e11) {
            g(e11);
            return new ContentProviderResult[0];
        }
    }

    public final synchronized void b() {
        c.b("baicizhandb", "closeDatabases", new Object[0]);
        Iterator<SQLiteDatabase> it = this.f16084b.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (SQLiteException e11) {
                c.a("baicizhandb", "", e11);
            }
        }
        this.f16084b.clear();
        this.f16085c.clear();
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(@NonNull Uri uri, @NonNull ContentValues[] values) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        try {
            SQLiteDatabase d11 = d(str);
            ReentrantLock e11 = e(str);
            try {
                e11.lock();
                d11.beginTransaction();
                for (ContentValues contentValues : values) {
                    d11.insertWithOnConflict(str2, null, contentValues, 5);
                }
                d11.setTransactionSuccessful();
                d11.endTransaction();
                e11.unlock();
                return values.length;
            } catch (Throwable th2) {
                d11.endTransaction();
                e11.unlock();
                throw th2;
            }
        } catch (Exception e12) {
            c.p("baicizhandb", "Retry cause: ", e12);
            a(str);
            return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final synchronized SQLiteDatabase d(final String dbname) {
        Throwable th2;
        BaicizhanContentProvider baicizhanContentProvider;
        g9.a aVar;
        try {
            try {
                if (TextUtils.isEmpty(f())) {
                    throw new IllegalStateException("BaicizhanContentProvider root has not set");
                }
                SQLiteDatabase sQLiteDatabase = this.f16084b.get(dbname);
                if (sQLiteDatabase != null) {
                    return sQLiteDatabase;
                }
                String absolutePath = new File(f(), dbname).getAbsolutePath();
                c.b("baicizhandb", "try open database " + absolutePath, new Object[0]);
                try {
                    switch (dbname.hashCode()) {
                        case -2089986932:
                            if (dbname.equals(a.c.f16127b)) {
                                aVar = new h9.c(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e11 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e11);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e11, new Object[0]);
                                return e11;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e112 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e112);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e112, new Object[0]);
                            return e112;
                        case -1802867608:
                            if (dbname.equals(a.c.f16129d)) {
                                aVar = new d(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e1122 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e1122);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e1122, new Object[0]);
                                return e1122;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e11222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e11222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e11222, new Object[0]);
                            return e11222;
                        case -1655423645:
                            if (dbname.equals(a.c.f16131f)) {
                                aVar = new i(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e112222 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e112222);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e112222, new Object[0]);
                                return e112222;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e1122222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e1122222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e1122222, new Object[0]);
                            return e1122222;
                        case -1444253839:
                            if (dbname.equals(a.c.f16130e)) {
                                aVar = new e(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e11222222 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e11222222);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e11222222, new Object[0]);
                                return e11222222;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e112222222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e112222222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e112222222, new Object[0]);
                            return e112222222;
                        case -1087749027:
                            if (dbname.equals(a.c.f16134i)) {
                                aVar = new h(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e1122222222 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e1122222222);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e1122222222, new Object[0]);
                                return e1122222222;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e11222222222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e11222222222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e11222222222, new Object[0]);
                            return e11222222222;
                        case -925945437:
                            if (dbname.equals(a.c.f16135j)) {
                                aVar = new g(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e112222222222 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e112222222222);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e112222222222, new Object[0]);
                                return e112222222222;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e1122222222222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e1122222222222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e1122222222222, new Object[0]);
                            return e1122222222222;
                        case -201304534:
                            if (dbname.equals(a.c.f16132g)) {
                                aVar = new h9.a(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e11222222222222 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e11222222222222);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e11222222222222, new Object[0]);
                                return e11222222222222;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e112222222222222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e112222222222222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e112222222222222, new Object[0]);
                            return e112222222222222;
                        case 1154379961:
                            if (dbname.equals(a.c.f16136k)) {
                                aVar = new b(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e1122222222222222 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e1122222222222222);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e1122222222222222, new Object[0]);
                                return e1122222222222222;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e11222222222222222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e11222222222222222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e11222222222222222, new Object[0]);
                            return e11222222222222222;
                        case 1765207382:
                            if (dbname.equals(a.c.f16128c)) {
                                aVar = new f(getContext(), absolutePath, null, 45);
                                baicizhanContentProvider = this;
                                SQLiteDatabase e112222222222222222 = aVar.e();
                                baicizhanContentProvider.f16084b.put(dbname, e112222222222222222);
                                c.b("baicizhandb", "open database " + absolutePath + j2.O + e112222222222222222, new Object[0]);
                                return e112222222222222222;
                            }
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e1122222222222222222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e1122222222222222222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e1122222222222222222, new Object[0]);
                            return e1122222222222222222;
                        default:
                            baicizhanContentProvider = this;
                            aVar = baicizhanContentProvider.new a(getContext(), absolutePath, null, 45);
                            SQLiteDatabase e11222222222222222222 = aVar.e();
                            baicizhanContentProvider.f16084b.put(dbname, e11222222222222222222);
                            c.b("baicizhandb", "open database " + absolutePath + j2.O + e11222222222222222222, new Object[0]);
                            return e11222222222222222222;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String whereClause, String[] whereArgs) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        String query = uri.getQuery();
        try {
            SQLiteDatabase d11 = d(str);
            ReentrantLock e11 = e(str);
            try {
                e11.lock();
                if (TextUtils.isEmpty(query)) {
                    c.o("baicizhandb", "delete " + str2 + " where " + whereClause, new Object[0]);
                    return d11.delete(str2, whereClause, whereArgs);
                }
                c.o("baicizhandb", "delete " + query, new Object[0]);
                if (str2.equals(com.baicizhan.client.business.dataset.provider.a.f16090d)) {
                    if (whereArgs != null) {
                        d11.execSQL(query, whereArgs);
                    } else {
                        d11.execSQL(query);
                    }
                }
                return 0;
            } finally {
                e11.unlock();
            }
        } catch (Exception e12) {
            g(e12);
            return -1;
        }
    }

    public final synchronized ReentrantLock e(String name) {
        ReentrantLock reentrantLock;
        reentrantLock = this.f16085c.get(name);
        if (reentrantLock == null) {
            reentrantLock = new ReentrantLock();
            this.f16085c.put(name, reentrantLock);
        }
        return reentrantLock;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f16083a)) {
            this.f16083a = c(getContext());
        }
        return this.f16083a;
    }

    public final void g(Exception e11) {
        c.c("baicizhandb", "handleSQLException ", e11);
        if ((e11 instanceof SQLiteFullException) || (e11 instanceof SQLiteDiskIOException) || (e11 instanceof SQLiteOutOfMemoryException) || (e11 instanceof IllegalStateException) || (e11 instanceof SQLiteDatabaseCorruptException)) {
            b();
        }
    }

    @Override // android.content.ContentProvider
    public synchronized String getType(@NonNull Uri uri) {
        try {
            c.b("baicizhandb", "getType " + uri + j2.O + uri.getPath() + j2.O + uri.getQuery(), new Object[0]);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() > 0) {
                String str = pathSegments.get(0);
                String query = uri.getQuery();
                c.b("baicizhandb", "method " + str + ", arg " + query, new Object[0]);
                if (str.equals(f16081j)) {
                    if (!TextUtils.isEmpty(query)) {
                        this.f16083a = query;
                        c.b("baicizhandb", "setRoot " + this.f16083a, new Object[0]);
                        if (getContext() != null) {
                            getContext().getSharedPreferences(f16078g, 0).edit().putString(f16079h, this.f16083a).apply();
                            c.b("baicizhandb", "save root to preference: " + this.f16083a, new Object[0]);
                        }
                    }
                } else if (str.equals(f16080i)) {
                    try {
                        d(a.c.f16127b);
                    } catch (SQLiteCantOpenDatabaseException unused) {
                        c.d("baicizhandb", "check root failed.", new Object[0]);
                        return null;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16082k;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues values) {
        Uri uri2;
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        String str3 = pathSegments.size() > 2 ? pathSegments.get(2) : null;
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                SQLiteDatabase d11 = d(str);
                ReentrantLock e11 = e(str);
                try {
                    e11.lock();
                    if (TextUtils.equals(str3, f16077f)) {
                        d11.insertWithOnConflict(str2, null, values, 4);
                    } else {
                        d11.insertWithOnConflict(str2, null, values, 5);
                    }
                    if (str.equals(a.c.f16127b) && str2.equals(a.h.f16194a)) {
                        try {
                            uri2 = a.h.f16195b.buildUpon().appendQueryParameter(a.d.C0245a.f16161a, values.getAsString(a.h.C0249a.f16196a)).build();
                        } catch (Exception unused) {
                            uri2 = a.h.f16195b;
                        }
                        if (getContext() != null) {
                            getContext().getContentResolver().notifyChange(uri2, null);
                        }
                    }
                    e11.unlock();
                    return uri;
                } catch (Throwable th2) {
                    e11.unlock();
                    throw th2;
                }
            } catch (Exception e12) {
                c.p("baicizhandb", "Retry cause: ", e12);
                a(str);
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        c.b("baicizhandb", "provider onCreate", new Object[0]);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Cursor rawQuery;
        try {
            List<String> pathSegments = uri.getPathSegments();
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            SQLiteDatabase d11 = d(str);
            ReentrantLock e11 = e(str);
            try {
                e11.lock();
                String query = uri.getQuery();
                if (TextUtils.isEmpty(query)) {
                    rawQuery = d11.query(str2, projection, selection, selectionArgs, null, null, sortOrder);
                } else {
                    if (!str2.equals(com.baicizhan.client.business.dataset.provider.a.f16089c)) {
                        e11.unlock();
                        return null;
                    }
                    rawQuery = d11.rawQuery(query, selectionArgs);
                }
                e11.unlock();
                return rawQuery;
            } catch (Throwable th2) {
                e11.unlock();
                throw th2;
            }
        } catch (Exception e12) {
            g(e12);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        super.shutdown();
        b();
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        try {
            List<String> pathSegments = uri.getPathSegments();
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            SQLiteDatabase d11 = d(str);
            ReentrantLock e11 = e(str);
            try {
                e11.lock();
                return d11.update(str2, values, selection, selectionArgs);
            } finally {
                e11.unlock();
            }
        } catch (Exception e12) {
            g(e12);
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g9.a {
        public a(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override // g9.a
        public void h(SQLiteDatabase db2) {
        }

        @Override // g9.a
        public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
        }
    }
}
