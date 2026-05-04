package com.meizu.cloud.pushsdk.b.b;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Constructor;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f39376a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?>[] f39377b;

    public b(a aVar, Class<?>... clsArr) {
        this.f39376a = aVar;
        this.f39377b = clsArr;
    }

    public <T> d<T> a(Object... objArr) {
        d<T> dVar = new d<>();
        try {
            Constructor<?> declaredConstructor = this.f39376a.a().getDeclaredConstructor(this.f39377b);
            declaredConstructor.setAccessible(true);
            dVar.f39383b = (T) declaredConstructor.newInstance(objArr);
            dVar.f39382a = true;
            return dVar;
        } catch (Exception e11) {
            DebugLogger.e("ReflectConstructor", "newInstance", e11);
            return dVar;
        }
    }
}
