package gw;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import com.sina.weibo.BuildConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gw.a$a, reason: collision with other inner class name */
    public static class C0646a {

        /* renamed from: a, reason: collision with root package name */
        public String f57825a = BuildConfig.LIBRARY_PACKAGE_NAME;

        /* renamed from: b, reason: collision with root package name */
        public String f57826b = "com.sina.weibo.SSOActivity";

        /* renamed from: c, reason: collision with root package name */
        public int f57827c;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static gw.a.C0646a a(android.content.Context r14) {
        /*
            java.lang.String r0 = "com.sina.weibo"
            java.lang.String r1 = "com.sina.weibog3"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = r1
        La:
            r3 = 0
            r4 = 2
            if (r2 >= r4) goto Lc4
            r5 = r0[r2]
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "com.sina.weibo.action.sdkidentity"
            r6.<init>(r7)
            r6.setPackage(r5)
            java.lang.String r7 = "android.intent.category.DEFAULT"
            r6.addCategory(r7)
            if (r14 == 0) goto Lc0
            android.content.pm.PackageManager r7 = r14.getPackageManager()
            java.util.List r6 = r7.queryIntentServices(r6, r1)
            if (r6 == 0) goto Lc0
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto Lc0
            java.util.Iterator r6 = r6.iterator()
        L35:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc0
            java.lang.Object r7 = r6.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.pm.ServiceInfo r8 = r7.serviceInfo
            if (r8 == 0) goto L35
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 == 0) goto L35
            java.lang.String r8 = r8.packageName
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L52
            goto L35
        L52:
            android.content.pm.ServiceInfo r7 = r7.serviceInfo
            java.lang.String r7 = r7.packageName
            boolean r8 = android.text.TextUtils.equals(r5, r7)
            if (r8 == 0) goto L35
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L63
            goto Lbc
        L63:
            android.content.Context r8 = r14.createPackageContext(r7, r4)     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r9 = "weibo_for_sdk.json"
            java.io.InputStream r8 = r8.open(r9)     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r9.<init>()     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r11 = new byte[r10]     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
        L7a:
            int r12 = r8.read(r11, r1, r10)     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r13 = -1
            if (r12 == r13) goto L90
            java.lang.String r13 = new java.lang.String     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r13.<init>(r11, r1, r12)     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r9.append(r13)     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            goto L7a
        L8a:
            r7 = move-exception
            goto Lb1
        L8c:
            r7 = move-exception
            goto Lb5
        L8e:
            r7 = move-exception
            goto Lb9
        L90:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r9 = r9.toString()     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r8.<init>(r9)     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            gw.a$a r9 = new gw.a$a     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r9.<init>()     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r10 = "support_api"
            int r10 = r8.optInt(r10, r13)     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r9.f57827c = r10     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r10 = "authActivityName"
            java.lang.String r8 = r8.optString(r10, r3)     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r9.f57826b = r8     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            r9.f57825a = r7     // Catch: org.json.JSONException -> L8a java.io.IOException -> L8c android.content.pm.PackageManager.NameNotFoundException -> L8e
            goto Lbd
        Lb1:
            r7.printStackTrace()
            goto Lbc
        Lb5:
            r7.printStackTrace()
            goto Lbc
        Lb9:
            r7.printStackTrace()
        Lbc:
            r9 = r3
        Lbd:
            if (r9 == 0) goto L35
            return r9
        Lc0:
            int r2 = r2 + 1
            goto La
        Lc4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.a.a(android.content.Context):gw.a$a");
    }

    public static boolean b(Context context, Intent intent) {
        PackageManager packageManager;
        ResolveInfo resolveActivity;
        if (context == null || (packageManager = context.getPackageManager()) == null || (resolveActivity = packageManager.resolveActivity(intent, 0)) == null) {
            return false;
        }
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures;
            if (signatureArr != null) {
                for (Signature signature : signatureArr) {
                    if ("18da2bf10352443a00a5e046d9fca6bd".equals(d.a(signature.toByteArray()))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
