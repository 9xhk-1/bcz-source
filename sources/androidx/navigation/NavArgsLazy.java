package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import h10.d;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavArgsLazy<Args extends NavArgs> implements c0<Args> {

    @k
    private final x00.a<Bundle> argumentProducer;

    @l
    private Args cached;

    @k
    private final d<Args> navArgsClass;

    public NavArgsLazy(@k d<Args> navArgsClass, @k x00.a<Bundle> argumentProducer) {
        g0.p(navArgsClass, "navArgsClass");
        g0.p(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // yz.c0
    @k
    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle invoke = this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class d11 = w00.b.d(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = d11.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            g0.o(method, "navArgsClass.java.getMet…                        }");
        }
        Object invoke2 = method.invoke(null, invoke);
        g0.n(invoke2, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) invoke2;
        this.cached = args2;
        return args2;
    }
}
