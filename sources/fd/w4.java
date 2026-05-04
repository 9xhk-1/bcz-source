package fd;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class w4 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f51783d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f51784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51785b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f51786c;

    public w4(@m80.k String bookName, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        this.f51784a = bookName;
        this.f51785b = i11;
        this.f51786c = z11;
    }

    public static /* synthetic */ w4 e(w4 w4Var, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = w4Var.f51784a;
        }
        if ((i12 & 2) != 0) {
            i11 = w4Var.f51785b;
        }
        if ((i12 & 4) != 0) {
            z11 = w4Var.f51786c;
        }
        return w4Var.d(str, i11, z11);
    }

    @m80.k
    public final String a() {
        return this.f51784a;
    }

    public final int b() {
        return this.f51785b;
    }

    public final boolean c() {
        return this.f51786c;
    }

    @m80.k
    public final w4 d(@m80.k String bookName, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        return new w4(bookName, i11, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return kotlin.jvm.internal.g0.g(this.f51784a, w4Var.f51784a) && this.f51785b == w4Var.f51785b && this.f51786c == w4Var.f51786c;
    }

    @m80.k
    public final String f() {
        return this.f51784a;
    }

    public final int g() {
        return this.f51785b;
    }

    public final boolean h() {
        return this.f51786c;
    }

    public int hashCode() {
        return (((this.f51784a.hashCode() * 31) + Integer.hashCode(this.f51785b)) * 31) + Boolean.hashCode(this.f51786c);
    }

    @m80.k
    public String toString() {
        return "TrainingInfo(bookName=" + this.f51784a + ", learntCount=" + this.f51785b + ", phraseEnabled=" + this.f51786c + pn.j.f81007d;
    }
}
