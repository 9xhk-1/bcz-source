package kotlin.jvm.internal;

import a00.d1;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends d1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final int[] f66986a;

    /* renamed from: b, reason: collision with root package name */
    public int f66987b;

    public f(@m80.k int[] array) {
        g0.p(array, "array");
        this.f66986a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66987b < this.f66986a.length;
    }

    @Override // a00.d1
    public int nextInt() {
        try {
            int[] iArr = this.f66986a;
            int i11 = this.f66987b;
            this.f66987b = i11 + 1;
            return iArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66987b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }
}
