package tf;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import com.baicizhan.main.auth.VerificationType;
import com.baicizhan.online.thrift.basic.ErrorCode;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.unified_user_service.BindPhoneResult;
import com.baicizhan.online.unified_user_service.PhoneFreeVerifyRequest;
import com.baicizhan.online.unified_user_service.PhoneLoginRequest;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.u0;
import org.apache.thrift.TException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nOneKeyLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneKeyLoginViewModel.kt\ncom/baicizhan/main/auth/onekey/OneKeyLoginViewModel\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,335:1\n35#2:336\n*S KotlinDebug\n*F\n+ 1 OneKeyLoginViewModel.kt\ncom/baicizhan/main/auth/onekey/OneKeyLoginViewModel\n*L\n135#1:336\n*E\n"})
/* loaded from: classes4.dex */
public final class a0 extends sf.r {

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public static final a f90487x = new a(null);

    /* renamed from: y, reason: collision with root package name */
    public static final int f90488y = 8;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public static final String f90489z = "OneKeyLoginViewModel";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f90490e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f90491f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f90492g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f90493h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f90494i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f90495j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f90496k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f90497l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f90498m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f90499n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f90500o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Void> f90501p;

    /* renamed from: q, reason: collision with root package name */
    @m80.l
    public String f90502q;

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    public String f90503r;

    /* renamed from: s, reason: collision with root package name */
    @m80.l
    public UserLoginResult f90504s;

    /* renamed from: t, reason: collision with root package name */
    @m80.l
    public qb0.h f90505t;

