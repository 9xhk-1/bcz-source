package m9;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.CollectWordRecord;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.TopicKey;
import com.baicizhan.online.resource_api.WordListWordMetaV2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import wb0.o;
import wb0.p;
import wb0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f72667a = "AppendResourceManager";

    /* renamed from: b, reason: collision with root package name */
    public static final String f72668b = "res/word_audio";

    /* renamed from: c, reason: collision with root package name */
    public static final String f72669c = "us";

    /* renamed from: d, reason: collision with root package name */
    public static final String f72670d = "uk";

    /* renamed from: e, reason: collision with root package name */
    public static final int f72671e = 31;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<ResourceService.Client, File> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f72672a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f72673b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f72674c;

        public a(final int val$topicId, final String val$word, final File val$file) {
            this.f72672a = val$topicId;
            this.f72673b = val$word;
            this.f72674c = val$file;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public File call(ResourceService.Client client) {
            TopicKey topicKey = new TopicKey();
            topicKey.setTopic_id(this.f72672a);
            topicKey.setWord_level_id(0);
            topicKey.setTag_id(0);
            try {
                List<WordListWordMetaV2> list = client.get_word_list_word_meta_v2(Collections.singletonList(topicKey));
                m9.c cVar = new m9.c(700, 1500, 1);
                if (!TextUtils.isEmpty(list.get(0).accent_usa_audio_uri)) {
                    File a11 = b.a(this.f72673b, false);
                    cVar.a(list.get(0).accent_usa_audio_uri, a11 != null ? a11.getAbsolutePath() : "error");
                }
                return this.f72674c;
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m9.b$b, reason: collision with other inner class name */
    public class C0880b implements p<List<CollectWordRecord>, List<CollectWordRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f72675a;

        public C0880b(final List val$wordParams) {
            this.f72675a = val$wordParams;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<CollectWordRecord> call(List<CollectWordRecord> collectWordRecords) {
            return this.f72675a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<List<TopicKey>, rx.c<TopicKey>> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<TopicKey> call(List<TopicKey> topicKeys) {
            return rx.c.u2(topicKeys);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements o<List<TopicKey>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f72676a;

        public d(final List val$wordParams) {
            this.f72676a = val$wordParams;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<TopicKey> call() {
            ArrayList arrayList = new ArrayList(this.f72676a.size());
            List<CollectWordRecord> list = this.f72676a;
            if (list != null) {
                for (CollectWordRecord collectWordRecord : list) {
                    if (b.a(collectWordRecord.word, false) == null) {
                        throw new IllegalArgumentException("download word audio failed for null/empty word");
                    }
                    if (TextUtils.isEmpty(collectWordRecord.meanCn) || TextUtils.isEmpty(collectWordRecord.audio)) {
                        arrayList.add(TopicIdMapingUtils.buildTopicKey(collectWordRecord.getTopicId(), collectWordRecord.getBookId()));
                    }
                }
            }
            return arrayList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements p<List<WordListWordMetaV2>, rx.c<List<CollectWordRecord>>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f72677a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f72678b;

        public e(final List val$wordParams, final boolean val$downloadAudio) {
            this.f72677a = val$wordParams;
            this.f72678b = val$downloadAudio;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<List<CollectWordRecord>> call(List<WordListWordMetaV2> metas) {
            try {
                m9.c cVar = new m9.c(700, 1500, 1);
                for (CollectWordRecord collectWordRecord : this.f72677a) {
                    int topicId = collectWordRecord.getTopicId();
                    Iterator<WordListWordMetaV2> it = metas.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        WordListWordMetaV2 next = it.next();
                        if (next.getTopic_key().getTopic_id() == topicId) {
                            collectWordRecord.audio = next.getAccent_usa_audio_uri();
                            collectWordRecord.meanCn = next.mean_cn;
                            break;
                        }
                    }
                    if (this.f72678b && !TextUtils.isEmpty(collectWordRecord.audio)) {
                        File a11 = b.a(collectWordRecord.word, false);
                        cVar.a(collectWordRecord.audio, a11 != null ? a11.getAbsolutePath() : "error");
                    }
                }
                return rx.c.M2(this.f72677a);
            } catch (Exception e11) {
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements p<List<WordListWordMetaV2>, rx.c<WordListWordMetaV2>> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<WordListWordMetaV2> call(List<WordListWordMetaV2> wordListWordMetaV2s) {
            return rx.c.u2(wordListWordMetaV2s);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements q<List<TopicKey>, ResourceService.Client, List<WordListWordMetaV2>> {
        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WordListWordMetaV2> call(List<TopicKey> topicKeys, ResourceService.Client client) {
            if (topicKeys.isEmpty()) {
                return new ArrayList();
            }
            try {
                return client.get_word_list_word_meta_v2(topicKeys);
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    public static File a(String word, boolean uk2) {
        if (TextUtils.isEmpty(word)) {
            return null;
        }
        return PathUtil.getBaicizhanFile(String.format(Locale.CHINA, "%s/%s/%d/%s", f72668b, uk2 ? f72670d : "us", Integer.valueOf(word.hashCode() & 31), word));
    }

    public static rx.c<List<CollectWordRecord>> b(final List<CollectWordRecord> wordParams, final boolean downloadAudio) {
        ArrayList arrayList = new ArrayList();
        int size = (wordParams.size() / 50) + 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 * 50;
            int i13 = i11 + 1;
            int min = Math.min(wordParams.size(), i13 * 50);
            if (i11 >= wordParams.size() || i12 > min) {
                break;
            }
            arrayList.add(d(wordParams.subList(i12, min), downloadAudio));
            i11 = i13;
        }
        return rx.c.f3(arrayList).H5(1).c3(new C0880b(wordParams));
    }

    public static rx.c<File> c(final String word, final int topicId) {
        File a11 = a(word, false);
        return (a11 == null || !a11.exists()) ? com.baicizhan.client.business.thrift.p.a(new l("/rpc/resource_api")).c3(new a(topicId, word, a11)) : rx.c.M2(a11);
    }

    public static rx.c<List<CollectWordRecord>> d(final List<CollectWordRecord> wordParams, final boolean downloadAudio) {
        return rx.c.q0(rx.c.z2(new d(wordParams)).b2(new c()).D(50), com.baicizhan.client.business.thrift.p.a(new l("/rpc/resource_api")), new g()).b2(new f()).v6().b2(new e(wordParams, downloadAudio)).w5(bc0.c.e());
    }
}
