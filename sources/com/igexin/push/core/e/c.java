package com.igexin.push.core.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baicizhan.client.business.dataset.provider.a;
import com.igexin.push.core.b.k;
import com.igexin.push.core.d;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import pn.j;

/* loaded from: classes7.dex */
public class c implements a {

    /* renamed from: c, reason: collision with root package name */
    private static c f38052c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<k> f38055d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38056e;

    /* renamed from: b, reason: collision with root package name */
    private String f38054b = "MessageDataManager";

    /* renamed from: a, reason: collision with root package name */
    public int f38053a = -1;

    public static c a() {
        if (f38052c == null) {
            synchronized (c.class) {
                try {
                    if (f38052c == null) {
                        f38052c = new c();
                    }
                } finally {
                }
            }
        }
        return f38052c;
    }

    public static int b() {
        Cursor cursor = null;
        try {
            cursor = d.a.f37956a.f37950i.a("message", null, null, null, null);
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
                if (cursor == null) {
                    return 0;
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        if (cursor == null) {
            if (cursor == null) {
                return 0;
            }
            return 0;
        }
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    private static void e() {
    }

    public final void c() {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.c.1
            @Override // com.igexin.push.b.d
            public final void a_() throws Exception {
                Cursor cursor = null;
                try {
                    com.igexin.push.b.b bVar = d.a.f37956a.f37950i;
                    cursor = bVar.a("message", new String[]{"status"}, new String[]{"0"}, null, null);
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            byte[] blob = cursor.getBlob(cursor.getColumnIndex("info"));
                            long j11 = cursor.getLong(cursor.getColumnIndex("createtime"));
                            try {
                                JSONObject jSONObject = new JSONObject(new String(com.igexin.c.b.a.c(blob)));
                                String string = jSONObject.getString("taskid");
                                if (jSONObject.has("condition") && !c.b(jSONObject) && System.currentTimeMillis() - j11 > 259200000) {
                                    String unused = c.this.f38054b;
                                    com.igexin.c.a.c.a.a(c.this.f38054b + "|del condition taskid = " + string, new Object[0]);
                                    bVar.a("message", new String[]{"taskid"}, new String[]{string});
                                }
                            } catch (Throwable th2) {
                                com.igexin.c.a.c.a.a(th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        com.igexin.c.a.c.a.a(th3);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
        }, false, true);
    }

    public final void d() {
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d() { // from class: com.igexin.push.core.e.c.2
            @Override // com.igexin.push.b.d
            public final void a_() throws Exception {
                d.a.f37956a.f37950i.a("message", "createtime <= ".concat(String.valueOf(System.currentTimeMillis() - 604800000)));
            }
        }, false, true);
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("message", null, "status =?", new String[]{"0"}, null, null, null, null);
            if (cursor != null) {
                ArrayList<k> arrayList = new ArrayList<>();
                while (cursor.moveToNext()) {
                    arrayList.add(new k(cursor.getInt(cursor.getColumnIndex("id")), cursor.getString(cursor.getColumnIndex("messageid")), cursor.getString(cursor.getColumnIndex("taskid")), cursor.getString(cursor.getColumnIndex("appid")), cursor.getBlob(cursor.getColumnIndexOrThrow("info")), cursor.getBlob(cursor.getColumnIndex("msgextra")), cursor.getString(cursor.getColumnIndex(a.d.C0245a.f16161a)), cursor.getInt(cursor.getColumnIndex("status")), cursor.getLong(cursor.getColumnIndex("createtime"))));
                }
                try {
                    this.f38055d = arrayList;
                    arrayList.size();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        com.igexin.c.a.c.a.a(th);
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.igexin.push.core.e.a
    public final void b(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.igexin.push.core.e.a
    public final void c(SQLiteDatabase sQLiteDatabase) {
    }

    public final void d(SQLiteDatabase sQLiteDatabase) {
        this.f38056e = true;
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("message", null, "status =?", new String[]{"0"}, null, null, null, null);
            if (cursor != null) {
                ArrayList<k> arrayList = new ArrayList<>();
                while (cursor.moveToNext()) {
                    arrayList.add(new k(cursor.getInt(cursor.getColumnIndex("id")), cursor.getString(cursor.getColumnIndex("messageid")), cursor.getString(cursor.getColumnIndex("taskid")), cursor.getString(cursor.getColumnIndex("appid")), cursor.getBlob(cursor.getColumnIndexOrThrow("info")), cursor.getBlob(cursor.getColumnIndex("msgextra")), cursor.getString(cursor.getColumnIndex(a.d.C0245a.f16161a)), cursor.getInt(cursor.getColumnIndex("status")), cursor.getLong(cursor.getColumnIndex("createtime"))));
                }
                this.f38055d = arrayList;
                arrayList.size();
            }
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
                if (cursor != null) {
                    cursor.close();
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    public static void a(int i11, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i11));
        d.a.f37956a.f37950i.a("message", contentValues, new String[]{"taskid"}, new String[]{str});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("condition");
            if (jSONObject2.has("wifi") || jSONObject2.has("screenOn") || jSONObject2.has("ssid") || jSONObject2.has("duration")) {
                return false;
            }
            return !jSONObject2.has("netConnected");
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return true;
        }
    }

    private void a(ContentValues contentValues) {
        try {
            if (this.f38053a == -1) {
                this.f38053a = b();
            }
            if (this.f38053a >= 1000) {
                int a11 = d.a.f37956a.f37950i.a("message", "id IN (SELECT id from message where status IS NULL or status=1 or status=2 order by id asc limit 250)");
                this.f38053a -= a11;
                if (a11 < 250) {
                    this.f38053a -= d.a.f37956a.f37950i.a("message", "id IN (SELECT id from message where status=0 order by id asc limit " + (250 - a11) + j.f81007d);
                }
                if (d.a.f37956a.f37950i.a("message", contentValues) == -1) {
                    return;
                }
            } else if (d.a.f37956a.f37950i.a("message", contentValues) == -1) {
                return;
            }
            this.f38053a++;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    @Override // com.igexin.push.core.e.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<k> arrayList;
        if (!this.f38056e || (arrayList = this.f38055d) == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList<k> arrayList2 = this.f38055d;
        try {
            Iterator<k> it = arrayList2.iterator();
            while (it.hasNext()) {
                k next = it.next();
                byte[] bArr = next.f37800e;
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(next.f37796a));
                contentValues.put("messageid", next.f37797b);
                contentValues.put("taskid", next.f37798c);
                contentValues.put("appid", next.f37799d);
                if (bArr != null) {
                    contentValues.put("info", bArr);
                }
                byte[] bArr2 = next.f37801f;
                if (bArr2 != null) {
                    contentValues.put("msgextra", bArr2);
                }
                contentValues.put(a.d.C0245a.f16161a, next.f37802g);
                contentValues.put("status", Integer.valueOf(next.f37803h));
                contentValues.put("createtime", Long.valueOf(next.f37804i));
                sQLiteDatabase.insert("message", null, contentValues);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        arrayList2.clear();
    }

    private static void a(SQLiteDatabase sQLiteDatabase, ArrayList<k> arrayList) {
        try {
            Iterator<k> it = arrayList.iterator();
            while (it.hasNext()) {
                k next = it.next();
                byte[] bArr = next.f37800e;
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(next.f37796a));
                contentValues.put("messageid", next.f37797b);
                contentValues.put("taskid", next.f37798c);
                contentValues.put("appid", next.f37799d);
                if (bArr != null) {
                    contentValues.put("info", bArr);
                }
                byte[] bArr2 = next.f37801f;
                if (bArr2 != null) {
                    contentValues.put("msgextra", bArr2);
                }
                contentValues.put(a.d.C0245a.f16161a, next.f37802g);
                contentValues.put("status", Integer.valueOf(next.f37803h));
                contentValues.put("createtime", Long.valueOf(next.f37804i));
                sQLiteDatabase.insert("message", null, contentValues);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r9, int r10, int r11) {
        /*
            java.lang.String r0 = "redisplay_duration"
            java.lang.String r1 = "redisplay_num"
            if (r11 != 0) goto L8
            goto La5
        L8:
            r11 = 0
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "notify_status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L72
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L72
            int r3 = com.igexin.push.core.b.f37713aj     // Catch: java.lang.Throwable -> L72
            if (r10 != r3) goto L7b
            com.igexin.push.core.d r10 = com.igexin.push.core.d.a.a()     // Catch: java.lang.Throwable -> L72
            com.igexin.push.b.b r3 = r10.f37950i     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "message"
            java.lang.String r10 = "taskId"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L72
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "redisplay_freq"
            java.lang.String[] r7 = new java.lang.String[]{r1, r0, r10}     // Catch: java.lang.Throwable -> L72
            r8 = 0
            android.database.Cursor r11 = r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L75
            int r10 = r11.getCount()     // Catch: java.lang.Throwable -> L72
            if (r10 != 0) goto L41
            goto L75
        L41:
            boolean r10 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L7b
            int r10 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L72
            int r10 = r11.getInt(r10)     // Catch: java.lang.Throwable -> L72
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L72
            long r3 = r11.getLong(r0)     // Catch: java.lang.Throwable -> L72
            int r10 = r10 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L72
            r2.put(r1, r10)     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "expect_redisplay_time"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L72
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            long r0 = r0 + r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L72
            r2.put(r10, r0)     // Catch: java.lang.Throwable -> L72
            goto L7b
        L72:
            r0 = move-exception
            r9 = r0
            goto L9d
        L75:
            if (r11 == 0) goto La5
            r11.close()
            return
        L7b:
            com.igexin.push.core.d r10 = com.igexin.push.core.d.a.a()     // Catch: java.lang.Throwable -> L72
            com.igexin.push.b.b r10 = r10.f37950i     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = "message"
            java.lang.String r1 = "taskid"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L72
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L72
            r10.a(r0, r2, r1, r9)     // Catch: java.lang.Throwable -> L72
            com.igexin.push.f.e r9 = com.igexin.push.f.e.a()     // Catch: java.lang.Throwable -> L72
            r9.d()     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto La5
            r11.close()
            return
        L9d:
            com.igexin.c.a.c.a.a(r9)     // Catch: java.lang.Throwable -> La6
            if (r11 == 0) goto La5
            r11.close()
        La5:
            return
        La6:
            r0 = move-exception
            r9 = r0
            if (r11 == 0) goto Lad
            r11.close()
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.e.c.a(java.lang.String, int, int):void");
    }

    public static boolean a(String str) {
        boolean z11 = false;
        Cursor cursor = null;
        try {
            cursor = d.a.f37956a.f37950i.a("message", new String[]{"taskid"}, new String[]{str}, null, null);
            if (cursor != null) {
                if (cursor.getCount() > 0) {
                    z11 = true;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return z11;
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } finally {
            }
        }
    }
}
