package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class s {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends s {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l3.d f69691a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k l3.d data, @m80.k String resourceId) {
            super(null);
            kotlin.jvm.internal.g0.p(data, "data");
            kotlin.jvm.internal.g0.p(resourceId, "resourceId");
            this.f69691a = data;
            this.f69692b = resourceId;
        }

        public static /* synthetic */ a d(a aVar, l3.d dVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dVar = aVar.f69691a;
            }
            if ((i11 & 2) != 0) {
                str = aVar.f69692b;
            }
            return aVar.c(dVar, str);
        }

        @m80.k
        public final l3.d a() {
            return this.f69691a;
        }

        @m80.k
        public final String b() {
            return this.f69692b;
        }

        @m80.k
        public final a c(@m80.k l3.d data, @m80.k String resourceId) {
            kotlin.jvm.internal.g0.p(data, "data");
            kotlin.jvm.internal.g0.p(resourceId, "resourceId");
            return new a(data, resourceId);
        }

        @m80.k
        public final l3.d e() {
            return this.f69691a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f69691a, aVar.f69691a) && kotlin.jvm.internal.g0.g(this.f69692b, aVar.f69692b);
        }

        @m80.k
        public final String f() {
            return this.f69692b;
        }

        public int hashCode() {
            return (this.f69691a.hashCode() * 31) + this.f69692b.hashCode();
        }

        @m80.k
        public String toString() {
            return "ActionReward(data=" + this.f69691a + ", resourceId=" + this.f69692b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends s {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final e f69693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k e data) {
            super(null);
            kotlin.jvm.internal.g0.p(data, "data");
            this.f69693a = data;
        }

        public static /* synthetic */ b c(b bVar, e eVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = bVar.f69693a;
            }
            return bVar.b(eVar);
        }

        @m80.k
        public final e a() {
            return this.f69693a;
        }

        @m80.k
        public final b b(@m80.k e data) {
            kotlin.jvm.internal.g0.p(data, "data");
            return new b(data);
        }

        @m80.k
        public final e d() {
            return this.f69693a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f69693a, ((b) obj).f69693a);
        }

        public int hashCode() {
            return this.f69693a.hashCode();
        }

        @m80.k
        public String toString() {
            return "AreaReward(data=" + this.f69693a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends s {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final h f69694a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k h data, int i11) {
            super(null);
            kotlin.jvm.internal.g0.p(data, "data");
            this.f69694a = data;
            this.f69695b = i11;
        }

        public static /* synthetic */ c d(c cVar, h hVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = cVar.f69694a;
            }
            if ((i12 & 2) != 0) {
                i11 = cVar.f69695b;
            }
            return cVar.c(hVar, i11);
        }

        @m80.k
        public final h a() {
            return this.f69694a;
        }

        public final int b() {
            return this.f69695b;
        }

        @m80.k
        public final c c(@m80.k h data, int i11) {
            kotlin.jvm.internal.g0.p(data, "data");
            return new c(data, i11);
        }

        public final int e() {
            return this.f69695b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f69694a, cVar.f69694a) && this.f69695b == cVar.f69695b;
        }

        @m80.k
        public final h f() {
            return this.f69694a;
        }

        public int hashCode() {
            return (this.f69694a.hashCode() * 31) + Integer.hashCode(this.f69695b);
        }

        @m80.k
        public String toString() {
            return "GiftReward(data=" + this.f69694a + ", areaId=" + this.f69695b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends s {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l f69696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k l data) {
            super(null);
            kotlin.jvm.internal.g0.p(data, "data");
            this.f69696a = data;
        }

        public static /* synthetic */ d c(d dVar, l lVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = dVar.f69696a;
            }
            return dVar.b(lVar);
        }

        @m80.k
        public final l a() {
            return this.f69696a;
        }

        @m80.k
        public final d b(@m80.k l data) {
            kotlin.jvm.internal.g0.p(data, "data");
            return new d(data);
        }

        @m80.k
        public final l d() {
            return this.f69696a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.g0.g(this.f69696a, ((d) obj).f69696a);
        }

        public int hashCode() {
            return this.f69696a.hashCode();
        }

        @m80.k
        public String toString() {
            return "SkillReward(data=" + this.f69696a + ')';
        }
    }

    public /* synthetic */ s(kotlin.jvm.internal.v vVar) {
        this();
    }

    public s() {
    }
}
