package xu;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements gv.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f98347a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f98348b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final f f98349c;

    public d(f componentCreator) {
        this.f98349c = componentCreator;
    }

    @Override // gv.c
    public Object generatedComponent() {
        if (this.f98347a == null) {
            synchronized (this.f98348b) {
                try {
                    if (this.f98347a == null) {
                        this.f98347a = this.f98349c.get();
                    }
                } finally {
                }
            }
        }
        return this.f98347a;
    }
}
