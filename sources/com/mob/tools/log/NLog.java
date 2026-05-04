package com.mob.tools.log;

import android.os.Process;
import android.util.Log;
import com.mob.commons.m;
import com.mob.commons.o;
import com.mob.tools.b;
import com.mob.tools.proguard.ClassKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import pn.j;

/* loaded from: classes7.dex */
public class NLog implements ClassKeeper, PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, NLog> f41304a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, String> f41305b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private String f41306c;

    /* renamed from: d, reason: collision with root package name */
    private int f41307d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41308e;

    static {
        b.a();
    }

    public NLog() {
        this.f41308e = false;
        this.f41306c = null;
        this.f41307d = -1;
    }

    private String a(Throwable th2) {
        try {
            return Log.getStackTraceString(th2);
        } catch (Throwable th3) {
            return th3 instanceof OutOfMemoryError ? o.a("023:ff'id@eh@dCdfdgdjeidhdfdg^i;eh+d4dhdedkfficecec>l") : th3.getMessage();
        }
    }

    public static NLog getInstance(String str, int i11, String str2) {
        NLog nLog;
        HashMap<String, NLog> hashMap = f41304a;
        synchronized (hashMap) {
            try {
                nLog = hashMap.get(str);
                if (nLog == null) {
                    nLog = new NLog(str, i11);
                    f41305b.put(str, str2);
                    hashMap.put(str, nLog);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nLog;
    }

    public static NLog getInstanceForSDK(String str, boolean z11) {
        return getInstance(str);
    }

    public final void crash(Throwable th2) {
        a(6, 1, a(th2));
    }

    public final int d(Throwable th2) {
        return log(3, th2);
    }

    public final void dg() {
        this.f41308e = true;
    }

    public final int e(Throwable th2) {
        return log(6, th2);
    }

    public final void error(Throwable th2) {
        error(a(th2));
    }

    public final int i(Throwable th2) {
        return log(4, th2);
    }

    public final int log(int i11, Throwable th2) {
        return a(i11, 0, a(th2));
    }

    public NLog setCollector(LogCollector logCollector) {
        return this;
    }

    public final int v(Throwable th2) {
        return log(2, th2);
    }

    public final int w(Throwable th2) {
        return log(5, th2);
    }

    public static void setCollector(String str, LogCollector logCollector) {
        getInstance(str).setCollector(logCollector);
    }

    public final int d(Object obj, Object... objArr) {
        return log(3, obj, objArr);
    }

    public final int e(Throwable th2, Object obj, Object... objArr) {
        return log(6, th2, obj, objArr);
    }

    public final void error(String str) {
        a(6, 2, str);
    }

    public final int i(Throwable th2, Object obj, Object... objArr) {
        return log(4, th2, obj, objArr);
    }

    public final int log(int i11, Object obj, Object... objArr) {
        String obj2 = obj.toString();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        return a(i11, 0, obj2);
    }

    public final int v(Object obj, Object... objArr) {
        return log(2, obj, objArr);
    }

    public final int w(Object obj, Object... objArr) {
        return log(5, obj, objArr);
    }

    public final int d(Throwable th2, Object obj, Object... objArr) {
        return log(3, th2, obj, objArr);
    }

    public final int e(Object obj, Object... objArr) {
        return log(6, obj, objArr);
    }

    public final int i(Object obj, Object... objArr) {
        return log(4, obj, objArr);
    }

    public final int v(Throwable th2, Object obj, Object... objArr) {
        return log(2, th2, obj, objArr);
    }

    public final int w(Throwable th2, Object obj, Object... objArr) {
        return log(5, th2, obj, objArr);
    }

    public final int e(String str) {
        return log(6, str, new Object[0]);
    }

    public final int i(String str) {
        return log(4, str, new Object[0]);
    }

    public final int w(String str) {
        return log(5, str, new Object[0]);
    }

    private NLog(String str, int i11) {
        this.f41308e = false;
        this.f41306c = str;
        this.f41307d = i11;
    }

    private int a(int i11, int i12, String str) {
        String str2;
        NLog nLog;
        try {
            str2 = Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myTid() + j.f81006c + Thread.currentThread().getName() + ") " + str;
        } catch (Throwable unused) {
            str2 = str;
        }
        try {
            if (i12 == 1) {
                String str3 = this.f41306c;
                int i13 = this.f41307d;
                HashMap<String, String> hashMap = f41305b;
                if (!hashMap.isEmpty()) {
                    Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            nLog = null;
                            break;
                        }
                        Map.Entry<String, String> next = it.next();
                        if (next.getValue() != null && str.contains(next.getValue())) {
                            nLog = f41304a.get(next.getKey());
                            break;
                        }
                    }
                    if (nLog != null) {
                        str3 = nLog.f41306c;
                        i13 = nLog.f41307d;
                    }
                }
                m.a().a(1, str3, i13, str2);
            } else if (i12 == 2) {
                m.a().a(2, this.f41306c, this.f41307d, str2);
            }
            m.a().a(i11, str);
            return 0;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    public final int log(int i11, Throwable th2, Object obj, Object... objArr) {
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        sb2.append(obj2);
        sb2.append('\n');
        sb2.append(a(th2));
        return a(i11, 0, sb2.toString());
    }

    @Deprecated
    public static NLog getInstance(String str) {
        NLog nLog;
        HashMap<String, NLog> hashMap = f41304a;
        synchronized (hashMap) {
            try {
                nLog = hashMap.get(str);
                if (nLog == null) {
                    nLog = new NLog(str, -1);
                    f41305b.put(str, null);
                    hashMap.put(str, nLog);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nLog;
    }
}
