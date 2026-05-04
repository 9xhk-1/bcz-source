package w2;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f94618a = "UTF-8";

    /* renamed from: b, reason: collision with root package name */
    public static String f94619b = "=";

    /* renamed from: c, reason: collision with root package name */
    public static String f94620c = "&";

    public static String a(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        StringBuilder sb2 = new StringBuilder();
        for (String str : keySet) {
            sb2.append(b(str, f94618a));
            sb2.append(f94619b);
            sb2.append(b(map.get(str), f94618a));
            sb2.append(f94620c);
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static String b(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalArgumentException(e11);
        }
    }
}
