package g10;

import a00.e0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a implements Iterable<Character>, y00.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final C0622a f52498d = new C0622a(null);

    /* renamed from: a, reason: collision with root package name */
    public final char f52499a;

    /* renamed from: b, reason: collision with root package name */
    public final char f52500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52501c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: g10.a$a, reason: collision with other inner class name */
    public static final class C0622a {
        public /* synthetic */ C0622a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final a a(char c11, char c12, int i11) {
            return new a(c11, c12, i11);
        }

        public C0622a() {
        }
    }

    public a(char c11, char c12, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f52499a = c11;
        this.f52500b = (char) o00.o.c(c11, c12, i11);
        this.f52501c = i11;
    }

    public final char d() {
        return this.f52499a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f52499a == aVar.f52499a && this.f52500b == aVar.f52500b && this.f52501c == aVar.f52501c;
    }

    public final char f() {
        return this.f52500b;
    }

    public final int g() {
        return this.f52501c;
    }

    @Override // java.lang.Iterable
    @m80.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e0 iterator() {
        return new b(this.f52499a, this.f52500b, this.f52501c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f52499a * to.c.f90845b) + this.f52500b) * 31) + this.f52501c;
    }

    public boolean isEmpty() {
        return this.f52501c > 0 ? g0.t(this.f52499a, this.f52500b) > 0 : g0.t(this.f52499a, this.f52500b) < 0;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2;
        int i11;
        if (this.f52501c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f52499a);
            sb2.append(zr.m.f102856e);
            sb2.append(this.f52500b);
            sb2.append(" step ");
            i11 = this.f52501c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f52499a);
            sb2.append(" downTo ");
            sb2.append(this.f52500b);
            sb2.append(" step ");
            i11 = -this.f52501c;
        }
        sb2.append(i11);
        return sb2.toString();
    }
}
