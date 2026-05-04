package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public abstract class c<T extends BasicPushStatus> {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f39957a;

    /* renamed from: b, reason: collision with root package name */
    protected String f39958b;

    /* renamed from: c, reason: collision with root package name */
    protected String f39959c;

    /* renamed from: d, reason: collision with root package name */
    protected String f39960d;

    /* renamed from: e, reason: collision with root package name */
    protected final com.meizu.cloud.pushsdk.platform.a.a f39961e;

    /* renamed from: h, reason: collision with root package name */
    private ScheduledExecutorService f39964h;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f39962f = true;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f39963g = true;

    /* renamed from: i, reason: collision with root package name */
    private String f39965i = null;

    public c(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.f39964h = scheduledExecutorService;
        this.f39957a = context;
        this.f39958b = str;
        this.f39959c = str2;
        this.f39961e = aVar;
    }

    private boolean h() {
        return this.f39963g && !this.f39957a.getPackageName().equals(this.f39965i);
    }

    public String a(Context context, String str) {
        String str2 = null;
        if (!TextUtils.isEmpty(str)) {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(str), 0);
            if (queryIntentServices != null) {
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (PushConstants.PUSH_PACKAGE_NAME.equals(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        this.f39965i = serviceInfo.packageName;
                        str2 = serviceInfo.name;
                        break;
                    }
                }
                if (TextUtils.isEmpty(str2) && queryIntentServices.size() > 0) {
                    this.f39965i = queryIntentServices.get(0).serviceInfo.packageName;
                    str2 = queryIntentServices.get(0).serviceInfo.name;
                }
            }
        }
        DebugLogger.i("Strategy", "current process packageName " + this.f39965i);
        return str2;
    }

    public abstract void a(T t11);

    public abstract boolean a();

    public abstract T b();

    public void b(String str) {
        this.f39958b = str;
    }

    public abstract Intent c();

    public void c(String str) {
        this.f39959c = str;
    }

    public void d(String str) {
        this.f39960d = str;
    }

    public abstract T e();

    public abstract T f();

    public abstract int g();

    public boolean k() {
        return this.f39963g && this.f39962f && !TextUtils.isEmpty(a(this.f39957a, PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION));
    }

    public boolean l() {
        return 2 == g() || 32 == g();
    }

    public boolean m() {
        ScheduledExecutorService scheduledExecutorService = this.f39964h;
        if (scheduledExecutorService == null) {
            return n();
        }
        scheduledExecutorService.execute(new Runnable() { // from class: com.meizu.cloud.pushsdk.platform.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.n();
            }
        });
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x011d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.b.c.n():boolean");
    }

    private boolean b(T t11) {
        int intValue = Integer.valueOf(t11.getCode()).intValue();
        if (intValue <= 200 || intValue >= 600) {
            return (intValue > 1000 && intValue < 2000) || intValue == 0;
        }
        return true;
    }

    public void a(Intent intent) {
        try {
            intent.setPackage(this.f39965i);
            intent.setAction(PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION);
            this.f39957a.startService(intent);
        } catch (Exception e11) {
            DebugLogger.e("Strategy", "start RemoteService error " + e11.getMessage());
        }
    }

    public Intent[] d() {
        return null;
    }

    public void a(boolean z11) {
        this.f39962f = z11;
    }

    private boolean a(int i11) {
        return i11 >= 110000 && i11 <= 200000;
    }
}
