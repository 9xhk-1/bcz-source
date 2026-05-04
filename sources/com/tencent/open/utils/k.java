package com.tencent.open.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, com.tencent.a.a.a> f44603a = new ConcurrentHashMap<>();

    public static void a() {
        f44603a.clear();
    }

    public static String b(Context context, String str) {
        SLog.v("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString");
        String str2 = "";
        try {
            String packageName = context.getPackageName();
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(signatureArr[0].toByteArray());
            String a11 = m.a(messageDigest.digest());
            messageDigest.reset();
            SLog.v("openSDK_LOG.SystemUtils", "-->sign: " + a11);
            messageDigest.update(m.j(packageName + "_" + a11 + "_" + str + ""));
            str2 = m.a(messageDigest.digest());
            messageDigest.reset();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("-->signEncryped: ");
            sb2.append(str2);
            SLog.v("openSDK_LOG.SystemUtils", sb2.toString());
            return str2;
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString error", e11);
            return str2;
        }
    }

    public static boolean c(Context context, Intent intent) {
        boolean z11 = false;
        if (context != null && intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                SLog.i("openSDK_LOG.SystemUtils", "isAgentActivityExist? component null");
                return false;
            }
            String packageName = component.getPackageName();
            String a11 = a(context, packageName);
            if (a11 != null && !a11.isEmpty()) {
                z11 = true;
            }
            SLog.i("openSDK_LOG.SystemUtils", "isAgentActivityExist? packageName = " + packageName + ", appVersionName= " + a11);
        }
        return z11;
    }

    public static int d(Context context, String str) {
        return a(a(context, Constants.PACKAGE_TIM), str);
    }

    private static PackageInfo e(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        synchronized (k.class) {
            try {
                if (!f44603a.containsKey(str)) {
                    PackageInfo f11 = f(context, str);
                    f44603a.put(str, new com.tencent.a.a.a(str, f11));
                    return f11;
                }
                com.tencent.a.a.a aVar = f44603a.get(str);
                if (aVar == null) {
                    SLog.e("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper is null");
                    return null;
                }
                PackageInfo packageInfo = aVar.f42026b;
                if (packageInfo == null) {
                    SLog.e("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper packageInfo is null");
                }
                return packageInfo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static PackageInfo f(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo;
            }
            SLog.e("openSDK_LOG.SystemUtils", "realGetPackageInfo null. packageName= " + str);
            return packageInfo;
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.SystemUtils", "realGetPackageInfo exception", e11);
            return null;
        }
    }

    private static boolean g(Context context, String str) {
        return (h.a(context, c(), str) == null && e(context, str) == null) ? false : true;
    }

    public static void a(String str) {
        if (str == null) {
            return;
        }
        f44603a.remove(str);
    }

    public static String a(Context context, String str) {
        String a11 = h.a(context, c(), str);
        if (a11 != null && !"UNKNOWN".equals(a11)) {
            return a11;
        }
        PackageInfo e11 = e(context, str);
        if (e11 == null) {
            SLog.e("openSDK_LOG.SystemUtils", "getAppVersionName return null. package= " + str);
            return null;
        }
        return e11.versionName;
    }

    public static boolean d(Context context) {
        return context != null && context.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29 && !b();
    }

    public static int a(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i11 = 0;
        while (i11 < split.length && i11 < split2.length) {
            try {
                int parseInt = Integer.parseInt(split[i11]);
                int parseInt2 = Integer.parseInt(split2[i11]);
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i11++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (split.length > i11) {
            return 1;
        }
        return split2.length > i11 ? -1 : 0;
    }

    public static int c(Context context, String str) {
        return a(a(context, "com.tencent.mobileqq"), str);
    }

    public static boolean c(Context context) {
        if (g(context, "com.tencent.mobileqq")) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: qq");
            return true;
        }
        if (g(context, Constants.PACKAGE_TIM)) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: tim");
            return true;
        }
        if (g(context, Constants.PACKAGE_QQ_PAD)) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: pad");
            return true;
        }
        SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: disable speed");
        return false;
    }

    public static boolean a(Context context, String str, String str2) {
        SLog.v("openSDK_LOG.SystemUtils", "OpenUi, validateAppSignatureForPackage");
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                if (m.g(signature.toCharsString()).equals(str2)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean b(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("com.tencent.mobileqq");
        arrayList.add(Constants.PACKAGE_TIM);
        if (context != null && m.c(context)) {
            arrayList.add(Constants.PACKAGE_QQ_PAD);
        }
        return a(context, intent, arrayList);
    }

    private static String c() {
        String b11 = com.tencent.open.b.b.b();
        if (b11 != null && !b11.isEmpty()) {
            return b11;
        }
        SLog.e("openSDK_LOG.SystemUtils", "getAppId error: " + b11);
        return b11;
    }

    public static String a(Activity activity, String str) {
        if (activity == null) {
            SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName activity==null !!!!!!");
            return "";
        }
        try {
            byte[] a11 = e.a(str);
            if (a11 == null) {
                SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName shaBytes==null !!!!!!");
                return "";
            }
            byte[] bArr = new byte[8];
            System.arraycopy(a11, 5, bArr, 0, 8);
            byte[] bArr2 = new byte[16];
            System.arraycopy(a11, 8, bArr2, 0, 16);
            return e.a(activity.getPackageName(), e.a(bArr2), bArr);
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName", e11);
            return "";
        }
    }

    public static int b(String str) {
        return "shareToQQ".equals(str) ? Constants.REQUEST_QQ_SHARE : "shareToQzone".equals(str) ? Constants.REQUEST_QZONE_SHARE : "addToQQFavorites".equals(str) ? Constants.REQUEST_QQ_FAVORITES : "sendToMyComputer".equals(str) ? Constants.REQUEST_SEND_TO_MY_COMPUTER : "shareToTroopBar".equals(str) ? Constants.REQUEST_SHARE_TO_TROOP_BAR : "action_login".equals(str) ? Constants.REQUEST_LOGIN : "action_request".equals(str) ? 10100 : -1;
    }

    public static boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z11 = queryIntentActivities != null && queryIntentActivities.size() > 0;
            if (!z11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("isActivityExist false. result=");
                sb2.append(queryIntentActivities == null ? "null" : Integer.valueOf(queryIntentActivities.size()));
                sb2.append(" Intent= ");
                sb2.append(intent);
                SLog.e("openSDK_LOG.SystemUtils", sb2.toString());
            }
            return z11;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("isActivityExist params error! [");
        sb3.append(context == null);
        sb3.append(",");
        sb3.append(intent == null);
        sb3.append("]");
        SLog.e("openSDK_LOG.SystemUtils", sb3.toString());
        return false;
    }

    public static boolean b(Context context) {
        boolean g11 = g(context, "com.tencent.mobileqq");
        SLog.i("openSDK_LOG.SystemUtils", "isQQInstalled " + g11);
        return g11;
    }

    private static boolean b() {
        try {
            return ((Boolean) Environment.class.getMethod("isExternalStorageLegacy", null).invoke(Environment.class, null)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean a(Context context, Intent intent, List<String> list) {
        if (context != null && intent != null) {
            PackageManager packageManager = context.getPackageManager();
            if (!TextUtils.isEmpty(intent.getPackage())) {
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                boolean z11 = queryIntentActivities != null && queryIntentActivities.size() > 0;
                if (!z11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("isTargetActivityExist false. result=");
                    sb2.append(queryIntentActivities == null ? "null" : Integer.valueOf(queryIntentActivities.size()));
                    SLog.e("openSDK_LOG.SystemUtils", sb2.toString());
                }
                return z11;
            }
            if (list == null) {
                SLog.e("openSDK_LOG.SystemUtils", "isTargetActivityExist params error! targetPackageList is null");
                return false;
            }
            for (String str : list) {
                if (str != null) {
                    intent.setPackage(str);
                    List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
                    intent.setPackage(null);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() > 0) {
                        return true;
                    }
                }
            }
            SLog.e("openSDK_LOG.SystemUtils", "isTargetActivityExist false");
            return false;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("isTargetActivityExist params error! [");
        sb3.append(context == null);
        sb3.append(",");
        sb3.append(intent == null);
        sb3.append("]");
        SLog.e("openSDK_LOG.SystemUtils", sb3.toString());
        return false;
    }

    public static String a(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.SuppressLint({"SdCardPath"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r10, java.lang.String r11, int r12) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->extractSecureLib, libName: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.SystemUtils"
            com.tencent.open.log.SLog.i(r1, r0)
            android.content.Context r0 = com.tencent.open.utils.g.a()
            r2 = 0
            if (r0 != 0) goto L23
            java.lang.String r10 = "-->extractSecureLib, global context is null. "
            com.tencent.open.log.SLog.i(r1, r10)
            return r2
        L23:
            java.lang.String r3 = "secure_lib"
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r2)
            java.io.File r4 = new java.io.File
            java.io.File r5 = r0.getFilesDir()
            r4.<init>(r5, r11)
            boolean r5 = r4.exists()
            r6 = 1
            java.lang.String r7 = "version"
            if (r5 != 0) goto L50
            java.io.File r5 = r4.getParentFile()
            if (r5 == 0) goto L73
            boolean r5 = r5.mkdirs()
            if (r5 == 0) goto L73
            r4.createNewFile()     // Catch: java.io.IOException -> L4b
            goto L73
        L4b:
            r4 = move-exception
            r4.printStackTrace()
            goto L73
        L50:
            int r4 = r3.getInt(r7, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "-->extractSecureLib, libVersion: "
            r5.append(r8)
            r5.append(r12)
            java.lang.String r8 = " | oldVersion: "
            r5.append(r8)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.open.log.SLog.i(r1, r5)
            if (r12 != r4) goto L73
            return r6
        L73:
            r4 = 0
            android.content.res.AssetManager r5 = r0.getAssets()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La5
            java.io.InputStream r10 = r5.open(r10)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La5
            java.io.FileOutputStream r4 = r0.openFileOutput(r11, r2)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9d
            a(r10, r4)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9d
            android.content.SharedPreferences$Editor r11 = r3.edit()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9d
            r11.putInt(r7, r12)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9d
            r11.commit()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9d
            if (r10 == 0) goto L92
            r10.close()     // Catch: java.io.IOException -> L92
        L92:
            if (r4 == 0) goto L97
            r4.close()     // Catch: java.io.IOException -> L97
        L97:
            return r6
        L98:
            r11 = move-exception
            r9 = r4
            r4 = r10
            r10 = r9
            goto Lb8
        L9d:
            r11 = move-exception
            r9 = r4
            r4 = r10
            r10 = r9
            goto La7
        La2:
            r11 = move-exception
            r10 = r4
            goto Lb8
        La5:
            r11 = move-exception
            r10 = r4
        La7:
            java.lang.String r12 = "-->extractSecureLib, when copy lib execption."
            com.tencent.open.log.SLog.e(r1, r12, r11)     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto Lb1
            r4.close()     // Catch: java.io.IOException -> Lb1
        Lb1:
            if (r10 == 0) goto Lb6
            r10.close()     // Catch: java.io.IOException -> Lb6
        Lb6:
            return r2
        Lb7:
            r11 = move-exception
        Lb8:
            if (r4 == 0) goto Lbd
            r4.close()     // Catch: java.io.IOException -> Lbd
        Lbd:
            if (r10 == 0) goto Lc2
            r10.close()     // Catch: java.io.IOException -> Lc2
        Lc2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.utils.k.a(java.lang.String, java.lang.String, int):boolean");
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j11 += read;
            } else {
                SLog.i("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j11);
                return j11;
            }
        }
    }

    public static String a(int i11) {
        if (i11 == 10103) {
            return "shareToQQ";
        }
        if (i11 == 10104) {
            return "shareToQzone";
        }
        if (i11 == 10105) {
            return "addToQQFavorites";
        }
        if (i11 == 10106) {
            return "sendToMyComputer";
        }
        if (i11 == 10107) {
            return "shareToTroopBar";
        }
        if (i11 == 11101) {
            return "action_login";
        }
        if (i11 == 10100) {
            return "action_request";
        }
        if (i11 != 10114) {
            return null;
        }
        return "action_common_channel";
    }

    public static String a(Activity activity) {
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getApplicationContext().getPackageName(), 128);
            SLog.i("openSDK_LOG.SystemUtils", "apkPath=" + applicationInfo.sourceDir);
            return applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e11) {
            SLog.e("openSDK_LOG.SystemUtils", "NameNotFoundException", e11);
            return null;
        } catch (Exception e12) {
            SLog.e("openSDK_LOG.SystemUtils", "Exception", e12);
            return null;
        }
    }
}
