package h5;

import com.baicizhan.app.biz.game.model.IpAvatarState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class s {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends s {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u f58438a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final v f58439b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f58440c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final h8.l f58441d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final IpAvatarState f58442e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public final h8.e f58443f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k u ipResource, @m80.k v ipAvatarSpeechSnapshot, boolean z11, @m80.k h8.l userCurrentAvatarInfo, @m80.k IpAvatarState ipState, @m80.l h8.e eVar) {
            super(null);
            kotlin.jvm.internal.g0.p(ipResource, "ipResource");
            kotlin.jvm.internal.g0.p(ipAvatarSpeechSnapshot, "ipAvatarSpeechSnapshot");
            kotlin.jvm.internal.g0.p(userCurrentAvatarInfo, "userCurrentAvatarInfo");
            kotlin.jvm.internal.g0.p(ipState, "ipState");
            this.f58438a = ipResource;
            this.f58439b = ipAvatarSpeechSnapshot;
            this.f58440c = z11;
            this.f58441d = userCurrentAvatarInfo;
            this.f58442e = ipState;
            this.f58443f = eVar;
        }

        public static /* synthetic */ a j(a aVar, u uVar, v vVar, boolean z11, h8.l lVar, IpAvatarState ipAvatarState, h8.e eVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uVar = aVar.f58438a;
            }
            if ((i11 & 2) != 0) {
                vVar = aVar.f58439b;
            }
            if ((i11 & 4) != 0) {
                z11 = aVar.f58440c;
            }
            if ((i11 & 8) != 0) {
                lVar = aVar.f58441d;
            }
            if ((i11 & 16) != 0) {
                ipAvatarState = aVar.f58442e;
            }
            if ((i11 & 32) != 0) {
                eVar = aVar.f58443f;
            }
            IpAvatarState ipAvatarState2 = ipAvatarState;
            h8.e eVar2 = eVar;
            return aVar.i(uVar, vVar, z11, lVar, ipAvatarState2, eVar2);
        }

        @Override // h5.s
        @m80.k
        public v a() {
            return this.f58439b;
        }

        @Override // h5.s
        @m80.k
        public u b() {
            return this.f58438a;
        }

        @m80.k
        public final u c() {
            return this.f58438a;
        }

        @m80.k
        public final v d() {
            return this.f58439b;
        }

        public final boolean e() {
            return this.f58440c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f58438a, aVar.f58438a) && kotlin.jvm.internal.g0.g(this.f58439b, aVar.f58439b) && this.f58440c == aVar.f58440c && kotlin.jvm.internal.g0.g(this.f58441d, aVar.f58441d) && this.f58442e == aVar.f58442e && kotlin.jvm.internal.g0.g(this.f58443f, aVar.f58443f);
        }

        @m80.k
        public final h8.l f() {
            return this.f58441d;
        }

        @m80.k
        public final IpAvatarState g() {
            return this.f58442e;
        }

        @m80.l
        public final h8.e h() {
            return this.f58443f;
        }

        public int hashCode() {
            int hashCode = ((((((((this.f58438a.hashCode() * 31) + this.f58439b.hashCode()) * 31) + Boolean.hashCode(this.f58440c)) * 31) + this.f58441d.hashCode()) * 31) + this.f58442e.hashCode()) * 31;
            h8.e eVar = this.f58443f;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        @m80.k
        public final a i(@m80.k u ipResource, @m80.k v ipAvatarSpeechSnapshot, boolean z11, @m80.k h8.l userCurrentAvatarInfo, @m80.k IpAvatarState ipState, @m80.l h8.e eVar) {
            kotlin.jvm.internal.g0.p(ipResource, "ipResource");
            kotlin.jvm.internal.g0.p(ipAvatarSpeechSnapshot, "ipAvatarSpeechSnapshot");
            kotlin.jvm.internal.g0.p(userCurrentAvatarInfo, "userCurrentAvatarInfo");
            kotlin.jvm.internal.g0.p(ipState, "ipState");
            return new a(ipResource, ipAvatarSpeechSnapshot, z11, userCurrentAvatarInfo, ipState, eVar);
        }

        @m80.k
        public final IpAvatarState k() {
            return this.f58442e;
        }

        @m80.l
        public final h8.e l() {
            return this.f58443f;
        }

        public final boolean m() {
            return this.f58440c;
        }

        @m80.k
        public final h8.l n() {
            return this.f58441d;
        }

        @m80.k
        public String toString() {
            return "Owned(ipResource=" + this.f58438a + ", ipAvatarSpeechSnapshot=" + this.f58439b + ", travelLimited=" + this.f58440c + ", userCurrentAvatarInfo=" + this.f58441d + ", ipState=" + this.f58442e + ", travelAreaInfo=" + this.f58443f + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends s {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u f58444a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final v f58445b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58446c;

        /* renamed from: d, reason: collision with root package name */
        public final int f58447d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f58448e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k u ipResource, @m80.k v ipAvatarSpeechSnapshot, int i11, int i12, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(ipResource, "ipResource");
            kotlin.jvm.internal.g0.p(ipAvatarSpeechSnapshot, "ipAvatarSpeechSnapshot");
            this.f58444a = ipResource;
            this.f58445b = ipAvatarSpeechSnapshot;
            this.f58446c = i11;
            this.f58447d = i12;
            this.f58448e = z11;
        }

        public static /* synthetic */ b i(b bVar, u uVar, v vVar, int i11, int i12, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                uVar = bVar.f58444a;
            }
            if ((i13 & 2) != 0) {
                vVar = bVar.f58445b;
            }
            if ((i13 & 4) != 0) {
                i11 = bVar.f58446c;
            }
            if ((i13 & 8) != 0) {
                i12 = bVar.f58447d;
            }
            if ((i13 & 16) != 0) {
                z11 = bVar.f58448e;
            }
            boolean z12 = z11;
            int i14 = i11;
            return bVar.h(uVar, vVar, i14, i12, z12);
        }

        @Override // h5.s
        @m80.k
        public v a() {
            return this.f58445b;
        }

        @Override // h5.s
        @m80.k
        public u b() {
            return this.f58444a;
        }

        @m80.k
        public final u c() {
            return this.f58444a;
        }

        @m80.k
        public final v d() {
            return this.f58445b;
        }

        public final int e() {
            return this.f58446c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f58444a, bVar.f58444a) && kotlin.jvm.internal.g0.g(this.f58445b, bVar.f58445b) && this.f58446c == bVar.f58446c && this.f58447d == bVar.f58447d && this.f58448e == bVar.f58448e;
        }

        public final int f() {
            return this.f58447d;
        }

        public final boolean g() {
            return this.f58448e;
        }

        @m80.k
        public final b h(@m80.k u ipResource, @m80.k v ipAvatarSpeechSnapshot, int i11, int i12, boolean z11) {
            kotlin.jvm.internal.g0.p(ipResource, "ipResource");
            kotlin.jvm.internal.g0.p(ipAvatarSpeechSnapshot, "ipAvatarSpeechSnapshot");
            return new b(ipResource, ipAvatarSpeechSnapshot, i11, i12, z11);
        }

        public int hashCode() {
            return (((((((this.f58444a.hashCode() * 31) + this.f58445b.hashCode()) * 31) + Integer.hashCode(this.f58446c)) * 31) + Integer.hashCode(this.f58447d)) * 31) + Boolean.hashCode(this.f58448e);
        }

        public final int j() {
            return this.f58446c;
        }

        public final int k() {
            return this.f58447d;
        }

        public final boolean l() {
            return this.f58448e;
        }

        @m80.k
        public String toString() {
            return "UnOwned(ipResource=" + this.f58444a + ", ipAvatarSpeechSnapshot=" + this.f58445b + ", studyCompletedRound=" + this.f58446c + ", targetRound=" + this.f58447d + ", unlockable=" + this.f58448e + ')';
        }
    }

    public /* synthetic */ s(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.k
    public abstract v a();

    @m80.k
    public abstract u b();

    public s() {
    }
}
