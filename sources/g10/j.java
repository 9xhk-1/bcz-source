package g10;

import a00.d1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j implements Iterable<Integer>, y00.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f52518d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f52519a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52521c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final j a(int i11, int i12, int i13) {
            return new j(i11, i12, i13);
        }

        public a() {
        }
    }

    public j(int i11, int i12, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i13 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f52519a = i11;
        this.f52520b = o00.o.c(i11, i12, i13);
        this.f52521c = i13;
    }

    public final int d() {
        return this.f52519a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return this.f52519a == jVar.f52519a && this.f52520b == jVar.f52520b && this.f52521c == jVar.f52521c;
    }

    public final int f() {
        return this.f52520b;
    }

    public final int g() {
        return this.f52521c;
    }

    @Override // java.lang.Iterable
    @m80.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public d1 iterator() {
        return new k(this.f52519a, this.f52520b, this.f52521c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f52519a * 31) + this.f52520b) * 31) + this.f52521c;
    }

    public boolean isEmpty() {
        return this.f52521c > 0 ? this.f52519a > this.f52520b : this.f52519a < this.f52520b;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2;
        int i11;
        if (this.f52521c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f52519a);
            sb2.append(zr.m.f102856e);
            sb2.append(this.f52520b);
            sb2.append(" step ");
            i11 = this.f52521c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f52519a);
            sb2.append(" downTo ");
            sb2.append(this.f52520b);
            sb2.append(" step ");
            i11 = -this.f52521c;
        }
        sb2.append(i11);
        return sb2.toString();
    }
}
