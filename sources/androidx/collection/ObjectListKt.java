package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1548:1\n1#2:1549\n919#3,2:1550\n919#3,2:1552\n919#3,2:1554\n919#3,2:1556\n919#3,2:1558\n919#3,2:1560\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1521#1:1550,2\n1528#1:1552,2\n1529#1:1554,2\n1539#1:1556,2\n1540#1:1558,2\n1541#1:1560,2\n*E\n"})
/* loaded from: classes.dex */
public final class ObjectListKt {

    @k
    private static final Object[] EmptyArray = new Object[0];

    @k
    private static final ObjectList<Object> EmptyObjectList = new MutableObjectList(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i11) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + i11 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i11, int i12) {
        int size = list.size();
        if (i11 > i12) {
            RuntimeHelpersKt.throwIllegalArgumentException("Indices are out of order. fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("fromIndex (" + i11 + ") is less than 0.");
        }
        if (i12 > size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("toIndex (" + i12 + ") is more than than the list size (" + size + ')');
        }
    }

    @k
    public static final <E> ObjectList<E> emptyObjectList() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        g0.n(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    @k
    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        return new MutableObjectList<>(0, 1, null);
    }

    @k
    public static final <E> ObjectList<E> objectListOf() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        g0.n(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    @k
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e11) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(1);
        mutableObjectList.add(e11);
        return mutableObjectList;
    }

    @k
    public static final <E> ObjectList<E> objectListOf(E e11) {
        return mutableObjectListOf(e11);
    }

    @k
    public static final <E> ObjectList<E> objectListOf(E e11, E e12) {
        return mutableObjectListOf(e11, e12);
    }

    @k
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e11, E e12) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(2);
        mutableObjectList.add(e11);
        mutableObjectList.add(e12);
        return mutableObjectList;
    }

    @k
    public static final <E> ObjectList<E> objectListOf(E e11, E e12, E e13) {
        return mutableObjectListOf(e11, e12, e13);
    }

    @k
    public static final <E> ObjectList<E> objectListOf(@k E... elements) {
        g0.p(elements, "elements");
        MutableObjectList mutableObjectList = new MutableObjectList(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }

    @k
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e11, E e12, E e13) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(3);
        mutableObjectList.add(e11);
        mutableObjectList.add(e12);
        mutableObjectList.add(e13);
        return mutableObjectList;
    }

    @k
    public static final <E> MutableObjectList<E> mutableObjectListOf(@k E... elements) {
        g0.p(elements, "elements");
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }
}
