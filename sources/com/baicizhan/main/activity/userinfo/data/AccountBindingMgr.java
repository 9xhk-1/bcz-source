package com.baicizhan.main.activity.userinfo.data;

import android.app.Activity;
import android.content.Context;
import c9.a;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.online.unified_user_service.BczLoginRequest;
import com.baicizhan.online.unified_user_service.ThirdPartyLoginRequest;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserBindInfo;
import i9.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import org.apache.thrift.TException;
import q9.x;
import wb0.p;
import wb0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AccountBindingMgr implements NoProguard {
    private static final String TAG = "AccountBindingMgr";
    private static AccountBindingMgr msInstance;
    private Map<String, BindInfo> mCache = new ConcurrentHashMap();
    private volatile boolean mLoaded = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AuthExcetption extends RuntimeException {
        public AuthExcetption(String msg) {
            super(msg);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BindInfo implements NoProguard {
        public String nickname;
        public String openid;
        public String provider;
        public String unionid;

        public static BindInfo fromLoginInfo(String provider, String nickname, String unionid, String openId) {
            BindInfo bindInfo = new BindInfo();
            bindInfo.provider = provider;
            bindInfo.openid = openId;
            bindInfo.nickname = nickname;
            bindInfo.unionid = unionid;
            return bindInfo;
        }

        public static BindInfo fromUserBindInfo(UserBindInfo info) {
            BindInfo bindInfo = new BindInfo();
            bindInfo.provider = info.provider;
            bindInfo.openid = info.openid;
            bindInfo.nickname = info.nickname;
            bindInfo.unionid = info.unionid;
            return bindInfo;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<UnifiedUserService.Client, rx.c<Map<String, BindInfo>>> {
        public a() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Map<String, BindInfo>> call(UnifiedUserService.Client client) {
            HashMap hashMap = new HashMap();
            try {
                for (UserBindInfo userBindInfo : client.get_bind_info()) {
                    AccountBindingMgr.this.mCache.put(userBindInfo.provider, BindInfo.fromUserBindInfo(userBindInfo));
                    hashMap.put(userBindInfo.provider, BindInfo.fromUserBindInfo(userBindInfo));
                }
                AccountBindingMgr.this.mLoaded = true;
                return rx.c.M2(hashMap);
            } catch (Exception e11) {
                AccountBindingMgr.this.mLoaded = false;
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<UnifiedUserService.Client, rx.c<Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserRecord f19865a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f19866b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f19867c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f19868d;

        public b(final UserRecord val$userRecord, final String val$phone, final String val$code, final Context val$context) {
            this.f19865a = val$userRecord;
            this.f19866b = val$phone;
            this.f19867c = val$code;
            this.f19868d = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Boolean> call(UnifiedUserService.Client client) {
            try {
                if (this.f19865a.getLoginType() == 3) {
                    BczLoginRequest bczLoginRequest = new BczLoginRequest();
                    bczLoginRequest.account = this.f19866b;
                    bczLoginRequest.password = this.f19865a.getPasswordMD5();
                    bczLoginRequest.code = this.f19867c;
                    client.bcz_bind_try_user(bczLoginRequest);
                    this.f19865a.setLoginType(6);
                    this.f19865a.setNickName(this.f19866b);
                    this.f19865a.setUser(this.f19866b);
                } else if (this.f19865a.getLoginType() == 0) {
                    client.bind_phone_v2(this.f19866b, this.f19867c);
                } else {
                    client.bind_phone(this.f19866b, this.f19867c, this.f19865a.getPasswordMD5());
                }
                m.f(this.f19868d, this.f19865a);
                AccountBindingMgr.this.mCache.put("phone", BindInfo.fromLoginInfo("phone", "", this.f19866b, ""));
                m.c(this.f19868d);
                return rx.c.M2(Boolean.TRUE);
            } catch (Exception e11) {
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<UnifiedUserService.Client, rx.c<Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19870a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f19871b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserRecord f19872c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f19873d;

        public c(final String val$phone, final String val$code, final UserRecord val$userRecord, final Context val$context) {
            this.f19870a = val$phone;
            this.f19871b = val$code;
            this.f19872c = val$userRecord;
            this.f19873d = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Boolean> call(UnifiedUserService.Client client) {
            try {
                client.rebind_phone(((BindInfo) AccountBindingMgr.this.mCache.get("phone")).unionid, this.f19870a, this.f19871b, this.f19872c.getPasswordMD5());
                this.f19872c.setPhone(this.f19870a);
                if (this.f19872c.getLoginType() == 6) {
                    this.f19872c.setUser(this.f19870a);
                }
                m.f(this.f19873d, this.f19872c);
                AccountBindingMgr.this.mCache.put("phone", BindInfo.fromLoginInfo("phone", "", this.f19870a, ""));
                return rx.c.M2(Boolean.TRUE);
            } catch (Exception e11) {
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Callable<ThirdPartyUserInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19875a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f19876b;

        public d(final String val$provider, final Activity val$activity) {
            this.f19875a = val$provider;
            this.f19876b = val$activity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ThirdPartyUserInfo call() throws Exception {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            h hVar = AccountBindingMgr.this.new h(countDownLatch);
            if ("qq".equals(this.f19875a)) {
                c9.a.h(this.f19876b, hVar);
            } else {
                if (!"weixin".equals(this.f19875a)) {
                    throw new AuthExcetption("error " + this.f19875a);
                }
                c9.a.j(this.f19876b, hVar);
            }
            countDownLatch.await();
            ThirdPartyUserInfo thirdPartyUserInfo = hVar.f19888b;
            if (thirdPartyUserInfo != null) {
                return thirdPartyUserInfo;
            }
            throw new AuthExcetption(hVar.f19889c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements p<UnifiedUserService.Client, rx.c<Void>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19878a;

        public e(final String val$provider) {
            this.f19878a = val$provider;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Void> call(UnifiedUserService.Client client) {
            try {
                BindInfo bindInfo = (BindInfo) AccountBindingMgr.this.mCache.get(this.f19878a);
                client.unbind_third_party(this.f19878a, bindInfo.openid, bindInfo.unionid);
                AccountBindingMgr.this.mCache.remove(this.f19878a);
                return rx.c.M2(null);
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements q<ThirdPartyUserInfo, UnifiedUserService.Client, Void> {

        /* renamed from: a, reason: collision with root package name */
        public String f19880a;

        public f(String provider) {
            this.f19880a = provider;
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(ThirdPartyUserInfo thirdPartyUserInfo, UnifiedUserService.Client client) {
            try {
                ThirdPartyLoginRequest thirdPartyLoginRequest = new ThirdPartyLoginRequest();
                thirdPartyLoginRequest.provider = this.f19880a;
                thirdPartyLoginRequest.nickname = thirdPartyUserInfo.nickName;
                thirdPartyLoginRequest.image_url = thirdPartyUserInfo.imageUrl;
                thirdPartyLoginRequest.gender = thirdPartyUserInfo.gender;
                thirdPartyLoginRequest.unionid = thirdPartyUserInfo.unionid;
                thirdPartyLoginRequest.openid = thirdPartyUserInfo.openid;
                client.third_party_bind_try_user(thirdPartyLoginRequest);
                Map map = AccountBindingMgr.this.mCache;
                String str = this.f19880a;
                map.put(str, BindInfo.fromLoginInfo(str, thirdPartyLoginRequest.nickname, thirdPartyLoginRequest.unionid, thirdPartyLoginRequest.openid));
                UserRecord p11 = x.r().p();
                if (p11 == null || p11.getLoginType() != 3) {
                    return null;
                }
                p11.setNickName(thirdPartyUserInfo.nickName);
                p11.setThridSex(thirdPartyUserInfo.gender);
                p11.setLoginType("weixin".equals(this.f19880a) ? 4 : 5);
                m.f(pb.a.a(), p11);
                return null;
            } catch (TException e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final String f19882a = "email";

        /* renamed from: b, reason: collision with root package name */
        public static final String f19883b = "qq";

        /* renamed from: c, reason: collision with root package name */
        public static final String f19884c = "phone";

        /* renamed from: d, reason: collision with root package name */
        public static final String f19885d = "weixin";

        /* renamed from: e, reason: collision with root package name */
        public static final String f19886e = "weibo";
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements a.InterfaceC0141a {

        /* renamed from: a, reason: collision with root package name */
        public CountDownLatch f19887a;

        /* renamed from: b, reason: collision with root package name */
        public ThirdPartyUserInfo f19888b;

        /* renamed from: c, reason: collision with root package name */
        public String f19889c;

        public h(CountDownLatch countDownLatch) {
            this.f19887a = countDownLatch;
        }

        @Override // c9.a.InterfaceC0141a
        public void onCancel() {
            this.f19889c = "取消授权";
            this.f19887a.countDown();
        }

        @Override // c9.a.InterfaceC0141a
        public void onComplete(ThirdPartyUserInfo thirdPartyUserInfo) {
            this.f19888b = thirdPartyUserInfo;
            this.f19887a.countDown();
        }

        @Override // c9.a.InterfaceC0141a
        public void onError(Throwable throwable) {
            this.f19889c = "授权失败";
            this.f19887a.countDown();
        }
    }

    private AccountBindingMgr() {
    }

    private rx.c<ThirdPartyUserInfo> auth(final Activity activity, final String provider) {
        return rx.c.z2(new d(provider, activity)).w5(bc0.c.e());
    }

    public static AccountBindingMgr inst() {
        if (msInstance == null) {
            synchronized (AccountBindingMgr.class) {
                try {
                    if (msInstance == null) {
                        msInstance = new AccountBindingMgr();
                    }
                } finally {
                }
            }
        }
        return msInstance;
    }

    public rx.c<Void> bind(final String provider, Activity activity) {
        return rx.c.r7(auth(activity, provider), com.baicizhan.client.business.thrift.p.a(new l("/rpc/unified_user_service")), new f(provider)).w5(bc0.c.e());
    }

    public rx.c<Map<String, BindInfo>> bindInfo() {
        this.mCache.clear();
        this.mLoaded = false;
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/unified_user_service")).b2(new a()).w5(bc0.c.e());
    }

    public rx.c<Boolean> bindPhone(final Context context, final String phone, final String code, final UserRecord userRecord) {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/unified_user_service")).b2(new b(userRecord, phone, code, context)).w5(bc0.c.a()).I3(tb0.a.a());
    }

    public void clear() {
        this.mLoaded = false;
        this.mCache.clear();
        qb.c.i(TAG, "", new Object[0]);
    }

    public rx.c<Boolean> editPhone(final Context context, final String phone, final String code, final UserRecord userRecord) {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/unified_user_service")).b2(new c(phone, code, userRecord, context)).w5(bc0.c.a()).I3(tb0.a.a());
    }

    public Map<String, BindInfo> getAllBindInfos() {
        return this.mCache;
    }

    public BindInfo getBindInfo(String provide) {
        return this.mCache.get(provide);
    }

    public boolean isLoaded() {
        return this.mLoaded;
    }

    public void setInfo(String key, BindInfo info) {
        this.mCache.put(key, info);
    }

    public rx.c<Void> unbind(final String provider) {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/unified_user_service")).b2(new e(provider)).w5(bc0.c.e());
    }
}
