package tz;

import android.content.Context;
import android.text.TextUtils;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IdSupplier;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedBlockingQueue f91314b = new LinkedBlockingQueue();

    /* renamed from: a, reason: collision with root package name */
    public String f91315a = null;

    public static class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object invoke;
            String str = "NULL";
            try {
            } catch (Exception e11) {
                if (j0.f91313a) {
                    j0.b("IdSupplier getOAID failed : %s", e11.toString());
                }
            }
            if (!"OnSupport".equals(method.getName())) {
                if ("onSupport".equals(method.getName())) {
                    Object invoke2 = IdSupplier.class.getDeclaredMethod("isSupported", null).invoke(objArr[0], null);
                    if (invoke2 != null && Boolean.parseBoolean(invoke2.toString())) {
                        invoke = IdSupplier.class.getDeclaredMethod("getOAID", null).invoke(objArr[0], null);
                    } else if (j0.f91313a) {
                        j0.b("IdSupplier isSupport = false", new Object[0]);
                    }
                } else {
                    if (j0.f91313a) {
                        j0.b("IIdentifierListener invoke %s", method.getName());
                    }
                    str = null;
                }
                k.f91314b.offer(str);
                return null;
            }
            Object obj2 = objArr[0];
            if (!(obj2 != null ? Boolean.parseBoolean(String.valueOf(obj2)) : false)) {
                if (j0.f91313a) {
                    j0.b("IdSupplier isSupport = false", new Object[0]);
                }
                k.f91314b.offer(str);
                return null;
            }
            invoke = IdSupplier.class.getDeclaredMethod("getOAID", null).invoke(objArr[1], null);
            str = (String) invoke;
            k.f91314b.offer(str);
            return null;
        }
    }

    public String a() {
        return this.f91315a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public void b(Context context) {
        try {
            try {
                Class.forName("com.bun.miitmdid.core.JLibrary").getDeclaredMethod("InitEntry", Context.class).invoke(null, context);
            } catch (Exception e11) {
                if (j0.f91313a) {
                    j0.b("MdidSdkHelper InitSdk failed : %s", e11.toString());
                    return;
                }
                return;
            }
        } catch (ClassNotFoundException unused) {
        }
        Object newProxyInstance = Proxy.newProxyInstance(context.getClassLoader(), new Class[]{IIdentifierListener.class}, new a());
        Method declaredMethod = Class.forName("com.bun.miitmdid.core.MdidSdkHelper").getDeclaredMethod("InitSdk", Context.class, Boolean.TYPE, IIdentifierListener.class);
        String str = null;
        for (int i11 = 0; TextUtils.isEmpty(str) && i11 < 3; i11++) {
            Integer num = (Integer) declaredMethod.invoke(null, context, Boolean.TRUE, newProxyInstance);
            if (j0.f91313a) {
                j0.a("MdidSdkHelper InitSdk return value：" + num, new Object[0]);
            }
            str = (String) f91314b.poll(500L, TimeUnit.MILLISECONDS);
            if ("NULL".equals(str)) {
                return;
            }
            this.f91315a = str;
        }
    }
}
