package com.igexin.push.f;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.ServiceManager;
import com.igexin.push.core.d;
import com.igexin.push.core.e.f.AnonymousClass25;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public class g implements com.igexin.push.f.b.c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f38587a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f38588b = "Type10Task";

    /* renamed from: c, reason: collision with root package name */
    private SimpleDateFormat f38589c = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

    public static g a() {
        if (f38587a == null) {
            synchronized (g.class) {
                try {
                    if (f38587a == null) {
                        f38587a = new g();
                    }
                } finally {
                }
            }
        }
        return f38587a;
    }

    private static String b(String str) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.igexin.push.core.e.A + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.igexin.push.core.e.f37998a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + 3 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.igexin.push.core.e.C + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ServiceManager.getInstance().initType.first;
    }

    private void f() {
        if (com.igexin.push.core.e.f38022ax == 0) {
            return;
        }
        try {
            String format = this.f38589c.format(new Date(com.igexin.push.core.e.f38022ax));
            String format2 = this.f38589c.format(new Date());
            Date parse = this.f38589c.parse(format);
            Date parse2 = this.f38589c.parse(format2);
            com.igexin.c.a.c.a.b(f38588b, " lastDateString = " + format + " ; nowDateString = " + format2);
            if (parse2.after(parse)) {
                d();
            }
        } catch (ParseException e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    @Override // com.igexin.push.f.b.c
    public final boolean c() {
        return com.igexin.push.config.d.f37597q;
    }

    public final void d() {
        final long currentTimeMillis = System.currentTimeMillis();
        final String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(currentTimeMillis));
        if (!com.igexin.push.config.d.f37597q) {
            com.igexin.c.a.c.a.b(f38588b, "upload type10 enable false");
            return;
        }
        int i11 = TextUtils.isEmpty(com.igexin.push.core.e.A) ? com.igexin.push.config.d.f37575ag * 1000 : 0;
        com.igexin.c.a.c.a.b(f38588b, "upload type10 delay time = ".concat(String.valueOf(i11)));
        com.igexin.push.core.d unused = d.a.f37956a;
        com.igexin.push.core.d.a(new com.igexin.push.f.b.f(i11) { // from class: com.igexin.push.f.g.1
            @Override // com.igexin.c.a.d.a.e
            public final int c() {
                return 0;
            }

            @Override // com.igexin.push.f.b.f
            public final void h() {
                try {
                    synchronized (g.class) {
                        try {
                            if (currentTimeMillis - com.igexin.push.core.e.f38022ax <= 60000) {
                                com.igexin.c.a.c.a.b(g.f38588b, "upload type10 in 1m");
                                return;
                            }
                            com.igexin.push.core.e.f38022ax = currentTimeMillis;
                            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.core.e.f.a().new AnonymousClass25(), false, true);
                            com.igexin.push.core.c.a.a();
                            String a11 = g.a(format);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("type", (Integer) 10);
                            contentValues.put("data", a11);
                            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                            d.a.f37956a.f37950i.a(com.igexin.push.core.b.f37709af, contentValues);
                            StringBuilder sb2 = new StringBuilder();
                            com.igexin.push.core.c.a.a();
                            List<com.igexin.push.core.b.c> c11 = com.igexin.push.core.c.a.c();
                            final ArrayList arrayList = new ArrayList();
                            for (com.igexin.push.core.b.c cVar : c11) {
                                arrayList.add(String.valueOf(cVar.f37774a));
                                sb2.append(cVar.f37775b);
                                sb2.append("\n");
                            }
                            if (sb2.length() > 0) {
                                sb2.deleteCharAt(sb2.length() - 1);
                            }
                            com.igexin.c.a.c.a.b(g.f38588b, "upload type10 data = ".concat(String.valueOf(sb2)));
                            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.a.a(new com.igexin.push.core.h.e(SDKUrlConfig.getBiUploadServiceUrl(), sb2.toString().getBytes()) { // from class: com.igexin.push.f.g.1.1
                                @Override // com.igexin.push.core.h.e, com.igexin.push.f.a.d
                                public final void a(byte[] bArr) throws Exception {
                                    super.a(bArr);
                                    com.igexin.push.core.c.a.a();
                                    ArrayList arrayList2 = arrayList;
                                    d.a.f37956a.f37950i.a(com.igexin.push.core.b.f37709af, new String[]{"id"}, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                                }
                            }), false, true);
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                }
            }
        });
    }

    public static /* synthetic */ String a(String str) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.igexin.push.core.e.A + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.igexin.push.core.e.f37998a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + 3 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + com.igexin.push.core.e.C + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ServiceManager.getInstance().initType.first;
    }

    @Override // com.igexin.push.f.b.c
    public final void b() {
        if (com.igexin.push.core.e.f38022ax != 0) {
            try {
                String format = this.f38589c.format(new Date(com.igexin.push.core.e.f38022ax));
                String format2 = this.f38589c.format(new Date());
                Date parse = this.f38589c.parse(format);
                Date parse2 = this.f38589c.parse(format2);
                com.igexin.c.a.c.a.b(f38588b, " lastDateString = " + format + " ; nowDateString = " + format2);
                if (parse2.after(parse)) {
                    d();
                }
            } catch (ParseException e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    @Override // com.igexin.push.f.b.c
    public final void a(long j11) {
    }
}
