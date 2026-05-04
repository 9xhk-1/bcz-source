package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import n10.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n20.c f67200a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67201b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67202c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final n20.b f67203d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends e {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final a f67204e = new a();

        public a() {
            super(o.A, "Function", false, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends e {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final b f67205e = new b();

        public b() {
            super(o.f74026x, "KFunction", true, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends e {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final c f67206e = new c();

        public c() {
            super(o.f74026x, "KSuspendFunction", true, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends e {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final d f67207e = new d();

        public d() {
            super(o.f74021s, "SuspendFunction", false, null);
        }
    }

    public e(@k n20.c packageFqName, @k String classNamePrefix, boolean z11, @l n20.b bVar) {
        g0.p(packageFqName, "packageFqName");
        g0.p(classNamePrefix, "classNamePrefix");
        this.f67200a = packageFqName;
        this.f67201b = classNamePrefix;
        this.f67202c = z11;
        this.f67203d = bVar;
    }

    @k
    public final String a() {
        return this.f67201b;
    }

    @k
    public final n20.c b() {
        return this.f67200a;
    }

    @k
    public final n20.f c(int i11) {
        n20.f f11 = n20.f.f(this.f67201b + i11);
        g0.o(f11, "identifier(...)");
        return f11;
    }

    @k
    public String toString() {
        return this.f67200a + '.' + this.f67201b + 'N';
    }
}
