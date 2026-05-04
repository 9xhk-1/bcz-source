package tj;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.baicizhan.client.business.dataset.models.CollectWordRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.TopicKey;
import com.baicizhan.online.resource_api.WordListWordMetaV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static final String f90761b = "WordListDataManager";

    /* renamed from: c, reason: collision with root package name */
    public static volatile z f90762c;

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, Pair<String, String>> f90763a = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.q<List<TopicKey>, ResourceService.Client, Boolean> {
        public a() {
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(List<TopicKey> topicIds, ResourceService.Client client) {
            if (topicIds.isEmpty()) {
                qb.c.i(z.f90761b, "ALL WORD HIT", new Object[0]);
                return Boolean.TRUE;
            }
            try {
                qb.c.i(z.f90761b, "", new Object[0]);
                for (WordListWordMetaV2 wordListWordMetaV2 : client.get_word_list_word_meta_v2(topicIds)) {
                    z.this.f90763a.put(Integer.valueOf(wordListWordMetaV2.topic_key.topic_id), new Pair(wordListWordMetaV2.word, wordListWordMetaV2.mean_cn));
                }
            } catch (Exception unused) {
                qb.c.i(z.f90761b, "", new Object[0]);
            }
            return Boolean.TRUE;
        }
    }

    public static /* synthetic */ TopicKey c(int i11, Integer num) {
        return new TopicKey(num.intValue(), i11, 0);
    }

    public static z g() {
        if (f90762c == null) {
            synchronized (z.class) {
                try {
                    if (f90762c == null) {
                        f90762c = new z();
                    }
                } finally {
                }
            }
        }
        return f90762c;
    }

    public void f() {
        this.f90763a.clear();
    }

    public String h(int topicId) {
        Pair<String, String> pair = this.f90763a.get(Integer.valueOf(topicId));
        if (pair != null) {
            return (String) pair.second;
        }
        return null;
    }

    public String i(int i11) {
        String str;
        Cursor d11;
        Object obj;
        Pair<String, String> pair = this.f90763a.get(Integer.valueOf(i11));
        if (pair != null && (obj = pair.first) != null) {
            return (String) obj;
        }
        Cursor cursor = null;
        String str2 = null;
        cursor = null;
        try {
            try {
                d11 = k9.c.i(a.e.f16180r).g("word", a.e.C0246a.f16184d).m("topic_id=" + i11, new String[0]).d(pb.a.a());
            } catch (Exception e11) {
                e = e11;
                str = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d11.moveToFirst();
            str2 = d11.getString(0);
            this.f90763a.put(Integer.valueOf(i11), new Pair<>(str2, d11.getString(1)));
            d11.close();
            return str2;
        } catch (Exception e12) {
            e = e12;
            str = str2;
            cursor = d11;
            qb.c.d(f90761b, "topic word not exists for " + i11 + ": " + e.toString(), new Object[0]);
            if (cursor != null) {
                cursor.close();
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            cursor = d11;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final /* synthetic */ Boolean j(Integer num) {
        return Boolean.valueOf(this.f90763a.get(num) == null);
    }

    public final /* synthetic */ rx.c k(Collection collection, Context context, List list) {
        if (list.size() > 0) {
            Cursor cursor = null;
            try {
                cursor = k9.c.i(a.e.f16180r).g("topic_id", "word", a.e.C0246a.f16184d).n("topic_id", collection, list.size()).d(context);
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    this.f90763a.put(Integer.valueOf(cursor.getInt(0)), new Pair<>(cursor.getString(1), cursor.getString(2)));
                    cursor.moveToNext();
                }
                cursor.close();
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
        return rx.c.u2(list);
    }

    public final /* synthetic */ Boolean l(Integer num) {
        return Boolean.valueOf(this.f90763a.get(num) == null);
    }

    public void m(Map<Long, CollectWordRecord> collectWordRecordMap) {
        for (Long l11 : collectWordRecordMap.keySet()) {
            int topicId = UniverseTopicId.getTopicId(l11.longValue());
            if (!this.f90763a.containsKey(Integer.valueOf(topicId)) || TextUtils.isEmpty((CharSequence) this.f90763a.get(Integer.valueOf(topicId)).second)) {
                CollectWordRecord collectWordRecord = collectWordRecordMap.get(l11);
                this.f90763a.put(Integer.valueOf(topicId), new Pair<>(collectWordRecord.word, collectWordRecord.meanCn));
            }
        }
    }

    public rx.c<Boolean> n(final Context context, final Collection<Integer> ids, final int wordLevelId) {
        return rx.c.u2(ids).I3(bc0.c.e()).V1(new wb0.p() { // from class: tj.v
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean j11;
                j11 = z.this.j((Integer) obj);
                return j11;
            }
        }).v6().b2(new wb0.p() { // from class: tj.w
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c k11;
                k11 = z.this.k(ids, context, (List) obj);
                return k11;
            }
        }).V1(new wb0.p() { // from class: tj.x
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean l11;
                l11 = z.this.l((Integer) obj);
                return l11;
            }
        }).c3(new wb0.p() { // from class: tj.y
            @Override // wb0.p
            public final Object call(Object obj) {
                return z.c(wordLevelId, (Integer) obj);
            }
        }).v6().v7(com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/resource_api")), new a());
    }

    public void o(Context context, Collection<Integer> ids) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Integer num : ids) {
            num.intValue();
            if (!this.f90763a.containsKey(num)) {
                arrayList.add(num);
            }
        }
        if (arrayList.size() > 0) {
            Cursor cursor = null;
            try {
                cursor = k9.c.i(a.e.f16180r).g("topic_id", "word", a.e.C0246a.f16184d).n("topic_id", ids, 500).d(context);
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    this.f90763a.put(Integer.valueOf(cursor.getInt(0)), new Pair<>(cursor.getString(1), cursor.getString(2)));
                    cursor.moveToNext();
                }
                cursor.close();
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
    }
}
