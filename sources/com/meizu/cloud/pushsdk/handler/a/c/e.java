package com.meizu.cloud.pushsdk.handler.a.c;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private int f39865a;

    /* renamed from: b, reason: collision with root package name */
    private String f39866b = String.valueOf(-1);

    /* renamed from: c, reason: collision with root package name */
    private String f39867c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f39868d = "";

    /* renamed from: e, reason: collision with root package name */
    private int f39869e = -1;

    /* renamed from: f, reason: collision with root package name */
    private String f39870f = "";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f39871a;

        /* renamed from: b, reason: collision with root package name */
        public String f39872b;

        /* renamed from: c, reason: collision with root package name */
        String f39873c;

        public a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull("code")) {
                    a(jSONObject.getString("code"));
                }
                if (!jSONObject.isNull("message")) {
                    b(jSONObject.getString("message"));
                }
                if (jSONObject.isNull("value")) {
                    return;
                }
                c(jSONObject.getString("value"));
            } catch (JSONException e11) {
                DebugLogger.e("SecurityMessage", "covert json error " + e11.getMessage());
            }
        }

        public String a() {
            return this.f39873c;
        }

        public void b(String str) {
            this.f39872b = str;
        }

        public void c(String str) {
            this.f39873c = str;
        }

        public String toString() {
            return "PublicKeyStatus{code='" + this.f39871a + "', message='" + this.f39872b + "', publicKey='" + this.f39873c + '\'' + l50.b.f69928j;
        }

        public void a(String str) {
            this.f39871a = str;
        }
    }

    public int a() {
        return this.f39865a;
    }

    public String b() {
        return this.f39866b;
    }

    public String c() {
        return this.f39867c;
    }

    public String d() {
        return this.f39868d;
    }

    public int e() {
        return this.f39869e;
    }

    public String f() {
        return this.f39870f;
    }

    public String toString() {
        return "SecurityMessage{timestamp=" + this.f39865a + ", taskId='" + this.f39866b + "', title='" + this.f39867c + "', content='" + this.f39868d + "', clickType=" + this.f39869e + ", params='" + this.f39870f + '\'' + l50.b.f69928j;
    }

    public static String a(MessageV3 messageV3) {
        JSONObject jSONObject;
        String notificationMessage = messageV3.getNotificationMessage();
        String str = null;
        try {
            try {
                if (!TextUtils.isEmpty(notificationMessage)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(notificationMessage).getJSONObject("data");
                        if (!jSONObject2.isNull("extra")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("extra");
                            if (!jSONObject3.isNull("se")) {
                                str = jSONObject3.getString("se");
                            }
                        }
                    } catch (JSONException e11) {
                        DebugLogger.e("SecurityMessage", "parse notification message error " + e11.getMessage());
                        if (TextUtils.isEmpty(null)) {
                            jSONObject = new JSONObject(notificationMessage);
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        jSONObject = new JSONObject(notificationMessage);
                        str = jSONObject.getString("se");
                    }
                }
            } catch (Throwable th2) {
                if (TextUtils.isEmpty(null)) {
                    try {
                        new JSONObject(notificationMessage).getString("se");
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (Exception unused2) {
        }
        DebugLogger.i("SecurityMessage", "encrypt message " + str);
        return str;
    }

    private static e e(String str) {
        e eVar = new e();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("tt")) {
                eVar.a(jSONObject.getInt("tt"));
            }
            if (!jSONObject.isNull("ti")) {
                eVar.a(jSONObject.getString("ti"));
            }
            if (!jSONObject.isNull("tl")) {
                eVar.b(jSONObject.getString("tl"));
            }
            if (!jSONObject.isNull("cont")) {
                eVar.c(jSONObject.getString("cont"));
            }
            if (!jSONObject.isNull("ct")) {
                eVar.b(jSONObject.getInt("ct"));
            }
            if (!jSONObject.isNull("pm")) {
                eVar.d(jSONObject.getString("pm"));
            }
            return eVar;
        } catch (Exception e11) {
            DebugLogger.e("SecurityMessage", "parse decryptSign error " + e11.getMessage());
            return eVar;
        }
    }

    public void b(int i11) {
        this.f39869e = i11;
    }

    public void c(String str) {
        this.f39868d = str;
    }

    public void d(String str) {
        this.f39870f = str;
    }

    public void a(int i11) {
        this.f39865a = i11;
    }

    public void b(String str) {
        this.f39867c = str;
    }

    public void a(String str) {
        this.f39866b = str;
    }

    public static boolean a(String str, MessageV3 messageV3) {
        String str2;
        e e11 = e(str);
        DebugLogger.e("SecurityMessage", "securityMessage " + e11);
        if (System.currentTimeMillis() / 1000 > e11.a()) {
            str2 = "message expire";
        } else if (!messageV3.getTitle().contains(e11.c())) {
            str2 = "invalid title";
        } else if (!messageV3.getContent().contains(e11.d())) {
            str2 = "invalid content";
        } else if (!String.valueOf(-1).equals(e11.b()) && !e11.b().equals(messageV3.getTaskId())) {
            str2 = "invalid taskId";
        } else {
            if (e11.e() != -1) {
                int e12 = e11.e();
                if (e12 == 1) {
                    if (!messageV3.getActivity().contains(e11.f())) {
                        str2 = "invalid click activity";
                    }
                    return true;
                }
                if (e12 == 2) {
                    if (!messageV3.getWebUrl().contains(e11.f())) {
                        str2 = "invalid web url";
                    }
                    return true;
                }
                if (e12 == 3 && !MzPushMessage.fromMessageV3(messageV3).getSelfDefineContentString().contains(e11.f())) {
                    str2 = "invalid self define";
                }
                return true;
            }
            str2 = "invalid click type";
        }
        DebugLogger.e("SecurityMessage", str2);
        return false;
    }
}
