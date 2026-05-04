package th;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.TopicKey;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.ZpkInfo;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;
import rx.c;
import sh.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90636a = "TopicRecordObservables";

    /* renamed from: b, reason: collision with root package name */
    public static final int f90637b = 3000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f90638c = 1000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements c.a<Collection<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90639a;

        public b(final Context val$context) {
            this.f90639a = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super Collection<Integer>> subscriber) {
            try {
                subscriber.onNext(i9.a.f(this.f90639a));
                subscriber.onCompleted();
            } catch (Throwable th2) {
                subscriber.onError(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements c.a<TopicRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90640a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f90641b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f90642c;

        public c(final Context val$context, final int val$bookId, final int val$topicId) {
            this.f90640a = val$context;
            this.f90641b = val$bookId;
            this.f90642c = val$topicId;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super TopicRecord> subscriber) {
            TopicRecord d11 = i9.l.d(this.f90640a, this.f90641b, this.f90642c);
            if (subscriber.isUnsubscribed()) {
                return;
            }
            if (d11 != null) {
                d11.wordMean = TextUtils.isEmpty(d11.wordMean) ? d11.wordMean : d11.wordMean.trim();
                subscriber.onNext(d11);
                subscriber.onCompleted();
                return;
            }
            subscriber.onError(new NoSuchElementException("No TopicRecord(" + this.f90641b + j2.O + this.f90642c + ")device: " + nb.a.f75039b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements c.a<TopicRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.s f90643a;

        public d(final sh.s val$task) {
            this.f90643a = val$task;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super TopicRecord> subscriber) {
            this.f90643a.d();
            if (subscriber.isUnsubscribed()) {
                return;
            }
            TopicRecord i11 = this.f90643a.i();
            Exception h11 = this.f90643a.h();
            if (h11 != null) {
                subscriber.onError(h11);
                return;
            }
            if (i11 != null) {
                i11.wordMean = TextUtils.isEmpty(i11.wordMean) ? i11.wordMean : i11.wordMean.trim();
            }
            subscriber.onNext(i11);
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements wb0.p<String, Boolean> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(String name) {
            try {
                ZPackUtils.ZpkNameInfo extractZpkNameInfo = ZPackUtils.extractZpkNameInfo(name);
                ya.a.b(ZPackUtils.getZpkFileByName(extractZpkNameInfo.bookId, name));
                pb.a.a().getContentResolver().delete(a.i.a(extractZpkNameInfo.bookId), "topic = " + extractZpkNameInfo.topicId, null);
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements wb0.o<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90644a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f90645b;

        public f(final int val$topicId, final int val$bookId) {
            this.f90644a = val$topicId;
            this.f90645b = val$bookId;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                ResourceService.Client client = (ResourceService.Client) new com.baicizhan.client.business.thrift.l("/rpc/resource_api").c(1).d(3000).b(1000).a();
                boolean c11 = w.g().c(this.f90644a);
                boolean b11 = sh.m.g().b(this.f90644a);
                if (c11 || b11) {
                    TopicResourceV2 topicResourceV2 = client.get_topic_resource_v2(TopicIdMapingUtils.buildTopicKey(this.f90644a, this.f90645b), GetTopicResourceChannel.OTHER, false, false, false, c11, b11);
                    w.g().e(topicResourceV2);
                    sh.m.g().d(topicResourceV2, this.f90644a);
                }
                return Boolean.TRUE;
            } catch (Exception e11) {
                qb.c.a(s.f90636a, "", e11);
                throw vb0.a.c(e11);
            }
        }
    }

    public static rx.c<Boolean> a(List<String> zpkNames) {
        return rx.c.u2(zpkNames).w5(bc0.c.f()).c3(new e());
    }

    public static rx.c<TopicRecord> b(final Context context, final int bookId, final int topicId) {
        return rx.c.j1(new c(context, bookId, topicId)).w5(bc0.c.a());
    }

    public static rx.c<TopicRecord> c(final int bookId, final int topicId) {
        return d(new sh.s(bookId, topicId), bc0.c.e());
    }

    public static rx.c<TopicRecord> d(final sh.s task, rx.d scheduler) {
        return rx.c.j1(new d(task)).w5(scheduler);
    }

    public static rx.c<TopicRecord> e(String url) {
        String path = Uri.parse(url).getPath();
        ZPackUtils.ZpkNameInfo extractZpkNameInfo = ZPackUtils.extractZpkNameInfo(path);
        ZpkInfo zpkInfo = new ZpkInfo();
        TopicKey topicKey = new TopicKey();
        topicKey.setTopic_id(extractZpkNameInfo.topicId);
        topicKey.setWord_level_id(extractZpkNameInfo.bookId);
        topicKey.setTag_id(extractZpkNameInfo.tagId);
        zpkInfo.setTopic_key(topicKey);
        zpkInfo.setZpk_uri(path);
        sh.s sVar = new sh.s(extractZpkNameInfo.bookId, extractZpkNameInfo.topicId);
        sVar.n(zpkInfo);
        return d(sVar, bc0.c.e());
    }

    public static rx.c<TopicRecord> f(final Context context, int bookId, int topicId) {
        rx.c<TopicRecord> U3 = b(context, bookId, topicId).U3(c(bookId, topicId));
        if (rb.d.f(context) && rb.d.h(context)) {
            U3 = rx.c.r7(i(bookId, topicId), U3, new a()).U3(U3);
        }
        return U3.I3(tb0.a.a());
    }

    public static rx.c<TopicRecord> g(final Context context, int bookId, int topicId) {
        return b(context, bookId, topicId).U3(c(bookId, topicId));
    }

    public static rx.c<Collection<Integer>> h(final Context context) {
        return rx.c.j1(new b(context)).w5(bc0.c.e()).I3(tb0.a.a());
    }

    public static rx.c<Boolean> i(final int bookId, final int topicId) {
        return rx.c.z2(new f(topicId, bookId)).w5(bc0.c.a());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.q<Boolean, TopicRecord, TopicRecord> {
        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TopicRecord call(Boolean aBoolean, TopicRecord record) {
            return record;
        }
    }
}
