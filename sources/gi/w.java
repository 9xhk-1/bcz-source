package gi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53862a = "IReadingConifgHelper";

    /* renamed from: b, reason: collision with root package name */
    public static final String f53863b = "name";

    public static String a() {
        y9.e f11 = y9.e.f();
        if (!f11.e(y9.c.f99695c)) {
            return null;
        }
        try {
            return (String) f11.c(y9.c.f99695c, y9.b.f99687c);
        } catch (Exception e11) {
            qb.c.c(f53862a, "", e11);
            return null;
        }
    }

    public static Intent b(Context context) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("ireading://com.baicizhan.ireading/launch"));
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            return intent;
        }
        return null;
    }

    public static String c() {
        String str;
        y9.e f11 = y9.e.f();
        if (!f11.e(y9.c.f99695c)) {
            return ma.a.M2;
        }
        try {
            str = (String) f11.c(y9.c.f99695c, "id");
        } catch (Exception e11) {
            qb.c.c(f53862a, "", e11);
            str = null;
        }
        return str == null ? ma.a.M2 : str;
    }

    public static String d() {
        y9.e f11 = y9.e.f();
        if (!f11.e(y9.c.f99695c)) {
            return null;
        }
        try {
            return (String) ((Map) f11.c(y9.c.f99695c, "text")).get("name");
        } catch (Exception e11) {
            qb.c.c(f53862a, "", e11);
            return null;
        }
    }
}
