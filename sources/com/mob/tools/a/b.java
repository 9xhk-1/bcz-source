package com.mob.tools.a;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.location.Location;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mob.commons.o;
import com.mob.commons.r;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.NtFetcher;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static b f41149c;

    /* renamed from: a, reason: collision with root package name */
    private Context f41150a;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f41152d;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f41155g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<String> f41156h;

    /* renamed from: k, reason: collision with root package name */
    private Object f41159k;

    /* renamed from: b, reason: collision with root package name */
    private String f41151b = null;

    /* renamed from: e, reason: collision with root package name */
    private String f41153e = "-1";

    /* renamed from: f, reason: collision with root package name */
    private int f41154f = -1;

    /* renamed from: i, reason: collision with root package name */
    private HashMap<String, String> f41157i = new HashMap<>();

    /* renamed from: l, reason: collision with root package name */
    private long f41160l = 0;

    /* renamed from: j, reason: collision with root package name */
    private com.mob.tools.utils.a f41158j = new com.mob.tools.utils.a();

    private b(Context context) {
        this.f41150a = context.getApplicationContext();
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            try {
                if (f41149c == null && context != null) {
                    f41149c = new b(context);
                }
                bVar = f41149c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private boolean aM() {
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        if (new File(o.a("025gCfgdifg,dilgGdfVeegJehdc=eiJdhdcfgPi(dheldf!eUdj")).exists()) {
            return true;
        }
        String[] strArr = {o.a("012gh9df(d1df4g'edecdgdfedGg"), o.a("016gh:df_dLdf_g*edecdgdfedYg=fcdedkJg"), o.a("017gh<df dZdf)gPedecdgdfedIg-dlfcdedk*g"), o.a("006g=fgfcdedk(g"), o.a("008g]fgdc8g4fcdedkTg"), o.a("012gFfgdifgMdilg_fcdedkLg"), o.a("017g5fgdifg3dilgVfcdedkTg!elSi[dl'dg"), o.a("021gNfgdifg6dilg0fcdedkFgBfhdfdeedfgdffhSig"), o.a("016g3fgdifg^dilgHfg%hg]dlfcdedkNg"), o.a("025gMfgdifgDdilg1dcfgdh!gBfd.i[hidk^iihXhidhecec'dg"), o.a("013gLfgdifgLdilg%dlfcdedk<g"), o.a("013g?fgdifg=dilgIfgfcdedk@g"), o.a("012gji[dk+h9ecdh@g]fcdedk=g"), o.a("006gAdgdfdgPci"), o.a("005ghIdf)d!df"), o.a("004ghij")};
        for (int i11 = 0; i11 < 16; i11++) {
            if (new File(strArr[i11], o.a("002'fgdc")).exists()) {
                return true;
            }
        }
        for (int i12 = 0; i12 < 16; i12++) {
            if (new File(strArr[i12], o.a("007*fcdcfgdifcecdl")).exists()) {
                return true;
            }
        }
        for (int i13 = 0; i13 < 16; i13++) {
            if (new File(strArr[i13], o.a("006lUdfffdefgdj")).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean aN() {
        Object a11;
        InputStream inputStream;
        Boolean bool = this.f41158j.f41427ad;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            try {
                a11 = a(o.a("007LffJideSdhec.e"));
                inputStream = (InputStream) ReflectHelper.invokeInstanceMethod(a11, o.a("014Xff id?egdk_e*dc)d<eh[dJdhTi>df7l"), new Object[0]);
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            try {
                MobLog.getInstance().w(th2);
                if (0 != 0) {
                    ReflectHelper.invokeInstanceMethod(null, o.a("007hiOfgXdOdhecdi"), new Object[0]);
                }
            } catch (Throwable th3) {
                if (0 != 0) {
                    try {
                        ReflectHelper.invokeInstanceMethod(null, o.a("007hiOfgXdOdhecdi"), new Object[0]);
                    } catch (Throwable unused2) {
                    }
                }
                throw th3;
            }
        }
        if (inputStream == null) {
            this.f41158j.f41427ad = Boolean.FALSE;
            if (a11 != null) {
                try {
                    ReflectHelper.invokeInstanceMethod(a11, o.a("007hiOfgXdOdhecdi"), new Object[0]);
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
        String[] split = new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        if (split != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(o.a("0134dhecelFhiWfcdcffffdffcedBi"), "1");
            hashMap.put(o.a("009UdhecelfgWiXdgdcdh4i"), "0");
            for (String str : split) {
                for (String str2 : hashMap.keySet()) {
                    if (str != null && str.contains(str2)) {
                        if (str.contains("[" + hashMap.get(str2) + "]")) {
                            this.f41158j.f41427ad = Boolean.TRUE;
                            if (a11 != null) {
                                try {
                                    ReflectHelper.invokeInstanceMethod(a11, o.a("007hiOfgXdOdhecdi"), new Object[0]);
                                } catch (Throwable unused4) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        if (a11 != null) {
            ReflectHelper.invokeInstanceMethod(a11, o.a("007hiOfgXdOdhecdi"), new Object[0]);
        }
        this.f41158j.f41427ad = Boolean.FALSE;
        return false;
    }

    /* JADX WARN: Finally extract failed */
    private boolean aO() {
        InputStream inputStream;
        int i11 = 0;
        Object obj = null;
        try {
            try {
                obj = a(o.a("005lIecdcdk>d"));
                inputStream = (InputStream) ReflectHelper.invokeInstanceMethod(obj, o.a("014;ff:id-egdk*eOdcFdEeh1d]dhHi,dfOl"), new Object[0]);
            } catch (Throwable th2) {
                try {
                    MobLog.getInstance().w(th2);
                    if (obj != null) {
                        try {
                            ReflectHelper.invokeInstanceMethod(obj, o.a("007hi5fgBd_dhecdi"), new Object[0]);
                            return false;
                        } catch (Throwable unused) {
                            return false;
                        }
                    }
                } catch (Throwable th3) {
                    if (obj != null) {
                        try {
                            ReflectHelper.invokeInstanceMethod(obj, o.a("007hi5fgBd_dhecdi"), new Object[0]);
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable unused3) {
        }
        if (inputStream == null) {
            if (obj != null) {
                try {
                    ReflectHelper.invokeInstanceMethod(obj, o.a("007hi5fgBd_dhecdi"), new Object[0]);
                } catch (Throwable unused4) {
                }
            }
            return false;
        }
        String[] split = new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        if (split != null) {
            String[] split2 = o.a("068gNfgdifg!dil<je-gJfgdifg7dilg5fcdedkjeRg9fgdifg!dilg*fgfcdedkjeNgKfgdifg9dilgUdlfcdedkjeZgji8dkVhIecdhPg'fcdedkjeMgJfgfcdedkjeKgid%dg").split(",");
            int length = split.length;
            int i12 = 0;
            while (i12 < length) {
                String[] split3 = split[i12].split(" ");
                if (split3.length >= 4) {
                    boolean z11 = true;
                    String str = split3[1];
                    String str2 = split3[3];
                    int length2 = split2.length;
                    int i13 = i11;
                    while (i13 < length2) {
                        String str3 = split2[i13];
                        if (str != null && str.equalsIgnoreCase(str3)) {
                            String[] split4 = str2.split(",");
                            int length3 = split4.length;
                            int i14 = i11;
                            while (i14 < length3) {
                                boolean z12 = z11;
                                String str4 = split4[i14];
                                if (str4 != null && str4.equalsIgnoreCase(o.a("002Hdhfd"))) {
                                    if (obj != null) {
                                        try {
                                            ReflectHelper.invokeInstanceMethod(obj, o.a("007hi5fgBd_dhecdi"), new Object[0]);
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    return z12;
                                }
                                i14++;
                                z11 = z12;
                            }
                        }
                        i13++;
                        z11 = z11;
                        i11 = 0;
                    }
                }
                i12++;
                i11 = 0;
            }
        }
        if (obj != null) {
            ReflectHelper.invokeInstanceMethod(obj, o.a("007hi5fgBd_dhecdi"), new Object[0]);
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|3|(2:5|(8:7|(2:35|36)|9|10|(2:12|(3:14|(2:23|24)|(1:21)(2:18|19)))|28|(0)|(1:21)(1:22)))|40|(0)|9|10|(0)|28|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r4 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r4, com.mob.commons.o.a("007hiRfg2dZdhecdi"), new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #3 {all -> 0x0085, blocks: (B:10:0x004c, B:12:0x0066), top: B:9:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean aP() {
        /*
            r8 = this;
            java.lang.String r0 = "007hiRfg2dZdhecdi"
            java.lang.String r1 = "007hiRfg$d'dhecdi"
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.String r5 = "008(fd@c2dedg;cIicfgdc"
            java.lang.String r5 = com.mob.commons.o.a(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r4 = a(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "014UffFid8egdkQeZdc5d(eh1d$dh%i]dfZl"
            java.lang.String r5 = com.mob.commons.o.a(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r4, r5, r6)     // Catch: java.lang.Throwable -> L40
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L33
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L40
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L40
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r6.readLine()     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L33
            r5 = r2
            goto L34
        L33:
            r5 = r3
        L34:
            if (r4 == 0) goto L4c
            java.lang.String r1 = com.mob.commons.o.a(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4c
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r4, r1, r6)     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L40:
            if (r4 == 0) goto L4b
            java.lang.String r1 = com.mob.commons.o.a(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4b
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r4, r1, r5)     // Catch: java.lang.Throwable -> L4b
        L4b:
            r5 = r3
        L4c:
            java.lang.String r1 = "021g:fgdifgXdilg3dlfcdedkRg]fd1cAdedgPcQicfgdc"
            java.lang.String r1 = com.mob.commons.o.a(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r4 = a(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "014LffCidCegdk eXdc-d eh?d7dhNi=df?l"
            java.lang.String r1 = com.mob.commons.o.a(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r4, r1, r6)     // Catch: java.lang.Throwable -> L85
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L78
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L85
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L85
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L85
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L78
            r1 = r2
            goto L79
        L78:
            r1 = r3
        L79:
            if (r4 == 0) goto L91
            java.lang.String r0 = com.mob.commons.o.a(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L91
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r4, r0, r6)     // Catch: java.lang.Throwable -> L91
            goto L91
        L85:
            if (r4 == 0) goto L90
            java.lang.String r0 = com.mob.commons.o.a(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L90
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r4, r0, r1)     // Catch: java.lang.Throwable -> L90
        L90:
            r1 = r3
        L91:
            if (r5 != 0) goto L97
            if (r1 == 0) goto L96
            goto L97
        L96:
            r2 = r3
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.aP():boolean");
    }

    private String aQ() {
        try {
            return Data.byteToHex(Data.SHA1(((String) null) + ":" + f() + ":" + d()));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    private String aR() throws Throwable {
        HashMap<String, Object> hashMap;
        HashMap hashMap2;
        try {
            hashMap = aS();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            hashMap = null;
        }
        if (hashMap == null || (hashMap2 = (HashMap) hashMap.get(o.a("010hij:dedgHi=egdkfhec"))) == null) {
            return null;
        }
        try {
            String str = (String) hashMap2.get("iemt");
            if (TextUtils.isEmpty(str)) {
                str = (String) hashMap2.get("snmt");
            }
            return Data.byteToHex(Data.SHA1(((String) null) + ":" + str + ":" + ((String) hashMap2.get(o.a("005l;ec]hi2ed")))));
        } catch (Throwable th3) {
            MobLog.getInstance().d(th3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:35:0x0034, B:17:0x0041, B:19:0x0047, B:16:0x003d), top: B:34:0x0034, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #4 {all -> 0x005d, blocks: (B:3:0x0001, B:5:0x0013, B:20:0x0053, B:33:0x005f, B:28:0x0070, B:31:0x007b, B:32:0x0084, B:27:0x0069, B:35:0x0034, B:17:0x0041, B:19:0x0047, B:16:0x003d), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashMap<java.lang.String, java.lang.Object> aS() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.f41150a     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "014+dgec?llghIfcfg8gSel;h-dcde.h"
            java.lang.String r2 = com.mob.commons.o.a(r2)     // Catch: java.lang.Throwable -> L5d
            java.io.File r1 = com.mob.tools.utils.ResHelper.getDataCacheFile(r1, r2)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L8c
            boolean r2 = r1.isFile()     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L8c
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r3.readObject()     // Catch: java.lang.Throwable -> L2e
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2a:
            r3 = r0
            goto L2e
        L2c:
            r2 = r0
            r3 = r2
        L2e:
            r4 = r0
        L2f:
            r5 = 1
            r6 = 0
            r7 = 2
            if (r4 == 0) goto L3d
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L41
            goto L3d
        L3b:
            r1 = move-exception
            goto L69
        L3d:
            java.util.HashMap r4 = r9.a(r1)     // Catch: java.lang.Throwable -> L3b
        L41:
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L5f
            java.lang.String r1 = "010hijOdedg^i*egdkfhec"
            java.lang.String r1 = com.mob.commons.o.a(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r4.get(r1)     // Catch: java.lang.Throwable -> L3b
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L3b
            java.io.Closeable[] r4 = new java.io.Closeable[r7]     // Catch: java.lang.Throwable -> L5d
            r4[r6] = r2     // Catch: java.lang.Throwable -> L5d
            r4[r5] = r3     // Catch: java.lang.Throwable -> L5d
            com.mob.commons.r.a(r4)     // Catch: java.lang.Throwable -> L5d
            return r1
        L5d:
            r1 = move-exception
            goto L85
        L5f:
            java.io.Closeable[] r1 = new java.io.Closeable[r7]     // Catch: java.lang.Throwable -> L5d
            r1[r6] = r2     // Catch: java.lang.Throwable -> L5d
            r1[r5] = r3     // Catch: java.lang.Throwable -> L5d
            com.mob.commons.r.a(r1)     // Catch: java.lang.Throwable -> L5d
            goto L8c
        L69:
            com.mob.tools.log.NLog r4 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L7a
            r4.w(r1)     // Catch: java.lang.Throwable -> L7a
            java.io.Closeable[] r1 = new java.io.Closeable[r7]     // Catch: java.lang.Throwable -> L5d
            r1[r6] = r2     // Catch: java.lang.Throwable -> L5d
            r1[r5] = r3     // Catch: java.lang.Throwable -> L5d
            com.mob.commons.r.a(r1)     // Catch: java.lang.Throwable -> L5d
            goto L8c
        L7a:
            r1 = move-exception
            java.io.Closeable[] r4 = new java.io.Closeable[r7]     // Catch: java.lang.Throwable -> L5d
            r4[r6] = r2     // Catch: java.lang.Throwable -> L5d
            r4[r5] = r3     // Catch: java.lang.Throwable -> L5d
            com.mob.commons.r.a(r4)     // Catch: java.lang.Throwable -> L5d
            throw r1     // Catch: java.lang.Throwable -> L5d
        L85:
            com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()
            r2.w(r1)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.aS():java.util.HashMap");
    }

    private String aT() throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        File cacheRootFile;
        File file = new File(G(), o.a("008Deh@cBdfdhUi*ehfihj"));
        if (file.exists()) {
            File file2 = new File(file, o.a("003MelXh-dj"));
            if (file2.exists() && (cacheRootFile = ResHelper.getCacheRootFile(this.f41150a, o.a("003%el[hBdj"))) != null && file2.renameTo(cacheRootFile)) {
                file2.delete();
            }
        }
        File cacheRootFile2 = ResHelper.getCacheRootFile(this.f41150a, o.a("003Del;h<dj"));
        String str = null;
        if (cacheRootFile2 != null && !cacheRootFile2.exists()) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(cacheRootFile2));
            try {
                Object readObject = objectInputStream.readObject();
                if (readObject != null && (readObject instanceof char[])) {
                    str = String.valueOf((char[]) readObject);
                }
                r.a(objectInputStream);
                return str;
            } catch (Throwable th3) {
                th2 = th3;
                r.a(objectInputStream);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            objectInputStream = null;
        }
    }

    private Object aU() {
        Object d11;
        try {
            if (this.f41159k != null && System.currentTimeMillis() - this.f41160l <= 5000) {
                return this.f41159k;
            }
            if (!f(o.a("041Ndfdk!hXdhecde7h=el5eiLdh+lHdefgfgdeecdkelejgfgfgcehehddgffkejgdehgcddekfkgfejeiegfkef")) || (d11 = d("phone")) == null) {
                return null;
            }
            this.f41159k = ReflectHelper.invokeInstanceMethod(d11, o.a("015:ff$idGgf=iMededekecdgdfHdVdeecdk"), new Object[0]);
            this.f41160l = System.currentTimeMillis();
            return this.f41159k;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public String A() {
        try {
            String lowerCase = x().toLowerCase();
            if (!TextUtils.isEmpty(lowerCase) && !o.a("004 dkecdk[i").equals(lowerCase)) {
                return lowerCase.startsWith(o.a("004Dfddefhde")) ? o.a("004Afddefhde") : lowerCase.startsWith(o.a("002Kheff")) ? o.a("002@heff") : lowerCase.startsWith(o.a("0025jiff")) ? o.a("002)jiff") : lowerCase.startsWith(o.a("0024jcff")) ? o.a("002Rjcff") : lowerCase.startsWith(o.a("002;gjff")) ? o.a("002%gjff") : lowerCase.startsWith(o.a("009]fceddcTid'ecec-dc")) ? o.a("0092fceddcQid*ececSdc") : lowerCase;
            }
            return o.a("004EdkecdkLi");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return o.a("004PdkecdkGi");
        }
    }

    public String B() {
        return a(false);
    }

    public String C() {
        if (!"-1".equals(this.f41158j.f41442p)) {
            return this.f41158j.f41442p;
        }
        this.f41158j.f41442p = this.f41150a.getPackageName();
        return this.f41158j.f41442p;
    }

    public String D() {
        if (!TextUtils.isEmpty(this.f41158j.f41443q)) {
            return this.f41158j.f41443q;
        }
        try {
            ApplicationInfo applicationInfo = this.f41150a.getApplicationInfo();
            String str = applicationInfo.name;
            if (str != null) {
                if (Build.VERSION.SDK_INT < 25 || str.endsWith(".*")) {
                    this.f41158j.f41443q = str;
                    return str;
                }
                try {
                    ReflectHelper.importClass(str);
                    str = null;
                } catch (Throwable unused) {
                }
            }
            int i11 = applicationInfo.labelRes;
            if (i11 > 0) {
                try {
                    str = this.f41150a.getString(i11);
                } catch (Throwable th2) {
                    MobLog.getInstance().w(th2);
                }
            } else {
                str = String.valueOf(applicationInfo.nonLocalizedLabel);
            }
            this.f41158j.f41443q = str;
            return str;
        } catch (Throwable th3) {
            MobLog.getInstance().w(th3);
            return "";
        }
    }

    public int E() {
        PackageInfo a11;
        long longVersionCode;
        int i11 = this.f41158j.f41444r;
        if (i11 != -1) {
            return i11;
        }
        try {
            a11 = g.a(this.f41150a).a().a(this.f41150a.getPackageName(), 0);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            this.f41158j.f41444r = 0;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f41158j.f41444r = a11.versionCode;
            return this.f41158j.f41444r;
        }
        com.mob.tools.utils.a aVar = this.f41158j;
        longVersionCode = a11.getLongVersionCode();
        aVar.f41444r = (int) longVersionCode;
        return this.f41158j.f41444r;
    }

    public String F() {
        if (!"-1".equals(this.f41158j.f41445s)) {
            return this.f41158j.f41445s;
        }
        try {
            PackageInfo a11 = g.a(this.f41150a).a().a(this.f41150a.getPackageName(), 0);
            this.f41158j.f41445s = a11.versionName;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            this.f41158j.f41445s = "1.0";
        }
        return this.f41158j.f41445s;
    }

    public String G() {
        try {
            if (!TextUtils.isEmpty(this.f41158j.f41423a)) {
                return this.f41158j.f41423a;
            }
            if (Build.VERSION.SDK_INT < 29 || this.f41150a.getApplicationInfo().targetSdkVersion < 29 || !"mounted".equals(Environment.getExternalStorageState())) {
                this.f41158j.f41423a = this.f41150a.getFilesDir().getAbsolutePath();
            } else {
                this.f41158j.f41423a = this.f41150a.getExternalFilesDir(null).getAbsolutePath();
            }
            return this.f41158j.f41423a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String H() throws Throwable {
        return null;
    }

    public synchronized String I() {
        String str;
        if (!com.mob.commons.b.k()) {
            return null;
        }
        if (!"-1".equals(this.f41158j.f41430d) && !"-2".equals(this.f41158j.f41430d)) {
            return this.f41158j.f41430d;
        }
        try {
            if (Build.VERSION.SDK_INT < 29 && f(o.a("035Zdfdk)h]dhecdeTh0elNei.dhIlBdefgfgdeecdkelgdgcejfiddgghcfkefgcddeheiejeigc"))) {
                Object d11 = d("phone");
                if (d11 == null) {
                    return null;
                }
                this.f41158j.f41430d = b(d11);
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2.getMessage());
        }
        if (!"-2".equals(this.f41158j.f41430d) && ("-1".equals(this.f41158j.f41430d) || (str = this.f41158j.f41430d) == null || str.length() < 15)) {
            String[] J = J();
            if (J != null && J.length > 0 && J[0].length() >= 15) {
                this.f41158j.f41430d = J[0];
            }
            if ("-1".equals(this.f41158j.f41430d)) {
                this.f41158j.f41430d = "-2";
            }
        }
        return this.f41158j.f41430d;
    }

    public synchronized String[] J() {
        if (!com.mob.commons.b.k()) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT < 29 && f(o.a("035:dfdkHhJdhecdeEh(el0ei;dhJl(defgfgdeecdkelgdgcejfiddgghcfkefgcddeheiejeigc"))) {
                ArrayList<String> arrayList = this.f41158j.f41446t;
                if (arrayList != null) {
                    if (arrayList.size() <= 0) {
                        return null;
                    }
                    ArrayList<String> arrayList2 = this.f41158j.f41446t;
                    return (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                }
                String b11 = b(o.a("021?fffgAl4elfgdeNlPelec,ei0dhdfGd,ecdheldeNl,fgde"));
                this.f41158j.f41446t = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                for (String str : b11.split(",")) {
                    if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                        this.f41158j.f41446t.add(str);
                        arrayList3.add(str);
                    }
                }
                if (arrayList3.size() > 0) {
                    return (String[]) arrayList3.toArray(new String[arrayList3.size()]);
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return null;
    }

    public int K() {
        try {
            Object aU = aU();
            if (aU != null && !o.a("016Ggf7hl0dfgfGiNededekecdgdf$dWdeecdk").equals(aU.getClass().getSimpleName())) {
                return ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(aU, o.a("006 ff<id:gfde-h"), new Object[0]), -1)).intValue();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return -1;
    }

    public int L() {
        try {
            Object aU = aU();
            if (aU != null && !o.a("016@gfPhl[dfgf7iHededekecdgdf?d?deecdk").equals(aU.getClass().getSimpleName())) {
                return ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(aU, o.a("006]ff8id2ekdfdg"), new Object[0]), -1)).intValue();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return -1;
    }

    public int M() {
        try {
            Object aU = aU();
            if (aU != null && !o.a("016Mgf(hlOdfgf6iDededekecdgdfFd@deecdk").equals(aU.getClass().getSimpleName())) {
                return ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(aU, o.a("006Kff@id9ggfgdg"), new Object[0]), -1)).intValue();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int N() {
        /*
            r4 = this;
            r0 = -1
            java.lang.Object r1 = r4.aU()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L3f
            java.lang.String r2 = "0160gf3hlGdfgfRiNededekecdgdfZdEdeecdk"
            java.lang.String r2 = com.mob.commons.o.a(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L37
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L3f
            java.lang.String r2 = "022+ff2idRfjdffgXiBehXd*dfQdNdeecdkekdfEd[de;dZdc<hi"
            java.lang.String r2 = com.mob.commons.o.a(r2)     // Catch: java.lang.Throwable -> L37
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = com.mob.tools.utils.ResHelper.forceCast(r1, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L37
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r1 = move-exception
            com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()
            r2.d(r1)
        L3f:
            r1 = r0
        L40:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L46
            goto L47
        L46:
            r0 = r1
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.N():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int O() {
        /*
            r4 = this;
            r0 = -1
            java.lang.Object r1 = r4.aU()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L3f
            java.lang.String r2 = "016-gf[hl dfgf>iXededekecdgdf%d1deecdk"
            java.lang.String r2 = com.mob.commons.o.a(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L37
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L3f
            java.lang.String r2 = "023[ff<id5fjdffgMiWeh(dHdfFdDdeecdkekecdkffde=d-dcFhi"
            java.lang.String r2 = com.mob.commons.o.a(r2)     // Catch: java.lang.Throwable -> L37
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = com.mob.tools.utils.ResHelper.forceCast(r1, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L37
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r1 = move-exception
            com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()
            r2.d(r1)
        L3f:
            r1 = r0
        L40:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L46
            goto L47
        L46:
            r0 = r1
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.O():int");
    }

    public int P() {
        try {
            Object aU = aU();
            if (aU != null && o.a("0165gfMhl>dfgf1iGededekecdgdfPd)deecdk").equals(aU.getClass().getSimpleName())) {
                return ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(aU, o.a("016.ff<idBfjdffg^iEeh%d0df>dYdeecdkeg@h"), new Object[0]), -1)).intValue();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return -1;
    }

    public int Q() {
        try {
            Object aU = aU();
            if (aU != null && o.a("016Sgf1hlSdfgfNiJededekecdgdf_dCdeecdk").equals(aU.getClass().getSimpleName())) {
                return ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(aU, o.a("011NffBid<ehdifg$dil'eg%h"), new Object[0]), -1)).intValue();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return -1;
    }

    public int R() {
        try {
            Object aU = aU();
            if (aU != null && o.a("016(gf_hl!dfgf_iLededekecdgdfId^deecdk").equals(aU.getClass().getSimpleName())) {
                return ((Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(aU, o.a("012Jff id0ef!id.fdecdhdjeg8h"), new Object[0]), -1)).intValue();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return -1;
    }

    public ArrayList<HashMap<String, Object>> S() {
        Object d11;
        List list;
        try {
            if (!f(o.a("041Kdfdk8h_dhecdePh(el<ei:dhOlVdefgfgdeecdkelejgfgfgcehehddgffkejgdehgcddekfkgfejeiegfkef")) || aq() || (d11 = d("phone")) == null || (list = (List) ReflectHelper.invokeInstanceMethod(d11, o.a("022'ffKid9ef9iOdeffHcYfcecdhdedkffgfZi=ededegdkfhec"), new Object[0])) == null || list.size() <= 0) {
                return null;
            }
            ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
            for (Object obj : list) {
                Integer num = (Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, o.a("006]ff;idUgfdeDh"), new Object[0]), -1);
                int intValue = num.intValue();
                Integer num2 = (Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, o.a("006*ffVidCekdfdg"), new Object[0]), -1);
                int intValue2 = num2.intValue();
                Integer num3 = (Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, o.a("007ZffTid gdfgfgde"), new Object[0]), -1);
                num3.intValue();
                Integer num4 = (Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, o.a("0064ff_idOggfgdg"), new Object[0]), -1);
                num4.intValue();
                Integer num5 = (Integer) ResHelper.forceCast(ReflectHelper.invokeInstanceMethod(obj, o.a("014Off]idLef8idPfdecdhdjeidi ei"), new Object[0]), -1);
                num5.intValue();
                if (intValue != -1 && intValue2 != -1) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put(o.a("004Bdg+iUeded"), num);
                    hashMap.put(o.a("003*eddfdg"), num2);
                    hashMap.put(o.a("004Tdhfgfgde"), num3);
                    hashMap.put(o.a("003eKfgdg"), num4);
                    hashMap.put(o.a("011Wdk8id$fdecdhdjeidi^ei"), num5);
                    arrayList.add(hashMap);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public String T() {
        if (!TextUtils.isEmpty(this.f41158j.f41447u)) {
            return this.f41158j.f41447u;
        }
        try {
            UiModeManager uiModeManager = (UiModeManager) d("uimode");
            if (uiModeManager != null) {
                switch (uiModeManager.getCurrentModeType()) {
                    case 1:
                        this.f41158j.f41447u = o.a("005$effkddeeeg");
                        break;
                    case 2:
                        this.f41158j.f41447u = o.a("004Mfigcehhj");
                        break;
                    case 3:
                        this.f41158j.f41447u = o.a("003Kgfejgd");
                        break;
                    case 4:
                        this.f41158j.f41447u = o.a("0104eigcekgcgeegehegfkef");
                        break;
                    case 5:
                        this.f41158j.f41447u = o.a("009Mejggggekegejefgfgc");
                        break;
                    case 6:
                        this.f41158j.f41447u = o.a("0056glejeigfhc");
                        break;
                    case 7:
                        this.f41158j.f41447u = o.a("009Hgegdhcgcejfiehgcei");
                        break;
                    default:
                        this.f41158j.f41447u = o.a("009Meeeffigchdegefgcfi");
                        break;
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            this.f41158j.f41447u = o.a("009'eeeffigchdegefgcfi");
        }
        return this.f41158j.f41447u;
    }

    public Object U() {
        final ReflectHelper.a<Void, Object> aVar = new ReflectHelper.a<Void, Object>() { // from class: com.mob.tools.a.b.1
            @Override // com.mob.tools.utils.ReflectHelper.a
            public Object a(Void r32) {
                try {
                    return ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(o.a("026^dfdkHhLdhecdeSh9eldf<ee3elejdg.d'de^j2de!dNdiei*c1dhIi7df<h")), o.a("0210dgdcdhdh9iLdk0dQejdgNd8deKj^de.d[dieiEc6dh4i'df-h"), new Object[0]);
                } catch (Throwable th2) {
                    MobLog.getInstance().w(th2);
                    return null;
                }
            }
        };
        Thread.currentThread().getId();
        Looper.getMainLooper().getThread().getId();
        Object a11 = aVar.a(null);
        if (a11 != null) {
            return a11;
        }
        final Object obj = new Object();
        final Object[] objArr = new Object[1];
        synchronized (obj) {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.a.b.2
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    synchronized (obj) {
                        try {
                            objArr[0] = aVar.a(null);
                        } catch (Throwable th2) {
                            try {
                                MobLog.getInstance().w(th2);
                                try {
                                    obj.notify();
                                } catch (Throwable th3) {
                                    th = th3;
                                    MobLog.getInstance().w(th);
                                    return false;
                                }
                            } finally {
                            }
                        }
                        try {
                            obj.notify();
                        } catch (Throwable th4) {
                            th = th4;
                            MobLog.getInstance().w(th);
                            return false;
                        }
                    }
                    return false;
                }
            });
            try {
                obj.wait();
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
        }
        return objArr[0];
    }

    public Context V() {
        try {
            Object U = U();
            if (U != null) {
                return (Context) ReflectHelper.invokeInstanceMethod(U, o.a("014^ff^id0ejJeeEeddedgdf(dCdeecdk"), new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public HashMap<String, Object> W() {
        Object d11;
        Object invokeInstanceMethod;
        try {
            if (!f(o.a("036!dfdkZhBdhecdeNhAelEeiMdh$l.defgfgdeecdkelejgfgfgcehehddgleghdegddeheiejeigc")) || (d11 = d("wifi")) == null || (invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(d11, o.a("017,ffOidCgfecdkdk0iCdgWd?deecdkegdkfhec"), new Object[0])) == null) {
                return null;
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("bsmt", c());
            hashMap.put("ssmt", b());
            try {
                Boolean bool = (Boolean) ReflectHelper.invokeInstanceMethod(invokeInstanceMethod, o.a("013PffJidVhcde]hhiCdkehehegfi"), new Object[0]);
                bool.booleanValue();
                hashMap.put(o.a("006cCde@hhi,dk"), bool);
            } catch (Throwable unused) {
            }
            try {
                Integer num = (Integer) ReflectHelper.invokeInstanceMethod(invokeInstanceMethod, o.a("012=ffCid?ekdedkdjeh?eiih"), new Object[0]);
                num.intValue();
                hashMap.put("spmt", num);
            } catch (Throwable unused2) {
            }
            try {
                Integer num2 = (Integer) ReflectHelper.invokeInstanceMethod(invokeInstanceMethod, o.a("012;ffDid8efZidKfdecdhdjegPh"), new Object[0]);
                num2.intValue();
                hashMap.put(o.a("009_dkWid*fdecdhdjeg8h"), num2);
            } catch (Throwable unused3) {
            }
            try {
                Integer num3 = (Integer) ReflectHelper.invokeInstanceMethod(invokeInstanceMethod, o.a("007_ffZidZgdfgfgde"), new Object[0]);
                num3.intValue();
                hashMap.put(o.a("005'ed>iji5ed"), num3);
            } catch (Throwable unused4) {
            }
            try {
                Integer num4 = (Integer) ReflectHelper.invokeInstanceMethod(invokeInstanceMethod, o.a("012Eff0id=hddhIikNdcLiOdkdgdi"), new Object[0]);
                num4.intValue();
                hashMap.put(o.a("009Jfhdh)ik*dc@iNdkdgdi"), num4);
            } catch (Throwable unused5) {
            }
            return hashMap;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public ArrayList<HashMap<String, Object>> X() {
        Object d11;
        List list;
        String[] split;
        String[] split2;
        String trim;
        try {
            if (!f(o.a("036.dfdk+h>dhecde;h;elAeiRdh-l%defgfgdeecdkelejgfgfgcehehddgleghdegddeheiejeigc")) || (d11 = d("wifi")) == null || (list = (List) ReflectHelper.invokeInstanceMethod(d11, o.a("014.ff[idCehdgdfdkgd6i-fgdcedHd]fg"), new Object[0])) == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT > 27) {
                split = o.a("086Yehehegfijefjehehegfijedgdf,e!dffcdeedde,dZdePi4fgjeed_iji@edjefhdh)ikTdc?iZdkdgdijedgQc-dfdkdkUi0edglde.hdcYjedgZiLdkRdiTdhhddhHik!fejedg+i9dk1di3dhhddhWik?gkjeDd.deRli7fgTdAdf3le").split(",");
                split2 = o.a("031ji_dkdcLiUefdf_li!jeicecHei'dhdfTdJecdhhddhde(i]dkDhOeddiefdfPli").split(",");
            } else {
                split = "SSID,BSSID,hessid,anqpDomainId,capabilities,level,frequency,channelWidth,centerFreq0,centerFreq1,timestamp,seen,isAutoJoinCandidate,numIpConfigFailures,blackListTimestamp,untrusted,numConnection,numUsage,distanceCm,distanceSdCm,flags".split(",");
                split2 = o.a("0396fddefhdeehfgde@hEje.jiMdkdc2iRefdf*li^jeec+eiAdhdf dPecdhhddhdeDiAdkBhNeddiefdfGli").split(",");
            }
            ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
            for (Object obj : list) {
                HashMap<String, Object> hashMap = new HashMap<>();
                int length = split.length;
                String str = null;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    try {
                        trim = split[i11].trim();
                    } catch (Throwable unused) {
                    }
                    if (o.a("004Wehehegfi").equals(trim)) {
                        String str2 = (String) ReflectHelper.getInstanceField(obj, trim);
                        if (TextUtils.isEmpty(str2)) {
                            str = str2;
                            break;
                        }
                        hashMap.put(trim, str2);
                        str = str2;
                        i11++;
                    } else {
                        if (o.a("012EdgdfSe6dffcdeeddeEdMdeCi:fg").equals(trim)) {
                            String str3 = (String) ReflectHelper.getInstanceField(obj, trim);
                            if (str3 != null && str3.contains("[IBSS]")) {
                                str = null;
                                break;
                            }
                            hashMap.put(trim, str3);
                        } else {
                            hashMap.put(trim, ReflectHelper.getInstanceField(obj, trim));
                        }
                        i11++;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    for (String str4 : split2) {
                        try {
                            String trim2 = str4.trim();
                            Object instanceField = ReflectHelper.getInstanceField(obj, trim2);
                            hashMap.put(trim2, instanceField == null ? null : instanceField.toString());
                        } catch (Throwable unused2) {
                        }
                    }
                    try {
                        hashMap.put(o.a("021!defggifegjgkgkghdggdeieigdXiMfgFeJecdkZhi$dh"), ReflectHelper.invokeInstanceMethod(obj, o.a("0186defggifegjgkgk%lIdggd5iOfg%e?ecdk-hi.dh"), new Object[0]));
                    } catch (Throwable unused3) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT < 28) {
                            List list2 = (List) ReflectHelper.getInstanceField(obj, o.a("009?dfdkVke+ekdedkJi;fg"));
                            hashMap.put(o.a("009'dfdkNke9ekdedk$i^fg"), list2 == null ? null : new ArrayList(list2));
                        }
                    } catch (Throwable unused4) {
                    }
                    arrayList.add(hashMap);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return null;
    }

    public boolean Y() {
        Object d11;
        try {
            if (!f(o.a("036%dfdk[hSdhecde@h-el*eiDdh?lMdefgfgdeecdkelgfhcejefhkgcddgleghdegddeheiejeigc")) || (d11 = d("wifi")) == null) {
                return false;
            }
            return ((Boolean) ReflectHelper.invokeInstanceMethod(d11, o.a("009UfgYd*dfdh]dOehdgdfdk"), new Object[0])).booleanValue();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r5 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        r3.add(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap<java.lang.String, java.lang.Object> Z() {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "013geFdhecdgEg>dgHe:dcdedkfhec"
            java.lang.String r2 = com.mob.commons.o.a(r2)     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "010e6dhecdg5iCfgfgecdhfg"
            java.lang.String r4 = com.mob.commons.o.a(r4)     // Catch: java.lang.Throwable -> L37
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L37
            r4 = 0
        L24:
            r5 = r4
        L25:
            java.lang.String r6 = r2.readLine()     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L82
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L39
            if (r5 == 0) goto L24
            r3.add(r5)     // Catch: java.lang.Throwable -> L37
            goto L24
        L37:
            r1 = move-exception
            goto L89
        L39:
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = "009e2dhecdg?iBfgfgecdh"
            java.lang.String r7 = com.mob.commons.o.a(r7)     // Catch: java.lang.Throwable -> L37
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L53
            if (r5 == 0) goto L4e
            r3.add(r5)     // Catch: java.lang.Throwable -> L37
        L4e:
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L37
            r5.<init>()     // Catch: java.lang.Throwable -> L37
        L53:
            java.lang.String r7 = ":"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L25
            int r7 = r6.length     // Catch: java.lang.Throwable -> L37
            r8 = 1
            if (r7 <= r8) goto L25
            r7 = 0
            if (r5 != 0) goto L72
            r7 = r6[r7]     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L37
            r6 = r6[r8]     // Catch: java.lang.Throwable -> L37
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L37
            r0.put(r7, r6)     // Catch: java.lang.Throwable -> L37
            goto L25
        L72:
            r7 = r6[r7]     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L37
            r6 = r6[r8]     // Catch: java.lang.Throwable -> L37
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L37
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L37
            goto L25
        L82:
            r2.close()     // Catch: java.lang.Throwable -> L37
            r1.close()     // Catch: java.lang.Throwable -> L37
            return r0
        L89:
            com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()
            r2.d(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.Z():java.util.HashMap");
    }

    public String aA() {
        String str;
        if (!"-1".equals(this.f41158j.F)) {
            return this.f41158j.F;
        }
        try {
            str = b(o.a("017,dhecelfcecdfdh)h'el5e.eddfTdRfhecdhEl"));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            str = null;
        }
        this.f41158j.F = str;
        return str;
    }

    public int aB() {
        return NtFetcher.getInstance(this.f41150a).getDtNtType();
    }

    public String aC() {
        if (!"-1".equals(this.f41158j.G)) {
            return this.f41158j.G;
        }
        String str = null;
        try {
            String string = Settings.Secure.getString(this.f41150a.getContentResolver(), "default_input_method");
            if (!TextUtils.isEmpty(string)) {
                str = string.split(o.a("001g"))[0];
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        this.f41158j.G = str;
        return str;
    }

    public HashMap<String, Object> aD() {
        com.mob.tools.utils.a aVar = this.f41158j;
        HashMap<String, Object> hashMap = aVar.H;
        if (hashMap != null) {
            return hashMap;
        }
        aVar.H = new HashMap<>();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        try {
            String aC = aC();
            hashMap2.put(o.a("004MdkdfXli"), e(aC));
            hashMap2.put(o.a("003e$djff"), aC);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        this.f41158j.H.putAll(hashMap2);
        return hashMap2;
    }

    public ArrayList<HashMap<String, Object>> aE() {
        com.mob.tools.utils.a aVar = this.f41158j;
        ArrayList<HashMap<String, Object>> arrayList = aVar.I;
        if (arrayList != null) {
            return arrayList;
        }
        aVar.I = new ArrayList<>();
        ArrayList<HashMap<String, Object>> arrayList2 = new ArrayList<>();
        try {
            for (InputMethodInfo inputMethodInfo : ((InputMethodManager) d("input_method")).getInputMethodList()) {
                if (inputMethodInfo != null) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put(o.a("004'dkdf;li"), inputMethodInfo.loadLabel(this.f41150a.getPackageManager()));
                    hashMap.put(o.a("003e'djff"), inputMethodInfo.getPackageName());
                    arrayList2.add(hashMap);
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        this.f41158j.I.addAll(arrayList2);
        return arrayList2;
    }

    public String aF() {
        if (!"-1".equals(this.f41158j.J)) {
            return this.f41158j.J;
        }
        com.mob.tools.utils.a aVar = this.f41158j;
        String str = Build.BRAND;
        aVar.J = str;
        return str;
    }

    public boolean aG() {
        Boolean bool;
        try {
            bool = this.f41152d;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        com.mob.tools.utils.f fVar = new com.mob.tools.utils.f();
        int i11 = fVar.a(this.f41150a) == 1 ? 1 : 0;
        if (fVar.b(this.f41150a) == 1) {
            i11++;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        if (fVar.c(this.f41150a) == 1) {
            i11++;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        if (fVar.d(this.f41150a) == 1) {
            i11++;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        if (fVar.a() == 1) {
            i11++;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        if (fVar.e(this.f41150a) == 1) {
            i11++;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        if (fVar.f(this.f41150a) == 1) {
            i11++;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        if (fVar.b() == 1) {
            i11++;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        if (i11 >= 2) {
            this.f41152d = Boolean.TRUE;
            return true;
        }
        this.f41152d = Boolean.FALSE;
        return false;
    }

    public HashMap<String, Object> aH() {
        BufferedReader bufferedReader;
        Throwable th2;
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(o.a("013ge)dhecdgKglil)dedkfhec")));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            return hashMap;
                        }
                        String[] split = readLine.split("\\s+");
                        if (split != null && split.length > 1) {
                            String str = split[0];
                            long parseLong = Long.parseLong(split[1]) * 1024;
                            if ("MemTotal:".equals(str)) {
                                hashMap.put(o.a("015d5ec9d3dfedgh1ilAecdhdiehdeflAi"), Long.valueOf(parseLong));
                            } else if (o.a("008$gh@ilEhddh@iif").equals(str)) {
                                hashMap.put(o.a("014=fhdhCii'ghDil]ecdhdiehdefl?i"), Long.valueOf(parseLong));
                            } else if (o.a("013;ghOil7ej9j*dfdeeddffcedIif").equals(str)) {
                                hashMap.put(o.a("019(dfVjLdfdeeddffcedPiOghLil(ecdhdiehdefl;i"), Long.valueOf(parseLong));
                            } else if (o.a("007Sejdg=dGde@jif").equals(str)) {
                                hashMap.put(o.a("0163dfdgGd5de_ji.gh7ilMecdhdiehdeflNi"), Long.valueOf(parseLong));
                            } else if ("Inactive:".equals(str)) {
                                hashMap.put(o.a("018,dedkdfdg=d=deBjiEgh=ilNecdhdiehdeflJi"), Long.valueOf(parseLong));
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            MobLog.getInstance().d(th2);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return hashMap;
                        } catch (Throwable th4) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th5) {
                                    MobLog.getInstance().d(th5);
                                }
                            }
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th6) {
                bufferedReader = null;
                th2 = th6;
            }
        } catch (Throwable th7) {
            MobLog.getInstance().d(th7);
        }
    }

    public boolean aI() {
        String e11;
        String ag2;
        boolean z11;
        Boolean bool = this.f41158j.L;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z12 = false;
        try {
            e11 = e();
            ag2 = ag();
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            MobLog.getInstance().d(message, new Object[0]);
        }
        if (!TextUtils.isEmpty(ag2) && ag2.length() >= 3) {
            if (Integer.parseInt(ag2.substring(1)) >= 12) {
                z11 = true;
                if (o.a("006!dldedfecTlRde").equalsIgnoreCase(e11) && z11) {
                    z12 = true;
                }
                this.f41158j.L = Boolean.valueOf(z12);
                return z12;
            }
        }
        z11 = false;
        if (o.a("006!dldedfecTlRde").equalsIgnoreCase(e11)) {
            z12 = true;
        }
        this.f41158j.L = Boolean.valueOf(z12);
        return z12;
    }

    public boolean aJ() {
        if (this.f41158j.X != null) {
            return this.f41158j.X.booleanValue();
        }
        this.f41158j.X = Boolean.valueOf(b(this.f41150a) != 0);
        return this.f41158j.X.booleanValue();
    }

    public String aK() {
        String processName;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                return processName;
            }
            Method declaredMethod = Class.forName(o.a("026Kdfdk!h8dhecde3h4eldfTee;elejdgDd_de9jAdeGdSdiei8cYdh1i;dfBh"), false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            return invoke instanceof String ? (String) invoke : "";
        } catch (Throwable th2) {
            MobLog.getInstance().d("MobPush getProcessName: " + th2, new Object[0]);
            return "";
        }
    }

    public long aL() {
        try {
            return g.a(this.f41150a).a().a(this.f41150a.getPackageName(), 0).lastUpdateTime;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0L;
        }
    }

    public ArrayList<ArrayList<String>> aa() {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT < 28) {
            try {
                FileReader fileReader = new FileReader(o.a("017ge+dhecdgVgddCdi+gh,dhdeVjiYdhfg"));
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        fileReader.close();
                        return arrayList;
                    }
                    if (!TextUtils.isEmpty(readLine)) {
                        String[] split = readLine.trim().split(" ");
                        if (split.length > 1) {
                            ArrayList<String> arrayList2 = new ArrayList<>();
                            for (String str : split) {
                                if (!TextUtils.isEmpty(str)) {
                                    arrayList2.add(str.trim());
                                }
                            }
                            arrayList.add(arrayList2);
                        }
                    }
                }
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }

    public int ab() {
        try {
            return Settings.System.getInt(this.f41150a.getContentResolver(), "screen_brightness");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    public int ac() {
        try {
            return Settings.System.getInt(this.f41150a.getContentResolver(), "screen_brightness_mode");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    public String ad() {
        String a11 = g.a(this.f41150a).a().a(o.a("014Ddheceldj>i>dhdkMi<edelQkil0dc"), "0");
        return a11 == null ? "0" : a11;
    }

    public HashMap<String, HashMap<String, Long>> ae() {
        HashMap<String, HashMap<String, Long>> hashMap = new HashMap<>();
        String[] strArr = {o.a("006WfgAhBdgdfdh2h"), o.a("004hIdf8dNdf")};
        for (int i11 = 0; i11 < 2; i11++) {
            String str = strArr[i11];
            HashMap<String, Long> hashMap2 = new HashMap<>();
            hashMap2.put("available", -1L);
            hashMap2.put(o.a("004Yfhdh^ii"), -1L);
            hashMap2.put(o.a("005d^ec)dJdfed"), -1L);
            hashMap.put(str, hashMap2);
        }
        HashMap hashMap3 = new HashMap();
        try {
            String G = G();
            if (G != null) {
                hashMap3.put(o.a("006;fgAhEdgdfdh6h"), new StatFs(G));
            }
        } catch (Throwable unused) {
        }
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                hashMap3.put(o.a("004h'df.d+df"), new StatFs(dataDirectory.getPath()));
            }
        } catch (Throwable unused2) {
        }
        for (Map.Entry entry : hashMap3.entrySet()) {
            StatFs statFs = (StatFs) entry.getValue();
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            long freeBlocksLong = statFs.getFreeBlocksLong() * statFs.getBlockSizeLong();
            long blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            HashMap<String, Long> hashMap4 = hashMap.get(entry.getKey());
            hashMap4.put("available", Long.valueOf(availableBlocksLong));
            hashMap4.put(o.a("0040fhdh^ii"), Long.valueOf(freeBlocksLong));
            hashMap4.put(o.a("005d_ec:dUdfed"), Long.valueOf(blockCountLong));
        }
        return hashMap;
    }

    public HashMap<String, Long> af() {
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("available", -1L);
        hashMap.put(o.a("005d^ecMd3dfed"), -1L);
        hashMap.put(o.a("0051defgekecfd"), -1L);
        hashMap.put(o.a("009dc5dhGiZfgMcKeced:h"), -1L);
        try {
            Object d11 = d(o.a("008Tdfdg2dXde(j7deJd^di"));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ReflectHelper.invokeInstanceMethod(d11, o.a("013(ffRid ghOilVecdhdiegdkfhec"), memoryInfo);
            hashMap.put("available", Long.valueOf(memoryInfo.availMem));
            hashMap.put(o.a("005dLecQd:dfed"), Long.valueOf(memoryInfo.totalMem));
            hashMap.put(o.a("005Ndefgekecfd"), Long.valueOf(memoryInfo.lowMemory ? 1L : 0L));
            hashMap.put(o.a("009dcVdhZi.fgXc_eced7h"), Long.valueOf(memoryInfo.threshold));
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public String ag() {
        if (!"-1".equals(this.f41158j.f41424aa)) {
            return this.f41158j.f41424aa;
        }
        this.f41158j.f41424aa = com.mob.tools.utils.c.a().b();
        return this.f41158j.f41424aa;
    }

    public int ah() {
        return -1;
    }

    public boolean ai() {
        BufferedReader bufferedReader;
        Throwable th2;
        Boolean bool = this.f41158j.f41425ab;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {o.a("020OdgecHl5elDdNecIeMhfec,c]dkfddcel_l:dfffdefgdj"), o.a("032hiZeldhecfcEj@eldfdkZh4dhecde6h'eldl>e,ecfg2ih.eldedkfg;d?dfededRi.dh"), o.a("028JecdhffelHliQecfddgdf!d4el^ih,dlAeOecfgMih5el5l7dfdkdfff6i;dh"), o.a("027lXec<i%elfg2cSdefldcdjdceldhGih'dedhOi3dg?dPfgDdYecdhdfff$i")};
        for (int i11 = 0; i11 < 4; i11++) {
            if (g.a(this.f41150a).a().b(strArr[i11], 0) != null) {
                this.f41158j.f41425ab = Boolean.TRUE;
                return true;
            }
            continue;
        }
        try {
            throw new Exception("test");
        } catch (Throwable th3) {
            for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                if (stackTraceElement.getClassName().contains(o.a("035hi@eldhecfc4j%eldfdk1h;dhecdeMhGeldl9e'ecfg;ihBelhgRe2ecfgWihJfjdhde=hPff6i"))) {
                    this.f41158j.f41425ab = Boolean.TRUE;
                    return true;
                }
            }
            try {
                try {
                    ClassLoader.getSystemClassLoader().loadClass(o.a("036hiTeldhecfc4j1eldfdkLh%dhecdeEh8eldl)ePecfgLih@elhgKeEecfg-ih@hcFi edPei^dhfg")).newInstance();
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(o.a("035hiXeldhecfc1jVeldfdkVh^dhecde9h8eldl<eWecfg,ih3elhgTeGecfgXih[fjdhdeIh]ffJi")).newInstance();
                        this.f41158j.f41425ab = Boolean.TRUE;
                        return true;
                    } catch (IllegalAccessException unused) {
                        this.f41158j.f41425ab = Boolean.TRUE;
                        return true;
                    } catch (InstantiationException unused2) {
                        this.f41158j.f41425ab = Boolean.TRUE;
                        return true;
                    }
                } catch (Throwable unused3) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(o.a("006ge:dhecdg^g") + Process.myPid() + o.a("005gl!df4eVfg")));
                        boolean z11 = false;
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null || z11) {
                                    break;
                                }
                                z11 = readLine.toLowerCase().contains(o.a("006'dlBe.ecfgRih"));
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    MobLog.getInstance().d(th2);
                                    this.f41158j.f41425ab = Boolean.FALSE;
                                    return false;
                                } finally {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e11) {
                                            MobLog.getInstance().d(e11);
                                        }
                                    }
                                }
                            }
                        }
                        this.f41158j.f41425ab = Boolean.valueOf(z11);
                        try {
                            bufferedReader.close();
                        } catch (IOException e12) {
                            MobLog.getInstance().d(e12);
                        }
                        return z11;
                    } catch (Throwable th5) {
                        bufferedReader = null;
                        th2 = th5;
                    }
                }
            } catch (IllegalAccessException unused4) {
                this.f41158j.f41425ab = Boolean.TRUE;
                return true;
            } catch (InstantiationException unused5) {
                this.f41158j.f41425ab = Boolean.TRUE;
                return true;
            }
        }
    }

    public boolean aj() {
        com.mob.tools.utils.a aVar = this.f41158j;
        Boolean bool = aVar.f41449w;
        if (bool != null) {
            return bool.booleanValue();
        }
        aVar.f41449w = Boolean.valueOf((this.f41150a.getResources().getConfiguration().screenLayout & 15) >= 3);
        return this.f41158j.f41449w.booleanValue();
    }

    public boolean ak() {
        try {
            return Settings.Secure.getInt(this.f41150a.getContentResolver(), "adb_enabled", 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean al() {
        try {
            return Settings.Secure.getInt(this.f41150a.getContentResolver(), "development_settings_enabled", 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean am() {
        try {
            return ((Intent) ReflectHelper.invokeInstanceMethod(this.f41150a, o.a("016.dh9iIffdefgCdiGdhgdTiXdgEiIde@jiIdh"), new Object[]{null, new IntentFilter("android.intent.action.BATTERY_CHANGED")}, new Class[]{BroadcastReceiver.class, IntentFilter.class})).getIntExtra("plugged", -1) == 2;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return false;
        }
    }

    public boolean an() {
        return false;
    }

    public boolean ao() {
        Boolean bool = this.f41158j.f41450x;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z11 = true;
            PackageInfo a11 = g.a(this.f41150a).a().a(this.f41150a.getPackageName(), 1);
            com.mob.tools.utils.a aVar = this.f41158j;
            if ((a11.applicationInfo.flags & 2) == 0) {
                z11 = false;
            }
            aVar.f41450x = Boolean.valueOf(z11);
            return this.f41158j.f41450x.booleanValue();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            com.mob.tools.utils.a aVar2 = this.f41158j;
            Boolean bool2 = Boolean.FALSE;
            aVar2.f41450x = bool2;
            return bool2.booleanValue();
        }
    }

    public boolean ap() {
        int i11;
        try {
            String property = System.getProperty(o.a("014cddeXel$e>dhecdldihcecfgFd"));
            String property2 = System.getProperty(o.a("014cdde[elQeXdhecdldiggecdh8d"));
            if (property2 == null) {
                property2 = "-1";
            }
            try {
                i11 = Integer.parseInt(property2);
            } catch (Throwable unused) {
                i11 = -1;
            }
            return (TextUtils.isEmpty(property) || i11 == -1) ? false : true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public boolean aq() {
        Boolean bool = this.f41158j.f41451y;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z11 = false;
        boolean z12 = Build.VERSION.SDK_INT >= 29;
        boolean z13 = this.f41150a.getApplicationInfo().targetSdkVersion >= 29;
        com.mob.tools.utils.a aVar = this.f41158j;
        if (z12 && z13) {
            z11 = true;
        }
        aVar.f41451y = Boolean.valueOf(z11);
        return this.f41158j.f41451y.booleanValue();
    }

    public ArrayList<HashMap<String, String>> ar() {
        return null;
    }

    public String as() {
        if (!TextUtils.isEmpty(this.f41158j.f41452z)) {
            return this.f41158j.f41452z;
        }
        try {
            this.f41158j.f41452z = TimeZone.getDefault().getID();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (!TextUtils.isEmpty(this.f41158j.f41452z)) {
            return this.f41158j.f41452z;
        }
        Configuration configuration = new Configuration();
        configuration.setToDefaults();
        Settings.System.getConfiguration(this.f41150a.getContentResolver(), configuration);
        Locale locale = configuration.locale;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Calendar calendar = Calendar.getInstance(locale);
        if (calendar != null) {
            this.f41158j.f41452z = calendar.getTimeZone().getID();
        }
        return this.f41158j.f41452z;
    }

    public HashMap<String, Object> at() {
        HashMap<String, Object> hashMap = this.f41158j.A;
        if (hashMap != null && !hashMap.isEmpty()) {
            return this.f41158j.A;
        }
        this.f41158j.A = new HashMap<>();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        try {
            PackageManager packageManager = this.f41150a.getPackageManager();
            if (packageManager != null) {
                try {
                    hashMap2.put("mbmt", Boolean.valueOf(packageManager.hasSystemFeature(o.a("026Ddfdk6h_dhecde9h;el8cFdfdh,hKfddfdhViUel5diVedSiecGecdkdi"))));
                } catch (Throwable unused) {
                }
                try {
                    hashMap2.put("wmt", Boolean.valueOf(packageManager.hasSystemFeature(o.a("021Wdfdk?hTdhecdeVh4el?c_dfdh$hSfddfdhLiXelfddefhde"))));
                } catch (Throwable unused2) {
                }
                try {
                    hashMap2.put("gmt", Boolean.valueOf(packageManager.hasSystemFeature(o.a("0290dfdk;hDdhecdeHhXelRc]dfdhFhQfddfdhWi(eledecdgdf1dSdeecdkelff*eOfg"))));
                } catch (Throwable unused3) {
                }
                try {
                    hashMap2.put("nmt", Boolean.valueOf(packageManager.hasSystemFeature(o.a("0203dfdk,h1dhecdeWh*elEcCdfdhXh.fddfdh1iCeldkfhdg"))));
                } catch (Throwable unused4) {
                }
                hashMap2.put(o.a("003;ecSdKff"), Boolean.valueOf(packageManager.hasSystemFeature(o.a("025Kdfdk:h+dhecde5hKelAcHdfdh]hMfddfdh)iYeldcfgfcel:cHecfg,d"))));
            }
        } catch (Throwable unused5) {
        }
        this.f41158j.A.putAll(hashMap2);
        return hashMap2;
    }

    public HashMap<String, String> au() {
        HashMap<String, String> hashMap = new HashMap<>();
        String i11 = i(o.a("053g0fgdifg[ghij6dedgYi*fg7g8fgdifg=dilgYdg%eLdcSgMdgQe<dcfeGg_dgGe(dcfhdh>ikg]fgdgdfeddedkffdddgdcdhddfhdhJik"));
        if (!TextUtils.isEmpty(i11)) {
            hashMap.put(o.a("012UdgdcdhdhDiZdk d6gf<e'dchcfl"), i11);
        }
        String i12 = i(o.a("053gIfgdifgTghijZdedg%i-fg0g;fgdifgKdilg*dg;e,dc!gYdgFe1dcfe,gOdgUeFdcfhdh_ikg0dgYe4dcdedkfhecddSlEdedkddfhdh.ik"));
        if (!TextUtils.isEmpty(i12)) {
            hashMap.put(o.a("008lMdedkgfBe2dchcfl"), i12);
        }
        String i13 = i(o.a("053gQfgdifg'ghijUdedgKi+fgDgIfgdifg4dilgQdgVeFdc@g,dg%eIdcfeJgOdgTePdcfhdh@ikg:dg@e$dcdedkfhecddYl8dfdlddfhdh<ik"));
        if (!TextUtils.isEmpty(i13)) {
            hashMap.put(o.a("008lAdfdlgf(eXdchcfl"), i13);
        }
        return hashMap;
    }

    public String av() {
        if (!"-1".equals(this.f41158j.B)) {
            return this.f41158j.B;
        }
        try {
            com.mob.tools.utils.a aVar = this.f41158j;
            String str = Build.SUPPORTED_ABIS[0];
            aVar.B = str;
            return str;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public String aw() {
        String str;
        if (!"-1".equals(this.f41158j.C)) {
            return this.f41158j.C;
        }
        try {
            str = b(o.a("015$dhecelfcdcdeed8hWelfheddf1j:ecdh"));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            str = null;
        }
        this.f41158j.C = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r2 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap<java.lang.String, java.lang.Object> ax() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.ax():java.util.HashMap");
    }

    public String ay() {
        String str;
        if (!"-1".equals(this.f41158j.D)) {
            return this.f41158j.D;
        }
        try {
            str = b(o.a("020BfffgAl4elKji%dhfgdeecdkelfcdffgEiVfcdfdk.h"));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            str = null;
        }
        this.f41158j.D = str;
        return str;
    }

    public String az() {
        String str;
        if (!"-1".equals(this.f41158j.E)) {
            return this.f41158j.E;
        }
        try {
            str = b(o.a("0168dhecel-eSdhec'h6dcdgZd4elfcecdfdhNh"));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            str = null;
        }
        this.f41158j.E = str;
        return str;
    }

    public synchronized String b() {
        try {
        } finally {
            return null;
        }
        if (!"-1".equals(this.f41158j.f41432f)) {
            return this.f41158j.f41432f;
        }
        if (f(o.a("036'dfdk2h*dhecdeMh[el*eiDdh=l<defgfgdeecdkelejgfgfgcehehddgleghdegddeheiejeigc"))) {
            Object d11 = d("wifi");
            if (d11 == null) {
                this.f41158j.f41432f = null;
                return null;
            }
            Object invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(d11, o.a("017,ffEid_gfecdkdkRi(dgCdPdeecdkegdkfhec"), new Object[0]);
            if (invokeInstanceMethod != null) {
                String str = (String) ReflectHelper.invokeInstanceMethod(invokeInstanceMethod, o.a("0075ff!id4ehehegfi"), new Object[0]);
                this.f41158j.f41432f = str == null ? null : str.replace("\"", "");
                return this.f41158j.f41432f;
            }
        }
        return null;
    }

    public synchronized String c() {
        try {
        } finally {
            return null;
        }
        if (!"-1".equals(this.f41158j.f41431e)) {
            return this.f41158j.f41431e;
        }
        if (f(o.a("036LdfdkPh-dhecde%h_el,eiCdh-l$defgfgdeecdkelejgfgfgcehehddgleghdegddeheiejeigc"))) {
            Object d11 = d("wifi");
            if (d11 == null) {
                this.f41158j.f41431e = null;
                return null;
            }
            Object invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(d11, o.a("0179ff.idFgfecdkdk%i[dgAdPdeecdkegdkfhec"), new Object[0]);
            if (invokeInstanceMethod != null) {
                String str = (String) ReflectHelper.invokeInstanceMethod(invokeInstanceMethod, o.a("008*ffBidDfjehehegfi"), new Object[0]);
                com.mob.tools.utils.a aVar = this.f41158j;
                if (str == null) {
                    str = null;
                }
                aVar.f41431e = str;
                return str;
            }
        }
        return null;
    }

    public String d() {
        if (!"-1".equals(this.f41158j.Z)) {
            return this.f41158j.Z;
        }
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            str = str.trim();
        }
        this.f41158j.Z = str;
        return str;
    }

    public String e() {
        if (!"-1".equals(this.f41158j.f41433g)) {
            return this.f41158j.f41433g;
        }
        com.mob.tools.utils.a aVar = this.f41158j;
        String str = Build.MANUFACTURER;
        aVar.f41433g = str;
        return str;
    }

    public String f() {
        String h11 = h();
        return TextUtils.isEmpty(h11) ? j() : h11;
    }

    public String g(String str) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x006a, TryCatch #4 {all -> 0x006a, blocks: (B:31:0x0074, B:33:0x007c, B:35:0x0088, B:37:0x009a, B:39:0x00a0, B:50:0x00bd, B:52:0x00c8, B:53:0x00cf, B:58:0x00d2, B:60:0x00e0, B:62:0x00e6, B:67:0x00fd, B:73:0x010b, B:74:0x0112, B:81:0x005e), top: B:80:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2 A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #4 {all -> 0x006a, blocks: (B:31:0x0074, B:33:0x007c, B:35:0x0088, B:37:0x009a, B:39:0x00a0, B:50:0x00bd, B:52:0x00c8, B:53:0x00cf, B:58:0x00d2, B:60:0x00e0, B:62:0x00e6, B:67:0x00fd, B:73:0x010b, B:74:0x0112, B:81:0x005e), top: B:80:0x005e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String h() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.h():java.lang.String");
    }

    public synchronized String[] i() {
        ArrayList arrayList;
        Object d11;
        String str;
        if (!com.mob.commons.b.j()) {
            return null;
        }
        try {
            arrayList = new ArrayList();
            try {
                d11 = d("phone");
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
        } catch (Throwable th3) {
            MobLog.getInstance().w(th3);
        }
        if (d11 == null) {
            return null;
        }
        String h11 = h();
        if (TextUtils.isEmpty(h11)) {
            h11 = "-1";
        }
        arrayList.add(h11);
        ArrayList<String> arrayList2 = this.f41155g;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        } else if (f(o.a("035EdfdkOhOdhecde6h'el[eiWdhXlAdefgfgdeecdkelgdgcejfiddgghcfkefgcddeheiejeigc")) && Build.VERSION.SDK_INT < 29) {
            this.f41155g = new ArrayList<>();
            for (int i11 = 0; i11 <= 5; i11++) {
                try {
                    str = a(d11, i11);
                } catch (Throwable unused) {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "-1";
                }
                this.f41155g.add(str);
                arrayList.add(str);
            }
        }
        String[][] strArr = {new String[]{o.a("012_dhdeedelfffgVlEeldeNli,de")}, new String[]{o.a("017$dheceldhdeedel[lYdedcdeelde@li]defe"), o.a("017 dheceldhdeedel7lAdedcdeeldeRli<degk")}, new String[]{o.a("0155dheceldhdeedelec[ilGeldeZliOde")}, new String[]{o.a("0167dheceldhdeedelec1il5elde-liRdegk"), o.a("016,dheceldhdeedelecQilHeldeNli_degj")}};
        ArrayList<String> arrayList3 = this.f41156h;
        if (arrayList3 != null) {
            arrayList.addAll(arrayList3);
        } else {
            this.f41156h = new ArrayList<>();
            for (int i12 = 0; i12 < 4; i12++) {
                for (String str2 : strArr[i12]) {
                    for (String str3 : b(str2).split(",")) {
                        if (!TextUtils.isEmpty(str3) && !arrayList.contains(str3)) {
                            this.f41156h.add(str3);
                            arrayList.add(str3);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    public String j() {
        return null;
    }

    public String k() {
        try {
            String str = d() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + m() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + e() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + s() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + r();
            String B = B();
            if (B == null) {
                B = "";
            } else if (B.length() > 16) {
                B = B.substring(0, 16);
            }
            return a(str, B);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }

    public String l() {
        return d() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + m() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + e() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + s() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + r();
    }

    public int m() {
        com.mob.tools.utils.a aVar = this.f41158j;
        int i11 = aVar.f41434h;
        if (i11 > 0) {
            return i11;
        }
        int i12 = Build.VERSION.SDK_INT;
        aVar.f41434h = i12;
        return i12;
    }

    public String n() {
        try {
            if (!"-1".equals(this.f41158j.f41435i)) {
                return this.f41158j.f41435i;
            }
            com.mob.tools.utils.a aVar = this.f41158j;
            String str = Build.VERSION.RELEASE;
            aVar.f41435i = str;
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String o() {
        if (!"-1".equals(this.f41158j.f41436j)) {
            return this.f41158j.f41436j;
        }
        this.f41158j.f41436j = Locale.getDefault().getLanguage();
        return this.f41158j.f41436j;
    }

    public String p() {
        if (!"-1".equals(this.f41158j.f41437k)) {
            return this.f41158j.f41437k;
        }
        this.f41158j.f41437k = this.f41150a.getResources().getConfiguration().locale.getLanguage();
        return this.f41158j.f41437k;
    }

    public String q() {
        if (!"-1".equals(this.f41158j.f41438l)) {
            return this.f41158j.f41438l;
        }
        this.f41158j.f41438l = Locale.getDefault().getCountry();
        return this.f41158j.f41438l;
    }

    public String r() {
        int[] screenSize = ResHelper.getScreenSize(this.f41150a);
        if (this.f41150a.getResources().getConfiguration().orientation == 1) {
            return screenSize[0] + "x" + screenSize[1];
        }
        return screenSize[1] + "x" + screenSize[0];
    }

    public String s() {
        try {
            if (!"-2".equals(this.f41158j.f41439m)) {
                return this.f41158j.f41439m;
            }
            Object d11 = d("phone");
            if (d11 == null) {
                this.f41158j.f41439m = "-1";
                return "-1";
            }
            String str = (String) ReflectHelper.invokeInstanceMethod(d11, o.a("014(ff?id]ehdeWl)fkOeiXdhdf8d^ecdh"), new Object[0]);
            if (TextUtils.isEmpty(str)) {
                str = "-1";
            }
            this.f41158j.f41439m = str;
            return str;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            this.f41158j.f41439m = "-1";
            return "-1";
        }
    }

    public String t() {
        if (!"-1".equals(this.f41158j.f41440n)) {
            return this.f41158j.f41440n;
        }
        Object d11 = d("phone");
        if (d11 == null) {
            return this.f41158j.f41440n;
        }
        try {
            if (f(o.a("035Bdfdk,h5dhecde7h)el6ei8dh3lHdefgfgdeecdkelgdgcejfiddgghcfkefgcddeheiejeigc"))) {
                String str = (String) ReflectHelper.invokeInstanceMethod(d11, o.a("018Bff)id]ehde.l.fkMei)dhdfWdVecdhefdfEli"), new Object[0]);
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                this.f41158j.f41440n = str;
                return str;
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return null;
    }

    public String u() {
        return "-1";
    }

    public String v() {
        return null;
    }

    public String w() {
        if (!TextUtils.isEmpty(this.f41158j.f41441o)) {
            return this.f41158j.f41441o;
        }
        try {
            Signature[] signatureArr = g.a(this.f41150a).a().a(C(), 64).signatures;
            this.f41158j.f41441o = Data.MD5(signatureArr[0].toByteArray());
        } catch (Exception e11) {
            MobLog.getInstance().w(e11);
        }
        return this.f41158j.f41441o;
    }

    public String x() {
        return NtFetcher.getInstance(this.f41150a).getNtType();
    }

    public boolean y() {
        try {
            String A = A();
            if (o.a("004+fddefhde").equals(A) || o.a("0024heff").equals(A) || o.a("002Djiff").equals(A) || o.a("0029jcff").equals(A)) {
                return true;
            }
            return o.a("002=gjff").equals(A);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return false;
        }
    }

    public String z() {
        String lowerCase = x().toLowerCase();
        return (TextUtils.isEmpty(lowerCase) || o.a("004LdkecdkQi").equals(lowerCase)) ? o.a("004XdkecdkFi") : (lowerCase.startsWith(o.a("002Qheff")) || lowerCase.startsWith(o.a("002'jiff")) || lowerCase.startsWith(o.a("0024jcff")) || lowerCase.startsWith(o.a("002Ngjff"))) ? o.a("004_dgPiSeded") : lowerCase.startsWith(o.a("004Mfddefhde")) ? o.a("004Tfddefhde") : o.a("005WecPdci6dh");
    }

    public String g() {
        return this.f41158j.M;
    }

    public boolean j(String str) {
        try {
            String importClass = ReflectHelper.importClass(o.a("037Fdfdk1hTdhecdeOh?dleldgecdh.iCeldf[ee0elejWeeIfkDeVfgghdfdkdfffEiWdhgfecKleQdf$d"));
            return ((Integer) ReflectHelper.invokeStaticMethod(importClass, o.a("011*dkec.di$ggdhecdldifk.e"), this.f41150a, (String) ReflectHelper.invokeStaticMethod(importClass, o.a("014ei[dh6lSdefgfgdeecdkeiecfk2e"), str), C())).intValue() == 1;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return false;
        }
    }

    private void l(String str) throws Throwable {
        File cacheRootFile = ResHelper.getCacheRootFile(this.f41150a, o.a("0038el@hJdj"));
        if (cacheRootFile != null && cacheRootFile.exists()) {
            cacheRootFile.delete();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(cacheRootFile));
            try {
                objectOutputStream2.writeObject(str.toCharArray());
                objectOutputStream2.flush();
                r.a(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                r.a(objectOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean a() {
        Boolean bool = this.f41158j.f41426ac;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = Build.TAGS;
        this.f41158j.f41426ac = Boolean.valueOf((str != null && str.contains(o.a("009di1fg'd[hidjDiYdifg"))) || aM() || aP() || aO() || aN());
        return this.f41158j.f41426ac.booleanValue();
    }

    public String e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return g.a(this.f41150a).a().a(str, 1).applicationInfo.loadLabel(this.f41150a.getPackageManager()).toString();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public boolean f(String str) throws Throwable {
        int i11 = -1;
        try {
            ReflectHelper.importClass(o.a("023+dfdk(h-dhecdeGhLeldgecdk9di'dkUd+elgfecdkNdiIdl@d"));
            Integer num = (Integer) ReflectHelper.invokeInstanceMethod(this.f41150a, o.a("019WdgHciZdgdjeh i(edfhgg@iMdhHlMdefgfgdeecdk"), str);
            if (num != null) {
                i11 = num.intValue();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return i11 == 0;
    }

    public Object d(String str) {
        try {
            return this.f41150a.getSystemService(str);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    private String k(String str) {
        try {
            HashMap<String, Object> aS = aS();
            if (aS != null) {
                return (String) aS.get(str);
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static Object a(String str) throws Throwable {
        return ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(o.a("017IhfdfUjEdfeleddfdkffelgddcdk0dJde[li")), o.a("010^ffAidHgddcdkCdJde0li"), new Object[0]), o.a("004i.dl9iZdg"), new Object[]{str}, new Class[]{String.class});
    }

    public String a(String str, String str2) {
        String str3 = null;
        try {
            str3 = Base64.encodeToString(Data.AES128Encode(str2, str), 0);
            return str3.contains("\n") ? str3.replace("\n", "") : str3;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return str3;
        }
    }

    public String b(String str) {
        return g.a(this.f41150a).a().a(str);
    }

    public String c(String str) {
        try {
            return Data.MD5(g.a(this.f41150a).a().a(str, 64).signatures[0].toByteArray());
        } catch (Exception e11) {
            MobLog.getInstance().w(e11);
            return null;
        }
    }

    public void b(View view) {
        Object d11 = d("input_method");
        if (d11 == null) {
            return;
        }
        ((InputMethodManager) d11).toggleSoftInputFromWindow(view.getWindowToken(), 2, 0);
    }

    private synchronized String b(Object obj) {
        if (!"-1".equals(this.f41158j.Q)) {
            return this.f41158j.Q;
        }
        String str = null;
        try {
            str = g.a(this.f41150a).a().b();
            this.f41158j.Q = str;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return str;
    }

    public String a(boolean z11) {
        String str;
        if (!TextUtils.isEmpty(this.f41151b)) {
            return this.f41151b;
        }
        String str2 = null;
        try {
            str = aR();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            str = null;
        }
        if (!z11 && (TextUtils.isEmpty(str) || str.length() < 40)) {
            str = aQ();
        }
        if (!TextUtils.isEmpty(str) && str.length() >= 40) {
            String trim = str.trim();
            this.f41151b = trim;
            return trim;
        }
        try {
            str2 = aT();
        } catch (Throwable th3) {
            MobLog.getInstance().w(th3);
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= 40) {
            String trim2 = str2.trim();
            this.f41151b = trim2;
            return trim2;
        }
        if (TextUtils.isEmpty(str2) || str2.length() < 40) {
            str2 = a(40);
        }
        if (str2 == null) {
            return str2;
        }
        try {
            str2 = str2.trim();
            l(str2);
            return str2;
        } catch (Throwable th4) {
            MobLog.getInstance().w(th4);
            return str2;
        }
    }

    private int b(Context context) {
        try {
            String aK = aK();
            if (TextUtils.isEmpty(aK)) {
                return -1;
            }
            return aK.equals(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).processName) ? 1 : 0;
        } catch (Throwable th2) {
            MobLog.getInstance().d("MobPush checkIsInMainProcess: " + th2, new Object[0]);
            return -1;
        }
    }

    public String a(int i11) {
        long currentTimeMillis = System.currentTimeMillis() ^ SystemClock.elapsedRealtime();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(currentTimeMillis);
        SecureRandom secureRandom = new SecureRandom();
        for (int i12 = 0; i12 < i11; i12++) {
            if (o.a("0047dgTc9dfdh").equalsIgnoreCase(o.a(secureRandom.nextInt(2) % 2 == 0 ? "004Zdg:c-dfdh" : "003YdkdcQl"))) {
                stringBuffer.insert(i12 + 1, (char) (secureRandom.nextInt(26) + 97));
            } else {
                stringBuffer.insert(stringBuffer.length(), secureRandom.nextInt(10));
            }
        }
        return stringBuffer.toString().substring(0, 40);
    }

    public boolean h(String str) {
        return g.a(this.f41150a).a().a(str, 0) != null;
    }

    public String i(String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String trim = readLine.trim();
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(trim);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HashMap<String, Object> a(File file) {
        FileChannel fileChannel;
        FileInputStream fileInputStream;
        if (file.exists()) {
            FileChannel fileChannel2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
                fileChannel = null;
            }
            try {
                fileChannel2 = fileInputStream.getChannel();
                ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel2.size());
                while (fileChannel2.read(allocate) > 0) {
                }
                HashMap<String, Object> a11 = a(a(this.f41150a).d(), allocate.array());
                r.a(fileChannel2, fileInputStream);
                return a11;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = fileChannel2;
                fileChannel2 = fileInputStream;
                try {
                    MobLog.getInstance().d(th);
                    r.a(fileChannel, fileChannel2);
                    return new HashMap<>();
                } catch (Throwable th4) {
                    r.a(fileChannel, fileChannel2);
                    throw th4;
                }
            }
        }
        return new HashMap<>();
    }

    private HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return HashonHelper.fromJson(Data.AES128Decode(str, bArr));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return new HashMap<>();
        }
    }

    public ArrayList<HashMap<String, String>> a(boolean z11, boolean z12, boolean z13) {
        return new ArrayList<>();
    }

    public void a(View view) {
        Object d11 = d("input_method");
        if (d11 == null) {
            return;
        }
        ((InputMethodManager) d11).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public Location a(int i11, int i12, boolean z11) {
        try {
            if (!f(o.a("039Cdfdk?hXdhecdeIh=el-ei>dhBlWdefgfgdeecdkelejgfgfgcehehddhdegefgcddekfkgfejeiegfkef")) && (Build.VERSION.SDK_INT < 29 || !f(o.a("045Fdfdk%hXdhecdeEh_el)ei9dhQlVdefgfgdeecdkelejgfgfgcehehddfjejgfhjhkgdfkeeeffiddekfkgfejeiegfkef")))) {
                return null;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return com.mob.tools.utils.b.a().a(this.f41150a, i11, i12, z11);
            }
            throw new Throwable("Method 'getLocation' can not be called from Main Thread");
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public void a(final ReflectHelper.a<HashMap<String, Object>, Void> aVar) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            ReflectHelper.invokeInstanceMethod(this.f41150a, o.a("016MdhAi@ffdefgIdi2dhgd2i$dgYi2de jiYdh"), new Object[]{new BroadcastReceiver() { // from class: com.mob.tools.a.b.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    HashMap hashMap = new HashMap();
                    for (String str : intent.getExtras().keySet()) {
                        hashMap.put(str, intent.getExtras().get(str));
                    }
                    ReflectHelper.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(hashMap);
                    }
                    try {
                        ReflectHelper.invokeInstanceMethod(context, o.a("018%dcdkdh_iDffdefgKdiUdhgd[iDdg5iFde[jiBdh"), new Object[]{this}, new Class[]{BroadcastReceiver.class});
                    } catch (Throwable unused) {
                    }
                }
            }, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class});
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            if (aVar != null) {
                aVar.a(null);
            }
        }
    }

    private void a(String str, String str2, long[] jArr) {
        try {
            int indexOf = str.indexOf(str2);
            if (indexOf != -1) {
                Matcher matcher = Pattern.compile(" \\d+ ").matcher(str.substring(indexOf));
                int i11 = 0;
                while (matcher.find()) {
                    if (i11 == 0) {
                        jArr[0] = Long.parseLong(matcher.group().trim());
                    } else if (i11 == 8) {
                        jArr[1] = Long.parseLong(matcher.group().trim());
                        return;
                    }
                    i11++;
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    private synchronized String a(Object obj) {
        if (!"-1".equals(this.f41158j.P)) {
            return this.f41158j.P;
        }
        String str = null;
        try {
            str = g.a(this.f41150a).a().a();
            this.f41158j.P = str;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return str;
    }

    private String a(Object obj, int i11) {
        if (!"-1".equals(this.f41158j.U)) {
            return this.f41158j.U;
        }
        String str = null;
        try {
            str = g.a(this.f41150a).a().a(i11);
            this.f41158j.U = str;
            return str;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return str;
        }
    }
}
