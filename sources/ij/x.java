package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final int f60666d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f60667a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<kj.a> f60668b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60669c;

    public x(int i11, @m80.k List<kj.a> books, int i12) {
        g0.p(books, "books");
        this.f60667a = i11;
        this.f60668b = books;
        this.f60669c = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x e(x xVar, int i11, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = xVar.f60667a;
        }
        if ((i13 & 2) != 0) {
            list = xVar.f60668b;
        }
        if ((i13 & 4) != 0) {
            i12 = xVar.f60669c;
        }
        return xVar.d(i11, list, i12);
    }

    public final int a() {
        return this.f60667a;
    }

    @m80.k
    public final List<kj.a> b() {
        return this.f60668b;
    }

    public final int c() {
        return this.f60669c;
    }

    @m80.k
    public final x d(int i11, @m80.k List<kj.a> books, int i12) {
        g0.p(books, "books");
        return new x(i11, books, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f60667a == xVar.f60667a && g0.g(this.f60668b, xVar.f60668b) && this.f60669c == xVar.f60669c;
    }

    @m80.k
    public final List<kj.a> f() {
        return this.f60668b;
    }

    public final int g() {
        return this.f60669c;
    }

    public final int h() {
        return this.f60667a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f60667a) * 31) + this.f60668b.hashCode()) * 31) + Integer.hashCode(this.f60669c);
    }

    @m80.k
    public String toString() {
        return "WordBooksInfo(maxLimit=" + this.f60667a + ", books=" + this.f60668b + ", copperLimit=" + this.f60669c + pn.j.f81007d;
    }

    public /* synthetic */ x(int i11, List list, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, list, (i13 & 4) != 0 ? 0 : i12);
    }
}
