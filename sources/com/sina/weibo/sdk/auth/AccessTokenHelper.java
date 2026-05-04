package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import dw.b;
import dw.f;
import r.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AccessTokenHelper {
    private static final String PREFERENCES_NAME = "com_weibo_sdk_android";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements b<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f41580a;

        public a(Context context) {
            this.f41580a = context;
        }

        @Override // r.b
        public final void a(Throwable th2) {
        }

        @Override // r.b
        public final void a(String str) {
            AccessTokenHelper.writeAccessToken(this.f41580a, Oauth2AccessToken.parseAccessToken(str));
        }
    }

    public static void clearAccessToken(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES_NAME, 0).edit();
        edit.clear();
        edit.apply();
    }

    public static Oauth2AccessToken readAccessToken(Context context) {
        if (context == null) {
            return null;
        }
        Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        oauth2AccessToken.setUid(sharedPreferences.getString("uid", ""));
        oauth2AccessToken.setScreenName(sharedPreferences.getString("userName", ""));
        oauth2AccessToken.setAccessToken(sharedPreferences.getString("access_token", ""));
        oauth2AccessToken.setRefreshToken(sharedPreferences.getString(Oauth2AccessToken.KEY_REFRESH_TOKEN, ""));
        oauth2AccessToken.setExpiresTime(sharedPreferences.getLong("expires_in", 0L));
        return oauth2AccessToken;
    }

    public static void refreshAccessToken(Context context, String str) {
        Oauth2AccessToken readAccessToken = readAccessToken(context);
        if (readAccessToken != null) {
            b.a.f48183a.a(new f(str, readAccessToken, new a(context)));
        }
    }

    public static void writeAccessToken(Context context, Oauth2AccessToken oauth2AccessToken) {
        if (context == null || oauth2AccessToken == null || TextUtils.isEmpty(oauth2AccessToken.getAccessToken())) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES_NAME, 0).edit();
        edit.putString("uid", oauth2AccessToken.getUid());
        edit.putString("userName", oauth2AccessToken.getScreenName());
        edit.putString("access_token", oauth2AccessToken.getAccessToken());
        edit.putString(Oauth2AccessToken.KEY_REFRESH_TOKEN, oauth2AccessToken.getRefreshToken());
        edit.putLong("expires_in", oauth2AccessToken.getExpiresTime());
        edit.apply();
    }
}
