package sh;

import android.util.SparseArray;
import androidx.collection.LruCache;
import com.baicizhan.client.business.dataset.models.SimilarWordRecord;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.SimilarWord;
import com.baicizhan.online.resource_api.TopicResourceV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    public static final String f88657c = "SimilarWordsCache";

    /* renamed from: d, reason: collision with root package name */
    public static final m f88658d = new m();

    /* renamed from: a, reason: collision with root package name */
    public LruCache<Long, TopicRecord> f88659a = new LruCache<>(128);

    /* renamed from: b, reason: collision with root package name */
    public SparseArray<List<SimilarWordRecord>> f88660b = new SparseArray<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<TopicRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88661a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f88662b;

        public a(final int val$topicId, final int val$bookId) {
            this.f88661a = val$topicId;
            this.f88662b = val$bookId;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TopicRecord call() throws Exception {
            TopicRecord fromTopicResV2 = TopicRecord.fromTopicResV2(this.f88662b, ((ResourceService.Client) new com.baicizhan.client.business.thrift.l("/rpc/resource_api").c(2).d(5000).b(5000).a()).get_topic_resource_v2(TopicIdMapingUtils.buildTopicKey(this.f88661a, this.f88662b), GetTopicResourceChannel.OTHER, false, true, false, false, false));
            m.this.f88659a.put(Long.valueOf(UniverseTopicId.make(fromTopicResV2.bookId, fromTopicResV2.topicId)), fromTopicResV2);
            return fromTopicResV2;
        }
    }

    public static m g() {
        return f88658d;
    }

    public boolean b(int topicId) {
        return this.f88660b.get(topicId) == null;
    }

    public void c() {
        synchronized (this) {
            this.f88659a.evictAll();
            this.f88660b.clear();
        }
    }

    public void d(TopicResourceV2 topicResource, int topic_id) {
        List<SimilarWord> similar_words = topicResource.getSimilar_words();
        if (this.f88660b.get(topic_id) != null || similar_words == null) {
            return;
        }
        synchronized (this) {
            try {
                Iterator<SimilarWord> it = similar_words.iterator();
                while (it.hasNext()) {
                    SimilarWordRecord fromSimilarWord = SimilarWordRecord.fromSimilarWord(it.next(), topic_id);
                    List<SimilarWordRecord> list = this.f88660b.get(fromSimilarWord.topic_id);
                    if (list == null) {
                        list = new ArrayList<>(4);
                        this.f88660b.put(fromSimilarWord.topic_id, list);
                    }
                    list.add(fromSimilarWord);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public rx.c<TopicRecord> e(final SimilarWordRecord primary, final List<SimilarWordRecord> similarWords) {
        int i11 = primary.similar_word_book_id;
        int i12 = primary.similar_word_id;
        long make = UniverseTopicId.make(i11, i12);
        synchronized (this) {
            try {
                TopicRecord topicRecord = this.f88659a.get(Long.valueOf(make));
                if (topicRecord == null) {
                    return rx.c.z2(new a(i12, i11)).w5(bc0.c.e());
                }
                return rx.c.M2(topicRecord);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized List<SimilarWordRecord> f(int topicId) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (this.f88660b.get(topicId) != null) {
            arrayList.addAll(this.f88660b.get(topicId));
        }
        return arrayList;
    }
}
