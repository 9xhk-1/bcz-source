package g10;

import a00.d1;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f52522a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52523b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52524c;

    /* renamed from: d, reason: collision with root package name */
    public int f52525d;

    public k(int i11, int i12, int i13) {
        this.f52522a = i13;
        this.f52523b = i12;
        boolean z11 = false;
        if (i13 <= 0 ? i11 >= i12 : i11 <= i12) {
            z11 = true;
        }
        this.f52524c = z11;
        this.f52525d = z11 ? i11 : i12;
    }

    public final int a() {
        return this.f52522a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52524c;
    }

    @Override // a00.d1
    public int nextInt() {
        int i11 = this.f52525d;
        if (i11 != this.f52523b) {
            this.f52525d = this.f52522a + i11;
            return i11;
        }
        if (!this.f52524c) {
            throw new NoSuchElementException();
        }
        this.f52524c = false;
        return i11;
    }
}
