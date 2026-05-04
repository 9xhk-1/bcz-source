package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends a00.v0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final float[] f66979a;

    /* renamed from: b, reason: collision with root package name */
    public int f66980b;

    public e(@m80.k float[] array) {
        g0.p(array, "array");
        this.f66979a = array;
    }

    @Override // a00.v0
    public float b() {
        try {
            float[] fArr = this.f66979a;
            int i11 = this.f66980b;
            this.f66980b = i11 + 1;
            return fArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66980b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66980b < this.f66979a.length;
    }
}
