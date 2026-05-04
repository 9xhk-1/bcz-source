package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f69559a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69560b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69561c;

    public k(int i11, int i12, int i13) {
        this.f69559a = i11;
        this.f69560b = i12;
        this.f69561c = i13;
    }

    public static /* synthetic */ k e(k kVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = kVar.f69559a;
        }
        if ((i14 & 2) != 0) {
            i12 = kVar.f69560b;
        }
        if ((i14 & 4) != 0) {
            i13 = kVar.f69561c;
        }
        return kVar.d(i11, i12, i13);
    }

    public final int a() {
        return this.f69559a;
    }

    public final int b() {
        return this.f69560b;
    }

    public final int c() {
        return this.f69561c;
    }

    @m80.k
    public final k d(int i11, int i12, int i13) {
        return new k(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f69559a == kVar.f69559a && this.f69560b == kVar.f69560b && this.f69561c == kVar.f69561c;
    }

    public final int f() {
        return this.f69561c;
    }

    public final int g() {
        return this.f69560b;
    }

    public final int h() {
        return this.f69559a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f69559a) * 31) + Integer.hashCode(this.f69560b)) * 31) + Integer.hashCode(this.f69561c);
    }

    @m80.k
    public String toString() {
        return "BuddyRecordData(ipType=" + this.f69559a + ", ipLevel=" + this.f69560b + ", ipExp=" + this.f69561c + ')';
    }
}
