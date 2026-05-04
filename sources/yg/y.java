package yg;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.StringUtil;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import com.baicizhan.main.auth.SmsCaptcha;
import com.baicizhan.online.thrift.basic.ErrorCode;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.unified_user_service.BindPhoneResult;
import com.baicizhan.online.unified_user_service.PhoneLoginRequest;
import com.baicizhan.online.unified_user_service.PhoneVerifyCodeRequest;
import com.baicizhan.online.unified_user_service.SendCaptchaAction;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.jiongji.andriod.card.R;
import kotlin.Pair;
import kotlin.Triple;
import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class y extends AndroidViewModel {

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final a f100107l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f100108m = 8;

    /* renamed from: n, reason: collision with root package name */
    public static final String f100109n = y.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public qb0.h f100110a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public qb0.h f100111b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public qb0.h f100112c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public qb0.h f100113d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f100114e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Pair<Boolean, Throwable>> f100115f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f100116g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<UserLoginResult> f100117h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Triple<BindPhoneResult, UserLoginResult, Throwable>> f100118i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f100119j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f100120k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        this.f100114e = new MutableLiveData<>();
        this.f100115f = new MutableLiveData<>();
        this.f100116g = new MutableLiveData<>();
        this.f100117h = new MutableLiveData<>();
        this.f100118i = new MutableLiveData<>();
        this.f100119j = new MutableLiveData<>();
        this.f100120k = new MutableLiveData<>();
    }

    public static final rx.c A(y yVar, String str, String str2, UnifiedUserService.Client client) {
        try {
            PhoneLoginRequest phoneLoginRequest = new PhoneLoginRequest();
            PhoneVerifyCodeRequest phoneVerifyCodeRequest = new PhoneVerifyCodeRequest();
            phoneVerifyCodeRequest.phone = str;
            phoneVerifyCodeRequest.verify_code = str2;
            phoneLoginRequest.verify_code_request = phoneVerifyCodeRequest;
            BindPhoneResult bind_phone_v3 = client.bind_phone_v3(phoneLoginRequest);
            String phone = bind_phone_v3.phone;
            kotlin.jvm.internal.g0.o(phone, "phone");
            yVar.h0(phone);
            return rx.c.M2(bind_phone_v3);
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public static final yz.g2 B(y yVar, BindPhoneResult bindPhoneResult) {
        yVar.f100114e.postValue(Boolean.FALSE);
        yVar.f100118i.postValue(new Triple<>(bindPhoneResult, null, null));
        return yz.g2.f100423a;
    }

    public static final void C(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void D(y yVar, Throwable th2) {
        qb.c.d(f100109n, "bindPhone, " + th2, new Object[0]);
        yVar.f100114e.postValue(Boolean.FALSE);
        yVar.f100118i.postValue(new Triple<>(null, null, th2));
    }

    public static final rx.c N(y yVar, String str, String str2, UnifiedUserService.Client client) {
        try {
            PhoneLoginRequest phoneLoginRequest = new PhoneLoginRequest();
            PhoneVerifyCodeRequest phoneVerifyCodeRequest = new PhoneVerifyCodeRequest();
            phoneVerifyCodeRequest.phone = str;
            phoneVerifyCodeRequest.verify_code = str2;
            phoneLoginRequest.verify_code_request = phoneVerifyCodeRequest;
            phoneLoginRequest.device = DeviceUtil.getUniqueID(yVar.getApplication());
            return rx.c.M2(client.login_with_phone(phoneLoginRequest));
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public static final yz.g2 O(y yVar, UserLoginResult userLoginResult) {
        yVar.f100114e.postValue(Boolean.FALSE);
        yVar.f100117h.postValue(userLoginResult);
        return yz.g2.f100423a;
    }

    public static final void P(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void Q(y yVar, Throwable th2) {
        qb.c.d(f100109n, "loginByCode, " + th2, new Object[0]);
        yVar.f100114e.postValue(Boolean.FALSE);
        yVar.f100117h.postValue(null);
        va.g.k(th2, R.string.verification_toast_login_failed, 0);
    }

    public static /* synthetic */ void S(y yVar, String str, SmsCaptcha smsCaptcha, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestCaptcha");
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        yVar.R(str, smsCaptcha, str2);
    }

    public static final rx.c T(String str, SmsCaptcha smsCaptcha, UnifiedUserService.Client client) {
        try {
            client.send_sms_verify_code(str, smsCaptcha.getType());
            return rx.c.M2(Boolean.TRUE);
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public static final yz.g2 U(y yVar, Boolean bool) {
        yVar.f100114e.postValue(Boolean.FALSE);
        yVar.f100115f.postValue(new Pair<>(bool, null));
        if (bool.booleanValue()) {
            va.g.g(R.string.verification_toast_sms_captcha_sent, 0);
        }
        return yz.g2.f100423a;
    }

    public static final void V(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void W(y yVar, Throwable th2) {
        qb.c.d(f100109n, "request captcha, " + th2, new Object[0]);
        MutableLiveData<Boolean> mutableLiveData = yVar.f100114e;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        LogicException logicException = th2 instanceof LogicException ? (LogicException) th2 : null;
        if (logicException != null && logicException.code == ErrorCode.ALREADY_IN_USE.getValue()) {
            yVar.f100115f.postValue(new Pair<>(null, th2));
        } else {
            yVar.f100115f.postValue(new Pair<>(bool, th2));
            va.g.k(th2, R.string.verification_toast_sms_captcha_failed, 0);
        }
    }

    public static final rx.c Y(String str, UnifiedUserService.Client client) {
        try {
            return rx.c.M2(Boolean.valueOf(client.send_captcha(str, SendCaptchaAction.RESET_PW)));
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public static final yz.g2 Z(y yVar, Boolean bool) {
        yVar.f100114e.postValue(Boolean.FALSE);
        yVar.f100116g.postValue(bool);
        if (bool.booleanValue()) {
            va.g.g(R.string.verification_toast_mail_captcha_sent, 0);
        } else {
            va.g.g(R.string.verification_toast_mail_captcha_sent_limit, 0);
        }
        return yz.g2.f100423a;
    }

    public static final void a0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void b0(y yVar, Throwable th2) {
        qb.c.d(f100109n, "request email captcha, " + th2, new Object[0]);
        MutableLiveData<Boolean> mutableLiveData = yVar.f100114e;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        yVar.f100116g.postValue(bool);
        va.g.k(th2, R.string.verification_toast_sms_captcha_failed, 0);
    }

    public static final rx.c d0(String str, String str2, String str3, UnifiedUserService.Client client) {
        try {
            client.reset_password(str, StringUtil.md5Hex(str2, true), str3);
            return rx.c.M2(Boolean.TRUE);
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public static final yz.g2 e0(y yVar, Boolean bool) {
        yVar.f100114e.postValue(Boolean.FALSE);
        yVar.f100120k.postValue(bool);
        return yz.g2.f100423a;
    }

    public static final void f0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void g0(y yVar, Throwable th2) {
        qb.c.d(f100109n, "resetEmailAccountPassword, " + th2, new Object[0]);
        MutableLiveData<Boolean> mutableLiveData = yVar.f100114e;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        yVar.f100120k.postValue(bool);
        va.g.k(th2, R.string.verification_toast_reset_password_error, 0);
    }

    private final void h0(String str) {
        UserRecord p11 = q9.x.r().p();
        if (p11 != null) {
            p11.setPhone(str);
            i9.m.f(getApplication(), p11);
            AccountBindingMgr.inst().setInfo("phone", AccountBindingMgr.BindInfo.fromLoginInfo("phone", "", str, ""));
            i9.m.c(getApplication());
        }
    }

    public static final rx.c j0(String str, String str2, UnifiedUserService.Client client) {
        try {
            client.check_verify_code_for_old_phone(str, str2);
            return rx.c.M2(Boolean.TRUE);
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public static final yz.g2 k0(y yVar, Boolean bool) {
        yVar.f100114e.postValue(Boolean.FALSE);
        yVar.f100119j.postValue(Boolean.TRUE);
        return yz.g2.f100423a;
    }

    public static final void m0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void n0(y yVar, Throwable th2) {
        qb.c.d(f100109n, "verifyPreviousPhone, " + th2, new Object[0]);
        MutableLiveData<Boolean> mutableLiveData = yVar.f100114e;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        yVar.f100119j.postValue(bool);
        va.g.k(th2, R.string.verification_toast_verify_failed, 0);
    }

    @m80.k
    public final LiveData<Triple<BindPhoneResult, UserLoginResult, Throwable>> F() {
        return this.f100118i;
    }

    @m80.k
    public final LiveData<Boolean> G() {
        return this.f100114e;
    }

    @m80.k
    public final LiveData<UserLoginResult> H() {
        return this.f100117h;
    }

    @m80.k
    public final LiveData<Boolean> I() {
        return this.f100116g;
    }

    @m80.k
    public final LiveData<Boolean> J() {
        return this.f100119j;
    }

    @m80.k
    public final LiveData<Boolean> K() {
        return this.f100120k;
    }

    @m80.k
    public final LiveData<Pair<Boolean, Throwable>> L() {
        return this.f100115f;
    }

    public final void M(@m80.k final String phone, @m80.k final String code) {
        kotlin.jvm.internal.g0.p(phone, "phone");
        kotlin.jvm.internal.g0.p(code, "code");
        qb0.h hVar = this.f100111b;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f100114e.postValue(Boolean.TRUE);
            rx.c I3 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").e(false)).b2(new wb0.p() { // from class: yg.d
                @Override // wb0.p
                public final Object call(Object obj) {
                    rx.c N;
                    N = y.N(y.this, phone, code, (UnifiedUserService.Client) obj);
                    return N;
                }
            }).w5(bc0.c.a()).I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: yg.e
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 O;
                    O = y.O(y.this, (UserLoginResult) obj);
                    return O;
                }
            };
            this.f100111b = I3.u5(new wb0.b() { // from class: yg.f
                @Override // wb0.b
                public final void call(Object obj) {
                    y.P(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: yg.g
                @Override // wb0.b
                public final void call(Object obj) {
                    y.Q(y.this, (Throwable) obj);
                }
            });
        }
    }

    public final void R(@m80.k final String account, @m80.k final SmsCaptcha type, @m80.l String str) {
        kotlin.jvm.internal.g0.p(account, "account");
        kotlin.jvm.internal.g0.p(type, "type");
        qb0.h hVar = this.f100110a;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f100114e.postValue(Boolean.TRUE);
            com.baicizhan.client.business.thrift.l lVar = new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service");
            if (str == null) {
                lVar.e(false);
            } else {
                lVar.g(str);
            }
            rx.c I3 = com.baicizhan.client.business.thrift.p.a(lVar).b2(new wb0.p() { // from class: yg.h
                @Override // wb0.p
                public final Object call(Object obj) {
                    rx.c T;
                    T = y.T(account, type, (UnifiedUserService.Client) obj);
                    return T;
                }
            }).w5(bc0.c.a()).I3(tb0.a.a());
            final x00.l lVar2 = new x00.l() { // from class: yg.i
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 U;
                    U = y.U(y.this, (Boolean) obj);
                    return U;
                }
            };
            this.f100110a = I3.u5(new wb0.b() { // from class: yg.j
                @Override // wb0.b
                public final void call(Object obj) {
                    y.V(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: yg.k
                @Override // wb0.b
                public final void call(Object obj) {
                    y.W(y.this, (Throwable) obj);
                }
            });
        }
    }

    public final void X(@m80.k final String account) {
        kotlin.jvm.internal.g0.p(account, "account");
        qb0.h hVar = this.f100110a;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f100114e.postValue(Boolean.TRUE);
            rx.c I3 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").e(false)).b2(new wb0.p() { // from class: yg.a
                @Override // wb0.p
                public final Object call(Object obj) {
                    rx.c Y;
                    Y = y.Y(account, (UnifiedUserService.Client) obj);
                    return Y;
                }
            }).w5(bc0.c.a()).I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: yg.l
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 Z;
                    Z = y.Z(y.this, (Boolean) obj);
                    return Z;
                }
            };
            this.f100110a = I3.u5(new wb0.b() { // from class: yg.q
                @Override // wb0.b
                public final void call(Object obj) {
                    y.a0(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: yg.r
                @Override // wb0.b
                public final void call(Object obj) {
                    y.b0(y.this, (Throwable) obj);
                }
            });
        }
    }

    public final void c0(@m80.k final String account, @m80.k final String password, @m80.k final String code) {
        kotlin.jvm.internal.g0.p(account, "account");
        kotlin.jvm.internal.g0.p(password, "password");
        kotlin.jvm.internal.g0.p(code, "code");
        qb0.h hVar = this.f100113d;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f100114e.postValue(Boolean.TRUE);
            rx.c I3 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").e(false)).b2(new wb0.p() { // from class: yg.s
                @Override // wb0.p
                public final Object call(Object obj) {
                    rx.c d02;
                    d02 = y.d0(account, password, code, (UnifiedUserService.Client) obj);
                    return d02;
                }
            }).w5(bc0.c.a()).I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: yg.t
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 e02;
                    e02 = y.e0(y.this, (Boolean) obj);
                    return e02;
                }
            };
            this.f100113d = I3.u5(new wb0.b() { // from class: yg.u
                @Override // wb0.b
                public final void call(Object obj) {
                    y.f0(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: yg.v
                @Override // wb0.b
                public final void call(Object obj) {
                    y.g0(y.this, (Throwable) obj);
                }
            });
        }
    }

    public final void i0(@m80.k final String phone, @m80.k final String code) {
        kotlin.jvm.internal.g0.p(phone, "phone");
        kotlin.jvm.internal.g0.p(code, "code");
        qb0.h hVar = this.f100111b;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f100114e.postValue(Boolean.TRUE);
            rx.c I3 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").e(false)).b2(new wb0.p() { // from class: yg.m
                @Override // wb0.p
                public final Object call(Object obj) {
                    rx.c j02;
                    j02 = y.j0(phone, code, (UnifiedUserService.Client) obj);
                    return j02;
                }
            }).w5(bc0.c.a()).I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: yg.n
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 k02;
                    k02 = y.k0(y.this, (Boolean) obj);
                    return k02;
                }
            };
            this.f100111b = I3.u5(new wb0.b() { // from class: yg.o
                @Override // wb0.b
                public final void call(Object obj) {
                    y.m0(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: yg.p
                @Override // wb0.b
                public final void call(Object obj) {
                    y.n0(y.this, (Throwable) obj);
                }
            });
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f100110a;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        qb0.h hVar2 = this.f100111b;
        if (hVar2 != null) {
            hVar2.unsubscribe();
        }
        qb0.h hVar3 = this.f100112c;
        if (hVar3 != null) {
            hVar3.unsubscribe();
        }
        qb0.h hVar4 = this.f100113d;
        if (hVar4 != null) {
            hVar4.unsubscribe();
        }
    }

    public final void z(@m80.k final String phone, @m80.k final String code, @m80.l String str) {
        kotlin.jvm.internal.g0.p(phone, "phone");
        kotlin.jvm.internal.g0.p(code, "code");
        qb0.h hVar = this.f100111b;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f100114e.postValue(Boolean.TRUE);
            rx.c I3 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").g(str)).b2(new wb0.p() { // from class: yg.w
                @Override // wb0.p
                public final Object call(Object obj) {
                    rx.c A;
                    A = y.A(y.this, phone, code, (UnifiedUserService.Client) obj);
                    return A;
                }
            }).w5(bc0.c.a()).I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: yg.x
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 B;
                    B = y.B(y.this, (BindPhoneResult) obj);
                    return B;
                }
            };
            this.f100111b = I3.u5(new wb0.b() { // from class: yg.b
                @Override // wb0.b
                public final void call(Object obj) {
                    y.C(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: yg.c
                @Override // wb0.b
                public final void call(Object obj) {
                    y.D(y.this, (Throwable) obj);
                }
            });
        }
    }
}
