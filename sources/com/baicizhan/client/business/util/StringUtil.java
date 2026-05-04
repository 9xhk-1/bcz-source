package com.baicizhan.client.business.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class StringUtil {
    private static Pattern EMAIL_ADDR_PATTERN = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
    private static Pattern MOBILE_PHONE_PATTERN = Pattern.compile("^[0-9]{11}$");

    public static String appendUrlQueryParam(String oldUrl, String query) {
        try {
            URI uri = new URI(oldUrl);
            String query2 = uri.getQuery();
            if (query2 != null) {
                query = query2 + "&" + query;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query, uri.getFragment()).toString();
        } catch (URISyntaxException e11) {
            e11.printStackTrace();
            return oldUrl;
        }
    }

    public static String firstLine(String text) {
        String replace = text.trim().replace('\r', '\n');
        int indexOf = replace.indexOf(10);
        return indexOf == -1 ? replace : replace.substring(0, indexOf);
    }

    public static boolean isAllLetters(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isLetter(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidEmailAddr(String text) {
        return EMAIL_ADDR_PATTERN.matcher(text).matches();
    }

    public static boolean isValidMobilePhone(String text) {
        return MOBILE_PHONE_PATTERN.matcher(text).matches();
    }

    public static String md5Hex(String data, boolean uppercase) {
        String o11 = xb.f.o(data);
        return uppercase ? o11.toUpperCase() : o11;
    }

    public static String unlines(String text) {
        return text.replace(c1.g.f7467d, "").replace("\n", "");
    }
}
