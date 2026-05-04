package com.mob.secverify.pure.b;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {
    public static String A() {
        return com.mob.secverify.pure.a.f();
    }

    public static String a() {
        return com.mob.secverify.pure.a.h();
    }

    public static String b() {
        return com.mob.secverify.pure.a.j();
    }

    public static String c() {
        return com.mob.secverify.pure.a.k();
    }

    public static String d() {
        return com.mob.secverify.pure.a.l();
    }

    public static String e() {
        return com.mob.secverify.pure.a.m();
    }

    public static String f() {
        return com.mob.secverify.pure.a.n();
    }

    public static String g() {
        return com.mob.secverify.pure.a.o();
    }

    public static String h() {
        return com.mob.secverify.pure.a.q();
    }

    public static String i() {
        return com.mob.secverify.pure.a.r();
    }

    public static String j() {
        return com.mob.secverify.pure.a.s();
    }

    public static String k() {
        return com.mob.secverify.pure.a.t();
    }

    public static String l() {
        return com.mob.secverify.pure.a.g();
    }

    public static String m() {
        return com.mob.secverify.pure.a.u();
    }

    public static String n() {
        return com.mob.secverify.pure.a.p();
    }

    public static String o() {
        return com.mob.secverify.pure.a.i();
    }

    public static String p() {
        return "https://auth.wosms.cn/dro/netm/v1.0/qc";
    }

    public static String q() {
        return "http://onekey.cmpassport.com/unisdk/rs/getPrePhonescrip";
    }

    public static String r() {
        return "https://onekey.cmpassport.com:443/unisdk/api/getAuthToken";
    }

    public static String s() {
        return "https://config.cmpassport.com/client/uniConfig";
    }

    public static String t() {
        return "https://log1.cmpassport.com:9443/log/logReport";
    }

    public static String u() {
        String str = "";
        for (int i11 = 0; i11 < 32; i11++) {
            int nextInt = new Random(100L).nextInt() % 62;
            if (nextInt < 26) {
                str = str + (nextInt + 97);
            } else if (nextInt < 52) {
                str = str + (nextInt + 39);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(nextInt - 4);
                str = sb2.toString();
            }
        }
        return str;
    }

    public static String v() {
        return com.mob.secverify.pure.a.a();
    }

    public static String w() {
        return com.mob.secverify.pure.a.b();
    }

    public static String x() {
        return com.mob.secverify.pure.a.c();
    }

    public static int y() {
        return com.mob.secverify.pure.a.d();
    }

    public static String z() {
        return com.mob.secverify.pure.a.e();
    }

    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String a11 = a();
        String o11 = o();
        String c11 = c();
        String d11 = d();
        String e11 = e();
        String i11 = i();
        String h11 = h();
        StringBuilder sb2 = new StringBuilder("quick_login_android_5.7.2");
        sb2.append(str);
        sb2.append("3");
        sb2.append(a11);
        sb2.append(o11);
        sb2.append("1");
        sb2.append(str3);
        sb2.append(c11);
        sb2.append(d11);
        sb2.append(e11);
        sb2.append("0");
        sb2.append(str4);
        sb2.append(str5);
        sb2.append(str2);
        sb2.append("");
        sb2.append(h11);
        sb2.append(i11);
        sb2.append(str6);
        sb2.append(str7);
        return a(sb2.toString());
    }

    public static String b(String str) {
        return com.mob.secverify.pure.a.b(str);
    }

    public static String c(String str) {
        String m11 = m();
        return "{\"sdkversion\":\"quick_login_android_5.7.2\",\"certflag\":\"1\",\"apptype\":\"Android\",\"appid\":\"" + str + "\",\"sign\":\"" + a("1.0quick_login_android_5.7.2" + str + "iYm0HAnkxQtpvN44").toLowerCase() + "\",\"version\":\"1.0\",\"phone_ID\":\"" + m11 + "\"}";
    }

    public static String d(String str, String str2) {
        return str.concat(str2);
    }

    public static String e(String str, String str2) {
        return str.concat(":::").concat(str2);
    }

    public static String f(String str, String str2) {
        String a11 = a();
        String o11 = o();
        String b11 = b();
        String c11 = c();
        String d11 = d();
        String e11 = e();
        String f11 = f();
        String g11 = g();
        String h11 = h();
        String i11 = i();
        String j11 = j();
        String k11 = k();
        String a12 = a(str, str2, b11, f11, g11, j11, k11);
        StringBuilder sb2 = new StringBuilder("1.0&quick_login_android_5.7.2&");
        sb2.append(str);
        sb2.append("&3&&");
        sb2.append(a11);
        sb2.append("&");
        sb2.append(o11);
        sb2.append("&1&");
        sb2.append(b11);
        sb2.append("&");
        sb2.append(c11);
        sb2.append("&");
        sb2.append(d11);
        sb2.append("&");
        sb2.append(e11);
        sb2.append("&0&7.0&&");
        sb2.append(f11);
        sb2.append("&");
        sb2.append(g11);
        sb2.append("&&&&&&&&&&");
        sb2.append(h11);
        sb2.append("&");
        sb2.append(i11);
        sb2.append("&");
        sb2.append(a12);
        sb2.append("&&");
        sb2.append(j11);
        sb2.append("&");
        sb2.append(k11);
        String sb3 = sb2.toString();
        String l11 = l();
        String a13 = a(l11, sb3);
        return "{\"encrypted\":\"" + b(l11) + "\",\"reqdata\":\"" + a13 + "\",\"aesKey\":\"" + l11 + "\"}";
    }

    public static String b(String str, String str2) {
        String n11 = n();
        String f11 = f();
        x();
        m();
        return "{\"header\":{\"appid\":\"" + str + "\",\"sign\":\"" + a("2.0" + str + n11 + f11 + "@Fdiwmxy7CBDDQNUI") + "\",\"msgid\":\"" + f11 + "\",\"systemtime\":\"" + n11 + "\",\"version\":\"2.0\"},\"body\":{\"log\":[" + str2 + "]}}";
    }

    public static String d(String str) {
        return com.mob.secverify.pure.a.a(str);
    }

    public static String c(String str, String str2) {
        return com.mob.secverify.pure.a.a(str, str2);
    }

    public static String b(String str, String str2, String str3, String str4) {
        String v11 = v();
        String valueOf = String.valueOf(y());
        String x11 = x();
        String w11 = w();
        String z11 = z();
        String A = A();
        StringBuilder sb2 = new StringBuilder("{app:{\"c\":");
        String valueOf2 = String.valueOf(System.currentTimeMillis());
        sb2.append(valueOf);
        sb2.append(",\"md5\":\"");
        sb2.append(w11);
        sb2.append("\", \"n\":\"");
        sb2.append(A);
        sb2.append("\",\"pk\":\"");
        sb2.append(z11);
        sb2.append("\",\"v\":\"");
        sb2.append(x11);
        sb2.append("\"},sdk: {\"c\":47,\"cm\":\"CUCC\",\"n\":\"SDKFactory\",\"v\":\"安卓4.0.3开放版Z21041415\"}");
        sb2.append(",device:{\"imei\":[],\"os\":\"Android\"},sim:[],data:{\"r\":");
        sb2.append(valueOf2);
        sb2.append(",\"serviceType\":0,\"privateIp\":\"");
        sb2.append(v11);
        sb2.append("\",\"compatible\":\"");
        sb2.append(2);
        sb2.append("\",\"newVersion\":\"10\"}}");
        return a(sb2.toString(), str, str2, str3, str4);
    }

    public static String a(String str) {
        return com.mob.secverify.pure.a.c(str);
    }

    public static String a(String str, String str2) {
        return com.mob.secverify.pure.a.b(str, str2);
    }

    public static String a(String str, String str2, String str3, String str4) {
        a();
        o();
        b();
        String c11 = c();
        String d11 = d();
        String e11 = e();
        String f11 = f();
        g();
        h();
        i();
        String j11 = j();
        return "{\"sourceid\":\"" + str4 + "\",\"rcData\":{\"ipv6_list\":\"" + k() + "\",\"mnc\":\"1\",\"os\":\"" + e11 + "\",\"dev_brand\":\"" + c11 + "\",\"ipv4_list\":\"" + j11 + "\",\"client_type\":\"0\",\"is_cert\":\"0\",\"dev_model\":\"" + d11 + "\",\"phone_id\":\"" + m() + "\"},\"clienttype\":\"0\",\"genTokenByAppid\":\"\",\"appid\":\"" + str + "\",\"sign\":\"" + a("0.1" + str + str2 + str3) + "\",\"authenticated_appid\":\"\",\"msgid\":\"" + f11 + "\",\"interfacever\":\"6.0\",\"scrip\":\"" + str3 + "\",\"version\":\"0.1\",\"userCapaid\":\"200\"}";
    }

    public static String b(String str, String str2, String str3) {
        return e(e(str, str2), str3);
    }

    public static String a(String str, String str2, String str3) {
        return com.mob.secverify.pure.a.a(str, str2, str3);
    }

    public static String a(String str, String str2, String str3, String str4, String str5) {
        String a11 = a(str, str3, str4);
        String c11 = c(str5, d(str3, str4));
        return b(a11, c11, d(d(d(d(d(d(d(d(d(d(d(d(d(d(str2, "/dro/netm/v1.0/qc"), "?"), "apiKey"), ContainerUtils.KEY_VALUE_DELIMITER), str2), "&"), "params"), ContainerUtils.KEY_VALUE_DELIMITER), a11), "&"), "paramsKey"), ContainerUtils.KEY_VALUE_DELIMITER), c11)));
    }

    public static void a(Context context) {
        WifiManager wifiManager;
        if (context == null || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return;
        }
        int networkId = wifiManager.getConnectionInfo().getNetworkId();
        wifiManager.disableNetwork(networkId);
        wifiManager.disconnect();
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e11) {
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "reconnect wifi interrupted " + e11.getMessage());
        }
        wifiManager.enableNetwork(networkId, true);
        wifiManager.reconnect();
    }
}
