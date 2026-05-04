package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ObjArray implements Serializable {
    private static final int FIELDS_STORE_SIZE = 5;
    static final long serialVersionUID = 4174889037736658296L;
    private transient Object[] data;

    /* renamed from: f0, reason: collision with root package name */
    private transient Object f78362f0;

    /* renamed from: f1, reason: collision with root package name */
    private transient Object f78363f1;

    /* renamed from: f2, reason: collision with root package name */
    private transient Object f78364f2;

    /* renamed from: f3, reason: collision with root package name */
    private transient Object f78365f3;

    /* renamed from: f4, reason: collision with root package name */
    private transient Object f78366f4;
    private boolean sealed;
    private int size;

    private void ensureCapacity(int i11) {
        int i12 = i11 - 5;
        if (i12 <= 0) {
            throw new IllegalArgumentException();
        }
        Object[] objArr = this.data;
        if (objArr == null) {
            if (10 >= i12) {
                i12 = 10;
            }
            this.data = new Object[i12];
            return;
        }
        int length = objArr.length;
        if (length < i12) {
            int i13 = length > 5 ? length * 2 : 10;
            if (i13 >= i12) {
                i12 = i13;
            }
            Object[] objArr2 = new Object[i12];
            int i14 = this.size;
            if (i14 > 5) {
                System.arraycopy(objArr, 0, objArr2, 0, i14 - 5);
            }
            this.data = objArr2;
        }
    }

    private Object getImpl(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? this.data[i11 - 5] : this.f78366f4 : this.f78365f3 : this.f78364f2 : this.f78363f1 : this.f78362f0;
    }

    private static RuntimeException onEmptyStackTopRead() {
        throw new RuntimeException("Empty stack");
    }

    private static RuntimeException onInvalidIndex(int i11, int i12) {
        throw new IndexOutOfBoundsException(i11 + " ∉ [0, " + i12 + ')');
    }

    private static RuntimeException onSeledMutation() {
        throw new IllegalStateException("Attempt to modify sealed array");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int i11 = this.size;
        if (i11 > 5) {
            this.data = new Object[i11 - 5];
        }
        for (int i12 = 0; i12 != i11; i12++) {
            setImpl(i12, objectInputStream.readObject());
        }
    }

    private void setImpl(int i11, Object obj) {
        if (i11 == 0) {
            this.f78362f0 = obj;
            return;
        }
        if (i11 == 1) {
            this.f78363f1 = obj;
            return;
        }
        if (i11 == 2) {
            this.f78364f2 = obj;
            return;
        }
        if (i11 == 3) {
            this.f78365f3 = obj;
        } else if (i11 != 4) {
            this.data[i11 - 5] = obj;
        } else {
            this.f78366f4 = obj;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int i11 = this.size;
        for (int i12 = 0; i12 != i11; i12++) {
            objectOutputStream.writeObject(getImpl(i12));
        }
    }

    public final void add(Object obj) {
        if (this.sealed) {
            throw onSeledMutation();
        }
        int i11 = this.size;
        if (i11 >= 5) {
            ensureCapacity(i11 + 1);
        }
        this.size = i11 + 1;
        setImpl(i11, obj);
    }

    public final void clear() {
        if (this.sealed) {
            throw onSeledMutation();
        }
        int i11 = this.size;
        for (int i12 = 0; i12 != i11; i12++) {
            setImpl(i12, null);
        }
        this.size = 0;
    }

    public final Object get(int i11) {
        if (i11 < 0 || i11 >= this.size) {
            throw onInvalidIndex(i11, this.size);
        }
        return getImpl(i11);
    }

    public int indexOf(Object obj) {
        int i11 = this.size;
        for (int i12 = 0; i12 != i11; i12++) {
            Object impl = getImpl(i12);
            if (impl == obj || (impl != null && impl.equals(obj))) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isSealed() {
        return this.sealed;
    }

    public int lastIndexOf(Object obj) {
        int i11 = this.size;
        while (i11 != 0) {
            i11--;
            Object impl = getImpl(i11);
            if (impl == obj || (impl != null && impl.equals(obj))) {
                return i11;
            }
        }
        return -1;
    }

    public final Object peek() {
        int i11 = this.size;
        if (i11 != 0) {
            return getImpl(i11 - 1);
        }
        throw onEmptyStackTopRead();
    }

    public final Object pop() {
        Object obj;
        if (this.sealed) {
            throw onSeledMutation();
        }
        int i11 = this.size;
        int i12 = i11 - 1;
        if (i12 == -1) {
            throw onEmptyStackTopRead();
        }
        if (i12 == 0) {
            obj = this.f78362f0;
            this.f78362f0 = null;
        } else if (i12 == 1) {
            obj = this.f78363f1;
            this.f78363f1 = null;
        } else if (i12 == 2) {
            obj = this.f78364f2;
            this.f78364f2 = null;
        } else if (i12 == 3) {
            obj = this.f78365f3;
            this.f78365f3 = null;
        } else if (i12 != 4) {
            Object[] objArr = this.data;
            int i13 = i11 - 6;
            obj = objArr[i13];
            objArr[i13] = null;
        } else {
            obj = this.f78366f4;
            this.f78366f4 = null;
        }
        this.size = i12;
        return obj;
    }

    public final void push(Object obj) {
        add(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r8 != 4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remove(int r8) {
        /*
            r7 = this;
            int r0 = r7.size
            if (r8 < 0) goto L68
            if (r8 >= r0) goto L68
            boolean r1 = r7.sealed
            if (r1 != 0) goto L63
            int r1 = r0 + (-1)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 4
            r6 = 0
            if (r8 == 0) goto L1c
            if (r8 == r4) goto L25
            if (r8 == r3) goto L2e
            if (r8 == r2) goto L37
            if (r8 == r5) goto L40
            goto L4d
        L1c:
            if (r1 != 0) goto L21
            r7.f78362f0 = r6
            goto L60
        L21:
            java.lang.Object r8 = r7.f78363f1
            r7.f78362f0 = r8
        L25:
            if (r1 != r4) goto L2a
            r7.f78363f1 = r6
            goto L60
        L2a:
            java.lang.Object r8 = r7.f78364f2
            r7.f78363f1 = r8
        L2e:
            if (r1 != r3) goto L33
            r7.f78364f2 = r6
            goto L60
        L33:
            java.lang.Object r8 = r7.f78365f3
            r7.f78364f2 = r8
        L37:
            if (r1 != r2) goto L3c
            r7.f78365f3 = r6
            goto L60
        L3c:
            java.lang.Object r8 = r7.f78366f4
            r7.f78365f3 = r8
        L40:
            if (r1 != r5) goto L45
            r7.f78366f4 = r6
            goto L60
        L45:
            java.lang.Object[] r8 = r7.data
            r2 = 0
            r8 = r8[r2]
            r7.f78366f4 = r8
            r8 = 5
        L4d:
            if (r8 == r1) goto L5a
            java.lang.Object[] r2 = r7.data
            int r3 = r8 + (-5)
            int r4 = r8 + (-4)
            int r8 = r1 - r8
            java.lang.System.arraycopy(r2, r4, r2, r3, r8)
        L5a:
            java.lang.Object[] r8 = r7.data
            int r0 = r0 + (-6)
            r8[r0] = r6
        L60:
            r7.size = r1
            return
        L63:
            java.lang.RuntimeException r8 = onSeledMutation()
            throw r8
        L68:
            java.lang.RuntimeException r8 = onInvalidIndex(r8, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ObjArray.remove(int):void");
    }

    public final void seal() {
        this.sealed = true;
    }

    public final void set(int i11, Object obj) {
        if (i11 < 0 || i11 >= this.size) {
            throw onInvalidIndex(i11, this.size);
        }
        if (this.sealed) {
            throw onSeledMutation();
        }
        setImpl(i11, obj);
    }

    public final void setSize(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (this.sealed) {
            throw onSeledMutation();
        }
        int i12 = this.size;
        if (i11 < i12) {
            for (int i13 = i11; i13 != i12; i13++) {
                setImpl(i13, null);
            }
        } else if (i11 > i12 && i11 > 5) {
            ensureCapacity(i11);
        }
        this.size = i11;
    }

    public final int size() {
        return this.size;
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[this.size];
        toArray(objArr, 0);
        return objArr;
    }

    public final void toArray(Object[] objArr) {
        toArray(objArr, 0);
    }

    public final void toArray(Object[] objArr, int i11) {
        int i12 = this.size;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                System.arraycopy(this.data, 0, objArr, i11 + 5, i12 - 5);
                            }
                            objArr[i11 + 4] = this.f78366f4;
                        }
                        objArr[i11 + 3] = this.f78365f3;
                    }
                    objArr[i11 + 2] = this.f78364f2;
                }
                objArr[i11 + 1] = this.f78363f1;
            }
            objArr[i11] = this.f78362f0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r8 != 4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.size
            r1 = 1
            if (r8 < 0) goto L6d
            if (r8 > r0) goto L6d
            boolean r2 = r7.sealed
            if (r2 != 0) goto L68
            r2 = 3
            r3 = 2
            r4 = 5
            r5 = 4
            if (r8 == 0) goto L1a
            if (r8 == r1) goto L24
            if (r8 == r3) goto L2e
            if (r8 == r2) goto L38
            if (r8 == r5) goto L42
            goto L4d
        L1a:
            if (r0 != 0) goto L1f
            r7.f78362f0 = r9
            goto L64
        L1f:
            java.lang.Object r8 = r7.f78362f0
            r7.f78362f0 = r9
            r9 = r8
        L24:
            if (r0 != r1) goto L29
            r7.f78363f1 = r9
            goto L64
        L29:
            java.lang.Object r8 = r7.f78363f1
            r7.f78363f1 = r9
            r9 = r8
        L2e:
            if (r0 != r3) goto L33
            r7.f78364f2 = r9
            goto L64
        L33:
            java.lang.Object r8 = r7.f78364f2
            r7.f78364f2 = r9
            r9 = r8
        L38:
            if (r0 != r2) goto L3d
            r7.f78365f3 = r9
            goto L64
        L3d:
            java.lang.Object r8 = r7.f78365f3
            r7.f78365f3 = r9
            r9 = r8
        L42:
            if (r0 != r5) goto L47
            r7.f78366f4 = r9
            goto L64
        L47:
            java.lang.Object r8 = r7.f78366f4
            r7.f78366f4 = r9
            r9 = r8
            r8 = r4
        L4d:
            int r2 = r0 + 1
            r7.ensureCapacity(r2)
            if (r8 == r0) goto L5f
            java.lang.Object[] r2 = r7.data
            int r3 = r8 + (-5)
            int r5 = r8 + (-4)
            int r6 = r0 - r8
            java.lang.System.arraycopy(r2, r3, r2, r5, r6)
        L5f:
            java.lang.Object[] r2 = r7.data
            int r8 = r8 - r4
            r2[r8] = r9
        L64:
            int r0 = r0 + r1
            r7.size = r0
            return
        L68:
            java.lang.RuntimeException r8 = onSeledMutation()
            throw r8
        L6d:
            int r0 = r0 + r1
            java.lang.RuntimeException r8 = onInvalidIndex(r8, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ObjArray.add(int, java.lang.Object):void");
    }
}
