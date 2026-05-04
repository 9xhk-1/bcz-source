package gi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.ActivityLifeController;
import com.baicizhan.client.business.util.AuthCallback;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.SpKeys;
import com.baicizhan.client.business.util.StoreEntryJumper;
import com.baicizhan.client.business.webview.CookieConfig;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.StartupNavigationType;
import com.baicizhan.main.activity.idenity.UserGradleActivity;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import com.baicizhan.main.home.experiment.q0;
import com.baicizhan.main.home.player.HomeActivity;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.baicizhan.main.temporary.NewUserGuideOrderMgr;
import com.baicizhan.online.structs.BELogicException;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.unified_user_service.BczLoginRequest;
import com.baicizhan.online.unified_user_service.ThirdPartyLoginRequest;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53742a = "CommonUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final long f53743b = 100;

    /* renamed from: c, reason: collision with root package name */
    public static final long f53744c = 104857600;

    /* renamed from: d, reason: collision with root package name */
    public static final long f53745d = 300;

    /* renamed from: e, reason: collision with root package name */
    public static final long f53746e = 314572800;

    /* renamed from: f, reason: collision with root package name */
    public static ThriftRequest<UnifiedUserService.Client, UserRecord> f53747f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final int f53748g = 12;

    /* renamed from: h, reason: collision with root package name */
    public static final int f53749h = 9;

    /* renamed from: i, reason: collision with root package name */
    public static String[] f53750i = {"com.android.vending", "com.sec.android.app.samsungapps"};

    /* renamed from: j, reason: collision with root package name */
    public static final String f53751j = "%d单词";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Boolean> {
        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(e.f53742a, "", e11);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Boolean> {
        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(e.f53742a, "", e11);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends ThriftRequest<UnifiedUserService.Client, UserRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f53752a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserRecord f53753b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f53754c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AuthCallback f53755d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String domain, final Context val$appContext, final UserRecord val$user, final int val$isBind, final AuthCallback val$authCallback) {
            super(domain);
            this.f53752a = val$appContext;
            this.f53753b = val$user;
            this.f53754c = val$isBind;
            this.f53755d = val$authCallback;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserRecord doInBackground(UnifiedUserService.Client client) throws Exception {
            e.k(this.f53752a, client, this.f53753b, this.f53754c);
            return this.f53753b;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(UserRecord result) {
            this.f53755d.postSuccess(result);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            this.f53755d.postError(exception);
        }
    }

    public static int a(File dir) {
        int i11 = 0;
        if (dir != null && dir.isDirectory()) {
            try {
                File[] listFiles = dir.listFiles();
                int length = listFiles.length;
                int i12 = 0;
                while (i11 < length) {
                    try {
                        File file = listFiles[i11];
                        if (file.isDirectory()) {
                            i12 += a(file);
                        }
                        if (file.delete()) {
                            i12++;
                        }
                        i11++;
                    } catch (Exception e11) {
                        e = e11;
                        i11 = i12;
                        e.printStackTrace();
                        return i11;
                    }
                }
                return i12;
            } catch (Exception e12) {
                e = e12;
            }
        }
        return i11;
    }

    public static Set<Integer> b(Collection<Integer> ids) {
        HashSet hashSet = new HashSet();
        for (Integer num : ids) {
            int intValue = num.intValue();
            hashSet.add(num);
            for (int i11 : q9.x.r().E(intValue)) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        return hashSet;
    }

    public static va.f c(Context context) {
        va.f fVar = new va.f(context);
        fVar.setCancelable(false);
        return fVar;
    }

    public static boolean d(Context context) {
        if (rb.d.f(context)) {
            return true;
        }
        va.g.i("离线不支持该功能，请联网后再使用", 0);
        return false;
    }

    public static String e(int wordCount) {
        return String.format(Locale.CHINA, f53751j, Integer.valueOf(wordCount));
    }

    public static String f(String md5) {
        return md5.substring(12, 21).toUpperCase(Locale.US);
    }

    public static String g(Context context, Throwable throwable) {
        Throwable cause = throwable.getCause();
        if (cause != null) {
            throwable = cause;
        }
        if ((throwable instanceof BELogicException) || (throwable instanceof LogicException)) {
            return throwable.getMessage();
        }
        if ((throwable instanceof TTransportException) || (throwable instanceof UnknownHostException)) {
            return context.getString(R.string.network_error_retry_later);
        }
        if (throwable instanceof TApplicationException) {
            return throwable.getMessage();
        }
        qb.c.c(f53742a, "", throwable);
        return throwable.getMessage();
    }

    public static long h(String version) {
        String[] split = version.split("\\.");
        if (split.length < 3) {
            throw new IllegalStateException("Unsupported version name format! [" + version + "]");
        }
        if (split[0].length() <= 3 && split[1].length() <= 3 && split[2].length() <= 3) {
            return (Long.parseLong(split[0]) * 1000000) + (Long.parseLong(split[1]) * 1000) + Long.parseLong(split[2]);
        }
        throw new IllegalStateException("Split version too long! [" + version + "]");
    }

    public static void i(FragmentActivity activity) {
        try {
            activity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", activity.getPackageName(), null)));
        } catch (Exception e11) {
            qb.c.c(f53742a, "", e11);
            va.g.j(e11, 0);
        }
    }

    public static boolean j() {
        return q9.x.r().p() != null;
    }

    public static UserLoginResult k(Context context, UnifiedUserService.Client client, UserRecord user, int isBind) throws Exception {
        return l(context, client, user, isBind, null);
    }

    public static UserLoginResult l(Context context, UnifiedUserService.Client client, UserRecord user, int isBind, ThirdPartyUserInfo thirdPartyUserInfo) throws Exception {
        UserLoginResult bcz_login;
        try {
            int loginType = user.getLoginType();
            boolean z11 = true;
            switch (loginType) {
                case 0:
                case 3:
                case 6:
                    String f11 = f(user.getPasswordMD5());
                    qb.c.b(f53742a, "email/phone login " + user.getUser() + ", digest " + f11, new Object[0]);
                    BczLoginRequest bczLoginRequest = new BczLoginRequest();
                    bczLoginRequest.account = user.getUser();
                    bczLoginRequest.password = f11;
                    bczLoginRequest.device = DeviceUtil.getUniqueID(context);
                    bcz_login = client.bcz_login(bczLoginRequest);
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                    qb.c.b(f53742a, "third party login " + thirdPartyUserInfo, new Object[0]);
                    if (thirdPartyUserInfo != null && thirdPartyUserInfo.loginType == loginType) {
                        ThirdPartyLoginRequest thirdPartyLoginRequest = new ThirdPartyLoginRequest();
                        thirdPartyLoginRequest.provider = thirdPartyUserInfo.provider;
                        thirdPartyLoginRequest.uid = thirdPartyUserInfo.uid;
                        thirdPartyLoginRequest.unionid = thirdPartyUserInfo.unionid;
                        thirdPartyLoginRequest.openid = thirdPartyUserInfo.openid;
                        thirdPartyLoginRequest.nickname = thirdPartyUserInfo.nickName;
                        thirdPartyLoginRequest.image_url = thirdPartyUserInfo.imageUrl;
                        thirdPartyLoginRequest.gender = thirdPartyUserInfo.gender;
                        thirdPartyLoginRequest.api_token = thirdPartyUserInfo.atoken;
                        thirdPartyLoginRequest.token_expire = String.valueOf(thirdPartyUserInfo.expireAt);
                        thirdPartyLoginRequest.device = DeviceUtil.getUniqueID(context);
                        bcz_login = isBind == 1 ? client.third_party_bind_try_user(thirdPartyLoginRequest) : client.third_party_login(thirdPartyLoginRequest);
                        if (TextUtils.isEmpty(user.getNickName())) {
                            user.setNickName(thirdPartyUserInfo.nickName);
                            break;
                        }
                    } else {
                        throw new SchedulePrepareObservables.PrepareException(6, "Unavailable third-party info " + thirdPartyUserInfo);
                    }
                    break;
                default:
                    throw new Exception("Invalid login type");
            }
            user.setToken(bcz_login.getAccess_token());
            user.setIsNewUser(bcz_login.getIs_new_user() == 1);
            user.setPublicKey(bcz_login.getPublic_key());
            user.setEmail(bcz_login.getEmail());
            user.setPhone(bcz_login.getPhone());
            user.setUniqueId((int) bcz_login.getUnique_id());
            user.setLastDevice(bcz_login.getLast_device().replace(" ", ""));
            if (bcz_login.getRole() != null) {
                user.setRole(new UserRecord.Role(bcz_login.getRole().role_up, bcz_login.getRole().grade));
            }
            UserRecord p11 = q9.x.r().p();
            if (p11 == null || TextUtils.equals(p11.getToken(), user.getToken()) || TextUtils.equals(p11.getEmail(), user.getEmail())) {
                i9.m.a(context);
            } else {
                qb.c.i(f53742a, "clearPersonalData [email-old, email-new] [%s, %s] [token-old, token-new] [%s, %s]", p11.getEmail(), user.getEmail(), p11.getToken(), user.getToken());
                i9.a.b(context);
            }
            user.setSaveStatus(1);
            user.setLastLoginTime(System.currentTimeMillis());
            user.setGameBeta(bcz_login.game_mode);
            i9.m.f(context, user);
            qb.c.b(f53742a, "login success: id = " + user.getUniqueId() + ", new = " + user.getIsNewUser() + ", game = " + user.getGameBeta(), new Object[0]);
            if (user.getIsNewUser()) {
                v.e(1);
                b0.a();
                NewUserGuideOrderMgr.a().c();
            } else if (!b0.e()) {
                b0.c();
                v.a(8192);
            }
            i9.f.k(context, i9.f.R, user.getUniqueId());
            i9.f.n(context, i9.f.L, user.getEmail(), false);
            i9.f.n(context, i9.f.M, user.getPublicKey(), false);
            q9.x.r().q0(user);
            th.e.i(context).r5(new a());
            String access_token = bcz_login.getAccess_token();
            long unique_id = bcz_login.getUnique_id();
            if (bcz_login.getIs_new_user() != 1) {
                z11 = false;
            }
            dd.h.c(context, access_token, unique_id, z11);
            qh.b.b(context, user.getUniqueId());
            return bcz_login;
        } catch (Exception e11) {
            qb.c.b(f53742a, "login exception" + e11.getMessage(), new Object[0]);
            if (!(e11 instanceof TTransportException) && !(e11 instanceof SocketTimeoutException)) {
                qb.c.c(f53742a, "may be need clearThirdPartyLoginCache, error: ", e11);
            }
            throw e11;
        }
    }

    public static void m(Context context, final UserRecord user, final AuthCallback<UserRecord> authCallback, final int isBind) {
        Context applicationContext = context.getApplicationContext();
        ThriftRequest<UnifiedUserService.Client, UserRecord> thriftRequest = f53747f;
        if (thriftRequest != null) {
            thriftRequest.cancel();
        }
        f53747f = new c("/rpc/unified_user_service", applicationContext, user, isBind, authCallback);
        com.baicizhan.client.business.thrift.c.b().a(f53747f);
    }

    @WorkerThread
    public static void n(Context context, UserLoginResult loginResult, int loginType, UserRecord record) {
        qb.c.b(f53742a, "login: type = " + loginType, new Object[0]);
        a(context.getCacheDir());
        UserRecord userRecord = record == null ? new UserRecord() : record;
        if (record == null) {
            userRecord.setLoginType(loginType);
        }
        if (loginType == 6) {
            userRecord.setUser(loginResult.phone);
        }
        userRecord.setToken(loginResult.getAccess_token());
        userRecord.setIsNewUser(loginResult.getIs_new_user() == 1);
        userRecord.setPublicKey(loginResult.getPublic_key());
        userRecord.setEmail(loginResult.getEmail());
        userRecord.setPhone(loginResult.getPhone());
        userRecord.setUniqueId((int) loginResult.getUnique_id());
        userRecord.setLastDevice(loginResult.getLast_device().replace(" ", ""));
        userRecord.setPasswordMD5("");
        userRecord.setGameBeta(loginResult.game_mode);
        if (loginResult.getRole() != null) {
            userRecord.setRole(new UserRecord.Role(loginResult.getRole().role_up, loginResult.getRole().grade));
        }
        UserRecord p11 = q9.x.r().p();
        if (p11 == null || TextUtils.equals(p11.getToken(), userRecord.getToken()) || TextUtils.equals(p11.getEmail(), userRecord.getEmail())) {
            i9.m.a(context);
        } else {
            qb.c.i(f53742a, "clearPersonalData [email-old, email-new] [%s, %s] [token-old, token-new] [%s, %s]", p11.getEmail(), userRecord.getEmail(), p11.getToken(), userRecord.getToken());
            i9.a.b(context);
        }
        userRecord.setSaveStatus(1);
        userRecord.setLastLoginTime(System.currentTimeMillis());
        i9.m.f(context, userRecord);
        qb.c.b(f53742a, "login success: id = " + userRecord.getUniqueId() + ", new = " + userRecord.getIsNewUser(), new Object[0]);
        if (userRecord.getIsNewUser()) {
            v.e(1);
            b0.a();
            NewUserGuideOrderMgr.a().c();
        } else if (!b0.e()) {
            b0.c();
            v.a(8192);
        }
        i9.f.k(context, i9.f.R, userRecord.getUniqueId());
        i9.f.n(context, i9.f.L, userRecord.getEmail(), false);
        i9.f.n(context, i9.f.M, userRecord.getPublicKey(), false);
        q9.x.r().q0(userRecord);
        th.e.i(context).r5(new b());
        dd.h.c(context, loginResult.getAccess_token(), loginResult.getUnique_id(), loginResult.getIs_new_user() == 1);
        qh.b.b(context, userRecord.getUniqueId());
    }

    public static void o(Context context, boolean hasLogin) {
        p(context, hasLogin, null, null);
        HashMap hashMap = new HashMap();
        hashMap.put("device_id", DeviceUtil.getUniqueID(context));
        qb.c.i(f53742a, "TYPE %d", Integer.valueOf(q9.x.r().p().getLoginType()));
        try {
            hashMap.put(ma.b.f72911h1, ma.v.f73052w[q9.x.r().p().getLoginType()]);
        } catch (Exception e11) {
            qb.c.h(f53742a, "", e11);
        }
        ma.l.e(ma.t.f73003b, ma.a.f72878y4, hashMap);
    }

    public static void p(Context context, boolean hasLogin, StartupNavigationType type, String pendingIntent) {
        UserRecord p11 = q9.x.r().p();
        if (p11 == null) {
            throw new IllegalStateException("loginJump with null user");
        }
        if (p11.getIsNewUser()) {
            hi.f.f();
        }
        dd.h.c(context, p11.getToken(), p11.getUniqueId(), p11.getIsNewUser());
        nc.b.b().j(SpKeys.VERIFICATION_LOGIN_BINDING_UNDONE, false);
        q0 q0Var = q0.f21394a;
        if (q0Var.d()) {
            UserGradleActivity.o1(context, 0);
        } else if (q0Var.b()) {
            context.startActivity(new Intent(context, (Class<?>) HomeActivity.class));
        } else if (p11.getIsNewUser() && p11.getRole() == null) {
            UserGradleActivity.o1(context, 0);
        } else {
            Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
            intent.putExtra(MainTabActivity.P, hasLogin);
            intent.putExtra(MainTabActivity.R, pendingIntent);
            intent.putExtra(MainTabActivity.T, type);
            context.startActivity(intent);
        }
        ActivityLifeController.get().finishAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(final Context context) {
        q9.x.r().e();
        tj.z.g().f();
        StoreEntryJumper.getInstance().clear();
        ma.r.g().f();
        com.baicizhan.client.business.thrift.c.b().m("access_token");
        CookieConfig.removeCookie(context);
        ThirdPartyUserInfo.clearThirdPartyLoginCache(context);
        i9.a.b(context);
        dg.a.a(context);
        ia.a.l(ia.a.f60467r, 0L);
        b0.i();
        i9.f.j(context, i9.f.f60361a0, true);
        qh.b.g(context);
        r9.u.f().e();
        AccountBindingMgr.inst().clear();
        NewUserGuideOrderMgr.a().b();
        new cf.c().c();
        com.baicizhan.main.activity.daka.datasource.k.c();
        y9.e.f().b();
        th.k.e();
        fh.g.f51865a.m();
        zg.b bVar = zg.b.f102640a;
        bVar.d(bVar.a());
        if (context instanceof LifecycleOwner) {
            hj.p.g((LifecycleOwner) context, context);
        } else {
            qb.c.d(f53742a, "not lifecycle", new Object[0]);
        }
        ((q9.w) qu.e.d(pb.a.a(), q9.w.class)).h().e();
        ((q9.w) qu.e.d(pb.a.a(), q9.w.class)).c().b();
        ((q9.w) qu.e.d(pb.a.a(), q9.w.class)).k().b();
        dd.h.d(context);
        qb.c.i(f53742a, "LOGOUT", new Object[0]);
    }

    public static boolean r(IAudioPlayer player, String path, IAudioPlayer.b listener) {
        return s(player, path, listener, null);
    }

    public static boolean s(IAudioPlayer player, String path, IAudioPlayer.b stateL, IAudioPlayer.a errL) {
        File baicizhanResourceFile;
        if (player == null || (baicizhanResourceFile = PathUtil.getBaicizhanResourceFile(path)) == null || !baicizhanResourceFile.exists()) {
            return false;
        }
        player.c(baicizhanResourceFile.getAbsolutePath());
        player.f(stateL);
        player.j(errL);
        return true;
    }

    public static void t(Context context) {
        ma.r.g().f();
        q9.x.r().e();
        com.baicizhan.client.business.thrift.c.b().m("access_token");
        i9.a.b(context);
        r9.u.f().e();
        qb.c.i(f53742a, "resetLogin", new Object[0]);
    }

    public static void u(Context context) {
        va.g.g(R.string.study_data_error, 0);
    }

    public static void v(Context context, Throwable throwable) {
        va.g.i(va.g.d(throwable), 0);
    }
}
