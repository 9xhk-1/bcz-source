package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import a00.a0;
import a00.q;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n*E\n"})
/* loaded from: classes.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {

    @k
    private final Object[] buffer;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }

        private Companion() {
        }
    }

    public SmallPersistentVector(@k Object[] objArr) {
        this.buffer = objArr;
        CommonFunctionsKt.m2064assert(objArr.length <= 32);
    }

    private final Object[] bufferOfSize(int i11) {
        return new Object[i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((SmallPersistentVector<E>) obj);
    }

    @Override // a00.d, java.util.List
    public E get(int i11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        return (E) this.buffer[i11];
    }

    @Override // a00.d, a00.b
    public int getSize() {
        return this.buffer.length;
    }

    @Override // a00.d, java.util.List
    public int indexOf(Object obj) {
        return a0.bg(this.buffer, obj);
    }

    @Override // a00.d, java.util.List
    public int lastIndexOf(Object obj) {
        return a0.fi(this.buffer, obj);
    }

    @Override // a00.d, java.util.List
    @k
    public ListIterator<E> listIterator(int i11) {
        ListImplementation.checkPositionIndex$runtime_release(i11, size());
        return new BufferIterator(this.buffer, i11, size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @k
    public PersistentList<E> removeAt(int i11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] copyOf = Arrays.copyOf(this.buffer, size() - 1);
        g0.o(copyOf, "copyOf(...)");
        q.B0(this.buffer, copyOf, i11, i11 + 1, size());
        return new SmallPersistentVector(copyOf);
    }

    @Override // a00.d, java.util.List
    @k
    public PersistentList<E> set(int i11, E e11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11] = e11;
        return new SmallPersistentVector(copyOf);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> add(E e11) {
        if (size() >= 32) {
            return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e11), size() + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(this.buffer, size() + 1);
        g0.o(copyOf, "copyOf(...)");
        copyOf[size()] = e11;
        return new SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> addAll(@k Collection<? extends E> collection) {
        if (size() + collection.size() > 32) {
            PersistentList.Builder<E> builder = builder();
            builder.addAll(collection);
            return builder.build();
        }
        Object[] copyOf = Arrays.copyOf(this.buffer, size() + collection.size());
        g0.o(copyOf, "copyOf(...)");
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[size] = it.next();
            size++;
        }
        return new SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> removeAll(@k l<? super E, Boolean> lVar) {
        Object[] objArr = this.buffer;
        int size = size();
        int size2 = size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size2; i11++) {
            Object obj = this.buffer[i11];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z11) {
                    Object[] objArr2 = this.buffer;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    g0.o(objArr, "copyOf(...)");
                    z11 = true;
                    size = i11;
                }
            } else if (z11) {
                objArr[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? EMPTY : new SmallPersistentVector(q.l1(objArr, 0, size));
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @k
    public PersistentList<E> add(int i11, E e11) {
        ListImplementation.checkPositionIndex$runtime_release(i11, size());
        if (i11 == size()) {
            return add((SmallPersistentVector<E>) e11);
        }
        if (size() < 32) {
            Object[] bufferOfSize = bufferOfSize(size() + 1);
            q.K0(this.buffer, bufferOfSize, 0, 0, i11, 6, null);
            q.B0(this.buffer, bufferOfSize, i11 + 1, i11, size());
            bufferOfSize[i11] = e11;
            return new SmallPersistentVector(bufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        q.B0(this.buffer, copyOf, i11 + 1, i11, size() - 1);
        copyOf[i11] = e11;
        return new PersistentVector(copyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @k
    public PersistentList<E> addAll(int i11, @k Collection<? extends E> collection) {
        ListImplementation.checkPositionIndex$runtime_release(i11, size());
        if (size() + collection.size() <= 32) {
            Object[] bufferOfSize = bufferOfSize(size() + collection.size());
            int i12 = i11;
            q.K0(this.buffer, bufferOfSize, 0, 0, i12, 6, null);
            q.B0(this.buffer, bufferOfSize, collection.size() + i12, i12, size());
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                bufferOfSize[i12] = it.next();
                i12++;
            }
            return new SmallPersistentVector(bufferOfSize);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i11, collection);
        return builder.build();
    }
}
