package kotlinx.coroutines.flow;

import a00.a0;
import h40.x0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
/* loaded from: classes8.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x0 f68347a = new x0("NONE");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x0 f68348b = new x0("PENDING");

    @m80.k
    public static final <T> y<T> a(T t11) {
        if (t11 == null) {
            t11 = (T) kotlinx.coroutines.flow.internal.s.f68282a;
        }
        return new n0(t11);
    }

    @m80.k
    public static final <T> i<T> d(@m80.k m0<? extends T> m0Var, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? e0.e(m0Var, dVar, i11, bufferOverflow) : m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@m80.k y<T> yVar, @m80.k x00.l<? super T, ? extends T> lVar) {
        ?? r02;
        do {
            r02 = (Object) yVar.getValue();
        } while (!yVar.b(r02, lVar.invoke(r02)));
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void f(@m80.k y<T> yVar, @m80.k x00.l<? super T, ? extends T> lVar) {
        a0.e eVar;
        do {
            eVar = (Object) yVar.getValue();
        } while (!yVar.b(eVar, lVar.invoke(eVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T g(@m80.k y<T> yVar, @m80.k x00.l<? super T, ? extends T> lVar) {
        a0.e eVar;
        T invoke;
        do {
            eVar = (Object) yVar.getValue();
            invoke = lVar.invoke(eVar);
        } while (!yVar.b(eVar, invoke));
        return invoke;
    }
}
