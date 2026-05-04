package androidx.compose.ui.tooling;

import a00.a0;
import a00.d1;
import a00.i0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.tooling.PreviewLogger;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import g10.l;
import g10.u;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v0;
import m80.k;
import u30.f0;
import w00.b;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@n(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@u0({"SMAP\nComposableInvoker.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableInvoker.jvm.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n78#1:267\n11155#2:236\n11266#2,4:237\n1282#2,2:244\n11383#2,9:252\n13309#2:261\n13310#2:263\n11392#2:264\n1735#2,6:274\n1726#3,3:241\n1549#3:246\n1620#3,3:247\n1549#3:268\n1620#3,3:269\n37#4,2:250\n37#4,2:265\n37#4,2:272\n1#5:262\n1#5:280\n*S KotlinDebug\n*F\n+ 1 ComposableInvoker.jvm.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n*L\n96#1:267\n44#1:236\n44#1:237,4\n70#1:244,2\n92#1:252,9\n92#1:261\n92#1:263\n92#1:264\n144#1:274,6\n56#1:241,3\n78#1:246\n78#1:247,3\n96#1:268\n96#1:269,3\n78#1:250,2\n92#1:265,2\n96#1:272,2\n92#1:262\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposableInvoker {
    public static final int $stable = 0;
    private static final int BITS_PER_INT = 31;

    @k
    public static final ComposableInvoker INSTANCE = new ComposableInvoker();
    private static final int SLOTS_PER_INT = 10;

    private ComposableInvoker() {
    }

    private final boolean areParameterTypesCompatible(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            int length = clsArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                boolean z11 = true;
                if (i11 >= length) {
                    break;
                }
                Class<?> cls = clsArr[i11];
                int i13 = i12 + 1;
                Class<?> cls2 = clsArr2[i12];
                if (!g0.g(b.i(cls), b.i(cls2)) && !cls.isAssignableFrom(cls2)) {
                    z11 = false;
                }
                arrayList.add(Boolean.valueOf(z11));
                i11++;
                i12 = i13;
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final int changedParamCount(int i11, int i12) {
        if (i11 == 0) {
            return 1;
        }
        return (int) Math.ceil((i11 + i12) / 10.0d);
    }

    private final int defaultParamCount(int i11) {
        return (int) Math.ceil(i11 / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T[] dup(T t11, int i11) {
        l W1 = u.W1(0, i11);
        ArrayList arrayList = new ArrayList(i0.d0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            ((d1) it).nextInt();
            arrayList.add(t11);
        }
        g0.y(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private final Method findCompatibleComposeMethod(Method[] methodArr, String str, Class<?>... clsArr) {
        Method method;
        int length = methodArr.length;
        int i11 = 0;
        while (true) {
            method = null;
            if (i11 >= length) {
                break;
            }
            Method method2 = methodArr[i11];
            if (!g0.g(str, method2.getName())) {
                if (!f0.J2(method2.getName(), str + '-', false, 2, null)) {
                    continue;
                    i11++;
                }
            }
            if (INSTANCE.areParameterTypesCompatible(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i11++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    private final Method findComposableMethod(Class<?> cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i11++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int changedParamCount = changedParamCount(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                l W1 = u.W1(0, changedParamCount);
                ArrayList arrayList2 = new ArrayList(i0.d0(W1, 10));
                Iterator<Integer> it = W1.iterator();
                while (it.hasNext()) {
                    ((d1) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                v0 v0Var = new v0(3);
                v0Var.b(clsArr);
                v0Var.a(Composer.class);
                v0Var.b(clsArr2);
                return findCompatibleComposeMethod(declaredMethods, str, (Class[]) v0Var.d(new Class[v0Var.c()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!g0.g(method.getName(), str)) {
                    if (!f0.J2(method.getName(), str + '-', false, 2, null)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    private final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return !name.equals("int") ? null : 0;
            case 3039496:
                return !name.equals("byte") ? null : (byte) 0;
            case 3052374:
                return !name.equals("char") ? null : (char) 0;
            case 3327612:
                return !name.equals("long") ? null : 0L;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return !name.equals("short") ? null : (short) 0;
            default:
                return null;
        }
    }

    private final Object invokeComposableMethod(Method method, Object obj, Composer composer, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i11 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (g0.g(parameterTypes[length], Composer.class)) {
                    i11 = length;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
        }
        int i13 = i11 + 1;
        int changedParamCount = changedParamCount(i11, obj != null ? 1 : 0) + i13;
        int length2 = method.getParameterTypes().length;
        if ((length2 != changedParamCount ? defaultParamCount(i11) : 0) + changedParamCount != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        int i14 = 0;
        while (i14 < length2) {
            if (i14 >= 0 && i14 < i11) {
                obj2 = (i14 < 0 || i14 > a0.Oe(objArr)) ? INSTANCE.getDefaultValue(method.getParameterTypes()[i14]) : objArr[i14];
            } else if (i14 == i11) {
                obj2 = composer;
            } else if (i13 <= i14 && i14 < changedParamCount) {
                obj2 = 0;
            } else {
                if (changedParamCount > i14 || i14 >= length2) {
                    throw new IllegalStateException("Unexpected index");
                }
                obj2 = 2097151;
            }
            objArr2[i14] = obj2;
            i14++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    @ExperimentalComposeUiApi
    public final void invokeComposable(@k String str, @k String str2, @k Composer composer, @k Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method findComposableMethod = findComposableMethod(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (findComposableMethod != null) {
                findComposableMethod.setAccessible(true);
                if (Modifier.isStatic(findComposableMethod.getModifiers())) {
                    invokeComposableMethod(findComposableMethod, null, composer, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    invokeComposableMethod(findComposableMethod, cls.getConstructor(null).newInstance(null), composer, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e11) {
            PreviewLogger.Companion.logWarning$ui_tooling_release$default(PreviewLogger.Companion, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null, 2, null);
            throw e11;
        }
    }
}
