package androidx.compose.runtime.collection;

import a00.l0;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import e00.g;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n36#1:80\n37#1:87\n287#2,4:73\n292#2:79\n287#2,6:81\n287#2,4:88\n292#2:94\n287#2,6:95\n287#2,4:101\n292#2:107\n919#3,2:77\n919#3,2:92\n919#3,2:105\n1#4:108\n1002#5,2:109\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n*L\n29#1:80\n29#1:87\n24#1:73,4\n24#1:79\n29#1:81,6\n31#1:88,4\n31#1:94\n36#1:95,6\n42#1:101,4\n42#1:107\n24#1:77,2\n31#1:92,2\n42#1:105,2\n64#1:109,2\n*E\n"})
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final <T> boolean all(@k ObjectList<T> objectList, @k l<? super T, Boolean> lVar) {
        Object[] objArr = objectList.content;
        int i11 = objectList._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (!lVar.invoke(objArr[i12]).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @k
    public static final <T> ObjectList<T> fastFilter(@k ObjectList<T> objectList, @k l<? super T, Boolean> lVar) {
        Object[] objArr = objectList.content;
        int i11 = objectList._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (!lVar.invoke(objArr[i12]).booleanValue()) {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = objectList.content;
                int i13 = objectList._size;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object obj = objArr2[i14];
                    if (lVar.invoke(obj).booleanValue()) {
                        mutableObjectList.add(obj);
                    }
                }
                return mutableObjectList;
            }
        }
        return objectList;
    }

    @k
    public static final <T, R> ObjectList<R> fastMap(@k ObjectList<T> objectList, @k l<? super T, ? extends R> lVar) {
        MutableObjectList mutableObjectList = new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i11 = objectList._size;
        for (int i12 = 0; i12 < i11; i12++) {
            mutableObjectList.add(lVar.invoke(objArr[i12]));
        }
        return mutableObjectList;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(@k ObjectList<T> objectList, @k l<? super T, ? extends K> lVar) {
        if (objectList.getSize() <= 1) {
            return true;
        }
        K invoke = lVar.invoke(objectList.get(0));
        if (invoke == null) {
            return false;
        }
        int size = objectList.getSize();
        int i11 = 1;
        while (i11 < size) {
            K invoke2 = lVar.invoke(objectList.get(i11));
            if (invoke2 == null || invoke.compareTo(invoke2) > 0) {
                return false;
            }
            i11++;
            invoke = invoke2;
        }
        return true;
    }

    public static final <T> T removeLast(@k MutableObjectList<T> mutableObjectList) {
        if (mutableObjectList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        int size = mutableObjectList.getSize() - 1;
        T t11 = mutableObjectList.get(size);
        mutableObjectList.removeAt(size);
        return t11;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(@k MutableObjectList<T> mutableObjectList, @k final l<? super T, ? extends K> lVar) {
        List<T> asMutableList = mutableObjectList.asMutableList();
        if (asMutableList.size() > 1) {
            l0.r0(asMutableList, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    l lVar2 = l.this;
                    return g.l((Comparable) lVar2.invoke(t11), (Comparable) lVar2.invoke(t12));
                }
            });
        }
    }

    @k
    public static final <T, K extends Comparable<? super K>> ObjectList<T> sortedBy(@k ObjectList<T> objectList, @k l<? super T, ? extends K> lVar) {
        if (isSorted(objectList, lVar)) {
            return objectList;
        }
        MutableObjectList mutableObjectList = toMutableObjectList(objectList);
        sortBy(mutableObjectList, lVar);
        return mutableObjectList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <T> MutableObjectList<T> toMutableObjectList(@k ObjectList<T> objectList) {
        MutableObjectList<T> mutableObjectList = (MutableObjectList<T>) new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i11 = objectList._size;
        for (int i12 = 0; i12 < i11; i12++) {
            mutableObjectList.add(objArr[i12]);
        }
        return mutableObjectList;
    }
}
