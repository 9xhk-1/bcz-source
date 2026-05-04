package androidx.compose.runtime.reflect;

import a00.d1;
import a00.i0;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import g10.u;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ComposableMethodKt")
@u0({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,206:1\n170#1:219\n170#1:226\n170#1:233\n1735#2,6:207\n1549#3:213\n1620#3,3:214\n1549#3:220\n1620#3,3:221\n1549#3:227\n1620#3,3:228\n1549#3:234\n1620#3,3:235\n37#4,2:217\n37#4,2:224\n37#4,2:231\n37#4,2:238\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n187#1:219\n196#1:226\n197#1:233\n53#1:207,6\n170#1:213\n170#1:214,3\n187#1:220\n187#1:221,3\n196#1:227\n196#1:228,3\n197#1:234\n197#1:235,3\n170#1:217,2\n187#1:224,2\n196#1:231,2\n197#1:238,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    @l
    public static final ComposableMethod asComposableMethod(@k Method method) {
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i11, int i12) {
        if (i11 == 0) {
            return 1;
        }
        return (int) Math.ceil((i11 + i12) / 10.0d);
    }

    private static final int defaultParamCount(int i11) {
        return (int) Math.ceil(i11 / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T t11, int i11) {
        g10.l W1 = u.W1(0, i11);
        ArrayList arrayList = new ArrayList(i0.d0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            ((d1) it).nextInt();
            arrayList.add(t11);
        }
        g0.y(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private static final ComposableInfo getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (g0.g(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        length = -1;
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int changedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i12 = length + 1 + changedParamCount;
        int length2 = method.getParameterTypes().length;
        int defaultParamCount = length2 != i12 ? defaultParamCount(length) : 0;
        return new ComposableInfo(i12 + defaultParamCount == length2, length, changedParamCount, defaultParamCount);
    }

    @k
    public static final ComposableMethod getDeclaredComposableMethod(@k Class<?> cls, @k String str, @k Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        Class cls2 = Integer.TYPE;
        int changedParamCount = changedParamCount(clsArr.length, 0);
        try {
            v0 v0Var = new v0(3);
            v0Var.b(clsArr);
            v0Var.a(Composer.class);
            g10.l W1 = u.W1(0, changedParamCount);
            ArrayList arrayList = new ArrayList(i0.d0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                ((d1) it).nextInt();
                arrayList.add(cls2);
            }
            v0Var.b(arrayList.toArray(new Class[0]));
            method = cls.getDeclaredMethod(str, (Class[]) v0Var.d(new Class[v0Var.c()]));
        } catch (ReflectiveOperationException unused) {
            int defaultParamCount = defaultParamCount(clsArr.length);
            try {
                v0 v0Var2 = new v0(4);
                v0Var2.b(clsArr);
                v0Var2.a(Composer.class);
                g10.l W12 = u.W1(0, changedParamCount);
                ArrayList arrayList2 = new ArrayList(i0.d0(W12, 10));
                Iterator<Integer> it2 = W12.iterator();
                while (it2.hasNext()) {
                    ((d1) it2).nextInt();
                    arrayList2.add(cls2);
                }
                v0Var2.b(arrayList2.toArray(new Class[0]));
                g10.l W13 = u.W1(0, defaultParamCount);
                ArrayList arrayList3 = new ArrayList(i0.d0(W13, 10));
                Iterator<Integer> it3 = W13.iterator();
                while (it3.hasNext()) {
                    ((d1) it3).nextInt();
                    arrayList3.add(cls2);
                }
                v0Var2.b(arrayList3.toArray(new Class[0]));
                method = cls.getDeclaredMethod(str, (Class[]) v0Var2.d(new Class[v0Var2.c()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            ComposableMethod asComposableMethod = asComposableMethod(method);
            g0.m(asComposableMethod);
            return asComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDefaultValue(Class<?> cls) {
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
}
