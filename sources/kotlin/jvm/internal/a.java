package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends a00.c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final boolean[] f66961a;

    /* renamed from: b, reason: collision with root package name */
    public int f66962b;

    public a(@m80.k boolean[] array) {
        g0.p(array, "array");
        this.f66961a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66962b < this.f66961a.length;
    }

    @Override // a00.c0
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f66961a;
            int i11 = this.f66962b;
            this.f66962b = i11 + 1;
            return zArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66962b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }
}
