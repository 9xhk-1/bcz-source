package rb;

import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final b f83933b = new a();

    /* renamed from: a, reason: collision with root package name */
    public b f83934a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements b {
        @Override // rb.e.b
        public q.a create() {
            return new q.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        q.a create();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final e f83935a = new e(null);
    }

    public /* synthetic */ e(a aVar) {
        this();
    }

    public static e b() {
        return c.f83935a;
    }

    public q.a a() {
        return this.f83934a.create();
    }

    public void c(b factory) {
        if (factory == null) {
            throw new NullPointerException("factory may not be null");
        }
        this.f83934a = factory;
    }

    public e() {
        this.f83934a = f83933b;
    }
}
