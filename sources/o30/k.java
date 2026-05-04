package o30;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public int f75698a;

    /* renamed from: b, reason: collision with root package name */
    public Object f75699b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f75700a = new b();

        public static <T> b<T> a() {
            return f75700a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends d<E> {

        /* renamed from: b, reason: collision with root package name */
        public final int f75701b;

        public c() {
            super();
            this.f75701b = ((AbstractList) k.this).modCount;
        }

        @Override // o30.k.d
        public void a() {
            if (((AbstractList) k.this).modCount == this.f75701b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) k.this).modCount + "; expected: " + this.f75701b);
        }

        @Override // o30.k.d
        public E b() {
            return (E) k.this.f75699b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            k.this.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f75703a;

        public d() {
        }

        public abstract void a();

        public abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f75703a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f75703a) {
                throw new NoSuchElementException();
            }
            this.f75703a = true;
            a();
            return b();
        }
    }

    public static /* synthetic */ void a(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i11 == 2 || i11 == 3) {
            objArr[1] = "iterator";
        } else if (i11 == 5 || i11 == 6 || i11 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        int i11 = this.f75698a;
        if (i11 == 0) {
            this.f75699b = e11;
        } else if (i11 == 1) {
            this.f75699b = new Object[]{this.f75699b, e11};
        } else {
            Object[] objArr = (Object[]) this.f75699b;
            int length = objArr.length;
            if (i11 >= length) {
                int i12 = ((length * 3) / 2) + 1;
                int i13 = i11 + 1;
                if (i12 < i13) {
                    i12 = i13;
                }
                Object[] objArr2 = new Object[i12];
                this.f75699b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f75698a] = e11;
        }
        this.f75698a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f75699b = null;
        this.f75698a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        int i12;
        if (i11 >= 0 && i11 < (i12 = this.f75698a)) {
            return i12 == 1 ? (E) this.f75699b : (E) ((Object[]) this.f75699b)[i11];
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f75698a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @m80.k
    public Iterator<E> iterator() {
        int i11 = this.f75698a;
        if (i11 == 0) {
            b a11 = b.a();
            if (a11 == null) {
                a(2);
            }
            return a11;
        }
        if (i11 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            a(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        int i12;
        E e11;
        if (i11 < 0 || i11 >= (i12 = this.f75698a)) {
            throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f75698a);
        }
        if (i12 == 1) {
            e11 = (E) this.f75699b;
            this.f75699b = null;
        } else {
            Object[] objArr = (Object[]) this.f75699b;
            Object obj = objArr[i11];
            if (i12 == 2) {
                this.f75699b = objArr[1 - i11];
            } else {
                int i13 = (i12 - i11) - 1;
                if (i13 > 0) {
                    System.arraycopy(objArr, i11 + 1, objArr, i11, i13);
                }
                objArr[this.f75698a - 1] = null;
            }
            e11 = (E) obj;
        }
        this.f75698a--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f75698a)) {
            throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f75698a);
        }
        if (i12 == 1) {
            E e12 = (E) this.f75699b;
            this.f75699b = e11;
            return e12;
        }
        Object[] objArr = (Object[]) this.f75699b;
        E e13 = (E) objArr[i11];
        objArr[i11] = e11;
        return e13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f75698a;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i11 = this.f75698a;
        if (i11 >= 2) {
            Arrays.sort((Object[]) this.f75699b, 0, i11, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @m80.k
    public <T> T[] toArray(@m80.k T[] tArr) {
        if (tArr == 0) {
            a(4);
        }
        int length = tArr.length;
        int i11 = this.f75698a;
        if (i11 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f75699b;
                return tArr2;
            }
            tArr[0] = this.f75699b;
        } else {
            if (length < i11) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f75699b, i11, tArr.getClass());
                if (tArr3 == null) {
                    a(6);
                }
                return tArr3;
            }
            if (i11 != 0) {
                System.arraycopy(this.f75699b, 0, tArr, 0, i11);
            }
        }
        int i12 = this.f75698a;
        if (length > i12) {
            tArr[i12] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        int i12;
        if (i11 >= 0 && i11 <= (i12 = this.f75698a)) {
            if (i12 == 0) {
                this.f75699b = e11;
            } else if (i12 == 1 && i11 == 0) {
                this.f75699b = new Object[]{e11, this.f75699b};
            } else {
                Object[] objArr = new Object[i12 + 1];
                if (i12 == 1) {
                    objArr[0] = this.f75699b;
                } else {
                    Object[] objArr2 = (Object[]) this.f75699b;
                    System.arraycopy(objArr2, 0, objArr, 0, i11);
                    System.arraycopy(objArr2, i11, objArr, i11 + 1, this.f75698a - i11);
                }
                objArr[i11] = e11;
                this.f75699b = objArr;
            }
            this.f75698a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f75698a);
    }
}
