package com.huawei.hms.update.http;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.support.log.HMSLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class WiseContentUrlHelper {
    private static String a(String str) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("?country=");
        sb2.append(URLEncoder.encode(str, "UTF-8"));
        String phoneModel = SystemUtils.getPhoneModel();
        String andoridVersion = SystemUtils.getAndoridVersion();
        String manufacturer = SystemUtils.getManufacturer();
        if (b(phoneModel)) {
            sb2.append("&phoneModel=");
            sb2.append(URLEncoder.encode(phoneModel, "UTF-8"));
        }
        if (b(andoridVersion)) {
            sb2.append("&androidVersion=");
            sb2.append(URLEncoder.encode(andoridVersion, "UTF-8"));
        }
        if (b(manufacturer)) {
            sb2.append("&MFR=");
            sb2.append(URLEncoder.encode(manufacturer, "UTF-8"));
        }
        return sb2.toString();
    }

    private static boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals("unknown")) ? false : true;
    }

    public static String syncGetUrl(Context context) {
        String str = "";
        if (context == null) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> context is null.");
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String a11 = a(applicationContext);
        if (TextUtils.isEmpty(a11)) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> getIssueCountryCode is empty");
            return "";
        }
        String a12 = a(applicationContext, a11);
        if (TextUtils.isEmpty(a12)) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> synGetGrsUrl is empty");
            return "";
        }
        try {
            str = a(a11);
        } catch (UnsupportedEncodingException e11) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> UnsupportedEncodingException," + e11.getMessage());
        } catch (RuntimeException e12) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> RuntimeException," + e12.getMessage());
        }
        HMSLog.i("WiseContentUrlHelper", "<syncGettUrl> requestParam: " + str);
        return a12 + "/cch5/HMS/core/sdk/install.json" + str;
    }

    private static String a(Context context) {
        String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(context);
        if (!TextUtils.isEmpty(issueCountryCode)) {
            issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
        }
        if (!"UNKNOWN".equalsIgnoreCase(issueCountryCode) && !TextUtils.isEmpty(issueCountryCode)) {
            return issueCountryCode;
        }
        HMSLog.e("WiseContentUrlHelper", "<getIssueCountryCode> Failed to get device issue country");
        return "";
    }

    private static String a(Context context, String str) {
        HMSLog.i("WiseContentUrlHelper", "<syncInternalGetGrsUrl> Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        return new GrsClient(context, grsBaseInfo).synGetGrsUrl("com.huawei.cloud.hmscoreInstallerSDK", Logger.ROOT_LOGGER_NAME);
    }
}
