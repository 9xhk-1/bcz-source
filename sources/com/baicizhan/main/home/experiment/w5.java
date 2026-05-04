package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@yz.n(message = "Former experimental version")
/* loaded from: classes4.dex */
public abstract class w5 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21727a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends w5 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f21728e = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.main.home.experiment.c f21729b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.main.home.experiment.e f21730c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<com.baicizhan.main.home.experiment.b> f21731d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k com.baicizhan.main.home.experiment.c bookInfo, @m80.k com.baicizhan.main.home.experiment.e status, @m80.k List<com.baicizhan.main.home.experiment.b> behaviors) {
            super(null);
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(behaviors, "behaviors");
            this.f21729b = bookInfo;
            this.f21730c = status;
            this.f21731d = behaviors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a f(a aVar, com.baicizhan.main.home.experiment.c cVar, com.baicizhan.main.home.experiment.e eVar, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = aVar.f21729b;
            }
            if ((i11 & 2) != 0) {
                eVar = aVar.f21730c;
            }
            if ((i11 & 4) != 0) {
                list = aVar.f21731d;
            }
            return aVar.e(cVar, eVar, list);
        }

        @Override // com.baicizhan.main.home.experiment.w5
        @m80.k
        public com.baicizhan.main.home.experiment.c a() {
            return this.f21729b;
        }

        @m80.k
        public final com.baicizhan.main.home.experiment.c b() {
            return this.f21729b;
        }

        @m80.k
        public final com.baicizhan.main.home.experiment.e c() {
            return this.f21730c;
        }

        @m80.k
        public final List<com.baicizhan.main.home.experiment.b> d() {
            return this.f21731d;
        }

        @m80.k
        public final a e(@m80.k com.baicizhan.main.home.experiment.c bookInfo, @m80.k com.baicizhan.main.home.experiment.e status, @m80.k List<com.baicizhan.main.home.experiment.b> behaviors) {
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(behaviors, "behaviors");
            return new a(bookInfo, status, behaviors);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f21729b, aVar.f21729b) && kotlin.jvm.internal.g0.g(this.f21730c, aVar.f21730c) && kotlin.jvm.internal.g0.g(this.f21731d, aVar.f21731d);
        }

        @m80.k
        public final List<com.baicizhan.main.home.experiment.b> g() {
            return this.f21731d;
        }

        @m80.k
        public final com.baicizhan.main.home.experiment.e h() {
            return this.f21730c;
        }

        public int hashCode() {
            return (((this.f21729b.hashCode() * 31) + this.f21730c.hashCode()) * 31) + this.f21731d.hashCode();
        }

        @m80.k
        public String toString() {
            return "Completed(bookInfo=" + this.f21729b + ", status=" + this.f21730c + ", behaviors=" + this.f21731d + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends w5 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f21732d = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Throwable f21733b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.main.home.experiment.c f21734c;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ b e(b bVar, Throwable th2, com.baicizhan.main.home.experiment.c cVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = bVar.f21733b;
            }
            if ((i11 & 2) != 0) {
                cVar = bVar.f21734c;
            }
            return bVar.d(th2, cVar);
        }

        @Override // com.baicizhan.main.home.experiment.w5
        @m80.k
        public com.baicizhan.main.home.experiment.c a() {
            return this.f21734c;
        }

        @m80.l
        public final Throwable b() {
            return this.f21733b;
        }

        @m80.k
        public final com.baicizhan.main.home.experiment.c c() {
            return this.f21734c;
        }

        @m80.k
        public final b d(@m80.l Throwable th2, @m80.k com.baicizhan.main.home.experiment.c bookInfo) {
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
            return kotlin.jvm.internal.g0.g(this.f21733b, bVar.f21733b) && kotlin.jvm.internal.g0.g(this.f21734c, bVar.f21734c);
        }

        @m80.l
        public final Throwable f() {
            return this.f21733b;
        }

        public int hashCode() {
            Throwable th2 = this.f21733b;
            return ((th2 == null ? 0 : th2.hashCode()) * 31) + this.f21734c.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(error=" + this.f21733b + ", bookInfo=" + this.f21734c + pn.j.f81007d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.l Throwable th2, @m80.k com.baicizhan.main.home.experiment.c bookInfo) {
            super(null);
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            this.f21733b = th2;
            this.f21734c = bookInfo;
        }

        public /* synthetic */ b(Throwable th2, com.baicizhan.main.home.experiment.c cVar, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? null : th2, (i11 & 2) != 0 ? com.baicizhan.main.home.experiment.c.f21106e.a() : cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends w5 {

        /* renamed from: f, reason: collision with root package name */
        public static final int f21735f = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.main.home.experiment.c f21736b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.main.home.experiment.d f21737c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<com.baicizhan.main.home.experiment.b> f21738d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final List<n5> f21739e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@m80.k com.baicizhan.main.home.experiment.c bookInfo, @m80.k com.baicizhan.main.home.experiment.d bookProgress, @m80.k List<com.baicizhan.main.home.experiment.b> behaviors, @m80.k List<? extends n5> tips) {
            super(null);
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(bookProgress, "bookProgress");
            kotlin.jvm.internal.g0.p(behaviors, "behaviors");
            kotlin.jvm.internal.g0.p(tips, "tips");
            this.f21736b = bookInfo;
            this.f21737c = bookProgress;
            this.f21738d = behaviors;
            this.f21739e = tips;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c g(c cVar, com.baicizhan.main.home.experiment.c cVar2, com.baicizhan.main.home.experiment.d dVar, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar2 = cVar.f21736b;
            }
            if ((i11 & 2) != 0) {
                dVar = cVar.f21737c;
            }
            if ((i11 & 4) != 0) {
                list = cVar.f21738d;
            }
            if ((i11 & 8) != 0) {
                list2 = cVar.f21739e;
            }
            return cVar.f(cVar2, dVar, list, list2);
        }

        @Override // com.baicizhan.main.home.experiment.w5
        @m80.k
        public com.baicizhan.main.home.experiment.c a() {
            return this.f21736b;
        }

        @m80.k
        public final com.baicizhan.main.home.experiment.c b() {
            return this.f21736b;
        }

        @m80.k
        public final com.baicizhan.main.home.experiment.d c() {
            return this.f21737c;
        }

        @m80.k
        public final List<com.baicizhan.main.home.experiment.b> d() {
            return this.f21738d;
        }

        @m80.k
        public final List<n5> e() {
            return this.f21739e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f21736b, cVar.f21736b) && kotlin.jvm.internal.g0.g(this.f21737c, cVar.f21737c) && kotlin.jvm.internal.g0.g(this.f21738d, cVar.f21738d) && kotlin.jvm.internal.g0.g(this.f21739e, cVar.f21739e);
        }

        @m80.k
        public final c f(@m80.k com.baicizhan.main.home.experiment.c bookInfo, @m80.k com.baicizhan.main.home.experiment.d bookProgress, @m80.k List<com.baicizhan.main.home.experiment.b> behaviors, @m80.k List<? extends n5> tips) {
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(bookProgress, "bookProgress");
            kotlin.jvm.internal.g0.p(behaviors, "behaviors");
            kotlin.jvm.internal.g0.p(tips, "tips");
            return new c(bookInfo, bookProgress, behaviors, tips);
        }

        @m80.k
        public final List<com.baicizhan.main.home.experiment.b> h() {
            return this.f21738d;
        }

        public int hashCode() {
            return (((((this.f21736b.hashCode() * 31) + this.f21737c.hashCode()) * 31) + this.f21738d.hashCode()) * 31) + this.f21739e.hashCode();
        }

        @m80.k
        public final com.baicizhan.main.home.experiment.d i() {
            return this.f21737c;
        }

        @m80.k
        public final List<n5> j() {
            return this.f21739e;
        }

        @m80.k
        public String toString() {
            return "Learning(bookInfo=" + this.f21736b + ", bookProgress=" + this.f21737c + ", behaviors=" + this.f21738d + ", tips=" + this.f21739e + pn.j.f81007d;
        }

        public /* synthetic */ c(com.baicizhan.main.home.experiment.c cVar, com.baicizhan.main.home.experiment.d dVar, List list, List list2, int i11, kotlin.jvm.internal.v vVar) {
            this(cVar, dVar, list, (i11 & 8) != 0 ? a00.h0.J() : list2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class d extends w5 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final d f21740b = new d();

        /* renamed from: c, reason: collision with root package name */
        public static final int f21741c = 0;

        public d() {
            super(null);
        }

        @Override // com.baicizhan.main.home.experiment.w5
        @m80.k
        public com.baicizhan.main.home.experiment.c a() {
            return com.baicizhan.main.home.experiment.c.f21106e.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class e extends w5 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final e f21742b = new e();

        /* renamed from: c, reason: collision with root package name */
        public static final int f21743c = 0;

        public e() {
            super(null);
        }

        @Override // com.baicizhan.main.home.experiment.w5
        @m80.k
        public com.baicizhan.main.home.experiment.c a() {
            return com.baicizhan.main.home.experiment.c.f21106e.a();
        }
    }

    public /* synthetic */ w5(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.k
    public abstract com.baicizhan.main.home.experiment.c a();

    public w5() {
    }
}
