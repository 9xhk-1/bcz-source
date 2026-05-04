package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.g.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f35626i = "c";

    /* renamed from: j, reason: collision with root package name */
    private static final ExecutorService f35627j = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");

    /* renamed from: k, reason: collision with root package name */
    private static long f35628k = 0;

    /* renamed from: a, reason: collision with root package name */
    private GrsBaseInfo f35629a;

    /* renamed from: b, reason: collision with root package name */
    private Context f35630b;

    /* renamed from: c, reason: collision with root package name */
    private g f35631c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f35632d;

    /* renamed from: e, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f35633e;

    /* renamed from: f, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f35634f;

    /* renamed from: g, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.a f35635g;

    /* renamed from: h, reason: collision with root package name */
    private FutureTask<Boolean> f35636h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35637a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GrsBaseInfo f35638b;

        public a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f35637a = context;
            this.f35638b = grsBaseInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            c.this.f35631c = new g();
            c.this.f35633e = new com.huawei.hms.framework.network.grs.e.c(this.f35637a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_conf_");
            c.this.f35634f = new com.huawei.hms.framework.network.grs.e.c(this.f35637a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_services_");
            c cVar = c.this;
            cVar.f35632d = new com.huawei.hms.framework.network.grs.e.a(cVar.f35633e, c.this.f35634f, c.this.f35631c);
            c cVar2 = c.this;
            cVar2.f35635g = new com.huawei.hms.framework.network.grs.a(cVar2.f35629a, c.this.f35632d, c.this.f35631c, c.this.f35634f);
            if (com.huawei.hms.framework.network.grs.f.b.a(this.f35637a.getPackageName()) == null) {
                new com.huawei.hms.framework.network.grs.f.b(this.f35637a, true);
            }
            String c11 = new com.huawei.hms.framework.network.grs.g.j.c(this.f35638b, this.f35637a).c();
            Logger.v(c.f35626i, "scan serviceSet is: " + c11);
            String a11 = c.this.f35634f.a("services", "");
            String a12 = h.a(a11, c11);
            if (!TextUtils.isEmpty(a12)) {
                c.this.f35634f.b("services", a12);
                Logger.i(c.f35626i, "postList is:" + StringUtils.anonymizeMessage(a12));
                Logger.i(c.f35626i, "currentServices:" + StringUtils.anonymizeMessage(a11));
                if (!a12.equals(a11)) {
                    c.this.f35631c.a(c.this.f35629a.getGrsParasKey(true, true, this.f35637a));
                    c.this.f35631c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f35638b, this.f35637a), null, null, c.this.f35634f, c.this.f35629a.getQueryTimeout());
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - c.f35628k;
            if (c.f35628k == 0 || TimeUnit.MILLISECONDS.toHours(elapsedRealtime) > 24) {
                Logger.i(c.f35626i, "Try to clear unUsed sp data.");
                long unused = c.f35628k = SystemClock.elapsedRealtime();
                c cVar3 = c.this;
                cVar3.a(cVar3.f35633e.a());
            }
            c.this.f35632d.b(this.f35638b, this.f35637a);
            return Boolean.TRUE;
        }
    }

    public c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f35636h = null;
        this.f35630b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f35629a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.f35630b, grsBaseInfo2));
        this.f35636h = futureTask;
        f35627j.execute(futureTask);
        Logger.i(f35626i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d", com.huawei.hms.framework.network.grs.h.a.a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry(), Integer.valueOf(grsBaseInfo.getQueryTimeout()));
    }

    public c(GrsBaseInfo grsBaseInfo) {
        this.f35636h = null;
        a(grsBaseInfo);
    }

    private boolean e() {
        String str;
        String str2;
        FutureTask<Boolean> futureTask = this.f35636h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e11) {
            e = e11;
            str = f35626i;
            str2 = "init compute task interrupted.";
            Logger.w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(f35626i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e12) {
            e = e12;
            str = f35626i;
            str2 = "init compute task failed.";
            Logger.w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(f35626i, "init compute task timed out");
            return false;
        } catch (Exception e13) {
            e = e13;
            str = f35626i;
            str2 = "init compute task occur unknown Exception";
            Logger.w(str, str2, e);
            return false;
        }
    }

    public boolean b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!e() || (grsBaseInfo = this.f35629a) == null || (context = this.f35630b) == null) {
            return false;
        }
        this.f35632d.a(grsBaseInfo, context);
        return true;
    }

    private boolean b(long j11) {
        return System.currentTimeMillis() - j11 <= 604800000;
    }

    public String a(String str, String str2, int i11) {
        if (this.f35629a == null || str == null || str2 == null) {
            Logger.w(f35626i, "invalid para!");
            return null;
        }
        if (e()) {
            return this.f35635g.a(str, str2, this.f35630b, i11);
        }
        return null;
    }

    public Map<String, String> a(String str, int i11) {
        if (this.f35629a != null && str != null) {
            return e() ? this.f35635g.a(str, this.f35630b, i11) : new HashMap();
        }
        Logger.w(f35626i, "invalid para!");
        return new HashMap();
    }

    public void a() {
        if (e()) {
            String grsParasKey = this.f35629a.getGrsParasKey(true, true, this.f35630b);
            this.f35633e.a(grsParasKey);
            this.f35633e.a(grsParasKey + "time");
            this.f35633e.a(grsParasKey + "ETag");
            this.f35631c.a(grsParasKey);
        }
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f35629a = grsBaseInfo.m5634clone();
        } catch (CloneNotSupportedException e11) {
            Logger.w(f35626i, "GrsClient catch CloneNotSupportedException", e11);
            this.f35629a = grsBaseInfo.copy();
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, int i11) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(f35626i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f35629a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.f35635g.a(str, iQueryUrlsCallBack, this.f35630b, i11);
        } else {
            Logger.i(f35626i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, int i11) {
        if (iQueryUrlCallBack == null) {
            Logger.w(f35626i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f35629a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.f35635g.a(str, str2, iQueryUrlCallBack, this.f35630b, i11);
        } else {
            Logger.i(f35626i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.v(f35626i, "sp's content is empty.");
            return;
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            if (str.endsWith(this.f35630b.getPackageName() + "time")) {
                String a11 = this.f35633e.a(str, "");
                long j11 = 0;
                if (!TextUtils.isEmpty(a11) && a11.matches("\\d+")) {
                    try {
                        j11 = Long.parseLong(a11);
                    } catch (NumberFormatException e11) {
                        Logger.w(f35626i, "convert expire time from String to Long catch NumberFormatException.", e11);
                    }
                }
                String substring = str.substring(0, str.length() - 4);
                String str2 = substring + "ETag";
                if (!b(j11) || !keySet.contains(substring) || !keySet.contains(str2)) {
                    Logger.i(f35626i, "init interface auto clear some invalid sp's data: " + str);
                    this.f35633e.a(substring);
                    this.f35633e.a(str);
                    this.f35633e.a(str2);
                }
            }
        }
    }

    public boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass() && (obj instanceof c)) {
            return this.f35629a.compare(((c) obj).f35629a);
        }
        return false;
    }
}
