package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d extends a00.s0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final double[] f66977a;

    /* renamed from: b, reason: collision with root package name */
    public int f66978b;

    public d(@m80.k double[] array) {
        g0.p(array, "array");
        this.f66977a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66978b < this.f66977a.length;
    }

    @Override // a00.s0
    public double nextDouble() {
        try {
            double[] dArr = this.f66977a;
            int i11 = this.f66978b;
            this.f66978b = i11 + 1;
            return dArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66978b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }
}
