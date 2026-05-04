package ol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f77549a;

    public b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f77549a = str;
    }

    public abstract b h();

    public String i() {
        return this.f77549a;
    }

    public String toString() {
        return this.f77549a;
    }

    public b(b bVar) {
        this.f77549a = bVar.f77549a;
    }
}
