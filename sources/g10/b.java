package g10;

import a00.e0;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f52504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52505b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52506c;

    /* renamed from: d, reason: collision with root package name */
    public int f52507d;

    public b(char c11, char c12, int i11) {
        this.f52504a = i11;
        this.f52505b = c12;
        boolean z11 = false;
        if (i11 <= 0 ? g0.t(c11, c12) >= 0 : g0.t(c11, c12) <= 0) {
            z11 = true;
        }
        this.f52506c = z11;
        this.f52507d = z11 ? c11 : c12;
    }

    @Override // a00.e0
    public char b() {
        int i11 = this.f52507d;
        if (i11 != this.f52505b) {
            this.f52507d = this.f52504a + i11;
        } else {
            if (!this.f52506c) {
                throw new NoSuchElementException();
            }
            this.f52506c = false;
        }
        return (char) i11;
    }

    public final int c() {
        return this.f52504a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52506c;
    }
}
