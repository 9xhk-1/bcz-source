package com.getui.gtc.dim.b;

import android.text.TextUtils;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.db.DbManager;
import com.getui.gtc.dim.Caller;
import java.util.HashMap;
import java.util.Map;
import org.fusesource.jansi.Ansi;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Long> f29884a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f29885a = new d(0);
    }

    private d() {
        this.f29884a = new HashMap();
        try {
            DbManager.init(GtcProvider.context(), com.getui.gtc.dim.a.a.class, com.getui.gtc.dim.a.b.class);
            ((com.getui.gtc.dim.a.b) DbManager.getTable(com.getui.gtc.dim.a.a.class, com.getui.gtc.dim.a.b.class)).a();
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
        }
    }

    public static h a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ((com.getui.gtc.dim.a.b) DbManager.getTable(com.getui.gtc.dim.a.a.class, com.getui.gtc.dim.a.b.class)).a(str);
    }

    private Long b(String str) {
        try {
            if (this.f29884a.containsKey(str)) {
                return this.f29884a.get(str);
            }
            d unused = a.f29885a;
            h a11 = a(str);
            Long l11 = a11 != null ? (Long) a11.f29919a : null;
            com.getui.gtc.dim.e.b.a("dim interval from db : " + str + " : " + l11);
            this.f29884a.put(str, l11);
            return l11;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a("interval", th2);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static long c(String str) {
        str.getClass();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 320892099:
                if (str.equals("dim-2-1-14-1")) {
                    c11 = 0;
                    break;
                }
                break;
            case 320894021:
                if (str.equals("dim-2-1-16-1")) {
                    c11 = 1;
                    break;
                }
                break;
            case 320894022:
                if (str.equals("dim-2-1-16-2")) {
                    c11 = 2;
                    break;
                }
                break;
            case 320894982:
                if (str.equals("dim-2-1-17-1")) {
                    c11 = 3;
                    break;
                }
                break;
            case 320894983:
                if (str.equals("dim-2-1-17-2")) {
                    c11 = 4;
                    break;
                }
                break;
            case 320894984:
                if (str.equals("dim-2-1-17-3")) {
                    c11 = 5;
                    break;
                }
                break;
            case 320894985:
                if (str.equals("dim-2-1-17-4")) {
                    c11 = 6;
                    break;
                }
                break;
            case 320895943:
                if (str.equals("dim-2-1-18-1")) {
                    c11 = 7;
                    break;
                }
                break;
            case 320895944:
                if (str.equals("dim-2-1-18-2")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 320895945:
                if (str.equals("dim-2-1-18-3")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 320895946:
                if (str.equals("dim-2-1-18-4")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 320896904:
                if (str.equals("dim-2-1-19-1")) {
                    c11 = 11;
                    break;
                }
                break;
            case 320896905:
                if (str.equals("dim-2-1-19-2")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 320919007:
                if (str.equals("dim-2-1-21-1")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 320919008:
                if (str.equals("dim-2-1-21-2")) {
                    c11 = 14;
                    break;
                }
                break;
            case 320919009:
                if (str.equals("dim-2-1-21-3")) {
                    c11 = 15;
                    break;
                }
                break;
            case 320919011:
                if (str.equals("dim-2-1-21-5")) {
                    c11 = 16;
                    break;
                }
                break;
            case 1672919129:
                if (str.equals("dim-2-1-1-1")) {
                    c11 = 17;
                    break;
                }
                break;
            case 1672919131:
                if (str.equals("dim-2-1-1-3")) {
                    c11 = 18;
                    break;
                }
                break;
            case 1672919132:
                if (str.equals("dim-2-1-1-4")) {
                    c11 = 19;
                    break;
                }
                break;
            case 1672920090:
                if (str.equals("dim-2-1-2-1")) {
                    c11 = 20;
                    break;
                }
                break;
            case 1672920092:
                if (str.equals("dim-2-1-2-3")) {
                    c11 = 21;
                    break;
                }
                break;
            case 1672920093:
                if (str.equals("dim-2-1-2-4")) {
                    c11 = 22;
                    break;
                }
                break;
            case 1672921051:
                if (str.equals("dim-2-1-3-1")) {
                    c11 = 23;
                    break;
                }
                break;
            case 1672921052:
                if (str.equals("dim-2-1-3-2")) {
                    c11 = 24;
                    break;
                }
                break;
            case 1672922012:
                if (str.equals("dim-2-1-4-1")) {
                    c11 = 25;
                    break;
                }
                break;
            case 1672922973:
                if (str.equals("dim-2-1-5-1")) {
                    c11 = 26;
                    break;
                }
                break;
            case 1672922974:
                if (str.equals("dim-2-1-5-2")) {
                    c11 = Ansi.f77778c;
                    break;
                }
                break;
            case 1672923934:
                if (str.equals("dim-2-1-6-1")) {
                    c11 = sp.b.f88892n;
                    break;
                }
                break;
            case 1672923936:
                if (str.equals("dim-2-1-6-3")) {
                    c11 = sp.b.f88893o;
                    break;
                }
                break;
            case 1672923937:
                if (str.equals("dim-2-1-6-4")) {
                    c11 = sp.b.f88894p;
                    break;
                }
                break;
            case 1672924895:
                if (str.equals("dim-2-1-7-1")) {
                    c11 = to.c.f90845b;
                    break;
                }
                break;
            case 1672925856:
                if (str.equals("dim-2-1-8-1")) {
                    c11 = ' ';
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
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
                return 5000L;
            case '\r':
            case 14:
            case 15:
            case 16:
                return 21600000L;
            case 17:
            case 18:
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
                return 86400000L;
            default:
                return 0L;
        }
    }

    public /* synthetic */ d(byte b11) {
        this();
    }

    public final Long a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return b(str + ":" + Caller.valueOf(str2).name());
        }
        g d11 = g.d();
        int c11 = d11.c();
        com.getui.gtc.dim.b.a a11 = com.getui.gtc.dim.b.a.a(str);
        if (a11 == null) {
            return null;
        }
        Long l11 = null;
        for (Caller caller : Caller.values()) {
            if (caller.containAt(c11)) {
                Boolean b11 = d11.b(a11.f29856a, caller.name());
                Long b12 = b(str + ":" + caller.name());
                com.getui.gtc.dim.e.b.a("dim check interval for " + str + ", inited caller = " + caller + ", callable = " + b11 + ", interval = " + b12);
                if (b11 == null || b11.booleanValue()) {
                    if (b12 == null) {
                        return null;
                    }
                    if (l11 == null || b12.longValue() < l11.longValue()) {
                        l11 = b12;
                    }
                }
            }
        }
        return l11;
    }

    public final void a(String str, long j11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29884a.put(str, Long.valueOf(j11));
        com.getui.gtc.dim.e.b.a("dim storage globalValidTime set: " + str + " : " + j11);
    }

    public final boolean a(h hVar, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long c11 = c(str);
        Long l11 = this.f29884a.get(str);
        if (l11 == null) {
            l11 = this.f29884a.get("dim-2-2-0-1");
        }
        long longValue = l11 != null ? l11.longValue() : c11;
        Long l12 = null;
        if ((g.d().a() & 2) != 0) {
            com.getui.gtc.dim.b.a a11 = com.getui.gtc.dim.b.a.a(str);
            if (a11 != null) {
                l12 = a(a11.f29857b, (String) null);
            }
        } else {
            com.getui.gtc.dim.e.b.a("dim ig in");
        }
        if (l12 != null) {
            longValue = l12.longValue();
        }
        com.getui.gtc.dim.e.b.a("dim storageValidTime check for " + str + ", dycValue = " + l11 + ", localValue = " + c11 + ", interval = " + l12 + ", use " + longValue);
        boolean z11 = currentTimeMillis - hVar.f29920b > longValue;
        if (z11) {
            com.getui.gtc.dim.e.b.b("dim storage source expired for ".concat(String.valueOf(str)));
        }
        return z11;
    }

    public static boolean a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((com.getui.gtc.dim.a.b) DbManager.getTable(com.getui.gtc.dim.a.a.class, com.getui.gtc.dim.a.b.class)).a(str, obj);
    }
}
