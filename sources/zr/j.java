package zr;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102846a = "SafeStringBuilder";

    /* renamed from: b, reason: collision with root package name */
    public static final String f102847b = "";

    public static String a(StringBuilder sb2, int i11) {
        if (!TextUtils.isEmpty(sb2) && sb2.length() >= i11 && i11 >= 0) {
            try {
                return sb2.substring(i11);
            } catch (Exception e11) {
                Log.e(f102846a, "substring exception: " + e11.getMessage());
            }
        }
        return "";
    }

    public static String b(StringBuilder sb2, int i11, int i12) {
        if (!TextUtils.isEmpty(sb2) && i11 >= 0 && i12 <= sb2.length() && i12 >= i11) {
            try {
                return sb2.substring(i11, i12);
            } catch (Exception e11) {
                Log.e(f102846a, "substring: " + e11.getMessage());
            }
        }
        return "";
    }
}
