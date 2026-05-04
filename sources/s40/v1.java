package s40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v1 extends u40.y<j3> {

    /* renamed from: d, reason: collision with root package name */
    public final int f87798d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87799e;

    public /* synthetic */ v1(int i11, boolean z11, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, (i12 & 2) != 0 ? false : z11);
    }

    @Override // u40.l
    @m80.k
    public String d() {
        String str = "yearTwoDigits(" + this.f87798d + ')';
        if (!this.f87799e) {
            return str;
        }
        return str + o3.f87744a;
    }

    public final int e() {
        return this.f87798d;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f87798d == v1Var.f87798d && this.f87799e == v1Var.f87799e;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f87798d) * 31) + Boolean.hashCode(this.f87799e);
    }

    public v1(int i11, boolean z11) {
        super(k3.f87706a.b(), 2, i11);
        this.f87798d = i11;
        this.f87799e = z11;
    }
}
