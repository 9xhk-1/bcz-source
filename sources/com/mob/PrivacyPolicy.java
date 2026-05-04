package com.mob;

import android.os.Handler;
import android.os.LocaleList;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.mob.commons.MobProductCollector;
import com.mob.commons.c;
import com.mob.commons.j;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.proguard.ClassKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.UIHandler;
import com.mob.tools.utils.e;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes7.dex */
public class PrivacyPolicy implements ClassKeeper, PublicMemberKeeper, Serializable {
    public static final int POLICY_TYPE_TXT = 2;
    public static final int POLICY_TYPE_URL = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f40036a;

    /* renamed from: b, reason: collision with root package name */
    private String f40037b;

    /* renamed from: c, reason: collision with root package name */
    private int f40038c;

    /* renamed from: d, reason: collision with root package name */
    private long f40039d;

    public interface OnPolicyListener extends ClassKeeper, PublicMemberKeeper {
        void onComplete(PrivacyPolicy privacyPolicy);

        void onFailure(Throwable th2);
    }

    public PrivacyPolicy() {
    }

    private String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new String(Data.AES128Decode(Data.rawMD5(MobSDK.getAppkey() + ":" + DeviceHelper.getInstance(MobSDK.getContext()).getPackageName() + ":" + getTimestamp()), Base64.decode(str, 0)), "UTF-8");
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public static PrivacyPolicy getPrivacyPolicy(int i11, Locale locale) throws Throwable {
        LocaleList locales;
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Parameter 'type' should be either 1 or 2");
        }
        if (locale == null && (locales = MobSDK.getContext().getResources().getConfiguration().getLocales()) != null && !locales.isEmpty()) {
            locale = locales.get(0);
        }
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        String appkey = MobSDK.getAppkey();
        String packageName = deviceHelper.getPackageName();
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(j.a("004b[bg=cg"), String.valueOf(i11)));
        arrayList.add(new KVPair<>(j.a("006HbdXcc;bhKgYbg"), appkey));
        arrayList.add(new KVPair<>(j.a("006-bdTcccEbhdd"), packageName));
        arrayList.add(new KVPair<>("ppVersion", String.valueOf(i11 == 1 ? v.a().b("key_policy_url_related_version", 0) : v.a().b("key_policy_txt_related_version", 0))));
        arrayList.add(new KVPair<>(IjkMediaMeta.IJKM_KEY_LANGUAGE, locale.toString()));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 10000;
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>(j.a("013TccdeBgCbffgce+fg[biWb:bcJb8bg"), MobProductCollector.getUserIdentity()));
        String httpGet = new NetworkHelper().httpGet(c.a(c.f40220b) + "/privacy/policy", arrayList, arrayList2, networkTimeOut);
        MobLog.getInstance().d("Response: " + httpGet, new Object[0]);
        Hashon hashon = new Hashon();
        HashMap fromJson = hashon.fromJson(httpGet);
        if (fromJson == null) {
            throw new Throwable("Response is illegal: " + httpGet);
        }
        if (!BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(fromJson.get(j.a("004NbecaSfg"))))) {
            throw new Throwable("Response code is not 200: " + httpGet);
        }
        Object obj = fromJson.get(j.a("004fObdBb^bd"));
        if (obj == null) {
            throw new Throwable("Response is illegal: " + httpGet);
        }
        String fromObject = hashon.fromObject(obj);
        if (!TextUtils.isEmpty(fromObject)) {
            return new PrivacyPolicy(fromObject);
        }
        throw new Throwable("Response is illegal: " + httpGet);
    }

    @Deprecated
    public static void getPrivacyPolicyAsync(int i11, OnPolicyListener onPolicyListener) {
        getPrivacyPolicyAsync(i11, null, onPolicyListener);
    }

    public String getContent() {
        return this.f40037b;
    }

    public int getPpVersion() {
        return this.f40038c;
    }

    public long getTimestamp() {
        return this.f40039d;
    }

    public String getTitle() {
        return this.f40036a;
    }

    public void setContent(String str) {
        this.f40037b = str;
    }

    public void setPpVersion(int i11) {
        this.f40038c = i11;
    }

    public void setTimestamp(long j11) {
        this.f40039d = j11;
    }

    public void setTitle(String str) {
        this.f40036a = str;
    }

    public PrivacyPolicy(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            setTimestamp(jSONObject.optLong(j.a("009bCbcOjgGdeGb*bdMjc")));
            setTitle(a(jSONObject.optString("title")));
            setContent(a(jSONObject.optString(j.a("0079becabi-bg^bi+b"))));
            String a11 = a(jSONObject.optString("ppVersion"));
            if (TextUtils.isEmpty(a11)) {
                return;
            }
            setPpVersion(Integer.parseInt(a11.trim()));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    @Deprecated
    public static void getPrivacyPolicyAsync(final int i11, final Locale locale, final OnPolicyListener onPolicyListener) {
        if (onPolicyListener != null) {
            new e() { // from class: com.mob.PrivacyPolicy.1
                @Override // com.mob.tools.utils.e
                public void a() {
                    try {
                        int i12 = 1;
                        if (i11 != 1) {
                            i12 = 2;
                        }
                        final PrivacyPolicy privacyPolicy = PrivacyPolicy.getPrivacyPolicy(i12, locale);
                        try {
                            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.PrivacyPolicy.1.1
                                @Override // android.os.Handler.Callback
                                public boolean handleMessage(Message message) {
                                    onPolicyListener.onComplete(privacyPolicy);
                                    return false;
                                }
                            });
                        } catch (Throwable th2) {
                            MobLog.getInstance().d(th2);
                            onPolicyListener.onComplete(privacyPolicy);
                        }
                    } catch (Throwable th3) {
                        try {
                            MobLog.getInstance().d(th3);
                            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.PrivacyPolicy.1.2
                                @Override // android.os.Handler.Callback
                                public boolean handleMessage(Message message) {
                                    onPolicyListener.onFailure(th3);
                                    return false;
                                }
                            });
                        } catch (Throwable th4) {
                            MobLog.getInstance().d(th4);
                            onPolicyListener.onFailure(th3);
                        }
                    }
                }
            }.start();
        }
    }
}
