package i9;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n {
    public static WordClozeRecord a(Context context, int topicId) {
        return (WordClozeRecord) k9.a.q(k9.c.i(a.q.f16283b).m("topic_id=?", String.valueOf(topicId)).d(context), WordClozeRecord.class, WordClozeRecord.COLUMN_MAP);
    }

    public static Map<Integer, WordClozeRecord> b(Context context, int bookId, Collection<Integer> topicIds, boolean ignoreData) {
        List<WordClozeRecord> j11 = (f.c(context, "global.word_cloze_book_table_base." + bookId) && ignoreData) ? k.j(context, bookId) : k9.a.n(k9.c.i(a.q.f16283b).g(ignoreData ? new String[]{"topic_id"} : new String[]{"topic_id", a.q.C0258a.f16285b}).n("topic_id", topicIds, 999).d(context), WordClozeRecord.class, ignoreData ? WordClozeRecord.COLUMN_MAP_IGNORE_DATA : WordClozeRecord.COLUMN_MAP);
        if (j11 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(j11.size());
        for (WordClozeRecord wordClozeRecord : j11) {
            hashMap.put(Integer.valueOf(wordClozeRecord.getTopicId()), wordClozeRecord);
        }
        return hashMap;
    }
}
