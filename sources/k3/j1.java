package k3;

import com.baicizhan.app.api.service.GameType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class j1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends j1 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f65381a;

        public a(boolean z11) {
            super(null);
            this.f65381a = z11;
        }

        public static /* synthetic */ a c(a aVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = aVar.f65381a;
            }
            return aVar.b(z11);
        }

        public final boolean a() {
            return this.f65381a;
        }

        @m80.k
        public final a b(boolean z11) {
            return new a(z11);
        }

        public final boolean d() {
            return this.f65381a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f65381a == ((a) obj).f65381a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f65381a);
        }

        @m80.k
        public String toString() {
            return "FinishNewLearning(isFinishedToady=" + this.f65381a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends j1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final GameType f65382a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65383b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65384c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65385d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k GameType gameType, boolean z11, int i11, int i12) {
            super(null);
            kotlin.jvm.internal.g0.p(gameType, "gameType");
            this.f65382a = gameType;
            this.f65383b = z11;
            this.f65384c = i11;
            this.f65385d = i12;
        }

        public static /* synthetic */ b f(b bVar, GameType gameType, boolean z11, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                gameType = bVar.f65382a;
            }
            if ((i13 & 2) != 0) {
                z11 = bVar.f65383b;
            }
            if ((i13 & 4) != 0) {
                i11 = bVar.f65384c;
            }
            if ((i13 & 8) != 0) {
                i12 = bVar.f65385d;
            }
            return bVar.e(gameType, z11, i11, i12);
        }

        @m80.k
        public final GameType a() {
            return this.f65382a;
        }

        public final boolean b() {
            return this.f65383b;
        }

        public final int c() {
            return this.f65384c;
        }

        public final int d() {
            return this.f65385d;
        }

        @m80.k
        public final b e(@m80.k GameType gameType, boolean z11, int i11, int i12) {
            kotlin.jvm.internal.g0.p(gameType, "gameType");
            return new b(gameType, z11, i11, i12);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65382a == bVar.f65382a && this.f65383b == bVar.f65383b && this.f65384c == bVar.f65384c && this.f65385d == bVar.f65385d;
        }

        public final int g() {
            return this.f65384c;
        }

        @m80.k
        public final GameType h() {
            return this.f65382a;
        }

        public int hashCode() {
            return (((((this.f65382a.hashCode() * 31) + Boolean.hashCode(this.f65383b)) * 31) + Integer.hashCode(this.f65384c)) * 31) + Integer.hashCode(this.f65385d);
        }

        public final boolean i() {
            return this.f65383b;
        }

        public final int j() {
            return this.f65385d;
        }

        @m80.k
        public String toString() {
            return "Learning(gameType=" + this.f65382a + ", hasUnFinishGame=" + this.f65383b + ", completedRound=" + this.f65384c + ", targetRound=" + this.f65385d + ')';
        }
    }

    public /* synthetic */ j1(kotlin.jvm.internal.v vVar) {
        this();
    }

    public j1() {
    }
}
