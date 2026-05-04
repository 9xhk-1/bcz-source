package com.alipay.sdk.m.u;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.m.m.a;
import com.baicizhan.client.business.util.ErrCodes;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11111a = "com.alipay.android.app";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11112b = "com.eg.android.AlipayGphone";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11113c = "hk.alipay.wallet";

    /* renamed from: d, reason: collision with root package name */
    public static final String f11114d = "hk.alipay.walletRC";

    /* renamed from: e, reason: collision with root package name */
    public static final String f11115e = "com.eg.android.AlipayGphoneRC";

    /* renamed from: f, reason: collision with root package name */
    public static final int f11116f = 99;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11118h = 125;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11119i = 460;

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f11117g = {"10.1.5.1013151", "10.1.5.1013148"};

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f11120j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '+', '/'};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f11121a;

        public a(Activity activity) {
            this.f11121a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11121a.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f11122a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f11123b;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.f11122a = runnable;
            this.f11123b = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11122a.run();
            } finally {
                this.f11123b.open();
            }
        }
    }

    public static String a(String str, String str2, String str3) {
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf <= str.length()) {
                return "";
            }
            int indexOf2 = !TextUtils.isEmpty(str2) ? str3.indexOf(str2, indexOf) : 0;
            return indexOf2 < 1 ? str3.substring(indexOf) : str3.substring(indexOf, indexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        return "-1;-1";
    }

    public static String c(String str) {
        return (EnvUtils.isSandBox() && TextUtils.equals(str, f11115e)) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static int d(String str) {
        for (int i11 = 0; i11 < 64; i11++) {
            if (str.equals(String.valueOf(f11120j[i11]))) {
                return i11;
            }
        }
        return 0;
    }

    public static String e(com.alipay.sdk.m.s.a aVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e11) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.B, e11);
            return "";
        }
    }

    public static String f() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String g(Context context) {
        return " (" + f() + i.f11097b + e() + i.f11097b + c(context) + i.f11097b + i.f11097b + f(context) + pn.j.f81007d + "(sdk android)";
    }

    public static JSONObject h(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String i(String str) {
        try {
            Uri parse = Uri.parse(str);
            return String.format("%s%s", parse.getAuthority(), parse.getPath());
        } catch (Throwable th2) {
            e.a(th2);
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    public static String b() {
        if (EnvUtils.isSandBox()) {
            return TextUtils.equals("hk.alipay.wallet", com.alipay.sdk.m.j.a.f10605d.get(0).f10834a) ? f11114d : f11115e;
        }
        try {
            return com.alipay.sdk.m.j.a.f10605d.get(0).f10834a;
        } catch (Throwable unused) {
            return f11112b;
        }
    }

    public static String f(Context context) {
        DisplayMetrics d11 = d(context);
        return d11.widthPixels + "*" + d11.heightPixels;
    }

    public static String c(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String d() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            } catch (Throwable th2) {
                bufferedReader.close();
                throw th2;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static String e() {
        String d11 = d();
        int indexOf = d11.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (indexOf != -1) {
            d11 = d11.substring(0, indexOf);
        }
        int indexOf2 = d11.indexOf("\n");
        if (indexOf2 != -1) {
            d11 = d11.substring(0, indexOf2);
        }
        return "Linux " + d11;
    }

    public static boolean h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(f11111a, 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER, 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    public static boolean h() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final PackageInfo f11124a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11125b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11126c;

        public c(PackageInfo packageInfo, int i11, String str) {
            this.f11124a = packageInfo;
            this.f11125b = i11;
            this.f11126c = str;
        }

        public boolean a(com.alipay.sdk.m.s.a aVar) {
            Signature[] signatureArr = this.f11124a.signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                for (Signature signature : signatureArr) {
                    String a11 = n.a(aVar, signature.toByteArray());
                    if (a11 != null && !TextUtils.equals(a11, this.f11126c)) {
                        com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.D, String.format("Got %s, expected %s", a11, this.f11126c));
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean a() {
            return this.f11124a.versionCode < this.f11125b;
        }
    }

    public static boolean i() {
        try {
            String[] split = com.alipay.sdk.m.m.a.D().g().split("\\|");
            String str = Build.MODEL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str2 : split) {
                if (TextUtils.equals(str, str2) || TextUtils.equals(str2, TtmlNode.COMBINE_ALL)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e.a(th2);
            return false;
        }
    }

    public static String a(com.alipay.sdk.m.s.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e11) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10657n, com.alipay.sdk.m.k.b.f10677x, e11);
            return null;
        }
    }

    public static String c(com.alipay.sdk.m.s.a aVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ct.d.f46852f, String.class).invoke(null, str);
        } catch (Exception e11) {
            com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10653l, "rflex", e11.getClass().getSimpleName());
            return null;
        }
    }

    public static boolean f(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static String e(Context context) {
        String b11 = m.b(context);
        return b11.substring(0, b11.indexOf("://"));
    }

    public static String g(String str) {
        return a(str, true);
    }

    public static int g() {
        try {
            return Process.myUid();
        } catch (Throwable th2) {
            e.a(th2);
            return ErrCodes.ERR_TOKEN_LOST;
        }
    }

    public static int c() {
        try {
            String lowerCase = Build.BRAND.toLowerCase();
            String lowerCase2 = Build.MANUFACTURER.toLowerCase();
            if (a("huawei", lowerCase, lowerCase2)) {
                return 1;
            }
            if (a("oppo", lowerCase, lowerCase2)) {
                return 2;
            }
            if (a("vivo", lowerCase, lowerCase2)) {
                return 4;
            }
            if (a("lenovo", lowerCase, lowerCase2)) {
                return 8;
            }
            if (a("xiaomi", lowerCase, lowerCase2)) {
                return 16;
            }
            return a("oneplus", lowerCase, lowerCase2) ? 32 : 0;
        } catch (Exception unused) {
            return 61440;
        }
    }

    public static int e(String str) {
        try {
            String j11 = com.alipay.sdk.m.m.a.D().j();
            if (TextUtils.isEmpty(j11)) {
                return 0;
            }
            return (b(j11, "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static Map<String, String> b(com.alipay.sdk.m.s.a aVar, String str) {
        HashMap hashMap = new HashMap(4);
        int indexOf = str.indexOf(63);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            for (String str2 : str.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61, 1);
                if (indexOf2 != -1 && indexOf2 < str2.length() - 1) {
                    hashMap.put(str2.substring(0, indexOf2), e(aVar, str2.substring(indexOf2 + 1)));
                }
            }
        }
        return hashMap;
    }

    public static DisplayMetrics d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static c a(com.alipay.sdk.m.s.a aVar, Context context, List<a.b> list) {
        c a11;
        if (list == null) {
            return null;
        }
        for (a.b bVar : list) {
            if (bVar != null && (a11 = a(aVar, context, bVar.f10834a, bVar.f10835b, bVar.f10836c)) != null && !a11.a(aVar) && !a11.a()) {
                return a11;
            }
        }
        return null;
    }

    public static boolean d(com.alipay.sdk.m.s.a aVar, String str) {
        int e11;
        try {
            e11 = e(str);
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "bindExt", "" + e11);
        } catch (Throwable unused) {
        }
        return com.alipay.sdk.m.m.a.D().o() && (e11 & 2) == 2;
    }

    public static c a(com.alipay.sdk.m.s.a aVar, Context context, String str, int i11, String str2) {
        PackageInfo packageInfo;
        if (EnvUtils.isSandBox()) {
            if (f11112b.equals(str)) {
                str = f11115e;
            } else if ("hk.alipay.wallet".equals(str)) {
                str = f11114d;
            }
        }
        try {
            packageInfo = a(context, str);
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10657n, com.alipay.sdk.m.k.b.f10673v, th2.getMessage());
            packageInfo = null;
        }
        if (a(aVar, packageInfo)) {
            return a(packageInfo, i11, str2);
        }
        return null;
    }

    public static String b(com.alipay.sdk.m.s.a aVar, Context context) {
        return a(aVar, context, context.getPackageName());
    }

    public static int b(int i11) {
        return i11 / 100000;
    }

    public static boolean a(com.alipay.sdk.m.s.a aVar, PackageInfo packageInfo) {
        String str = "";
        boolean z11 = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                z11 = true;
            }
        }
        if (!z11) {
            com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10657n, com.alipay.sdk.m.k.b.f10675w, str);
        }
        return z11;
    }

    public static String b(String str, String str2) {
        String string = Settings.Secure.getString(((Application) com.alipay.sdk.m.s.b.d().b()).getContentResolver(), str);
        return string != null ? string : str2;
    }

    public static boolean b(com.alipay.sdk.m.s.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f11019g)) {
            return false;
        }
        return aVar.f11019g.toLowerCase().contains(com.alipay.sdk.m.k.b.f10657n);
    }

    public static PackageInfo a(Context context, String str) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    public static c a(PackageInfo packageInfo, int i11, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new c(packageInfo, i11, str);
    }

    public static long a(String str) {
        return a(str, 6);
    }

    public static long a(String str, int i11) {
        int pow = (int) Math.pow(2.0d, i11);
        int length = str.length();
        long j11 = 0;
        int i12 = length;
        for (int i13 = 0; i13 < length; i13++) {
            j11 += Integer.parseInt(String.valueOf(d(str.substring(i13, r5)))) * ((long) Math.pow(pow, i12 - 1));
            i12--;
        }
        return j11;
    }

    public static int a() {
        String c11 = com.alipay.sdk.m.s.b.d().c();
        if (TextUtils.isEmpty(c11)) {
            return -1;
        }
        String replaceAll = c11.replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
        if (replaceAll.length() >= 5) {
            replaceAll = replaceAll.substring(0, 5);
        }
        int a11 = (int) (a(replaceAll) % 10000);
        return a11 < 0 ? a11 * (-1) : a11;
    }

    public static boolean a(com.alipay.sdk.m.s.a aVar, Context context, List<a.b> list, boolean z11) {
        try {
            for (a.b bVar : list) {
                if (bVar != null) {
                    String str = bVar.f10834a;
                    if (EnvUtils.isSandBox()) {
                        if (f11112b.equals(str)) {
                            str = f11115e;
                        } else if ("hk.alipay.wallet".equals(str)) {
                            str = f11114d;
                        }
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z11) {
                                return true;
                            }
                            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.X, packageInfo.packageName + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10648h0, th2);
            return false;
        }
    }

    public static boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = f11117g;
            if (!TextUtils.equals(str, strArr[0])) {
                if (!TextUtils.equals(str, strArr[1])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(int i11) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb2.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb2.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb2.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb2.toString();
    }

    public static boolean a(com.alipay.sdk.m.s.a aVar, String str, Activity activity) {
        int parseInt;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (!str.toLowerCase().startsWith(com.alipay.sdk.m.l.a.f10711n.toLowerCase()) && !str.toLowerCase().startsWith(com.alipay.sdk.m.l.a.f10712o.toLowerCase())) {
            if (!TextUtils.equals(str, com.alipay.sdk.m.l.a.f10714q) && !TextUtils.equals(str, a("http", com.alipay.sdk.m.l.a.f10716s))) {
                if (!str.startsWith(com.alipay.sdk.m.l.a.f10713p)) {
                    return false;
                }
                try {
                    String substring2 = str.substring(str.indexOf(com.alipay.sdk.m.l.a.f10713p) + 24);
                    parseInt = Integer.parseInt(substring2.substring(substring2.lastIndexOf(com.alipay.sdk.m.l.a.f10717t) + 10));
                } catch (Exception unused) {
                    com.alipay.sdk.m.j.b.a(com.alipay.sdk.m.j.b.e());
                }
                if (parseInt != com.alipay.sdk.m.j.c.SUCCEEDED.b() && parseInt != com.alipay.sdk.m.j.c.PAY_WAITTING.b()) {
                    com.alipay.sdk.m.j.c b11 = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.FAILED.b());
                    com.alipay.sdk.m.j.b.a(com.alipay.sdk.m.j.b.a(b11.b(), b11.a(), ""));
                    activity.runOnUiThread(new a(activity));
                    return true;
                }
                if (com.alipay.sdk.m.l.a.f10721x) {
                    StringBuilder sb2 = new StringBuilder();
                    String decode = URLDecoder.decode(str);
                    String decode2 = URLDecoder.decode(decode);
                    String str2 = decode2.substring(decode2.indexOf(com.alipay.sdk.m.l.a.f10713p) + 24, decode2.lastIndexOf(com.alipay.sdk.m.l.a.f10717t)).split(com.alipay.sdk.m.l.a.f10719v)[0];
                    int indexOf = decode.indexOf(com.alipay.sdk.m.l.a.f10719v) + 12;
                    sb2.append(str2);
                    sb2.append(com.alipay.sdk.m.l.a.f10719v);
                    sb2.append(decode.substring(indexOf, decode.indexOf("&", indexOf)));
                    sb2.append(decode.substring(decode.indexOf("&", indexOf)));
                    substring = sb2.toString();
                } else {
                    String decode3 = URLDecoder.decode(str);
                    substring = decode3.substring(decode3.indexOf(com.alipay.sdk.m.l.a.f10713p) + 24, decode3.lastIndexOf(com.alipay.sdk.m.l.a.f10717t));
                }
                com.alipay.sdk.m.j.c b12 = com.alipay.sdk.m.j.c.b(parseInt);
                com.alipay.sdk.m.j.b.a(com.alipay.sdk.m.j.b.a(b12.b(), b12.a(), substring));
                activity.runOnUiThread(new a(activity));
                return true;
            }
            com.alipay.sdk.m.j.b.a(com.alipay.sdk.m.j.b.a());
            activity.finish();
            return true;
        }
        try {
            c a11 = a(aVar, activity, com.alipay.sdk.m.j.a.f10605d);
            if (a11 != null && !a11.a() && !a11.a(aVar)) {
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst("intent://platformapi/startapp\\?", com.alipay.sdk.m.l.a.f10711n);
                }
                activity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    public static String a(com.alipay.sdk.m.s.a aVar, Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionName;
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10673v, th2);
            return "";
        }
    }

    public static String a(String str, boolean z11) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (z11 && digest.length > 16) {
                byte[] bArr = new byte[16];
                System.arraycopy(digest, 0, bArr, 0, 16);
                return a(bArr);
            }
            return a(digest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            sb2.append(Character.forDigit((b11 & 240) >> 4, 16));
            sb2.append(Character.forDigit(b11 & 15, 16));
        }
        return sb2.toString();
    }

    public static ActivityInfo a(Context context) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            e.a(th2);
            return null;
        }
    }

    public static String a(com.alipay.sdk.m.s.a aVar) {
        return c(aVar, "ro.build.fingerprint");
    }

    public static <T> T a(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static boolean a(com.alipay.sdk.m.s.a aVar, String str) {
        try {
            String host = new URL(str).getHost();
            if (host.endsWith(com.alipay.sdk.m.l.a.B)) {
                return true;
            }
            return host.endsWith(com.alipay.sdk.m.l.a.C);
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "ckUrlErr", th2);
            return false;
        }
    }

    public static JSONObject a(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    hashMap.put(next, jSONObject.optString(next));
                } catch (Throwable th2) {
                    e.a(th2);
                }
            }
        }
        return hashMap;
    }

    public static boolean a(Object obj, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return obj == null;
        }
        for (Object obj2 : objArr) {
            if ((obj == null && obj2 == null) || (obj != null && obj.equals(obj2))) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(long j11, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        try {
            if (j11 <= 0) {
                conditionVariable.block();
                return true;
            }
            return conditionVariable.block(j11);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String a(String str, String str2) {
        return str + str2;
    }

    public static String a(com.alipay.sdk.m.s.a aVar, Context context) {
        try {
            String a11 = j.a(aVar, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(a11)) {
                return a11;
            }
            try {
                j.b(aVar, context, "alipay_cashier_ap_fi", com.alipay.sdk.m.h.a.a("FU", System.currentTimeMillis(), new com.alipay.sdk.m.h.d(), (short) 0, new com.alipay.sdk.m.h.f()).a());
                String a12 = j.a(aVar, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(a12)) {
                    return a12;
                }
                com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10653l, "e_regen_empty", "");
                return "";
            } catch (Exception e11) {
                com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10653l, "e_gen", e11.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e12) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "e_gen_err", e12);
            return "";
        }
    }

    public static void a(String str, String str2, Context context, com.alipay.sdk.m.s.a aVar) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || b(aVar) || !com.alipay.sdk.m.m.a.D().v()) {
            return;
        }
        try {
            Intent intent = new Intent(com.alipay.sdk.m.l.b.f10735l);
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "AppNotify", str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
        } catch (Exception unused) {
        }
    }
}
