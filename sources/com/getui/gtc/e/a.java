package com.getui.gtc.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.getui.gtc.base.db.AbstractTable;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;

/* loaded from: classes6.dex */
public class a extends AbstractTable {

    /* renamed from: a, reason: collision with root package name */
    private SparseArray<Long> f30021a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private SparseArray<Long> f30022b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private SparseIntArray f30023c = new SparseIntArray();

    public final long a(int i11) {
        Long l11 = this.f30021a.get(i11);
        if (l11 == null) {
            return 0L;
        }
        return l11.longValue();
    }

    public final long b(int i11) {
        Long l11 = this.f30022b.get(i11);
        if (l11 == null) {
            return 0L;
        }
        return l11.longValue();
    }

    public final int c(int i11) {
        return this.f30023c.get(i11);
    }

    @Override // com.getui.gtc.base.db.AbstractTable
    public String createSql() {
        return "CREATE TABLE IF NOT EXISTS e (ei INTEGER PRIMARY KEY, elt TEXT, est TEXT, esn INTEGER)";
    }

    @Override // com.getui.gtc.base.db.AbstractTable
    public String getTableName() {
        return "e";
    }

    @Override // com.getui.gtc.base.db.AbstractTable
    public void initCache() {
        Cursor cursor = null;
        try {
            try {
                Cursor query = query(new String[]{NotificationStyle.EXPANDABLE_IMAGE_URL, "elt", "est", "esn"}, null, null);
                if (query == null) {
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                }
                while (query.moveToNext()) {
                    int i11 = query.getInt(query.getColumnIndex(NotificationStyle.EXPANDABLE_IMAGE_URL));
                    try {
                        this.f30021a.put(i11, Long.valueOf(Long.parseLong(query.getString(query.getColumnIndex("elt")))));
                    } catch (Exception unused) {
                    }
                    try {
                        this.f30022b.put(i11, Long.valueOf(Long.parseLong(query.getString(query.getColumnIndex("est")))));
                    } catch (Exception unused2) {
                    }
                    this.f30023c.put(i11, query.getInt(query.getColumnIndex("esn")));
                }
                query.close();
            } catch (Exception e11) {
                com.getui.gtc.i.c.a.b(e11);
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void a(int i11, long j11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationStyle.EXPANDABLE_IMAGE_URL, Integer.valueOf(i11));
        contentValues.put("elt", String.valueOf(j11));
        if (replace(null, contentValues) != -1) {
            this.f30021a.put(i11, Long.valueOf(j11));
        }
    }

    public final void a(int i11, long j11, int i12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationStyle.EXPANDABLE_IMAGE_URL, Integer.valueOf(i11));
        contentValues.put("est", String.valueOf(j11));
        contentValues.put("esn", Integer.valueOf(i12));
        if (replace(null, contentValues) != -1) {
            this.f30022b.put(i11, Long.valueOf(j11));
            this.f30023c.put(i11, i12);
        }
    }
}
