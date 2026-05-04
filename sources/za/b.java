package za;

import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.online.bs_words.BBReadingPlan;
import com.baicizhan.online.bs_words.BBReadingPlanDetail;
import com.baicizhan.online.bs_words.BSWords;
import gb.a;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import l6.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static String f102456c = "b";

    /* renamed from: d, reason: collision with root package name */
    public static String f102457d = "audio_";

    /* renamed from: e, reason: collision with root package name */
    public static final String f102458e = "res/readplan";

    /* renamed from: f, reason: collision with root package name */
    public static final String f102459f = PathUtil.getBaicizhanFile(f102458e).getAbsolutePath();

    /* renamed from: g, reason: collision with root package name */
    public static final long f102460g = 1073741824;

    /* renamed from: h, reason: collision with root package name */
    public static final int f102461h = 1024;

    /* renamed from: i, reason: collision with root package name */
    public static final String f102462i = "planlist";

    /* renamed from: j, reason: collision with root package name */
    public static final String f102463j = "plan";

    /* renamed from: k, reason: collision with root package name */
    public static final String f102464k = "/rpc/words";

    /* renamed from: l, reason: collision with root package name */
    public static b f102465l;

    /* renamed from: a, reason: collision with root package name */
    public gb.b f102466a = new gb.b(f102456c);

    /* renamed from: b, reason: collision with root package name */
    public gb.a f102467b = new gb.a(f102456c);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ThriftRequest<BSWords.Client, List<BBReadingPlan>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f102468a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String domain, String tag, final c val$listener) {
            super(domain, tag);
            this.f102468a = val$listener;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BBReadingPlan> doInBackground(BSWords.Client client) throws Exception {
            return client.get_reading_plans();
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBReadingPlan> bbReadingPlans) {
            b.this.f102466a.c(b.this.p(), b.f102462i, bbReadingPlans);
            this.f102468a.onSuccess(bbReadingPlans);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            b.this.l(this.f102468a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: za.b$b, reason: collision with other inner class name */
    public class C1391b extends ThriftRequest<BSWords.Client, List<BBReadingPlanDetail>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f102470a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f102471b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1391b(String domain, String tag, final int val$id, final c val$listener) {
            super(domain, tag);
            this.f102470a = val$id;
            this.f102471b = val$listener;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BBReadingPlanDetail> doInBackground(BSWords.Client client) throws Exception {
            return client.get_reading_plan_details(this.f102470a);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBReadingPlanDetail> bbReadingPlanDetails) {
            b.this.f102466a.c(b.this.p(), b.f102463j + this.f102470a, bbReadingPlanDetails);
            this.f102471b.onSuccess(b.this.h(bbReadingPlanDetails));
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            b.this.n(this.f102470a, this.f102471b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c<T> {
        void onError(String msg);

        void onSuccess(T res);
    }

    public static synchronized b j() {
        b bVar;
        synchronized (b.class) {
            bVar = f102465l;
            if (bVar == null) {
                bVar = new b();
                f102465l = bVar;
            }
        }
        return bVar;
    }

    public void f(String filename) {
        this.f102467b.d(f102457d + filename);
    }

    public void g(final String filename, final String url, final a.b listener) {
        this.f102467b.e(f102457d + filename, url, p(), listener);
    }

    public final List<BBReadingPlanDetail> h(List<BBReadingPlanDetail> chapters) {
        for (BBReadingPlanDetail bBReadingPlanDetail : chapters) {
            vb.a p11 = p();
            try {
            } catch (Exception unused) {
            } catch (Throwable th2) {
                p11.b();
                throw th2;
            }
            if (!p11.q(true)) {
                throw new IOException("资源库打开失败");
            }
            File j11 = p11.j(f102457d + bBReadingPlanDetail.getAudio_file_name());
            if (j11 != null) {
                bBReadingPlanDetail.setAudio_url(n.f70249a + j11.getAbsolutePath());
            }
            p11.b();
        }
        return chapters;
    }

    public Double i(String filename) {
        return this.f102467b.f(f102457d + filename, p());
    }

    public void k(final String tag, final c<List<BBReadingPlan>> listener) {
        com.baicizhan.client.business.thrift.c.b().a(new a("/rpc/words", tag, listener));
    }

    public final void l(c<List<BBReadingPlan>> listener) {
        BBReadingPlan[] bBReadingPlanArr = (BBReadingPlan[]) this.f102466a.a(p(), f102462i, BBReadingPlan[].class);
        if (bBReadingPlanArr != null) {
            listener.onSuccess(Arrays.asList(bBReadingPlanArr));
        } else {
            listener.onError("读取本地缓存失败, 请在稳定的网络下重试");
        }
    }

    public void m(final String tag, final int id2, final c<List<BBReadingPlanDetail>> listener) {
        com.baicizhan.client.business.thrift.c.b().a(new C1391b("/rpc/words", tag, id2, listener));
    }

    public final void n(int id2, c<List<BBReadingPlanDetail>> listener) {
        BBReadingPlanDetail[] bBReadingPlanDetailArr = (BBReadingPlanDetail[]) this.f102466a.a(p(), f102463j + id2, BBReadingPlanDetail[].class);
        if (bBReadingPlanDetailArr != null) {
            listener.onSuccess(h(Arrays.asList(bBReadingPlanDetailArr)));
        } else {
            listener.onError("读取本地缓存失败, 请在稳定的网络下重试");
        }
    }

    public void o(String filename, a.b listener) {
        this.f102467b.g(f102457d + filename, listener);
    }

    public final vb.a p() {
        return new vb.a(f102459f, 1073741824L, 1024);
    }
}
