package y1;

import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends x1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f98987f = "spotLights";

    /* renamed from: g, reason: collision with root package name */
    public static final long f98988g = x1.a.e(f98987f);

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a2.h> f98989e;

    public i() {
        super(f98988g);
        this.f98989e = new com.badlogic.gdx.utils.a<>(1);
    }

    public static final boolean i(long j11) {
        return (f98988g & j11) == j11;
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
    public i a() {
        return new i(this);
    }

    @Override // x1.a
    public int hashCode() {
        int hashCode = super.hashCode();
        a.b<a2.h> it = this.f98989e.iterator();
        while (it.hasNext()) {
            a2.h next = it.next();
            hashCode = (hashCode * 1237) + (next == null ? 0 : next.hashCode());
        }
        return hashCode;
    }

    public i(i iVar) {
        this();
        this.f98989e.g(iVar.f98989e);
    }
}
