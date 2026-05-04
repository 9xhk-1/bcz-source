package uf;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.ChannelUtils;
import com.baicizhan.client.business.util.Md5Utils;
import com.tencent.bugly.crashreport.CrashReport;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import q9.x;
import xb.f;
import xb.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f92186a = "CrashIniter";

    /* renamed from: b, reason: collision with root package name */
    public static final String f92187b = "04e1e30a0f";

    /* renamed from: c, reason: collision with root package name */
    public static final String f92188c = "userid";

    /* renamed from: d, reason: collision with root package name */
    public static final String f92189d = "crash_id";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f92190a;

        public a(final Context val$applicationContext) {
            this.f92190a = val$applicationContext;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            b.f(this.f92190a);
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: uf.b$b, reason: collision with other inner class name */
    public class C1238b extends CrashReport.CrashHandleCallback {
        @Override // com.tencent.bugly.BuglyStrategy.a
        public synchronized Map<String, String> onCrashHandleStart(int var1, String var2, String var3, String var4) {
            LinkedHashMap linkedHashMap;
            try {
                linkedHashMap = new LinkedHashMap();
                String c11 = b.c();
                oa.a.g().j(c11);
                UserRecord p11 = x.r().p();
                linkedHashMap.put(b.f92188c, p11 == null ? "NULL" : String.valueOf(p11.getUniqueId()));
                linkedHashMap.put(b.f92189d, c11);
                qb.c.i(b.f92186a, "crash occur crash [crashType, errorType, id] [%d, %s, %s]", Integer.valueOf(var1), var2, c11);
            } catch (Throwable th2) {
                throw th2;
            }
            return linkedHashMap;
        }
    }

    public static String c() {
        return Md5Utils.getStringMD5(o.a(pb.a.a()) + String.valueOf(System.currentTimeMillis()));
    }

    public static void d(final Context applicationContext) {
        if (e(applicationContext)) {
            rx.c.z2(new a(applicationContext)).w5(bc0.c.a()).p5();
        }
    }

    public static boolean e(Context context) {
        if (!"download".equals(ChannelUtils.getChannel(context))) {
            return false;
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        String str = "";
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return (str.contains(":pushservice") || str.contains(":xg_service")) ? false : true;
    }

    public static void f(Context applicationContext) {
        qb.c.i(f92186a, "init crash report", new Object[0]);
        String e11 = f.e(applicationContext);
        String packageName = applicationContext.getPackageName();
        CrashReport.UserStrategy userStrategy = new CrashReport.UserStrategy(applicationContext);
        userStrategy.setAppChannel(ChannelUtils.getChannel(applicationContext));
        userStrategy.setAppVersion(o.f(applicationContext) + "_" + String.valueOf(o.g(applicationContext)));
        userStrategy.setAppPackageName(packageName);
        userStrategy.setUploadProcess(e11 == null || e11.equals(packageName));
        userStrategy.setCrashHandleCallback((CrashReport.CrashHandleCallback) new C1238b());
        CrashReport.initCrashReport(applicationContext, f92187b, false, userStrategy);
        CrashReport.setUserId("unLogin");
    }

    public static void g(String userId) {
        CrashReport.setUserId(userId);
    }
}
