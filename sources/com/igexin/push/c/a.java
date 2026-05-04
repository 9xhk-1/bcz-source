package com.igexin.push.c;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static final String f37417a = com.igexin.push.c.b.f37444a + a.class.getName();

    /* renamed from: q, reason: collision with root package name */
    private static final int f37418q = 10;

    /* renamed from: b, reason: collision with root package name */
    int f37419b;

    /* renamed from: g, reason: collision with root package name */
    protected int f37424g;

    /* renamed from: h, reason: collision with root package name */
    protected volatile long f37425h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile long f37426i;

    /* renamed from: j, reason: collision with root package name */
    boolean f37427j;

    /* renamed from: l, reason: collision with root package name */
    private int f37429l;

    /* renamed from: m, reason: collision with root package name */
    private int f37430m;

    /* renamed from: n, reason: collision with root package name */
    private d f37431n;

    /* renamed from: c, reason: collision with root package name */
    final List<d> f37420c = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    private final List<b> f37432o = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    final Object f37421d = new Object();

    /* renamed from: p, reason: collision with root package name */
    private final Object f37433p = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile EnumC0462a f37422e = EnumC0462a.NORMAL;

    /* renamed from: r, reason: collision with root package name */
    private int f37434r = 0;

    /* renamed from: f, reason: collision with root package name */
    public AtomicBoolean f37423f = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    final Comparator<d> f37428k = new Comparator<d>() { // from class: com.igexin.push.c.a.1
        private static int a(d dVar, d dVar2) {
            return (int) (dVar.c() - dVar2.c());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(d dVar, d dVar2) {
            return (int) (dVar.c() - dVar2.c());
        }
    };

    /* renamed from: com.igexin.push.c.a$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37436a;

        static {
            int[] iArr = new int[EnumC0462a.values().length];
            f37436a = iArr;
            try {
                iArr[EnumC0462a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37436a[EnumC0462a.BACKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37436a[EnumC0462a.TRY_NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.igexin.push.c.a$a, reason: collision with other inner class name */
    public enum EnumC0462a {
        NORMAL(0),
        BACKUP(1),
        TRY_NORMAL(2);


        /* renamed from: d, reason: collision with root package name */
        int f37441d;

        EnumC0462a(int i11) {
            this.f37441d = i11;
        }

        private int a() {
            return this.f37441d;
        }

        public static EnumC0462a a(int i11) {
            for (EnumC0462a enumC0462a : values()) {
                if (enumC0462a.f37441d == i11) {
                    return enumC0462a;
                }
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f37442a;

        /* renamed from: b, reason: collision with root package name */
        public long f37443b;

        public final b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            try {
                this.f37442a = jSONObject.getString("address");
                this.f37443b = jSONObject.getLong("outdateTime");
                return this;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                return this;
            }
        }

        public final String toString() {
            return "ServerAddress{address='" + this.f37442a + "', outdateTime=" + this.f37443b + l50.b.f69928j;
        }

        public final JSONObject a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("address", this.f37442a);
                jSONObject.put("outdateTime", this.f37443b);
                return jSONObject;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                return null;
            }
        }
    }

    private String a(boolean z11) {
        try {
            synchronized (this.f37433p) {
                try {
                    String str = this.f37427j ? com.igexin.push.core.e.f38018at : com.igexin.push.core.e.f38019au;
                    if (this.f37432o.isEmpty() && TextUtils.isEmpty(str)) {
                        com.igexin.c.a.c.a.a(f37417a + "cm list size = 0", new Object[0]);
                        this.f37430m = 0;
                        this.f37429l = 0;
                    } else {
                        if (this.f37432o.isEmpty() && !TextUtils.isEmpty(str)) {
                            a(str);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        String str2 = f37417a;
                        sb2.append(str2);
                        sb2.append("cm try = ");
                        sb2.append(this.f37430m);
                        sb2.append(" times");
                        com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
                        if (this.f37430m >= this.f37432o.size()) {
                            com.igexin.c.a.c.a.a(str2 + "cm invalid", new Object[0]);
                            this.f37430m = 0;
                            this.f37429l = 0;
                            this.f37432o.clear();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            Iterator<b> it = this.f37432o.iterator();
                            while (it.hasNext()) {
                                b next = it.next();
                                if (next.f37443b < currentTimeMillis) {
                                    com.igexin.c.a.c.a.a(f37417a + "|add[" + next.f37442a + "] outDate", new Object[0]);
                                    it.remove();
                                }
                            }
                            h();
                            if (!this.f37432o.isEmpty()) {
                                if (z11) {
                                    this.f37430m++;
                                }
                                int i11 = this.f37429l >= this.f37432o.size() ? 0 : this.f37429l;
                                this.f37429l = i11;
                                String str3 = this.f37432o.get(i11).f37442a;
                                this.f37429l++;
                                return str3;
                            }
                        }
                    }
                    return null;
                } finally {
                }
            }
        } catch (Exception e11) {
            String str4 = f37417a;
            com.igexin.c.a.c.a.a(str4, e11.toString());
            com.igexin.c.a.c.a.a(str4 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + e11.toString(), new Object[0]);
            return null;
        }
    }

    private String b(boolean z11) {
        String a11;
        synchronized (this.f37421d) {
            int i11 = this.f37419b >= this.f37420c.size() ? 0 : this.f37419b;
            this.f37419b = i11;
            d dVar = this.f37420c.get(i11);
            this.f37431n = dVar;
            a11 = dVar.a(z11);
        }
        return a11;
    }

    private List<b> g() {
        return this.f37432o;
    }

    private void h() {
        JSONArray jSONArray = new JSONArray();
        Iterator<b> it = this.f37432o.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().a());
        }
        com.igexin.push.core.e.f.a().c(jSONArray.length() == 0 ? "null" : jSONArray.toString(), !this.f37427j);
    }

    private void i() {
        synchronized (this.f37421d) {
            this.f37419b = 0;
            Collections.sort(this.f37420c, this.f37428k);
        }
    }

    private void j() {
        com.igexin.c.a.c.a.a(f37417a + "|detect success, current type = " + this.f37422e, new Object[0]);
        if (this.f37422e == EnumC0462a.BACKUP) {
            a(EnumC0462a.TRY_NORMAL);
            com.igexin.push.core.d unused = d.a.f37956a;
            com.igexin.push.e.a.a(true);
        }
    }

    private void k() {
        EnumC0462a enumC0462a;
        com.igexin.c.a.c.a.a(f37417a + "|before disconnect, type = " + this.f37422e, new Object[0]);
        int i11 = AnonymousClass2.f37436a[this.f37422e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 || System.currentTimeMillis() - this.f37425h <= com.igexin.push.config.d.f37598r) {
                return;
            } else {
                enumC0462a = EnumC0462a.TRY_NORMAL;
            }
        } else if (System.currentTimeMillis() - this.f37426i <= 86400000 || this.f37424g <= com.igexin.push.config.d.f37600t) {
            return;
        } else {
            enumC0462a = EnumC0462a.BACKUP;
        }
        a(enumC0462a);
    }

    public final synchronized void c() {
        this.f37424g++;
        com.igexin.c.a.c.a.a(f37417a + "|loginFailedCnt = " + this.f37424g, new Object[0]);
    }

    public final void d() {
        if (AnonymousClass2.f37436a[this.f37422e.ordinal()] == 2 && System.currentTimeMillis() - this.f37425h > com.igexin.push.config.d.f37598r) {
            a(EnumC0462a.TRY_NORMAL);
        }
    }

    public final void e() {
        if (this.f37422e != EnumC0462a.BACKUP) {
            this.f37424g = 0;
        }
        int i11 = AnonymousClass2.f37436a[this.f37422e.ordinal()];
        if (i11 == 1) {
            this.f37426i = System.currentTimeMillis();
            c.a().f().n();
        } else if (i11 != 3) {
            return;
        } else {
            a(EnumC0462a.NORMAL);
        }
        this.f37423f.set(false);
    }

    public final void f() {
        EnumC0462a enumC0462a;
        com.igexin.c.a.c.a.a(f37417a + "|before disconnect, type = " + this.f37422e, new Object[0]);
        int[] iArr = AnonymousClass2.f37436a;
        int i11 = iArr[this.f37422e.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 && System.currentTimeMillis() - this.f37425h > com.igexin.push.config.d.f37598r) {
                enumC0462a = EnumC0462a.TRY_NORMAL;
                a(enumC0462a);
            }
        } else if (System.currentTimeMillis() - this.f37426i > 86400000 && this.f37424g > com.igexin.push.config.d.f37600t) {
            enumC0462a = EnumC0462a.BACKUP;
            a(enumC0462a);
        }
        if (com.igexin.push.core.e.f38044u && this.f37422e != EnumC0462a.BACKUP) {
            this.f37426i = System.currentTimeMillis();
            c.a().f().n();
        }
        if (iArr[this.f37422e.ordinal()] != 3) {
            return;
        }
        int i12 = this.f37434r + 1;
        this.f37434r = i12;
        if (i12 >= 10) {
            this.f37424g = 0;
            this.f37425h = System.currentTimeMillis();
            a(EnumC0462a.BACKUP);
        }
    }

    private void c(boolean z11) {
        this.f37427j = z11;
    }

    public final synchronized void a(EnumC0462a enumC0462a) {
        try {
            StringBuilder sb2 = new StringBuilder();
            String str = f37417a;
            sb2.append(str);
            sb2.append("|set domain type = ");
            sb2.append(enumC0462a);
            com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
            if (com.igexin.push.config.d.f37587g) {
                if (this.f37422e != enumC0462a) {
                    a((List<b>) null);
                }
                int i11 = AnonymousClass2.f37436a[enumC0462a.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f37423f.set(true);
                        if (this.f37422e != enumC0462a) {
                            this.f37425h = System.currentTimeMillis();
                        }
                        SDKUrlConfig.setConnectAddress(SDKUrlConfig.XFR_ADDRESS_BAK[0]);
                        SDKUrlConfig.getConnectAddress();
                        com.igexin.c.a.c.a.a(str + "|set domain type backup cm = " + SDKUrlConfig.getConnectAddress(), new Object[0]);
                    } else if (i11 == 3) {
                        if (this.f37422e != enumC0462a) {
                            this.f37434r = 0;
                        }
                    }
                    this.f37422e = enumC0462a;
                    c.a().f().n();
                }
                this.f37419b = 0;
                SDKUrlConfig.setConnectAddress(b(true));
                if (enumC0462a == EnumC0462a.NORMAL) {
                    this.f37423f.set(false);
                }
                SDKUrlConfig.getConnectAddress();
                com.igexin.c.a.c.a.a(str + "|set domain type normal cm = " + SDKUrlConfig.getConnectAddress(), new Object[0]);
                this.f37422e = enumC0462a;
                c.a().f().n();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        this.f37430m = 0;
        d dVar = this.f37431n;
        if (dVar != null) {
            dVar.e();
        }
    }

    private void a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                this.f37432o.add(new b().a(jSONArray.getJSONObject(i11)));
            }
            com.igexin.c.a.c.a.a(f37417a + "|get cm from cache, isWf = " + this.f37427j + ", lastCmList = " + str, new Object[0]);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final void b(List<d> list) {
        synchronized (this.f37421d) {
            this.f37420c.clear();
            this.f37420c.addAll(list);
            Collections.sort(this.f37420c, this.f37428k);
        }
    }

    public final void a(List<b> list) {
        synchronized (this.f37433p) {
            try {
                this.f37429l = 0;
                this.f37430m = 0;
                this.f37432o.clear();
                if (list != null) {
                    this.f37432o.addAll(list);
                    com.igexin.c.a.c.a.a(f37417a + "|set cm list: " + list.toString(), new Object[0]);
                }
                h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a() {
        boolean z11;
        String a11;
        String str;
        try {
            com.igexin.push.core.d unused = d.a.f37956a;
            z11 = true;
            boolean z12 = !com.igexin.push.e.a.e();
            a11 = a(z12);
            StringBuilder sb2 = new StringBuilder();
            str = f37417a;
            sb2.append(str);
            sb2.append("|get from cm = ");
            sb2.append(a11);
            com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
            if (a11 == null) {
                if (com.igexin.push.config.d.f37587g && this.f37422e == EnumC0462a.BACKUP) {
                    int i11 = this.f37419b;
                    String[] strArr = SDKUrlConfig.XFR_ADDRESS_BAK;
                    if (i11 >= strArr.length) {
                        i11 = 0;
                    }
                    this.f37419b = i11;
                    a11 = strArr[i11];
                    this.f37419b = i11 + 1;
                } else {
                    d dVar = this.f37431n;
                    if (dVar != null && !dVar.d()) {
                        this.f37419b++;
                    }
                    a11 = b(z12);
                }
                z11 = false;
            }
        } catch (Exception e11) {
            e = e11;
            z11 = false;
        }
        try {
            if (!SDKUrlConfig.getConnectAddress().equals(a11)) {
                SDKUrlConfig.getConnectAddress();
                com.igexin.c.a.c.a.a(str + "|address changed : form [" + SDKUrlConfig.getConnectAddress() + "] to [" + a11 + "]", new Object[0]);
            }
            SDKUrlConfig.setConnectAddress(a11);
            return z11;
        } catch (Exception e12) {
            e = e12;
            com.igexin.c.a.c.a.a(e);
            String str2 = f37417a;
            com.igexin.c.a.c.a.a(str2, e.toString());
            com.igexin.c.a.c.a.a(str2 + "|switch address|" + e.toString(), new Object[0]);
            return z11;
        }
    }
}
