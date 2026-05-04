package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class Stack<T> {

    @k
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m1933boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m1934clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m1936constructorimpl$default(ArrayList arrayList, int i11, v vVar) {
        if ((i11 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m1935constructorimpl(arrayList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1937equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && g0.g(arrayList, ((Stack) obj).m1949unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1938equalsimpl0(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        return g0.g(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m1939getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1940hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m1941isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m1942isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m1941isEmptyimpl(arrayList);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m1943peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m1939getSizeimpl(arrayList) - 1);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final T m1945popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m1939getSizeimpl(arrayList) - 1);
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m1946pushimpl(ArrayList<T> arrayList, T t11) {
        return arrayList.add(t11);
    }

    @k
    /* renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m1947toArrayimpl(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            tArr[i11] = arrayList.get(i11);
        }
        return tArr;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1948toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m1937equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m1940hashCodeimpl(this.backing);
    }

    public String toString() {
        return m1948toStringimpl(this.backing);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ArrayList m1949unboximpl() {
        return this.backing;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m1944peekimpl(ArrayList<T> arrayList, int i11) {
        return arrayList.get(i11);
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m1935constructorimpl(@k ArrayList<T> arrayList) {
        return arrayList;
    }
}
