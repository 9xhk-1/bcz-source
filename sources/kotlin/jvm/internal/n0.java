package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class n0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f67005a;

    /* renamed from: b, reason: collision with root package name */
    public int f67006b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final T[] f67007c;

    public n0(int i11) {
        this.f67005a = i11;
        this.f67007c = (T[]) new Object[i11];
    }

    public final void a(@m80.k T spreadArgument) {
        g0.p(spreadArgument, "spreadArgument");
        T[] tArr = this.f67007c;
        int i11 = this.f67006b;
        this.f67006b = i11 + 1;
        tArr[i11] = spreadArgument;
    }

    public final int b() {
        return this.f67006b;
    }

    public abstract int c(@m80.k T t11);

    public final void e(int i11) {
        this.f67006b = i11;
    }

    public final int f() {
        int i11 = this.f67005a - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int i13 = 0;
            while (true) {
                T t11 = this.f67007c[i13];
                i12 += t11 != null ? c(t11) : 1;
                if (i13 == i11) {
                    break;
                }
                i13++;
            }
        }
        return i12;
    }

    @m80.k
    public final T g(@m80.k T values, @m80.k T result) {
        int i11;
        g0.p(values, "values");
        g0.p(result, "result");
        int i12 = this.f67005a - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int i14 = 0;
            int i15 = 0;
            i11 = 0;
            while (true) {
                T t11 = this.f67007c[i14];
                if (t11 != null) {
                    if (i15 < i14) {
                        int i16 = i14 - i15;
                        System.arraycopy(values, i15, result, i11, i16);
                        i11 += i16;
                    }
                    int c11 = c(t11);
                    System.arraycopy(t11, 0, result, i11, c11);
                    i11 += c11;
                    i15 = i14 + 1;
                }
                if (i14 == i12) {
                    break;
                }
                i14++;
            }
            i13 = i15;
        } else {
            i11 = 0;
        }
        int i17 = this.f67005a;
        if (i13 < i17) {
            System.arraycopy(values, i13, result, i11, i17 - i13);
        }
        return result;
    }

    public static /* synthetic */ void d() {
    }
}
