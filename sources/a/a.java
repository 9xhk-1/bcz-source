package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.auth.AuthInfo;
import gw.a;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1056a = false;

    /* renamed from: b, reason: collision with root package name */
    public static AuthInfo f1057b;

    public static boolean a(Context context) {
        a.C0646a a11;
        return b(context) && (a11 = gw.a.a(context)) != null && a11.f57827c >= 10772;
    }

    public static boolean b(Context context) {
        List<ResolveInfo> queryIntentServices;
        String[] strArr = {BuildConfig.LIBRARY_PACKAGE_NAME, "com.sina.weibog3"};
        for (int i11 = 0; i11 < 2; i11++) {
            String str = strArr[i11];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (context != null && (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null && !queryIntentServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
