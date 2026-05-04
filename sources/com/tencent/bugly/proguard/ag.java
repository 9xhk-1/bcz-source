package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f42226a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f42227b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final ag f42230a = new ag(0);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        String f42231a;

        /* renamed from: b, reason: collision with root package name */
        public long f42232b;

        /* renamed from: c, reason: collision with root package name */
        public String f42233c;

        public final String toString() {
            return "SLAData{uuid='" + this.f42231a + "', time=" + this.f42232b + ", data='" + this.f42233c + '\'' + l50.b.f69928j;
        }
    }

    public /* synthetic */ ag(byte b11) {
        this();
    }

    public static void c(List<b> list) {
        if (list == null || list.isEmpty()) {
            al.c("sla batch report data is empty", new Object[0]);
            return;
        }
        al.c("sla batch report list size:%s", Integer.valueOf(list.size()));
        if (list.size() > 30) {
            list = list.subList(0, 29);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f42233c);
        }
        Pair<Integer, String> a11 = ad.a(arrayList);
        al.c("sla batch report result, rspCode:%s rspMsg:%s", a11.first, a11.second);
        if (((Integer) a11.first).intValue() == 200) {
            d(list);
        }
    }

    public static void d(List<b> list) {
        if (list == null || list.isEmpty()) {
            al.c("sla batch delete list is null", new Object[0]);
            return;
        }
        al.c("sla batch delete list size:%s", Integer.valueOf(list.size()));
        try {
            String str = "_id in (" + a(",", list) + pn.j.f81007d;
            al.c("sla batch delete where:%s", str);
            w.a().a("t_sla", str);
        } catch (Throwable th2) {
            al.b(th2);
        }
    }

    private static void e(List<b> list) {
        for (b bVar : list) {
            al.c("sla save id:%s time:%s msg:%s", bVar.f42231a, Long.valueOf(bVar.f42232b), bVar.f42233c);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", bVar.f42231a);
                contentValues.put("_tm", Long.valueOf(bVar.f42232b));
                contentValues.put("_dt", bVar.f42233c);
                w.a().a("t_sla", contentValues, (v) null);
            } catch (Throwable th2) {
                al.b(th2);
            }
        }
    }

    public final void a(List<c> list) {
        if (list == null || list.isEmpty()) {
            al.d("sla batch report event is null", new Object[0]);
            return;
        }
        al.c("sla batch report event size:%s", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b b11 = b(it.next());
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        e(arrayList);
        b(arrayList);
    }

    public final void b(final List<b> list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ak.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.ag.1
                @Override // java.lang.Runnable
                public final void run() {
                    ag.c(list);
                }
            });
        } else {
            c(list);
        }
    }

    private ag() {
        this.f42226a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        this.f42227b = new ad();
    }

    private b b(c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f42235b)) {
            aa b11 = aa.b();
            if (b11 == null) {
                al.d("sla convert failed because ComInfoManager is null", new Object[0]);
                return null;
            }
            StringBuilder sb2 = new StringBuilder("&app_version=");
            sb2.append(b11.f42198o);
            sb2.append("&app_name=");
            sb2.append(b11.f42200q);
            sb2.append("&app_bundle_id=");
            sb2.append(b11.f42186c);
            sb2.append("&client_type=android&user_id=");
            sb2.append(b11.f());
            sb2.append("&sdk_version=");
            sb2.append(b11.f42191h);
            sb2.append("&event_code=");
            sb2.append(cVar.f42235b);
            sb2.append("&event_result=");
            sb2.append(cVar.f42237d ? 1 : 0);
            sb2.append("&event_time=");
            sb2.append(this.f42226a.format(new Date(cVar.f42236c)));
            sb2.append("&event_cost=");
            sb2.append(cVar.f42238e);
            sb2.append("&device_id=");
            sb2.append(b11.g());
            sb2.append("&debug=");
            sb2.append(b11.D ? 1 : 0);
            sb2.append("&param_0=");
            sb2.append(cVar.f42239f);
            sb2.append("&param_1=");
            sb2.append(cVar.f42234a);
            sb2.append("&param_2=");
            sb2.append(b11.M ? "rqd" : "ext");
            sb2.append("&param_4=");
            sb2.append(b11.e());
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(cVar.f42240g)) {
                sb3 = sb3 + "&param_3=" + cVar.f42240g;
            }
            al.c("sla convert eventId:%s eventType:%s, eventTime:%s success:%s cost:%s from:%s uploadMsg:", cVar.f42234a, cVar.f42235b, Long.valueOf(cVar.f42236c), Boolean.valueOf(cVar.f42237d), Long.valueOf(cVar.f42238e), cVar.f42239f, cVar.f42240g);
            String str = cVar.f42234a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + cVar.f42235b;
            b bVar = new b();
            bVar.f42231a = str;
            bVar.f42232b = cVar.f42236c;
            bVar.f42233c = sb3;
            return bVar;
        }
        al.d("sla convert event is null", new Object[0]);
        return null;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        String f42234a;

        /* renamed from: b, reason: collision with root package name */
        String f42235b;

        /* renamed from: c, reason: collision with root package name */
        long f42236c;

        /* renamed from: d, reason: collision with root package name */
        boolean f42237d;

        /* renamed from: e, reason: collision with root package name */
        long f42238e;

        /* renamed from: f, reason: collision with root package name */
        String f42239f;

        /* renamed from: g, reason: collision with root package name */
        String f42240g;

        public c(String str, String str2, long j11, boolean z11, long j12, String str3, String str4) {
            this.f42234a = str;
            this.f42235b = str2;
            this.f42236c = j11;
            this.f42237d = z11;
            this.f42238e = j12;
            this.f42239f = str3;
            this.f42240g = str4;
        }

        public c() {
        }
    }

    private static String a(String str, Iterable<b> iterable) {
        Iterator<b> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("'");
        sb2.append(it.next().f42231a);
        sb2.append("'");
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append("'");
            sb2.append(it.next().f42231a);
            sb2.append("'");
        }
        return sb2.toString();
    }

    public static List<b> a() {
        Cursor a11 = w.a().a("t_sla", new String[]{"_id", "_tm", "_dt"}, (String) null, "_tm", "30");
        if (a11 == null) {
            return null;
        }
        if (a11.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (a11.moveToNext()) {
            try {
                b bVar = new b();
                bVar.f42231a = a11.getString(a11.getColumnIndex("_id"));
                bVar.f42232b = a11.getLong(a11.getColumnIndex("_tm"));
                bVar.f42233c = a11.getString(a11.getColumnIndex("_dt"));
                al.c(bVar.toString(), new Object[0]);
                arrayList.add(bVar);
            } catch (Throwable th2) {
                try {
                    al.b(th2);
                    return arrayList;
                } finally {
                    a11.close();
                }
            }
        }
        return arrayList;
    }

    public final void a(c cVar) {
        if (TextUtils.isEmpty(cVar.f42235b)) {
            al.d("sla report event is null", new Object[0]);
        } else {
            al.c("sla report single event", new Object[0]);
            a(Collections.singletonList(cVar));
        }
    }
}
