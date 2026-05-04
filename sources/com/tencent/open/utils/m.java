package com.tencent.open.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.core.content.FileProvider;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static String f44612a = "";

    /* renamed from: b, reason: collision with root package name */
    private static String f44613b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f44614c = "";

    /* renamed from: d, reason: collision with root package name */
    private static String f44615d = "";

    /* renamed from: e, reason: collision with root package name */
    private static int f44616e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static String f44617f = "0123456789ABCDEF";

    private static char a(int i11) {
        int i12 = i11 & 15;
        return (char) (i12 < 10 ? i12 + 48 : i12 + 87);
    }

    public static Bundle b(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle a11 = a(url.getQuery());
            a11.putAll(a(url.getRef()));
            return a11;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    public static JSONObject c(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject a11 = a((JSONObject) null, url.getQuery());
            a(a11, url.getRef());
            return a11;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    public static JSONObject d(String str) throws JSONException {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals(n6.m.f74525c)) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + com.alipay.sdk.m.u.i.f11099d;
        }
        return new JSONObject(str);
    }

    public static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    public static String f(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            SLog.e("openSDK_LOG.Util", "urlEncode: UnsupportedEncodingException", e11);
            return "";
        }
    }

    private static boolean g(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (k.a(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String a11 = a(messageDigest.digest());
                    messageDigest.reset();
                    if (a11.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e11) {
                    SLog.e("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e11.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean h(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean i(String str) {
        return str != null && new File(str).exists();
    }

    public static byte[] j(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            SLog.e("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e11);
            return new byte[0];
        }
    }

    public static String k(String str) {
        return a(str, 2);
    }

    public static File l(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                if (file.getParentFile().mkdirs()) {
                    file.createNewFile();
                    return file;
                }
                SLog.d("openSDK_LOG.Util", "createFile failed" + str);
                return file;
            }
            file.createNewFile();
        }
        return file;
    }

    public static boolean m(String str) {
        String b11 = b();
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(b11) || !str.contains(b11)) ? false : true;
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split("&")) {
                    String[] a11 = a(str2, ContainerUtils.KEY_VALUE_DELIMITER);
                    if (a11.length == 2) {
                        bundle.putString(URLDecoder.decode(a11[0]), URLDecoder.decode(a11[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    public static String e(Context context, String str) {
        if (context == null) {
            return "";
        }
        String d11 = d(context, str);
        f44614c = d11;
        return d11;
    }

    public static File h(Context context, String str) {
        File[] externalFilesDirs;
        if (context == null || (externalFilesDirs = context.getExternalFilesDirs(str)) == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    private static boolean i(Context context, String str) {
        try {
            return context.checkSelfPermission(str) != 0;
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.Util", "checkSelfPermission exception", e11);
            return false;
        }
    }

    public static boolean e(Context context) {
        return k.c(context, "8.1.8") >= 0;
    }

    public static boolean f(Context context, String str) {
        boolean z11 = !c(context) || k.a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z11 && k.a(context, Constants.PACKAGE_TIM) != null) {
            z11 = false;
        }
        return z11 ? k.c(context, str) < 0 : z11;
    }

    public static boolean b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo[] networkInfoArr;
        if (context == null || i(context, yk.e.f100168b) || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return true;
        }
        try {
            networkInfoArr = connectivityManager.getAllNetworkInfo();
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e11);
            networkInfoArr = null;
        }
        if (networkInfoArr != null && networkInfoArr.length != 0) {
            for (NetworkInfo networkInfo : networkInfoArr) {
                if (networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String c(Context context, String str) {
        if (context == null) {
            return "";
        }
        b(context, str);
        return f44613b;
    }

    public static boolean f(Context context) {
        return k.c(context, "5.9.5") >= 0;
    }

    public static String[] a(String str, String str2) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return new String[]{str};
        }
        return new String[]{str.substring(0, indexOf), str.substring(indexOf + str2.length())};
    }

    public static boolean c(Context context) {
        double d11;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            d11 = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        } catch (Throwable unused) {
            d11 = 0.0d;
        }
        return d11 > 6.5d;
    }

    public static String d(Context context, String str) {
        if (context == null) {
            return "";
        }
        b(context, str);
        return f44612a;
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split.length == 2) {
                    try {
                        split[0] = URLDecoder.decode(split[0]);
                        split[1] = URLDecoder.decode(split[1]);
                    } catch (Exception unused) {
                    }
                    try {
                        jSONObject.put(split[0], split[1]);
                    } catch (JSONException e11) {
                        SLog.e("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e11.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String g(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(j(str));
            byte[] digest = messageDigest.digest();
            if (digest == null) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                sb2.append(a(b11 >>> 4));
                sb2.append(a(b11));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e11) {
            SLog.e("openSDK_LOG.Util", "encrypt has exception: " + e11.getMessage());
            return str;
        }
    }

    public static void b(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            String str2 = packageInfo.versionName;
            f44613b = str2;
            f44612a = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f44613b;
            f44615d = str3.substring(str3.lastIndexOf(46) + 1, f44613b.length());
            f44616e = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            SLog.e("openSDK_LOG.Util", "getPackageInfo has exception: " + e11.getMessage());
        } catch (Exception e12) {
            SLog.e("openSDK_LOG.Util", "getPackageInfo has exception: " + e12.getMessage());
        }
    }

    public static boolean d(Context context) {
        return k.c(context, "8.1.5") >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x00aa, Exception -> 0x00b1, TRY_LEAVE, TryCatch #22 {Exception -> 0x00b1, all -> 0x00aa, blocks: (B:25:0x0064, B:27:0x006c, B:39:0x00b7, B:41:0x00bd, B:42:0x00c0, B:44:0x00cf, B:45:0x00d2), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7 A[Catch: all -> 0x00aa, Exception -> 0x00b1, TRY_ENTER, TryCatch #22 {Exception -> 0x00b1, all -> 0x00aa, blocks: (B:25:0x0064, B:27:0x006c, B:39:0x00b7, B:41:0x00bd, B:42:0x00c0, B:44:0x00cf, B:45:0x00d2), top: B:24:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.Context r11, android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.utils.m.c(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static boolean a(Context context, String str) {
        boolean z11;
        try {
            z11 = g(context);
            try {
                if (z11) {
                    a(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (z11) {
                    try {
                        try {
                            try {
                                a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                                return true;
                            } catch (Exception unused2) {
                                return false;
                            }
                        } catch (Exception unused3) {
                            a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                            return true;
                        }
                    } catch (Exception unused4) {
                        a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    }
                }
                try {
                    try {
                        a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    } catch (Exception unused5) {
                        return false;
                    }
                } catch (Exception unused6) {
                    a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                    return true;
                }
            }
        } catch (Exception unused7) {
            z11 = false;
        }
    }

    @SuppressLint({"NewApi"})
    public static String b(Context context, Uri uri) {
        Uri uri2;
        if (uri == null) {
            return null;
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String authority = uri.getAuthority();
            if ("com.android.externalstorage.documents".equals(authority)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                String str = split[0];
                if (com.baicizhan.main.home.plan.module.exam.b.f22502a.equals(str)) {
                    return Environment.getExternalStorageDirectory().getAbsolutePath().concat("/").concat(split[1]);
                }
                return "/storage/".concat(str).concat("/").concat(split[1]);
            }
            if ("com.android.providers.downloads.documents".equals(authority)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (documentId.startsWith("raw:")) {
                    return documentId.replaceFirst("raw:", "");
                }
                return c(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)));
            }
            if ("com.android.providers.media.documents".equals(authority)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str2 = split2[0];
                if ("image".equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return c(context, ContentUris.withAppendedId(uri2, Long.parseLong(split2[1])));
            }
            return null;
        }
        String scheme = uri.getScheme();
        if ("content".equals(scheme)) {
            return c(context, uri);
        }
        if ("file".equals(scheme)) {
            return uri.getPath();
        }
        return null;
    }

    public static boolean g(Context context, String str) {
        boolean z11 = !c(context) || k.a(context, Constants.PACKAGE_QQ_PAD) == null;
        return z11 ? k.c(context, str) < 0 : z11;
    }

    private static void a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    public static boolean a() {
        return (Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null) != null;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            String num = Integer.toString(b11 & 255, 16);
            if (num.length() == 1) {
                num = "0" + num;
            }
            sb2.append(num);
        }
        return sb2.toString();
    }

    public static final String a(Context context) {
        CharSequence applicationLabel;
        if (context == null || (applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo())) == null) {
            return null;
        }
        return applicationLabel.toString();
    }

    public static final String a(String str, int i11, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UTF-8";
        }
        try {
            if (str.getBytes(str2).length > i11) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < str.length()) {
                    int i14 = i12 + 1;
                    i13 += str.substring(i12, i14).getBytes(str2).length;
                    if (i13 > i11) {
                        String substring = str.substring(0, i12);
                        if (TextUtils.isEmpty(str3)) {
                            return substring;
                        }
                        return substring + str3;
                    }
                    i12 = i14;
                }
            }
            return str;
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.Util", "Util.subString has exception: " + e11.getMessage());
            return str;
        }
    }

    public static String b() {
        File e11 = g.e();
        if (e11 == null) {
            return null;
        }
        if (!e11.exists()) {
            e11.mkdirs();
        }
        return e11.toString();
    }

    public static boolean b(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            return a(file, l(str2));
        } catch (IOException e11) {
            SLog.d("openSDK_LOG.Util", "copy fail from " + str + " to " + str2 + " ", e11);
            return false;
        }
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6) {
        return a(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString("app_id", str5);
        bundle.putString("result", str6);
        bundle.putString("type", str7);
        bundle.putString("login_status", str8);
        bundle.putString("need_user_auth", str9);
        bundle.putString("to_uin", str10);
        bundle.putString("call_source", str11);
        bundle.putString("to_type", str12);
        bundle.putString(Constants.PARAM_PLATFORM, "1");
        return bundle;
    }

    public static boolean c() {
        Context a11 = g.a();
        return a11 != null && a11.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", a11.getPackageName()) == 0;
    }

    public static boolean a(Context context, boolean z11) {
        return (c(context) && k.a(context, Constants.PACKAGE_QQ_PAD) != null) || k.c(context, "4.1") >= 0 || k.a(context, Constants.PACKAGE_TIM) != null;
    }

    public static long a(Context context, Uri uri) {
        Cursor query = context.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
        long j11 = 0;
        if (query != null) {
            try {
                if (query.getCount() != 0) {
                    try {
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("_size");
                        if (query.moveToFirst()) {
                            j11 = query.getLong(columnIndexOrThrow);
                        }
                    } catch (Exception e11) {
                        SLog.e("openSDK_LOG.Util", "cursor exception", e11);
                    }
                    try {
                        query.close();
                    } catch (Exception e12) {
                        SLog.e("openSDK_LOG.Util", "cursor exception", e12);
                    }
                    return j11;
                }
            } finally {
            }
        }
        return 0L;
    }

    public static String a(String str, int i11) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes("UTF-8"), i11);
            } catch (UnsupportedEncodingException e11) {
                SLog.e("openSDK_LOG.Util", "convert2Base64String exception: " + e11.getMessage());
                return "";
            }
        }
        return "";
    }

    public static Drawable a(String str, Context context) {
        InputStream inputStream;
        StringBuilder sb2;
        InputStream inputStream2 = null;
        r1 = null;
        Drawable drawable = null;
        if (context == null) {
            SLog.e("openSDK_LOG.Util", "context null!");
            return null;
        }
        try {
            inputStream = context.getAssets().open(str);
            try {
                try {
                    drawable = Drawable.createFromStream(inputStream, str);
                    try {
                        inputStream.close();
                    } catch (Exception e11) {
                        e = e11;
                        sb2 = new StringBuilder();
                        sb2.append("inputStream close exception: ");
                        sb2.append(e.getMessage());
                        SLog.e("openSDK_LOG.Util", sb2.toString());
                        return drawable;
                    }
                } catch (IOException e12) {
                    e = e12;
                    SLog.e("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStream.close();
                    } catch (Exception e13) {
                        e = e13;
                        sb2 = new StringBuilder();
                        sb2.append("inputStream close exception: ");
                        sb2.append(e.getMessage());
                        SLog.e("openSDK_LOG.Util", sb2.toString());
                        return drawable;
                    }
                    return drawable;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                try {
                    inputStream2.close();
                } catch (Exception e14) {
                    SLog.e("openSDK_LOG.Util", "inputStream close exception: " + e14.getMessage());
                }
                throw th;
            }
        } catch (IOException e15) {
            e = e15;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2.close();
            throw th;
        }
        return drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static boolean a(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file2.exists()) {
                    file2.delete();
                }
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream((File) file2);
                try {
                    file2 = new BufferedInputStream(new FileInputStream(file));
                } catch (IOException e11) {
                    e = e11;
                    file2 = 0;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    file2 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    file2 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
            file2 = 0;
        } catch (OutOfMemoryError e14) {
            e = e14;
            file2 = 0;
        } catch (Throwable th4) {
            th = th4;
            file2 = 0;
        }
        try {
            byte[] bArr = new byte[102400];
            while (true) {
                int read = file2.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                    fileOutputStream.flush();
                } else {
                    try {
                        break;
                    } catch (IOException e15) {
                        SLog.e("openSDK_LOG.Util", "copyFile error, ", e15);
                    }
                }
            }
            fileOutputStream.close();
            try {
                file2.close();
            } catch (IOException e16) {
                SLog.e("openSDK_LOG.Util", "copyFile error, ", e16);
            }
            return true;
        } catch (IOException e17) {
            e = e17;
            fileOutputStream2 = fileOutputStream;
            file2 = file2;
            SLog.e("openSDK_LOG.Util", "copyFile error, ", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e18) {
                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e18);
                }
            }
            if (file2 == 0) {
                return false;
            }
            try {
                file2.close();
                return false;
            } catch (IOException e19) {
                SLog.e("openSDK_LOG.Util", "copyFile error, ", e19);
                return false;
            }
        } catch (OutOfMemoryError e21) {
            e = e21;
            fileOutputStream2 = fileOutputStream;
            file2 = file2;
            SLog.e("openSDK_LOG.Util", "copyFile error, ", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e22) {
                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e22);
                }
            }
            if (file2 == 0) {
                return false;
            }
            file2.close();
            return false;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e23) {
                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e23);
                }
            }
            if (file2 != 0) {
                try {
                    file2.close();
                    throw th;
                } catch (IOException e24) {
                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e24);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        boolean b11 = b(str, str2);
        SLog.i("openSDK_LOG.Util", "copyFileByCheckPermission() copy success:" + b11);
        return b11;
    }

    public static String a(String str, Activity activity, String str2, IUiListener iUiListener) {
        String str3;
        try {
            boolean m11 = m(str2);
            SLog.i("openSDK_LOG.Util", "doPublishMood() check file: isAppSpecificDir=" + m11 + ",hasSDPermission=" + c());
            if (!m11) {
                File a11 = g.a("Images");
                if (a11 != null) {
                    str3 = a11.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                } else {
                    File cacheDir = g.a().getCacheDir();
                    if (cacheDir == null) {
                        SLog.e("openSDK_LOG.Util", "getMediaFileUri error, cacheDir is null");
                        return null;
                    }
                    str3 = cacheDir.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                }
                File file = new File(str2);
                String absolutePath = file.getAbsolutePath();
                String str4 = str3 + File.separator + file.getName();
                str2 = b(absolutePath, str4) ? str4 : null;
            }
            Uri a12 = a(activity, str, str2);
            if (a12 == null) {
                return null;
            }
            return a12.toString();
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.Util", "getMediaFileUri error", e11);
            return null;
        }
    }

    public static boolean a(Map<String, Object> map, String str, boolean z11) {
        if (map == null) {
            SLog.e("openSDK_LOG.Util", "getBoolean error, params==null");
            return z11;
        }
        if (!map.containsKey(str)) {
            SLog.e("openSDK_LOG.Util", "getBoolean error, not comtain : " + str);
            return z11;
        }
        Object obj = map.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z11;
    }

    public static String a(Map<String, Object> map, String str, String str2) {
        if (map == null) {
            SLog.e("openSDK_LOG.Util", "getString error, params==null");
            return str2;
        }
        if (!map.containsKey(str)) {
            SLog.e("openSDK_LOG.Util", "getString error, not comtain : " + str);
            return str2;
        }
        Object obj = map.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public static Uri a(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SLog.e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion -- stringForFileUri is empty");
            return null;
        }
        try {
            String authorities = Tencent.getAuthorities(str);
            if (TextUtils.isEmpty(authorities)) {
                return null;
            }
            Uri uriForFile = FileProvider.getUriForFile(activity, authorities, new File(str2));
            activity.grantUriPermission("com.tencent.mobileqq", uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_TIM, uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_QQ_PAD, uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_QQ_SPEED, uriForFile, 3);
            return uriForFile;
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion exception:", e11);
            return null;
        }
    }
}
