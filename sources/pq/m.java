package pq;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final oq.b f81153a;

    public m(Context context, String str) {
        this.f81153a = (TextUtils.isEmpty(a(context, str)) || Build.VERSION.SDK_INT < 26) ? new i(context, str) : new j(context, str);
    }

    public final String a(Context context, String str) {
        String b11 = n.b(context, str, "agc_plugin_", "crypto");
        if (b11 == null) {
            return null;
        }
        try {
            return new String(a.b(b11), "utf-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException e11) {
            Log.e("ReaderStrategy", "UnsupportedEncodingException" + e11.getMessage());
            return null;
        }
    }

    public String b(String str, String str2) {
        return this.f81153a.a(str, str2);
    }
}
