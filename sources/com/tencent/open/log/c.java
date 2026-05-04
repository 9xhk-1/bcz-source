package com.tencent.open.log;

import com.tencent.connect.common.Constants;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f44541a = 60;

    /* renamed from: b, reason: collision with root package name */
    public static int f44542b = 60;

    /* renamed from: c, reason: collision with root package name */
    public static String f44543c = "OpenSDK.Client.File.Tracer";

    /* renamed from: d, reason: collision with root package name */
    public static String f44544d;

    /* renamed from: e, reason: collision with root package name */
    public static String f44545e;

    /* renamed from: f, reason: collision with root package name */
    public static long f44546f;

    /* renamed from: g, reason: collision with root package name */
    public static int f44547g;

    /* renamed from: h, reason: collision with root package name */
    public static int f44548h;

    /* renamed from: i, reason: collision with root package name */
    public static int f44549i;

    /* renamed from: j, reason: collision with root package name */
    public static String f44550j;

    /* renamed from: k, reason: collision with root package name */
    public static String f44551k;

    /* renamed from: l, reason: collision with root package name */
    public static String f44552l;

    /* renamed from: m, reason: collision with root package name */
    public static int f44553m;

    /* renamed from: n, reason: collision with root package name */
    public static long f44554n;

    /* renamed from: o, reason: collision with root package name */
    public static String f44555o;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tencent");
        String str = File.separator;
        sb2.append(str);
        sb2.append("msflogs");
        sb2.append(str);
        sb2.append("com");
        sb2.append(str);
        sb2.append("tencent");
        sb2.append(str);
        sb2.append("mobileqq");
        sb2.append(str);
        f44544d = sb2.toString();
        f44545e = ".log";
        f44546f = 8388608L;
        f44547g = 262144;
        f44548h = 1024;
        f44549i = 10000;
        f44550j = "debug.file.blockcount";
        f44551k = "debug.file.keepperiod";
        f44552l = "debug.file.tracelevel";
        f44553m = 24;
        f44554n = 604800000L;
        f44555o = Constants.APP_SPECIFIC_ROOT + str + "logs";
    }
}
