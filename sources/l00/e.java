package l00;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,158:1\n37#2,2:159\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:159,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f69111a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f69112b = 2;

    public static final d a(BaseContinuationImpl baseContinuationImpl) {
        return (d) baseContinuationImpl.getClass().getAnnotation(d.class);
    }

    public static final int b(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @y0(version = "2.2")
    @v0
    public static final int c(@m80.k BaseContinuationImpl baseContinuationImpl) {
        int b11;
        g0.p(baseContinuationImpl, "<this>");
        d a11 = a(baseContinuationImpl);
        if (a11 != null && a11.v() >= 2 && (b11 = b(baseContinuationImpl)) >= 0 && b11 < a11.nl().length) {
            return a11.nl()[b11];
        }
        return -1;
    }

    @m80.l
    @w00.j(name = "getSpilledVariableFieldMapping")
    @y0(version = "1.3")
    @v0
    public static final String[] d(@m80.k BaseContinuationImpl baseContinuationImpl) {
        g0.p(baseContinuationImpl, "<this>");
        d a11 = a(baseContinuationImpl);
        if (a11 == null || a11.v() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int b11 = b(baseContinuationImpl);
        int[] i11 = a11.i();
        int length = i11.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (i11[i12] == b11) {
                arrayList.add(a11.s()[i12]);
                arrayList.add(a11.n()[i12]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @m80.l
    @w00.j(name = "getStackTraceElement")
    @y0(version = "1.3")
    @v0
    public static final StackTraceElement e(@m80.k BaseContinuationImpl baseContinuationImpl) {
        String str;
        g0.p(baseContinuationImpl, "<this>");
        d a11 = a(baseContinuationImpl);
        if (a11 == null || a11.v() < 1) {
            return null;
        }
        int b11 = b(baseContinuationImpl);
        int i11 = b11 < 0 ? -1 : a11.l()[b11];
        String b12 = h.f69113a.b(baseContinuationImpl);
        if (b12 == null) {
            str = a11.c();
        } else {
            str = b12 + '/' + a11.c();
        }
        return new StackTraceElement(str, a11.m(), a11.f(), i11);
    }
}
