package androidx.compose.runtime.reflect;

import a00.a0;
import a00.d1;
import a00.h0;
import a00.i0;
import a00.q;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1549#2:207\n1620#2,3:208\n1804#2,4:211\n1#3:215\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n126#1:207\n126#1:208,3\n127#1:211,4\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableMethod {
    public static final int $stable = 8;

    @k
    private final ComposableInfo composableInfo;

    @k
    private final Method method;

    public ComposableMethod(@k Method method, @k ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    @k
    public final Method asMethod() {
        return this.method;
    }

    public boolean equals(@l Object obj) {
        if (obj instanceof ComposableMethod) {
            return g0.g(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    @k
    public final Class<?>[] getParameterTypes() {
        return (Class[]) q.l1(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    @k
    public final Parameter[] getParameters() {
        Parameter[] parameters;
        parameters = this.method.getParameters();
        return (Parameter[]) q.l1(parameters, 0, this.composableInfo.getRealParamsCount());
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    @l
    public final Object invoke(@k Composer composer, @l Object obj, @k Object... objArr) {
        Object obj2;
        ComposableInfo composableInfo = this.composableInfo;
        int component2 = composableInfo.component2();
        int component3 = composableInfo.component3();
        int component4 = composableInfo.component4();
        int length = this.method.getParameterTypes().length;
        int i11 = component2 + 1;
        int i12 = component3 + i11;
        int i13 = 0;
        Object[] objArr2 = new Integer[component4];
        for (int i14 = 0; i14 < component4; i14++) {
            int i15 = i14 * 31;
            g10.l W1 = u.W1(i15, Math.min(i15 + 31, component2));
            ArrayList arrayList = new ArrayList(i0.d0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((d1) it).nextInt();
                arrayList.add(Integer.valueOf((nextInt >= objArr.length || objArr[nextInt] == null) ? 1 : 0));
            }
            int i16 = 0;
            int i17 = 0;
            for (Object obj3 : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    h0.b0();
                }
                i16 |= ((Number) obj3).intValue() << i17;
                i17 = i18;
            }
            objArr2[i14] = Integer.valueOf(i16);
        }
        Object[] objArr3 = new Object[length];
        while (i13 < length) {
            if (i13 >= 0 && i13 < component2) {
                obj2 = (i13 < 0 || i13 > a0.Oe(objArr)) ? ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i13]) : objArr[i13];
            } else if (i13 == component2) {
                obj2 = composer;
            } else if (i13 == i11 || (component2 + 2 <= i13 && i13 < i12)) {
                obj2 = 0;
            } else {
                if (i12 > i13 || i13 >= length) {
                    throw new IllegalStateException("Unexpected index");
                }
                obj2 = objArr2[i13 - i12];
            }
            objArr3[i13] = obj2;
            i13++;
        }
        return this.method.invoke(obj, Arrays.copyOf(objArr3, length));
    }
}
