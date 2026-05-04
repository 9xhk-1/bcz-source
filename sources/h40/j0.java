package h40;

import c40.g2;
import c40.v2;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f58233a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f58234b = false;

    public static final k0 a(Throwable th2, String str) {
        if (th2 != null) {
            throw th2;
        }
        e();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ k0 b(Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    @g2
    public static final boolean d(@m80.k v2 v2Var) {
        return v2Var.q() instanceof k0;
    }

    @m80.k
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @g2
    @m80.k
    public static final v2 f(@m80.k h0 h0Var, @m80.k List<? extends h0> list) {
        try {
            return h0Var.c(list);
        } catch (Throwable th2) {
            return a(th2, h0Var.b());
        }
    }

    public static /* synthetic */ void c() {
    }
}
