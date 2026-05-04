package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.xiaomi.push.ha;

/* loaded from: classes8.dex */
public class TrafficProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private static final UriMatcher f46193a;

    /* renamed from: a, reason: collision with other field name */
    public static final Uri f857a = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");

    /* renamed from: a, reason: collision with other field name */
    private SQLiteOpenHelper f858a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f46193a = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "traffic", 1);
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (f46193a.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f858a = new a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        synchronized (a.f859a) {
            try {
                if (f46193a.match(uri) != 1) {
                    throw new IllegalArgumentException("Unknown URI " + uri);
                }
                query = this.f858a.getReadableDatabase().query("traffic", strArr, str, strArr2, null, null, str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (f46193a.match(uri) != 2 || contentValues == null || !contentValues.containsKey("imsi")) {
            return 0;
        }
        ha.m6007a(contentValues.getAsString("imsi"));
        return 0;
    }
}
