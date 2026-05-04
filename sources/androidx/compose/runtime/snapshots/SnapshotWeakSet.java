package androidx.compose.runtime.snapshots;

import a00.q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.o;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshotWeakSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n*L\n1#1,243:1\n27#2,2:244\n27#2,2:246\n27#2,2:248\n*S KotlinDebug\n*F\n+ 1 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n*L\n74#1:244,2\n80#1:246,2\n96#1:248,2\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;

    @k
    private int[] hashes = new int[16];

    @k
    private WeakReference<T>[] values = new WeakReference[16];

    private final int find(T t11, int i11) {
        int i12 = this.size - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = this.hashes[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    WeakReference<T> weakReference = this.values[i14];
                    return t11 == (weakReference != null ? weakReference.get() : null) ? i14 : findExactIndex(i14, t11, i11);
                }
                i12 = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findExactIndex(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.hashes
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            androidx.compose.runtime.internal.WeakReference<T>[] r2 = r3.values
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.hashes
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            androidx.compose.runtime.internal.WeakReference<T>[] r2 = r3.values
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotWeakSet.findExactIndex(int, java.lang.Object, int):int");
    }

    public final boolean add(@k T t11) {
        int i11;
        int i12 = this.size;
        int identityHashCode = Utils_jvmKt.identityHashCode(t11);
        if (i12 > 0) {
            i11 = find(t11, identityHashCode);
            if (i11 >= 0) {
                return false;
            }
        } else {
            i11 = -1;
        }
        int i13 = -(i11 + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i12 == length) {
            int i14 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i14];
            int[] iArr = new int[i14];
            int i15 = i13 + 1;
            System.arraycopy(weakReferenceArr, i13, weakReferenceArr2, i15, i12 - i13);
            System.arraycopy(this.values, 0, weakReferenceArr2, 0, i13);
            q.z0(this.hashes, iArr, i15, i13, i12);
            q.I0(this.hashes, iArr, 0, 0, i13, 6, null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i16 = i13 + 1;
            System.arraycopy(weakReferenceArr, i13, weakReferenceArr, i16, i12 - i13);
            int[] iArr2 = this.hashes;
            q.z0(iArr2, iArr2, i16, i13, i12);
        }
        this.values[i13] = new WeakReference<>(t11);
        this.hashes[i13] = identityHashCode;
        this.size++;
        return true;
    }

    @k
    public final int[] getHashes$runtime_release() {
        return this.hashes;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    @k
    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    @o
    public final boolean isValid$runtime_release() {
        WeakReference<T> weakReference;
        int i11 = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i11 > length) {
            return false;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = iArr[i13];
            if (i14 < i12 || (weakReference = weakReferenceArr[i13]) == null) {
                return false;
            }
            T t11 = weakReference.get();
            if (t11 != null && i14 != Utils_jvmKt.identityHashCode(t11)) {
                return false;
            }
            i13++;
            i12 = i14;
        }
        while (i11 < length) {
            if (iArr[i11] != 0 || weakReferenceArr[i11] != null) {
                return false;
            }
            i11++;
        }
        return true;
    }

    public final void removeIf(@k l<? super T, Boolean> lVar) {
        int size$runtime_release = getSize$runtime_release();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= size$runtime_release) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime_release()[i11];
            T t11 = weakReference != null ? weakReference.get() : null;
            if (t11 != null && !lVar.invoke(t11).booleanValue()) {
                if (i12 != i11) {
                    getValues$runtime_release()[i12] = weakReference;
                    getHashes$runtime_release()[i12] = getHashes$runtime_release()[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < size$runtime_release; i13++) {
            getValues$runtime_release()[i13] = null;
            getHashes$runtime_release()[i13] = 0;
        }
        if (i12 != size$runtime_release) {
            setSize$runtime_release(i12);
        }
    }

    public final void setHashes$runtime_release(@k int[] iArr) {
        this.hashes = iArr;
    }

    public final void setSize$runtime_release(int i11) {
        this.size = i11;
    }

    public final void setValues$runtime_release(@k WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }
}
