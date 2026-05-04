package com.meizu.cloud.pushsdk.d.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39767a = "a";

    /* renamed from: b, reason: collision with root package name */
    private SQLiteDatabase f39768b;

    /* renamed from: c, reason: collision with root package name */
    private final b f39769c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f39770d = {"id", "eventData", "dateCreated"};

    /* renamed from: e, reason: collision with root package name */
    private long f39771e = -1;

    /* renamed from: f, reason: collision with root package name */
    private final int f39772f;

    public a(Context context, int i11) {
        this.f39769c = b.a(context, a(context));
        b();
        this.f39772f = i11;
    }

    private String a(Context context) {
        String processName = MzSystemUtils.getProcessName(context);
        if (TextUtils.isEmpty(processName)) {
            return "PushEvents.db";
        }
        return processName + "_PushEvents.db";
    }

    public long b(com.meizu.cloud.pushsdk.d.a.a aVar) {
        if (e()) {
            byte[] a11 = a((Map<String, String>) aVar.a());
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("eventData", a11);
            this.f39771e = this.f39768b.insert("events", null, contentValues);
        }
        com.meizu.cloud.pushsdk.d.f.c.b(f39767a, "Added event to database: " + this.f39771e, new Object[0]);
        return this.f39771e;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public long c() {
        if (e()) {
            return DatabaseUtils.queryNumEntries(this.f39768b, "events");
        }
        return 0L;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public com.meizu.cloud.pushsdk.d.b.c d() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map : a(this.f39772f)) {
            com.meizu.cloud.pushsdk.d.a.c cVar = new com.meizu.cloud.pushsdk.d.a.c();
            cVar.a((Map) map.get("eventData"));
            linkedList.add((Long) map.get("id"));
            arrayList.add(cVar);
        }
        return new com.meizu.cloud.pushsdk.d.b.c(arrayList, linkedList);
    }

    public boolean e() {
        SQLiteDatabase sQLiteDatabase = this.f39768b;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    public List<Map<String, Object>> a(int i11) {
        return a(null, "id ASC LIMIT " + i11);
    }

    public void b() {
        if (e()) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f39769c.getWritableDatabase();
            this.f39768b = writableDatabase;
            writableDatabase.enableWriteAheadLogging();
        } catch (Exception e11) {
            com.meizu.cloud.pushsdk.d.f.c.a(f39767a, " open database error " + e11.getMessage(), new Object[0]);
        }
    }

    public List<Map<String, Object>> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (e()) {
            Cursor query = this.f39768b.query("events", this.f39770d, str, null, null, null, str2);
            query.moveToFirst();
            while (!query.isAfterLast()) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("id", Long.valueOf(query.getLong(0)));
                hashMap.put("eventData", a(query.getBlob(1)));
                hashMap.put("dateCreated", query.getString(2));
                query.moveToNext();
                arrayList.add(hashMap);
            }
            query.close();
        }
        return arrayList;
    }

    public static Map<String, String> a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            HashMap hashMap = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return hashMap;
        } catch (IOException | ClassNotFoundException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public void a(com.meizu.cloud.pushsdk.d.a.a aVar) {
        b(aVar);
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public boolean a() {
        return e();
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public boolean a(long j11) {
        int i11;
        if (e()) {
            i11 = this.f39768b.delete("events", "id=" + j11, null);
        } else {
            i11 = -1;
        }
        com.meizu.cloud.pushsdk.d.f.c.b(f39767a, "Removed event from database: " + j11, new Object[0]);
        return i11 == 1;
    }

    public static byte[] a(Map<String, String> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
