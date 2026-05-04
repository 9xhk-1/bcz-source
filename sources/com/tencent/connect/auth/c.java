package com.tencent.connect.auth;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.util.Map;
import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private AuthAgent f42796a;

    /* renamed from: b, reason: collision with root package name */
    private QQToken f42797b;

    private c(String str, Context context) {
        SLog.i("openSDK_LOG.QQAuth", "new QQAuth() --start");
        this.f42797b = new QQToken(str);
        this.f42796a = new AuthAgent(this.f42797b);
        com.tencent.connect.a.a.c(context, this.f42797b);
        a(context, Constants.SDK_VERSION);
        SLog.i("openSDK_LOG.QQAuth", "new QQAuth() --end");
    }

    public static void a(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        edit.putString("bcb3903995", str);
        edit.apply();
    }

    public int b(Activity activity, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.QQAuth", "reAuth()");
        return this.f42796a.a(activity, str, iUiListener, true, null, false);
    }

    public boolean c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isSessionValid(), result = ");
        sb2.append(this.f42797b.isSessionValid() ? m.f74525c : "false");
        SLog.i("openSDK_LOG.QQAuth", sb2.toString());
        return this.f42797b.isSessionValid();
    }

    public QQToken b() {
        return this.f42797b;
    }

    public void b(Context context, String str) {
        SLog.i("openSDK_LOG.QQAuth", "setOpenId() --start");
        this.f42797b.setOpenId(str);
        com.tencent.connect.a.a.d(context, this.f42797b);
        SLog.i("openSDK_LOG.QQAuth", "setOpenId() --end");
    }

    public static c a(String str, Context context) {
        g.a(context.getApplicationContext());
        SLog.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        c cVar = new c(str, context);
        SLog.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return cVar;
    }

    public int a(Activity activity, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.QQAuth", "login()");
        return a(activity, str, iUiListener, "");
    }

    public int a(Activity activity, String str, IUiListener iUiListener, boolean z11) {
        SLog.i("openSDK_LOG.QQAuth", "login()");
        return a(activity, null, str, iUiListener, "", z11);
    }

    public int a(Activity activity, IUiListener iUiListener, Map<String, Object> map) {
        SLog.i("openSDK_LOG.QQAuth", "login--params");
        return a(activity, (Fragment) null, com.tencent.open.utils.m.a(map, Constants.KEY_SCOPE, TtmlNode.COMBINE_ALL), iUiListener, "", com.tencent.open.utils.m.a(map, Constants.KEY_QRCODE, false), map);
    }

    public int a(Activity activity, String str, IUiListener iUiListener, String str2) {
        SLog.i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return a(activity, (Fragment) null, str, iUiListener, str2);
    }

    public int a(Fragment fragment, String str, IUiListener iUiListener, String str2) {
        FragmentActivity activity = fragment.getActivity();
        SLog.i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return a(activity, fragment, str, iUiListener, str2);
    }

    public int a(Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z11) {
        FragmentActivity activity = fragment.getActivity();
        SLog.i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return a(activity, fragment, str, iUiListener, str2, z11);
    }

    private int a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2) {
        return a(activity, fragment, str, iUiListener, str2, false);
    }

    private int a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z11) {
        return a(activity, fragment, str, iUiListener, str2, z11, (Map<String, Object>) null);
    }

    private int a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z11, Map<String, Object> map) {
        try {
            String a11 = k.a(activity);
            if (a11 != null) {
                String a12 = com.tencent.open.utils.b.a(new File(a11));
                if (!TextUtils.isEmpty(a12)) {
                    SLog.v("openSDK_LOG.QQAuth", "-->login channelId: " + a12);
                    return a(activity, str, iUiListener, z11, a12, a12, "");
                }
            }
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.QQAuth", "-->login get channel id exception.", th2);
        }
        SLog.d("openSDK_LOG.QQAuth", "-->login channelId is null ");
        BaseApi.isOEM = false;
        return this.f42796a.doLogin(activity, str, iUiListener, false, fragment, z11, map);
    }

    @Deprecated
    public int a(Activity activity, String str, IUiListener iUiListener, boolean z11, String str2, String str3, String str4) {
        SLog.i("openSDK_LOG.QQAuth", "loginWithOEM");
        BaseApi.isOEM = true;
        if (str2.equals("")) {
            str2 = "null";
        }
        if (str3.equals("")) {
            str3 = "null";
        }
        if (str4.equals("")) {
            str4 = "null";
        }
        BaseApi.installChannel = str3;
        BaseApi.registerChannel = str2;
        BaseApi.businessId = str4;
        return this.f42796a.a(activity, str, iUiListener, false, null, z11);
    }

    public void a() {
        this.f42796a.a((IUiListener) null);
    }

    public void a(IUiListener iUiListener) {
        this.f42796a.b(iUiListener);
    }

    public void a(String str, String str2) {
        SLog.i("openSDK_LOG.QQAuth", "setAccessToken(), validTimeInSecond = " + str2 + "");
        this.f42797b.setAccessToken(str, str2);
    }
}
