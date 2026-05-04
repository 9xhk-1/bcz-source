package i9;

import android.content.AsyncQueryHandler;
import android.content.Context;
import com.baicizhan.client.business.dataset.models.CollectWordRecord;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {
    public static void a(AsyncQueryHandler handler, CollectWordRecord record) {
        try {
            handler.startUpdate(0, null, a.b.f16104b, k9.a.f(record, CollectWordRecord.class, CollectWordRecord.COLUMN_MAP, null), "universe_topic_id=?", new String[]{String.valueOf(record.universeTopicId)});
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void b(Context context, long universeTopicId) {
        context.getContentResolver().delete(a.b.f16104b, "universe_topic_id = " + universeTopicId, null);
    }

    public static List<CollectWordRecord> c(Context context) {
        return k9.a.n(k9.c.i(a.b.f16104b).d(context), CollectWordRecord.class, CollectWordRecord.COLUMN_MAP);
    }

    public static List<CollectWordRecord> d(Context context, int limit) {
        return k9.a.n(k9.c.i(a.b.f16104b).c("score, create_at desc").b(limit).d(context), CollectWordRecord.class, CollectWordRecord.COLUMN_MAP);
    }

    public static void e(Context context, CollectWordRecord record) {
        try {
            context.getContentResolver().insert(a.b.f16104b, k9.a.f(record, CollectWordRecord.class, CollectWordRecord.COLUMN_MAP, null));
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }

    public static void f(Context context, Collection<CollectWordRecord> records) {
        g(context, records, true);
    }

    public static void g(Context context, Collection<CollectWordRecord> records, boolean deleteOld) {
        if (deleteOld) {
            try {
                context.getContentResolver().delete(a.b.f16104b, null, null);
            } catch (Exception e11) {
                qb.c.c("baicizhandb", "", e11);
                return;
            }
        }
        context.getContentResolver().bulkInsert(a.b.f16104b, k9.a.b(records, CollectWordRecord.class, CollectWordRecord.COLUMN_MAP, null));
    }
}
