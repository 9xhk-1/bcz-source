package a00;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.4")
@kotlin.jvm.internal.u0({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:663\n476#1,53:716\n37#2,2:661\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:663,53\n473#1:716,53\n46#1:661,2\n*E\n"})
/* loaded from: classes8.dex */
public final class m<E> extends h<E> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f1112d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Object[] f1113e = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public static final int f1114f = 10;

    /* renamed from: a, reason: collision with root package name */
    public int f1115a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public Object[] f1116b;

    /* renamed from: c, reason: collision with root package name */
    public int f1117c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public m(int i11) {
        Object[] objArr;
        if (i11 == 0) {
            objArr = f1113e;
        } else {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i11);
            }
            objArr = new Object[i11];
        }
        this.f1116b = objArr;
    }

    private final void f(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1116b;
        if (i11 <= objArr.length) {
            return;
        }
        if (objArr == f1113e) {
            this.f1116b = new Object[g10.u.u(i11, 10)];
        } else {
            b(d.Companion.e(objArr.length, i11));
        }
    }

    public final void a(int i11, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f1116b.length;
        while (i11 < length && it.hasNext()) {
            this.f1116b[i11] = it.next();
            i11++;
        }
        int i12 = this.f1115a;
        for (int i13 = 0; i13 < i12 && it.hasNext(); i13++) {
            this.f1116b[i13] = it.next();
        }
        this.f1117c = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        addLast(e11);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@m80.k Collection<? extends E> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        registerModification();
        f(size() + elements.size());
        a(r(this.f1115a + size()), elements);
        return true;
    }

    public final void addFirst(E e11) {
        registerModification();
        f(size() + 1);
        int d11 = d(this.f1115a);
        this.f1115a = d11;
        this.f1116b[d11] = e11;
        this.f1117c = size() + 1;
    }

    public final void addLast(E e11) {
        registerModification();
        f(size() + 1);
        this.f1116b[r(this.f1115a + size())] = e11;
        this.f1117c = size() + 1;
    }

    public final void b(int i11) {
        Object[] objArr = new Object[i11];
        Object[] objArr2 = this.f1116b;
        q.B0(objArr2, objArr, 0, this.f1115a, objArr2.length);
        Object[] objArr3 = this.f1116b;
        int length = objArr3.length;
        int i12 = this.f1115a;
        q.B0(objArr3, objArr, length - i12, 0, i12);
        this.f1115a = 0;
        this.f1116b = objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            p(this.f1115a, r(this.f1115a + size()));
        }
        this.f1115a = 0;
        this.f1117c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i11) {
        return i11 == 0 ? a0.Oe(this.f1116b) : i11 - 1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f1116b[this.f1115a];
    }

    public final boolean g(x00.l<? super E, Boolean> lVar) {
        int r11;
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f1116b.length != 0) {
            int r12 = r(this.f1115a + size());
            int i11 = this.f1115a;
            if (i11 < r12) {
                r11 = i11;
                while (i11 < r12) {
                    Object obj = this.f1116b[i11];
                    if (lVar.invoke(obj).booleanValue()) {
                        this.f1116b[r11] = obj;
                        r11++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                q.M1(this.f1116b, null, r11, r12);
            } else {
                int length = this.f1116b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f1116b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (lVar.invoke(obj2).booleanValue()) {
                        this.f1116b[i12] = obj2;
                        i12++;
                    } else {
                        z12 = true;
                    }
                    i11++;
                }
                r11 = r(i12);
                for (int i13 = 0; i13 < r12; i13++) {
                    Object[] objArr2 = this.f1116b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (lVar.invoke(obj3).booleanValue()) {
                        this.f1116b[r11] = obj3;
                        r11 = j(r11);
                    } else {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                registerModification();
                this.f1117c = o(r11 - this.f1115a);
            }
        }
        return z11;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        d.Companion.b(i11, size());
        return (E) this.f1116b[r(this.f1115a + i11)];
    }

    @Override // a00.h
    public int getSize() {
        return this.f1117c;
    }

    @m80.l
    public final E h() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f1116b[this.f1115a];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i11;
        int r11 = r(this.f1115a + size());
        int i12 = this.f1115a;
        if (i12 < r11) {
            while (i12 < r11) {
                if (kotlin.jvm.internal.g0.g(obj, this.f1116b[i12])) {
                    i11 = this.f1115a;
                } else {
                    i12++;
                }
            }
            return -1;
        }
        if (i12 < r11) {
            return -1;
        }
        int length = this.f1116b.length;
        while (true) {
            if (i12 >= length) {
                for (int i13 = 0; i13 < r11; i13++) {
                    if (kotlin.jvm.internal.g0.g(obj, this.f1116b[i13])) {
                        i12 = i13 + this.f1116b.length;
                        i11 = this.f1115a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.g0.g(obj, this.f1116b[i12])) {
                i11 = this.f1115a;
                break;
            }
            i12++;
        }
        return i12 - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(int i11) {
        if (i11 == a0.Oe(this.f1116b)) {
            return 0;
        }
        return i11 + 1;
    }

    @o00.f
    public final E k(int i11) {
        return (E) this.f1116b[i11];
    }

    @o00.f
    public final int l(int i11) {
        return r(this.f1115a + i11);
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f1116b[r(this.f1115a + h0.L(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int Oe;
        int i11;
        int r11 = r(this.f1115a + size());
        int i12 = this.f1115a;
        if (i12 < r11) {
            Oe = r11 - 1;
            if (i12 <= Oe) {
                while (!kotlin.jvm.internal.g0.g(obj, this.f1116b[Oe])) {
                    if (Oe != i12) {
                        Oe--;
                    }
                }
                i11 = this.f1115a;
                return Oe - i11;
            }
            return -1;
        }
        if (i12 > r11) {
            int i13 = r11 - 1;
            while (true) {
                if (-1 >= i13) {
                    Oe = a0.Oe(this.f1116b);
                    int i14 = this.f1115a;
                    if (i14 <= Oe) {
                        while (!kotlin.jvm.internal.g0.g(obj, this.f1116b[Oe])) {
                            if (Oe != i14) {
                                Oe--;
                            }
                        }
                        i11 = this.f1115a;
                    }
                } else {
                    if (kotlin.jvm.internal.g0.g(obj, this.f1116b[i13])) {
                        Oe = i13 + this.f1116b.length;
                        i11 = this.f1115a;
                        break;
                    }
                    i13--;
                }
            }
        }
        return -1;
    }

    public final void m(@m80.k x00.p<? super Integer, ? super Object[], g2> structure) {
        int i11;
        kotlin.jvm.internal.g0.p(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i11 = this.f1115a) < r(this.f1115a + size())) ? this.f1115a : i11 - this.f1116b.length), toArray());
    }

    @m80.l
    public final E n() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f1116b[r(this.f1115a + h0.L(this))];
    }

    public final int o(int i11) {
        return i11 < 0 ? i11 + this.f1116b.length : i11;
    }

    public final void p(int i11, int i12) {
        if (i11 < i12) {
            q.M1(this.f1116b, null, i11, i12);
            return;
        }
        Object[] objArr = this.f1116b;
        q.M1(objArr, null, i11, objArr.length);
        q.M1(this.f1116b, null, 0, i12);
    }

    public final int r(int i11) {
        Object[] objArr = this.f1116b;
        return i11 >= objArr.length ? i11 - objArr.length : i11;
    }

    public final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@m80.k Collection<?> elements) {
        int r11;
        kotlin.jvm.internal.g0.p(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f1116b.length != 0) {
            int r12 = r(this.f1115a + size());
            int i11 = this.f1115a;
            if (i11 < r12) {
                r11 = i11;
                while (i11 < r12) {
                    Object obj = this.f1116b[i11];
                    if (elements.contains(obj)) {
                        z11 = true;
                    } else {
                        this.f1116b[r11] = obj;
                        r11++;
                    }
                    i11++;
                }
                q.M1(this.f1116b, null, r11, r12);
            } else {
                int length = this.f1116b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f1116b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        z12 = true;
                    } else {
                        this.f1116b[i12] = obj2;
                        i12++;
                    }
                    i11++;
                }
                r11 = r(i12);
                for (int i13 = 0; i13 < r12; i13++) {
                    Object[] objArr2 = this.f1116b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        z12 = true;
                    } else {
                        this.f1116b[r11] = obj3;
                        r11 = j(r11);
                    }
                }
                z11 = z12;
            }
            if (z11) {
                registerModification();
                this.f1117c = o(r11 - this.f1115a);
            }
        }
        return z11;
    }

    @Override // a00.h
    public E removeAt(int i11) {
        d.Companion.b(i11, size());
        if (i11 == h0.L(this)) {
            return removeLast();
        }
        if (i11 == 0) {
            return removeFirst();
        }
        registerModification();
        int r11 = r(this.f1115a + i11);
        E e11 = (E) this.f1116b[r11];
        if (i11 < (size() >> 1)) {
            int i12 = this.f1115a;
            if (r11 >= i12) {
                Object[] objArr = this.f1116b;
                q.B0(objArr, objArr, i12 + 1, i12, r11);
            } else {
                Object[] objArr2 = this.f1116b;
                q.B0(objArr2, objArr2, 1, 0, r11);
                Object[] objArr3 = this.f1116b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i13 = this.f1115a;
                q.B0(objArr3, objArr3, i13 + 1, i13, objArr3.length - 1);
            }
            Object[] objArr4 = this.f1116b;
            int i14 = this.f1115a;
            objArr4[i14] = null;
            this.f1115a = j(i14);
        } else {
            int r12 = r(this.f1115a + h0.L(this));
            if (r11 <= r12) {
                Object[] objArr5 = this.f1116b;
                q.B0(objArr5, objArr5, r11, r11 + 1, r12 + 1);
            } else {
                Object[] objArr6 = this.f1116b;
                q.B0(objArr6, objArr6, r11, r11 + 1, objArr6.length);
                Object[] objArr7 = this.f1116b;
                objArr7[objArr7.length - 1] = objArr7[0];
                q.B0(objArr7, objArr7, 0, 1, r12 + 1);
            }
            this.f1116b[r12] = null;
        }
        this.f1117c = size() - 1;
        return e11;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        Object[] objArr = this.f1116b;
        int i11 = this.f1115a;
        E e11 = (E) objArr[i11];
        objArr[i11] = null;
        this.f1115a = j(i11);
        this.f1117c = size() - 1;
        return e11;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int r11 = r(this.f1115a + h0.L(this));
        Object[] objArr = this.f1116b;
        E e11 = (E) objArr[r11];
        objArr[r11] = null;
        this.f1117c = size() - 1;
        return e11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i11, int i12) {
        d.Companion.d(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == 0) {
            return;
        }
        if (i13 == size()) {
            clear();
            return;
        }
        if (i13 == 1) {
            removeAt(i11);
            return;
        }
        registerModification();
        if (i11 < size() - i12) {
            u(i11, i12);
            int r11 = r(this.f1115a + i13);
            p(this.f1115a, r11);
            this.f1115a = r11;
        } else {
            v(i11, i12);
            int r12 = r(this.f1115a + size());
            p(o(r12 - i13), r12);
        }
        this.f1117c = size() - i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@m80.k Collection<?> elements) {
        int r11;
        kotlin.jvm.internal.g0.p(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f1116b.length != 0) {
            int r12 = r(this.f1115a + size());
            int i11 = this.f1115a;
            if (i11 < r12) {
                r11 = i11;
                while (i11 < r12) {
                    Object obj = this.f1116b[i11];
                    if (elements.contains(obj)) {
                        this.f1116b[r11] = obj;
                        r11++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                q.M1(this.f1116b, null, r11, r12);
            } else {
                int length = this.f1116b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f1116b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        this.f1116b[i12] = obj2;
                        i12++;
                    } else {
                        z12 = true;
                    }
                    i11++;
                }
                r11 = r(i12);
                for (int i13 = 0; i13 < r12; i13++) {
                    Object[] objArr2 = this.f1116b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        this.f1116b[r11] = obj3;
                        r11 = j(r11);
                    } else {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                registerModification();
                this.f1117c = o(r11 - this.f1115a);
            }
        }
        return z11;
    }

    @m80.l
    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // a00.h, java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        d.Companion.b(i11, size());
        int r11 = r(this.f1115a + i11);
        Object[] objArr = this.f1116b;
        E e12 = (E) objArr[r11];
        objArr[r11] = e11;
        return e12;
    }

    @m80.l
    public final E t() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @m80.k
    public <T> T[] toArray(@m80.k T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        if (array.length < size()) {
            array = (T[]) o.a(array, size());
        }
        T[] tArr = array;
        int r11 = r(this.f1115a + size());
        int i11 = this.f1115a;
        if (i11 < r11) {
            q.K0(this.f1116b, tArr, 0, i11, r11, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f1116b;
            q.B0(objArr, tArr, 0, this.f1115a, objArr.length);
            Object[] objArr2 = this.f1116b;
            q.B0(objArr2, tArr, objArr2.length - this.f1115a, 0, r11);
        }
        return (T[]) g0.o(size(), tArr);
    }

    public final void u(int i11, int i12) {
        int r11 = r(this.f1115a + (i11 - 1));
        int r12 = r(this.f1115a + (i12 - 1));
        while (i11 > 0) {
            int i13 = r11 + 1;
            int min = Math.min(i11, Math.min(i13, r12 + 1));
            Object[] objArr = this.f1116b;
            int i14 = r12 - min;
            int i15 = r11 - min;
            q.B0(objArr, objArr, i14 + 1, i15 + 1, i13);
            r11 = o(i15);
            r12 = o(i14);
            i11 -= min;
        }
    }

    public final void v(int i11, int i12) {
        int r11 = r(this.f1115a + i12);
        int r12 = r(this.f1115a + i11);
        int size = size();
        while (true) {
            size -= i12;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f1116b;
            i12 = Math.min(size, Math.min(objArr.length - r11, objArr.length - r12));
            Object[] objArr2 = this.f1116b;
            int i13 = r11 + i12;
            q.B0(objArr2, objArr2, r12, r11, i13);
            r11 = r(i13);
            r12 = r(r12 + i12);
        }
    }

    public final void w(int i11, int i12) {
        removeRange(i11, i12);
    }

    @m80.k
    public final Object[] x() {
        return toArray();
    }

    @m80.k
    public final <T> T[] y(@m80.k T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        return (T[]) toArray(array);
    }

    @Override // a00.h, java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        d.Companion.c(i11, size());
        if (i11 == size()) {
            addLast(e11);
            return;
        }
        if (i11 == 0) {
            addFirst(e11);
            return;
        }
        registerModification();
        f(size() + 1);
        int r11 = r(this.f1115a + i11);
        if (i11 < ((size() + 1) >> 1)) {
            int d11 = d(r11);
            int d12 = d(this.f1115a);
            int i12 = this.f1115a;
            if (d11 >= i12) {
                Object[] objArr = this.f1116b;
                objArr[d12] = objArr[i12];
                q.B0(objArr, objArr, i12, i12 + 1, d11 + 1);
            } else {
                Object[] objArr2 = this.f1116b;
                q.B0(objArr2, objArr2, i12 - 1, i12, objArr2.length);
                Object[] objArr3 = this.f1116b;
                objArr3[objArr3.length - 1] = objArr3[0];
                q.B0(objArr3, objArr3, 0, 1, d11 + 1);
            }
            this.f1116b[d11] = e11;
            this.f1115a = d12;
        } else {
            int r12 = r(this.f1115a + size());
            if (r11 < r12) {
                Object[] objArr4 = this.f1116b;
                q.B0(objArr4, objArr4, r11 + 1, r11, r12);
            } else {
                Object[] objArr5 = this.f1116b;
                q.B0(objArr5, objArr5, 1, 0, r12);
                Object[] objArr6 = this.f1116b;
                objArr6[0] = objArr6[objArr6.length - 1];
                q.B0(objArr6, objArr6, r11 + 1, r11, objArr6.length - 1);
            }
            this.f1116b[r11] = e11;
        }
        this.f1117c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, @m80.k Collection<? extends E> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        d.Companion.c(i11, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i11 == size()) {
            return addAll(elements);
        }
        registerModification();
        f(size() + elements.size());
        int r11 = r(this.f1115a + size());
        int r12 = r(this.f1115a + i11);
        int size = elements.size();
        if (i11 < ((size() + 1) >> 1)) {
            int i12 = this.f1115a;
            int i13 = i12 - size;
            if (r12 < i12) {
                Object[] objArr = this.f1116b;
                q.B0(objArr, objArr, i13, i12, objArr.length);
                if (size >= r12) {
                    Object[] objArr2 = this.f1116b;
                    q.B0(objArr2, objArr2, objArr2.length - size, 0, r12);
                } else {
                    Object[] objArr3 = this.f1116b;
                    q.B0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f1116b;
                    q.B0(objArr4, objArr4, 0, size, r12);
                }
            } else if (i13 >= 0) {
                Object[] objArr5 = this.f1116b;
                q.B0(objArr5, objArr5, i13, i12, r12);
            } else {
                Object[] objArr6 = this.f1116b;
                i13 += objArr6.length;
                int i14 = r12 - i12;
                int length = objArr6.length - i13;
                if (length >= i14) {
                    q.B0(objArr6, objArr6, i13, i12, r12);
                } else {
                    q.B0(objArr6, objArr6, i13, i12, i12 + length);
                    Object[] objArr7 = this.f1116b;
                    q.B0(objArr7, objArr7, 0, this.f1115a + length, r12);
                }
            }
            this.f1115a = i13;
            a(o(r12 - size), elements);
        } else {
            int i15 = r12 + size;
            if (r12 < r11) {
                int i16 = size + r11;
                Object[] objArr8 = this.f1116b;
                if (i16 <= objArr8.length) {
                    q.B0(objArr8, objArr8, i15, r12, r11);
                } else if (i15 >= objArr8.length) {
                    q.B0(objArr8, objArr8, i15 - objArr8.length, r12, r11);
                } else {
                    int length2 = r11 - (i16 - objArr8.length);
                    q.B0(objArr8, objArr8, 0, length2, r11);
                    Object[] objArr9 = this.f1116b;
                    q.B0(objArr9, objArr9, i15, r12, length2);
                }
            } else {
                Object[] objArr10 = this.f1116b;
                q.B0(objArr10, objArr10, size, 0, r11);
                Object[] objArr11 = this.f1116b;
                if (i15 >= objArr11.length) {
                    q.B0(objArr11, objArr11, i15 - objArr11.length, r12, objArr11.length);
                } else {
                    q.B0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f1116b;
                    q.B0(objArr12, objArr12, i15, r12, objArr12.length - size);
                }
            }
            a(r12, elements);
        }
        return true;
    }

    public m() {
        this.f1116b = f1113e;
    }

    public m(@m80.k Collection<? extends E> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f1116b = array;
        this.f1117c = array.length;
        if (array.length == 0) {
            this.f1116b = f1113e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @m80.k
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
