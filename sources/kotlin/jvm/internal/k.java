package kotlin.jvm.internal;

import a00.y1;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k extends y1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final short[] f66998a;

    /* renamed from: b, reason: collision with root package name */
    public int f66999b;

    public k(@m80.k short[] array) {
        g0.p(array, "array");
        this.f66998a = array;
    }

    @Override // a00.y1
    public short b() {
        try {
            short[] sArr = this.f66998a;
            int i11 = this.f66999b;
            this.f66999b = i11 + 1;
            return sArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66999b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66999b < this.f66998a.length;
    }
}
