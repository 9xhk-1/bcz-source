package i9;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k9.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.h<Integer, TopicLearnRecord> {
        @Override // k9.a.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(TopicLearnRecord t11) {
            return Integer.valueOf(t11.topicId);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements a.h<Integer, TopicLearnRecord> {
        @Override // k9.a.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(TopicLearnRecord t11) {
            return Integer.valueOf(t11.topicId);
        }
    }

    public static void a(Context context, int bookId) {
        k9.d.b(a.c.f16130e).a("CREATE TABLE IF NOT EXISTS " + a.k.b(bookId) + "(topic_id  integer primary key,topic_obn integer default 0, topic_day integer default 0, total_time integer default 0, do_num integer default 0, err_num integer default 0, sync_state integer default 0, is_today_new integer default 0, last_do_time integer default 0,tag_id integer default 0,review_round integer default 0)", new String[0]).c(context);
    }

    public static void b(Context context, int bookId) {
        k9.d.b(a.c.f16130e).a("CREATE TABLE IF NOT EXISTS " + a.j.b(bookId) + "(topic_id  integer primary key,topic_obn integer, topic_day integer, total_time integer, do_num integer, err_num integer, sync_state integer, is_today_new integer, last_do_time integer, radio_state integer default 0, radio_post_state integer default 0, radio_skip_state integer default 0, radio_tv_state integer default 0,create_at integer default 0,extra varchar default \"\",review_round integer default 0)", new String[0]).c(context);
    }

    public static void c(Context context, int bookId) {
        k9.d.b(a.c.f16130e).a("CREATE TABLE IF NOT EXISTS " + a.p.b(bookId) + "(topic_id integer primary key)", new String[0]).c(context);
    }

    public static void d(Context context, int bookId, List<Integer> topicIds) {
        context.getContentResolver().delete(a.k.a(bookId), "topic_id in (" + TextUtils.join(",", topicIds) + pn.j.f81007d, null);
    }

    public static void e(Context context, int bookId, List<Integer> topicIds) {
        context.getContentResolver().delete(a.j.a(bookId), "topic_id in (" + TextUtils.join(",", topicIds) + pn.j.f81007d, null);
    }

    public static TopicLearnRecord f(Context context, int bookId, int topicId) {
        return (TopicLearnRecord) k9.a.q(k9.c.i(a.k.a(bookId)).m("topic_id = " + topicId, new String[0]).d(context), TopicLearnRecord.class, TopicLearnRecord.TOTAL_TABLE_COLUMN_MAP);
    }

    public static Map<Integer, TopicLearnRecord> g(Context context, int bookId) {
        return k9.a.t(k9.c.i(a.k.a(bookId)).d(context), TopicLearnRecord.class, TopicLearnRecord.SYNCING_TABLE_COLUMN_MAP, new b());
    }

    public static TopicLearnRecord h(Context context, int bookId, int topicId) {
        return (TopicLearnRecord) k9.a.q(k9.c.i(a.j.a(bookId)).m("topic_id = " + topicId, new String[0]).d(context), TopicLearnRecord.class, TopicLearnRecord.TOTAL_TABLE_COLUMN_MAP);
    }

    public static Map<Integer, TopicLearnRecord> i(Context context, int bookId) {
        return k9.a.t(k9.c.i(a.j.a(bookId)).d(context), TopicLearnRecord.class, TopicLearnRecord.TOTAL_TABLE_COLUMN_MAP, new a());
    }

    public static List<WordClozeRecord> j(Context context, int bookId) {
        return k9.a.n(k9.c.i(a.p.a(bookId)).g("topic_id").d(context), WordClozeRecord.class, WordClozeRecord.COLUMN_MAP_IGNORE_DATA);
    }

    public static void k(Context context, int bookId, int spanDays) {
        k9.d.b(a.c.f16130e).a("UPDATE " + a.j.b(bookId) + " SET topic_day = topic_day + 1, is_today_new = 0", new String[0]);
        context.getContentResolver().delete(a.k.a(bookId), "sync_state=1", null);
        k9.d.b(a.c.f16130e).a("UPDATE " + a.k.b(bookId) + " SET topic_day = topic_day + " + spanDays + ", is_today_new = 0", new String[0]).c(context);
        k9.d.b(a.c.f16130e).a("UPDATE " + a.j.b(bookId) + " SET topic_day = topic_day + " + spanDays + ", is_today_new = 0", new String[0]).c(context);
    }

    public static void l(Context context, int bookId, Collection<WordClozeRecord> records) {
        try {
            context.getContentResolver().delete(a.p.a(bookId), null, null);
            ContentValues[] contentValuesArr = new ContentValues[records.size()];
            Iterator<WordClozeRecord> it = records.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                contentValuesArr[i11] = k9.a.f(it.next(), WordClozeRecord.class, WordClozeRecord.COLUMN_MAP_IGNORE_DATA, null);
                i11++;
            }
            context.getContentResolver().bulkInsert(a.p.a(bookId), contentValuesArr);
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }

    public static void m(Context context, int bookId, TopicLearnRecord record) {
        try {
            context.getContentResolver().insert(a.k.a(bookId), k9.a.f(record, TopicLearnRecord.class, TopicLearnRecord.SYNCING_TABLE_COLUMN_MAP, null));
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }

    public static int n(Context context, int bookId, Collection<TopicLearnRecord> records) {
        try {
            return k9.a.w(context, a.k.a(bookId), k9.a.b(records, TopicLearnRecord.class, TopicLearnRecord.SYNCING_TABLE_COLUMN_MAP, null), 500);
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
            return 0;
        }
    }

    public static void o(Context context, int bookId, TopicLearnRecord record) {
        try {
            context.getContentResolver().insert(a.j.a(bookId), k9.a.f(record, TopicLearnRecord.class, TopicLearnRecord.TOTAL_TABLE_COLUMN_MAP, null));
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }

    public static int p(Context context, int bookId, Collection<TopicLearnRecord> records) {
        try {
            return k9.a.w(context, a.j.a(bookId), k9.a.b(records, TopicLearnRecord.class, TopicLearnRecord.TOTAL_TABLE_COLUMN_MAP, null), 500);
        } catch (Exception e11) {
            qb.c.c("", "save total topic lean records failed.", e11);
            qb.c.c("baicizhandb", "", e11);
            return 0;
        }
    }

    public static void q(Context context, int bookId, int topicId, int score) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("topic_obn", Integer.valueOf(score));
            context.getContentResolver().update(a.j.a(bookId), contentValues, "topic_id = " + topicId, null);
            context.getContentResolver().update(a.k.a(bookId), contentValues, "topic_id = " + topicId, null);
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }
}
