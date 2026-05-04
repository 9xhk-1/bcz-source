package i9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.UpdateZpkMd5;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.ZPackUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f60422a = "TopicRecordHelper";

    public static synchronized void a(Context context, int bookId) {
        synchronized (l.class) {
            k9.d.b(a.c.f16129d).a("CREATE TABLE IF NOT EXISTS " + a.i.b(bookId) + "(topic INTEGER PRIMARY KEY NOT NULL, zpk_path VARCHAR default \"\", update_flag_md5 VARCHAR default \"\", coverage INTEGER default 0,zpk_version INTEGER default 0);", new String[0]).c(context);
        }
    }

    public static void b(Context context, int bookId, TopicRecord record) {
        UpdateZpkMd5 F;
        if (record == null || !TextUtils.isEmpty(record.updateFlagMD5) || (F = x.r().F(record.topicId)) == null) {
            return;
        }
        record.updateFlagMD5 = F.updateFlagMD5;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.i.C0250a.f16201c, F.updateFlagMD5);
            contentValues.put(a.i.C0250a.f16203e, Integer.valueOf(F.zpkVersion));
            Uri a11 = a.i.a(bookId);
            context.getContentResolver().update(a11, contentValues, "topic=" + record.topicId, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void c(Context context, int bookId, TopicRecord record) {
        if (record != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.i.C0250a.f16203e, Integer.valueOf(record.zpkVersion));
                Uri a11 = a.i.a(bookId);
                context.getContentResolver().update(a11, contentValues, "topic=" + record.topicId, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static TopicRecord d(Context context, int bookId, int topicId) {
        Cursor cursor;
        try {
            cursor = k9.c.i(a.i.a(bookId)).m("topic = " + topicId, new String[0]).g("zpk_path", a.i.C0250a.f16201c, a.i.C0250a.f16203e).d(context);
        } catch (Throwable unused) {
            cursor = null;
        }
        try {
            cursor.moveToFirst();
            String string = cursor.getString(0);
            String string2 = cursor.getString(1);
            int i11 = cursor.getInt(2);
            TopicRecord readMeatTopicRecordByName = ZPackUtils.readMeatTopicRecordByName(bookId, string);
            if (readMeatTopicRecordByName != null) {
                readMeatTopicRecordByName.fillMetaProperties(bookId, string, string2, i11);
            } else {
                qb.c.d("", "get book topic record failed, zpk name %s", string);
            }
            cursor.close();
            return readMeatTopicRecordByName;
        } catch (Throwable unused2) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
    }

    public static Map<Integer, TopicRecord> e(Context context, int bookId, Collection<Integer> topicIds) {
        Cursor cursor = null;
        try {
            try {
                Cursor d11 = k9.c.i(a.i.a(bookId)).n("topic", topicIds, 0).g("topic", "zpk_path", a.i.C0250a.f16201c, a.i.C0250a.f16203e).d(context);
                if (d11 != null && d11.getCount() != 0) {
                    HashMap hashMap = new HashMap(d11.getCount());
                    d11.moveToFirst();
                    while (!d11.isAfterLast()) {
                        int i11 = d11.getInt(0);
                        String string = d11.getString(1);
                        String string2 = d11.getString(2);
                        int i12 = d11.getInt(3);
                        TopicRecord readMeatTopicRecordByName = ZPackUtils.readMeatTopicRecordByName(bookId, string);
                        if (readMeatTopicRecordByName != null) {
                            readMeatTopicRecordByName.fillMetaProperties(bookId, string, string2, i12);
                            b(context, bookId, readMeatTopicRecordByName);
                            hashMap.put(Integer.valueOf(i11), readMeatTopicRecordByName);
                        }
                        d11.moveToNext();
                    }
                    d11.close();
                    return hashMap;
                }
                Map<Integer, TopicRecord> map = Collections.EMPTY_MAP;
                if (d11 != null) {
                    d11.close();
                }
                return map;
            } catch (Throwable unused) {
                return Collections.EMPTY_MAP;
            }
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public static List<TopicRecord> f(Context context, int bookId) {
        Cursor d11 = k9.c.i(a.i.a(bookId)).g("zpk_path", a.i.C0250a.f16201c, a.i.C0250a.f16203e).c("topic").d(context);
        try {
            try {
                int count = d11.getCount();
                if (count == 0) {
                    List<TopicRecord> list = Collections.EMPTY_LIST;
                    d11.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList(count);
                d11.moveToFirst();
                while (!d11.isAfterLast()) {
                    String string = d11.getString(0);
                    String string2 = d11.getString(1);
                    int i11 = d11.getInt(2);
                    TopicRecord readMeatTopicRecordByName = ZPackUtils.readMeatTopicRecordByName(bookId, string);
                    if (readMeatTopicRecordByName != null) {
                        readMeatTopicRecordByName.fillMetaProperties(bookId, string, string2, i11);
                    } else {
                        qb.c.d("", "get book topic record failed, zpk name %s", string);
                    }
                    arrayList.add(readMeatTopicRecordByName);
                    d11.moveToNext();
                }
                d11.close();
                return arrayList;
            } catch (Exception unused) {
                List<TopicRecord> list2 = Collections.EMPTY_LIST;
                if (d11 != null) {
                    d11.close();
                }
                return list2;
            }
        } catch (Throwable th2) {
            if (d11 != null) {
                d11.close();
            }
            throw th2;
        }
    }

    public static Map<Integer, Integer> g(Context context, int bookId) {
        Cursor d11 = k9.c.i(a.i.a(bookId)).g("topic", a.i.C0250a.f16202d).c("topic").d(context);
        try {
            try {
                int count = d11.getCount();
                if (count == 0) {
                    Map<Integer, Integer> map = Collections.EMPTY_MAP;
                    d11.close();
                    return map;
                }
                HashMap hashMap = new HashMap(count);
                d11.moveToFirst();
                while (!d11.isAfterLast()) {
                    hashMap.put(Integer.valueOf(d11.getInt(0)), Integer.valueOf(d11.getInt(1)));
                    d11.moveToNext();
                }
                d11.close();
                return hashMap;
            } catch (Exception unused) {
                Map<Integer, Integer> map2 = Collections.EMPTY_MAP;
                if (d11 != null) {
                    d11.close();
                }
                return map2;
            }
        } catch (Throwable th2) {
            if (d11 != null) {
                d11.close();
            }
            throw th2;
        }
    }

    public static void h(Context context, TopicRecord record) {
        try {
            context.getContentResolver().insert(a.i.a(record.bookId), k9.a.f(record, TopicRecord.class, TopicRecord.COLUMN_MAP, null));
        } catch (Exception e11) {
            qb.c.d("baicizhandb", e11.toString(), new Object[0]);
        }
    }

    public static void i(Context context, int bookId, Collection<TopicRecord> records) {
        if (records != null) {
            try {
                if (records.size() == 0) {
                    return;
                }
                k9.a.w(context, a.i.a(bookId), k9.a.b(records, TopicRecord.class, TopicRecord.COLUMN_MAP, null), 100);
            } catch (Exception e11) {
                qb.c.d("baicizhandb", e11.toString(), new Object[0]);
            }
        }
    }
}
