package com.baicizhan.main.home.plan.newexam;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22589a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends c {

        /* renamed from: d, reason: collision with root package name */
        public static final int f22590d = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22591b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f22592c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k String bookName, @m80.k String bookImg) {
            super(null);
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(bookImg, "bookImg");
            this.f22591b = bookName;
            this.f22592c = bookImg;
        }

        public static /* synthetic */ a d(a aVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f22591b;
            }
            if ((i11 & 2) != 0) {
                str2 = aVar.f22592c;
            }
            return aVar.c(str, str2);
        }

        @m80.k
        public final String a() {
            return this.f22591b;
        }

        @m80.k
        public final String b() {
            return this.f22592c;
        }

        @m80.k
        public final a c(@m80.k String bookName, @m80.k String bookImg) {
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(bookImg, "bookImg");
            return new a(bookName, bookImg);
        }

        @m80.k
        public final String e() {
            return this.f22592c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f22591b, aVar.f22591b) && kotlin.jvm.internal.g0.g(this.f22592c, aVar.f22592c);
        }

        @m80.k
        public final String f() {
            return this.f22591b;
        }

        public int hashCode() {
            return (this.f22591b.hashCode() * 31) + this.f22592c.hashCode();
        }

        @m80.k
        public String toString() {
            return "AllKillNext(bookName=" + this.f22591b + ", bookImg=" + this.f22592c + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends c {

        /* renamed from: d, reason: collision with root package name */
        public static final int f22593d = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22594b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f22595c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String bookName, @m80.k String bookImg) {
            super(null);
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(bookImg, "bookImg");
            this.f22594b = bookName;
            this.f22595c = bookImg;
        }

        public static /* synthetic */ b d(b bVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f22594b;
            }
            if ((i11 & 2) != 0) {
                str2 = bVar.f22595c;
            }
            return bVar.c(str, str2);
        }

        @m80.k
        public final String a() {
            return this.f22594b;
        }

        @m80.k
        public final String b() {
            return this.f22595c;
        }

        @m80.k
        public final b c(@m80.k String bookName, @m80.k String bookImg) {
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(bookImg, "bookImg");
            return new b(bookName, bookImg);
        }

        @m80.k
        public final String e() {
            return this.f22595c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f22594b, bVar.f22594b) && kotlin.jvm.internal.g0.g(this.f22595c, bVar.f22595c);
        }

        @m80.k
        public final String f() {
            return this.f22594b;
        }

        public int hashCode() {
            return (this.f22594b.hashCode() * 31) + this.f22595c.hashCode();
        }

        @m80.k
        public String toString() {
            return "AllKillToday(bookName=" + this.f22594b + ", bookImg=" + this.f22595c + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    /* renamed from: com.baicizhan.main.home.plan.newexam.c$c, reason: collision with other inner class name */
    public static final class C0313c extends c {

        /* renamed from: e, reason: collision with root package name */
        public static final int f22596e = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22597b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f22598c;

        /* renamed from: d, reason: collision with root package name */
        public final int f22599d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0313c(@m80.k String bookName, @m80.k String bookImg, int i11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(bookImg, "bookImg");
            this.f22597b = bookName;
            this.f22598c = bookImg;
            this.f22599d = i11;
        }

        public static /* synthetic */ C0313c e(C0313c c0313c, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = c0313c.f22597b;
            }
            if ((i12 & 2) != 0) {
                str2 = c0313c.f22598c;
            }
            if ((i12 & 4) != 0) {
                i11 = c0313c.f22599d;
            }
            return c0313c.d(str, str2, i11);
        }

        @m80.k
        public final String a() {
            return this.f22597b;
        }

        @m80.k
        public final String b() {
            return this.f22598c;
        }

        public final int c() {
            return this.f22599d;
        }

        @m80.k
        public final C0313c d(@m80.k String bookName, @m80.k String bookImg, int i11) {
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(bookImg, "bookImg");
            return new C0313c(bookName, bookImg, i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0313c)) {
                return false;
            }
            C0313c c0313c = (C0313c) obj;
            return kotlin.jvm.internal.g0.g(this.f22597b, c0313c.f22597b) && kotlin.jvm.internal.g0.g(this.f22598c, c0313c.f22598c) && this.f22599d == c0313c.f22599d;
        }

        @m80.k
        public final String f() {
            return this.f22598c;
        }

        @m80.k
        public final String g() {
            return this.f22597b;
        }

        public final int h() {
            return this.f22599d;
        }

        public int hashCode() {
            return (((this.f22597b.hashCode() * 31) + this.f22598c.hashCode()) * 31) + Integer.hashCode(this.f22599d);
        }

        @m80.k
        public String toString() {
            return "BookDone(bookName=" + this.f22597b + ", bookImg=" + this.f22598c + ", finishCount=" + this.f22599d + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class e extends c {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22608c = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Void f22609b;

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ e c(e eVar, Void r12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                r12 = eVar.f22609b;
            }
            return eVar.b(r12);
        }

        @m80.l
        public final Void a() {
            return this.f22609b;
        }

        @m80.k
        public final e b(@m80.l Void r22) {
            return new e(r22);
        }

        @m80.l
        public final Void d() {
            return this.f22609b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.g0.g(this.f22609b, ((e) obj).f22609b);
        }

        public int hashCode() {
            Void r02 = this.f22609b;
            if (r02 == null) {
                return 0;
            }
            return r02.hashCode();
        }

        @m80.k
        public String toString() {
            return "Loading(void=" + this.f22609b + pn.j.f81007d;
        }

        public e(@m80.l Void r22) {
            super(null);
            this.f22609b = r22;
        }

        public /* synthetic */ e(Void r12, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? null : r12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class f extends c {

        /* renamed from: e, reason: collision with root package name */
        public static final int f22610e = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22611b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f22612c;

        /* renamed from: d, reason: collision with root package name */
        public final int f22613d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k String bookName, @m80.k String bookImg, int i11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(bookImg, "bookImg");
            this.f22611b = bookName;
            this.f22612c = bookImg;
            this.f22613d = i11;
        }

        public static /* synthetic */ f e(f fVar, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = fVar.f22611b;
            }
            if ((i12 & 2) != 0) {
                str2 = fVar.f22612c;
            }
            if ((i12 & 4) != 0) {
                i11 = fVar.f22613d;
            }
            return fVar.d(str, str2, i11);
        }

        @m80.k
        public final String a() {
            return this.f22611b;
        }

        @m80.k
        public final String b() {
            return this.f22612c;
        }

        public final int c() {
            return this.f22613d;
        }

        @m80.k
        public final f d(@m80.k String bookName, @m80.k String bookImg, int i11) {
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(bookImg, "bookImg");
            return new f(bookName, bookImg, i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.g0.g(this.f22611b, fVar.f22611b) && kotlin.jvm.internal.g0.g(this.f22612c, fVar.f22612c) && this.f22613d == fVar.f22613d;
        }

        @m80.k
        public final String f() {
            return this.f22612c;
        }

        @m80.k
        public final String g() {
            return this.f22611b;
        }

        public final int h() {
            return this.f22613d;
        }

        public int hashCode() {
            return (((this.f22611b.hashCode() * 31) + this.f22612c.hashCode()) * 31) + Integer.hashCode(this.f22613d);
        }

        @m80.k
        public String toString() {
            return "ReviewBookDone(bookName=" + this.f22611b + ", bookImg=" + this.f22612c + ", round=" + this.f22613d + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class g extends c {

        /* renamed from: i, reason: collision with root package name */
        public static final int f22614i = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final j2 f22615b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22616c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f22617d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final th.a f22618e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final y4 f22619f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.main.home.plan.newexam.b f22620g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public final Integer f22621h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k j2 bookInfo, boolean z11, boolean z12, @m80.l th.a aVar, @m80.k y4 studyState, @m80.k com.baicizhan.main.home.plan.newexam.b button, @m80.l Integer num) {
            super(null);
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(studyState, "studyState");
            kotlin.jvm.internal.g0.p(button, "button");
            this.f22615b = bookInfo;
            this.f22616c = z11;
            this.f22617d = z12;
            this.f22618e = aVar;
            this.f22619f = studyState;
            this.f22620g = button;
            this.f22621h = num;
        }

        public static /* synthetic */ g i(g gVar, j2 j2Var, boolean z11, boolean z12, th.a aVar, y4 y4Var, com.baicizhan.main.home.plan.newexam.b bVar, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j2Var = gVar.f22615b;
            }
            if ((i11 & 2) != 0) {
                z11 = gVar.f22616c;
            }
            if ((i11 & 4) != 0) {
                z12 = gVar.f22617d;
            }
            if ((i11 & 8) != 0) {
                aVar = gVar.f22618e;
            }
            if ((i11 & 16) != 0) {
                y4Var = gVar.f22619f;
            }
            if ((i11 & 32) != 0) {
                bVar = gVar.f22620g;
            }
            if ((i11 & 64) != 0) {
                num = gVar.f22621h;
            }
            com.baicizhan.main.home.plan.newexam.b bVar2 = bVar;
            Integer num2 = num;
            y4 y4Var2 = y4Var;
            boolean z13 = z12;
            return gVar.h(j2Var, z11, z13, aVar, y4Var2, bVar2, num2);
        }

        @m80.k
        public final j2 a() {
            return this.f22615b;
        }

        public final boolean b() {
            return this.f22616c;
        }

        public final boolean c() {
            return this.f22617d;
        }

        @m80.l
        public final th.a d() {
            return this.f22618e;
        }

        @m80.k
        public final y4 e() {
            return this.f22619f;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.g0.g(this.f22615b, gVar.f22615b) && this.f22616c == gVar.f22616c && this.f22617d == gVar.f22617d && kotlin.jvm.internal.g0.g(this.f22618e, gVar.f22618e) && kotlin.jvm.internal.g0.g(this.f22619f, gVar.f22619f) && kotlin.jvm.internal.g0.g(this.f22620g, gVar.f22620g) && kotlin.jvm.internal.g0.g(this.f22621h, gVar.f22621h);
        }

        @m80.k
        public final com.baicizhan.main.home.plan.newexam.b f() {
            return this.f22620g;
        }

        @m80.l
        public final Integer g() {
            return this.f22621h;
        }

        @m80.k
        public final g h(@m80.k j2 bookInfo, boolean z11, boolean z12, @m80.l th.a aVar, @m80.k y4 studyState, @m80.k com.baicizhan.main.home.plan.newexam.b button, @m80.l Integer num) {
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(studyState, "studyState");
            kotlin.jvm.internal.g0.p(button, "button");
            return new g(bookInfo, z11, z12, aVar, studyState, button, num);
        }

        public int hashCode() {
            int hashCode = ((((this.f22615b.hashCode() * 31) + Boolean.hashCode(this.f22616c)) * 31) + Boolean.hashCode(this.f22617d)) * 31;
            th.a aVar = this.f22618e;
            int hashCode2 = (((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f22619f.hashCode()) * 31) + this.f22620g.hashCode()) * 31;
            Integer num = this.f22621h;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        @m80.l
        public final th.a j() {
            return this.f22618e;
        }

        @m80.k
        public final j2 k() {
            return this.f22615b;
        }

        @m80.k
        public final com.baicizhan.main.home.plan.newexam.b l() {
            return this.f22620g;
        }

        public final boolean m() {
            return this.f22617d;
        }

        @m80.l
        public final Integer n() {
            return this.f22621h;
        }

        public final boolean o() {
            return this.f22616c;
        }

        @m80.k
        public final y4 p() {
            return this.f22619f;
        }

        @m80.k
        public String toString() {
            return "Reviewing(bookInfo=" + this.f22615b + ", showDaka=" + this.f22616c + ", finishToday=" + this.f22617d + ", ad=" + this.f22618e + ", studyState=" + this.f22619f + ", button=" + this.f22620g + ", reviewRemain=" + this.f22621h + pn.j.f81007d;
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
        this();
    }

    public c() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class d extends c {

        /* renamed from: i, reason: collision with root package name */
        public static final int f22600i = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final j2 f22601b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22602c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f22603d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final th.a f22604e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final List<y4> f22605f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final List<com.baicizhan.main.home.plan.newexam.b> f22606g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f22607h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k j2 bookInfo, boolean z11, boolean z12, @m80.l th.a aVar, @m80.k List<y4> studyState, @m80.k List<com.baicizhan.main.home.plan.newexam.b> buttons, boolean z13) {
            super(null);
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(studyState, "studyState");
            kotlin.jvm.internal.g0.p(buttons, "buttons");
            this.f22601b = bookInfo;
            this.f22602c = z11;
            this.f22603d = z12;
            this.f22604e = aVar;
            this.f22605f = studyState;
            this.f22606g = buttons;
            this.f22607h = z13;
        }

        public static /* synthetic */ d i(d dVar, j2 j2Var, boolean z11, boolean z12, th.a aVar, List list, List list2, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j2Var = dVar.f22601b;
            }
            if ((i11 & 2) != 0) {
                z11 = dVar.f22602c;
            }
            if ((i11 & 4) != 0) {
                z12 = dVar.f22603d;
            }
            if ((i11 & 8) != 0) {
                aVar = dVar.f22604e;
            }
            if ((i11 & 16) != 0) {
                list = dVar.f22605f;
            }
            if ((i11 & 32) != 0) {
                list2 = dVar.f22606g;
            }
            if ((i11 & 64) != 0) {
                z13 = dVar.f22607h;
            }
            List list3 = list2;
            boolean z14 = z13;
            List list4 = list;
            boolean z15 = z12;
            return dVar.h(j2Var, z11, z15, aVar, list4, list3, z14);
        }

        @m80.k
        public final j2 a() {
            return this.f22601b;
        }

        public final boolean b() {
            return this.f22602c;
        }

        public final boolean c() {
            return this.f22603d;
        }

        @m80.l
        public final th.a d() {
            return this.f22604e;
        }

        @m80.k
        public final List<y4> e() {
            return this.f22605f;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.g0.g(this.f22601b, dVar.f22601b) && this.f22602c == dVar.f22602c && this.f22603d == dVar.f22603d && kotlin.jvm.internal.g0.g(this.f22604e, dVar.f22604e) && kotlin.jvm.internal.g0.g(this.f22605f, dVar.f22605f) && kotlin.jvm.internal.g0.g(this.f22606g, dVar.f22606g) && this.f22607h == dVar.f22607h;
        }

        @m80.k
        public final List<com.baicizhan.main.home.plan.newexam.b> f() {
            return this.f22606g;
        }

        public final boolean g() {
            return this.f22607h;
        }

        @m80.k
        public final d h(@m80.k j2 bookInfo, boolean z11, boolean z12, @m80.l th.a aVar, @m80.k List<y4> studyState, @m80.k List<com.baicizhan.main.home.plan.newexam.b> buttons, boolean z13) {
            kotlin.jvm.internal.g0.p(bookInfo, "bookInfo");
            kotlin.jvm.internal.g0.p(studyState, "studyState");
            kotlin.jvm.internal.g0.p(buttons, "buttons");
            return new d(bookInfo, z11, z12, aVar, studyState, buttons, z13);
        }

        public int hashCode() {
            int hashCode = ((((this.f22601b.hashCode() * 31) + Boolean.hashCode(this.f22602c)) * 31) + Boolean.hashCode(this.f22603d)) * 31;
            th.a aVar = this.f22604e;
            return ((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f22605f.hashCode()) * 31) + this.f22606g.hashCode()) * 31) + Boolean.hashCode(this.f22607h);
        }

        @m80.l
        public final th.a j() {
            return this.f22604e;
        }

        @m80.k
        public final j2 k() {
            return this.f22601b;
        }

        @m80.k
        public final List<com.baicizhan.main.home.plan.newexam.b> l() {
            return this.f22606g;
        }

        public final boolean m() {
            return this.f22603d;
        }

        public final boolean n() {
            return this.f22602c;
        }

        public final boolean o() {
            return this.f22607h;
        }

        @m80.k
        public final List<y4> p() {
            return this.f22605f;
        }

        @m80.k
        public String toString() {
            return "Learning(bookInfo=" + this.f22601b + ", showDaka=" + this.f22602c + ", finishToday=" + this.f22603d + ", ad=" + this.f22604e + ", studyState=" + this.f22605f + ", buttons=" + this.f22606g + ", showMapTips=" + this.f22607h + pn.j.f81007d;
        }

        public /* synthetic */ d(j2 j2Var, boolean z11, boolean z12, th.a aVar, List list, List list2, boolean z13, int i11, kotlin.jvm.internal.v vVar) {
            this(j2Var, z11, z12, aVar, list, list2, (i11 & 64) != 0 ? false : z13);
        }
    }
}
