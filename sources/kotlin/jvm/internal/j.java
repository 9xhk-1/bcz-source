package kotlin.jvm.internal;

import a00.e1;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j extends e1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final long[] f66991a;

    /* renamed from: b, reason: collision with root package name */
    public int f66992b;

    public j(@m80.k long[] array) {
        g0.p(array, "array");
        this.f66991a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66992b < this.f66991a.length;
    }

    @Override // a00.e1
    public long nextLong() {
        try {
            long[] jArr = this.f66991a;
            int i11 = this.f66992b;
            this.f66992b = i11 + 1;
            return jArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66992b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }
}
