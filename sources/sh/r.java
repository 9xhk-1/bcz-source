package sh;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.TopicResourceV2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f88673b = "StudyWikiExtraInfoLoader";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final r f88672a = new r();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final ConcurrentHashMap<Integer, TopicResourceV2> f88674c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final ConcurrentHashMap<Integer, TopicResourceV2> f88675d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public static final int f88676e = 8;

    public static final g2 f(int i11, int i12, com.baicizhan.client.business.thrift.l lVar) {
        ConcurrentHashMap<Integer, TopicResourceV2> concurrentHashMap = f88675d;
        boolean containsKey = concurrentHashMap.containsKey(Integer.valueOf(i11));
        boolean z11 = !containsKey;
        ConcurrentHashMap<Integer, TopicResourceV2> concurrentHashMap2 = f88674c;
        boolean containsKey2 = concurrentHashMap2.containsKey(Integer.valueOf(i11));
        boolean z12 = !containsKey2;
        if (!containsKey || !containsKey2) {
            try {
                TopicResourceV2 topicResourceV2 = ((ResourceService.Client) lVar.a()).get_topic_resource_v2(TopicIdMapingUtils.buildTopicKey(i11, i12), GetTopicResourceChannel.STUDY, false, false, z12, z11, false);
                if (!containsKey) {
                    concurrentHashMap.put(Integer.valueOf(i11), topicResourceV2);
                }
                if (!containsKey2) {
                    concurrentHashMap2.put(Integer.valueOf(i11), topicResourceV2);
                }
            } catch (Exception e11) {
                qb.c.c(f88673b, "", e11);
            }
        }
        return g2.f100423a;
    }

    public static final Object g(x00.l lVar, Object obj) {
        return lVar.invoke(obj);
    }

    @m80.k
    public final ConcurrentHashMap<Integer, TopicResourceV2> c() {
        return f88675d;
    }

    @m80.k
    public final ConcurrentHashMap<Integer, TopicResourceV2> d() {
        return f88674c;
    }

    @m80.k
    public final rx.c<Object> e(final int i11, final int i12) {
        rx.c I3 = rx.c.M2(new com.baicizhan.client.business.thrift.l("/rpc/resource_api").c(1).d(3000).b(1000)).I3(bc0.c.e());
        final x00.l lVar = new x00.l() { // from class: sh.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = r.f(i12, i11, (com.baicizhan.client.business.thrift.l) obj);
                return f11;
            }
        };
        rx.c<Object> c32 = I3.c3(new wb0.p() { // from class: sh.q
            @Override // wb0.p
            public final Object call(Object obj) {
                Object g11;
                g11 = r.g(x00.l.this, obj);
                return g11;
            }
        });
        g0.o(c32, "map(...)");
        return c32;
    }
}