    /* renamed from: u, reason: collision with root package name */
    @m80.l
    public qb0.h f90506u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public VerificationType f90507v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f90508w;

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
        public static final /* synthetic */ int[] f90509a;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.LOGIN_PHONE_DIRECTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.BIND_PHONE_DIRECTLY_AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationType.BIND_PHONE_DIRECTLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationType.BIND_PHONE_CHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f90509a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements tf.b {
        public c() {
        }

        @Override // tf.b
        public void a(r result) {
            kotlin.jvm.internal.g0.p(result, "result");
            qb.c.i(a0.f90489z, "verify success : " + result, new Object[0]);
            if (a0.this.R()) {
                a0.this.S(result);
                com.baicizhan.main.auth.onekey.a.f19954a.j(ma.a.f72779k3, true, "");
                return;
            }
            a0 a0Var = a0.this;
            a0Var.o(result, a0Var.J());
            if (a0.this.w() != VerificationType.BIND_PHONE_DIRECTLY_AUTO) {
                com.baicizhan.main.auth.onekey.a.f19954a.l(ma.a.f72814p3, true, "");
                return;
            }
            ma.r g11 = ma.r.g();
            UserLoginResult J = a0.this.J();
            g11.n(J != null ? J.access_token : null);
            com.baicizhan.main.auth.onekey.a.f19954a.l(ma.a.f72800n3, true, "");
        }

        @Override // tf.b
        public void b(String str) {
            qb.c.d(a0.f90489z, "verify failure:" + str, new Object[0]);
            va.g.i(a0.this.R() ? "登录失败" : "绑定失败", 0);
            a0.this.b().setValue(Boolean.FALSE);
            a0.this.x().postValue(Boolean.TRUE);
            if (a0.this.R()) {
                com.baicizhan.main.auth.onekey.a.f19954a.j(ma.a.f72779k3, false, str);
                return;
            }
            if (a0.this.w() != VerificationType.BIND_PHONE_DIRECTLY_AUTO) {
                com.baicizhan.main.auth.onekey.a.f19954a.l(ma.a.f72814p3, false, str);
                return;
            }
            ma.r g11 = ma.r.g();
            UserLoginResult J = a0.this.J();
            g11.n(J != null ? J.access_token : null);
            com.baicizhan.main.auth.onekey.a.f19954a.l(ma.a.f72800n3, false, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        this.f90490e = new MutableLiveData<>();
        this.f90491f = new MutableLiveData<>();
        this.f90492g = new MutableLiveData<>();
        this.f90493h = new MutableLiveData<>();
        this.f90494i = new MutableLiveData<>();
        this.f90495j = new MutableLiveData<>();
        this.f90496k = new MutableLiveData<>();
        this.f90497l = new MutableLiveData<>();
        this.f90498m = new ClickProtectedEvent<>();
        this.f90499n = new MutableLiveData<>();
        this.f90500o = new ClickProtectedEvent<>();
        this.f90501p = new ClickProtectedEvent<>();
        this.f90507v = VerificationType.LOGIN_PHONE_DIRECTLY;
    }

    public static final rx.c T(a0 a0Var, r rVar, UnifiedUserService.Client client) {
        try {
            PhoneLoginRequest phoneLoginRequest = new PhoneLoginRequest();
            PhoneFreeVerifyRequest phoneFreeVerifyRequest = new PhoneFreeVerifyRequest();
            phoneFreeVerifyRequest.opToken = rVar.f();
            phoneFreeVerifyRequest.clientToken = rVar.h();
            phoneFreeVerifyRequest.operatorName = rVar.g();
            phoneLoginRequest.free_verify_request = phoneFreeVerifyRequest;
            phoneLoginRequest.device = DeviceUtil.getUniqueID(a0Var.getApplication());
            return rx.c.M2(client.login_with_phone(phoneLoginRequest));
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public static final g2 U(a0 a0Var, UserLoginResult userLoginResult) {
        a0Var.d(userLoginResult);
        a0Var.b().postValue(Boolean.FALSE);
        return g2.f100423a;
    }

    public static final void V(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void W(a0 a0Var, Throwable th2) {
        qb.c.d(f90489z, "loginBySecVerify, " + th2, new Object[0]);
        a0Var.b().postValue(Boolean.FALSE);
        va.g.k(th2, R.string.verification_toast_login_failed, 0);
    }

    public static /* synthetic */ void p(a0 a0Var, r rVar, UserLoginResult userLoginResult, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            userLoginResult = null;
        }
        a0Var.o(rVar, userLoginResult);
    }

    public static final rx.c q(a0 a0Var, r rVar, UnifiedUserService.Client client) {
        try {
            PhoneLoginRequest phoneLoginRequest = new PhoneLoginRequest();
            PhoneFreeVerifyRequest phoneFreeVerifyRequest = new PhoneFreeVerifyRequest();
            phoneFreeVerifyRequest.opToken = rVar.f();
            phoneFreeVerifyRequest.clientToken = rVar.h();
            phoneFreeVerifyRequest.operatorName = rVar.g();
            phoneLoginRequest.free_verify_request = phoneFreeVerifyRequest;
            BindPhoneResult bind_phone_v3 = client.bind_phone_v3(phoneLoginRequest);
            String phone = bind_phone_v3.phone;
            kotlin.jvm.internal.g0.o(phone, "phone");
            a0Var.e0(phone);
            return rx.c.M2(bind_phone_v3);
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public static final g2 r(a0 a0Var, UserLoginResult userLoginResult, BindPhoneResult bindPhoneResult) {
        kotlin.jvm.internal.g0.m(bindPhoneResult);
        a0Var.u(bindPhoneResult, userLoginResult);
        a0Var.b().postValue(Boolean.FALSE);
        return g2.f100423a;
    }

    public static final void s(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void t(a0 a0Var, Throwable th2) {
        qb.c.d(f90489z, "bindPhoneByOneKey, " + th2, new Object[0]);
        a0Var.n(th2);
        a0Var.b().postValue(Boolean.FALSE);
    }

    @m80.k
    public final MutableLiveData<String> A() {
        return this.f90496k;
    }

    @m80.k
    public final MutableLiveData<String> B() {
        return this.f90493h;
    }

    @m80.l
    public final String C() {
        return this.f90503r;
    }

    @m80.l
    public final String D() {
        return this.f90502q;
    }

    @m80.k
    public final ClickProtectedEvent<Void> F() {
        return this.f90498m;
    }

    @m80.k
    public final MutableLiveData<String> G() {
        return this.f90497l;
    }

    @m80.k
    public final MutableLiveData<String> H() {
        return this.f90492g;
    }

    @m80.k
    public final MutableLiveData<String> I() {
        return this.f90491f;
    }

    @m80.l
    public final UserLoginResult J() {
        return this.f90504s;
    }

    @m80.k
    public final MutableLiveData<String> K() {
        return this.f90494i;
    }

    @m80.k
    public final ClickProtectedEvent<Void> L() {
        return this.f90500o;
    }

    public final void M() {
        this.f90501p.call();
    }

    public final void N() {
        if (this.f90508w) {
            b().setValue(Boolean.TRUE);
            q.f90552a.a().c(new c());
            return;
        }
        va.g.i("请阅读并同意 " + this.f90502q, 0);
    }

    public final void O() {
        this.f90498m.call();
    }

    public final void P() {
        this.f90500o.call();
    }

    @m80.k
    public final MutableLiveData<Boolean> Q() {
        return this.f90495j;
    }

    public final boolean R() {
        return this.f90507v == VerificationType.LOGIN_PHONE_DIRECTLY;
    }

    public final void S(@m80.k final r result) {
        kotlin.jvm.internal.g0.p(result, "result");
        qb0.h hVar = this.f90505t;
        if (hVar == null || hVar.isUnsubscribed()) {
            rx.c I3 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").e(false)).b2(new wb0.p() { // from class: tf.s
                @Override // wb0.p
                public final Object call(Object obj) {
                    rx.c T;
                    T = a0.T(a0.this, result, (UnifiedUserService.Client) obj);
                    return T;
                }
            }).w5(bc0.c.a()).I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: tf.t
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 U;
                    U = a0.U(a0.this, (UserLoginResult) obj);
                    return U;
                }
            };
            this.f90505t = I3.u5(new wb0.b() { // from class: tf.u
                @Override // wb0.b
                public final void call(Object obj) {
                    a0.V(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: tf.v
                @Override // wb0.b
                public final void call(Object obj) {
                    a0.W(a0.this, (Throwable) obj);
                }
            });
        }
    }

    public final void X(@m80.k VerificationType verificationType) {
        kotlin.jvm.internal.g0.p(verificationType, "<set-?>");
        this.f90507v = verificationType;
    }

    public final void Y(boolean z11) {
        this.f90508w = z11;
    }

    public final void Z(@m80.l String str) {
        this.f90503r = str;
    }

    public final void a0(@m80.l String str) {
        this.f90502q = str;
    }

    public final void b0(String str, String str2, boolean z11) {
        this.f90491f.setValue(str);
        this.f90492g.setValue(str2);
        this.f90495j.setValue(Boolean.valueOf(z11));
        if (z11) {
            this.f90496k.setValue(KotlinExtKt.getString(R.string.sec_verify_btn_bind));
            this.f90497l.setValue(KotlinExtKt.getString(R.string.sec_verify_other_btn_bind));
        } else {
            this.f90496k.setValue(KotlinExtKt.getString(R.string.login_login));
            this.f90497l.setValue(KotlinExtKt.getString(R.string.sec_verify_other_btn_login));
        }
    }

    public final void c0(@m80.l UserLoginResult userLoginResult) {
        this.f90504s = userLoginResult;
    }

    public final void d0(@m80.k VerificationType type) {
        kotlin.jvm.internal.g0.p(type, "type");
        this.f90507v = type;
        int i11 = b.f90509a[type.ordinal()];
        if (i11 == 1) {
            b0(KotlinExtKt.getString(R.string.otherlogin), "", false);
        } else if (i11 == 2) {
            b0(KotlinExtKt.getString(R.string.sec_verify_title_bind), KotlinExtKt.getString(R.string.sec_verify_title_bind_desc), true);
        } else if (i11 == 3) {
            b0(KotlinExtKt.getString(R.string.sec_verify_title_bind), "", true);
        } else if (i11 == 4) {
            b0(KotlinExtKt.getString(R.string.sec_verify_title_bind), "", true);
        }
        j0 b11 = q.f90552a.a().b();
        if (b11 != null) {
            this.f90494i.setValue(b11.k());
            this.f90493h.setValue(b11.n());
            this.f90502q = b11.l();
            this.f90503r = b11.m();
        }
    }

    public final void e0(String str) {
        UserRecord p11 = q9.x.r().p();
        if (p11 != null) {
            p11.setPhone(str);
            i9.m.f(getApplication(), p11);
            AccountBindingMgr.inst().setInfo("phone", AccountBindingMgr.BindInfo.fromLoginInfo("phone", "", str, ""));
            i9.m.c(getApplication());
        }
    }

    public final void n(Throwable th2) {
        if (th2 != null) {
            g2 g2Var = null;
            LogicException logicException = th2 instanceof LogicException ? (LogicException) th2 : null;
            if (logicException != null) {
                if (logicException.code != ErrorCode.ALREADY_IN_USE.getValue()) {
                    va.g.k(th2, R.string.verification_toast_bind_failed, 0);
                }
                g2Var = g2.f100423a;
            }
            if (g2Var != null) {
                return;
            }
        }
        va.g.g(R.string.verification_toast_bind_failed, 0);
    }

    public final void o(@m80.k final r result, @m80.l final UserLoginResult userLoginResult) {
        kotlin.jvm.internal.g0.p(result, "result");
        qb0.h hVar = this.f90506u;
        if (hVar == null || hVar.isUnsubscribed()) {
            rx.c I3 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").g(userLoginResult != null ? userLoginResult.access_token : null)).b2(new wb0.p() { // from class: tf.w
                @Override // wb0.p
                public final Object call(Object obj) {
                    rx.c q11;
                    q11 = a0.q(a0.this, result, (UnifiedUserService.Client) obj);
                    return q11;
                }
            }).w5(bc0.c.a()).I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: tf.x
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 r11;
                    r11 = a0.r(a0.this, userLoginResult, (BindPhoneResult) obj);
                    return r11;
                }
            };
            this.f90506u = I3.u5(new wb0.b() { // from class: tf.y
                @Override // wb0.b
                public final void call(Object obj) {
                    a0.s(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: tf.z
                @Override // wb0.b
                public final void call(Object obj) {
                    a0.t(a0.this, (Throwable) obj);
                }
            });
        }
    }

    public final void u(BindPhoneResult bindPhoneResult, UserLoginResult userLoginResult) {
        va.g.g(R.string.user_center_bind_success, 0);
        if (userLoginResult != null) {
            userLoginResult.phone = bindPhoneResult.phone;
        }
        this.f90490e.postValue(Boolean.TRUE);
    }

    @m80.k
    public final LiveData<Boolean> v() {
        return this.f90490e;
    }

    @m80.k
    public final VerificationType w() {
        return this.f90507v;
    }

    @m80.k
    public final MutableLiveData<Boolean> x() {
        return this.f90499n;
    }

    @m80.k
    public final ClickProtectedEvent<Void> y() {
        return this.f90501p;
    }

    public final boolean z() {
        return this.f90508w;
    }
}
