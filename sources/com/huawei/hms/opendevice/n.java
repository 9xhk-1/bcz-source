package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.client.business.webview.args.Arguments;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import com.tencent.connect.common.Constants;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        MOBILE("1"),
        PC("2"),
        TABLET("3"),
        TV("4"),
        SOUNDBOX("5"),
        GLASS(Constants.VIA_SHARE_TYPE_INFO),
        WATCH("7"),
        VEHICLE(Constants.VIA_SHARE_TYPE_PUBLISHVIDEO),
        OFFICE_DEVICE(Constants.VIA_SHARE_TYPE_MINI_PROGRAM),
        IOT_DEVICES(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ),
        HEALTHY(Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE),
        ENTERTAINMENT(Constants.VIA_REPORT_TYPE_SET_AVATAR),
        TRANSPORT_DEVICES("13");


        /* renamed from: o, reason: collision with root package name */
        public String f36114o;

        a(String str) {
            this.f36114o = str;
        }

        public String a() {
            return this.f36114o;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        IOS("ios"),
        ANDROID("android"),
        HARMONY("harmony"),
        WINDOWS("windows"),
        EMBED("embed"),
        OTHERS(Arguments.ARG_OTHERS);


        /* renamed from: h, reason: collision with root package name */
        public String f36122h;

        b(String str) {
            this.f36122h = str;
        }

        public String a() {
            return this.f36122h;
        }
    }

    public static String c(Context context, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timezone", TimeZone.getDefault().getID());
            jSONObject2.put(HwPayConstant.KEY_COUNTRY, SystemUtils.getLocalCountry());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("agent_version", new PackageManagerHelper(context).getPackageVersionName("com.huawei.android.pushagent"));
            jSONObject3.put("hms_version", String.valueOf(Util.getHmsVersion(context)));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("dev_type", a.MOBILE.a());
            jSONObject4.put("dev_sub_type", "phone");
            jSONObject4.put("os_type", b.ANDROID.a());
            jSONObject4.put(l7.f.f70560i, String.valueOf(HwBuildEx.VERSION.EMUI_SDK_INT));
            jSONObject.put("id", UUID.randomUUID().toString());
            jSONObject.put("global", jSONObject2);
            jSONObject.put("push_agent", jSONObject3);
            jSONObject.put("hardware", jSONObject4);
            jSONObject.put("aaid", str);
            jSONObject.put("token", str2);
            jSONObject.put("app_id", oq.a.b(context).getString("client/app_id"));
            jSONObject.put(TtmlNode.TAG_REGION, oq.a.b(context).getString(TtmlNode.TAG_REGION));
            return jSONObject.toString();
        } catch (JSONException unused) {
            HMSLog.e("ReportAaidToken", "Catch JSONException.");
            return null;
        }
    }

    public static boolean d(Context context, String str, String str2) {
        i a11 = i.a(context);
        if (!a11.containsKey("reportAaidAndToken")) {
            HMSLog.d("ReportAaidToken", "It hasn't been reported, this time needs report.");
            return true;
        }
        if (TextUtils.isEmpty(a11.getString("reportAaidAndToken"))) {
            HMSLog.e("ReportAaidToken", "It has been reported, but sp file is empty, this time needs report.");
            return true;
        }
        return !r4.equals(r.a(str2 + str, "SHA-256"));
    }

    public static boolean b(Context context) {
        int packageVersionCode = new PackageManagerHelper(context).getPackageVersionCode("com.huawei.android.pushagent");
        HMSLog.d("ReportAaidToken", "NC version code: " + packageVersionCode);
        return (90101400 <= packageVersionCode && packageVersionCode < 100000000) || packageVersionCode >= 100001301;
    }

    public static void a(Context context, String str) {
        new m(context, str).start();
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("ReportAaidToken", "Https response is empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("ret", 256);
            if (optInt == 0) {
                boolean saveString = i.a(context).saveString("reportAaidAndToken", r.a(str3 + str2, "SHA-256"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Report success ");
                sb2.append(saveString ? "and save success." : "but save failure.");
                HMSLog.d("ReportAaidToken", sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Https response body's ret code: ");
            sb3.append(optInt);
            sb3.append(", error message: ");
            sb3.append(jSONObject.optString("msg"));
            HMSLog.e("ReportAaidToken", sb3.toString());
        } catch (JSONException unused) {
            HMSLog.e("ReportAaidToken", "Has JSONException.");
        } catch (Exception unused2) {
            HMSLog.e("ReportAaidToken", "Exception occur.");
        }
    }
}
