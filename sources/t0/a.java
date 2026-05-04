package t0;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.size.Scale;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import o0.e;
import o0.g;
import o0.m;
import t0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f89094a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f89095b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89096c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f89097d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
    /* renamed from: t0.a$a, reason: collision with other inner class name */
    public static final class C1169a implements c.a {

        /* renamed from: c, reason: collision with root package name */
        public final int f89098c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f89099d;

        /* JADX WARN: Multi-variable type inference failed */
        @w00.k
        public C1169a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        @Override // t0.c.a
        @k
        public c a(@k d dVar, @k g gVar) {
            return !(gVar instanceof m) ? c.a.f89103b.a(dVar, gVar) : ((m) gVar).e() == DataSource.MEMORY_CACHE ? c.a.f89103b.a(dVar, gVar) : new a(dVar, gVar, this.f89098c, this.f89099d);
        }

        public final int b() {
            return this.f89098c;
        }

        public final boolean c() {
            return this.f89099d;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1169a)) {
                return false;
            }
            C1169a c1169a = (C1169a) obj;
            return this.f89098c == c1169a.f89098c && this.f89099d == c1169a.f89099d;
        }

        public int hashCode() {
            return (this.f89098c * 31) + Boolean.hashCode(this.f89099d);
        }

        @w00.k
        public C1169a(int i11) {
            this(i11, false, 2, null);
        }

        @w00.k
        public C1169a(int i11, boolean z11) {
            this.f89098c = i11;
            this.f89099d = z11;
            if (i11 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        public /* synthetic */ C1169a(int i11, boolean z11, int i12, v vVar) {
            this((i12 & 1) != 0 ? 100 : i11, (i12 & 2) != 0 ? false : z11);
        }
    }

    @w00.k
    public a(@k d dVar, @k g gVar) {
        this(dVar, gVar, 0, false, 12, null);
    }

    @Override // t0.c
    public void a() {
        Drawable h11 = this.f89094a.h();
        Drawable a11 = this.f89095b.a();
        Scale J = this.f89095b.b().J();
        int i11 = this.f89096c;
        g gVar = this.f89095b;
        h0.b bVar = new h0.b(h11, a11, J, i11, ((gVar instanceof m) && ((m) gVar).h()) ? false : true, this.f89097d);
        g gVar2 = this.f89095b;
        if (gVar2 instanceof m) {
            this.f89094a.a(bVar);
        } else if (gVar2 instanceof e) {
            this.f89094a.g(bVar);
        }
    }

    public final int b() {
        return this.f89096c;
    }

    public final boolean c() {
        return this.f89097d;
    }

    @w00.k
    public a(@k d dVar, @k g gVar, int i11) {
        this(dVar, gVar, i11, false, 8, null);
    }

    @w00.k
    public a(@k d dVar, @k g gVar, int i11, boolean z11) {
        this.f89094a = dVar;
        this.f89095b = gVar;
        this.f89096c = i11;
        this.f89097d = z11;
        if (i11 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public /* synthetic */ a(d dVar, g gVar, int i11, boolean z11, int i12, v vVar) {
        this(dVar, gVar, (i12 & 4) != 0 ? 100 : i11, (i12 & 8) != 0 ? false : z11);
    }
}
