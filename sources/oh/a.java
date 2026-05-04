package oh;

import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.JsonSerializer;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.ZpkInfo;
import i9.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import qb0.g;
import qb0.h;
import sh.s;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f76962d = "Downloader";

    /* renamed from: e, reason: collision with root package name */
    public static final int f76963e = 200;

    /* renamed from: f, reason: collision with root package name */
    public static final int f76964f = 5;

    /* renamed from: a, reason: collision with root package name */
    public ExecutorService f76965a;

    /* renamed from: b, reason: collision with root package name */
    public rx.d f76966b;

    /* renamed from: c, reason: collision with root package name */
    public h f76967c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<List<ZpkInfo>, rx.c<TopicRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f76969a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: oh.a$b$a, reason: collision with other inner class name */
        public class C0938a implements p<ZpkInfo, rx.c<TopicRecord>> {
            public C0938a() {
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public rx.c<TopicRecord> call(ZpkInfo zpkInfo) {
                s sVar = new s(b.this.f76969a, zpkInfo.getTopic_key().topic_id);
                sVar.n(zpkInfo);
                sVar.m(l.d(pb.a.a(), b.this.f76969a, zpkInfo.getTopic_key().topic_id));
                return th.s.d(sVar, a.this.f76966b).w5(a.this.f76966b).D4(3L);
            }
        }

        public b(final int val$bookid) {
            this.f76969a = val$bookid;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<TopicRecord> call(List<ZpkInfo> packages) {
            return rx.c.u2(packages).b2(new C0938a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<List<Integer>, rx.c<ZpkInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f76972a;

        public c(final int val$bookid) {
            this.f76972a = val$bookid;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<ZpkInfo> call(List<Integer> integers) {
            try {
                return rx.c.u2(((ResourceService.Client) new com.baicizhan.client.business.thrift.l("/rpc/resource_api").c(1).d(10000).a()).get_zpk_infos(TopicIdMapingUtils.buildTopicKeyList(integers, this.f76972a)));
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    public a() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        this.f76965a = newFixedThreadPool;
        this.f76966b = bc0.c.b(newFixedThreadPool);
    }

    public void b() {
        qb.c.i(f76962d, "cancel!!!!!!!!!!", new Object[0]);
        this.f76965a.shutdown();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        this.f76965a = newFixedThreadPool;
        this.f76966b = bc0.c.b(newFixedThreadPool);
        h hVar = this.f76967c;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f76967c.unsubscribe();
        this.f76967c = null;
    }

    public void c(Collection<Integer> ids, final int bookid) {
        h hVar = this.f76967c;
        if (hVar != null && !hVar.isUnsubscribed()) {
            b();
        }
        qb.c.i(f76962d, "start download bookId: %d , topic(%d): %s", Integer.valueOf(bookid), Integer.valueOf(ids.size()), new JsonSerializer(ArrayList.class).writeToJson(ids));
        this.f76967c = d(ids, bookid).r5(new C0937a());
    }

    public final rx.c<TopicRecord> d(Iterable<Integer> ids, final int bookid) {
        return rx.c.u2(ids).D(200).b2(new c(bookid)).v6().w5(bc0.c.b(Executors.newFixedThreadPool(5))).b2(new b(bookid));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: oh.a$a, reason: collision with other inner class name */
    public class C0937a extends g<TopicRecord> {
        public C0937a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(a.f76962d, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(TopicRecord topicRecord) {
            qb.c.i(a.f76962d, "download topic %d", Integer.valueOf(topicRecord.topicId));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
