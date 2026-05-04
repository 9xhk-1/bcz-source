package tz;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final CountDownLatch f91270a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public static String f91271b;

    /* renamed from: c, reason: collision with root package name */
    public static Object f91272c;

    public static class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("onInstallReferrerSetupFinished".equalsIgnoreCase(method.getName())) {
                try {
                    int intValue = ((Integer) objArr[0]).intValue();
                    if (j0.f91313a) {
                        j0.a("StateListenerHandler : onInstallReferrerSetupFinished code=" + intValue, new Object[0]);
                    }
                    if (intValue == 0) {
                        Class<?> cls = Class.forName("com.android.installreferrer.api.InstallReferrerClient");
                        String unused = g.f91271b = (String) Class.forName("com.android.installreferrer.api.ReferrerDetails").getDeclaredMethod("getInstallReferrer", null).invoke(cls.getDeclaredMethod("getInstallReferrer", null).invoke(g.f91272c, null), null);
                        cls.getDeclaredMethod("endConnection", null).invoke(g.f91272c, null);
                    }
                } catch (Exception unused2) {
                    if (j0.f91313a) {
                        j0.a("InstallReferrerClient getInstallReferrer failed", new Object[0]);
                    }
                }
                g.f91270a.countDown();
            } else if ("onInstallReferrerServiceDisconnected".equalsIgnoreCase(method.getName())) {
                if (j0.f91313a) {
                    j0.a("StateListenerHandler : InstallReferrerService Disconnected", new Object[0]);
                }
            } else if (j0.f91313a) {
                j0.a("StateListenerHandler : no such method : " + method.getName(), new Object[0]);
            }
            return null;
        }
    }

    public String a() {
        try {
            f91270a.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        if (j0.f91313a) {
            j0.a("PlayInstallReferrer getReferrer : %s", f91271b);
        }
        return f91271b;
    }

    public void c(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            f91272c = Class.forName("com.android.installreferrer.api.InstallReferrerClient$Builder").getDeclaredMethod("build", null).invoke(cls.getDeclaredMethod("newBuilder", Context.class).invoke(null, context), null);
            Class<?> cls2 = Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
            cls.getDeclaredMethod("startConnection", cls2).invoke(f91272c, Proxy.newProxyInstance(context.getClassLoader(), new Class[]{cls2}, new a()));
        } catch (Exception unused) {
            f91270a.countDown();
            if (j0.f91313a) {
                j0.b("InstallReferrerClient Connection Failed", new Object[0]);
            }
        }
    }
}
