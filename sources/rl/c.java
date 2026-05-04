package rl;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.lang.ref.WeakReference;
import sl.e;
import sl.f;
import tz.i0;
import tz.j0;
import tz.k0;
import tz.l0;
import tz.m0;
import tz.w;
import tz.y;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f84247a = false;

    public static void A(@Nullable ClipData clipData) {
        m0.a().b(clipData);
        m0.a().d(Boolean.FALSE);
    }

    public static void a(@NonNull Context context, @Nullable b bVar, Runnable runnable) {
        r(context, bVar);
        if (runnable != null) {
            runnable.run();
            m0.a().e(null);
        }
    }

    public static boolean b() {
        if (f84247a) {
            return true;
        }
        if (j0.f91313a) {
            j0.c("请先调用 init(Context) 初始化", new Object[0]);
        }
        return false;
    }

    public static boolean c(@NonNull Activity activity, @Nullable Intent intent) {
        Uri referrer;
        if (intent == null || TextUtils.isEmpty(intent.getAction()) || intent.getCategories() == null || !intent.getAction().equals("android.intent.action.MAIN") || !intent.getCategories().contains("android.intent.category.LAUNCHER") || (referrer = activity.getReferrer()) == null) {
            return false;
        }
        String host = referrer.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        boolean z11 = host.equalsIgnoreCase(i0.f91303n) || host.equalsIgnoreCase(i0.f91304o);
        if (host.equalsIgnoreCase(i0.f91305p) || host.equalsIgnoreCase(i0.f91306q) || host.equalsIgnoreCase(i0.f91307r)) {
            return true;
        }
        return z11;
    }

    public static boolean d(@Nullable Intent intent) {
        if (intent != null && intent.getData() != null && intent.getAction() != null) {
            Uri data = intent.getData();
            String action = intent.getAction();
            if (!TextUtils.isEmpty(data.getHost()) && action.equals(CommonConstant.ACTION.HWID_SCHEME_URL)) {
                for (String str : w.c().split("\\|")) {
                    if (data.getHost().endsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void e(boolean z11) {
        m0.a().d(Boolean.valueOf(z11));
    }

    public static void f(@NonNull sl.b bVar) {
        g(bVar, 10);
    }

    public static void g(@NonNull sl.b bVar, int i11) {
        if (!b()) {
            bVar.a(null, null);
            return;
        }
        if (j0.f91313a && i11 < 5) {
            j0.b("getInstall设置超时时间过小，易造成数据获取失败，请增大超时时间或调整调用时机", new Object[0]);
        }
        y.b().e(Boolean.FALSE, i11, bVar);
    }

    public static void h(@NonNull sl.c cVar, int i11) {
        if (b()) {
            y.b().e(Boolean.TRUE, i11, cVar);
        } else {
            cVar.a(null, new tl.a(-4, "未调用初始化"));
        }
    }

    @Deprecated
    public static void i(@NonNull f fVar) {
        if (b()) {
            y.b().i(fVar);
        } else {
            fVar.a(null);
        }
    }

    @NonNull
    public static String j() {
        return "2.6.3";
    }

    public static boolean k(@Nullable Intent intent, @NonNull e eVar) {
        if (!b() || !d(intent)) {
            return false;
        }
        y.b().c(intent, eVar);
        return true;
    }

    public static void l(@Nullable Intent intent, @NonNull e eVar) {
        if (!b()) {
            eVar.a(null, new tl.a(-8, "未初始化"));
        } else if (d(intent)) {
            y.b().c(intent, eVar);
        } else {
            eVar.a(null, new tl.a(-7, "data 不匹配"));
        }
    }

    public static boolean m(@NonNull Activity activity, @Nullable Intent intent, @NonNull e eVar) {
        if (!b()) {
            return false;
        }
        if (d(intent)) {
            y.b().c(intent, eVar);
            return true;
        }
        if (!c(activity, intent)) {
            return false;
        }
        y.b().h(eVar);
        return true;
    }

    public static void n(@NonNull Activity activity, @Nullable Intent intent, @NonNull e eVar) {
        if (!b()) {
            eVar.a(null, new tl.a(-8, "未初始化"));
            return;
        }
        if (d(intent)) {
            y.b().c(intent, eVar);
        } else if (c(activity, intent)) {
            y.b().h(eVar);
        } else {
            eVar.a(null, new tl.a(-7, "data 不匹配"));
        }
    }

    public static void o(@NonNull Context context) {
        r(context, b.a());
    }

    public static void p(@NonNull Context context, @NonNull String str) {
        q(context, str, b.a());
    }

    public static void q(@NonNull Context context, @NonNull String str, @Nullable b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (context == null) {
            throw new IllegalArgumentException("context不能为空");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("请前往OpenInstall控制台的 “Android集成” -> “Android应用配置” 中获取AppKey");
        }
        if (j0.f91313a) {
            j0.a("SDK Version : " + j(), new Object[0]);
        }
        m0.a().c(context.getApplicationContext());
        m0.a().f(str);
        m0.a().g(bVar);
        WeakReference weakReference = context instanceof Activity ? new WeakReference((Activity) context) : null;
        synchronized (c.class) {
            try {
                if (!f84247a) {
                    y.b().g(weakReference, currentTimeMillis);
                    f84247a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void r(@NonNull Context context, @Nullable b bVar) {
        String b11 = k0.b(context);
        if (TextUtils.isEmpty(b11)) {
            throw new IllegalArgumentException("请在AndroidManifest.xml中配置OpenInstall提供的AppKey");
        }
        q(context, b11, bVar);
    }

    @Deprecated
    public static void s(@NonNull Activity activity, @Nullable b bVar) {
        t(activity, bVar, null);
    }

    @Deprecated
    public static void t(@NonNull Activity activity, @Nullable b bVar, @NonNull Runnable runnable) {
        if (j0.f91313a) {
            j0.b("initWithPermission 方法在后续版本中将被移除，请自行进行权限申请", new Object[0]);
        }
        if (l0.b(activity)) {
            a(activity.getApplicationContext(), bVar, runnable);
            return;
        }
        l0.a(activity, new String[]{"android.permission.READ_PHONE_STATE"}, 987);
        m0.a().c(activity.getApplicationContext());
        m0.a().e(runnable);
        m0.a().g(bVar);
    }

    public static void u(int i11, String[] strArr, int[] iArr) {
        Context h11 = m0.a().h();
        b l11 = m0.a().l();
        Runnable q11 = m0.a().q();
        if (h11 == null || i11 != 987) {
            return;
        }
        a(h11, l11, q11);
    }

    public static void v(@NonNull String str, long j11) {
        if (b()) {
            y.b().f(str, j11);
        }
    }

    public static void w() {
        if (b()) {
            y.b().j();
        }
    }

    public static void x(boolean z11) {
        m0.a().i(Boolean.valueOf(z11));
    }

    public static void y(boolean z11) {
        j0.f91313a = z11;
    }

    @Deprecated
    public static void z(boolean z11) {
        if (j0.f91313a) {
            j0.b("setEncrypt(boolean encrypt)接口已移除", new Object[0]);
        }
        m0.a().k(Boolean.valueOf(z11));
    }
}
