package sh;

import android.content.Context;
import android.database.Cursor;
import androidx.collection.LruCache;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.dataset.models.WordMediaUpdRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordMedia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class w extends LruCache<String, WordMediaRecord> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f88697c = "WordMediaRecord";

    /* renamed from: d, reason: collision with root package name */
    public static final w f88698d = new w(128);

    /* renamed from: a, reason: collision with root package name */
    public Context f88699a;

    /* renamed from: b, reason: collision with root package name */
    public int f88700b;

    public w(int maxSize) {
        super(maxSize);
    }

    public static w g() {
        return f88698d;
    }

    public boolean a(List<WordMediaRecord> values) {
        ArrayList arrayList = new ArrayList(values.size());
        for (WordMediaRecord wordMediaRecord : values) {
            put(wordMediaRecord.getWordid(), wordMediaRecord);
            arrayList.add(wordMediaRecord.getWordid());
        }
        try {
            this.f88699a.getContentResolver().delete(a.v.a(this.f88700b), k9.c.a("topic_id", "IN", arrayList), null);
            i9.o.r(this.f88699a, this.f88700b, values);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            qb.c.c(f88697c, "bulk insert failed.", e11);
            return false;
        }
    }

    public Map<String, WordMediaRecord> b(Collection<String> ids) {
        try {
            Map<String, WordMediaRecord> map = Collections.EMPTY_MAP;
            Cursor d11 = k9.c.i(a.v.a(this.f88700b)).g("topic_id", a.v.C0263a.f16322h, a.v.C0263a.f16323i, "tv_updated_at", "fm_updated_at").n("topic_id", ids, 500).d(this.f88699a);
            if (d11 != null) {
                try {
                    map = new HashMap<>(d11.getCount());
                    d11.moveToFirst();
                    while (!d11.isAfterLast()) {
                        WordMediaRecord wordMediaRecord = new WordMediaRecord();
                        wordMediaRecord.setWordid(d11.getString(0));
                        wordMediaRecord.setTvpath(d11.getString(1));
                        wordMediaRecord.setTvSnapshotPath(d11.getString(2));
                        wordMediaRecord.setTvupdate(d11.getLong(3));
                        wordMediaRecord.setFmupdate(d11.getLong(4));
                        map.put(wordMediaRecord.getWordid(), wordMediaRecord);
                        put(wordMediaRecord.getWordid(), wordMediaRecord);
                        d11.moveToNext();
                    }
                    d11.close();
                } catch (Throwable th2) {
                    d11.close();
                    throw th2;
                }
            }
            List<WordMediaUpdRecord> n11 = k9.a.n(k9.c.i(a.w.a(this.f88700b)).n("word_topic_id", ids, 500).d(this.f88699a), WordMediaUpdRecord.class, WordMediaUpdRecord.COLUMN_MAP);
            if (!xb.e.h(n11)) {
                for (WordMediaUpdRecord wordMediaUpdRecord : n11) {
                    String wordid = wordMediaUpdRecord.getWordid();
                    WordMediaRecord wordMediaRecord2 = map.get(wordid);
                    if (wordMediaRecord2 != null && (wordMediaRecord2.getFmupdate() != wordMediaUpdRecord.getFmupdate() || wordMediaRecord2.getTvupdate() != wordMediaUpdRecord.getTvupdate())) {
                        map.remove(wordid);
                    }
                }
            }
            return map;
        } catch (Throwable unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public boolean c(int topicId) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.toString(topicId));
        return b(arrayList).isEmpty();
    }

    @Override // androidx.collection.LruCache
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public WordMediaRecord create(String key) {
        return (WordMediaRecord) k9.a.q(k9.c.i(a.v.a(this.f88700b)).g("topic_id", a.v.C0263a.f16322h, a.v.C0263a.f16323i).m("topic_id = " + key, new String[0]).d(this.f88699a), WordMediaRecord.class, WordMediaRecord.COLUMN_MAP);
    }

    public void e(TopicResourceV2 topicResource) {
        WordMedia media = topicResource.getMedia();
        if (media == null || media.getTopic_id() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(WordMediaRecord.fromWordMedia(media));
        a(arrayList);
        qb.c.i(f88697c, media.toString(), new Object[0]);
    }

    public int f() {
        return this.f88700b;
    }

    public boolean h() {
        return this.f88699a == null || this.f88700b <= 0;
    }

    public boolean i(WordMediaRecord value) {
        put(value.getWordid(), value);
        try {
            i9.o.r(this.f88699a, this.f88700b, Collections.singletonList(value));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void j(Context context, int bookId) {
        this.f88699a = context.getApplicationContext();
        this.f88700b = bookId;
        evictAll();
    }
}
