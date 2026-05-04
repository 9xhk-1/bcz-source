package l00;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h f69113a = new h();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f69114b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public static a f69115c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        @w00.g
        public final Method f69116a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        @w00.g
        public final Method f69117b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        @w00.g
        public final Method f69118c;

        public a(@m80.l Method method, @m80.l Method method2, @m80.l Method method3) {
            this.f69116a = method;
            this.f69117b = method2;
            this.f69118c = method3;
        }
    }

    public final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f69115c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f69114b;
            f69115c = aVar2;
            return aVar2;
        }
    }

    @m80.l
    public final String b(@m80.k BaseContinuationImpl continuation) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        g0.p(continuation, "continuation");
        a aVar = f69115c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar != f69114b && (method = aVar.f69116a) != null && (invoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVar.f69117b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = aVar.f69118c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                return (String) invoke3;
            }
        }
        return null;
    }
}
