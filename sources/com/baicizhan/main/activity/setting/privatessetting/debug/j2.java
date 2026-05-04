package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.client.business.okhttp.DnsMgr;
import com.baicizhan.client.business.util.ClickProtectedEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class j2 extends AndroidViewModel {

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final a f19732s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f19733t = 8;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final String f19734u = "DebugSettingViewModel";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f19735a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Void> f19736b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public MutableLiveData<Boolean> f19737c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public MutableLiveData<Boolean> f19738d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public MutableLiveData<Boolean> f19739e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public MutableLiveData<Boolean> f19740f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public MutableLiveData<Boolean> f19741g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public MutableLiveData<Boolean> f19742h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19743i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19744j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19745k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19746l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19747m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19748n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19749o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19750p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19751q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f19752r;

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
        public static final /* synthetic */ int[] f19753a;

        static {
            int[] iArr = new int[DnsMgr.TestServer.values().length];
            try {
                iArr[DnsMgr.TestServer.Test1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DnsMgr.TestServer.Test2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19753a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f19754a;

        public c(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f19754a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f19754a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19754a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        this.f19735a = new MutableLiveData<>();
        this.f19736b = new MutableLiveData<>();
        this.f19737c = new MutableLiveData<>();
        this.f19738d = new MutableLiveData<>();
        this.f19739e = new MutableLiveData<>();
        this.f19740f = new MutableLiveData<>();
        this.f19741g = new MutableLiveData<>();
        this.f19742h = new MutableLiveData<>();
        this.f19743i = new ClickProtectedEvent<>();
        this.f19744j = new ClickProtectedEvent<>();
        this.f19745k = new ClickProtectedEvent<>();
        this.f19746l = new ClickProtectedEvent<>();
        this.f19747m = new ClickProtectedEvent<>();
        this.f19748n = new ClickProtectedEvent<>();
        this.f19749o = new ClickProtectedEvent<>();
        this.f19750p = new ClickProtectedEvent<>();
        this.f19751q = new ClickProtectedEvent<>();
        this.f19752r = new ClickProtectedEvent<>();
    }

    public static final yz.g2 P(Boolean bool) {
        DebugConfig debugConfig = DebugConfig.getsIntance();
        kotlin.jvm.internal.g0.m(bool);
        debugConfig.fixOptionPosition = bool.booleanValue();
        qb.c.i(f19734u, "sb mode " + bool, new Object[0]);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q(Boolean bool) {
        DebugConfig debugConfig = DebugConfig.getsIntance();
        kotlin.jvm.internal.g0.m(bool);
        debugConfig.webWhiteListEnable = bool.booleanValue();
        qb.c.i(f19734u, "whiteListEnable " + bool, new Object[0]);
        return yz.g2.f100423a;
    }

    public static final yz.g2 R(Boolean bool) {
        DebugConfig debugConfig = DebugConfig.getsIntance();
        kotlin.jvm.internal.g0.m(bool);
        debugConfig.minuteAsSecond = bool.booleanValue();
        return yz.g2.f100423a;
    }

    public static final yz.g2 S(Boolean bool) {
        DebugConfig debugConfig = DebugConfig.getsIntance();
        kotlin.jvm.internal.g0.m(bool);
        debugConfig.secondAsMinute = bool.booleanValue();
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(Boolean bool) {
        DebugConfig debugConfig = DebugConfig.getsIntance();
        kotlin.jvm.internal.g0.m(bool);
        debugConfig.vldEntry = bool.booleanValue();
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(Boolean bool) {
        DebugConfig debugConfig = DebugConfig.getsIntance();
        kotlin.jvm.internal.g0.m(bool);
        debugConfig.vldCameraAdding = bool.booleanValue();
        return yz.g2.f100423a;
    }

    @m80.k
    public final MutableLiveData<Boolean> A() {
        return this.f19738d;
    }

    public final void B() {
        this.f19743i.call();
    }

    public final void C() {
        this.f19744j.call();
    }

    public final void D() {
        this.f19751q.call();
    }

    public final void F() {
        this.f19747m.call();
    }

    public final void G() {
        this.f19750p.call();
    }

    public final void H(@m80.k DnsMgr.TestServer test) {
        kotlin.jvm.internal.g0.p(test, "test");
        DnsMgr dnsMgr = DnsMgr.f16538a;
        dnsMgr.f(test);
        this.f19735a.postValue(X(dnsMgr.e()));
    }

    public final void I(@m80.k MutableLiveData<Boolean> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<set-?>");
        this.f19739e = mutableLiveData;
    }

    public final void J(@m80.k MutableLiveData<Boolean> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<set-?>");
        this.f19740f = mutableLiveData;
    }

    public final void K(@m80.k MutableLiveData<Boolean> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<set-?>");
        this.f19737c = mutableLiveData;
    }

    public final void L(@m80.k MutableLiveData<Boolean> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<set-?>");
        this.f19742h = mutableLiveData;
    }

    public final void M(@m80.k MutableLiveData<Boolean> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<set-?>");
        this.f19741g = mutableLiveData;
    }

    public final void N(@m80.k MutableLiveData<Boolean> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<set-?>");
        this.f19738d = mutableLiveData;
    }

    public final void O() {
        this.f19752r.call();
    }

    public final void V() {
        this.f19748n.call();
    }

    public final void W() {
        this.f19749o.call();
    }

    @m80.k
    public final String X(@m80.k DnsMgr.TestServer testServer) {
        kotlin.jvm.internal.g0.p(testServer, "<this>");
        int i11 = b.f19753a[testServer.ordinal()];
        if (i11 == 1) {
            return "TEST1(" + ((Object) DnsMgr.f16538a.d().get(0)) + pn.j.f81007d;
        }
        if (i11 != 2) {
            return "None";
        }
        return "TEST2(" + ((Object) DnsMgr.f16538a.d().get(1)) + pn.j.f81007d;
    }

    public final void Y() {
        this.f19745k.call();
    }

    public final void Z() {
        this.f19746l.call();
    }

    public final void h() {
        this.f19736b.postValue(null);
    }

    public final void i() {
        throw new NullPointerException("test crash");
    }

    @m80.k
    public final ClickProtectedEvent<Void> j() {
        return this.f19752r;
    }

    @m80.k
    public final ClickProtectedEvent<Void> k() {
        return this.f19751q;
    }

    @m80.k
    public final ClickProtectedEvent<Void> l() {
        return this.f19744j;
    }

    @m80.k
    public final ClickProtectedEvent<Void> m() {
        return this.f19743i;
    }

    @m80.k
    public final MutableLiveData<Void> n() {
        return this.f19736b;
    }

    @m80.k
    public final ClickProtectedEvent<Void> o() {
        return this.f19747m;
    }

    @m80.k
    public final MutableLiveData<Boolean> p() {
        return this.f19739e;
    }

    @m80.k
    public final ClickProtectedEvent<Void> q() {
        return this.f19750p;
    }

    @m80.k
    public final MutableLiveData<Boolean> r() {
        return this.f19740f;
    }

    @m80.k
    public final ClickProtectedEvent<Void> s() {
        return this.f19749o;
    }

    public final void start() {
        this.f19735a.postValue(X(DnsMgr.f16538a.e()));
        this.f19737c.postValue(Boolean.valueOf(DebugConfig.getsIntance().fixOptionPosition));
        this.f19737c.observeForever(new c(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.d2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 P;
                P = j2.P((Boolean) obj);
                return P;
            }
        }));
        this.f19738d.postValue(Boolean.valueOf(DebugConfig.getsIntance().webWhiteListEnable));
        this.f19738d.observeForever(new c(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.e2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 Q;
                Q = j2.Q((Boolean) obj);
                return Q;
            }
        }));
        this.f19739e.setValue(Boolean.valueOf(DebugConfig.getsIntance().minuteAsSecond));
        this.f19739e.observeForever(new c(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.f2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 R;
                R = j2.R((Boolean) obj);
                return R;
            }
        }));
        this.f19740f.setValue(Boolean.valueOf(DebugConfig.getsIntance().secondAsMinute));
        this.f19740f.observeForever(new c(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.g2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 S;
                S = j2.S((Boolean) obj);
                return S;
            }
        }));
        this.f19741g.setValue(Boolean.valueOf(DebugConfig.getsIntance().vldEntry));
        this.f19742h.setValue(Boolean.valueOf(DebugConfig.getsIntance().vldCameraAdding));
        this.f19741g.observeForever(new c(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.h2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 T;
                T = j2.T((Boolean) obj);
                return T;
            }
        }));
        this.f19742h.observeForever(new c(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.i2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 U;
                U = j2.U((Boolean) obj);
                return U;
            }
        }));
    }

    @m80.k
    public final MutableLiveData<Boolean> t() {
        return this.f19737c;
    }

    @m80.k
    public final ClickProtectedEvent<Void> u() {
        return this.f19748n;
    }

    @m80.k
    public final MutableLiveData<String> v() {
        return this.f19735a;
    }

    @m80.k
    public final ClickProtectedEvent<Void> w() {
        return this.f19745k;
    }

    @m80.k
    public final MutableLiveData<Boolean> x() {
        return this.f19742h;
    }

    @m80.k
    public final MutableLiveData<Boolean> y() {
        return this.f19741g;
    }

    @m80.k
    public final ClickProtectedEvent<Void> z() {
        return this.f19746l;
    }
}
