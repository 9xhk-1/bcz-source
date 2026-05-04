package rx;

import rx.exceptions.MissingBackpressureException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f84851a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f84852b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f84853c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f84854d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rx.a$a, reason: collision with other inner class name */
    public static final class C1062a implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final C1062a f84855a = new C1062a();

        @Override // rx.a.d
        public boolean a() {
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f84856a = new b();

        @Override // rx.a.d
        public boolean a() {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f84857a = new c();

        @Override // rx.a.d
        public boolean a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        boolean a() throws MissingBackpressureException;
    }

    static {
        c cVar = c.f84857a;
        f84851a = cVar;
        f84852b = cVar;
        f84853c = b.f84856a;
        f84854d = C1062a.f84855a;
    }

    public a() {
        throw new IllegalStateException("No instances!");
    }
}
