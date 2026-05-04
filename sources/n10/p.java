package n10;

import a00.i0;
import androidx.exifinterface.media.ExifInterface;
import e30.a2;
import e30.c1;
import e30.r0;
import e30.r1;
import e30.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.x0;
import s10.g0;
import s10.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nsuspendFunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 suspendFunctionTypes.kt\norg/jetbrains/kotlin/builtins/SuspendFunctionTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1557#2:66\n1628#2,3:67\n1#3:70\n*S KotlinDebug\n*F\n+ 1 suspendFunctionTypes.kt\norg/jetbrains/kotlin/builtins/SuspendFunctionTypesKt\n*L\n54#1:66\n54#1:67,3\n*E\n"})
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final g0 f74081a;

    static {
        s10.p pVar = new s10.p(g30.i.f52687a.i(), o.f74021s);
        ClassKind classKind = ClassKind.INTERFACE;
        n20.f g11 = o.f74024v.g();
        x0 x0Var = x0.f78622a;
        d30.n nVar = d30.f.f47125e;
        g0 g0Var = new g0(pVar, classKind, false, false, g11, x0Var, nVar);
        g0Var.H0(Modality.ABSTRACT);
        g0Var.J0(p10.o.f78590e);
        g0Var.I0(a00.g0.l(t0.M0(g0Var, q10.g.A0.b(), false, Variance.IN_VARIANCE, n20.f.f(ExifInterface.GPS_DIRECTION_TRUE), 0, nVar)));
        g0Var.F0();
        f74081a = g0Var;
    }

    @m80.k
    public static final c1 a(@m80.k r0 suspendFunType) {
        c1 b11;
        kotlin.jvm.internal.g0.p(suspendFunType, "suspendFunType");
        i.r(suspendFunType);
        j o11 = j30.e.o(suspendFunType);
        q10.g annotations = suspendFunType.getAnnotations();
        r0 k11 = i.k(suspendFunType);
        List<r0> e11 = i.e(suspendFunType);
        List<a2> m11 = i.m(suspendFunType);
        ArrayList arrayList = new ArrayList(i0.d0(m11, 10));
        Iterator<T> it = m11.iterator();
        while (it.hasNext()) {
            arrayList.add(((a2) it.next()).getType());
        }
        r1 j11 = r1.f48652b.j();
        u1 o12 = f74081a.o();
        kotlin.jvm.internal.g0.o(o12, "getTypeConstructor(...)");
        List J4 = a00.r0.J4(arrayList, e30.u0.m(j11, o12, a00.g0.l(j30.e.e(i.l(suspendFunType))), false, null, 16, null));
        c1 I = j30.e.o(suspendFunType).I();
        kotlin.jvm.internal.g0.o(I, "getNullableAnyType(...)");
        b11 = i.b(o11, annotations, k11, e11, J4, null, I, (r17 & 128) != 0 ? false : false);
        return b11.M0(suspendFunType.J0());
    }
}
