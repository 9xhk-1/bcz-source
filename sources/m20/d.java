package m20;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f71802a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f71803b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k String name, @k String desc) {
            super(null);
            g0.p(name, "name");
            g0.p(desc, "desc");
            this.f71802a = name;
            this.f71803b = desc;
        }

        @Override // m20.d
        @k
        public String a() {
            return e() + ':' + d();
        }

        @k
        public final String b() {
            return this.f71802a;
        }

        @k
        public final String c() {
            return this.f71803b;
        }

        @k
        public String d() {
            return this.f71803b;
        }

        @k
        public String e() {
            return this.f71802a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return g0.g(this.f71802a, aVar.f71802a) && g0.g(this.f71803b, aVar.f71803b);
        }

        public int hashCode() {
            return (this.f71802a.hashCode() * 31) + this.f71803b.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f71804a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f71805b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k String name, @k String desc) {
            super(null);
            g0.p(name, "name");
            g0.p(desc, "desc");
            this.f71804a = name;
            this.f71805b = desc;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f71804a;
            }
            if ((i11 & 2) != 0) {
                str2 = bVar.f71805b;
            }
            return bVar.b(str, str2);
        }

        @Override // m20.d
        @k
        public String a() {
            return e() + d();
        }

        @k
        public final b b(@k String name, @k String desc) {
            g0.p(name, "name");
            g0.p(desc, "desc");
            return new b(name, desc);
        }

        @k
        public String d() {
            return this.f71805b;
        }

        @k
        public String e() {
            return this.f71804a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return g0.g(this.f71804a, bVar.f71804a) && g0.g(this.f71805b, bVar.f71805b);
        }

        public int hashCode() {
            return (this.f71804a.hashCode() * 31) + this.f71805b.hashCode();
        }
    }

    public /* synthetic */ d(v vVar) {
        this();
    }

    @k
    public abstract String a();

    @k
    public final String toString() {
        return a();
    }

    public d() {
    }
}
