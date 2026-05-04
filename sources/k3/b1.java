package k3;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65228a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<String, String> f65229b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final byte[] f65230c;

    public b1(int i11, @m80.k Map<String, String> headers, @m80.l byte[] bArr) {
        kotlin.jvm.internal.g0.p(headers, "headers");
        this.f65228a = i11;
        this.f65229b = headers;
        this.f65230c = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b1 e(b1 b1Var, int i11, Map map, byte[] bArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = b1Var.f65228a;
        }
        if ((i12 & 2) != 0) {
            map = b1Var.f65229b;
        }
        if ((i12 & 4) != 0) {
            bArr = b1Var.f65230c;
        }
        return b1Var.d(i11, map, bArr);
    }

    public final int a() {
        return this.f65228a;
    }

    @m80.k
    public final Map<String, String> b() {
        return this.f65229b;
    }

    @m80.l
    public final byte[] c() {
        return this.f65230c;
    }

    @m80.k
    public final b1 d(int i11, @m80.k Map<String, String> headers, @m80.l byte[] bArr) {
        kotlin.jvm.internal.g0.p(headers, "headers");
        return new b1(i11, headers, bArr);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f65228a == b1Var.f65228a && kotlin.jvm.internal.g0.g(this.f65229b, b1Var.f65229b) && kotlin.jvm.internal.g0.g(this.f65230c, b1Var.f65230c);
    }

    @m80.l
    public final byte[] f() {
        return this.f65230c;
    }

    public final int g() {
        return this.f65228a;
    }

    @m80.k
    public final Map<String, String> h() {
        return this.f65229b;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f65228a) * 31) + this.f65229b.hashCode()) * 31;
        byte[] bArr = this.f65230c;
        return hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @m80.k
    public String toString() {
        return "H5EnhanceResponse(code=" + this.f65228a + ", headers=" + this.f65229b + ", body=" + Arrays.toString(this.f65230c) + ')';
    }

    public /* synthetic */ b1(int i11, Map map, byte[] bArr, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, (i12 & 2) != 0 ? a00.l1.z() : map, bArr);
    }
}
