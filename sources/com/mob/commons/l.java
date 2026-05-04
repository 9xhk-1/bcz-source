package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.ResHelper;
import java.io.File;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f40355a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f40356b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f40357c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f40358d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f40359e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f40360f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f40361g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f40362h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f40363i;

    static {
        String a11 = com.mob.commons.a.l.a("011%ehfdMmmh.fefdehekgh*h");
        f40363i = a11;
        f40355a = a11 + ".mrlock";
        f40356b = a11 + com.mob.commons.a.l.a("007Efm4idLfefdehek");
        f40357c = a11 + com.mob.commons.a.l.a("011;fmggfefdgdegfeflfdehek");
        f40358d = a11 + com.mob.commons.a.l.a("008BfmIiXejeefefdehek");
        f40359e = a11 + com.mob.commons.a.l.a("008Wfm-iMgheefefdehek");
        f40360f = a11 + ".cl_lock";
        f40361g = new Object();
        f40362h = new Object();
    }

    public static synchronized File a(String str) {
        File dataCacheFile;
        synchronized (l.class) {
            dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), str);
        }
        return dataCacheFile;
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = f40357c;
            if (str.endsWith(str2)) {
                return str2;
            }
            String str3 = f40356b;
            if (str.endsWith(str3)) {
                return str3;
            }
            String str4 = f40358d;
            if (str.endsWith(str4)) {
                return str4;
            }
            String str5 = f40359e;
            if (str.endsWith(str5)) {
                return str5;
            }
            String str6 = f40360f;
            if (str.endsWith(str6)) {
                return str6;
            }
        }
        return str;
    }

    public static boolean a(File file, k kVar) {
        return a(file, true, kVar);
    }

    public static boolean a(File file, boolean z11, k kVar) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            String absolutePath = file.getAbsolutePath();
            synchronized (b(absolutePath)) {
                try {
                    FileLocker fileLocker = new FileLocker();
                    fileLocker.setLockFile(absolutePath);
                    if (!fileLocker.lock(z11)) {
                        return false;
                    }
                    try {
                        if (!kVar.a(fileLocker)) {
                            fileLocker.release();
                        }
                    } catch (Throwable unused) {
                        fileLocker.release();
                    }
                    return true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return true;
        }
    }
}
