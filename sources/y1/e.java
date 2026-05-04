package y1;

import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends x1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f98973f = "directionalLights";

    /* renamed from: g, reason: collision with root package name */
    public static final long f98974g = x1.a.e(f98973f);

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a2.c> f98975e;

    public e() {
        super(f98974g);
        this.f98975e = new com.badlogic.gdx.utils.a<>(1);
    }

    public static final boolean i(long j11) {
        return (f98974g & j11) == j11;
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
    public e a() {
        return new e(this);
    }

    @Override // x1.a
    public int hashCode() {
        int hashCode = super.hashCode();
        a.b<a2.c> it = this.f98975e.iterator();
        while (it.hasNext()) {
            a2.c next = it.next();
            hashCode = (hashCode * 1229) + (next == null ? 0 : next.hashCode());
        }
        return hashCode;
    }

    public e(e eVar) {
        this();
        this.f98975e.g(eVar.f98975e);
    }
}
