package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import k3.m3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class ya {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24373a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends ya {

        /* renamed from: d, reason: collision with root package name */
        public static final int f24379d = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Throwable f24380b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final f f24381c;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ b e(b bVar, Throwable th2, f fVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = bVar.f24380b;
            }
            if ((i11 & 2) != 0) {
                fVar = bVar.f24381c;
            }
            return bVar.d(th2, fVar);
        }

        @Override // com.baicizhan.main.home.player.ya
        @m80.k
        public f a() {
            return this.f24381c;
        }

        @m80.l
        public final Throwable b() {
            return this.f24380b;
        }

        @m80.k
        public final f c() {
            return this.f24381c;
        }

        @m80.k
        public final b d(@m80.l Throwable th2, @m80.k f bookInfo) {
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            return new b(th2, bookInfo);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f24380b, bVar.f24380b) && kotlin.jvm.internal.g0.g(this.f24381c, bVar.f24381c);
        }

        @m80.l
        public final Throwable f() {
            return this.f24380b;
        }

        public int hashCode() {
            Throwable th2 = this.f24380b;
            return ((th2 == null ? 0 : th2.hashCode()) * 31) + this.f24381c.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(error=" + this.f24380b + ", bookInfo=" + this.f24381c + pn.j.f81007d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.l Throwable th2, @m80.k f bookInfo) {
            super(null);
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            this.f24380b = th2;
            this.f24381c = bookInfo;
        }

        public /* synthetic */ b(Throwable th2, f fVar, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? null : th2, (i11 & 2) != 0 ? f.f23583e.a() : fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class d extends ya {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final d f24388b = new d();

        /* renamed from: c, reason: collision with root package name */
        public static final int f24389c = 0;

        public d() {
            super(null);
        }

        @Override // com.baicizhan.main.home.player.ya
        @m80.k
        public f a() {
            return f.f23583e.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class e extends ya {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final e f24390b = new e();

        /* renamed from: c, reason: collision with root package name */
        public static final int f24391c = 0;

        public e() {
            super(null);
        }

        @Override // com.baicizhan.main.home.player.ya
        @m80.k
        public f a() {
            return f.f23583e.a();
        }
    }

    public /* synthetic */ ya(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.k
    public abstract f a();

    public ya() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends ya {

        /* renamed from: f, reason: collision with root package name */
        public static final int f24374f = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final f f24375b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final h f24376c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<com.baicizhan.main.home.player.e> f24377d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final m3.b f24378e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k f bookInfo, @m80.k h status, @m80.k List<com.baicizhan.main.home.player.e> behaviors, @m80.l m3.b bVar) {
            super(null);
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(behaviors, "behaviors");
            this.f24375b = bookInfo;
            this.f24376c = status;
            this.f24377d = behaviors;
            this.f24378e = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a g(a aVar, f fVar, h hVar, List list, m3.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fVar = aVar.f24375b;
            }
            if ((i11 & 2) != 0) {
                hVar = aVar.f24376c;
            }
            if ((i11 & 4) != 0) {
                list = aVar.f24377d;
            }
            if ((i11 & 8) != 0) {
                bVar = aVar.f24378e;
            }
            return aVar.f(fVar, hVar, list, bVar);
        }

        @Override // com.baicizhan.main.home.player.ya
        @m80.k
        public f a() {
            return this.f24375b;
        }

        @m80.k
        public final f b() {
            return this.f24375b;
        }

        @m80.k
        public final h c() {
            return this.f24376c;
        }

        @m80.k
        public final List<com.baicizhan.main.home.player.e> d() {
            return this.f24377d;
        }

        @m80.l
        public final m3.b e() {
            return this.f24378e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f24375b, aVar.f24375b) && kotlin.jvm.internal.g0.g(this.f24376c, aVar.f24376c) && kotlin.jvm.internal.g0.g(this.f24377d, aVar.f24377d) && kotlin.jvm.internal.g0.g(this.f24378e, aVar.f24378e);
        }

        @m80.k
        public final a f(@m80.k f bookInfo, @m80.k h status, @m80.k List<com.baicizhan.main.home.player.e> behaviors, @m80.l m3.b bVar) {
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(behaviors, "behaviors");
            return new a(bookInfo, status, behaviors, bVar);
        }

        @m80.k
        public final List<com.baicizhan.main.home.player.e> h() {
            return this.f24377d;
        }

        public int hashCode() {
            int hashCode = ((((this.f24375b.hashCode() * 31) + this.f24376c.hashCode()) * 31) + this.f24377d.hashCode()) * 31;
            m3.b bVar = this.f24378e;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @m80.k
        public final h i() {
            return this.f24376c;
        }

        @m80.l
        public final m3.b j() {
            return this.f24378e;
        }

        @m80.k
        public String toString() {
            return "Completed(bookInfo=" + this.f24375b + ", status=" + this.f24376c + ", behaviors=" + this.f24377d + ", unitContent=" + this.f24378e + pn.j.f81007d;
        }

        public /* synthetic */ a(f fVar, h hVar, List list, m3.b bVar, int i11, kotlin.jvm.internal.v vVar) {
            this(fVar, hVar, list, (i11 & 8) != 0 ? null : bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends ya {

        /* renamed from: g, reason: collision with root package name */
        public static final int f24382g = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final f f24383b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g f24384c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<com.baicizhan.main.home.player.e> f24385d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final List<xa> f24386e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public final m3.b f24387f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@m80.k f bookInfo, @m80.k g bookProgress, @m80.k List<com.baicizhan.main.home.player.e> behaviors, @m80.k List<? extends xa> tips, @m80.l m3.b bVar) {
            super(null);
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(bookProgress, "bookProgress");
            kotlin.jvm.internal.g0.p(behaviors, "behaviors");
            kotlin.jvm.internal.g0.p(tips, "tips");
            this.f24383b = bookInfo;
            this.f24384c = bookProgress;
            this.f24385d = behaviors;
            this.f24386e = tips;
            this.f24387f = bVar;
        }

        public static /* synthetic */ c h(c cVar, f fVar, g gVar, List list, List list2, m3.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fVar = cVar.f24383b;
            }
            if ((i11 & 2) != 0) {
                gVar = cVar.f24384c;
            }
            if ((i11 & 4) != 0) {
                list = cVar.f24385d;
            }
            if ((i11 & 8) != 0) {
                list2 = cVar.f24386e;
            }
            if ((i11 & 16) != 0) {
                bVar = cVar.f24387f;
            }
            m3.b bVar2 = bVar;
            List list3 = list;
            return cVar.g(fVar, gVar, list3, list2, bVar2);
        }

        @Override // com.baicizhan.main.home.player.ya
        @m80.k
        public f a() {
            return this.f24383b;
        }

        @m80.k
        public final f b() {
            return this.f24383b;
        }

        @m80.k
        public final g c() {
            return this.f24384c;
        }

        @m80.k
        public final List<com.baicizhan.main.home.player.e> d() {
            return this.f24385d;
        }

        @m80.k
        public final List<xa> e() {
            return this.f24386e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f24383b, cVar.f24383b) && kotlin.jvm.internal.g0.g(this.f24384c, cVar.f24384c) && kotlin.jvm.internal.g0.g(this.f24385d, cVar.f24385d) && kotlin.jvm.internal.g0.g(this.f24386e, cVar.f24386e) && kotlin.jvm.internal.g0.g(this.f24387f, cVar.f24387f);
        }

        @m80.l
        public final m3.b f() {
            return this.f24387f;
        }

        @m80.k
        public final c g(@m80.k f bookInfo, @m80.k g bookProgress, @m80.k List<com.baicizhan.main.home.player.e> behaviors, @m80.k List<? extends xa> tips, @m80.l m3.b bVar) {
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(bookProgress, "bookProgress");
            kotlin.jvm.internal.g0.p(behaviors, "behaviors");
            kotlin.jvm.internal.g0.p(tips, "tips");
            return new c(bookInfo, bookProgress, behaviors, tips, bVar);
        }

        public int hashCode() {
            int hashCode = ((((((this.f24383b.hashCode() * 31) + this.f24384c.hashCode()) * 31) + this.f24385d.hashCode()) * 31) + this.f24386e.hashCode()) * 31;
            m3.b bVar = this.f24387f;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @m80.k
        public final List<com.baicizhan.main.home.player.e> i() {
            return this.f24385d;
        }

        @m80.k
        public final g j() {
            return this.f24384c;
        }

        @m80.k
        public final List<xa> k() {
            return this.f24386e;
        }

        @m80.l
        public final m3.b l() {
            return this.f24387f;
        }

        @m80.k
        public String toString() {
            return "Learning(bookInfo=" + this.f24383b + ", bookProgress=" + this.f24384c + ", behaviors=" + this.f24385d + ", tips=" + this.f24386e + ", unitContent=" + this.f24387f + pn.j.f81007d;
        }

        public /* synthetic */ c(f fVar, g gVar, List list, List list2, m3.b bVar, int i11, kotlin.jvm.internal.v vVar) {
            this(fVar, gVar, list, (i11 & 8) != 0 ? a00.h0.J() : list2, (i11 & 16) != 0 ? null : bVar);
        }
    }
}
