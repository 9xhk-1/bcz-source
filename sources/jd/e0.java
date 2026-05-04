package jd;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.activity.aiclass.video.PlayOperate;
import com.baicizhan.main.activity.aiclass.video.PlayerState;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVideoVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoVm.kt\ncom/baicizhan/main/activity/aiclass/video/VideoVm\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/* loaded from: classes4.dex */
public final class e0 extends AndroidViewModel {

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final a f64026o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f64027p = 8;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final String f64028q = "VideoVm";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Long> f64029a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Long> f64030b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<PlayerState> f64031c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Bitmap> f64032d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final dc0.c<Long> f64033e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Long> f64034f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f64035g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Float> f64036h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<PlayOperate> f64037i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Boolean> f64038j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f64039k;

    /* renamed from: l, reason: collision with root package name */
    public long f64040l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final qb0.h f64041m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f64042n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@m80.k Application context) {
        super(context);
        g0.p(context, "context");
        this.f64029a = new MutableLiveData<>();
        this.f64030b = new MutableLiveData<>();
        this.f64031c = new MutableLiveData<>();
        this.f64032d = new MutableLiveData<>();
        dc0.c<Long> y72 = dc0.c.y7();
        g0.o(y72, "create(...)");
        this.f64033e = y72;
        this.f64034f = new MutableLiveData<>();
        this.f64035g = new MutableLiveData<>();
        this.f64036h = new MutableLiveData<>();
        this.f64037i = new SingleLiveEvent<>();
        this.f64038j = new SingleLiveEvent<>();
        rx.c<Long> H4 = y72.H4(500L, TimeUnit.MILLISECONDS);
        final x00.l lVar = new x00.l() { // from class: jd.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c11;
                c11 = e0.c(e0.this, (Long) obj);
                return c11;
            }
        };
        qb0.h p52 = H4.L1(new wb0.b() { // from class: jd.d0
            @Override // wb0.b
            public final void call(Object obj) {
                e0.d(x00.l.this, obj);
            }
        }).p5();
        g0.o(p52, "subscribe(...)");
        this.f64041m = p52;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((r1 - r8.longValue()) <= 10000) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yz.g2 c(jd.e0 r7, java.lang.Long r8) {
        /*
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r7.f64029a
            r0.postValue(r8)
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r7.f64030b
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L5e
            long r1 = r0.longValue()
            boolean r3 = r7.f64042n
            r4 = 0
            if (r3 != 0) goto L27
            kotlin.jvm.internal.g0.m(r8)
            long r5 = r8.longValue()
            long r1 = r1 - r5
            r5 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L27
            goto L28
        L27:
            r0 = r4
        L28:
            if (r0 == 0) goto L5e
            r0 = 1
            r7.f64042n = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            long r1 = r7.f64040l
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "chapter_id"
            r0.put(r2, r1)
            yz.g2 r1 = yz.g2.f100423a
            java.lang.String r1 = "improve-scores-common"
            java.lang.String r2 = "finished_video"
            ma.l.e(r1, r2, r0)
            long r0 = r7.f64040l
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r7.f64040l
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = r0
        L55:
            if (r4 == 0) goto L5e
            id.n r0 = id.n.f60511a
            long r1 = r7.f64040l
            r0.m(r1)
        L5e:
            java.lang.String r7 = java.lang.String.valueOf(r8)
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r0 = "VideoVm"
            qb.c.i(r0, r7, r8)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.e0.c(jd.e0, java.lang.Long):yz.g2");
    }

    public static final void d(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public final boolean f() {
        return this.f64039k;
    }

    @m80.k
    public final SingleLiveEvent<PlayOperate> g() {
        return this.f64037i;
    }

    @m80.k
    public final MutableLiveData<Float> h() {
        return this.f64036h;
    }

    @m80.k
    public final dc0.c<Long> i() {
        return this.f64033e;
    }

    @m80.k
    public final MutableLiveData<Long> j() {
        return this.f64034f;
    }

    @m80.k
    public final SingleLiveEvent<Boolean> k() {
        return this.f64038j;
    }

    @m80.k
    public final MutableLiveData<Bitmap> l() {
        return this.f64032d;
    }

    @m80.k
    public final MutableLiveData<Long> m() {
        return this.f64029a;
    }

    @m80.k
    public final MutableLiveData<Long> n() {
        return this.f64030b;
    }

    @m80.k
    public final MutableLiveData<PlayerState> o() {
        return this.f64031c;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f64041m;
        if (hVar.isUnsubscribed()) {
            hVar = null;
        }
        if (hVar != null) {
            hVar.unsubscribe();
        }
    }

    @m80.k
    public final MutableLiveData<String> p() {
        return this.f64035g;
    }

    public final void q() {
        this.f64037i.setValue(PlayOperate.PAUSE);
    }

    public final void r(float f11) {
        this.f64036h.postValue(Float.valueOf(f11));
    }

    public final void s() {
        this.f64037i.setValue(PlayOperate.RESUME);
    }

    public final void stop() {
        this.f64037i.setValue(PlayOperate.STOP);
    }

    public final void t(long j11) {
        this.f64034f.postValue(Long.valueOf(j11));
    }

    public final void u(boolean z11) {
        this.f64039k = z11;
    }

    public final void v() {
        this.f64038j.postValue(Boolean.TRUE);
    }

    public final void w(@m80.k String url, long j11, long j12) {
        g0.p(url, "url");
        this.f64030b.postValue(Long.valueOf(j11));
        this.f64035g.postValue(url);
        this.f64040l = j12;
    }
}
