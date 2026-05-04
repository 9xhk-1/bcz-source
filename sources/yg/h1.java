package yg;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.main.model.data.TabInfo;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.LiveStreamingInfo;
import com.baicizhan.online.advertise_api.MallIconItem;
import com.baicizhan.online.advertise_api.MallTabInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nHomeModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeModel.kt\ncom/baicizhan/main/model/HomeModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1#2:144\n1563#3:145\n1634#3,3:146\n1563#3:149\n1634#3,3:150\n*S KotlinDebug\n*F\n+ 1 HomeModel.kt\ncom/baicizhan/main/model/HomeModel\n*L\n92#1:145\n92#1:146,3\n95#1:149\n95#1:150,3\n*E\n"})
/* loaded from: classes4.dex */
public final class h1 extends AndroidViewModel {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f99986g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f99987h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final String f99988i = h1.class.getSimpleName();

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final String f99989j = "home_tabs";

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final String f99990k = "home_local_tab_store_info_v2";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<zg.g> f99991a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f99992b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f99993c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public qb0.h f99994d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public qb0.h f99995e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final yz.c0 f99996f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends bp.a<TabInfo> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends bp.a<TabInfo> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        this.f99991a = new MutableLiveData<>();
        this.f99992b = new MutableLiveData<>();
        this.f99993c = new MutableLiveData<>();
        this.f99996f = yz.e0.c(new x00.a() { // from class: yg.a1
            @Override // x00.a
            public final Object invoke() {
                nc.a K;
                K = h1.K();
                return K;
            }
        });
    }

    public static final nc.a K() {
        return nc.b.c(f99989j);
    }

    public static final yz.g2 M(h1 h1Var, zg.g gVar) {
        h1Var.f99991a.postValue(gVar);
        return yz.g2.f100423a;
    }

    public static final void N(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void O(Throwable th2) {
        qb.c.c(f99988i, "", th2);
    }

    public static final yz.g2 Q(h1 h1Var, Boolean bool) {
        h1Var.f99993c.postValue(bool);
        return yz.g2.f100423a;
    }

    public static final void R(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void S(Throwable th2) {
        qb.c.c(f99988i, "", th2);
    }

    public static final LiveStreamingInfo W(AdvertiseApiService.Client client) {
        return client.get_live_streaming_info();
    }

    public static final LiveStreamingInfo X(x00.l lVar, Object obj) {
        return (LiveStreamingInfo) lVar.invoke(obj);
    }

    public static final Boolean Y(LiveStreamingInfo liveStreamingInfo) {
        long j11 = liveStreamingInfo.current_timestamp;
        return Boolean.valueOf(j11 <= liveStreamingInfo.end_timestamp && j11 >= liveStreamingInfo.start_timestamp);
    }

    public static final Boolean Z(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final yz.g2 a0(Boolean bool) {
        qb.c.i(f99988i, "from server " + bool, new Object[0]);
        return yz.g2.f100423a;
    }

    public static final void b0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final MallTabInfo d0(AdvertiseApiService.Client client) {
        return client.get_mall_tab_icon_info();
    }

    public static final MallTabInfo e0(x00.l lVar, Object obj) {
        return (MallTabInfo) lVar.invoke(obj);
    }

    public static final TabInfo f0(MallTabInfo mallTabInfo) {
        List J;
        List J2;
        int i11 = mallTabInfo.recommendType;
        List<MallIconItem> list = mallTabInfo.taobao;
        if (list != null) {
            List<MallIconItem> list2 = list;
            J = new ArrayList(a00.i0.d0(list2, 10));
            for (MallIconItem mallIconItem : list2) {
                String aid = mallIconItem.aid;
                kotlin.jvm.internal.g0.o(aid, "aid");
                J.add(new zg.f(aid, mallIconItem.icon_normal, mallIconItem.icon_press, mallIconItem.getMall_name(), mallIconItem.start_time, mallIconItem.end_time));
            }
        } else {
            J = a00.h0.J();
        }
        List<MallIconItem> list3 = mallTabInfo.mall;
        if (list3 != null) {
            List<MallIconItem> list4 = list3;
            J2 = new ArrayList(a00.i0.d0(list4, 10));
            for (MallIconItem mallIconItem2 : list4) {
                String aid2 = mallIconItem2.aid;
                kotlin.jvm.internal.g0.o(aid2, "aid");
                J2.add(new zg.f(aid2, mallIconItem2.icon_normal, mallIconItem2.icon_press, mallIconItem2.getMall_name(), mallIconItem2.start_time, mallIconItem2.end_time));
            }
        } else {
            J2 = a00.h0.J();
        }
        return new TabInfo(i11, J, J2);
    }

    public static final TabInfo g0(x00.l lVar, Object obj) {
        return (TabInfo) lVar.invoke(obj);
    }

    public static final yz.g2 h0(h1 h1Var, TabInfo tabInfo) {
        h1Var.H().p(f99990k, BczJson.writeToJson(tabInfo, new b().getType()));
        return yz.g2.f100423a;
    }

    public static final void i0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final zg.g j0(h1 h1Var, boolean z11, TabInfo tabInfo) {
        return zg.e.e(tabInfo, h1Var.getApplication(), z11);
    }

    public static final zg.g k0(x00.l lVar, Object obj) {
        return (zg.g) lVar.invoke(obj);
    }

    public static final yz.g2 m0(zg.g gVar) {
        qb.c.i(f99988i, "from server " + gVar, new Object[0]);
        return yz.g2.f100423a;
    }

    public static final void n0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final TabInfo q0(String str) {
        try {
            Object readFromJson = BczJson.readFromJson(str, new c().getType());
            if (readFromJson instanceof TabInfo) {
                return (TabInfo) readFromJson;
            }
            return null;
        } catch (Exception e11) {
            qb.c.c(f99988i, str, e11);
            return null;
        }
    }

    public static final TabInfo r0(x00.l lVar, Object obj) {
        return (TabInfo) lVar.invoke(obj);
    }

    public static final zg.g s0(h1 h1Var, boolean z11, TabInfo tabInfo) {
        return zg.e.e(tabInfo, h1Var.getApplication(), z11);
    }

    public static final zg.g t0(x00.l lVar, Object obj) {
        return (zg.g) lVar.invoke(obj);
    }

    public static final yz.g2 u0(zg.g gVar) {
        qb.c.i(f99988i, "from kv " + gVar, new Object[0]);
        return yz.g2.f100423a;
    }

    public static final void v0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @m80.k
    public final LiveData<Boolean> G() {
        return this.f99992b;
    }

    public final nc.a H() {
        return (nc.a) this.f99996f.getValue();
    }

    @m80.k
    public final MutableLiveData<Boolean> I() {
        return this.f99993c;
    }

    @m80.k
    public final MutableLiveData<zg.g> J() {
        return this.f99991a;
    }

    public final void L(boolean z11) {
        qb0.h hVar = this.f99994d;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c K3 = rx.c.F0(p0(z11), c0(z11)).K3(tb0.a.a(), true);
        final x00.l lVar = new x00.l() { // from class: yg.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 M;
                M = h1.M(h1.this, (zg.g) obj);
                return M;
            }
        };
        K3.u5(new wb0.b() { // from class: yg.o0
            @Override // wb0.b
            public final void call(Object obj) {
                h1.N(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: yg.z0
            @Override // wb0.b
            public final void call(Object obj) {
                h1.O((Throwable) obj);
            }
        });
    }

    public final void P() {
        qb0.h hVar = this.f99995e;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c<Boolean> V = V();
        final x00.l lVar = new x00.l() { // from class: yg.b1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 Q;
                Q = h1.Q(h1.this, (Boolean) obj);
                return Q;
            }
        };
        this.f99995e = V.v5(new wb0.b() { // from class: yg.c1
            @Override // wb0.b
            public final void call(Object obj) {
                h1.R(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: yg.d1
            @Override // wb0.b
            public final void call(Object obj) {
                h1.S((Throwable) obj);
            }
        }, new wb0.a() { // from class: yg.e1
            @Override // wb0.a
            public final void call() {
                h1.T();
            }
        });
    }

    public final void U(boolean z11, int i11, @m80.k zg.g simple) {
        kotlin.jvm.internal.g0.p(simple, "simple");
        qb.c.i(f99988i, String.valueOf(simple), new Object[0]);
        HashMap hashMap = new HashMap();
        hashMap.put("taobaoinstalled", Boolean.valueOf(z11));
        hashMap.put("aid", simple.k());
        hashMap.put("imageurl", simple.n());
        hashMap.put("servertype", Integer.valueOf(simple.p()));
        hashMap.put("jumptype", Integer.valueOf(i11));
        ma.l.e("h5-error", "mall-tab-click_extra_v2", hashMap);
    }

    public final rx.c<Boolean> V() {
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise"));
        final x00.l lVar = new x00.l() { // from class: yg.t0
            @Override // x00.l
            public final Object invoke(Object obj) {
                LiveStreamingInfo W;
                W = h1.W((AdvertiseApiService.Client) obj);
                return W;
            }
        };
        rx.c c32 = a11.c3(new wb0.p() { // from class: yg.u0
            @Override // wb0.p
            public final Object call(Object obj) {
                LiveStreamingInfo X;
                X = h1.X(x00.l.this, obj);
                return X;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: yg.v0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean Y;
                Y = h1.Y((LiveStreamingInfo) obj);
                return Y;
            }
        };
        rx.c c33 = c32.c3(new wb0.p() { // from class: yg.w0
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean Z;
                Z = h1.Z(x00.l.this, obj);
                return Z;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: yg.x0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 a02;
                a02 = h1.a0((Boolean) obj);
                return a02;
            }
        };
        rx.c<Boolean> w52 = c33.L1(new wb0.b() { // from class: yg.y0
            @Override // wb0.b
            public final void call(Object obj) {
                h1.b0(x00.l.this, obj);
            }
        }).w5(bc0.c.e());
        kotlin.jvm.internal.g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    public final rx.c<zg.g> c0(final boolean z11) {
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise"));
        final x00.l lVar = new x00.l() { // from class: yg.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                MallTabInfo d02;
                d02 = h1.d0((AdvertiseApiService.Client) obj);
                return d02;
            }
        };
        rx.c c32 = a11.c3(new wb0.p() { // from class: yg.j0
            @Override // wb0.p
            public final Object call(Object obj) {
                MallTabInfo e02;
                e02 = h1.e0(x00.l.this, obj);
                return e02;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: yg.k0
            @Override // x00.l
            public final Object invoke(Object obj) {
                TabInfo f02;
                f02 = h1.f0((MallTabInfo) obj);
                return f02;
            }
        };
        rx.c c33 = c32.c3(new wb0.p() { // from class: yg.l0
            @Override // wb0.p
            public final Object call(Object obj) {
                TabInfo g02;
                g02 = h1.g0(x00.l.this, obj);
                return g02;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: yg.m0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h02;
                h02 = h1.h0(h1.this, (TabInfo) obj);
                return h02;
            }
        };
        rx.c L1 = c33.L1(new wb0.b() { // from class: yg.n0
            @Override // wb0.b
            public final void call(Object obj) {
                h1.i0(x00.l.this, obj);
            }
        });
        final x00.l lVar4 = new x00.l() { // from class: yg.p0
            @Override // x00.l
            public final Object invoke(Object obj) {
                zg.g j02;
                j02 = h1.j0(h1.this, z11, (TabInfo) obj);
                return j02;
            }
        };
        rx.c c34 = L1.c3(new wb0.p() { // from class: yg.q0
            @Override // wb0.p
            public final Object call(Object obj) {
                zg.g k02;
                k02 = h1.k0(x00.l.this, obj);
                return k02;
            }
        });
        final x00.l lVar5 = new x00.l() { // from class: yg.r0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 m02;
                m02 = h1.m0((zg.g) obj);
                return m02;
            }
        };
        rx.c<zg.g> w52 = c34.L1(new wb0.b() { // from class: yg.s0
            @Override // wb0.b
            public final void call(Object obj) {
                h1.n0(x00.l.this, obj);
            }
        }).w5(bc0.c.e());
        kotlin.jvm.internal.g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    public final void o0(boolean z11) {
        this.f99992b.postValue(Boolean.valueOf(z11));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f99994d;
        if (hVar != null) {
            hVar.unsubscribe();
        }
    }

    public final rx.c<zg.g> p0(final boolean z11) {
        rx.c M2 = rx.c.M2(H().getString(f99990k, ""));
        final x00.l lVar = new x00.l() { // from class: yg.f1
            @Override // x00.l
            public final Object invoke(Object obj) {
                TabInfo q02;
                q02 = h1.q0((String) obj);
                return q02;
            }
        };
        rx.c c32 = M2.c3(new wb0.p() { // from class: yg.g1
            @Override // wb0.p
            public final Object call(Object obj) {
                TabInfo r02;
                r02 = h1.r0(x00.l.this, obj);
                return r02;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: yg.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                zg.g s02;
                s02 = h1.s0(h1.this, z11, (TabInfo) obj);
                return s02;
            }
        };
        rx.c c33 = c32.c3(new wb0.p() { // from class: yg.f0
            @Override // wb0.p
            public final Object call(Object obj) {
                zg.g t02;
                t02 = h1.t0(x00.l.this, obj);
                return t02;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: yg.g0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 u02;
                u02 = h1.u0((zg.g) obj);
                return u02;
            }
        };
        rx.c<zg.g> w52 = c33.L1(new wb0.b() { // from class: yg.h0
            @Override // wb0.b
            public final void call(Object obj) {
                h1.v0(x00.l.this, obj);
            }
        }).w5(bc0.c.e());
        kotlin.jvm.internal.g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    public static final void T() {
    }
}
