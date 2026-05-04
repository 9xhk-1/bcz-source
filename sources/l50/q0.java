package l50;

import h50.n;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public Object[] f70051a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public int[] f70052b;

    /* renamed from: c, reason: collision with root package name */
    public int f70053c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f70054a = new a();
    }

    public q0() {
        int[] iArr = new int[8];
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = -1;
        }
        this.f70052b = iArr;
        this.f70053c = -1;
    }

    @m80.k
    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i11 = this.f70053c + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = this.f70051a[i12];
            if (obj instanceof h50.f) {
                h50.f fVar = (h50.f) obj;
                if (!kotlin.jvm.internal.g0.g(fVar.getKind(), n.b.f58542a)) {
                    int i13 = this.f70052b[i12];
                    if (i13 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.i(i13));
                    }
                } else if (this.f70052b[i12] != -1) {
                    sb2.append("[");
                    sb2.append(this.f70052b[i12]);
                    sb2.append("]");
                }
            } else if (obj != a.f70054a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        return sb2.toString();
    }

    public final void b() {
        int i11 = this.f70053c;
        int[] iArr = this.f70052b;
        if (iArr[i11] == -2) {
            iArr[i11] = -1;
            this.f70053c = i11 - 1;
        }
        int i12 = this.f70053c;
        if (i12 != -1) {
            this.f70053c = i12 - 1;
        }
    }

    public final String c(Object obj) {
        String k11;
        h50.f fVar = obj instanceof h50.f ? (h50.f) obj : null;
        return (fVar == null || (k11 = fVar.k()) == null) ? String.valueOf(obj) : k11;
    }

    public final void d(@m80.k h50.f sd2) {
        kotlin.jvm.internal.g0.p(sd2, "sd");
        int i11 = this.f70053c + 1;
        this.f70053c = i11;
        if (i11 == this.f70051a.length) {
            f();
        }
        this.f70051a[i11] = sd2;
    }

    public final void e() {
        int[] iArr = this.f70052b;
        int i11 = this.f70053c;
        if (iArr[i11] == -2) {
            this.f70051a[i11] = a.f70054a;
        }
    }

    public final void f() {
        int i11 = this.f70053c * 2;
        Object[] copyOf = Arrays.copyOf(this.f70051a, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        this.f70051a = copyOf;
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = -1;
        }
        a00.q.I0(this.f70052b, iArr, 0, 0, 0, 14, null);
        this.f70052b = iArr;
    }

    public final void g(@m80.l Object obj) {
        int[] iArr = this.f70052b;
        int i11 = this.f70053c;
        if (iArr[i11] != -2) {
            int i12 = i11 + 1;
            this.f70053c = i12;
            if (i12 == this.f70051a.length) {
                f();
            }
        }
        Object[] objArr = this.f70051a;
        int i13 = this.f70053c;
        objArr[i13] = obj;
        this.f70052b[i13] = -2;
    }

    public final void h(int i11) {
        this.f70052b[this.f70053c] = i11;
    }

    @m80.k
    public String toString() {
        return a();
    }
}
