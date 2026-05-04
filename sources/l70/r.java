package l70;

import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f70719a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70720b;

    /* renamed from: c, reason: collision with root package name */
    public int f70721c;

    public r(int i11, int i12) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.f70719a = i11;
        this.f70720b = i12;
        this.f70721c = i11;
    }

    public boolean a() {
        return this.f70721c >= this.f70720b;
    }

    public int b() {
        return this.f70719a;
    }

    public int c() {
        return this.f70721c;
    }

    public int d() {
        return this.f70720b;
    }

    public void e(int i11) {
        if (i11 < this.f70719a) {
            throw new IndexOutOfBoundsException("pos: " + i11 + " < lowerBound: " + this.f70719a);
        }
        if (i11 <= this.f70720b) {
            this.f70721c = i11;
            return;
        }
        throw new IndexOutOfBoundsException("pos: " + i11 + " > upperBound: " + this.f70720b);
    }

    public String toString() {
        return '[' + Integer.toString(this.f70719a) + u0.f91710f + Integer.toString(this.f70721c) + u0.f91710f + Integer.toString(this.f70720b) + l50.b.f69930l;
    }
}
