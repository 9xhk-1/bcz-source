package i80;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f60346a;

    /* renamed from: b, reason: collision with root package name */
    public final n f60347b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f60348c = true;

    public p(Object obj, n nVar) {
        this.f60346a = obj;
        this.f60347b = nVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f60346a == pVar.f60346a && this.f60347b.equals(pVar.f60347b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f60346a.hashCode() + this.f60347b.f60328f.hashCode();
    }
}
