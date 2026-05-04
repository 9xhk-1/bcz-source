package y1;

import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends x1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f98984f = "pointLights";

    /* renamed from: g, reason: collision with root package name */
    public static final long f98985g = x1.a.e(f98984f);

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a2.e> f98986e;

    public h() {
        super(f98985g);
        this.f98986e = new com.badlogic.gdx.utils.a<>(1);
    }

    public static final boolean i(long j11) {
        return (f98985g & j11) == j11;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1.a aVar) {
        long j11 = this.f97002a;
        long j12 = aVar.f97002a;
        if (j11 != j12) {
            return j11 < j12 ? -1 : 1;
        }
        return 0;
    }

    @Override // x1.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public h a() {
        return new h(this);
    }

    @Override // x1.a
    public int hashCode() {
        int hashCode = super.hashCode();
        a.b<a2.e> it = this.f98986e.iterator();
        while (it.hasNext()) {
            a2.e next = it.next();
            hashCode = (hashCode * 1231) + (next == null ? 0 : next.hashCode());
        }
        return hashCode;
    }

    public h(h hVar) {
        this();
        this.f98986e.g(hVar.f98986e);
    }
}
