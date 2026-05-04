package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import g10.u;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.g;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1548:1\n287#1,6:1549\n315#1,6:1555\n287#1,6:1563\n287#1,6:1569\n287#1,6:1575\n287#1,6:1581\n287#1,6:1587\n301#1,6:1593\n315#1,6:1599\n329#1,6:1605\n80#1:1611\n301#1,6:1612\n301#1,6:1618\n301#1,6:1624\n329#1,6:1630\n80#1:1636\n315#1,6:1637\n80#1:1643\n315#1,6:1644\n329#1,6:1650\n329#1,6:1656\n301#1,6:1662\n287#1,6:1668\n84#1:1674\n1855#2,2:1561\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n99#1:1549,6\n113#1:1555,6\n162#1:1563,6\n177#1:1569,6\n201#1:1575,6\n216#1:1581,6\n232#1:1587,6\n246#1:1593,6\n262#1:1599,6\n276#1:1605,6\n359#1:1611\n386#1:1612,6\n392#1:1618,6\n408#1:1624,6\n422#1:1630,6\n444#1:1636\n456#1:1637,6\n465#1:1643\n475#1:1644,6\n492#1:1650,6\n498#1:1656,6\n528#1:1662,6\n557#1:1668,6\n571#1:1674\n153#1:1561,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class ObjectList<E> {

    @g
    public int _size;

    @g
    @k
    public Object[] content;

    public /* synthetic */ ObjectList(int i11, v vVar) {
        this(i11);
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    @k
    public abstract List<E> asList();

    public final boolean contains(E e11) {
        return indexOf(e11) >= 0;
    }

    public final boolean containsAll(@k E[] elements) {
        g0.p(elements, "elements");
        for (E e11 : elements) {
            if (!contains(e11)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i11);
        }
        return (E) this.content[i11];
    }

    public final E elementAtOrElse(@IntRange(from = 0) int i11, @k l<? super Integer, ? extends E> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= this._size) ? defaultValue.invoke(Integer.valueOf(i11)) : (E) this.content[i11];
    }

    public boolean equals(@m80.l Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i11 = objectList._size;
            int i12 = this._size;
            if (i11 == i12) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                g10.l W1 = u.W1(0, i12);
                int d11 = W1.d();
                int f11 = W1.f();
                if (d11 > f11) {
                    return true;
                }
                while (g0.g(objArr[d11], objArr2[d11])) {
                    if (d11 == f11) {
                        return true;
                    }
                    d11++;
                }
                return false;
            }
        }
        return false;
    }

    public final E first() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    @m80.l
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r11, @k p<? super R, ? super E, ? extends R> operation) {
        g0.p(operation, "operation");
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            r11 = operation.invoke(r11, objArr[i12]);
        }
        return r11;
    }

    public final <R> R foldIndexed(R r11, @k q<? super Integer, ? super R, ? super E, ? extends R> operation) {
        g0.p(operation, "operation");
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, objArr[i12]);
        }
        return r11;
    }

    public final <R> R foldRight(R r11, @k p<? super E, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        Object[] objArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(objArr[i11], r11);
        }
    }

    public final <R> R foldRightIndexed(R r11, @k q<? super Integer, ? super E, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        Object[] objArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Integer.valueOf(i11), objArr[i11], r11);
        }
    }

    public final void forEach(@k l<? super E, g2> block) {
        g0.p(block, "block");
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(objArr[i12]);
        }
    }

    public final void forEachIndexed(@k p<? super Integer, ? super E, g2> block) {
        g0.p(block, "block");
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Integer.valueOf(i12), objArr[i12]);
        }
    }

    public final void forEachReversed(@k l<? super E, g2> block) {
        g0.p(block, "block");
        Object[] objArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(objArr[i11]);
            }
        }
    }

    public final void forEachReversedIndexed(@k p<? super Integer, ? super E, g2> block) {
        g0.p(block, "block");
        Object[] objArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Integer.valueOf(i11), objArr[i11]);
            }
        }
    }

    public final E get(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i11);
        }
        return (E) this.content[i11];
    }

    @k
    public final g10.l getIndices() {
        return u.W1(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            i12 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i12;
    }

    public final int indexOf(E e11) {
        int i11 = 0;
        if (e11 == null) {
            Object[] objArr = this.content;
            int i12 = this._size;
            while (i11 < i12) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i13 = this._size;
        while (i11 < i13) {
            if (e11.equals(objArr2[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final int indexOfFirst(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(objArr[i12]).booleanValue()) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfLast(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (!predicate.invoke(objArr[i11]).booleanValue());
        return i11;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @w00.k
    @k
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E e11) {
        if (e11 == null) {
            Object[] objArr = this.content;
            for (int i11 = this._size - 1; -1 < i11; i11--) {
                if (objArr[i11] == null) {
                    return i11;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i12 = this._size - 1; -1 < i12; i12--) {
                if (e11.equals(objArr2[i12])) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @m80.l
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i11 = this._size - 1; -1 < i11; i11--) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i11);
        sb2.append(" must be in 0..");
        sb2.append(this._size - 1);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(sb2.toString());
    }

    @k
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new l<E, CharSequence>(this) { // from class: androidx.collection.ObjectList$toString$1
            final /* synthetic */ ObjectList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((ObjectList$toString$1<E>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final CharSequence invoke(E e11) {
                return e11 == this.this$0 ? "(this)" : String.valueOf(e11);
            }
        }, 25, null);
    }

    private ObjectList(int i11) {
        this.content = i11 == 0 ? ObjectListKt.EmptyArray : new Object[i11];
    }

    public final boolean any(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(objArr[i12]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (predicate.invoke(objArr[i13]).booleanValue()) {
                i12++;
            }
        }
        return i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    @m80.l
    public final E firstOrNull(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            ?? r32 = (Object) objArr[i12];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        return null;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator) {
        g0.p(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(@k List<? extends E> elements) {
        g0.p(elements, "elements");
        int size = elements.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!contains(elements.get(i11))) {
                return false;
            }
        }
        return true;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    @m80.l
    public final E lastOrNull(@k l<? super E, Boolean> predicate) {
        ?? r22;
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return null;
            }
            r22 = (Object) objArr[i11];
        } while (!predicate.invoke(r22).booleanValue());
        return r22;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E first(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            ?? r32 = (Object) objArr[i12];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i11, null, null, 48, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E last(@k l<? super E, Boolean> predicate) {
        ?? r22;
        g0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 < i11) {
                r22 = (Object) objArr[i11];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(r22).booleanValue());
        return r22;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i11, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (!contains(objArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @m80.l l<? super E, ? extends CharSequence> lVar) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                Object obj = objArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                if (lVar == null) {
                    sb2.append(obj);
                } else {
                    sb2.append(lVar.invoke(obj));
                }
                i13++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @v0
    public static /* synthetic */ void getContent$annotations() {
    }

    @v0
    public static /* synthetic */ void get_size$annotations() {
    }
}
