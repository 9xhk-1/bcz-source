package gd;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.activity.aiclass.LoadingStatus;
import com.baicizhan.main.activity.aiclass.video.PlayOperate;
import com.baicizhan.main.activity.aiclass.video.PlayerState;
import java.util.LinkedHashMap;
import java.util.Stack;
import jd.e0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAIClassVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIClassVM.kt\ncom/baicizhan/main/activity/aiclass/AIClassVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* loaded from: classes4.dex */
public final class l extends AndroidViewModel {

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final a f53595p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f53596q = 8;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final String f53597r = "AIClassVM";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e0 f53598a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b0 f53599b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MediatorLiveData<String> f53600c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Void> f53601d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Boolean> f53602e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MediatorLiveData<Bitmap> f53603f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<id.q> f53604g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<id.q> f53605h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Void> f53606i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public qb0.h f53607j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public qb0.h f53608k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public Long f53609l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public id.a f53610m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final Stack<PlayOperate> f53611n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f53612o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53613a;

        static {
            int[] iArr = new int[LoadingStatus.values().length];
            try {
                iArr[LoadingStatus.ERROR_NO_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingStatus.ERROR_MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadingStatus.ERROR_TIME_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoadingStatus.ERROR_NO_NET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f53613a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f53614a;

        public c(x00.l function) {
            g0.p(function, "function");
            this.f53614a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f53614a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53614a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@m80.k Application app2, @m80.k e0 videoVm, @m80.k b0 loadingVm) {
        super(app2);
        g0.p(app2, "app");
        g0.p(videoVm, "videoVm");
        g0.p(loadingVm, "loadingVm");
        this.f53598a = videoVm;
        this.f53599b = loadingVm;
        this.f53600c = new MediatorLiveData<>();
        this.f53601d = new SingleLiveEvent<>();
        this.f53602e = new SingleLiveEvent<>();
        MediatorLiveData<Bitmap> mediatorLiveData = new MediatorLiveData<>();
        this.f53603f = mediatorLiveData;
        MutableLiveData<id.q> mutableLiveData = new MutableLiveData<>();
        this.f53604g = mutableLiveData;
        this.f53605h = mutableLiveData;
        this.f53606i = new SingleLiveEvent<>();
        Stack<PlayOperate> stack = new Stack<>();
        stack.push(PlayOperate.RESUME);
        this.f53611n = stack;
        loadingVm.b(videoVm.o());
        mediatorLiveData.addSource(videoVm.l(), new c(new x00.l() { // from class: gd.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 m11;
                m11 = l.m(l.this, (Bitmap) obj);
                return m11;
            }
        }));
    }

    public static final g2 H(l lVar, id.a aVar) {
        lVar.f53610m = aVar;
        lVar.f53602e.postValue(Boolean.valueOf(aVar.c()));
        lVar.f53599b.g(LoadingStatus.SUCCESS);
        lVar.f53598a.w(aVar.f(), aVar.e(), aVar.a());
        g0.m(aVar);
        lVar.p(aVar);
        lVar.n(aVar);
        return g2.f100423a;
    }

    public static final void I(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void J(l lVar, Throwable th2) {
        lVar.f53599b.g(LoadingStatus.ERROR_NO_INFO);
        qb.c.c(f53597r, "", th2);
    }

    public static final g2 m(l lVar, Bitmap bitmap) {
        if (bitmap != null) {
            id.n.f60511a.w(bitmap, lVar.getApplication());
            lVar.f53603f.postValue(Bitmap.createScaledBitmap(bitmap, xb.f.a(lVar.getApplication(), 90.0f), xb.f.a(lVar.getApplication(), 160.0f), true));
            lVar.f53598a.l().postValue(null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("chapter_id", String.valueOf(lVar.f53609l));
            Long value = lVar.f53598a.m().getValue();
            linkedHashMap.put(ma.b.I, String.valueOf(value != null ? Long.valueOf(value.longValue() / 1000) : null));
            g2 g2Var = g2.f100423a;
            ma.l.e(ma.t.f73027z, ma.a.Z2, linkedHashMap);
        }
        return g2.f100423a;
    }

    public static final g2 o(MediatorLiveData mediatorLiveData, id.a aVar, Void r22) {
        mediatorLiveData.postValue(aVar.b());
        return g2.f100423a;
    }

    public static final Boolean q(l lVar, Long l11) {
        return Boolean.valueOf(lVar.f53598a.o().getValue() == PlayerState.PLAYING);
    }

    public static final Boolean r(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final Boolean s(l lVar, Long l11) {
        return Boolean.valueOf(!lVar.f53612o);
    }

    public static final Boolean t(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final g2 u(id.a aVar, l lVar, Long l11) {
        g0.m(l11);
        id.q d11 = aVar.d(l11.longValue());
        if (d11 != null) {
            id.q value = lVar.f53604g.getValue();
            boolean z11 = false;
            if (value != null && value.h() == d11.h()) {
                z11 = true;
            }
            if (z11) {
                d11 = null;
            }
            if (d11 != null) {
                lVar.f53604g.setValue(d11);
                qb.c.i(f53597r, "question now progress %d id %d", l11, Long.valueOf(d11.h()));
            }
        }
        return g2.f100423a;
    }

    public static final void v(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @m80.k
    public final MutableLiveData<id.q> A() {
        return this.f53605h;
    }

    @m80.k
    public final MediatorLiveData<Bitmap> B() {
        return this.f53603f;
    }

    @m80.k
    public final e0 C() {
        return this.f53598a;
    }

    @m80.k
    public final SingleLiveEvent<Boolean> D() {
        return this.f53602e;
    }

    public final boolean F() {
        return this.f53612o;
    }

    public final void G(long j11) {
        this.f53609l = Long.valueOf(j11);
        this.f53599b.g(LoadingStatus.LOADING);
        qb0.h hVar = this.f53607j;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c<id.a> I3 = id.n.f60511a.t(j11).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: gd.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = l.H(l.this, (id.a) obj);
                return H;
            }
        };
        this.f53607j = I3.u5(new wb0.b() { // from class: gd.j
            @Override // wb0.b
            public final void call(Object obj) {
                l.I(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: gd.k
            @Override // wb0.b
            public final void call(Object obj) {
                l.J(l.this, (Throwable) obj);
            }
        });
    }

    public final void K() {
        qb.c.i(f53597r, this.f53611n + j2.O + this.f53598a.o().getValue(), new Object[0]);
        this.f53598a.u(false);
        if (!this.f53611n.isEmpty()) {
            this.f53611n.push(PlayOperate.PAUSE);
        } else {
            if (this.f53598a.o().getValue() != PlayerState.PLAYING) {
                this.f53611n.push(PlayOperate.PAUSE);
                return;
            }
            this.f53611n.push(PlayOperate.RESUME);
            this.f53598a.q();
            g2 g2Var = g2.f100423a;
        }
    }

    public final void L() {
        boolean z11;
        this.f53611n.clear();
        if (this.f53598a.o().getValue() == PlayerState.PLAYING) {
            this.f53598a.q();
            z11 = true;
        } else {
            this.f53598a.s();
            z11 = false;
        }
        if (this.f53598a.m().getValue() == null || this.f53609l == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long value = this.f53598a.m().getValue();
        linkedHashMap.put(ma.b.I, String.valueOf(value != null ? Long.valueOf(value.longValue() / 1000) : null));
        linkedHashMap.put("chapter_id", String.valueOf(this.f53609l));
        linkedHashMap.put("type", !z11 ? ma.b.K : ma.b.L);
        g2 g2Var = g2.f100423a;
        ma.l.e(ma.t.f73027z, ma.a.V2, linkedHashMap);
    }

    public final void M() {
        qb.c.i(f53597r, this.f53611n + j2.O + this.f53598a.o().getValue(), new Object[0]);
        if (this.f53611n.isEmpty()) {
            qb.c.d(f53597r, "empty stack", new Object[0]);
            return;
        }
        PlayOperate pop = this.f53611n.pop();
        if (this.f53611n.isEmpty()) {
            if (pop == PlayOperate.RESUME) {
                this.f53598a.s();
            }
            this.f53598a.u(true);
        }
    }

    public final void N() {
        if (this.f53609l == null) {
            this.f53601d.call();
            qb.c.d(f53597r, "error empty cid", new Object[0]);
            return;
        }
        LoadingStatus value = this.f53599b.f().getValue();
        int i11 = value == null ? -1 : b.f53613a[value.ordinal()];
        if (i11 == 1) {
            Long l11 = this.f53609l;
            g0.m(l11);
            G(l11.longValue());
        } else if ((i11 == 2 || i11 == 3 || i11 == 4) && rb.d.f(getApplication())) {
            id.a aVar = this.f53610m;
            if (aVar == null) {
                this.f53601d.call();
                qb.c.d(f53597r, "error retry empty class info", new Object[0]);
            } else {
                this.f53599b.g(LoadingStatus.SUCCESS);
                this.f53598a.stop();
                this.f53598a.w(aVar.f(), aVar.e(), aVar.a());
            }
        }
    }

    public final void O(boolean z11) {
        this.f53612o = z11;
        this.f53604g.setValue(null);
    }

    public final void P() {
        this.f53598a.v();
    }

    public final void n(final id.a aVar) {
        final MediatorLiveData<String> mediatorLiveData = this.f53600c;
        mediatorLiveData.removeSource(this.f53606i);
        mediatorLiveData.addSource(this.f53606i, new c(new x00.l() { // from class: gd.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = l.o(MediatorLiveData.this, aVar, (Void) obj);
                return o11;
            }
        }));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f53607j;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        qb0.h hVar2 = this.f53608k;
        if (hVar2 != null) {
            qb0.h hVar3 = hVar2.isUnsubscribed() ? null : hVar2;
            if (hVar3 != null) {
                hVar3.unsubscribe();
            }
        }
    }

    public final void p(final id.a aVar) {
        qb0.h hVar = this.f53608k;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c<Long> I3 = this.f53598a.i().I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: gd.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean q11;
                q11 = l.q(l.this, (Long) obj);
                return q11;
            }
        };
        rx.c<Long> V1 = I3.V1(new wb0.p() { // from class: gd.d
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean r11;
                r11 = l.r(x00.l.this, obj);
                return r11;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: gd.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean s11;
                s11 = l.s(l.this, (Long) obj);
                return s11;
            }
        };
        rx.c<Long> V12 = V1.V1(new wb0.p() { // from class: gd.f
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean t11;
                t11 = l.t(x00.l.this, obj);
                return t11;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: gd.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u11;
                u11 = l.u(id.a.this, this, (Long) obj);
                return u11;
            }
        };
        this.f53608k = V12.t5(new wb0.b() { // from class: gd.h
            @Override // wb0.b
            public final void call(Object obj) {
                l.v(x00.l.this, obj);
            }
        });
    }

    public final void w() {
        this.f53606i.call();
        Long l11 = this.f53609l;
        if (l11 != null) {
            id.n.f60511a.m(l11.longValue());
        }
    }

    @m80.k
    public final SingleLiveEvent<Void> x() {
        return this.f53601d;
    }

    @m80.k
    public final MediatorLiveData<String> y() {
        return this.f53600c;
    }

    @m80.k
    public final b0 z() {
        return this.f53599b;
    }
}
