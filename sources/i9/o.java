package i9;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.WordMediaMidRecord;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.dataset.models.WordMediaUpdRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f60427a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final int f60428b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f60429c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f60430d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f60431e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f60432f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f60433g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final String f60434h = "/kaichang.baicizhan";

    /* renamed from: i, reason: collision with root package name */
    public static final String f60435i = "/pianwei.baicizhan";

    public static void A(Context context, int topicId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("topic_id", Integer.valueOf(topicId));
        context.getContentResolver().insert(a.x.f16331b, contentValues);
    }

    public static synchronized void B(Context context, int bookId, List<WordMediaRecord> records, boolean flush) {
        synchronized (o.class) {
            if (records != null) {
                if (!records.isEmpty()) {
                    if (flush) {
                        try {
                            context.getContentResolver().delete(a.v.a(bookId), null, null);
                        } catch (Exception e11) {
                            qb.c.c("", "delete word media records error. ", e11);
                        }
                        r(context, bookId, records);
                        return;
                    }
                    try {
                        for (WordMediaRecord wordMediaRecord : records) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("topic_id", wordMediaRecord.getWordid());
                            contentValues.put("topic_word", wordMediaRecord.getWord());
                            contentValues.put(a.v.C0263a.f16317c, wordMediaRecord.getWordtype());
                            contentValues.put(a.v.C0263a.f16318d, wordMediaRecord.getCnmean());
                            contentValues.put(a.v.C0263a.f16319e, wordMediaRecord.getExample());
                            contentValues.put(a.v.C0263a.f16321g, wordMediaRecord.getFmpath());
                            contentValues.put(a.v.C0263a.f16320f, wordMediaRecord.getHighfmpath());
                            contentValues.put(a.v.C0263a.f16322h, wordMediaRecord.getTvpath());
                            contentValues.put(a.v.C0263a.f16323i, wordMediaRecord.getTvSnapshotPath());
                            contentValues.put("fm_updated_at", Long.valueOf(wordMediaRecord.getFmupdate()));
                            contentValues.put("tv_updated_at", Long.valueOf(wordMediaRecord.getTvupdate()));
                            context.getContentResolver().update(a.v.a(bookId), contentValues, "topic_id=?", new String[]{wordMediaRecord.getWordid()});
                        }
                    } catch (Exception e12) {
                        qb.c.c("", "update word media records error. ", e12);
                    }
                    return;
                }
            }
        }
    }

    public static synchronized void a(Context context, int bookId) {
        synchronized (o.class) {
            try {
                if (!c.k(context, a.c.f16134i, a.v.b(bookId))) {
                    k9.d.b(a.c.f16134i).a("CREATE TABLE IF NOT EXISTS " + a.v.b(bookId) + pn.j.f81006c + "topic_id INTEGER PRIMARY KEY, topic_word TEXT, " + a.v.C0263a.f16317c + " TEXT, " + a.v.C0263a.f16318d + " TEXT, " + a.v.C0263a.f16319e + " TEXT, " + a.v.C0263a.f16320f + " TEXT, " + a.v.C0263a.f16321g + " TEXT, " + a.v.C0263a.f16322h + " TEXT, " + a.v.C0263a.f16323i + " TEXT DEFAULT \"\",fm_updated_at INTEGER, tv_updated_at INTEGER)", new String[0]).c(context);
                }
                if (!c.k(context, a.c.f16134i, a.w.b(bookId))) {
                    k9.d.b(a.c.f16134i).a("CREATE TABLE IF NOT EXISTS " + a.w.b(bookId) + pn.j.f81006c + "word_topic_id INTEGER PRIMARY KEY, fm_updated_at INTEGER, tv_updated_at INTEGER)", new String[0]).c(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void b(Context context, int bookId) {
        synchronized (o.class) {
            try {
                context.getContentResolver().delete(a.v.a(bookId), null, null);
            } catch (Exception e11) {
                qb.c.c("", "delete word media records error. ", e11);
            }
        }
    }

    public static synchronized void c(Context context, int bookId) {
        synchronized (o.class) {
            try {
                context.getContentResolver().delete(a.w.a(bookId), null, null);
            } catch (Exception e11) {
                qb.c.c("", "delete word media update records error. ", e11);
            }
        }
    }

    public static Set<String> d(Context context, int bookId, Set<String> wordids, int type) {
        if (wordids == null || wordids.isEmpty()) {
            return null;
        }
        Cursor d11 = k9.c.i(a.w.a(bookId)).m(type == 0 ? "fm_updated_at=?" : "tv_updated_at=?", "0").d(context);
        if (d11 == null) {
            return wordids;
        }
        while (d11.moveToNext()) {
            try {
                wordids.remove(d11.getString(d11.getColumnIndex("word_topic_id")));
            } finally {
                d11.close();
            }
        }
        return wordids;
    }

    public static List<String> e(Context context, int bookId, int type) {
        StringBuilder sb2 = new StringBuilder("select distinct ");
        sb2.append("word_topic_id");
        sb2.append(" ");
        sb2.append("from ");
        sb2.append(a.w.b(bookId));
        sb2.append(" ");
        sb2.append("where ");
        sb2.append(type == 0 ? "fm_updated_at" : "tv_updated_at");
        sb2.append("<>?");
        Cursor d11 = k9.c.j(a.c.f16134i, sb2.toString(), "0").d(context);
        if (d11 == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (d11.moveToNext()) {
                arrayList.add(d11.getString(d11.getColumnIndex("word_topic_id")));
            }
            return arrayList;
        } finally {
            d11.close();
        }
    }

    public static List<String> f(Context context, int bookId) {
        Cursor d11 = k9.c.j(a.c.f16134i, "select distinct word_topic_id from " + a.w.b(bookId), new String[0]).d(context);
        if (d11 == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (d11.moveToNext()) {
                arrayList.add(d11.getString(d11.getColumnIndex("word_topic_id")));
            }
            return arrayList;
        } finally {
            d11.close();
        }
    }

    public static String g(Context context, int type) {
        if (type != 2 && type != 3) {
            qb.c.d("", "cannot get border media path for incorrect type [%d]", Integer.valueOf(type));
            return null;
        }
        Cursor d11 = k9.c.i(a.t.f16307b).m("type=?", type + "").d(context);
        if (d11 == null) {
            return h(type);
        }
        try {
            if (!d11.moveToFirst()) {
                d11.close();
                return h(type);
            }
            String string = d11.getString(d11.getColumnIndex("path"));
            if (TextUtils.isEmpty(string)) {
                string = h(type);
            }
            return string;
        } finally {
            d11.close();
        }
    }

    public static String h(int type) {
        if (2 == type) {
            return f60434h;
        }
        if (3 == type) {
            return f60435i;
        }
        return null;
    }

    public static Set<Integer> i(Context context, int bookId, int type) {
        Cursor d11 = k9.c.i(a.w.a(bookId)).m(type == 0 ? "fm_updated_at=?" : "tv_updated_at=?", "0").d(context);
        if (d11 == null) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            while (d11.moveToNext()) {
                hashSet.add(Integer.valueOf(d11.getInt(d11.getColumnIndex("word_topic_id"))));
            }
            return hashSet;
        } finally {
            d11.close();
        }
    }

    public static Set<Integer> j(Context context, int bookId, int type) {
        Cursor d11 = k9.c.i(a.w.a(bookId)).m(type == 0 ? "fm_updated_at<>?" : "tv_updated_at<>?", "0").d(context);
        if (d11 == null) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            while (d11.moveToNext()) {
                hashSet.add(Integer.valueOf(d11.getInt(d11.getColumnIndex("word_topic_id"))));
            }
            return hashSet;
        } finally {
            d11.close();
        }
    }

    public static List<WordMediaMidRecord> k(Context context, int type) {
        if (type != 0 && type != 1) {
            qb.c.d("", "cannot get word media mid records for incorrect type [%d]", Integer.valueOf(type));
            return null;
        }
        return k9.a.n(k9.c.i(a.t.f16307b).m("type=?", type + "").d(context), WordMediaMidRecord.class, WordMediaMidRecord.COLUMN_MAP);
    }

    public static WordMediaRecord l(Context context, int bookId, String wordid, int type) {
        if (TextUtils.isEmpty(wordid)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type == 0 ? "fm_updated_at<>?" : "tv_updated_at<>?");
        sb2.append(" and ");
        sb2.append("topic_id");
        sb2.append(s60.d.f88059c);
        return (WordMediaRecord) k9.a.q(k9.c.i(a.v.a(bookId)).m(sb2.toString(), "0", wordid).d(context), WordMediaRecord.class, WordMediaRecord.COLUMN_MAP);
    }

    public static List<WordMediaRecord> m(Context context, int bookId, Set<String> wordids, int type) {
        if (wordids == null || wordids.isEmpty()) {
            return null;
        }
        Cursor d11 = type == 0 ? k9.c.i(a.v.a(bookId)).m("fm_updated_at<>? and amr_audio_path is not null and amr_audio_path<>? and m4a_audio_path is not null and m4a_audio_path<>?", "0", "", "").d(context) : k9.c.i(a.v.a(bookId)).m("tv_updated_at<>? and tv_path is not null and tv_path<>?", "0", "0").d(context);
        if (d11 == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(wordids.size());
            while (d11.moveToNext()) {
                String string = d11.getString(d11.getColumnIndex("topic_id"));
                if (wordids.contains(string)) {
                    WordMediaRecord wordMediaRecord = new WordMediaRecord();
                    wordMediaRecord.setWordid(string);
                    wordMediaRecord.setWord(d11.getString(d11.getColumnIndex("topic_word")));
                    wordMediaRecord.setCnmean(d11.getString(d11.getColumnIndex(a.v.C0263a.f16318d)));
                    wordMediaRecord.setWordtype(d11.getString(d11.getColumnIndex(a.v.C0263a.f16317c)));
                    wordMediaRecord.setExample(d11.getString(d11.getColumnIndex(a.v.C0263a.f16319e)));
                    wordMediaRecord.setFmpath(d11.getString(d11.getColumnIndex(a.v.C0263a.f16321g)));
                    wordMediaRecord.setHighfmpath(d11.getString(d11.getColumnIndex(a.v.C0263a.f16320f)));
                    wordMediaRecord.setTvpath(d11.getString(d11.getColumnIndex(a.v.C0263a.f16322h)));
                    wordMediaRecord.setTvSnapshotPath(d11.getString(d11.getColumnIndex(a.v.C0263a.f16323i)));
                    wordMediaRecord.setFmupdate(d11.getLong(d11.getColumnIndex("fm_updated_at")));
                    wordMediaRecord.setTvupdate(d11.getLong(d11.getColumnIndex("tv_updated_at")));
                    arrayList.add(wordMediaRecord);
                }
            }
            return arrayList;
        } finally {
            d11.close();
        }
    }

    public static List<String> n(Context context, int bookId) {
        String b11 = a.v.b(bookId);
        String b12 = a.w.b(bookId);
        Cursor d11 = k9.c.j(a.c.f16134i, "select distinct " + b12 + ".word_topic_id from " + b12 + " join " + b11 + " on " + b12 + ".word_topic_id" + ContainerUtils.KEY_VALUE_DELIMITER + b11 + ".topic_id where " + b12 + ".fm_updated_at<>" + b11 + ".fm_updated_at or " + b12 + ".tv_updated_at<>" + b11 + ".tv_updated_at", new String[0]).d(context);
        if (d11 == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (d11.moveToNext()) {
                arrayList.add(d11.getString(d11.getColumnIndex("word_topic_id")));
            }
            return arrayList;
        } finally {
            d11.close();
        }
    }

    public static List<TopicLearnRecord> o(Context context, int bookid) {
        return k9.a.n(k9.c.i(a.j.a(bookid)).m("radio_post_state=?", "1").d(context), TopicLearnRecord.class, TopicLearnRecord.MEDIA_SYNC_COLUMN_MAP);
    }

    public static List<WordMediaUpdRecord> p(Context context, int bookId) {
        return k9.a.n(k9.c.i(a.w.a(bookId)).d(context), WordMediaUpdRecord.class, WordMediaUpdRecord.COLUMN_MAP);
    }

    public static boolean q(Context context, int topicId) {
        Cursor d11 = k9.c.i(a.x.f16331b).m("topic_id = " + topicId, new String[0]).d(context);
        if (d11 == null) {
            return false;
        }
        try {
            return d11.getCount() > 0;
        } finally {
            d11.close();
        }
    }

    public static synchronized void r(Context context, int bookId, List<WordMediaRecord> records) {
        synchronized (o.class) {
            if (records != null) {
                if (!records.isEmpty()) {
                    int size = (records.size() + 100) / 100;
                    int i11 = 0;
                    while (i11 < size) {
                        int i12 = i11 * 100;
                        i11++;
                        int min = Math.min(records.size(), i11 * 100);
                        ContentValues[] contentValuesArr = new ContentValues[min - i12];
                        int i13 = 0;
                        while (i12 < min) {
                            WordMediaRecord wordMediaRecord = records.get(i12);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("topic_id", wordMediaRecord.getWordid());
                            contentValues.put("topic_word", wordMediaRecord.getWord());
                            contentValues.put(a.v.C0263a.f16317c, wordMediaRecord.getWordtype());
                            contentValues.put(a.v.C0263a.f16318d, wordMediaRecord.getCnmean());
                            contentValues.put(a.v.C0263a.f16319e, wordMediaRecord.getExample());
                            contentValues.put(a.v.C0263a.f16321g, wordMediaRecord.getFmpath());
                            contentValues.put(a.v.C0263a.f16320f, wordMediaRecord.getHighfmpath());
                            contentValues.put(a.v.C0263a.f16322h, wordMediaRecord.getTvpath());
                            contentValues.put(a.v.C0263a.f16323i, wordMediaRecord.getTvSnapshotPath());
                            contentValues.put("fm_updated_at", Long.valueOf(wordMediaRecord.getFmupdate()));
                            contentValues.put("tv_updated_at", Long.valueOf(wordMediaRecord.getTvupdate()));
                            contentValuesArr[i13] = contentValues;
                            i13++;
                            i12++;
                        }
                        try {
                            qb.c.b("whiz", "insert word media records: " + context.getContentResolver().bulkInsert(a.v.a(bookId), contentValuesArr) + "; records size: " + records.size(), new Object[0]);
                        } catch (Exception e11) {
                            qb.c.c("whiz", "bulk insert word media records error. ", e11);
                        }
                    }
                }
            }
        }
    }

    public static boolean s(Context context, int bookId) {
        Cursor d11 = k9.c.i(a.s.f16304b).m("loaded_book_id=?", String.valueOf(bookId)).d(context);
        if (d11 == null) {
            return false;
        }
        try {
            return d11.getCount() > 0;
        } finally {
            d11.close();
        }
    }

    public static boolean t(Context context, int bookId) {
        Cursor d11 = k9.c.j(a.c.f16134i, "select distinct word_topic_id from " + a.w.b(bookId), null).d(context);
        boolean z11 = d11 == null || d11.getCount() <= 0;
        if (d11 != null) {
            d11.close();
        }
        return z11;
    }

    public static synchronized void u(Context context, List<WordMediaMidRecord> records) {
        synchronized (o.class) {
            if (records != null) {
                if (!records.isEmpty()) {
                    ContentValues[] contentValuesArr = new ContentValues[records.size()];
                    int i11 = 0;
                    for (WordMediaMidRecord wordMediaMidRecord : records) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("path", wordMediaMidRecord.getPath());
                        contentValues.put("type", Integer.valueOf(wordMediaMidRecord.getType()));
                        contentValuesArr[i11] = contentValues;
                        i11++;
                    }
                    try {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uri = a.t.f16307b;
                        contentResolver.delete(uri, null, null);
                        qb.c.b("whiz", "refresh word media mid records, inserted: " + context.getContentResolver().bulkInsert(uri, contentValuesArr), new Object[0]);
                    } catch (Exception e11) {
                        qb.c.c("", "refresh word media mid records error. ", e11);
                    }
                }
            }
        }
    }

    public static synchronized boolean v(Context context, long fmupd, long tvupd) {
        synchronized (o.class) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fm_mid_update", Long.valueOf(fmupd));
            contentValues.put("tv_mid_update", Long.valueOf(tvupd));
            Uri uri = a.u.f16311b;
            Cursor d11 = k9.c.i(uri).d(context);
            if (d11 == null || d11.getCount() == 0) {
                return context.getContentResolver().insert(uri, contentValues) != null;
            }
            if (fmupd <= 0 && tvupd <= 0) {
                return false;
            }
            try {
                if (d11.moveToFirst()) {
                    long j11 = d11.getLong(d11.getColumnIndex("fm_mid_update"));
                    long j12 = d11.getLong(d11.getColumnIndex("tv_mid_update"));
                    if (j11 != fmupd || j12 != tvupd) {
                        ContentValues contentValues2 = new ContentValues();
                        if (fmupd == j11) {
                            fmupd = j11;
                        }
                        contentValues2.put("fm_mid_update", Long.valueOf(fmupd));
                        if (tvupd != j12) {
                            j12 = tvupd;
                        }
                        contentValues2.put("tv_mid_update", Long.valueOf(j12));
                        return context.getContentResolver().update(uri, contentValues2, null, null) > 0;
                    }
                }
                d11.close();
                return false;
            } finally {
                d11.close();
            }
        }
    }

    public static synchronized void w(Context context, int bookid, List<TopicLearnRecord> records) {
        synchronized (o.class) {
            if (records != null) {
                if (!records.isEmpty()) {
                    for (TopicLearnRecord topicLearnRecord : records) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(a.j.C0251a.f16214j, Integer.valueOf(topicLearnRecord.radioState));
                        contentValues.put(a.j.C0251a.f16217m, Integer.valueOf(topicLearnRecord.radioTVState));
                        contentValues.put(a.j.C0251a.f16216l, Integer.valueOf(topicLearnRecord.radioSkipState));
                        contentValues.put(a.j.C0251a.f16215k, (Integer) 0);
                        context.getContentResolver().update(a.j.a(bookid), contentValues, "topic_id=?", new String[]{String.valueOf(topicLearnRecord.topicId)});
                    }
                }
            }
        }
    }

    public static synchronized void x(Context context, int bookId, List<WordMediaUpdRecord> records) {
        synchronized (o.class) {
            if (records != null) {
                if (!records.isEmpty()) {
                    ContentValues[] contentValuesArr = new ContentValues[records.size()];
                    int i11 = 0;
                    for (WordMediaUpdRecord wordMediaUpdRecord : records) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("word_topic_id", wordMediaUpdRecord.getWordid());
                        contentValues.put("fm_updated_at", Long.valueOf(wordMediaUpdRecord.getFmupdate()));
                        contentValues.put("tv_updated_at", Long.valueOf(wordMediaUpdRecord.getTvupdate()));
                        contentValuesArr[i11] = contentValues;
                        i11++;
                    }
                    try {
                        context.getContentResolver().delete(a.w.a(bookId), null, null);
                        context.getContentResolver().bulkInsert(a.w.a(bookId), contentValuesArr);
                    } catch (Exception e11) {
                        qb.c.c("", "refresh word media update records error. ", e11);
                    }
                }
            }
        }
    }

    public static void y(Context context, int bookid) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.j.C0251a.f16215k, (Integer) 0);
        context.getContentResolver().update(a.j.a(bookid), contentValues, null, null);
    }

    public static synchronized void z(Context context, int bookId) {
        synchronized (o.class) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("loaded_book_id", Integer.valueOf(bookId));
                context.getContentResolver().insert(a.s.f16304b, contentValues);
            } catch (Exception e11) {
                qb.c.c("", "set current book id error. ", e11);
            }
        }
    }
}
