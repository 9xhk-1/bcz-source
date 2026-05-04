package com.mob.tools.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.mob.commons.o;
import com.mob.tools.MobLog;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f41483a = {92, 80, 82, 17, 84, 74, 88, 80, 74, 17, 94, 81, 91, 77, 80, 86, 91, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 78, 78, 79, 86, 82, 19, 92, 80, 82, 17, 71, 86, 82, 94, 83, 94, 70, 94, 17, 75, 86, 81, 88, 17, 94, 81, 91, 77, 80, 86, 91, 19, 92, 80, 82, 17, 86, 89, 83, 70, 75, 90, 84, 17, 86, 81, 79, 74, 75, 82, 90, 75, 87, 80, 91, 19, 92, 80, 82, 17, 92, 83, 90, 94, 81, 82, 94, 76, 75, 90, 77, 17, 82, 88, 74, 94, 77, 91, 96, 92, 81, 19, 92, 80, 82, 17, 110, 74, 81, 94, 77, 19, 92, 80, 82, 17, 94, 74, 75, 80, 81, 94, 73, 86, 17, 82, 86, 81, 86, 82, 94, 79, 19, 92, 80, 82, 17, 91, 76, 86, 17, 94, 81, 75, 17, 76, 90, 77, 73, 90, 77, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 81, 90, 72, 76, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 82, 75, 84, 83, 80, 88, 88, 90, 77, 19, 92, 80, 82, 17, 76, 76, 17, 94, 81, 91, 77, 80, 86, 91, 17, 94, 77, 75, 86, 92, 83, 90, 17, 73, 86, 91, 90, 80, 19, 92, 80, 82, 17, 94, 92, 87, 86, 90, 73, 80, 17, 73, 86, 79, 76, 87, 80, 79, 19, 92, 81, 17, 72, 79, 76, 17, 82, 80, 89, 89, 86, 92, 90, 96, 90, 81, 88, 19, 92, 80, 82, 17, 87, 94, 79, 79, 70, 90, 83, 90, 82, 90, 81, 75, 76, 17, 126, 81, 91, 77, 80, 86, 91, 126, 81, 86, 82, 94, 83, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 94, 75, 92, 86, 17, 76, 90, 77, 73, 86, 92, 90, 19, 92, 80, 82, 17, 75, 82, 77, 86, 17, 94, 79, 79, 17, 82, 94, 86, 81, 19, 92, 80, 82, 17, 78, 86, 87, 80, 80, 17, 94, 79, 79, 76, 75, 80, 77, 90, 19, 92, 80, 82, 17, 106, 124, 114, 80, 93, 86, 83, 90, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 90, 81, 88, 86, 81, 90, 90, 77, 82, 80, 91, 90, 19, 92, 80, 82, 17, 78, 74, 94, 83, 92, 80, 82, 82, 17, 72, 89, 91, 17, 76, 90, 77, 73, 86, 92, 90};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f41484b = {92, 80, 82, 17, 114, 80, 93, 86, 83, 90, 107, 86, 92, 84, 90, 75, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 79, 77, 80, 73, 86, 91, 90, 77, 76, 17, 91, 77, 82, 19, 92, 80, 82, 17, 78, 75, 86, 17, 76, 90, 77, 73, 86, 92, 90, 17, 92, 80, 83, 80, 77, 76, 90, 77, 73, 86, 92, 90, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 94, 81, 91, 77, 80, 86, 91, 17, 78, 78, 91, 80, 72, 81, 83, 80, 94, 91, 90, 77, 19, 92, 80, 82, 17, 91, 86, 94, 81, 79, 86, 81, 88, 17, 73, 14, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 89, 72, 84, 17, 79, 83, 74, 88, 86, 81, 19, 92, 80, 82, 17, 88, 77, 90, 90, 81, 79, 80, 86, 81, 75, 17, 94, 81, 91, 77, 80, 86, 91, 17, 82, 92, 14, 15, 15, 7, 9, 17, 94, 92, 75, 86, 73, 86, 75, 70, 19, 92, 80, 82, 17, 78, 74, 94, 83, 92, 80, 82, 82, 17, 75, 86, 82, 90, 76, 90, 77, 73, 86, 92, 90, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 19, 92, 80, 82, 17, 78, 74, 94, 83, 92, 80, 82, 82, 17, 78, 92, 77, 86, 83, 82, 76, 88, 75, 74, 81, 81, 90, 83, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 82, 80, 93, 86, 83, 90, 78, 78, 19, 92, 80, 82, 17, 76, 76, 17, 94, 81, 91, 77, 80, 86, 91, 17, 74, 88, 92, 17, 94, 72, 90, 82, 90, 19, 92, 80, 82, 17, 92, 83, 90, 94, 81, 82, 94, 76, 75, 90, 77, 17, 76, 91, 84, 19, 92, 80, 82, 17, 71, 74, 81, 82, 90, 81, 88, 17, 79, 86, 81, 91, 74, 80, 91, 74, 80, 19, 92, 80, 82, 17, 72, 74, 93, 94, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 83, 93, 76, 17, 90, 82, 13, 17, 74, 86, 19, 92, 80, 82, 17, 76, 86, 81, 94, 17, 72, 90, 86, 93, 80, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 80, 82, 94, 92, 79, 19, 92, 80, 82, 17, 94, 82, 94, 79, 17, 94, 81, 91, 77, 80, 86, 91, 17, 83, 80, 92, 94, 75, 86, 80, 81, 19, 92, 81, 17, 84, 74, 72, 80, 17, 79, 83, 94, 70, 90, 77};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f41485c = {92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 82, 75, 75, 19, 92, 80, 82, 17, 78, 86, 70, 86, 17, 73, 86, 91, 90, 80, 19, 92, 80, 82, 17, 88, 80, 80, 88, 83, 90, 17, 94, 81, 91, 77, 80, 86, 91, 17, 72, 90, 93, 73, 86, 90, 72, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 84, 94, 77, 94, 80, 84, 90, 19, 92, 75, 77, 86, 79, 17, 94, 81, 91, 77, 80, 86, 91, 17, 73, 86, 90, 72, 19, 92, 80, 82, 17, 88, 80, 80, 88, 83, 90, 17, 94, 81, 91, 77, 80, 86, 91, 17, 88, 76, 89, 19, 92, 80, 82, 17, 93, 94, 86, 91, 74, 17, 81, 90, 75, 91, 86, 76, 84, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 94, 81, 91, 77, 80, 86, 91, 78, 78, 82, 94, 86, 83, 19, 92, 80, 82, 17, 94, 81, 91, 77, 80, 86, 91, 17, 83, 80, 92, 94, 75, 86, 80, 81, 17, 89, 74, 76, 90, 91, 19, 80, 77, 88, 17, 92, 80, 91, 90, 94, 74, 77, 80, 77, 94, 17, 93, 83, 74, 90, 75, 80, 80, 75, 87, 19, 92, 80, 82, 17, 82, 75, 17, 82, 75, 71, 71, 17, 82, 75, 71, 71, 19, 92, 80, 82, 17, 85, 86, 81, 88, 91, 80, 81, 88, 17, 94, 79, 79, 17, 82, 94, 83, 83, 19, 92, 80, 82, 17, 78, 74, 94, 83, 92, 80, 82, 82, 17, 86, 81, 75, 90, 77, 89, 94, 92, 90, 79, 90, 77, 82, 86, 76, 76, 86, 80, 81, 76, 19, 92, 80, 82, 17, 93, 94, 86, 91, 74, 17, 94, 79, 79, 76, 90, 94, 77, 92, 87, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 72, 86, 89, 86, 82, 94, 81, 94, 88, 90, 77, 19, 92, 80, 82, 17, 93, 94, 86, 91, 74, 17, 87, 94, 80, 84, 94, 81, 19, 92, 80, 82, 17, 73, 86, 73, 80, 17, 90, 94, 76, 70, 76, 87, 94, 77, 90, 19, 92, 80, 82, 17, 75, 94, 80, 93, 94, 80, 17, 75, 94, 80, 93, 94, 80, 19, 92, 80, 82, 17, 92, 80, 83, 80, 77, 80, 76, 17, 72, 90, 94, 75, 87, 90, 77, 19, 80, 77, 88, 17, 76, 86, 82, 94, 83, 83, 86, 94, 81, 92, 90, 17, 80, 79, 90, 81, 82, 80, 93, 86, 83, 90, 94, 79, 86, 17, 76, 90, 77, 73, 86, 92, 90};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f41486d = {92, 80, 82, 17, 78, 74, 94, 83, 92, 80, 82, 82, 17, 83, 80, 92, 94, 75, 86, 80, 81, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 93, 94, 75, 75, 90, 77, 70, 72, 94, 77, 81, 86, 81, 88, 19, 92, 80, 82, 17, 93, 94, 86, 91, 74, 17, 125, 94, 86, 91, 74, 114, 94, 79, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 78, 78, 82, 74, 76, 86, 92, 19, 92, 80, 82, 17, 76, 73, 80, 71, 17, 79, 86, 92, 80, 19, 92, 80, 82, 17, 93, 93, 84, 17, 86, 78, 80, 80, 17, 89, 90, 90, 91, 93, 94, 92, 84, 19, 92, 80, 82, 17, 70, 80, 74, 84, 74, 17, 79, 87, 80, 81, 90, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 78, 78, 79, 86, 82, 76, 90, 92, 74, 77, 90, 19, 92, 80, 82, 17, 93, 94, 86, 91, 74, 17, 76, 90, 94, 77, 92, 87, 93, 80, 71, 19, 92, 80, 82, 17, 76, 94, 81, 84, 74, 94, 86, 17, 82, 90, 86, 75, 74, 94, 81, 19, 92, 80, 82, 17, 78, 74, 94, 83, 92, 80, 82, 82, 17, 76, 87, 74, 75, 91, 80, 72, 81, 83, 86, 76, 75, 81, 90, 77, 19, 92, 80, 82, 17, 78, 86, 87, 80, 80, 12, 9, 15, 17, 82, 80, 93, 86, 83, 90, 76, 94, 89, 90, 19, 92, 80, 82, 17, 86, 89, 83, 70, 75, 90, 84, 17, 76, 79, 90, 90, 92, 87, 92, 83, 80, 74, 91, 19, 92, 80, 82, 17, 90, 88, 17, 94, 81, 91, 77, 80, 86, 91, 17, 126, 83, 86, 79, 94, 70, 120, 79, 87, 80, 81, 90, 19, 92, 80, 82, 17, 88, 80, 80, 88, 83, 90, 17, 94, 81, 91, 77, 80, 86, 91, 17, 76, 70, 81, 92, 94, 91, 94, 79, 75, 90, 77, 76, 17, 92, 80, 81, 75, 94, 92, 75, 76, 19, 92, 80, 82, 17, 88, 80, 80, 88, 83, 90, 17, 94, 81, 91, 77, 80, 86, 91, 17, 76, 70, 81, 92, 94, 91, 94, 79, 75, 90, 77, 76, 17, 92, 94, 83, 90, 81, 91, 94, 77, 19, 92, 80, 82, 17, 93, 94, 80, 89, 90, 81, 88, 17, 82, 85, 17, 73, 86, 91, 90, 80, 79, 83, 74, 88, 86, 81, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 82, 82, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 75, 87, 90, 77, 82, 94, 83, 82, 94, 81, 94, 88, 90, 77, 19, 92, 80, 82, 17, 76, 91, 74, 17, 91, 86, 91, 86, 17, 79, 76, 81, 88, 90, 77};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f41487e = {92, 80, 82, 17, 76, 75, 80, 77, 82, 17, 76, 75, 80, 77, 82, 88, 94, 82, 90, 19, 92, 80, 82, 17, 76, 76, 17, 94, 81, 91, 77, 80, 86, 91, 17, 74, 88, 92, 17, 83, 86, 73, 90, 19, 80, 77, 88, 17, 92, 80, 91, 90, 94, 74, 77, 80, 77, 94, 17, 86, 82, 76, 19, 92, 80, 82, 17, 75, 82, 94, 83, 83, 17, 72, 86, 77, 90, 83, 90, 76, 76, 19, 92, 80, 82, 17, 93, 89, 88, 94, 82, 90, 17, 94, 79, 79, 19, 92, 80, 82, 17, 78, 74, 86, 92, 86, 81, 92, 17, 92, 81, 90, 17, 124, 113, 122, 108, 90, 77, 73, 86, 92, 90, 19, 92, 80, 82, 17, 93, 94, 86, 91, 74, 17, 82, 94, 79, 17, 83, 80, 92, 94, 75, 86, 80, 81, 19, 92, 80, 82, 17, 76, 76, 17, 94, 81, 91, 77, 80, 86, 91, 17, 94, 77, 75, 86, 92, 83, 90, 17, 83, 86, 75, 90, 19, 92, 80, 82, 17, 76, 81, 91, 94, 17, 72, 86, 89, 86, 83, 80, 92, 94, 75, 86, 81, 88, 19, 92, 80, 82, 17, 76, 80, 87, 74, 17, 86, 81, 79, 74, 75, 82, 90, 75, 87, 80, 91, 17, 76, 80, 88, 80, 74, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 75, 82, 88, 79, 17, 76, 88, 94, 82, 90, 19, 92, 80, 82, 17, 78, 74, 94, 83, 92, 80, 82, 82, 17, 78, 92, 80, 82, 96, 78, 82, 86, 19, 92, 80, 82, 17, 82, 90, 91, 86, 94, 75, 90, 84, 17, 70, 88, 79, 76, 19, 92, 80, 82, 17, 75, 90, 81, 92, 90, 81, 75, 17, 78, 78, 83, 86, 73, 90, 19, 92, 80, 82, 17, 76, 76, 17, 94, 81, 91, 77, 80, 86, 91, 17, 94, 77, 75, 86, 92, 83, 90, 17, 81, 90, 72, 76, 19, 92, 80, 82, 17, 92, 87, 86, 81, 94, 82, 72, 80, 77, 83, 91, 17, 82, 94, 86, 81, 19, 92, 80, 82, 17, 88, 80, 80, 88, 83, 90, 17, 94, 81, 91, 77, 80, 86, 91, 17, 88, 76, 89, 17, 83, 80, 88, 86, 81, 19, 92, 80, 82, 17, 82, 90, 86, 75, 74, 17, 82, 90, 86, 70, 94, 81, 92, 94, 82, 90, 77, 94, 19, 92, 80, 82, 17, 76, 82, 86, 83, 90, 17, 88, 86, 89, 82, 94, 84, 90, 77};

    public int a(Context context) {
        try {
            String baseband = DeviceHelper.getInstance(context).getBaseband();
            if (TextUtils.isEmpty(baseband)) {
                return 1;
            }
            return baseband.contains(o.a("007Mgkelfeelfeelfe")) ? 1 : 0;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0;
        }
    }

    public int b(Context context) {
        try {
            String boardFromSysProperty = DeviceHelper.getInstance(context).getBoardFromSysProperty();
            if (TextUtils.isEmpty(boardFromSysProperty) || boardFromSysProperty.indexOf(o.a("007Wdfdk*h6dhecdeTh")) > -1) {
                return 1;
            }
            return boardFromSysProperty.indexOf(o.a("008:ffeced0h>fhdefgVc")) > -1 ? 1 : 0;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0;
        }
    }

    public int c(Context context) {
        try {
            String boardPlatform = DeviceHelper.getInstance(context).getBoardPlatform();
            if (TextUtils.isEmpty(boardPlatform) || boardPlatform.indexOf(o.a("007YdfdkLh5dhecde7h")) > -1) {
                return 1;
            }
            return boardPlatform.indexOf(o.a("010Dfg,h9djddffNec:ecdk8i")) > -1 ? 1 : 0;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0;
        }
    }

    public int d(Context context) {
        try {
            return DeviceHelper.getInstance(context).getFlavor().indexOf(o.a("004jMfcecdl")) > -1 ? 1 : 0;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0;
        }
    }

    public int e(Context context) {
        try {
            if (DeviceHelper.getInstance(context).checkPermission(o.a("035]dfdk4hKdhecdeShVelBeiOdhMlWdefgfgdeecdkelgdgcejfiddgghcfkefgcddeheiejeigc")) && Build.VERSION.SDK_INT < 29) {
                String imei = DeviceHelper.getInstance(context).getIMEI();
                if (TextUtils.isEmpty(imei)) {
                    return 0;
                }
                if (imei.contains("*")) {
                    return 1;
                }
                return a(imei) == imei.length() ? 1 : 0;
            }
            return -1;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0;
        }
    }

    public int f(Context context) {
        int i11;
        PackageInfo packageInfo;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a(f41483a));
            arrayList.addAll(a(f41484b));
            arrayList.addAll(a(f41485c));
            arrayList.addAll(a(f41486d));
            arrayList.addAll(a(f41487e));
            Iterator it = arrayList.iterator();
            i11 = 0;
            while (it.hasNext()) {
                try {
                    try {
                        packageInfo = DeviceHelper.getInstance(context).getPackageInfo((String) it.next(), 0);
                    } catch (Throwable unused) {
                        packageInfo = null;
                    }
                    if (packageInfo != null && (packageInfo.applicationInfo.flags & 1) == 0) {
                        i11++;
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            i11 = 0;
        }
        return i11 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a() {
        /*
            r6 = this;
            java.lang.String r0 = "007hi'fg^d]dhecdi"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "021 dgdf-d<icIge@dhecdg7gBfg;iMedfh6g@dgffdhecdcWe"
            java.lang.String r3 = com.mob.commons.o.a(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = com.mob.tools.utils.DeviceHelper.invokeRuntimeExec(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "014(ff?id egdkPe=dc:dTeh7dTdhLi6df7l"
            java.lang.String r3 = com.mob.commons.o.a(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L34
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L34
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L34
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            r3 = 1
            goto L37
        L34:
            r3 = move-exception
            goto L44
        L36:
            r3 = r1
        L37:
            if (r2 == 0) goto L42
            java.lang.String r0 = com.mob.commons.o.a(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L42
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r2, r0, r1)     // Catch: java.lang.Throwable -> L42
        L42:
            r1 = r3
            goto L56
        L44:
            com.mob.tools.log.NLog r4 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L57
            r4.d(r3)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L56
            java.lang.String r0 = com.mob.commons.o.a(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L56
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r2, r0, r3)     // Catch: java.lang.Throwable -> L56
        L56:
            return r1
        L57:
            r3 = move-exception
            if (r2 == 0) goto L63
            java.lang.String r0 = com.mob.commons.o.a(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L63
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethod(r2, r0, r1)     // Catch: java.lang.Throwable -> L63
        L63:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.f.a():int");
    }

    public int b() {
        String c11 = c();
        return (c11.indexOf(o.a("0051dedk'diMed")) > -1 || c11.indexOf(o.a("003Adf-lh")) > -1) ? 1 : 0;
    }

    private String c() {
        Object obj = null;
        try {
            try {
                obj = DeviceHelper.invokeRuntimeExec(o.a("017Idgdf<d9ic8ge$dhecdgXg[dg1eDdcdedkfhec"));
                InputStream inputStream = (InputStream) ReflectHelper.invokeInstanceMethod(obj, o.a("014>ffTidSegdkTeUdcYd eh[d;dh>i8df1l"), new Object[0]);
                if (inputStream == null) {
                    if (obj != null) {
                        ReflectHelper.invokeInstanceMethod(obj, o.a("007hi8fg$d2dhecdi"), new Object[0]);
                        return "";
                    }
                    return "";
                }
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                bufferedReader.close();
                String lowerCase = stringBuffer.toString().toLowerCase();
                if (obj != null) {
                    try {
                        ReflectHelper.invokeInstanceMethod(obj, o.a("007hi8fg$d2dhecdi"), new Object[0]);
                    } catch (Throwable unused) {
                    }
                }
                return lowerCase;
            } catch (Throwable unused2) {
                return "";
            }
        } catch (Throwable th2) {
            try {
                MobLog.getInstance().d(th2);
                if (obj != null) {
                    ReflectHelper.invokeInstanceMethod(obj, o.a("007hi8fg$d2dhecdi"), new Object[0]);
                    return "";
                }
                return "";
            } catch (Throwable th3) {
                if (obj != null) {
                    try {
                        ReflectHelper.invokeInstanceMethod(obj, o.a("007hi8fg$d2dhecdi"), new Object[0]);
                    } catch (Throwable unused3) {
                    }
                }
                throw th3;
            }
        }
    }

    private String b(int[] iArr) {
        int length = iArr.length;
        char[] cArr = new char[length];
        int min = Math.min(length, 63);
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = (char) (iArr[i11] ^ min);
        }
        return String.valueOf(cArr);
    }

    private int a(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '0') {
                i11++;
            }
        }
        return i11;
    }

    private List<String> a(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : b(iArr).split(",")) {
                arrayList.add(str);
            }
            return arrayList;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return arrayList;
        }
    }
}
