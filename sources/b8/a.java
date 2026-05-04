package b8;

import java.util.Arrays;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6365a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6366b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6367c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final byte[] f6368d;

    public a(long j11, @m80.k String name, boolean z11, @m80.l byte[] bArr) {
        g0.p(name, "name");
        this.f6365a = j11;
        this.f6366b = name;
        this.f6367c = z11;
        this.f6368d = bArr;
    }

    public static /* synthetic */ a f(a aVar, long j11, String str, boolean z11, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aVar.f6365a;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = aVar.f6366b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = aVar.f6367c;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            bArr = aVar.f6368d;
        }
        return aVar.e(j12, str2, z12, bArr);
    }

    public final long a() {
        return this.f6365a;
    }

    @m80.k
    public final String b() {
        return this.f6366b;
    }

    public final boolean c() {
        return this.f6367c;
    }

    @m80.l
    public final byte[] d() {
        return this.f6368d;
    }

    @m80.k
    public final a e(long j11, @m80.k String name, boolean z11, @m80.l byte[] bArr) {
        g0.p(name, "name");
        return new a(j11, name, z11, bArr);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6365a == aVar.f6365a && g0.g(this.f6366b, aVar.f6366b) && this.f6367c == aVar.f6367c && g0.g(this.f6368d, aVar.f6368d);
    }

    public final boolean g() {
        return this.f6367c;
    }

    public final long h() {
        return this.f6365a;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.f6365a) * 31) + this.f6366b.hashCode()) * 31) + Boolean.hashCode(this.f6367c)) * 31;
        byte[] bArr = this.f6368d;
        return hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @m80.k
    public final String i() {
        return this.f6366b;
    }

    @m80.l
    public final byte[] j() {
        return this.f6368d;
    }

    @m80.k
    public String toString() {
        return "Test22(id=" + this.f6365a + ", name=" + this.f6366b + ", boy=" + this.f6367c + ", photo=" + Arrays.toString(this.f6368d) + ')';
    }
}
