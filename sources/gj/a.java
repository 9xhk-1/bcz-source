package gj;

import androidx.collection.LruCache;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordDictV2;
import sh.m;
import sh.w;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f53874a = 102400;

    /* renamed from: b, reason: collision with root package name */
    public static final String f53875b = "gj.a";

    /* renamed from: c, reason: collision with root package name */
    public static LruCache<String, ExtendedWordInfo> f53876c = new LruCache<>(102400);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gj.a$a, reason: collision with other inner class name */
    public class C0636a implements p<ResourceService.Client, rx.c<ExtendedWordInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f53877a;

        public C0636a(final String val$word) {
            this.f53877a = val$word;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<ExtendedWordInfo> call(ResourceService.Client client) {
            WordDictV2 wordDictV2;
            try {
                ExtendedWordInfo extendedWordInfo = a.f53876c.get(this.f53877a);
                if (extendedWordInfo == null && (wordDictV2 = client.get_dict_by_word_v2(this.f53877a)) != null) {
                    extendedWordInfo = ExtendedWordInfo.fromWordDictV2(wordDictV2);
                    a.f53876c.put(this.f53877a, extendedWordInfo);
                }
                return rx.c.M2(extendedWordInfo);
            } catch (Exception e11) {
                qb.c.d(a.f53875b, "load extended word info failed. " + e11, new Object[0]);
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<ResourceService.Client, rx.c<ExtendedWordInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f53878a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f53879b;

        public b(final int val$topicId, final int val$bookId) {
            this.f53878a = val$topicId;
            this.f53879b = val$bookId;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<ExtendedWordInfo> call(ResourceService.Client client) {
            TopicResourceV2 topicResourceV2;
            try {
                String valueOf = String.valueOf(this.f53878a);
                ExtendedWordInfo extendedWordInfo = a.f53876c.get(valueOf);
                if (extendedWordInfo == null && (topicResourceV2 = client.get_topic_resource_v2(TopicIdMapingUtils.buildTopicKey(this.f53878a, this.f53879b), GetTopicResourceChannel.OTHER, false, true, false, false, false)) != null) {
                    extendedWordInfo = ExtendedWordInfo.fromTopicResV2(topicResourceV2);
                    a.f53876c.put(valueOf, extendedWordInfo);
                }
                return rx.c.M2(extendedWordInfo);
            } catch (Exception e11) {
                qb.c.d(a.f53875b, "load extended word info failed. " + e11, new Object[0]);
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<ResourceService.Client, rx.c<TopicResourceV2>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f53880a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f53881b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f53882c;

        public c(final int val$topicId, final int val$bookId, final boolean val$isSearch) {
            this.f53880a = val$topicId;
            this.f53881b = val$bookId;
            this.f53882c = val$isSearch;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<TopicResourceV2> call(ResourceService.Client client) {
            try {
                TopicResourceV2 topicResourceV2 = client.get_topic_resource_v2(TopicIdMapingUtils.buildTopicKey(this.f53880a, this.f53881b), this.f53882c ? GetTopicResourceChannel.SEARCH_WORD : GetTopicResourceChannel.OTHER, false, true, false, true, true);
                w.g().e(topicResourceV2);
                m.g().d(topicResourceV2, this.f53880a);
                return rx.c.M2(topicResourceV2);
            } catch (Exception e11) {
                return rx.c.T1(e11);
            }
        }
    }

    public static rx.c<ExtendedWordInfo> b(final int topicId, final int bookId) {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/resource_api")).b2(new b(topicId, bookId)).w5(bc0.c.e());
    }

    public static rx.c<ExtendedWordInfo> c(boolean primary, final String word) {
        rx.c b22 = com.baicizhan.client.business.thrift.p.a(new l("/rpc/resource_api")).b2(new C0636a(word));
        return primary ? b22.w5(bc0.c.e()) : b22.U3(e()).w5(bc0.c.e());
    }

    public static rx.c<TopicResourceV2> d(final int topicId, final int bookId, final boolean isSearch) {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/resource_api")).b2(new c(topicId, bookId, isSearch)).w5(bc0.c.e());
    }

    public static rx.c<ExtendedWordInfo> e() {
        return rx.c.M2(null);
    }
}
