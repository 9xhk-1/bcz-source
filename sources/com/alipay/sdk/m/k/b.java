package com.alipay.sdk.m.k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.k.a;
import com.alipay.sdk.m.u.c;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.n;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {
    public static final String A = "SSLDenied";
    public static final String A0 = "out_trade_no";
    public static final String B = "H5PayDataAnalysisError";
    public static final String B0 = "trade_no";
    public static final String C = "H5AuthDataAnalysisError";
    public static final String C0 = "biz_content";
    public static final String D = "PublicKeyUnmatch";
    public static final String D0 = "app_id";
    public static final String E = "ClientBindFailed";
    public static final String F = "TriDesEncryptError";
    public static final String G = "TriDesDecryptError";
    public static final String H = "ClientBindException";
    public static final String I = "SaveTradeTokenError";
    public static final String J = "ClientBindServiceFailed";
    public static final String K = "TryStartServiceEx";
    public static final String L = "BindWaitTimeoutEx";
    public static final String M = "CheckClientExistEx";
    public static final String N = "CheckClientSignEx";
    public static final String O = "GetInstalledAppEx";
    public static final String P = "ParserTidClientKeyEx";
    public static final String Q = "PgApiInvoke";
    public static final String R = "PgBindStarting";
    public static final String S = "PgBinded";
    public static final String T = "PgBindEnd";
    public static final String U = "PgBindPay";
    public static final String V = "PgReturn";
    public static final String W = "PgReturnV";
    public static final String X = "PgWltVer";
    public static final String Y = "PgOpenStarting";
    public static final String Z = "ErrIntentEx";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f10641a0 = "ErrActNull";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f10642b0 = "ErrActEx";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f10643c0 = "ErrActNull2";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f10644d0 = "ErrActEx2";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f10645e0 = "ErrActNotCreated";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f10646f0 = "GetInstalledAppEx";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f10647g0 = "StartLaunchAppTransEx";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f10648h0 = "CheckLaunchAppExistEx";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f10649i0 = "LogBindCalledH5";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f10650j0 = "LogCalledH5";

    /* renamed from: k, reason: collision with root package name */
    public static final String f10651k = "net";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f10652k0 = "LogHkLoginByIntent";

    /* renamed from: l, reason: collision with root package name */
    public static final String f10653l = "biz";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f10654l0 = "SchemePayWrongHashEx";

    /* renamed from: m, reason: collision with root package name */
    public static final String f10655m = "cp";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f10656m0 = "LogAppFetchConfigTimeout";

    /* renamed from: n, reason: collision with root package name */
    public static final String f10657n = "auth";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f10658n0 = "H5CbUrlEmpty";

    /* renamed from: o, reason: collision with root package name */
    public static final String f10659o = "third";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f10660o0 = "H5CbEx";

    /* renamed from: p, reason: collision with root package name */
    public static final String f10661p = "wlt";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f10662p0 = "StartActivityEx";

    /* renamed from: q, reason: collision with root package name */
    public static final String f10663q = "FormatResultEx";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f10664q0 = "JSONEx";

    /* renamed from: r, reason: collision with root package name */
    public static final String f10665r = "GetApdidEx";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f10666r0 = "ParseBundleSerializableError";

    /* renamed from: s, reason: collision with root package name */
    public static final String f10667s = "GetApdidNull";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f10668s0 = "ParseSchemeQueryError";

    /* renamed from: t, reason: collision with root package name */
    public static final String f10669t = "GetApdidTimeout";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f10670t0 = "TbChk";

    /* renamed from: u, reason: collision with root package name */
    public static final String f10671u = "GetUtdidEx";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f10672u0 = "TbStart";

    /* renamed from: v, reason: collision with root package name */
    public static final String f10673v = "GetPackageInfoEx";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f10674v0 = "TbCancel";

    /* renamed from: w, reason: collision with root package name */
    public static final String f10675w = "NotIncludeSignatures";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f10676w0 = "TbUnknown";

    /* renamed from: x, reason: collision with root package name */
    public static final String f10677x = "GetPublicKeyFromSignEx";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f10678x0 = "TbOk";

    /* renamed from: y, reason: collision with root package name */
    public static final String f10679y = "webError";

    /* renamed from: y0, reason: collision with root package name */
    public static final String f10680y0 = "TbActFail";

    /* renamed from: z, reason: collision with root package name */
    public static final String f10681z = "SSLError";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f10682z0 = "partner";

    /* renamed from: a, reason: collision with root package name */
    public String f10683a;

    /* renamed from: b, reason: collision with root package name */
    public String f10684b;

    /* renamed from: c, reason: collision with root package name */
    public String f10685c;

    /* renamed from: d, reason: collision with root package name */
    public String f10686d;

    /* renamed from: e, reason: collision with root package name */
    public String f10687e;

    /* renamed from: f, reason: collision with root package name */
    public String f10688f;

    /* renamed from: g, reason: collision with root package name */
    public String f10689g;

    /* renamed from: h, reason: collision with root package name */
    public String f10690h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f10691i = "";

    /* renamed from: j, reason: collision with root package name */
    public String f10692j;

    public b(Context context, boolean z11) {
        context = context != null ? context.getApplicationContext() : context;
        this.f10683a = b();
        this.f10685c = a(context);
        this.f10686d = a(z11 ? 0L : a.e.a(context));
        this.f10687e = a();
        this.f10688f = b(context);
        this.f10689g = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        this.f10692j = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    }

    private synchronized void c(String str, String str2, String str3) {
        try {
            e.d(com.alipay.sdk.m.l.a.A, String.format("event %s %s %s", str, str2, str3));
            String str4 = "";
            if (!TextUtils.isEmpty(this.f10690h)) {
                str4 = "^";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", TextUtils.isEmpty(str) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : c(str), c(str2), c(str3), c(c())));
            this.f10690h += sb2.toString();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean d() {
        return TextUtils.isEmpty(this.f10691i);
    }

    public static String e() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public void a(String str, String str2, Throwable th2) {
        d(str, str2, a(th2));
    }

    public void b(String str, String str2, String str3) {
        d(str, str2, str3);
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String b() {
        return String.format("%s,%s", e(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    private synchronized void d(String str, String str2, String str3) {
        try {
            e.c(com.alipay.sdk.m.l.a.A, String.format("err %s %s %s", str, str2, str3));
            String str4 = "";
            if (!TextUtils.isEmpty(this.f10691i)) {
                str4 = "^";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(String.format("%s,%s,%s,%s", str, str2, TextUtils.isEmpty(str3) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : c(str3), c(c())));
            this.f10691i += sb2.toString();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(String str, String str2, Throwable th2, String str3) {
        d(str, str2, str3 + ": " + a(th2));
    }

    public static String b(String str) {
        String str2;
        String str3;
        if (str == null) {
            str = "";
        }
        String[] split = str.split("&");
        String str4 = null;
        if (split != null) {
            str2 = null;
            str3 = null;
            for (String str5 : split) {
                String[] split2 = str5.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split2 != null && split2.length == 2) {
                    if (split2[0].equalsIgnoreCase(f10682z0)) {
                        str4 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(A0)) {
                        str2 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(B0)) {
                        str3 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(C0)) {
                        try {
                            JSONObject jSONObject = new JSONObject(n.e(com.alipay.sdk.m.s.a.h(), split2[1]));
                            if (TextUtils.isEmpty(str2)) {
                                str2 = jSONObject.getString(A0);
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (split2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(str4)) {
                        str4 = split2[1];
                    }
                }
            }
        } else {
            str2 = null;
            str3 = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", c(str3), c(str2), c(str4));
    }

    public void a(String str, String str2, String str3) {
        c("", str, str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str3);
    }

    public void a(String str, String str2) {
        c("", str, str2);
    }

    public static String a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th2.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th2.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace != null) {
                int i11 = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i11++;
                    if (i11 > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : str;
    }

    public static String c() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace(j.f81006c, "（").replace(j.f81007d, "）").replace(",", "，").replace("^", Constants.WAVE_SEPARATOR).replace("#", "＃");
    }

    public String a(String str) {
        String b11 = b(str);
        this.f10684b = b11;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.f10683a, b11, this.f10685c, this.f10686d, this.f10687e, this.f10688f, this.f10689g, d(this.f10690h), d(this.f10691i), this.f10692j);
    }

    public static String a(Context context) {
        String packageName;
        String str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str = packageInfo.versionName + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a(packageInfo);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            return String.format("%s,%s,-,-,-", c(packageName), c(str));
        }
        packageName = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        return String.format("%s,%s,-,-,-", c(packageName), c(str));
    }

    public static String a(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String str;
        String a11;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    a11 = n.a((com.alipay.sdk.m.s.a) null, signature.toByteArray());
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(a11)) {
                    str = n.g(a11).substring(0, 8);
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    sb2.append(str);
                }
                str = "?";
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb2.append(str);
            }
            return sb2.toString();
        } catch (Throwable unused2) {
            return "?";
        }
    }

    public static String b(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", c(c.c(context)), "android", c(Build.VERSION.RELEASE), c(Build.MODEL), Constants.ACCEPT_TIME_SEPARATOR_SERVER, "0", c(c.d(context).b()), "gw", c(com.alipay.sdk.m.w.b.b(null, context)));
    }

    public static String a(long j11) {
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", c("15.8.15"), c("h.a.3.8.15"), Constants.WAVE_SEPARATOR + j11);
    }

    public static String a() {
        return String.format("%s,%s,-,-,-", c(com.alipay.sdk.m.t.a.a(com.alipay.sdk.m.s.b.d().b()).d()), c(com.alipay.sdk.m.s.b.d().c()));
    }
}
