package h40;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s0<T> {

    @m80.k
    private volatile AtomicReferenceArray<T> array;

    public s0(int i11) {
        this.array = new AtomicReferenceArray<>(i11);
    }

    public final int a() {
        return this.array.length();
    }

    @m80.l
    public final T b(int i11) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i11 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i11);
        }
        return null;
    }

    public final void c(int i11, @m80.l T t11) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i11 < length) {
            atomicReferenceArray.set(i11, t11);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(g10.u.u(i11 + 1, length * 2));
        for (int i12 = 0; i12 < length; i12++) {
            atomicReferenceArray2.set(i12, atomicReferenceArray.get(i12));
        }
        atomicReferenceArray2.set(i11, t11);
        this.array = atomicReferenceArray2;
    }
}
