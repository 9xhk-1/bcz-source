package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class p7 {
    @uo.a
    public static Object a(@CheckForNull Object element, int index) {
        if (element != null) {
            return element;
        }
        throw new NullPointerException("at index " + index);
    }

    @uo.a
    public static Object[] b(Object... array) {
        c(array, array.length);
        return array;
    }

    @uo.a
    public static Object[] c(Object[] array, int length) {
        for (int i11 = 0; i11 < length; i11++) {
            a(array[i11], i11);
        }
        return array;
    }

    public static <T> T[] d(@t7 T t11, T[] tArr) {
        T[] tArr2 = (T[]) j(tArr, tArr.length + 1);
        tArr2[0] = t11;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] e(T[] tArr, @t7 T t11) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t11;
        return tArr2;
    }

    @go.c
    public static <T> T[] f(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) i(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Object[] g(Object[] elements, int offset, int length) {
        Preconditions.checkPositionIndexes(offset, offset + length, elements.length);
        if (length == 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[length];
        System.arraycopy(elements, offset, objArr, 0, length);
        return objArr;
    }

    @uo.a
    public static Object[] h(Iterable<?> elements, Object[] array) {
        Iterator<?> it = elements.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            array[i11] = it.next();
            i11++;
        }
        return array;
    }

    @go.c
    public static <T> T[] i(Class<T> cls, int i11) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i11));
    }

    public static <T> T[] j(T[] tArr, int i11) {
        return (T[]) v7.c(tArr, i11);
    }

    public static void k(Object[] array, int i11, int j11) {
        Object obj = array[i11];
        array[i11] = array[j11];
        array[j11] = obj;
    }

    public static Object[] l(Collection<?> c11) {
        return h(c11, new Object[c11.size()]);
    }

    public static <T> T[] m(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) j(tArr, size);
        }
        h(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public static <T> T[] n(Object[] objArr, int i11, int i12, T[] tArr) {
        Preconditions.checkPositionIndexes(i11, i11 + i12, objArr.length);
        if (tArr.length < i12) {
            tArr = (T[]) j(tArr, i12);
        } else if (tArr.length > i12) {
            tArr[i12] = null;
        }
        System.arraycopy(objArr, i11, tArr, 0, i12);
        return tArr;
    }
}
