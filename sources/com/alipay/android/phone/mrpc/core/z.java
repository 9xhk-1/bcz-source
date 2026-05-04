package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Object> f10341a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object>> f10342b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    public byte f10343c = 0;

    /* renamed from: d, reason: collision with root package name */
    public AtomicInteger f10344d = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public x f10345e;

    public z(x xVar) {
        this.f10345e = xVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z11 = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        ThreadLocal<Object> threadLocal = f10341a;
        threadLocal.set(null);
        ThreadLocal<Map<String, Object>> threadLocal2 = f10342b;
        threadLocal2.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        int incrementAndGet = this.f10344d.incrementAndGet();
        try {
            if (this.f10343c == 0) {
                com.alipay.android.phone.mrpc.core.a.e eVar = new com.alipay.android.phone.mrpc.core.a.e(incrementAndGet, value, objArr);
                if (threadLocal2.get() != null) {
                    eVar.a(threadLocal2.get());
                }
                byte[] bArr = (byte[]) new j(this.f10345e.a(), method, incrementAndGet, value, eVar.a(), z11).a();
                threadLocal2.set(null);
                Object a11 = new com.alipay.android.phone.mrpc.core.a.d(genericReturnType, bArr).a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(a11);
                }
            }
            return threadLocal.get();
        } catch (RpcException e11) {
            e11.setOperationType(value);
            throw e11;
        }
    }
}
