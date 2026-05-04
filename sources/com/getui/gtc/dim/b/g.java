package com.getui.gtc.dim.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.dim.AppDataProvider;
import com.getui.gtc.dim.Caller;
import com.getui.gtc.dim.DimRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.fusesource.jansi.Ansi;
import u30.u0;

/* loaded from: classes6.dex */
public final class g extends f {

    /* renamed from: i, reason: collision with root package name */
    private static final long f29908i = SystemClock.elapsedRealtime();

    /* renamed from: j, reason: collision with root package name */
    private static final Map<String, String> f29909j = new HashMap<String, String>() { // from class: com.getui.gtc.dim.b.g.1
        {
            put("dim-2-1-1-1", "XhNWH0ANTAVL");
            put("dim-2-1-1-3", "XhNWHy4=");
            put("dim-2-1-1-4", "XhNWHy0=");
            put("dim-2-1-2-1", "XhNACVYbWhNd");
            put("dim-2-1-2-3", "XhNACTg=");
            put("dim-2-1-2-4", "XhNACTs=");
            put("dim-2-1-3-1", "WhtY");
            put("dim-2-1-3-2", "WhtYB0YKRg==");
            put("dim-2-1-4-1", "RAFTGlsXSAZTHlwZSw==");
            put("dim-2-1-5-1", "WBlQFA==");
            put("dim-2-1-6-1", "Xh1eF1MMQQBJBw==");
            put("dim-2-1-6-3", "Xh1eF1Ni");
            put("dim-2-1-6-4", "Xh1eF1Nh");
            put("dim-2-1-7-1", "VhhcDkEITBNaHg==");
            put("dim-2-1-8-1", "VhJEAVMHTh1UGl0CSw8=");
            put("dim-2-1-9-1", "VQdGCEw=");
            put("dim-2-1-10-1", "WhVRFFg=");
            put("dim-2-1-11-1", "RQpH");
            put("dim-2-1-12-1", "WhtVAEYHRBBFF1IA");
            put("dim-2-1-13-1", "RB1OEUcCUANKBUs=");
            put("dim-2-1-14-1", "VBVHFVwZSw==");
            put("dim-2-1-15-1", "WRxIH1ACSRZCG0sO");
            put("dim-2-1-16-1", "Xg4=");
            put("dim-2-1-16-2", "Xg5Ybg==");
            put("dim-2-1-17-1", "WxRXFkILRApVEkIR");
            put("dim-2-1-17-2", "WxRXFkILRApVG14KXRJACw==");
            put("dim-2-1-18-1", "QAlPBlkQXhhX");
            put("dim-2-1-18-2", "QAlPBlkKSQhGGVUcTxs=");
            put("dim-2-1-18-3", "QAlPBlkUVRY=");
            put("dim-2-1-19-1", "VBFdEU4HSQ9A");
            put("dim-2-1-19-2", "VBFdEU4HSQ9AH1EUQw==");
            put("dim-2-1-21-1", "VgZWCUUMXws=");
            put("dim-2-1-21-2", "VgZWCUUMXws=");
            put("dim-2-1-21-3", "VgZWCUUMXws=");
            put("dim-2-1-21-5", "VgZWCUUMXws=");
            put("dim-2-1-22-1", "UBVBFF0CRgNVHF8aRQxI");
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public Method f29910g;

    /* renamed from: h, reason: collision with root package name */
    public Method f29911h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f29918a = new g(0);
    }

    private g() {
    }

    public static g d() {
        return a.f29918a;
    }

    private Object i(String str) {
        Method method;
        try {
            String str2 = this.f29893f;
            if (str2 != null && (method = this.f29911h) != null) {
                method.invoke(null, str2);
                this.f29893f = null;
            }
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.b(th2);
        }
        try {
            if (this.f29910g != null) {
                Bundle bundle = new Bundle();
                bundle.putString("dimKey", str);
                return this.f29910g.invoke(null, bundle);
            }
        } catch (Throwable th3) {
            com.getui.gtc.dim.e.b.b(th3);
        }
        return Void.TYPE;
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ int a() {
        return super.a();
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ Boolean b(String str, String str2) {
        return super.b(str, str2);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ int c() {
        return super.c();
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void e(String str, String str2) {
        super.e(str, str2);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void f(String str) {
        super.f(str);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void g(String str, String str2) {
        super.g(str, str2);
    }

    public /* synthetic */ g(byte b11) {
        this();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private Object b(DimRequest dimRequest) {
        Context context = GtcProvider.context();
        String key = dimRequest.getKey();
        key.getClass();
        char c11 = 65535;
        switch (key.hashCode()) {
            case 320888255:
                if (key.equals("dim-2-1-10-1")) {
                    c11 = 0;
                    break;
                }
                break;
            case 320889216:
                if (key.equals("dim-2-1-11-1")) {
                    c11 = 1;
                    break;
                }
                break;
            case 320890177:
                if (key.equals("dim-2-1-12-1")) {
                    c11 = 2;
                    break;
                }
                break;
            case 320891138:
                if (key.equals("dim-2-1-13-1")) {
                    c11 = 3;
                    break;
                }
                break;
            case 320892099:
                if (key.equals("dim-2-1-14-1")) {
                    c11 = 4;
                    break;
                }
                break;
            case 320893060:
                if (key.equals("dim-2-1-15-1")) {
                    c11 = 5;
                    break;
                }
                break;
            case 320894021:
                if (key.equals("dim-2-1-16-1")) {
                    c11 = 6;
                    break;
                }
                break;
            case 320894022:
                if (key.equals("dim-2-1-16-2")) {
                    c11 = 7;
                    break;
                }
                break;
            case 320894982:
                if (key.equals("dim-2-1-17-1")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 320894983:
                if (key.equals("dim-2-1-17-2")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 320894984:
                if (key.equals("dim-2-1-17-3")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 320894985:
                if (key.equals("dim-2-1-17-4")) {
                    c11 = 11;
                    break;
                }
                break;
            case 320895943:
                if (key.equals("dim-2-1-18-1")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 320895944:
                if (key.equals("dim-2-1-18-2")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 320895945:
                if (key.equals("dim-2-1-18-3")) {
                    c11 = 14;
                    break;
                }
                break;
            case 320895946:
                if (key.equals("dim-2-1-18-4")) {
                    c11 = 15;
                    break;
                }
                break;
            case 320896904:
                if (key.equals("dim-2-1-19-1")) {
                    c11 = 16;
                    break;
                }
                break;
            case 320896905:
                if (key.equals("dim-2-1-19-2")) {
                    c11 = 17;
                    break;
                }
                break;
            case 320919007:
                if (key.equals("dim-2-1-21-1")) {
                    c11 = 18;
                    break;
                }
                break;
            case 320919008:
                if (key.equals("dim-2-1-21-2")) {
                    c11 = 19;
                    break;
                }
                break;
            case 320919009:
                if (key.equals("dim-2-1-21-3")) {
                    c11 = 20;
                    break;
                }
                break;
            case 320919011:
                if (key.equals("dim-2-1-21-5")) {
                    c11 = 21;
                    break;
                }
                break;
            case 320919968:
                if (key.equals("dim-2-1-22-1")) {
                    c11 = 22;
                    break;
                }
                break;
            case 1672919129:
                if (key.equals("dim-2-1-1-1")) {
                    c11 = 23;
                    break;
                }
                break;
            case 1672919131:
                if (key.equals("dim-2-1-1-3")) {
                    c11 = 24;
                    break;
                }
                break;
            case 1672919132:
                if (key.equals("dim-2-1-1-4")) {
                    c11 = 25;
                    break;
                }
                break;
            case 1672920090:
                if (key.equals("dim-2-1-2-1")) {
                    c11 = 26;
                    break;
                }
                break;
            case 1672920092:
                if (key.equals("dim-2-1-2-3")) {
                    c11 = Ansi.f77778c;
                    break;
                }
                break;
            case 1672920093:
                if (key.equals("dim-2-1-2-4")) {
                    c11 = sp.b.f88892n;
                    break;
                }
                break;
            case 1672921051:
                if (key.equals("dim-2-1-3-1")) {
                    c11 = sp.b.f88893o;
                    break;
                }
                break;
            case 1672921052:
                if (key.equals("dim-2-1-3-2")) {
                    c11 = sp.b.f88894p;
                    break;
                }
                break;
            case 1672922012:
                if (key.equals("dim-2-1-4-1")) {
                    c11 = to.c.f90845b;
                    break;
                }
                break;
            case 1672922973:
                if (key.equals("dim-2-1-5-1")) {
                    c11 = ' ';
                    break;
                }
                break;
            case 1672922974:
                if (key.equals("dim-2-1-5-2")) {
                    c11 = PublicSuffixDatabase.f77441i;
                    break;
                }
                break;
            case 1672923934:
                if (key.equals("dim-2-1-6-1")) {
                    c11 = '\"';
                    break;
                }
                break;
            case 1672923936:
                if (key.equals("dim-2-1-6-3")) {
                    c11 = '#';
                    break;
                }
                break;
            case 1672923937:
                if (key.equals("dim-2-1-6-4")) {
                    c11 = '$';
                    break;
                }
                break;
            case 1672924895:
                if (key.equals("dim-2-1-7-1")) {
                    c11 = '%';
                    break;
                }
                break;
            case 1672925856:
                if (key.equals("dim-2-1-8-1")) {
                    c11 = u0.f91708d;
                    break;
                }
                break;
            case 1672926817:
                if (key.equals("dim-2-1-9-1")) {
                    c11 = '\'';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return com.getui.gtc.dim.c.a.c();
            case 1:
                return com.getui.gtc.dim.c.a.d();
            case 2:
                return com.getui.gtc.dim.c.a.e();
            case 3:
                return com.getui.gtc.dim.c.a.f();
            case 4:
                return com.getui.gtc.dim.c.a.h(context);
            case 5:
                return com.getui.gtc.dim.c.a.i(context);
            case 6:
                return com.getui.gtc.dim.c.a.j(context);
            case 7:
                return com.getui.gtc.dim.c.a.k(context);
            case '\b':
                return com.getui.gtc.dim.c.a.a(context, PermissionStatusUtilKt.PERMISSION_GPS);
            case '\t':
                return com.getui.gtc.dim.c.a.a(context, "network");
            case '\n':
            case 11:
                return com.getui.gtc.dim.c.b.b(dimRequest, b(key));
            case '\f':
                return com.getui.gtc.dim.c.a.l(context);
            case '\r':
                return com.getui.gtc.dim.c.a.m(context);
            case 14:
                return com.getui.gtc.dim.c.b.a(context, dimRequest);
            case 15:
                return com.getui.gtc.dim.c.b.a(dimRequest, b(key));
            case 16:
                return com.getui.gtc.dim.c.a.n(context);
            case 17:
                return com.getui.gtc.dim.c.a.o(context);
            case 18:
                return com.getui.gtc.dim.c.a.p(context);
            case 19:
                return com.getui.gtc.dim.c.a.q(context);
            case 20:
                return com.getui.gtc.dim.c.a.r(context);
            case 21:
                if (b()) {
                    com.getui.gtc.dim.e.b.a("al us");
                    return com.getui.gtc.dim.c.a.h();
                }
                com.getui.gtc.dim.e.b.a("al pm");
                return com.getui.gtc.dim.c.a.g();
            case 22:
                return com.getui.gtc.dim.c.a.i();
            case 23:
                return com.getui.gtc.dim.c.a.a(context);
            case 24:
                return com.getui.gtc.dim.c.a.a(0, context);
            case 25:
                return com.getui.gtc.dim.c.a.a(1, context);
            case 26:
                return com.getui.gtc.dim.c.a.b(context);
            case 27:
                return com.getui.gtc.dim.c.a.b(com.getui.gtc.dim.c.a.c(0, context), context);
            case 28:
                return com.getui.gtc.dim.c.a.b(com.getui.gtc.dim.c.a.c(1, context), context);
            case 29:
                return com.getui.gtc.dim.c.a.g(context);
            case 30:
                return com.getui.gtc.dim.c.a.a();
            case 31:
                return com.getui.gtc.dim.c.a.f(context);
            case ' ':
                return com.getui.gtc.dim.c.a.a(context, this.f29891d != 0);
            case '!':
                return com.getui.gtc.dim.c.b.a(dimRequest);
            case '\"':
                return com.getui.gtc.dim.c.a.c(context);
            case '#':
                return com.getui.gtc.dim.c.a.d(com.getui.gtc.dim.c.a.c(0, context), context);
            case '$':
                return com.getui.gtc.dim.c.a.d(com.getui.gtc.dim.c.a.c(1, context), context);
            case '%':
                return com.getui.gtc.dim.c.a.d(context);
            case '&':
                return com.getui.gtc.dim.c.a.e(context);
            case '\'':
                return com.getui.gtc.dim.c.a.b();
            default:
                com.getui.gtc.dim.e.b.b("dim cannot understand key for " + dimRequest.getKey());
                return Void.TYPE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x016d, code lost:
    
        if (r1.equals("dim-2-1-6-4") == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.getui.gtc.dim.b.e a(com.getui.gtc.dim.DimRequest r13) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.b.g.a(com.getui.gtc.dim.DimRequest):com.getui.gtc.dim.b.e");
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void c(int i11) {
        super.c(i11);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void d(String str, String str2) {
        super.d(str, str2);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void f(String str, String str2) {
        super.f(str, str2);
    }

    private e a(DimRequest dimRequest, boolean z11, boolean z12, boolean z13) {
        Object b11;
        String str;
        Object i11;
        e eVar = new e("none");
        String key = dimRequest.getKey();
        if ((this.f29890c & 2) != 0) {
            com.getui.gtc.dim.e.b.a(new Throwable("dim get sys trace, key: " + key + ", caller: " + dimRequest.getCaller()));
        }
        AppDataProvider appDataProvider = this.f29892e;
        boolean z14 = appDataProvider != null && a(key);
        com.getui.gtc.dim.e.b.b("dim can call sys for " + key + ", caller: " + dimRequest.getCaller() + ", allowProvider: " + z14 + ", provider: " + appDataProvider + ", gdi:" + z11 + ", dim:" + z12 + ", hc:" + z13);
        Class cls = Void.TYPE;
        if (z14) {
            if (!z13 && ((z11 || z12) && (b11 = b(key, appDataProvider)) != cls)) {
                str = "app_provider";
                eVar.f29886a = str;
                eVar.f29887b = b11;
                return eVar;
            }
            return eVar;
        }
        if (z11 && (i11 = i(key)) != cls) {
            eVar.f29886a = "gdi";
            eVar.f29887b = i11;
        }
        if (z12 && !com.getui.gtc.dim.e.c.a(eVar.f29887b) && (b11 = b(dimRequest)) != cls) {
            str = NotificationCompat.CATEGORY_SYSTEM;
            eVar.f29886a = str;
            eVar.f29887b = b11;
            return eVar;
        }
        return eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Object b(String str, AppDataProvider appDataProvider) {
        str.getClass();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 320888255:
                if (str.equals("dim-2-1-10-1")) {
                    c11 = 0;
                    break;
                }
                break;
            case 320889216:
                if (str.equals("dim-2-1-11-1")) {
                    c11 = 1;
                    break;
                }
                break;
            case 320890177:
                if (str.equals("dim-2-1-12-1")) {
                    c11 = 2;
                    break;
                }
                break;
            case 320891138:
                if (str.equals("dim-2-1-13-1")) {
                    c11 = 3;
                    break;
                }
                break;
            case 320892099:
                if (str.equals("dim-2-1-14-1")) {
                    c11 = 4;
                    break;
                }
                break;
            case 320893060:
                if (str.equals("dim-2-1-15-1")) {
                    c11 = 5;
                    break;
                }
                break;
            case 320894021:
                if (str.equals("dim-2-1-16-1")) {
                    c11 = 6;
                    break;
                }
                break;
            case 320894022:
                if (str.equals("dim-2-1-16-2")) {
                    c11 = 7;
                    break;
                }
                break;
            case 320894982:
                if (str.equals("dim-2-1-17-1")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 320894983:
                if (str.equals("dim-2-1-17-2")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 320895943:
                if (str.equals("dim-2-1-18-1")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 320895944:
                if (str.equals("dim-2-1-18-2")) {
                    c11 = 11;
                    break;
                }
                break;
            case 320895945:
                if (str.equals("dim-2-1-18-3")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 320896904:
                if (str.equals("dim-2-1-19-1")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 320896905:
                if (str.equals("dim-2-1-19-2")) {
                    c11 = 14;
                    break;
                }
                break;
            case 320919007:
                if (str.equals("dim-2-1-21-1")) {
                    c11 = 15;
                    break;
                }
                break;
            case 320919008:
                if (str.equals("dim-2-1-21-2")) {
                    c11 = 16;
                    break;
                }
                break;
            case 320919009:
                if (str.equals("dim-2-1-21-3")) {
                    c11 = 17;
                    break;
                }
                break;
            case 320919011:
                if (str.equals("dim-2-1-21-5")) {
                    c11 = 18;
                    break;
                }
                break;
            case 320919968:
                if (str.equals("dim-2-1-22-1")) {
                    c11 = 19;
                    break;
                }
                break;
            case 1672919129:
                if (str.equals("dim-2-1-1-1")) {
                    c11 = 20;
                    break;
                }
                break;
            case 1672919131:
                if (str.equals("dim-2-1-1-3")) {
                    c11 = 21;
                    break;
                }
                break;
            case 1672919132:
                if (str.equals("dim-2-1-1-4")) {
                    c11 = 22;
                    break;
                }
                break;
            case 1672920090:
                if (str.equals("dim-2-1-2-1")) {
                    c11 = 23;
                    break;
                }
                break;
            case 1672920092:
                if (str.equals("dim-2-1-2-3")) {
                    c11 = 24;
                    break;
                }
                break;
            case 1672920093:
                if (str.equals("dim-2-1-2-4")) {
                    c11 = 25;
                    break;
                }
                break;
            case 1672921051:
                if (str.equals("dim-2-1-3-1")) {
                    c11 = 26;
                    break;
                }
                break;
            case 1672921052:
                if (str.equals("dim-2-1-3-2")) {
                    c11 = Ansi.f77778c;
                    break;
                }
                break;
            case 1672922012:
                if (str.equals("dim-2-1-4-1")) {
                    c11 = sp.b.f88892n;
                    break;
                }
                break;
            case 1672922973:
                if (str.equals("dim-2-1-5-1")) {
                    c11 = sp.b.f88893o;
                    break;
                }
                break;
            case 1672923934:
                if (str.equals("dim-2-1-6-1")) {
                    c11 = sp.b.f88894p;
                    break;
                }
                break;
            case 1672923936:
                if (str.equals("dim-2-1-6-3")) {
                    c11 = to.c.f90845b;
                    break;
                }
                break;
            case 1672923937:
                if (str.equals("dim-2-1-6-4")) {
                    c11 = ' ';
                    break;
                }
                break;
            case 1672924895:
                if (str.equals("dim-2-1-7-1")) {
                    c11 = PublicSuffixDatabase.f77441i;
                    break;
                }
                break;
            case 1672925856:
                if (str.equals("dim-2-1-8-1")) {
                    c11 = '\"';
                    break;
                }
                break;
            case 1672926817:
                if (str.equals("dim-2-1-9-1")) {
                    c11 = '#';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\f':
            case '\r':
            case 14:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
            case '!':
            case '\"':
            case '#':
                return a(str, appDataProvider);
            case '\b':
            case '\t':
                return a(str, appDataProvider, Location.class, false, null);
            case '\n':
                return a(str, appDataProvider, WifiInfo.class, false, null);
            case 11:
                return a(str, appDataProvider, ScanResult.class, true, null);
            case 15:
            case 16:
            case 17:
            case 18:
                return a(str, appDataProvider, PackageInfo.class, true, null);
            default:
                com.getui.gtc.dim.e.b.b("dim cannot understand key for ".concat(str));
                return Void.TYPE;
        }
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void c(String str) {
        super.c(str);
    }

    public static /* synthetic */ e a(g gVar, DimRequest dimRequest, boolean z11, boolean z12) {
        return gVar.a(dimRequest, z11, z12, false);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void b(int i11) {
        super.b(i11);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void c(String str, int i11) {
        super.c(str, i11);
    }

    private static Object a(String str, AppDataProvider appDataProvider) {
        return a(str, appDataProvider, String.class, false, "");
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void b(String str, int i11) {
        super.b(str, i11);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void c(String str, String str2) {
        super.c(str, str2);
    }

    private static Object a(String str, AppDataProvider appDataProvider, Class<?> cls, boolean z11, Object obj) {
        try {
            String str2 = f29909j.get(str);
            String str3 = str2 == null ? null : new String(com.getui.gtc.dim.e.a.a(Base64.decode(str2.getBytes(), 2)));
            if (str3 == null) {
                throw new IllegalStateException("decryptName==null");
            }
            try {
                Object appData = appDataProvider.getAppData(str3);
                if (!z11) {
                    return cls.cast(appData);
                }
                List list = (List) appData;
                if (list != null && !list.isEmpty()) {
                    cls.cast(list.get(0));
                    if (list.size() > 1) {
                        cls.cast(list.get(list.size() - 1));
                    }
                }
                return appData;
            } catch (Throwable th2) {
                com.getui.gtc.dim.e.b.b("dim call sys getProviderData failed for " + str + ",because " + th2.getMessage());
                appDataProvider.onDataFailed(str3, th2);
                return obj;
            }
        } catch (Throwable th3) {
            com.getui.gtc.dim.e.b.b("dim call sys getProviderData failed for " + str + ",because " + th3.getMessage());
            return obj;
        }
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ boolean b(String str, Caller caller, boolean z11) {
        return super.b(str, caller, z11);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void a(int i11) {
        super.a(i11);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void a(AppDataProvider appDataProvider) {
        super.a(appDataProvider);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void a(Caller caller) {
        super.a(caller);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ void a(String str, int i11) {
        super.a(str, i11);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ boolean a(String str, Caller caller, boolean z11) {
        return super.a(str, caller, z11);
    }

    @Override // com.getui.gtc.dim.b.f
    public final /* bridge */ /* synthetic */ boolean a(String str, String str2) {
        return super.a(str, str2);
    }
}
