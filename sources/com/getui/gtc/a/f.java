package com.getui.gtc.a;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.u.n;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.e.c;
import com.heytap.mcssdk.constant.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private String f29754a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29755b = false;

    /* renamed from: c, reason: collision with root package name */
    private long f29756c = 86400000;

    /* renamed from: d, reason: collision with root package name */
    private String[] f29757d = {"com.huawei.appmarket", "com.bbk.launcher2", "net.oneplus.launcher", "com.android.deskclock", "com.heytap.market", "com.oppo.market"};

    /* renamed from: e, reason: collision with root package name */
    private String[] f29758e = {"com.tencent.mm", "com.tencent.mobileqq", n.f11112b, "com.jingdong.app.mall", "com.ss.android.article.news", "com.taobao.taobao", "com.tmall.wireless", "com.sankuai.meituan", "com.xunmeng.pinduoduo", "com.ss.android.ugc.aweme"};

    private String a() {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (String str : this.f29757d) {
                try {
                    sb2.append(str + "#,");
                } catch (Throwable unused) {
                    com.getui.gtc.i.c.a.b(str + " not found");
                }
            }
            if (sb2.toString().endsWith(",")) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.b(th2);
            return "";
        }
    }

    @TargetApi(26)
    private String b() {
        File parentFile;
        Path path;
        BasicFileAttributes readAttributes;
        FileTime creationTime;
        long millis;
        FileTime lastAccessTime;
        long millis2;
        File parentFile2;
        if (Build.VERSION.SDK_INT < 26) {
            com.getui.gtc.i.c.a.a("type304 get hot info failed, api<26");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            File externalCacheDir = GtcProvider.context().getExternalCacheDir();
            parentFile = (externalCacheDir == null || (parentFile2 = externalCacheDir.getParentFile()) == null) ? null : parentFile2.getParentFile();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.b(th2);
        }
        if (parentFile == null) {
            return "";
        }
        for (String str : this.f29758e) {
            try {
                path = new File(parentFile, str).toPath();
                readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) h.a(), new LinkOption[0]);
                creationTime = readAttributes.creationTime();
                millis = creationTime.toMillis();
                lastAccessTime = readAttributes.lastAccessTime();
                millis2 = lastAccessTime.toMillis();
                sb2.append(str + "#0#" + millis + "#" + millis2);
                sb2.append(",");
            } catch (Throwable th3) {
                com.getui.gtc.i.c.a.b(th3);
            }
        }
        if (sb2.toString().endsWith(",")) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.getui.gtc.e.c cVar;
        com.getui.gtc.e.c cVar2;
        String str;
        try {
            Map<String, String> a11 = com.getui.gtc.f.c.a(Constants.MILLS_OF_LAUNCH_INTERVAL, (com.getui.gtc.f.e) null);
            if (a11 != null && a11.size() > 0) {
                try {
                    String str2 = a11.get("sdk.gtc.type304.enable");
                    if (str2 != null) {
                        this.f29755b = Boolean.parseBoolean(str2);
                    }
                } catch (Exception e11) {
                    com.getui.gtc.i.c.a.b(e11);
                }
                try {
                    String str3 = a11.get("sdk.gtc.type304.interval");
                    if (str3 != null) {
                        this.f29756c = Long.parseLong(str3) * 1000;
                    }
                } catch (Exception e12) {
                    com.getui.gtc.i.c.a.b(e12);
                }
                try {
                    String str4 = a11.get("sdk.gtc.type304.sys_al");
                    if (!TextUtils.isEmpty(str4) && !"none".equalsIgnoreCase(str4)) {
                        String[] split = str4.split(",");
                        if (split.length > 0) {
                            this.f29757d = split;
                            com.getui.gtc.i.c.a.a("type304 dyc sysApp:" + Arrays.toString(split));
                        }
                    }
                } catch (Exception e13) {
                    com.getui.gtc.i.c.a.b(e13);
                }
                try {
                    String str5 = a11.get("sdk.gtc.type304.hot_al");
                    if (!TextUtils.isEmpty(str5) && !"none".equalsIgnoreCase(str5)) {
                        String[] split2 = str5.split(",");
                        if (split2.length > 0) {
                            this.f29758e = split2;
                            com.getui.gtc.i.c.a.a("type304 dyc hotApp:" + Arrays.toString(split2));
                        }
                    }
                } catch (Exception e14) {
                    com.getui.gtc.i.c.a.b(e14);
                }
            }
            if (!this.f29755b) {
                str = "type 304 is not enabled";
            } else {
                if (!CommonUtil.isAppDebugEnable()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    cVar = c.a.f30027a;
                    if (currentTimeMillis - cVar.f30024a.f30039l < this.f29756c) {
                        return;
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                    String str6 = a.a(simpleDateFormat.format(new Date())) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a.a(com.getui.gtc.c.b.f29827d) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a.a(com.getui.gtc.c.b.f29824a) + "|android|" + GtcProvider.context().getPackageName() + "|GTC-3.2.16.0|" + a() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + b();
                    this.f29754a = str6;
                    try {
                        com.getui.gtc.h.a.a(str6, 304);
                        cVar2 = c.a.f30027a;
                        com.getui.gtc.e.d dVar = cVar2.f30024a;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (dVar.a(16, currentTimeMillis2)) {
                            dVar.f30039l = currentTimeMillis2;
                            return;
                        }
                        return;
                    } catch (Exception e15) {
                        com.getui.gtc.i.c.a.c("type 304 report error: " + e15.toString());
                        return;
                    }
                }
                str = "type 304 is debug, disallow";
            }
            com.getui.gtc.i.c.a.b(str);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.a("type 304", th2);
        }
    }
}
