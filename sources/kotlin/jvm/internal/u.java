package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "CollectionToArray")
@u0({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n*E\n"})
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Object[] f67039a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final int f67040b = 2147483645;

    @w00.j(name = "toArray")
    @m80.k
    @yz.n(message = "This function will be made internal in a future release")
    @yz.o(errorSince = "2.1", warningSince = "1.9")
    public static final Object[] a(@m80.k Collection<?> collection) {
        g0.p(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return f67039a;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return f67039a;
        }
        Object[] objArr = new Object[size];
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            objArr[i11] = it.next();
            if (i12 >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                int i13 = ((i12 * 3) + 1) >>> 1;
                if (i13 <= i12) {
                    i13 = f67040b;
                    if (i12 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i13);
                g0.o(objArr, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr, i12);
                g0.o(copyOf, "copyOf(...)");
                return copyOf;
            }
            i11 = i12;
        }
    }

    @w00.j(name = "toArray")
    @m80.k
    @yz.n(message = "This function will be made internal in a future release")
    @yz.o(errorSince = "2.1", warningSince = "1.9")
    public static final Object[] b(@m80.k Collection<?> collection, @m80.l Object[] objArr) {
        Object[] objArr2;
        g0.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i11 = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    g0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i12 = i11 + 1;
                    objArr2[i11] = it.next();
                    if (i12 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i13 = ((i12 * 3) + 1) >>> 1;
                        if (i13 <= i12) {
                            i13 = f67040b;
                            if (i12 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i13);
                        g0.o(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i12] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i12);
                        g0.o(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i11 = i12;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final Object[] c(Collection<?> collection, x00.a<Object[]> aVar, x00.l<? super Integer, Object[]> lVar, x00.p<? super Object[], ? super Integer, Object[]> pVar) {
        int size = collection.size();
        if (size == 0) {
            return aVar.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return aVar.invoke();
        }
        Object[] invoke = lVar.invoke(Integer.valueOf(size));
        int i11 = 0;
        ?? r32 = invoke;
        while (true) {
            int i12 = i11 + 1;
            r32[i11] = it.next();
            if (i12 >= r32.length) {
                if (!it.hasNext()) {
                    return r32;
                }
                int i13 = ((i12 * 3) + 1) >>> 1;
                if (i13 <= i12) {
                    i13 = f67040b;
                    if (i12 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                r32 = Arrays.copyOf((Object[]) r32, i13);
                g0.o(r32, "copyOf(...)");
            } else if (!it.hasNext()) {
                return pVar.invoke(r32, Integer.valueOf(i12));
            }
            i11 = i12;
            r32 = r32;
        }
    }
}
