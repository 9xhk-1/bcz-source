package y1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends x1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f98981f = "cullface";

    /* renamed from: g, reason: collision with root package name */
    public static final long f98982g = x1.a.e(f98981f);

    /* renamed from: e, reason: collision with root package name */
    public int f98983e;

    public g(long j11) {
        super(j11);
    }

    public static g g(int i11) {
        return new g(f98982g, i11);
    }

    @Override // x1.a
    public x1.a a() {
        return new g(this.f97002a, this.f98983e);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1.a aVar) {
        long j11 = this.f97002a;
        long j12 = aVar.f97002a;
        return j11 != j12 ? (int) (j11 - j12) : this.f98983e - ((g) aVar).f98983e;
    }

    @Override // x1.a
    public int hashCode() {
        return (super.hashCode() * 983) + this.f98983e;
    }

    public g(long j11, int i11) {
        super(j11);
        this.f98983e = i11;
    }
}
