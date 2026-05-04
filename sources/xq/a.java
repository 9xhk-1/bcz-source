package xq;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import fr.l;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public static void a(Context context) {
        zq.a.a(context).f(null);
        zq.a.a(context).b();
    }

    public static void b(l<String> lVar, Context context, String str) {
        Exception exc;
        String a11 = yq.a.a(context);
        if (a11 == null) {
            Log.w("MarketHomeCountryByProvider", "get verify market package name is null");
            a(context);
            exc = new Exception("get verify market package name is null");
        } else {
            String format = String.format(Locale.ROOT, "content://%s.commondata/item/1", a11);
            if (d(context, Uri.parse(format), a11)) {
                c(lVar, context, format, str);
                return;
            } else {
                Log.w("MarketHomeCountryByProvider", "homeCountry uri is invalid");
                a(context);
                exc = new Exception("homeCountry uri is invalid");
            }
        }
        lVar.c(exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(fr.l<java.lang.String> r11, android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xq.a.c(fr.l, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static boolean d(Context context, Uri uri, String str) {
        if (uri != null && !TextUtils.isEmpty(str)) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(uri.getAuthority(), 0);
            if (resolveContentProvider != null) {
                ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
                if (applicationInfo == null || !TextUtils.equals(str, applicationInfo.packageName)) {
                    return false;
                }
                Log.i("MarketHomeCountryByProvider", "valid provider uri = " + uri);
                return true;
            }
            Log.w("MarketHomeCountryByProvider", "isProviderValid, invalid provider: " + uri);
        }
        return false;
    }
}
