package k3;

import com.baicizhan.app.api.service.BuddyInHomeState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a extends a3 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: k3.a3$a$a, reason: collision with other inner class name */
        public static final class C0753a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f65208a;

            /* renamed from: b, reason: collision with root package name */
            public final int f65209b;

            /* renamed from: c, reason: collision with root package name */
            @m80.k
            public final v f65210c;

            /* renamed from: d, reason: collision with root package name */
            @m80.k
            public final BuddyInHomeState f65211d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0753a(int i11, int i12, @m80.k v buddyInfo, @m80.k BuddyInHomeState state) {
                super(null);
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                kotlin.jvm.internal.g0.p(state, "state");
                this.f65208a = i11;
                this.f65209b = i12;
                this.f65210c = buddyInfo;
                this.f65211d = state;
            }

            public static /* synthetic */ C0753a g(C0753a c0753a, int i11, int i12, v vVar, BuddyInHomeState buddyInHomeState, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i11 = c0753a.f65208a;
                }
                if ((i13 & 2) != 0) {
                    i12 = c0753a.f65209b;
                }
                if ((i13 & 4) != 0) {
                    vVar = c0753a.f65210c;
                }
                if ((i13 & 8) != 0) {
                    buddyInHomeState = c0753a.f65211d;
                }
                return c0753a.f(i11, i12, vVar, buddyInHomeState);
            }

            @Override // k3.a3
            @m80.k
            public v a() {
                return this.f65210c;
            }

            public final int b() {
                return this.f65208a;
            }

            public final int c() {
                return this.f65209b;
            }

            @m80.k
            public final v d() {
                return this.f65210c;
            }

            @m80.k
            public final BuddyInHomeState e() {
                return this.f65211d;
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0753a)) {
                    return false;
                }
                C0753a c0753a = (C0753a) obj;
                return this.f65208a == c0753a.f65208a && this.f65209b == c0753a.f65209b && kotlin.jvm.internal.g0.g(this.f65210c, c0753a.f65210c) && this.f65211d == c0753a.f65211d;
            }

            @m80.k
            public final C0753a f(int i11, int i12, @m80.k v buddyInfo, @m80.k BuddyInHomeState state) {
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                kotlin.jvm.internal.g0.p(state, "state");
                return new C0753a(i11, i12, buddyInfo, state);
            }

            public final int h() {
                return this.f65208a;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.f65208a) * 31) + Integer.hashCode(this.f65209b)) * 31) + this.f65210c.hashCode()) * 31) + this.f65211d.hashCode();
            }

            @m80.k
            public final BuddyInHomeState i() {
                return this.f65211d;
            }

            public final int j() {
                return this.f65209b;
            }

            @m80.k
            public String toString() {
                return "BuddyInHome(foodBalance=" + this.f65208a + ", travelCost=" + this.f65209b + ", buddyInfo=" + this.f65210c + ", state=" + this.f65211d + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final v f65212a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@m80.k v buddyInfo) {
                super(null);
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                this.f65212a = buddyInfo;
            }

            public static /* synthetic */ b d(b bVar, v vVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    vVar = bVar.f65212a;
                }
                return bVar.c(vVar);
            }

            @Override // k3.a3
            @m80.k
            public v a() {
                return this.f65212a;
            }

            @m80.k
            public final v b() {
                return this.f65212a;
            }

            @m80.k
            public final b c(@m80.k v buddyInfo) {
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                return new b(buddyInfo);
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f65212a, ((b) obj).f65212a);
            }

            public int hashCode() {
                return this.f65212a.hashCode();
            }

            @m80.k
            public String toString() {
                return "RewardPending(buddyInfo=" + this.f65212a + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f65213a;

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public final String f65214b;

            /* renamed from: c, reason: collision with root package name */
            public final long f65215c;

            /* renamed from: d, reason: collision with root package name */
            @m80.k
            public final v f65216d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i11, @m80.k String travelAreaName, long j11, @m80.k v buddyInfo) {
                super(null);
                kotlin.jvm.internal.g0.p(travelAreaName, "travelAreaName");
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                this.f65213a = i11;
                this.f65214b = travelAreaName;
                this.f65215c = j11;
                this.f65216d = buddyInfo;
            }

            public static /* synthetic */ c g(c cVar, int i11, String str, long j11, v vVar, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = cVar.f65213a;
                }
                if ((i12 & 2) != 0) {
                    str = cVar.f65214b;
                }
                if ((i12 & 4) != 0) {
                    j11 = cVar.f65215c;
                }
                if ((i12 & 8) != 0) {
                    vVar = cVar.f65216d;
                }
                v vVar2 = vVar;
                return cVar.f(i11, str, j11, vVar2);
            }

            @Override // k3.a3
            @m80.k
            public v a() {
                return this.f65216d;
            }

            public final int b() {
                return this.f65213a;
            }

            @m80.k
            public final String c() {
                return this.f65214b;
            }

            public final long d() {
                return this.f65215c;
            }

            @m80.k
            public final v e() {
                return this.f65216d;
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f65213a == cVar.f65213a && kotlin.jvm.internal.g0.g(this.f65214b, cVar.f65214b) && this.f65215c == cVar.f65215c && kotlin.jvm.internal.g0.g(this.f65216d, cVar.f65216d);
            }

            @m80.k
            public final c f(int i11, @m80.k String travelAreaName, long j11, @m80.k v buddyInfo) {
                kotlin.jvm.internal.g0.p(travelAreaName, "travelAreaName");
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                return new c(i11, travelAreaName, j11, buddyInfo);
            }

            public final long h() {
                return this.f65215c;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.f65213a) * 31) + this.f65214b.hashCode()) * 31) + Long.hashCode(this.f65215c)) * 31) + this.f65216d.hashCode();
            }

            public final int i() {
                return this.f65213a;
            }

            @m80.k
            public final String j() {
                return this.f65214b;
            }

            @m80.k
            public String toString() {
                return "Traveling(travelAreaId=" + this.f65213a + ", travelAreaName=" + this.f65214b + ", traveEndTime=" + this.f65215c + ", buddyInfo=" + this.f65216d + ')';
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b extends a3 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final int f65217a;

            /* renamed from: b, reason: collision with root package name */
            public final int f65218b;

            /* renamed from: c, reason: collision with root package name */
            @m80.k
            public final v f65219c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i11, int i12, @m80.k v buddyInfo) {
                super(null);
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                this.f65217a = i11;
                this.f65218b = i12;
                this.f65219c = buddyInfo;
            }

            public static /* synthetic */ a f(a aVar, int i11, int i12, v vVar, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i11 = aVar.f65217a;
                }
                if ((i13 & 2) != 0) {
                    i12 = aVar.f65218b;
                }
                if ((i13 & 4) != 0) {
                    vVar = aVar.f65219c;
                }
                return aVar.e(i11, i12, vVar);
            }

            @Override // k3.a3
            @m80.k
            public v a() {
                return this.f65219c;
            }

            public final int b() {
                return this.f65217a;
            }

            public final int c() {
                return this.f65218b;
            }

            @m80.k
            public final v d() {
                return this.f65219c;
            }

            @m80.k
            public final a e(int i11, int i12, @m80.k v buddyInfo) {
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                return new a(i11, i12, buddyInfo);
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f65217a == aVar.f65217a && this.f65218b == aVar.f65218b && kotlin.jvm.internal.g0.g(this.f65219c, aVar.f65219c);
            }

            public final int g() {
                return this.f65217a;
            }

            public final int h() {
                return this.f65218b;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.f65217a) * 31) + Integer.hashCode(this.f65218b)) * 31) + this.f65219c.hashCode();
            }

            @m80.k
            public String toString() {
                return "Locked(studyCompletedRound=" + this.f65217a + ", targetRound=" + this.f65218b + ", buddyInfo=" + this.f65219c + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: k3.a3$b$b, reason: collision with other inner class name */
        public static final class C0754b extends b {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final v f65220a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0754b(@m80.k v buddyInfo) {
                super(null);
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                this.f65220a = buddyInfo;
            }

            public static /* synthetic */ C0754b d(C0754b c0754b, v vVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    vVar = c0754b.f65220a;
                }
                return c0754b.c(vVar);
            }

            @Override // k3.a3
            @m80.k
            public v a() {
                return this.f65220a;
            }

            @m80.k
            public final v b() {
                return this.f65220a;
            }

            @m80.k
            public final C0754b c(@m80.k v buddyInfo) {
                kotlin.jvm.internal.g0.p(buddyInfo, "buddyInfo");
                return new C0754b(buddyInfo);
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0754b) && kotlin.jvm.internal.g0.g(this.f65220a, ((C0754b) obj).f65220a);
            }

            public int hashCode() {
                return this.f65220a.hashCode();
            }

            @m80.k
            public String toString() {
                return "Unlockable(buddyInfo=" + this.f65220a + ')';
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ a3(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.k
    public abstract v a();

    public a3() {
    }
}
