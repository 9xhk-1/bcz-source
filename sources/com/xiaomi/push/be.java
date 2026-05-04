package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes8.dex */
class be implements at {

    /* renamed from: a, reason: collision with root package name */
    private static String f45296a = "content://com.vivo.vms.IdProvider/IdentifierId/";

    /* renamed from: b, reason: collision with root package name */
    private static String f45297b = f45296a + "OAID";

    /* renamed from: c, reason: collision with root package name */
    private static String f45298c = f45296a + "VAID_";

    /* renamed from: d, reason: collision with root package name */
    private static String f45299d = f45296a + "AAID_";

    /* renamed from: e, reason: collision with root package name */
    private static String f45300e = f45296a + com.alipay.sdk.m.p0.b.f10930h;

    /* renamed from: f, reason: collision with root package name */
    private static String f45301f = com.alipay.sdk.m.p0.c.f10938c;

    /* renamed from: a, reason: collision with other field name */
    private Context f170a;

    public be(Context context) {
        this.f170a = context;
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public String mo5724a() {
        return a(f45297b);
    }

    private String a(String str) {
        Cursor cursor;
        Cursor cursor2 = null;
        r1 = null;
        String string = null;
        try {
            cursor = this.f170a.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        string = cursor.getString(cursor.getColumnIndex("value"));
                    }
                } catch (Exception unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return string;
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public boolean mo5725a() {
        return "1".equals(C1403r.a(f45301f, "0"));
    }

    public static boolean a(Context context) {
        try {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f45296a).getAuthority(), 128);
            if (resolveContentProvider != null) {
                return (resolveContentProvider.applicationInfo.flags & 1) != 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
