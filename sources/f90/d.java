package f90;

import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "5.11", status = API.Status.EXPERIMENTAL)
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f51355a;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f51356b;

        public String d() {
            return this.f51355a;
        }

        @Override // f90.d
        public Object[] get() {
            return this.f51356b;
        }

        public String toString() {
            return d();
        }

        public b(String name, Object[] arguments) {
            ba0.c2.k(name, "name must not be null or blank");
            ba0.c2.r(arguments, "arguments array must not be null");
            this.f51355a = name;
            this.f51356b = arguments;
        }
    }

    @API(since = "5.11", status = API.Status.EXPERIMENTAL)
    static b a(String name, Object... arguments) {
        return new b(name, arguments);
    }

    static d c(Object... arguments) {
        return of(arguments);
    }

    static d of(final Object... arguments) {
        ba0.c2.r(arguments, "arguments array must not be null");
        return new d() { // from class: f90.c
            @Override // f90.d
            public final Object[] get() {
                return d.b(arguments);
            }
        };
    }

    Object[] get();

    static /* synthetic */ Object[] b(Object[] objArr) {
        return objArr;
    }
}
