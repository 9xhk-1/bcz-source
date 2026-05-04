package com.baicizhan.client.business.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import c9.a;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.baicizhan.client.business.auth.QQAuthHelper;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.business.util.PathUtil;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;
import com.tencent.open.SocialOperation;
import com.tencent.open.log.Tracer;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import m80.k;
import rb.f;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class QQAuthHelper implements DefaultLifecycleObserver {

    /* renamed from: h, reason: collision with root package name */
    public static final String f15978h = "QQAuthHelper";

    /* renamed from: i, reason: collision with root package name */
    public static final String f15979i = "get_simple_userinfo";

    /* renamed from: j, reason: collision with root package name */
    public static final String f15980j = "https://graph.qq.com/user/get_simple_userinfo?access_token=%s&oauth_consumer_key=%s&openid=%s";

    /* renamed from: k, reason: collision with root package name */
    public static final String f15981k = "https://graph.qq.com/oauth2.0/me?access_token=%s&unionid=1";

    /* renamed from: l, reason: collision with root package name */
    public static final String f15982l = "qq_share.jpg";

    /* renamed from: m, reason: collision with root package name */
    public static final QQAuthHelper f15983m = new QQAuthHelper();

    /* renamed from: a, reason: collision with root package name */
    public Tencent f15984a;

    /* renamed from: b, reason: collision with root package name */
    public IUiListener f15985b;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference<ShareDelegate.b> f15988e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15986c = false;

    /* renamed from: d, reason: collision with root package name */
    public ShareChannel f15987d = ShareChannel.QQ;

    /* renamed from: f, reason: collision with root package name */
    public long f15989f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final long f15990g = 1000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AccessTokenResp implements NoProguard {

        @wo.c("access_token")
        public String access_token;

        @wo.c("expires_in")
        public long expires_in;

        @wo.c("msg")
        public String msg;

        @wo.c("openid")
        public String openid;

        @wo.c("pay_token")
        public String pay_token;

        /* renamed from: pf, reason: collision with root package name */
        @wo.c(Constants.PARAM_PLATFORM_ID)
        public String f15991pf;

        @wo.c("pfkey")
        public String pfkey;

        @wo.c("ret")
        public int ret;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends bp.a<AccessTokenResp> {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends bp.a<AccessTokenResp> {
            public b() {
            }
        }

        public static AccessTokenResp fromJson(String json) {
            return (AccessTokenResp) BczJson.readFromJson(json, new a().getType());
        }

        public String toString() {
            return BczJson.writeToJson(this, new b().getType());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IDRespance implements NoProguard {

        @wo.c("client_id")
        public String client_id;

        @wo.c("openid")
        public String openid;

        @wo.c(SocialOperation.GAME_UNION_ID)
        public String unionid;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends bp.a<IDRespance> {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends bp.a<IDRespance> {
            public b() {
            }
        }

        public static IDRespance fromJson(String json) {
            return (IDRespance) BczJson.readFromJson(json, new a().getType());
        }

        public String toString() {
            return BczJson.writeToJson(this, new b().getType());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserInfoResp implements NoProguard {

        @wo.c("city")
        public String city;

        @wo.c("figureurl")
        public String figureurl;

        @wo.c("figureurl_1")
        public String figureurl_1;

        @wo.c("figureurl_2")
        public String figureurl_2;

        @wo.c("figureurl_qq_1")
        public String figureurl_qq_1;

        @wo.c("figureurl_qq_2")
        public String figureurl_qq_2;

        @wo.c("gender")
        public String gender;

        @wo.c("is_yellow_vip")
        public String is_yellow_vip;

        @wo.c("is_yellow_year_vip")
        public String is_yellow_year_vip;

        @wo.c("level")
        public String level;

        @wo.c("msg")
        public String msg;

        @wo.c("nickname")
        public String nickname;

        @wo.c("province")
        public String province;

        @wo.c("ret")
        public int ret;

        @wo.c("vip")
        public String vip;

        @wo.c("yellow_vip_level")
        public String yellow_vip_level;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends bp.a<UserInfoResp> {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends bp.a<UserInfoResp> {
            public b() {
            }
        }

        public static UserInfoResp fromJson(String json) {
            try {
                return (UserInfoResp) BczJson.readFromJson(json, new a().getType());
            } catch (Exception e11) {
                qb.c.c(QQAuthHelper.f15978h, "", e11);
                return null;
            }
        }

        public String toString() {
            return BczJson.writeToJson(this, new b().getType());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Tracer {
        public a() {
        }

        @Override // com.tencent.open.log.Tracer
        public void doTrace(int i11, Thread thread, long l11, String s11, String s12, Throwable throwable) {
            qb.c.i(QQAuthHelper.f15978h, "[%d, %d, %d, %s, %s]", Integer.valueOf(i11), Long.valueOf(thread.getId()), Long.valueOf(l11), s11, s12);
            qb.c.c(QQAuthHelper.f15978h, "", throwable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Response.ErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0141a f15996a;

        public b(final a.InterfaceC0141a val$callback) {
            this.f15996a = val$callback;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            qb.c.c(QQAuthHelper.f15978h, "request user info failed. ", volleyError);
            a.InterfaceC0141a interfaceC0141a = this.f15996a;
            if (interfaceC0141a != null) {
                interfaceC0141a.onError(volleyError);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends StringRequest {
        public c(String url, Response.Listener listener, Response.ErrorListener errorListener) {
            super(url, listener, errorListener);
        }

        @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
        public Response<String> parseNetworkResponse(NetworkResponse response) {
            String str;
            try {
                str = new String(response.data, "utf-8");
            } catch (UnsupportedEncodingException unused) {
                str = new String(response.data);
            }
            return Response.success(str, HttpHeaderParser.parseCacheHeaders(response));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements IUiListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ShareChannel f15999a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ShareParams f16000b;

        public d(final ShareChannel val$media, final ShareParams val$params) {
            this.f15999a = val$media;
            this.f16000b = val$params;
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            ShareChannel shareChannel;
            ShareDelegate.b bVar = QQAuthHelper.this.f15988e.get();
            if (bVar != null) {
                if (this.f16000b.f16061e == ShareParams.ShareType.IMAGE && (shareChannel = this.f15999a) == ShareChannel.QZONE) {
                    bVar.onShareSuccess(shareChannel);
                } else {
                    bVar.onShareCancel();
                }
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object o11) {
            ShareDelegate.b bVar = QQAuthHelper.this.f15988e.get();
            if (bVar != null) {
                bVar.onShareSuccess(this.f15999a);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            ShareDelegate.b bVar = QQAuthHelper.this.f15988e.get();
            qb.c.d(QQAuthHelper.f15978h, "share error:" + uiError.errorMessage + ",detail:" + uiError.errorDetail, new Object[0]);
            if (bVar != null) {
                bVar.onShareError(this.f15999a, new AuthException(uiError.errorCode, uiError.errorMessage));
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i11) {
            qb.c.q(QQAuthHelper.f15978h, "warning: " + i11, new Object[0]);
            if (i11 == -19) {
                g.i("请授权手机QQ访问分享的文件的读取权限!", 0);
            } else {
                g.i("出错啦", 0);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements IUiListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<Activity> f16002a;

        /* renamed from: b, reason: collision with root package name */
        public final a.InterfaceC0141a f16003b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Response.Listener<String> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ThirdPartyUserInfo f16004a;

            public a(final ThirdPartyUserInfo val$userInfo) {
                this.f16004a = val$userInfo;
            }

            @Override // com.android.volley.Response.Listener
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(String s11) {
                try {
                    try {
                        qb.c.i(QQAuthHelper.f15978h, "respance %s", s11);
                        IDRespance fromJson = IDRespance.fromJson(s11.replace("callback(", "").replace("\n", "").replace(");", ""));
                        this.f16004a.unionid = fromJson.unionid;
                    } catch (Exception e11) {
                        qb.c.c(QQAuthHelper.f15978h, "pase json error", e11);
                    }
                } finally {
                    QQAuthHelper.h().n(this.f16004a, e.this.f16003b);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements Response.ErrorListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ThirdPartyUserInfo f16006a;

            public b(final ThirdPartyUserInfo val$userInfo) {
                this.f16006a = val$userInfo;
            }

            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                qb.c.c(QQAuthHelper.f15978h, "request user info failed. ", volleyError);
                QQAuthHelper.h().n(this.f16006a, e.this.f16003b);
            }
        }

        public e(Activity activity, a.InterfaceC0141a callback) {
            this.f16002a = new WeakReference<>(activity);
            this.f16003b = callback;
        }

        public final void a(final ThirdPartyUserInfo userInfo) {
            userInfo.unionid = "";
            f.d(new StringRequest(String.format(Locale.getDefault(), QQAuthHelper.f15981k, userInfo.atoken), new a(userInfo), new b(userInfo)));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            Activity activity = this.f16002a.get();
            if (activity == null) {
                return;
            }
            QQAuthHelper.h().f(activity, this.f16003b);
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object o11) {
            if (this.f16002a.get() == null) {
                return;
            }
            if (o11 == null) {
                a.InterfaceC0141a interfaceC0141a = this.f16003b;
                if (interfaceC0141a != null) {
                    interfaceC0141a.onError(new AuthException(-6));
                    return;
                }
                return;
            }
            AccessTokenResp fromJson = AccessTokenResp.fromJson(o11.toString());
            if (fromJson == null || fromJson.ret < 0) {
                if (this.f16003b != null) {
                    this.f16003b.onError(fromJson == null ? new AuthException(-6) : new AuthException(fromJson.ret, fromJson.msg));
                    return;
                }
                return;
            }
            QQAuthHelper h11 = QQAuthHelper.h();
            h11.f15984a.setAccessToken(fromJson.access_token, String.valueOf(fromJson.expires_in));
            h11.f15984a.setOpenId(fromJson.openid);
            ThirdPartyUserInfo thirdPartyUserInfo = new ThirdPartyUserInfo();
            thirdPartyUserInfo.provider = "qq";
            thirdPartyUserInfo.loginType = 5;
            thirdPartyUserInfo.atoken = fromJson.access_token;
            String str = fromJson.openid;
            thirdPartyUserInfo.openid = str;
            thirdPartyUserInfo.unionid = str;
            thirdPartyUserInfo.expireAt = fromJson.expires_in;
            a(thirdPartyUserInfo);
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            a.InterfaceC0141a interfaceC0141a;
            if (this.f16002a.get() == null || (interfaceC0141a = this.f16003b) == null) {
                return;
            }
            interfaceC0141a.onError(new AuthException(uiError.errorCode, uiError.errorMessage));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i11) {
            qb.c.q(QQAuthHelper.f15978h, "login on warning: " + i11, new Object[0]);
        }
    }

    public QQAuthHelper() {
        try {
            Tencent.setCustomLogger(new a());
        } catch (Exception e11) {
            qb.c.c(f15978h, "", e11);
        }
    }

    public static /* synthetic */ void a(a.InterfaceC0141a interfaceC0141a, ThirdPartyUserInfo thirdPartyUserInfo, String str) {
        UserInfoResp fromJson = UserInfoResp.fromJson(str);
        if (fromJson == null || fromJson.ret < 0) {
            if (interfaceC0141a != null) {
                interfaceC0141a.onError(fromJson == null ? new AuthException(-7) : new AuthException(fromJson.ret, fromJson.msg));
                return;
            }
            return;
        }
        thirdPartyUserInfo.nickName = fromJson.nickname;
        thirdPartyUserInfo.province = fromJson.province;
        thirdPartyUserInfo.city = fromJson.city;
        thirdPartyUserInfo.imageUrl = !TextUtils.isEmpty(fromJson.figureurl_qq_2) ? fromJson.figureurl_qq_2 : fromJson.figureurl_qq_1;
        if (fromJson.gender == null) {
            fromJson.gender = "X";
        }
        String str2 = fromJson.gender;
        str2.getClass();
        if (str2.equals("女")) {
            thirdPartyUserInfo.gender = "f";
        } else if (str2.equals("男")) {
            thirdPartyUserInfo.gender = "m";
        } else {
            thirdPartyUserInfo.gender = "X";
        }
        if (interfaceC0141a != null) {
            interfaceC0141a.onComplete(thirdPartyUserInfo);
        }
    }

    public static QQAuthHelper h() {
        return f15983m;
    }

    public static String i(@DrawableRes final int imgRes) {
        if (FileUtils.copyFromRaw(pb.a.a().getResources(), imgRes, PathUtil.getBaicizhanAppRoot(), f15982l)) {
            return new File(PathUtil.getBaicizhanAppRoot(), f15982l).getAbsolutePath();
        }
        return null;
    }

    public final void f(Context context, a.InterfaceC0141a callback) {
        if (callback != null) {
            callback.onCancel();
        }
        this.f15984a.logout(context);
    }

    public final void g(Context context) {
        if (this.f15984a == null) {
            this.f15984a = Tencent.createInstance(b9.a.f6456e, context, "com.jiongji.andriod.card.fileprovider");
        }
    }

    public void j(final Activity context, final a.InterfaceC0141a callback) {
        g(context);
        if (this.f15984a.isSessionValid()) {
            this.f15984a.logout(context);
        }
        this.f15985b = new e(context, callback);
        if (callback != null) {
            callback.onStart();
        }
        this.f15984a.login(context, f15979i, this.f15985b);
    }

    public void k(Context context) {
        Tencent tencent = this.f15984a;
        if (tencent != null) {
            tencent.logout(context);
        }
    }

    public void l(int requestCode, int resultCode, Intent data) {
        if (this.f15984a != null) {
            Tencent.onActivityResultData(requestCode, resultCode, data, this.f15985b);
        }
    }

    public void m() {
        Tencent.setIsPermissionGranted(true);
    }

    public final void n(final ThirdPartyUserInfo userInfo, final a.InterfaceC0141a callback) {
        f.d(new c(String.format(Locale.CHINA, f15980j, userInfo.atoken, b9.a.f6456e, userInfo.openid), new Response.Listener() { // from class: b9.h
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) {
                QQAuthHelper.a(a.InterfaceC0141a.this, userInfo, (String) obj);
            }
        }, new b(callback)));
    }

    public void o(Activity context, ShareParams params, final ShareDelegate.b shareListener, final ShareChannel media) {
        this.f15987d = media;
        g(context);
        this.f15988e = new WeakReference<>(shareListener);
        this.f15985b = new d(media, params);
        if (media == ShareChannel.QQ) {
            q(context, params);
        } else {
            r(context, params);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NonNull @k LifecycleOwner owner) {
        if (!this.f15986c || this.f15988e == null || this.f15989f <= 0 || SystemClock.elapsedRealtime() <= this.f15989f + 1000) {
            return;
        }
        ShareDelegate.b bVar = this.f15988e.get();
        if (bVar != null) {
            bVar.onShareSuccess(this.f15987d);
        }
        this.f15986c = false;
    }

    public final void p(Activity context, ShareParams params) {
        Bundle bundle = new Bundle();
        bundle.putString("title", params.f16058b);
        bundle.putString("summary", " ");
        bundle.putString("imageUrl", params.f16060d);
        bundle.putString("targetUrl", params.f16068l);
        bundle.putString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID, params.f16064h);
        bundle.putString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, params.f16065i);
        bundle.putString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_TYPE, params.f16066j == 2 ? "1" : "3");
        bundle.putInt("req_type", 7);
        this.f15984a.shareToQQ(context, bundle, this.f15985b);
    }

    public final void q(Activity context, ShareParams params) {
        if (ShareParams.ShareType.TEXT.equals(params.f16061e)) {
            this.f15986c = true;
            this.f15989f = SystemClock.elapsedRealtime();
            String str = c9.a.b(context) ? "com.tencent.mobileqq" : Constants.PACKAGE_TIM;
            String str2 = TextUtils.isEmpty(params.f16063g) ? params.f16059c : params.f16063g;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            if (TextUtils.isEmpty(str2)) {
                str2 = params.f16058b;
            }
            intent.putExtra("android.intent.extra.TEXT", str2);
            intent.setClassName(str, "com.tencent.mobileqq.activity.JumpActivity");
            intent.setType("text/plain");
            context.startActivity(intent);
            return;
        }
        if (ShareParams.ShareType.MINI_PROGRAM.equals(params.f16061e)) {
            p(context, params);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("title", params.f16058b);
        if (ShareParams.ShareType.IMAGE.equals(params.f16061e)) {
            bundle.putInt("req_type", 5);
            try {
                bundle.putString("imageLocalUrl", params.f16060d);
            } catch (Exception e11) {
                qb.c.c(f15978h, "", e11);
            }
        } else {
            bundle.putInt("req_type", 1);
            bundle.putString("summary", TextUtils.isEmpty(params.f16059c) ? " " : params.f16059c);
            bundle.putString("targetUrl", params.f16057a);
            bundle.putString("appName", "百词斩");
            if (TextUtils.isEmpty(params.f16060d)) {
                String i11 = i(params.f16062f);
                if (!TextUtils.isEmpty(i11)) {
                    bundle.putString("imageUrl", i11);
                }
            } else {
                bundle.putString("imageUrl", params.f16060d);
            }
        }
        this.f15984a.shareToQQ(context, bundle, this.f15985b);
    }

    public final void r(Activity context, final ShareParams params) {
        Bundle bundle = new Bundle();
        if (ShareParams.ShareType.IMAGE.equals(params.f16061e)) {
            bundle.putInt("req_type", 3);
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(params.f16060d);
                bundle.putStringArrayList("imageUrl", arrayList);
            } catch (Exception e11) {
                qb.c.c(f15978h, "", e11);
            }
            this.f15984a.publishToQzone(context, bundle, this.f15985b);
            return;
        }
        bundle.putString("title", params.f16058b);
        bundle.putInt("req_type", 1);
        bundle.putString("summary", TextUtils.isEmpty(params.f16059c) ? " " : params.f16059c);
        bundle.putString("targetUrl", params.f16057a);
        bundle.putString("appName", "百词斩");
        ArrayList<String> arrayList2 = new ArrayList<>(1);
        if (TextUtils.isEmpty(params.f16060d)) {
            String i11 = i(params.f16062f);
            if (!TextUtils.isEmpty(i11)) {
                arrayList2.add(i11);
                bundle.putStringArrayList("imageUrl", arrayList2);
            }
        } else {
            arrayList2.add(params.f16060d);
            bundle.putStringArrayList("imageUrl", arrayList2);
        }
        this.f15984a.shareToQzone(context, bundle, this.f15985b);
    }
}
