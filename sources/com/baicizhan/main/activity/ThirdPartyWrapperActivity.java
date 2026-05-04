package com.baicizhan.main.activity;

import android.content.Intent;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import c9.a;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.main.activity.ThirdPartyWrapperActivity;
import com.baicizhan.main.auth.VerificationType;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.unified_user_service.ThirdPartyLoginRequest;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.jiongji.andriod.card.R;
import gi.e;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.r;
import org.apache.thrift.transport.TTransportException;
import tf.j0;
import va.g;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class ThirdPartyWrapperActivity extends BaseAppCompatActivity {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f18215g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f18216h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final String f18217i = ThirdPartyWrapperActivity.class.getSimpleName();

    /* renamed from: j, reason: collision with root package name */
    public static final int f18218j = 1010;

    /* renamed from: b, reason: collision with root package name */
    @l
    public UserRecord f18220b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public UserLoginResult f18221c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public c f18222d;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ThriftRequest<UnifiedUserService.Client, g2> f18224f;

    /* renamed from: a, reason: collision with root package name */
    public int f18219a = -1;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f18223e = e0.c(new x00.a() { // from class: fd.j3
        @Override // x00.a
        public final Object invoke() {
            gi.g0 Z0;
            Z0 = ThirdPartyWrapperActivity.Z0(ThirdPartyWrapperActivity.this);
            return Z0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ThriftRequest<UnifiedUserService.Client, UserLoginResult> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserRecord f18225a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ThirdPartyUserInfo f18226b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final WeakReference<ThirdPartyWrapperActivity> f18227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k ThirdPartyWrapperActivity activity, @k UserRecord userRecord, @k ThirdPartyUserInfo thirdPartyUserInfo) {
            super("/rpc/unified_user_service");
            g0.p(activity, "activity");
            g0.p(userRecord, "userRecord");
            g0.p(thirdPartyUserInfo, "thirdPartyUserInfo");
            this.f18225a = userRecord;
            this.f18226b = thirdPartyUserInfo;
            this.f18227c = new WeakReference<>(activity);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserLoginResult doInBackground(@k UnifiedUserService.Client client) throws Exception {
            g0.p(client, "client");
            ThirdPartyWrapperActivity thirdPartyWrapperActivity = this.f18227c.get();
            if (thirdPartyWrapperActivity == null) {
                return null;
            }
            qb.c.b(ThirdPartyWrapperActivity.f18217i, "third party login " + this.f18226b, new Object[0]);
            if (this.f18226b.loginType != this.f18225a.getLoginType()) {
                throw new SchedulePrepareObservables.PrepareException(6, "Unavailable third-party info " + this.f18226b);
            }
            ThirdPartyLoginRequest thirdPartyLoginRequest = new ThirdPartyLoginRequest();
            ThirdPartyUserInfo thirdPartyUserInfo = this.f18226b;
            thirdPartyLoginRequest.provider = thirdPartyUserInfo.provider;
            thirdPartyLoginRequest.uid = thirdPartyUserInfo.uid;
            thirdPartyLoginRequest.unionid = thirdPartyUserInfo.unionid;
            thirdPartyLoginRequest.openid = thirdPartyUserInfo.openid;
            thirdPartyLoginRequest.nickname = thirdPartyUserInfo.nickName;
            thirdPartyLoginRequest.image_url = thirdPartyUserInfo.imageUrl;
            thirdPartyLoginRequest.gender = thirdPartyUserInfo.gender;
            thirdPartyLoginRequest.api_token = thirdPartyUserInfo.atoken;
            thirdPartyLoginRequest.token_expire = String.valueOf(thirdPartyUserInfo.expireAt);
            thirdPartyLoginRequest.device = DeviceUtil.getUniqueID(thirdPartyWrapperActivity);
            thirdPartyLoginRequest.code = this.f18226b.authorizationCode;
            UserLoginResult third_party_login = client.third_party_login(thirdPartyLoginRequest);
            g0.o(third_party_login, "third_party_login(...)");
            qb.c.b(ThirdPartyWrapperActivity.f18217i, "force bind value: " + third_party_login.force_bind_phone, new Object[0]);
            if (TextUtils.isEmpty(this.f18225a.getNickName())) {
                this.f18225a.setNickName(this.f18226b.nickName);
            }
            return third_party_login;
        }

        @k
        public final ThirdPartyUserInfo b() {
            return this.f18226b;
        }

        @k
        public final UserRecord c() {
            return this.f18225a;
        }

        @k
        public final WeakReference<ThirdPartyWrapperActivity> d() {
            return this.f18227c;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResult(@l UserLoginResult userLoginResult) {
            String str;
            ThirdPartyWrapperActivity thirdPartyWrapperActivity = this.f18227c.get();
            if (thirdPartyWrapperActivity == null) {
                return;
            }
            if (userLoginResult == null) {
                onError(new Exception(thirdPartyWrapperActivity.getString(R.string.third_party_login_unknown_error)));
                return;
            }
            thirdPartyWrapperActivity.f18221c = userLoginResult;
            if (userLoginResult.force_bind_phone == 0 || !((str = userLoginResult.phone) == null || str.length() == 0)) {
                thirdPartyWrapperActivity.S0(userLoginResult);
                return;
            }
            com.baicizhan.main.auth.onekey.a aVar = com.baicizhan.main.auth.onekey.a.f19954a;
            aVar.p(thirdPartyWrapperActivity, VerificationType.BIND_PHONE_DIRECTLY_AUTO, userLoginResult, 1010);
            r.g().n(userLoginResult.access_token);
            boolean i11 = aVar.i();
            j0 e11 = aVar.e();
            aVar.l(ma.a.f72793m3, i11, e11 != null ? e11.i() : null);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(@k Exception exception) {
            g0.p(exception, "exception");
            ThirdPartyWrapperActivity thirdPartyWrapperActivity = this.f18227c.get();
            if (thirdPartyWrapperActivity == null) {
                return;
            }
            LoadingDialogActivity.setLoading$default(thirdPartyWrapperActivity, false, 0L, null, 6, null);
            thirdPartyWrapperActivity.W0(exception);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c implements a.InterfaceC0141a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f18228c = 8;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WeakReference<ThirdPartyWrapperActivity> f18229a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18230b;

        public c(@k ThirdPartyWrapperActivity activity) {
            g0.p(activity, "activity");
            this.f18229a = new WeakReference<>(activity);
        }

        public final boolean a() {
            return this.f18230b;
        }

        @Override // c9.a.InterfaceC0141a
        public void onCancel() {
            ThirdPartyWrapperActivity thirdPartyWrapperActivity = this.f18229a.get();
            if (thirdPartyWrapperActivity == null) {
                return;
            }
            this.f18230b = true;
            LoadingDialogActivity.setLoading$default(thirdPartyWrapperActivity, false, 0L, null, 6, null);
            g.g(R.string.third_party_login_toast_canceled, 0);
            thirdPartyWrapperActivity.U0();
        }

        @Override // c9.a.InterfaceC0141a
        public void onComplete(@k ThirdPartyUserInfo thirdPartyUserInfo) {
            g0.p(thirdPartyUserInfo, "thirdPartyUserInfo");
            ThirdPartyWrapperActivity thirdPartyWrapperActivity = this.f18229a.get();
            if (thirdPartyWrapperActivity == null) {
                return;
            }
            this.f18230b = true;
            qb.c.i(ThirdPartyWrapperActivity.f18217i, "third party auth success: " + thirdPartyUserInfo, new Object[0]);
            if (!thirdPartyWrapperActivity.isLoadingShowing()) {
                LoadingDialogActivity.setLoading$default(thirdPartyWrapperActivity, true, 0L, null, 6, null);
            }
            UserRecord thirdPartyInfoToUserRecord = ThirdPartyUserInfo.thirdPartyInfoToUserRecord(thirdPartyUserInfo);
            g0.m(thirdPartyInfoToUserRecord);
            thirdPartyWrapperActivity.X0(thirdPartyInfoToUserRecord, thirdPartyUserInfo);
        }

        @Override // c9.a.InterfaceC0141a
        public void onError(@k Throwable throwable) {
            g0.p(throwable, "throwable");
            ThirdPartyWrapperActivity thirdPartyWrapperActivity = this.f18229a.get();
            if (thirdPartyWrapperActivity == null) {
                return;
            }
            qb.c.c(ThirdPartyWrapperActivity.f18217i, "third party auth failed: ", throwable);
            this.f18230b = true;
            LoadingDialogActivity.setLoading$default(thirdPartyWrapperActivity, false, 0L, null, 6, null);
            ThirdPartyUserInfo.clearThirdPartyLoginCache(thirdPartyWrapperActivity);
            thirdPartyWrapperActivity.U0();
            g.g(R.string.third_party_login_toast_failed, 0);
        }

        @Override // c9.a.InterfaceC0141a
        public void onStart() {
            ThirdPartyWrapperActivity thirdPartyWrapperActivity = this.f18229a.get();
            if (thirdPartyWrapperActivity == null) {
                return;
            }
            qb.c.b(ThirdPartyWrapperActivity.f18217i, "third auth: onStart", new Object[0]);
            this.f18230b = false;
            LoadingDialogActivity.setLoading$default(thirdPartyWrapperActivity, true, 0L, null, 6, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends ThriftRequest<UnifiedUserService.Client, g2> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserLoginResult f18232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UserLoginResult userLoginResult) {
            super("/rpc/unified_user_service");
            this.f18232b = userLoginResult;
        }

        public void a(UnifiedUserService.Client client) {
            ThirdPartyWrapperActivity thirdPartyWrapperActivity = ThirdPartyWrapperActivity.this;
            e.n(thirdPartyWrapperActivity, this.f18232b, thirdPartyWrapperActivity.Q0(), ThirdPartyWrapperActivity.this.f18220b);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(g2 g2Var) {
            LoadingDialogActivity.setLoading$default(ThirdPartyWrapperActivity.this, false, 0L, null, 6, null);
            e.o(ThirdPartyWrapperActivity.this, true);
            ThirdPartyWrapperActivity.this.finish();
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public /* bridge */ /* synthetic */ g2 doInBackground(UnifiedUserService.Client client) {
            a(client);
            return g2.f100423a;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exc) {
            LoadingDialogActivity.setLoading$default(ThirdPartyWrapperActivity.this, false, 0L, null, 6, null);
            ThirdPartyWrapperActivity.this.W0(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(UserLoginResult userLoginResult) {
        if (userLoginResult == null) {
            LoadingDialogActivity.setLoading$default(this, false, 0L, null, 6, null);
            return;
        }
        ThriftRequest<UnifiedUserService.Client, g2> thriftRequest = this.f18224f;
        if (thriftRequest != null) {
            thriftRequest.cancel();
        }
        com.baicizhan.client.business.thrift.r b11 = com.baicizhan.client.business.thrift.c.b();
        d dVar = new d(userLoginResult);
        this.f18224f = dVar;
        b11.a(dVar);
    }

    public static final void T0(ThirdPartyWrapperActivity thirdPartyWrapperActivity) {
        qb.c.q(f18217i, "direct auto binding failed", new Object[0]);
        ThirdPartyUserInfo.clearThirdPartyLoginCache(thirdPartyWrapperActivity);
        thirdPartyWrapperActivity.U0();
        e.t(thirdPartyWrapperActivity);
    }

    public static final void V0(ThirdPartyWrapperActivity thirdPartyWrapperActivity) {
        String str = f18217i;
        c cVar = thirdPartyWrapperActivity.f18222d;
        qb.c.b(str, "onResume: delay: " + (cVar != null ? Boolean.valueOf(cVar.a()) : null), new Object[0]);
        c cVar2 = thirdPartyWrapperActivity.f18222d;
        if (cVar2 == null || cVar2.a()) {
            return;
        }
        LoadingDialogActivity.setLoading$default(thirdPartyWrapperActivity, false, 0L, null, 6, null);
    }

    public static final gi.g0 Z0(ThirdPartyWrapperActivity thirdPartyWrapperActivity) {
        return new gi.g0(thirdPartyWrapperActivity);
    }

    @k
    public final c P0(int i11) {
        a1(i11);
        c cVar = new c(this);
        this.f18222d = cVar;
        return cVar;
    }

    public final int Q0() {
        int i11 = this.f18219a;
        if (i11 == 4 || i11 == 5 || i11 == 1 || i11 == 7) {
            return i11;
        }
        throw new RuntimeException("Unsupported login type: " + this.f18219a);
    }

    @k
    public final gi.g0 R0() {
        return (gi.g0) this.f18223e.getValue();
    }

    public final void W0(Exception exc) {
        qb.c.c(f18217i, "onServerError ", exc);
        if (exc instanceof LogicException) {
            g.i(((LogicException) exc).getLocalizedMessage(), 0);
        } else if (exc instanceof TTransportException) {
            g.g(R.string.network_error_retry_later, 0);
        } else {
            g.g(R.string.verification_toast_login_failed, 0);
        }
        R0().b();
        U0();
    }

    public final void X0(@k UserRecord userRecord, @k ThirdPartyUserInfo thirdPartyUserInfo) {
        g0.p(userRecord, "userRecord");
        g0.p(thirdPartyUserInfo, "thirdPartyUserInfo");
        this.f18220b = userRecord;
        com.baicizhan.client.business.thrift.r b11 = com.baicizhan.client.business.thrift.c.b();
        b bVar = new b(this, userRecord, thirdPartyUserInfo);
        bVar.setTag(f18217i);
        b11.a(bVar);
    }

    public final void Y0() {
        this.f18221c = null;
    }

    public final void a1(int i11) {
        if (i11 >= 0) {
            this.f18219a = i11;
            return;
        }
        qb.c.i(f18217i, "Login type " + i11 + " not supported", new Object[0]);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 != 1010) {
            c9.a.l(this, i11, i12, intent);
            return;
        }
        LoadingDialogActivity.setLoading$default(this, false, 0L, null, 6, null);
        if (i12 != -1 || isFinishing()) {
            T0(this);
            return;
        }
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("user_login_result") : null;
        UserLoginResult userLoginResult = serializableExtra instanceof UserLoginResult ? (UserLoginResult) serializableExtra : null;
        if (userLoginResult == null) {
            userLoginResult = this.f18221c;
        }
        if (userLoginResult != null) {
            S0(userLoginResult);
        } else {
            T0(this);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (isLoadingShowing()) {
            this.mHandler.postDelayed(new Runnable() { // from class: fd.k3
                @Override // java.lang.Runnable
                public final void run() {
                    ThirdPartyWrapperActivity.V0(ThirdPartyWrapperActivity.this);
                }
            }, 3000L);
        }
    }

    public void U0() {
    }
}
