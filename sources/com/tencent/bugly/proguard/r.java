package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    private static boolean f42624e = true;

    /* renamed from: a, reason: collision with root package name */
    private Context f42625a;

    /* renamed from: b, reason: collision with root package name */
    private long f42626b;

    /* renamed from: c, reason: collision with root package name */
    private int f42627c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42628d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private boolean f42634b;

        /* renamed from: c, reason: collision with root package name */
        private UserInfoBean f42635c;

        public a(UserInfoBean userInfoBean, boolean z11) {
            this.f42635c = userInfoBean;
            this.f42634b = z11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (r.this.f42628d) {
                try {
                    UserInfoBean userInfoBean = this.f42635c;
                    if (userInfoBean != null) {
                        r.a(userInfoBean);
                        al.c("[UserInfo] Record user info.", new Object[0]);
                        r.this.a(this.f42635c, false);
                    }
                    if (this.f42634b) {
                        r.this.b();
                    }
                } catch (Throwable th2) {
                    if (al.a(th2)) {
                        return;
                    }
                    th2.printStackTrace();
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < r.this.f42626b) {
                ak.a().a(r.this.new b(), (r.this.f42626b - currentTimeMillis) + 5000);
            } else {
                r.this.a(3, false);
                r.this.a();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private long f42638b;

        public c(long j11) {
            this.f42638b = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            r.this.b();
            r.this.a(this.f42638b);
        }
    }

    public r(Context context, boolean z11) {
        this.f42625a = context;
        this.f42628d = z11;
    }

    private static void b(List<UserInfoBean> list, List<UserInfoBean> list2) {
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            UserInfoBean next = it.next();
            if (next.f42062f != -1) {
                it.remove();
                if (next.f42061e < ap.b()) {
                    list2.add(next);
                }
            }
        }
    }

    public final void a(int i11, boolean z11) {
        ac a11 = ac.a();
        if (a11 != null && !a11.c().f42085g && i11 != 1 && i11 != 3) {
            al.e("UserInfo is disable", new Object[0]);
            return;
        }
        if (i11 == 1 || i11 == 3) {
            this.f42627c++;
        }
        aa a12 = aa.a(this.f42625a);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f42058b = i11;
        userInfoBean.f42059c = a12.f42187d;
        userInfoBean.f42060d = a12.f();
        userInfoBean.f42061e = System.currentTimeMillis();
        userInfoBean.f42062f = -1L;
        userInfoBean.f42070n = a12.f42198o;
        userInfoBean.f42071o = i11 == 1 ? 1 : 0;
        userInfoBean.f42068l = a12.a();
        userInfoBean.f42069m = a12.f42208y;
        userInfoBean.f42063g = a12.f42209z;
        userInfoBean.f42064h = a12.A;
        userInfoBean.f42065i = a12.B;
        userInfoBean.f42067k = a12.C;
        userInfoBean.f42074r = a12.t();
        userInfoBean.f42075s = a12.y();
        userInfoBean.f42072p = a12.z();
        userInfoBean.f42073q = a12.f42207x;
        ak.a().a(new a(userInfoBean, z11), 0L);
    }

    public final void b() {
        ak a11 = ak.a();
        if (a11 != null) {
            a11.a(new Runnable() { // from class: com.tencent.bugly.proguard.r.2

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f42631a = false;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        r.this.a(this.f42631a);
                    } catch (Throwable th2) {
                        al.a(th2);
                    }
                }
            });
        }
    }

    private static void b(List<UserInfoBean> list) {
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size() && i11 < 50; i11++) {
            UserInfoBean userInfoBean = list.get(i11);
            sb2.append(" or _id = ");
            sb2.append(userInfoBean.f42057a);
        }
        String sb3 = sb2.toString();
        if (sb3.length() > 0) {
            sb3 = sb3.substring(4);
        }
        sb2.setLength(0);
        try {
            al.c("[Database] deleted %s data %d", "t_ui", Integer.valueOf(w.a().a("t_ui", sb3)));
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    private static ContentValues b(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j11 = userInfoBean.f42057a;
            if (j11 > 0) {
                contentValues.put("_id", Long.valueOf(j11));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f42061e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f42062f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f42058b));
            contentValues.put("_pc", userInfoBean.f42059c);
            contentValues.put("_dt", ap.a(userInfoBean));
            return contentValues;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public final void a(long j11) {
        ak.a().a(new c(j11), j11);
    }

    public final void a() {
        this.f42626b = ap.b() + 86400000;
        ak.a().a(new b(), (this.f42626b - System.currentTimeMillis()) + 5000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (r14 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(boolean r14) {
        /*
            r13 = this;
            boolean r0 = com.tencent.bugly.proguard.r.f42624e
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r13.f42625a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "bugly_last_us_up_tm"
            r0.<init>(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = 0
            if (r14 == 0) goto L24
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.am.a(r0, r14, r4, r6)
            return r1
        L24:
            boolean r14 = r0.exists()
            if (r14 != 0) goto L32
            java.lang.String r14 = java.lang.String.valueOf(r2)
            com.tencent.bugly.proguard.am.a(r0, r14, r4, r6)
            goto L8a
        L32:
            java.io.BufferedReader r14 = com.tencent.bugly.proguard.ap.a(r0)
            if (r14 == 0) goto L87
            java.lang.String r7 = r14.readLine()     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L69
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L69
            long r7 = r7.longValue()     // Catch: java.lang.Throwable -> L69
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto L61
            long r9 = r2 - r7
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L56
            goto L61
        L56:
            long r7 = r2 - r7
            r9 = 300000(0x493e0, double:1.482197E-318)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L61
            r1 = r6
            goto L87
        L61:
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L69
            com.tencent.bugly.proguard.am.a(r0, r7, r4, r6)     // Catch: java.lang.Throwable -> L69
            goto L87
        L69:
            r7 = move-exception
            com.tencent.bugly.proguard.al.b(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7d
            com.tencent.bugly.proguard.am.a(r0, r2, r4, r6)     // Catch: java.lang.Throwable -> L7d
        L74:
            r14.close()     // Catch: java.lang.Exception -> L78
            goto L8a
        L78:
            r14 = move-exception
            com.tencent.bugly.proguard.al.a(r14)
            goto L8a
        L7d:
            r0 = move-exception
            r14.close()     // Catch: java.lang.Exception -> L82
            goto L86
        L82:
            r14 = move-exception
            com.tencent.bugly.proguard.al.a(r14)
        L86:
            throw r0
        L87:
            if (r14 == 0) goto L8a
            goto L74
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.r.b(boolean):boolean");
    }

    private static void a(List<UserInfoBean> list, List<UserInfoBean> list2) {
        int size = list.size() - 20;
        if (size > 0) {
            int i11 = 0;
            while (i11 < list.size() - 1) {
                int i12 = i11 + 1;
                for (int i13 = i12; i13 < list.size(); i13++) {
                    if (list.get(i11).f42061e > list.get(i13).f42061e) {
                        UserInfoBean userInfoBean = list.get(i11);
                        list.set(i11, list.get(i13));
                        list.set(i13, userInfoBean);
                    }
                }
                i11 = i12;
            }
            for (int i14 = 0; i14 < size; i14++) {
                list2.add(list.get(i14));
            }
        }
    }

    private static int a(List<UserInfoBean> list) {
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        for (UserInfoBean userInfoBean : list) {
            if (userInfoBean.f42061e > currentTimeMillis - 600000 && ((i11 = userInfoBean.f42058b) == 1 || i11 == 4 || i11 == 3)) {
                i12++;
            }
        }
        return i12;
    }

    private void a(final List<UserInfoBean> list, boolean z11) {
        aa b11;
        if (!b(z11)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : list) {
                userInfoBean.f42062f = currentTimeMillis;
                a(userInfoBean, true);
            }
            al.d("uploadCheck failed", new Object[0]);
            return;
        }
        int i11 = this.f42627c == 1 ? 1 : 2;
        bv bvVar = null;
        if (list != null && list.size() != 0 && (b11 = aa.b()) != null) {
            b11.o();
            bv bvVar2 = new bv();
            bvVar2.f42577b = b11.f42187d;
            bvVar2.f42578c = b11.g();
            ArrayList<bu> arrayList = new ArrayList<>();
            Iterator<UserInfoBean> it = list.iterator();
            while (it.hasNext()) {
                bu a11 = ae.a(it.next());
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            bvVar2.f42579d = arrayList;
            HashMap hashMap = new HashMap();
            bvVar2.f42580e = hashMap;
            hashMap.put("A7", new StringBuilder().toString());
            bvVar2.f42580e.put("A6", aa.n());
            bvVar2.f42580e.put("A5", b11.m());
            Map<String, String> map = bvVar2.f42580e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b11.k());
            map.put("A2", sb2.toString());
            Map<String, String> map2 = bvVar2.f42580e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(b11.k());
            map2.put("A1", sb3.toString());
            bvVar2.f42580e.put("A24", b11.f42194k);
            Map<String, String> map3 = bvVar2.f42580e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(b11.l());
            map3.put("A17", sb4.toString());
            bvVar2.f42580e.put("A15", b11.q());
            Map<String, String> map4 = bvVar2.f42580e;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(b11.r());
            map4.put("A13", sb5.toString());
            bvVar2.f42580e.put("F08", b11.E);
            bvVar2.f42580e.put("F09", b11.F);
            Map<String, String> y11 = b11.y();
            if (y11 != null && y11.size() > 0) {
                for (Map.Entry<String, String> entry : y11.entrySet()) {
                    bvVar2.f42580e.put("C04_" + entry.getKey(), entry.getValue());
                }
            }
            if (i11 == 1) {
                bvVar2.f42576a = (byte) 1;
            } else if (i11 != 2) {
                al.e("unknown up type %d ", Integer.valueOf(i11));
            } else {
                bvVar2.f42576a = (byte) 2;
            }
            bvVar = bvVar2;
        }
        if (bvVar == null) {
            al.d("[UserInfo] Failed to create UserInfoPackage.", new Object[0]);
            return;
        }
        byte[] a12 = ae.a((m) bvVar);
        if (a12 == null) {
            al.d("[UserInfo] Failed to encode data.", new Object[0]);
            return;
        }
        bq a13 = ae.a(this.f42625a, 840, a12);
        if (a13 == null) {
            al.d("[UserInfo] Request package is null.", new Object[0]);
            return;
        }
        ai.a().a(1001, a13, ac.a().c().f42095q, StrategyBean.f42079a, new ah() { // from class: com.tencent.bugly.proguard.r.1
            @Override // com.tencent.bugly.proguard.ah
            public final void a(boolean z12, String str) {
                if (z12) {
                    al.c("[UserInfo] Successfully uploaded user info.", new Object[0]);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    for (UserInfoBean userInfoBean2 : list) {
                        userInfoBean2.f42062f = currentTimeMillis2;
                        r.this.a(userInfoBean2, true);
                    }
                }
            }
        }, this.f42627c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(UserInfoBean userInfoBean, boolean z11) {
        List<UserInfoBean> a11;
        if (userInfoBean == null) {
            return;
        }
        if (!z11 && userInfoBean.f42058b != 1 && (a11 = a(aa.a(this.f42625a).f42187d)) != null && a11.size() >= 20) {
            al.a("[UserInfo] There are too many user info in local: %d", Integer.valueOf(a11.size()));
            return;
        }
        long a12 = w.a().a("t_ui", b(userInfoBean), (v) null);
        if (a12 >= 0) {
            al.c("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(a12));
            userInfoBean.f42057a = a12;
        }
    }

    public static List<UserInfoBean> a(String str) {
        Cursor cursor;
        String str2;
        try {
            if (ap.b(str)) {
                str2 = null;
            } else {
                str2 = "_pc = '" + str + "'";
            }
            cursor = w.a().a("t_ui", (String[]) null, str2);
            if (cursor == null) {
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    UserInfoBean a11 = a(cursor);
                    if (a11 != null) {
                        arrayList.add(a11);
                    } else {
                        try {
                            long j11 = cursor.getLong(cursor.getColumnIndex("_id"));
                            sb2.append(" or _id = ");
                            sb2.append(j11);
                        } catch (Throwable unused) {
                            al.d("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String sb3 = sb2.toString();
                if (sb3.length() > 0) {
                    al.d("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(w.a().a("t_ui", sb3.substring(4))));
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

    private static UserInfoBean a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j11 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) ap.a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f42057a = j11;
            return userInfoBean;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z11) {
        ai a11;
        ac a12;
        if (this.f42628d && (a11 = ai.a()) != null && (a12 = ac.a()) != null && (!a12.b() || a11.b(1001))) {
            String str = aa.a(this.f42625a).f42187d;
            ArrayList arrayList = new ArrayList();
            List<UserInfoBean> a13 = a(str);
            boolean z12 = true;
            if (a13 != null) {
                a(a13, arrayList);
                b(a13, arrayList);
                int a14 = a(a13);
                if (a14 > 15) {
                    al.d("[UserInfo] Upload user info too many times in 10 min: %d", Integer.valueOf(a14));
                    z12 = false;
                }
            } else {
                a13 = new ArrayList<>();
            }
            if (arrayList.size() > 0) {
                b(arrayList);
            }
            if (z12 && a13.size() != 0) {
                al.c("[UserInfo] Upload user info(size: %d)", Integer.valueOf(a13.size()));
                a(a13, z11);
                return;
            }
            al.c("[UserInfo] There is no user info in local database.", new Object[0]);
        }
    }

    public static /* synthetic */ void a(UserInfoBean userInfoBean) {
        aa b11;
        if (userInfoBean == null || (b11 = aa.b()) == null) {
            return;
        }
        userInfoBean.f42066j = b11.d();
    }
}
