package g10;

import java.util.Iterator;
import yz.s1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.5")
/* loaded from: classes8.dex */
public class v implements Iterable<s1>, y00.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f52542d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f52543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52545c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final v a(int i11, int i12, int i13) {
            return new v(i11, i12, i13, null);
        }

        public a() {
        }
    }

    public /* synthetic */ v(int i11, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, i12, i13);
    }

    public final int d() {
        return this.f52543a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (isEmpty() && ((v) obj).isEmpty()) {
            return true;
        }
        v vVar = (v) obj;
        return this.f52543a == vVar.f52543a && this.f52544b == vVar.f52544b && this.f52545c == vVar.f52545c;
    }

    public final int f() {
        return this.f52544b;
    }

    public final int g() {
        return this.f52545c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f52543a * 31) + this.f52544b) * 31) + this.f52545c;
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        if (this.f52545c > 0) {
            compare2 = Integer.compare(this.f52543a ^ Integer.MIN_VALUE, this.f52544b ^ Integer.MIN_VALUE);
            return compare2 > 0;
        }
        compare = Integer.compare(this.f52543a ^ Integer.MIN_VALUE, this.f52544b ^ Integer.MIN_VALUE);
        return compare < 0;
    }

    @Override // java.lang.Iterable
    @m80.k
    public final Iterator<s1> iterator() {
        return new w(this.f52543a, this.f52544b, this.f52545c, null);
    }

    @m80.k
    public String toString() {
        StringBuilder sb2;
        int i11;
        if (this.f52545c > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) s1.h0(this.f52543a));
            sb2.append(zr.m.f102856e);
            sb2.append((Object) s1.h0(this.f52544b));
            sb2.append(" step ");
            i11 = this.f52545c;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) s1.h0(this.f52543a));
            sb2.append(" downTo ");
            sb2.append((Object) s1.h0(this.f52544b));
            sb2.append(" step ");
            i11 = -this.f52545c;
        }
        sb2.append(i11);
        return sb2.toString();
    }

    public v(int i11, int i12, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i13 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f52543a = i11;
        this.f52544b = o00.t.d(i11, i12, i13);
        this.f52545c = i13;
    }
}
