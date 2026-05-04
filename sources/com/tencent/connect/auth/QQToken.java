package com.tencent.connect.auth;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.open.web.security.JniInterface;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class QQToken {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;

    /* renamed from: g, reason: collision with root package name */
    private static SharedPreferences f42747g;

    /* renamed from: a, reason: collision with root package name */
    private String f42748a;

    /* renamed from: b, reason: collision with root package name */
    private String f42749b;

    /* renamed from: c, reason: collision with root package name */
    private String f42750c;

    /* renamed from: d, reason: collision with root package name */
    private int f42751d = 1;

    /* renamed from: e, reason: collision with root package name */
    private long f42752e = -1;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.open.utils.a f42753f;

    public QQToken(String str) {
        this.f42748a = str;
    }

    @TargetApi(11)
    private static synchronized SharedPreferences a() {
        SharedPreferences sharedPreferences;
        synchronized (QQToken.class) {
            try {
                if (f42747g == null) {
                    f42747g = g.a().getSharedPreferences("token_info_file", 0);
                }
                sharedPreferences = f42747g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    @Deprecated
    private static String b(String str) {
        return Base64.encodeToString(m.j(str), 2);
    }

    @Deprecated
    private static String c(String str) {
        return Base64.encodeToString(m.j(str), 2) + "_spkey";
    }

    public String getAccessToken() {
        return this.f42749b;
    }

    public String getAppId() {
        return this.f42748a;
    }

    public int getAuthSource() {
        return this.f42751d;
    }

    public long getExpireTimeInSecond() {
        return this.f42752e;
    }

    public String getOpenId() {
        return this.f42750c;
    }

    public String getOpenIdWithCache() {
        String openId = getOpenId();
        try {
            if (!TextUtils.isEmpty(openId)) {
                SLog.i("QQToken", "getOpenId from field openId = " + openId + " appId = " + this.f42748a);
                return openId;
            }
            JSONObject loadSession = loadSession(this.f42748a);
            if (loadSession != null) {
                openId = loadSession.getString("openid");
                if (!TextUtils.isEmpty(openId)) {
                    setOpenId(openId);
                }
            }
            SLog.i("QQToken", "getOpenId from Session openId = " + openId + " appId = " + this.f42748a);
            return openId;
        } catch (Exception e11) {
            SLog.i("QQToken", "getLocalOpenIdByAppId " + e11.toString());
            return openId;
        }
    }

    public boolean isSessionValid() {
        return this.f42749b != null && System.currentTimeMillis() < this.f42752e;
    }

    public JSONObject loadSession(String str) {
        try {
            if (this.f42753f == null) {
                this.f42753f = new com.tencent.open.utils.a(g.a());
            }
            return a(str, this.f42753f);
        } catch (Exception e11) {
            SLog.i("QQToken", "login loadSession" + e11.toString());
            return null;
        }
    }

    public void removeSession(String str) {
        SharedPreferences.Editor edit = a().edit();
        edit.remove(c(str));
        edit.remove(c(str));
        edit.remove(a(str));
        edit.apply();
        SLog.i("QQToken", "removeSession sucess");
    }

    public boolean saveSession(JSONObject jSONObject) {
        try {
            if (this.f42753f == null) {
                this.f42753f = new com.tencent.open.utils.a(g.a());
            }
            return a(this.f42748a, jSONObject, this.f42753f);
        } catch (Exception e11) {
            SLog.i("QQToken", "login saveSession" + e11.toString());
            return false;
        }
    }

    public void setAccessToken(String str, String str2) throws NumberFormatException {
        this.f42749b = str;
        this.f42752e = 0L;
        if (str2 != null) {
            this.f42752e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public void setAppId(String str) {
        this.f42748a = str;
    }

    public void setAuthSource(int i11) {
        this.f42751d = i11;
    }

    public void setOpenId(String str) {
        this.f42750c = str;
        com.tencent.open.b.b.a().a(str);
    }

    private static synchronized JSONObject a(String str, com.tencent.open.utils.a aVar) {
        String b11;
        synchronized (QQToken.class) {
            if (g.a() == null) {
                SLog.i("QQToken", "loadJsonPreference context null");
                return null;
            }
            if (str == null) {
                SLog.i("QQToken", "loadJsonPreference prefKey is null");
                return null;
            }
            String string = a().getString(a(str), "");
            if (TextUtils.isEmpty(string)) {
                if (!JniInterface.isJniOk) {
                    k.a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
                    JniInterface.loadSo();
                }
                if (!JniInterface.isJniOk) {
                    SLog.i("QQToken", "loadJsonPreference jni load fail SECURE_LIB_VERSION=5");
                    return null;
                }
                String c11 = c(str);
                String string2 = a().getString(c11, "");
                try {
                    if (TextUtils.isEmpty(string2)) {
                        String b12 = b(str);
                        String string3 = a().getString(b12, "");
                        try {
                            if (TextUtils.isEmpty(string3)) {
                                SLog.i("QQToken", "loadJsonPreference oldDesValue null");
                                return null;
                            }
                            try {
                                b11 = JniInterface.d1(string3);
                                if (TextUtils.isEmpty(b11)) {
                                    SLog.i("QQToken", "loadJsonPreference decodeResult d1 empty");
                                    return null;
                                }
                                a(str, new JSONObject(b11), aVar);
                            } catch (Exception e11) {
                                SLog.e("QQToken", "Catch Exception", e11);
                                return null;
                            }
                        } finally {
                            a().edit().remove(b12).apply();
                        }
                    } else {
                        try {
                            b11 = JniInterface.d2(string2);
                            a(str, new JSONObject(b11), aVar);
                        } catch (Exception e12) {
                            SLog.e("QQToken", "Catch Exception", e12);
                            return null;
                        }
                    }
                } finally {
                    a().edit().remove(c11).apply();
                }
            } else {
                b11 = aVar.b(string);
            }
            try {
                JSONObject jSONObject = new JSONObject(b11);
                SLog.i("QQToken", "loadJsonPreference sucess");
                return jSONObject;
            } catch (Exception e13) {
                SLog.i("QQToken", "loadJsonPreference decode " + e13.toString());
                return null;
            }
        }
    }

    private static synchronized boolean a(String str, JSONObject jSONObject, com.tencent.open.utils.a aVar) {
        synchronized (QQToken.class) {
            if (g.a() == null) {
                SLog.i("QQToken", "saveJsonPreference context null");
                return false;
            }
            if (str != null && jSONObject != null) {
                try {
                    String string = jSONObject.getString("expires_in");
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(Constants.PARAM_EXPIRES_TIME, System.currentTimeMillis() + (Long.parseLong(string) * 1000));
                        String a11 = a(str);
                        String a12 = aVar.a(jSONObject.toString());
                        if (a11.length() > 6 && a12 != null) {
                            a().edit().putString(a11, a12).commit();
                            SLog.i("QQToken", "saveJsonPreference sucess");
                            return true;
                        }
                        SLog.i("QQToken", "saveJsonPreference keyEncode or josnEncode null");
                        return false;
                    }
                    SLog.i("QQToken", "expires is null");
                    return false;
                } catch (Exception e11) {
                    SLog.e("QQToken", "saveJsonPreference exception:" + e11.toString());
                    return false;
                }
            }
            SLog.i("QQToken", "saveJsonPreference prefKey or jsonObject null");
            return false;
        }
    }

    private static String a(String str) {
        return Base64.encodeToString(m.j(str), 2) + "_aes_google";
    }
}
