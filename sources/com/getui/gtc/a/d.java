package com.getui.gtc.a;

import android.text.TextUtils;
import com.getui.gtc.e.c;
import com.getui.gtc.i.d.b;
import com.heytap.mcssdk.constant.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private String f29748a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29749b = true;

    /* renamed from: c, reason: collision with root package name */
    private long f29750c = 10000;

    @Override // java.lang.Runnable
    public final void run() {
        com.getui.gtc.e.c cVar;
        com.getui.gtc.e.c cVar2;
        com.getui.gtc.e.c cVar3;
        com.getui.gtc.e.c cVar4;
        com.getui.gtc.e.c cVar5;
        com.getui.gtc.e.c cVar6;
        com.getui.gtc.e.c cVar7;
        com.getui.gtc.i.d.b unused;
        Map<String, String> a11 = com.getui.gtc.f.c.a(Constants.MILLS_OF_LAUNCH_INTERVAL, (com.getui.gtc.f.e) null);
        if (a11 != null && a11.size() > 0) {
            try {
                if (a11.containsKey("sdk.gtc.type301.enable")) {
                    this.f29749b = Boolean.parseBoolean(a11.get("sdk.gtc.type301.enable"));
                }
            } catch (Exception e11) {
                com.getui.gtc.i.c.a.b(e11);
            }
            try {
                if (a11.containsKey("sdk.gtc.type301.interval")) {
                    this.f29750c = Long.parseLong(a11.get("sdk.gtc.type301.interval")) * 1000;
                }
            } catch (Exception e12) {
                com.getui.gtc.i.c.a.b(e12);
            }
        }
        if (!this.f29749b) {
            com.getui.gtc.i.c.a.b("type 301 is not enabled");
            return;
        }
        cVar = c.a.f30027a;
        String str = cVar.f30024a.f30028a;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split("\n");
                if (System.currentTimeMillis() - new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).parse(split[0].split("\\|")[0]).getTime() <= 604800000) {
                    if (split.length > 300) {
                    }
                }
                cVar2 = c.a.f30027a;
                cVar2.f30024a.d("");
                com.getui.gtc.i.c.a.a("type 301 clean stored samples");
            } catch (Exception e13) {
                com.getui.gtc.i.c.a.b("type 301 clean samples error: " + e13.toString());
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.a(simpleDateFormat.format(new Date())));
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(a.a(com.getui.gtc.c.b.f29827d));
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(a.a(com.getui.gtc.c.b.f29824a));
        sb2.append("|android|");
        unused = b.C0360b.f30118a;
        Calendar calendar = Calendar.getInstance();
        double d11 = (calendar.get(15) + calendar.get(16)) / 3600000.0d;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        sb2.append(a.a(numberInstance.format(d11)));
        String sb3 = sb2.toString();
        cVar3 = c.a.f30027a;
        com.getui.gtc.e.d dVar = cVar3.f30024a;
        if (!TextUtils.isEmpty(sb3)) {
            if (!TextUtils.isEmpty(dVar.f30028a)) {
                sb3 = dVar.f30028a + "\n" + sb3;
            }
            if (dVar.a(7, sb3)) {
                dVar.f30028a = sb3;
            }
        }
        cVar4 = c.a.f30027a;
        this.f29748a = cVar4.f30024a.f30028a;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            cVar5 = c.a.f30027a;
            if (currentTimeMillis - cVar5.f30024a.f30030c < this.f29750c) {
                return;
            }
            com.getui.gtc.h.a.a(this.f29748a, 301);
            cVar6 = c.a.f30027a;
            com.getui.gtc.e.d dVar2 = cVar6.f30024a;
            if (dVar2.a(6, currentTimeMillis)) {
                dVar2.f30030c = currentTimeMillis;
            }
            cVar7 = c.a.f30027a;
            cVar7.f30024a.d("");
        } catch (Exception e14) {
            com.getui.gtc.i.c.a.c("type 301 report error: " + e14.toString());
        }
    }
}
