package t3;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f89242a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.app.preferences.a f89243a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final z f89244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k com.baicizhan.app.preferences.a factory, @m80.k z protocol) {
            super(null);
            g0.p(factory, "factory");
            g0.p(protocol, "protocol");
            this.f89243a = factory;
            this.f89244b = protocol;
        }

        public static /* synthetic */ c d(c cVar, com.baicizhan.app.preferences.a aVar, z zVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar = cVar.f89243a;
            }
            if ((i11 & 2) != 0) {
                zVar = cVar.f89244b;
            }
            return cVar.c(aVar, zVar);
        }

        @m80.k
        public final com.baicizhan.app.preferences.a a() {
            return this.f89243a;
        }

        @m80.k
        public final z b() {
            return this.f89244b;
        }

        @m80.k
        public final c c(@m80.k com.baicizhan.app.preferences.a factory, @m80.k z protocol) {
            g0.p(factory, "factory");
            g0.p(protocol, "protocol");
            return new c(factory, protocol);
        }

        @m80.k
        public final com.baicizhan.app.preferences.a e() {
            return this.f89243a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return g0.g(this.f89243a, cVar.f89243a) && g0.g(this.f89244b, cVar.f89244b);
        }

        @m80.k
        public final z f() {
            return this.f89244b;
        }

        public int hashCode() {
            return (this.f89243a.hashCode() * 31) + this.f89244b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Preference(factory=" + this.f89243a + ", protocol=" + this.f89244b + ')';
        }
    }

    public /* synthetic */ e(kotlin.jvm.internal.v vVar) {
        this();
    }

    public e() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z f89240a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f89241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k z protocol, boolean z11) {
            super(null);
            g0.p(protocol, "protocol");
            this.f89240a = protocol;
            this.f89241b = z11;
        }

        public static /* synthetic */ a d(a aVar, z zVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                zVar = aVar.f89240a;
            }
            if ((i11 & 2) != 0) {
                z11 = aVar.f89241b;
            }
            return aVar.c(zVar, z11);
        }

        @m80.k
        public final z a() {
            return this.f89240a;
        }

        public final boolean b() {
            return this.f89241b;
        }

        @m80.k
        public final a c(@m80.k z protocol, boolean z11) {
            g0.p(protocol, "protocol");
            return new a(protocol, z11);
        }

        public final boolean e() {
            return this.f89241b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return g0.g(this.f89240a, aVar.f89240a) && this.f89241b == aVar.f89241b;
        }

        @m80.k
        public final z f() {
            return this.f89240a;
        }

        public int hashCode() {
            return (this.f89240a.hashCode() * 31) + Boolean.hashCode(this.f89241b);
        }

        @m80.k
        public String toString() {
            return "Db(protocol=" + this.f89240a + ", isolate=" + this.f89241b + ')';
        }

        public /* synthetic */ a(z zVar, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
            this(zVar, (i11 & 2) != 0 ? false : z11);
        }
    }
}
