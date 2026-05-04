package com.baicizhan.client.business.webview.hijack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class IPAddressUtil {
    private static final String IPV4_PATTERN = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    private static final String IPV6_PATTERN = "^([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}$";
    public static final String TAG = "IPAddressUtil";

    private IPAddressUtil() {
    }

    public static boolean hasIPHost(String urlStr) {
        String str;
        try {
            str = new URL(urlStr).getHost();
        } catch (MalformedURLException e11) {
            e11.printStackTrace();
            c.d(TAG, "check ip host error: " + e11, new Object[0]);
            str = null;
        }
        return str != null && isHostIPAddress(str);
    }

    public static boolean isHostIPAddress(String host) {
        Pattern compile = Pattern.compile(IPV4_PATTERN);
        Pattern compile2 = Pattern.compile(IPV6_PATTERN);
        if (compile.matcher(host).matches()) {
            return true;
        }
        return compile2.matcher(host).matches();
    }
}
