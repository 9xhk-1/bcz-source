package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.ag;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    public static int f42329a;

    /* renamed from: h, reason: collision with root package name */
    private static final Map<Integer, Pair<String, String>> f42330h = new HashMap<Integer, Pair<String, String>>() { // from class: com.tencent.bugly.proguard.as.1
        {
            put(3, new Pair("203", "103"));
            put(7, new Pair("208", "108"));
            put(0, new Pair(BasicPushStatus.SUCCESS_CODE, "100"));
            put(1, new Pair("201", "101"));
            put(2, new Pair("202", "102"));
            put(4, new Pair("204", "104"));
            put(6, new Pair("206", "106"));
            put(5, new Pair("207", "107"));
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final ArrayList<a> f42331i = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.as.2
        {
            byte b11 = 0;
            add(new b(b11));
            add(new c(b11));
            add(new d(b11));
            add(new e(b11));
            add(new h(b11));
            add(new i(b11));
            add(new f(b11));
            add(new g(b11));
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Integer, Integer> f42332j = new HashMap<Integer, Integer>() { // from class: com.tencent.bugly.proguard.as.3
        {
            put(3, 4);
            put(7, 7);
            put(2, 1);
            put(0, 0);
            put(1, 2);
            put(4, 3);
            put(5, 5);
            put(6, 6);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Map<Integer, String> f42333k = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.4
        {
            put(3, "BuglyAnrCrash");
            put(0, "BuglyJavaCrash");
            put(1, "BuglyNativeCrash");
        }
    };

    /* renamed from: l, reason: collision with root package name */
    private static final Map<Integer, String> f42334l = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.as.5
        {
            put(3, "BuglyAnrCrashReport");
            put(0, "BuglyJavaCrashReport");
            put(1, "BuglyNativeCrashReport");
        }
    };

    /* renamed from: b, reason: collision with root package name */
    protected final Context f42335b;

    /* renamed from: c, reason: collision with root package name */
    protected final ai f42336c;

    /* renamed from: d, reason: collision with root package name */
    protected final w f42337d;

    /* renamed from: e, reason: collision with root package name */
    protected final ac f42338e;

    /* renamed from: f, reason: collision with root package name */
    protected aw f42339f;

    /* renamed from: g, reason: collision with root package name */
    protected BuglyStrategy.a f42340g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        final int f42345a;

        public /* synthetic */ a(int i11, byte b11) {
            this(i11);
        }

        public abstract boolean a();

        private a(int i11) {
            this.f42345a = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends a {
        public /* synthetic */ b(byte b11) {
            this();
        }

        @Override // com.tencent.bugly.proguard.as.a
        public final boolean a() {
            return at.a().k();
        }

        private b() {
            super(3, (byte) 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends a {
        public /* synthetic */ c(byte b11) {
            this();
        }

        @Override // com.tencent.bugly.proguard.as.a
        public final boolean a() {
            return true;
        }

        private c() {
            super(7, (byte) 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends a {
        public /* synthetic */ d(byte b11) {
            this();
        }

        @Override // com.tencent.bugly.proguard.as.a
        public final boolean a() {
            return true;
        }

        private d() {
            super(2, (byte) 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends a {
        public /* synthetic */ e(byte b11) {
            this();
        }

        @Override // com.tencent.bugly.proguard.as.a
        public final boolean a() {
            return at.a().j();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private e() {
            /*
                r1 = this;
                r0 = 0
                r1.<init>(r0, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.as.e.<init>():void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends a {
        public /* synthetic */ f(byte b11) {
            this();
        }

        @Override // com.tencent.bugly.proguard.as.a
        public final boolean a() {
            return (at.a().B & 2) > 0;
        }

        private f() {
            super(5, (byte) 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends a {
        public /* synthetic */ g(byte b11) {
            this();
        }

        @Override // com.tencent.bugly.proguard.as.a
        public final boolean a() {
            return (at.a().B & 1) > 0;
        }

        private g() {
            super(6, (byte) 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h extends a {
        public /* synthetic */ h(byte b11) {
            this();
        }

        @Override // com.tencent.bugly.proguard.as.a
        public final boolean a() {
            return at.a().j();
        }

        private h() {
            super(1, (byte) 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends a {
        public /* synthetic */ i(byte b11) {
            this();
        }

        @Override // com.tencent.bugly.proguard.as.a
        public final boolean a() {
            return (at.a().B & 4) > 0;
        }

        private i() {
            super(4, (byte) 0);
        }
    }

    public as(Context context, ai aiVar, w wVar, ac acVar, BuglyStrategy.a aVar) {
        f42329a = 1004;
        this.f42335b = context;
        this.f42336c = aiVar;
        this.f42337d = wVar;
        this.f42338e = acVar;
        this.f42340g = aVar;
        this.f42339f = null;
    }

    private static List<ar> a(List<ar> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (ar arVar : list) {
            if (arVar.f42326d && arVar.f42324b <= currentTimeMillis - 86400000) {
                arrayList.add(arVar);
            }
        }
        return arrayList;
    }

    private static void b(CrashDetailBean crashDetailBean, List<ar> list) {
        StringBuilder sb2 = new StringBuilder(64);
        for (ar arVar : list) {
            if (!arVar.f42327e && !arVar.f42326d) {
                String str = crashDetailBean.f42121s;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(arVar.f42324b);
                if (!str.contains(sb3.toString())) {
                    crashDetailBean.f42122t++;
                    sb2.append(arVar.f42324b);
                    sb2.append("\n");
                }
            }
        }
        crashDetailBean.f42121s += sb2.toString();
    }

    private static ContentValues c(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j11 = crashDetailBean.f42102a;
            if (j11 > 0) {
                contentValues.put("_id", Long.valueOf(j11));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f42120r));
            contentValues.put("_s1", crashDetailBean.f42123u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f42106d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f42112j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f42114l));
            contentValues.put("_dt", ap.a(crashDetailBean));
            return contentValues;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    private static void d(List<ar> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        Iterator<ar> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().f42323a);
            sb2.append(",");
        }
        StringBuilder sb3 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
        sb3.append(pn.j.f81007d);
        String sb4 = sb3.toString();
        sb3.setLength(0);
        try {
            al.c("deleted %s data %d", "t_cr", Integer.valueOf(w.a().a("t_cr", sb4)));
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    private static void e(List<CrashDetailBean> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            for (CrashDetailBean crashDetailBean : list) {
                sb2.append(" or _id = ");
                sb2.append(crashDetailBean.f42102a);
            }
            String sb3 = sb2.toString();
            if (sb3.length() > 0) {
                sb3 = sb3.substring(4);
            }
            sb2.setLength(0);
            al.c("deleted %s data %d", "t_cr", Integer.valueOf(w.a().a("t_cr", sb3)));
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    private static void b(List<ar> list) {
        ag agVar;
        List<CrashDetailBean> c11 = c(list);
        if (c11 == null || c11.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CrashDetailBean crashDetailBean : c11) {
            String str = f42334l.get(Integer.valueOf(crashDetailBean.f42104b));
            if (!TextUtils.isEmpty(str)) {
                al.c("find expired data,crashId:%s eventType:%s", crashDetailBean.f42105c, str);
                arrayList.add(new ag.c(crashDetailBean.f42105c, str, crashDetailBean.f42120r, false, 0L, "expired", null));
            }
        }
        agVar = ag.a.f42230a;
        agVar.a(arrayList);
    }

    private static CrashDetailBean a(List<ar> list, CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2;
        List<CrashDetailBean> c11;
        if (list.isEmpty()) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (ar arVar : list) {
            if (arVar.f42327e) {
                arrayList.add(arVar);
            }
        }
        if (arrayList.isEmpty() || (c11 = c(arrayList)) == null || c11.isEmpty()) {
            crashDetailBean2 = null;
        } else {
            Collections.sort(c11);
            crashDetailBean2 = c11.get(0);
            a(crashDetailBean2, c11);
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f42112j = true;
            crashDetailBean.f42122t = 0;
            crashDetailBean.f42121s = "";
            crashDetailBean2 = crashDetailBean;
        }
        b(crashDetailBean2, list);
        if (crashDetailBean2.f42120r != crashDetailBean.f42120r) {
            String str = crashDetailBean2.f42121s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.f42120r);
            if (!str.contains(sb2.toString())) {
                crashDetailBean2.f42122t++;
                crashDetailBean2.f42121s += crashDetailBean.f42120r + "\n";
            }
        }
        return crashDetailBean2;
    }

    private static List<CrashDetailBean> c(List<ar> list) {
        Cursor cursor;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        Iterator<ar> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().f42323a);
            sb2.append(",");
        }
        if (sb2.toString().contains(",")) {
            sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
        }
        sb2.append(pn.j.f81007d);
        String sb3 = sb2.toString();
        sb2.setLength(0);
        try {
            cursor = w.a().a("t_cr", (String[]) null, sb3);
            if (cursor == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sb2.append("_id in (");
                int i11 = 0;
                while (cursor.moveToNext()) {
                    CrashDetailBean a11 = a(cursor);
                    if (a11 != null) {
                        arrayList.add(a11);
                    } else {
                        try {
                            sb2.append(cursor.getLong(cursor.getColumnIndex("_id")));
                            sb2.append(",");
                            i11++;
                        } catch (Throwable unused) {
                            al.d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb2.toString().contains(",")) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
                }
                sb2.append(pn.j.f81007d);
                String sb4 = sb2.toString();
                if (i11 > 0) {
                    al.d("deleted %s illegal data %d", "t_cr", Integer.valueOf(w.a().a("t_cr", sb4)));
                }
                cursor.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    private static String e(CrashDetailBean crashDetailBean) {
        try {
            Pair<String, String> pair = f42330h.get(Integer.valueOf(crashDetailBean.f42104b));
            if (pair == null) {
                al.e("crash type error! %d", Integer.valueOf(crashDetailBean.f42104b));
                return "";
            }
            if (crashDetailBean.f42112j) {
                return (String) pair.first;
            }
            return (String) pair.second;
        } catch (Exception e11) {
            al.a(e11);
            return "";
        }
    }

    private boolean d(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            al.c("save eup logs", new Object[0]);
            aa b11 = aa.b();
            String str = "#--------\npackage:" + b11.e() + "\nversion:" + b11.f42198o + "\nsdk:" + b11.f42191h + "\nprocess:" + crashDetailBean.A + "\ndate:" + ap.a(new Date(crashDetailBean.f42120r)) + "\ntype:" + crashDetailBean.f42116n + "\nmessage:" + crashDetailBean.f42117o + "\nstack:\n" + crashDetailBean.f42119q + "\neupID:" + crashDetailBean.f42105c + "\n";
            if (at.f42357m == null) {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Tencent/" + this.f42335b.getPackageName();
                } else {
                    absolutePath = null;
                }
            } else {
                File file = new File(at.f42357m);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            }
            am.a(absolutePath + "/euplog.txt", str, at.f42358n);
            return true;
        } catch (Throwable th2) {
            al.d("rqdp{  save error} %s", th2.toString());
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
    }

    public final void b(CrashDetailBean crashDetailBean, boolean z11) {
        if (at.f42359o) {
            al.a("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            a(arrayList, 3000L, z11, crashDetailBean.f42104b == 7, z11);
            return;
        }
        al.a("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    public final void b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues c11 = c(crashDetailBean);
        if (c11 != null) {
            long a11 = w.a().a("t_cr", c11, (v) null);
            if (a11 >= 0) {
                al.c("insert %s success!", "t_cr");
                crashDetailBean.f42102a = a11;
            }
        }
        if (at.f42356l) {
            d(crashDetailBean);
        }
    }

    private static void a(CrashDetailBean crashDetailBean, List<CrashDetailBean> list) {
        String[] split;
        StringBuilder sb2 = new StringBuilder(128);
        for (int i11 = 1; i11 < list.size(); i11++) {
            String str = list.get(i11).f42121s;
            if (str != null && (split = str.split("\n")) != null) {
                for (String str2 : split) {
                    if (!crashDetailBean.f42121s.contains(str2)) {
                        crashDetailBean.f42122t++;
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                }
            }
        }
        crashDetailBean.f42121s += sb2.toString();
    }

    private static ar b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            ar arVar = new ar();
            arVar.f42323a = cursor.getLong(cursor.getColumnIndex("_id"));
            arVar.f42324b = cursor.getLong(cursor.getColumnIndex("_tm"));
            arVar.f42325c = cursor.getString(cursor.getColumnIndex("_s1"));
            arVar.f42326d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            arVar.f42327e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            arVar.f42328f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return arVar;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.tencent.bugly.crashreport.crash.CrashDetailBean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.as.a(com.tencent.bugly.crashreport.crash.CrashDetailBean, boolean):boolean");
    }

    private static List<ar> b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor a11 = w.a().a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, (String) null);
            if (a11 == null) {
                if (a11 != null) {
                    a11.close();
                }
                return null;
            }
            try {
                if (a11.getCount() <= 0) {
                    a11.close();
                    return arrayList;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("_id in (");
                int i11 = 0;
                while (a11.moveToNext()) {
                    ar b11 = b(a11);
                    if (b11 != null) {
                        arrayList.add(b11);
                    } else {
                        try {
                            sb2.append(a11.getLong(a11.getColumnIndex("_id")));
                            sb2.append(",");
                            i11++;
                        } catch (Throwable unused) {
                            al.d("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sb2.toString().contains(",")) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.lastIndexOf(",")));
                }
                sb2.append(pn.j.f81007d);
                String sb3 = sb2.toString();
                sb2.setLength(0);
                if (i11 > 0) {
                    al.d("deleted %s illegal data %d", "t_cr", Integer.valueOf(w.a().a("t_cr", sb3)));
                }
                a11.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursor = a11;
                try {
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    return arrayList;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void c(ArrayList<bn> arrayList, String str) {
        if (ap.b(str)) {
            return;
        }
        try {
            bn bnVar = new bn((byte) 1, "crashInfos.txt", str.getBytes("utf-8"));
            al.c("attach crash infos", new Object[0]);
            arrayList.add(bnVar);
        } catch (Exception e11) {
            e11.printStackTrace();
            al.a(e11);
        }
    }

    private static void b(ArrayList<bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new bn((byte) 1, "jniLog.txt", str.getBytes("utf-8")));
            } catch (Exception e11) {
                e11.printStackTrace();
                al.a(e11);
            }
        }
    }

    private static void b(ArrayList<bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        String str;
        if (crashDetailBean.f42104b == 1 && (str = crashDetailBean.f42124v) != null) {
            try {
                bn a11 = a("tomb.zip", context, str);
                if (a11 != null) {
                    al.c("attach tombs", new Object[0]);
                    arrayList.add(a11);
                }
            } catch (Exception e11) {
                al.a(e11);
            }
        }
    }

    private static void b(ArrayList<bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            arrayList.add(new bn((byte) 1, "userExtraByteData", bArr));
            al.c("attach extraData", new Object[0]);
        } catch (Exception e11) {
            al.a(e11);
        }
    }

    private boolean b(CrashDetailBean crashDetailBean, List<ar> list, List<ar> list2) {
        boolean z11;
        int i11 = crashDetailBean.f42104b;
        boolean z12 = i11 == 0 || i11 == 1;
        boolean z13 = i11 == 3;
        if (p.f42621c) {
            z11 = false;
        } else {
            z11 = (z13 || z12) ? at.f42349e : true;
        }
        if (!z11) {
            return false;
        }
        ArrayList<ar> arrayList = new ArrayList(10);
        if (!a(crashDetailBean, list, arrayList)) {
            try {
                if (arrayList.size() >= at.f42348d) {
                }
            } catch (Exception e11) {
                al.a(e11);
                al.d("Failed to merge crash.", new Object[0]);
            }
            return false;
        }
        al.a("same crash occur too much do merged!", new Object[0]);
        CrashDetailBean a11 = a((List<ar>) arrayList, crashDetailBean);
        for (ar arVar : arrayList) {
            if (arVar.f42323a != a11.f42102a) {
                list2.add(arVar);
            }
        }
        b(a11);
        d(list2);
        al.b("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
        return true;
    }

    private static boolean a(String str) {
        String str2 = at.f42362r;
        if (str2 != null && !str2.isEmpty()) {
            try {
                al.c("Crash regular filter for crash stack is: %s", at.f42362r);
                if (Pattern.compile(at.f42362r).matcher(str).find()) {
                    al.d("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                    return true;
                }
            } catch (Exception e11) {
                al.a(e11);
                al.d("Failed to compile " + at.f42362r, new Object[0]);
            }
        }
        return false;
    }

    private static boolean a(CrashDetailBean crashDetailBean, List<ar> list, List<ar> list2) {
        boolean z11 = false;
        for (ar arVar : list) {
            if (crashDetailBean.f42123u.equals(arVar.f42325c)) {
                if (arVar.f42327e) {
                    z11 = true;
                }
                list2.add(arVar);
            }
        }
        return z11;
    }

    public static List<CrashDetailBean> a() {
        StrategyBean c11 = ac.a().c();
        if (c11 == null) {
            al.d("have not synced remote!", new Object[0]);
            return null;
        }
        if (!c11.f42084f) {
            al.d("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            al.b("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long b11 = ap.b();
        List<ar> b12 = b();
        al.c("Size of crash list loaded from DB: %s", Integer.valueOf(b12.size()));
        if (b12.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(a(b12));
        b12.removeAll(arrayList);
        Iterator<ar> it = b12.iterator();
        while (it.hasNext()) {
            ar next = it.next();
            long j11 = next.f42324b;
            if (j11 < b11 - at.f42354j) {
                arrayList2.add(next);
                it.remove();
                arrayList.add(next);
            } else if (next.f42326d) {
                if (j11 >= currentTimeMillis - 86400000) {
                    it.remove();
                } else if (!next.f42327e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f42328f >= 3 && j11 < currentTimeMillis - 86400000) {
                it.remove();
                arrayList.add(next);
            }
        }
        b(arrayList2);
        if (arrayList.size() > 0) {
            d(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        List<CrashDetailBean> c12 = c(b12);
        if (c12 != null && c12.size() > 0) {
            String str = aa.b().f42198o;
            Iterator<CrashDetailBean> it2 = c12.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f42108f)) {
                    it2.remove();
                    arrayList3.add(next2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            e(arrayList3);
        }
        return c12;
    }

    public final void a(CrashDetailBean crashDetailBean) {
        int i11 = crashDetailBean.f42104b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3 && !at.a().k()) {
                    return;
                }
            } else if (!at.a().j()) {
                return;
            }
        } else if (!at.a().j()) {
            return;
        }
        if (this.f42339f != null) {
            al.c("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
        }
    }

    public final void a(final List<CrashDetailBean> list, long j11, final boolean z11, boolean z12, boolean z13) {
        if (!aa.a(this.f42335b).f42189f) {
            al.d("warn: not upload process", new Object[0]);
            return;
        }
        ai aiVar = this.f42336c;
        if (aiVar == null) {
            al.d("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z13 && !aiVar.b(at.f42346a)) {
            al.d("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean c11 = this.f42338e.c();
        if (!c11.f42084f) {
            al.d("remote report is disable!", new Object[0]);
            al.b("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            try {
                String str = c11.f42096r;
                String str2 = StrategyBean.f42080b;
                bp a11 = a(this.f42335b, list, aa.b());
                if (a11 == null) {
                    al.d("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] a12 = ae.a((m) a11);
                if (a12 == null) {
                    al.d("send encode fail!", new Object[0]);
                    return;
                }
                bq a13 = ae.a(this.f42335b, 830, a12);
                if (a13 == null) {
                    al.d("request package is null.", new Object[0]);
                    return;
                }
                final long currentTimeMillis = System.currentTimeMillis();
                ah ahVar = new ah() { // from class: com.tencent.bugly.proguard.as.6
                    @Override // com.tencent.bugly.proguard.ah
                    public final void a(boolean z14, String str3) {
                        as.a(list, z14, System.currentTimeMillis() - currentTimeMillis, z11 ? "realtime" : "cache", str3);
                        as.a(z14, (List<CrashDetailBean>) list);
                    }
                };
                if (z11) {
                    this.f42336c.a(f42329a, a13, str, str2, ahVar, j11, z12);
                    return;
                } else {
                    this.f42336c.a(f42329a, a13, str, str2, ahVar, false);
                    return;
                }
            } catch (Throwable th2) {
                al.e("req cr error %s", th2.toString());
                if (al.b(th2)) {
                    return;
                }
                th2.printStackTrace();
                return;
            }
        }
        al.d("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    public static void a(boolean z11, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            al.c("up finish update state %b", Boolean.valueOf(z11));
            for (CrashDetailBean crashDetailBean : list) {
                al.c("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f42105c, Integer.valueOf(crashDetailBean.f42114l), Boolean.valueOf(crashDetailBean.f42106d), Boolean.valueOf(crashDetailBean.f42112j));
                int i11 = crashDetailBean.f42114l + 1;
                crashDetailBean.f42114l = i11;
                crashDetailBean.f42106d = z11;
                al.c("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f42105c, Integer.valueOf(i11), Boolean.valueOf(crashDetailBean.f42106d), Boolean.valueOf(crashDetailBean.f42112j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                at.a().a(it.next());
            }
            al.c("update state size %d", Integer.valueOf(list.size()));
        }
        if (z11) {
            return;
        }
        al.b("[crash] upload fail.", new Object[0]);
    }

    private static CrashDetailBean a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j11 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) ap.a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f42102a = j11;
            return crashDetailBean;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    private static bo a(Context context, CrashDetailBean crashDetailBean, aa aaVar) {
        ArrayList<bl> arrayList = null;
        if (context != null && crashDetailBean != null && aaVar != null) {
            bo boVar = new bo();
            boVar.f42489a = e(crashDetailBean);
            boVar.f42490b = crashDetailBean.f42120r;
            boVar.f42491c = crashDetailBean.f42116n;
            boVar.f42492d = crashDetailBean.f42117o;
            boVar.f42493e = crashDetailBean.f42118p;
            boVar.f42495g = crashDetailBean.f42119q;
            boVar.f42496h = crashDetailBean.f42128z;
            boVar.f42497i = crashDetailBean.f42105c;
            boVar.f42498j = null;
            boVar.f42500l = crashDetailBean.f42115m;
            boVar.f42501m = crashDetailBean.f42107e;
            boVar.f42494f = crashDetailBean.B;
            boVar.f42502n = null;
            Map<String, PlugInBean> map = crashDetailBean.f42110h;
            if (map != null && !map.isEmpty()) {
                arrayList = new ArrayList<>(crashDetailBean.f42110h.size());
                for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f42110h.entrySet()) {
                    bl blVar = new bl();
                    blVar.f42472a = entry.getValue().f42076a;
                    blVar.f42474c = entry.getValue().f42078c;
                    blVar.f42476e = entry.getValue().f42077b;
                    arrayList.add(blVar);
                }
            }
            boVar.f42504p = arrayList;
            al.c("libInfo %s", boVar.f42503o);
            ArrayList<bn> arrayList2 = new ArrayList<>(20);
            a(arrayList2, crashDetailBean);
            a(arrayList2, crashDetailBean.f42125w);
            b(arrayList2, crashDetailBean.f42126x);
            c(arrayList2, crashDetailBean.Z);
            a(arrayList2, crashDetailBean.f42103aa, context);
            a(arrayList2, crashDetailBean.f42127y);
            a(arrayList2, crashDetailBean, context);
            b(arrayList2, crashDetailBean, context);
            a(arrayList2, aaVar.L);
            b(arrayList2, crashDetailBean.Y);
            boVar.f42505q = arrayList2;
            if (crashDetailBean.f42112j) {
                boVar.f42499k = crashDetailBean.f42122t;
            }
            boVar.f42506r = a(crashDetailBean, aaVar);
            boVar.f42507s = new HashMap();
            Map<String, String> map2 = crashDetailBean.S;
            if (map2 != null && map2.size() > 0) {
                boVar.f42507s.putAll(crashDetailBean.S);
                al.a("setted message size %d", Integer.valueOf(boVar.f42507s.size()));
            }
            Map<String, String> map3 = boVar.f42507s;
            al.c("pss:" + crashDetailBean.I + " vss:" + crashDetailBean.J + " javaHeap:" + crashDetailBean.K, new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.I);
            map3.put("SDK_UPLOAD_U1", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.J);
            map3.put("SDK_UPLOAD_U2", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(crashDetailBean.K);
            map3.put("SDK_UPLOAD_U3", sb4.toString());
            al.c("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f42116n, crashDetailBean.f42105c, aaVar.d(), Long.valueOf((crashDetailBean.f42120r - crashDetailBean.Q) / 1000), Boolean.valueOf(crashDetailBean.f42113k), Boolean.valueOf(crashDetailBean.R), Boolean.valueOf(crashDetailBean.f42112j), Boolean.valueOf(crashDetailBean.f42104b == 1), Integer.valueOf(crashDetailBean.f42122t), crashDetailBean.f42121s, Boolean.valueOf(crashDetailBean.f42106d), Integer.valueOf(boVar.f42506r.size()));
            return boVar;
        }
        al.d("enExp args == null", new Object[0]);
        return null;
    }

    private static bp a(Context context, List<CrashDetailBean> list, aa aaVar) {
        if (context != null && list != null && list.size() != 0 && aaVar != null) {
            bp bpVar = new bp();
            bpVar.f42511a = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                bpVar.f42511a.add(a(context, it.next(), aaVar));
            }
            return bpVar;
        }
        al.d("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    private static bn a(String str, Context context, String str2) {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            al.c("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!ap.a(file, file2)) {
                al.d("zip fail!", new Object[0]);
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fileInputStream = new FileInputStream(file2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    byteArrayOutputStream.flush();
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                al.c("read bytes :%d", Integer.valueOf(byteArray.length));
                bn bnVar = new bn((byte) 2, file2.getName(), byteArray);
                try {
                    fileInputStream.close();
                } catch (IOException e11) {
                    if (!al.a(e11)) {
                        e11.printStackTrace();
                    }
                }
                if (file2.exists()) {
                    al.c("del tmp", new Object[0]);
                    file2.delete();
                }
                return bnVar;
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            if (!al.a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        al.c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return null;
                } catch (Throwable th4) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e13) {
                            if (!al.a(e13)) {
                                e13.printStackTrace();
                            }
                        }
                    }
                    if (file2.exists()) {
                        al.c("del tmp", new Object[0]);
                        file2.delete();
                    }
                    throw th4;
                }
            }
        }
        al.d("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
        return null;
    }

    public static void a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        aa b11 = aa.b();
        if (b11 == null) {
            return;
        }
        al.e("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        al.e("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        al.e("# PKG NAME: %s", b11.f42186c);
        al.e("# APP VER: %s", b11.f42198o);
        al.e("# SDK VER: %s", b11.f42191h);
        al.e("# LAUNCH TIME: %s", ap.a(new Date(aa.b().f42160a)));
        al.e("# CRASH TYPE: %s", str);
        al.e("# CRASH TIME: %s", str2);
        al.e("# CRASH PROCESS: %s", str3);
        al.e("# CRASH FOREGROUND: %s", Boolean.valueOf(b11.a()));
        al.e("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            al.e("# REPORT ID: %s", crashDetailBean.f42105c);
            al.e("# CRASH DEVICE: %s %s", b11.h(), b11.r().booleanValue() ? "ROOTED" : "UNROOT");
            al.e("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.C), Long.valueOf(crashDetailBean.D), Long.valueOf(crashDetailBean.E));
            al.e("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.F), Long.valueOf(crashDetailBean.G), Long.valueOf(crashDetailBean.H));
            if (!ap.b(crashDetailBean.O)) {
                al.e("# EXCEPTION FIRED BY %s %s", crashDetailBean.O, crashDetailBean.N);
            } else if (crashDetailBean.f42104b == 3) {
                if (crashDetailBean.T == null) {
                    str6 = "null";
                } else {
                    str6 = crashDetailBean.T.get("BUGLY_CR_01");
                }
                al.e("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!ap.b(str5)) {
            al.e("# CRASH STACK: ", new Object[0]);
            al.e(str5, new Object[0]);
        }
        al.e("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }

    private static void a(CrashDetailBean crashDetailBean, Map<String, String> map) {
        String value;
        if (map != null && !map.isEmpty()) {
            crashDetailBean.S = new LinkedHashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!ap.b(entry.getKey())) {
                    String key = entry.getKey();
                    if (key.length() > 100) {
                        key = key.substring(0, 100);
                        al.d("setted key length is over limit %d substring to %s", 100, key);
                    }
                    if (!ap.b(entry.getValue()) && entry.getValue().length() > 100000) {
                        value = entry.getValue().substring(entry.getValue().length() - 100000);
                        al.d("setted %s value length is over limit %d substring", key, 100000);
                    } else {
                        value = entry.getValue();
                    }
                    crashDetailBean.S.put(key, value);
                    al.a("add setted key %s value size:%d", key, Integer.valueOf(value.length()));
                }
            }
            return;
        }
        al.d("extra map is empty. CrashBean won't have userDatas.", new Object[0]);
    }

    private static void a(ArrayList<bn> arrayList, CrashDetailBean crashDetailBean) {
        String str;
        if (crashDetailBean.f42112j && (str = crashDetailBean.f42121s) != null && str.length() > 0) {
            try {
                arrayList.add(new bn((byte) 1, "alltimes.txt", crashDetailBean.f42121s.getBytes("utf-8")));
            } catch (Exception e11) {
                e11.printStackTrace();
                al.a(e11);
            }
        }
    }

    private static void a(ArrayList<bn> arrayList, String str) {
        if (str != null) {
            try {
                arrayList.add(new bn((byte) 1, "log.txt", str.getBytes("utf-8")));
            } catch (Exception e11) {
                e11.printStackTrace();
                al.a(e11);
            }
        }
    }

    private static void a(ArrayList<bn> arrayList, String str, Context context) {
        if (str != null) {
            try {
                bn a11 = a("backupRecord.zip", context, str);
                if (a11 != null) {
                    al.c("attach backup record", new Object[0]);
                    arrayList.add(a11);
                }
            } catch (Exception e11) {
                al.a(e11);
            }
        }
    }

    private static void a(ArrayList<bn> arrayList, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            bn bnVar = new bn((byte) 2, "buglylog.zip", bArr);
            al.c("attach user log", new Object[0]);
            arrayList.add(bnVar);
        } catch (Exception e11) {
            al.a(e11);
        }
    }

    private static void a(ArrayList<bn> arrayList, CrashDetailBean crashDetailBean, Context context) {
        bn a11;
        if (crashDetailBean.f42104b != 3) {
            return;
        }
        al.c("crashBean.anrMessages:%s", crashDetailBean.T);
        try {
            Map<String, String> map = crashDetailBean.T;
            if (map != null && map.containsKey("BUGLY_CR_01")) {
                if (!TextUtils.isEmpty(crashDetailBean.T.get("BUGLY_CR_01"))) {
                    arrayList.add(new bn((byte) 1, "anrMessage.txt", crashDetailBean.T.get("BUGLY_CR_01").getBytes("utf-8")));
                    al.c("attach anr message", new Object[0]);
                }
                crashDetailBean.T.remove("BUGLY_CR_01");
            }
            String str = crashDetailBean.f42124v;
            if (str == null || (a11 = a("trace.zip", context, str)) == null) {
                return;
            }
            al.c("attach traces", new Object[0]);
            arrayList.add(a11);
        } catch (Exception e11) {
            e11.printStackTrace();
            al.a(e11);
        }
    }

    private static void a(ArrayList<bn> arrayList, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        try {
            arrayList.add(new bn((byte) 1, "martianlog.txt", sb2.toString().getBytes("utf-8")));
            al.c("attach pageTracingList", new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private static Map<String, String> a(CrashDetailBean crashDetailBean, aa aaVar) {
        HashMap hashMap = new HashMap(30);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.C);
            hashMap.put("A9", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.D);
            hashMap.put("A11", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(crashDetailBean.E);
            hashMap.put("A10", sb4.toString());
            hashMap.put("A23", crashDetailBean.f42108f);
            StringBuilder sb5 = new StringBuilder();
            aaVar.getClass();
            hashMap.put("A7", sb5.toString());
            hashMap.put("A6", aa.n());
            hashMap.put("A5", aaVar.m());
            hashMap.put("A22", aaVar.g());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(crashDetailBean.G);
            hashMap.put("A2", sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(crashDetailBean.F);
            hashMap.put("A1", sb7.toString());
            hashMap.put("A24", aaVar.f42194k);
            StringBuilder sb8 = new StringBuilder();
            sb8.append(crashDetailBean.H);
            hashMap.put("A17", sb8.toString());
            hashMap.put("A25", aaVar.g());
            hashMap.put("A15", aaVar.q());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(aaVar.r());
            hashMap.put("A13", sb9.toString());
            hashMap.put("A34", crashDetailBean.A);
            if (aaVar.G != null) {
                hashMap.put("productIdentify", aaVar.G);
            }
            hashMap.put("A26", URLEncoder.encode(crashDetailBean.L, "utf-8"));
            if (crashDetailBean.f42104b == 1) {
                hashMap.put("A27", crashDetailBean.O);
                hashMap.put("A28", crashDetailBean.N);
                StringBuilder sb10 = new StringBuilder();
                sb10.append(crashDetailBean.f42113k);
                hashMap.put("A29", sb10.toString());
            }
            hashMap.put("A30", crashDetailBean.P);
            StringBuilder sb11 = new StringBuilder();
            sb11.append(crashDetailBean.Q);
            hashMap.put("A18", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(true ^ crashDetailBean.R);
            hashMap.put("A36", sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(aaVar.f42209z);
            hashMap.put("F02", sb13.toString());
            StringBuilder sb14 = new StringBuilder();
            sb14.append(aaVar.A);
            hashMap.put("F03", sb14.toString());
            hashMap.put("F04", aaVar.d());
            StringBuilder sb15 = new StringBuilder();
            sb15.append(aaVar.B);
            hashMap.put("F05", sb15.toString());
            hashMap.put("F06", aaVar.f42208y);
            hashMap.put("F08", aaVar.E);
            hashMap.put("F09", aaVar.F);
            StringBuilder sb16 = new StringBuilder();
            sb16.append(aaVar.C);
            hashMap.put("F10", sb16.toString());
            a(hashMap, crashDetailBean);
            return hashMap;
        } catch (Exception e11) {
            e11.printStackTrace();
            al.a(e11);
            return hashMap;
        }
    }

    private static void a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (crashDetailBean.U >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(crashDetailBean.U);
            map.put("C01", sb2.toString());
        }
        if (crashDetailBean.V >= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(crashDetailBean.V);
            map.put("C02", sb3.toString());
        }
        Map<String, String> map2 = crashDetailBean.W;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : crashDetailBean.W.entrySet()) {
                map.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = crashDetailBean.X;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry2 : crashDetailBean.X.entrySet()) {
            map.put("C04_" + entry2.getKey(), entry2.getValue());
        }
    }

    public static /* synthetic */ void a(List list, boolean z11, long j11, String str, String str2) {
        ag agVar;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashDetailBean crashDetailBean = (CrashDetailBean) it.next();
            String str3 = f42334l.get(Integer.valueOf(crashDetailBean.f42104b));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new ag.c(crashDetailBean.f42105c, str3, crashDetailBean.f42120r, z11, j11, str, str2));
            }
        }
        agVar = ag.a.f42230a;
        agVar.a(arrayList);
    }
}
