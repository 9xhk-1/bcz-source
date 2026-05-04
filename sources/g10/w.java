package g10;

import java.util.Iterator;
import java.util.NoSuchElementException;
import yz.s1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public final class w implements Iterator<s1>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f52546a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52547b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52548c;

    /* renamed from: d, reason: collision with root package name */
    public int f52549d;

    public /* synthetic */ w(int i11, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, i12, i13);
    }

    public int a() {
        int i11 = this.f52549d;
        if (i11 != this.f52546a) {
            this.f52549d = s1.i(this.f52548c + i11);
            return i11;
        }
        if (!this.f52547b) {
            throw new NoSuchElementException();
        }
        this.f52547b = false;
        return i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52547b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ s1 next() {
        return s1.b(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public w(int i11, int i12, int i13) {
        int compare;
        this.f52546a = i12;
        boolean z11 = false;
        compare = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
        if (i13 <= 0 ? compare >= 0 : compare <= 0) {
            z11 = true;
        }
        this.f52547b = z11;
        this.f52548c = s1.i(i13);
        this.f52549d = this.f52547b ? i11 : i12;
    }
}
