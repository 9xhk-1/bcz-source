package kotlinx.coroutines.android;

import android.os.Build;
import c40.n0;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.a;
import kotlin.coroutines.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class AndroidExceptionPreHandler extends a implements n0 {

    @l
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(n0.f7891d0);
        this._preHandler = this;
    }

    @Override // c40.n0
    public void handleException(@k d dVar, @k Throwable th2) {
        int i11 = Build.VERSION.SDK_INT;
        if (26 > i11 || i11 >= 28) {
            return;
        }
        Method q11 = q();
        Object invoke = q11 != null ? q11.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
    }

    public final Method q() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }
}
