package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends a00.e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final char[] f66975a;

    /* renamed from: b, reason: collision with root package name */
    public int f66976b;

    public c(@m80.k char[] array) {
        g0.p(array, "array");
        this.f66975a = array;
    }

    @Override // a00.e0
    public char b() {
        try {
            char[] cArr = this.f66975a;
            int i11 = this.f66976b;
            this.f66976b = i11 + 1;
            return cArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66976b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66976b < this.f66975a.length;
    }
}
