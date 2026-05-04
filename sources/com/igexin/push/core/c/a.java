package com.igexin.push.core.c;

import android.app.AppOpsManager;
import android.content.ContentValues;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.assist.util.AssistUtils;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.config.d;
import com.igexin.push.core.b;
import com.igexin.push.core.b.w;
import com.igexin.push.core.d;
import com.igexin.push.core.e;
import com.igexin.push.core.e.f;
import com.igexin.push.core.e.f.AnonymousClass12;
import com.igexin.push.g.c;
import com.igexin.push.g.k;
import com.igexin.push.g.n;
import com.tencent.connect.common.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import pn.j;

/* loaded from: classes7.dex */
public final class a implements com.igexin.push.core.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37937a = "BIDataManager";

    /* renamed from: b, reason: collision with root package name */
    private static a f37938b;

    /* renamed from: com.igexin.push.core.c.a$2, reason: invalid class name */
    public class AnonymousClass2 implements Comparator<w> {
        public AnonymousClass2() {
        }

        private static int a(w wVar, w wVar2) {
            if (wVar.f37925c.equals(wVar2.f37925c)) {
                return 0;
            }
            return wVar.f37925c.compareTo(wVar2.f37925c);
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(w wVar, w wVar2) {
            w wVar3 = wVar;
            w wVar4 = wVar2;
            if (wVar3.f37925c.equals(wVar4.f37925c)) {
                return 0;
            }
            return wVar3.f37925c.compareTo(wVar4.f37925c);
        }
    }

    private static int a(ApplicationInfo applicationInfo, AppOpsManager appOpsManager, PackageManager packageManager) {
        try {
            if (applicationInfo.packageName.equals(e.f38030g)) {
                return c.b(e.f38035l) ? 1 : 0;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 31 || !d.f37577ai) {
                return -1;
            }
            if (i11 >= 33 && applicationInfo.targetSdkVersion >= 33) {
                try {
                    return packageManager.checkPermission("android.permission.POST_NOTIFICATIONS", applicationInfo.packageName) == 0 ? 1 : 0;
                } catch (Throwable unused) {
                    String[] strArr = k.a(applicationInfo.packageName, 4096).requestedPermissions;
                    if (strArr == null || !new HashSet(Arrays.asList(strArr)).contains("android.permission.POST_NOTIFICATIONS")) {
                        return 0;
                    }
                }
            }
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, num, Integer.valueOf(applicationInfo.uid), applicationInfo.packageName)).intValue() == 0 ? 1 : 0;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return -1;
        }
    }

    public static void b() {
        String str;
        if (!c.e()) {
            str = " upload type144 network false";
        } else if (d.V) {
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - e.f38023ay) - (d.W * 1000) >= 0) {
                try {
                    String[] b11 = com.igexin.assist.sdk.a.a().b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(e.A);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(e.f37998a);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(e.C);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(d.T ? n.q() : "");
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(n.d());
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(AssistUtils.getDeviceBrand().toLowerCase());
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(b11[0]);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(b11[1]);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(n.n());
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(n.o());
                    f.a().e(currentTimeMillis);
                    com.igexin.c.a.c.a.b("UploadBITask", "upload type144 data = " + sb2.toString());
                    com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.a.a(new com.igexin.push.core.h.e(SDKUrlConfig.getBiUploadServiceUrl(), sb2.toString().getBytes(), 144)), false, true);
                    return;
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                    return;
                }
            }
            str = "type144 in Interval = " + d.W;
        } else {
            str = " isUpload type144 Enable false";
        }
        com.igexin.c.a.c.a.b(f37937a, str);
    }

    public static List<com.igexin.push.core.b.c> c() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = d.a.f37956a.f37950i.a(b.f37709af, new String[]{"type"}, new String[]{Constants.VIA_REPORT_TYPE_SHARE_TO_QQ}, null, "");
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    arrayList.add(new com.igexin.push.core.b.c(cursor.getInt(0), cursor.getString(1), cursor.getInt(2), cursor.getLong(3)));
                }
            }
            if (cursor != null) {
                return arrayList;
            }
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
                if (cursor != null) {
                    cursor.close();
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return arrayList;
    }

    private static void d() {
        Cursor cursor = null;
        try {
            Cursor a11 = d.a.f37956a.f37950i.a(b.f37709af, null, null, new String[]{"COUNT(*)"}, null);
            if (a11 == null) {
                if (a11 != null) {
                    a11.close();
                    return;
                }
                return;
            }
            a11.moveToNext();
            long j11 = a11.getLong(0);
            a11.close();
            long j12 = j11 - 200;
            if (j12 > 0) {
                d.a.f37956a.f37950i.a(b.f37709af, "id IN(SELECT id FROM bidata ORDER BY time ASC LIMIT " + j12 + j.f81007d);
                com.igexin.c.a.c.a.b(f37937a, "delete bidata " + j12 + " old expired data");
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    private static long a(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", (Integer) 10);
        contentValues.put("data", str);
        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
        return d.a.f37956a.f37950i.a(b.f37709af, contentValues);
    }

    @Override // com.igexin.push.core.e.a
    public final void b(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.igexin.push.core.e.a
    public final void c(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            Cursor a11 = d.a.f37956a.f37950i.a(b.f37709af, null, null, new String[]{"COUNT(*)"}, null);
            if (a11 == null) {
                if (a11 != null) {
                    a11.close();
                    return;
                }
                return;
            }
            a11.moveToNext();
            long j11 = a11.getLong(0);
            a11.close();
            long j12 = j11 - 200;
            if (j12 > 0) {
                d.a.f37956a.f37950i.a(b.f37709af, "id IN(SELECT id FROM bidata ORDER BY time ASC LIMIT " + j12 + j.f81007d);
                com.igexin.c.a.c.a.b(f37937a, "delete bidata " + j12 + " old expired data");
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                com.igexin.c.a.c.a.a(th2);
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    public static a a() {
        if (f37938b == null) {
            f37938b = new a();
        }
        return f37938b;
    }

    private static void b(ArrayList<String> arrayList) {
        d.a.f37956a.f37950i.a(b.f37709af, new String[]{"rowid"}, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.igexin.push.core.e.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ void a(a aVar, List list) {
        AnonymousClass2 anonymousClass2 = aVar.new AnonymousClass2();
        AppOpsManager appOpsManager = (AppOpsManager) e.f38035l.getSystemService("appops");
        PackageManager packageManager = e.f38035l.getPackageManager();
        List<PackageInfo> a11 = n.a();
        for (int i11 = 0; i11 < a11.size(); i11++) {
            try {
                PackageInfo packageInfo = a11.get(i11);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if ((applicationInfo.flags & 1) <= 0) {
                    w wVar = new w();
                    wVar.f37923a = applicationInfo.loadLabel(packageManager).toString();
                    wVar.f37925c = applicationInfo.packageName;
                    wVar.f37924b = String.valueOf(packageInfo.versionCode);
                    wVar.f37926d = packageInfo.versionName;
                    wVar.f37927e = a(applicationInfo, appOpsManager, packageManager);
                    list.add(wVar);
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
        Collections.sort(list, anonymousClass2);
    }

    public static void a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !"null".equals(str) && com.igexin.push.config.d.R.booleanValue()) {
                if ((System.currentTimeMillis() - e.f38021aw) - (com.igexin.push.config.d.S * 1000) < 0) {
                    com.igexin.c.a.c.a.b(f37937a, "type253 in Interval = " + com.igexin.push.config.d.S);
                    return;
                }
                Boolean bool = com.igexin.push.config.d.R;
                long j11 = com.igexin.push.config.d.S;
                com.igexin.c.a.c.a.a(f37937a, "start up id type253Enable = " + com.igexin.push.config.d.R + " ，type253Interval = " + com.igexin.push.config.d.S);
                String m11 = n.m();
                String h11 = n.h();
                String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(format);
                sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb2.append(e.C);
                sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb2.append(e.f37998a);
                sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb2.append(str);
                sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                if (h11 == null || "null".equals(h11)) {
                    h11 = "";
                }
                sb2.append(h11);
                sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                if (m11 == null || "null".equals(m11)) {
                    m11 = "";
                }
                sb2.append(m11);
                sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb2.append(str2);
                String sb3 = sb2.toString();
                SDKUrlConfig.getBiUploadServiceUrl();
                com.igexin.c.a.c.a.a("BIDataManager| upload253 = ".concat(String.valueOf(sb3)), new Object[0]);
                byte[] bytes = sb3.getBytes();
                f.a().d(System.currentTimeMillis());
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.a.a(new com.igexin.push.core.h.e(SDKUrlConfig.getBiUploadServiceUrl(), bytes, 253)), false, true);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    private static void a(ArrayList<String> arrayList) {
        d.a.f37956a.f37950i.a(b.f37709af, new String[]{"id"}, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    private void a(List<w> list) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        AppOpsManager appOpsManager = (AppOpsManager) e.f38035l.getSystemService("appops");
        PackageManager packageManager = e.f38035l.getPackageManager();
        List<PackageInfo> a11 = n.a();
        for (int i11 = 0; i11 < a11.size(); i11++) {
            try {
                PackageInfo packageInfo = a11.get(i11);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if ((applicationInfo.flags & 1) <= 0) {
                    w wVar = new w();
                    wVar.f37923a = applicationInfo.loadLabel(packageManager).toString();
                    wVar.f37925c = applicationInfo.packageName;
                    wVar.f37924b = String.valueOf(packageInfo.versionCode);
                    wVar.f37926d = packageInfo.versionName;
                    wVar.f37927e = a(applicationInfo, appOpsManager, packageManager);
                    list.add(wVar);
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
        Collections.sort(list, anonymousClass2);
    }

    public final void a(boolean z11) {
        long currentTimeMillis = System.currentTimeMillis() - e.R;
        if (!z11 || currentTimeMillis - 86400000 >= 0) {
            StringBuilder sb2 = new StringBuilder(f37937a);
            sb2.append(z11 ? ", over 24h, start upload AL" : "data change start upload AL");
            com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.d() { // from class: com.igexin.push.core.c.a.1
                @Override // com.igexin.push.f.d
                public final void b() {
                    try {
                        f a11 = f.a();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (currentTimeMillis2 != e.R) {
                            e.R = currentTimeMillis2;
                            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.new AnonymousClass12(), false, true);
                        }
                        ArrayList arrayList = new ArrayList();
                        a.a(a.this, arrayList);
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("action", "reportapplist");
                            jSONObject.put("session_last", e.f38049z);
                            JSONArray jSONArray = new JSONArray();
                            int size = arrayList.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("appid", ((w) arrayList.get(i11)).f37925c);
                                jSONObject2.put("name", ((w) arrayList.get(i11)).f37923a);
                                jSONObject2.put("version", ((w) arrayList.get(i11)).f37924b);
                                jSONObject2.put("versionName", ((w) arrayList.get(i11)).f37926d);
                                jSONObject2.put("notificationEnabled", ((w) arrayList.get(i11)).f37927e);
                                jSONArray.put(jSONObject2);
                            }
                            jSONObject.put("applist", jSONArray);
                        } catch (Exception e11) {
                            com.igexin.c.a.c.a.a(e11);
                        }
                        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.a.a(new com.igexin.push.core.h.a(SDKUrlConfig.getBiUploadServiceUrl(), jSONObject.toString().getBytes())), false, true);
                        com.igexin.c.a.c.a.a("reportAL", new Object[0]);
                        if (com.igexin.push.config.d.f37579ak) {
                            com.igexin.c.a.c.a.a("reportAL = " + jSONObject.toString(), new Object[0]);
                        }
                    } catch (Throwable th2) {
                        com.igexin.c.a.c.a.a(th2);
                    }
                }
            }, false, true);
        }
    }
}
