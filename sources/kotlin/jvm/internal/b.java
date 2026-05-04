package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends a00.d0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final byte[] f66973a;

    /* renamed from: b, reason: collision with root package name */
    public int f66974b;

    public b(@m80.k byte[] array) {
        g0.p(array, "array");
        this.f66973a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66974b < this.f66973a.length;
    }

    @Override // a00.d0
    public byte nextByte() {
        try {
            byte[] bArr = this.f66973a;
            int i11 = this.f66974b;
            this.f66974b = i11 + 1;
            return bArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66974b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }
}
