package s40;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.WhenToOutput;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f87586a = a.f87587a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUnicode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Unicode.kt\nkotlinx/datetime/format/UnicodeFormat$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,659:1\n1#2:660\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f87587a = new a();

        @m80.k
        public final c2 a(@m80.k String pattern) {
            List list;
            List list2;
            c2 o11;
            List list3;
            c2 o12;
            kotlin.jvm.internal.g0.p(pattern, "pattern");
            List U = a00.h0.U(new ArrayList());
            int length = pattern.length();
            int i11 = 0;
            boolean z11 = false;
            String str = "";
            Character ch2 = null;
            for (int i12 = 0; i12 < length; i12++) {
                char charAt = pattern.charAt(i12);
                if (ch2 != null && charAt == ch2.charValue()) {
                    i11++;
                } else if (!z11) {
                    if (i11 > 0) {
                        List list4 = (List) a00.r0.u3(U);
                        if (list4 != null) {
                            kotlin.jvm.internal.g0.m(ch2);
                            o12 = f2.o(ch2.charValue(), i11);
                            list4.add(o12);
                        }
                        i11 = 0;
                        ch2 = null;
                    }
                    list3 = f2.f87670a;
                    if (list3.contains(Character.valueOf(charAt))) {
                        if (!kotlin.jvm.internal.g0.g(str, "")) {
                            List list5 = (List) a00.r0.u3(U);
                            if (list5 != null) {
                                list5.add(new e(str));
                            }
                            str = "";
                        }
                        if (charAt == '\'') {
                            z11 = true;
                            str = "";
                        } else if (charAt == '[') {
                            U.add(new ArrayList());
                        } else if (charAt != ']') {
                            ch2 = Character.valueOf(charAt);
                            i11 = 1;
                        } else {
                            List list6 = (List) a00.m0.Q0(U);
                            if (list6 == null) {
                                throw new IllegalArgumentException("Unmatched closing bracket");
                            }
                            List list7 = (List) a00.r0.u3(U);
                            if (list7 != null) {
                                list7.add(new c(new d(list6)));
                            }
                        }
                    } else {
                        str = str + charAt;
                    }
                } else if (charAt == '\'') {
                    List list8 = (List) a00.r0.u3(U);
                    if (list8 != null) {
                        if (str.length() == 0) {
                            str = "'";
                        }
                        list8.add(new e(str));
                    }
                    z11 = false;
                    str = "";
                } else {
                    str = str + charAt;
                }
            }
            if (i11 > 0 && (list2 = (List) a00.r0.u3(U)) != null) {
                kotlin.jvm.internal.g0.m(ch2);
                o11 = f2.o(ch2.charValue(), i11);
                list2.add(o11);
            }
            if (!kotlin.jvm.internal.g0.g(str, "") && (list = (List) a00.r0.u3(U)) != null) {
                list.add(new e(str));
            }
            List list9 = (List) a00.m0.Q0(U);
            if (list9 != null) {
                return new d(list9);
            }
            throw new IllegalArgumentException("Unmatched opening bracket");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b implements c2 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class a extends b {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$a$a, reason: collision with other inner class name */
            public static final class C1129a extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87588b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87589c;

                public C1129a(int i11) {
                    super(null);
                    this.f87588b = i11;
                    this.f87589c = io.ktor.util.date.b.f62000f;
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87588b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87589c;
                }

                @Override // s40.c2.b.a
                public void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        builder.j(Padding.NONE);
                    } else if (a11 == 2) {
                        builder.j(Padding.ZERO);
                    } else {
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$a$b, reason: collision with other inner class name */
            public static final class C1130b extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87590b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87591c;

                public C1130b(int i11) {
                    super(null);
                    this.f87590b = i11;
                    this.f87591c = 'E';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87590b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87591c;
                }

                @Override // s40.c2.b.a
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class c extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87592b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87593c;

                public c(int i11) {
                    super(null);
                    this.f87592b = i11;
                    this.f87593c = 'F';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87592b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87593c;
                }

                @Override // s40.c2.b.a
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.r("day-of-week-in-month", null, 2, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class d extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87594b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87595c;

                public d(int i11) {
                    super(null);
                    this.f87594b = i11;
                    this.f87595c = 'D';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87594b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87595c;
                }

                @Override // s40.c2.b.a
                public void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        builder.o(Padding.NONE);
                    } else if (a11 == 3) {
                        builder.o(Padding.ZERO);
                    } else {
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class e extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87596b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87597c;

                public e(int i11) {
                    super(null);
                    this.f87596b = i11;
                    this.f87597c = 'e';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87596b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87597c;
                }

                @Override // s40.c2.b.a
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class f extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87598b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87599c;

                public f(int i11) {
                    super(null);
                    this.f87598b = i11;
                    this.f87599c = 'g';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87598b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87599c;
                }

                @Override // s40.c2.b.a
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.r("modified-julian-day", null, 2, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class g extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87600b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87601c;

                public g(int i11) {
                    super(null);
                    this.f87600b = i11;
                    this.f87601c = 'c';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87600b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87601c;
                }

                @Override // s40.c2.b.a
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class h extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87602b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87603c;

                public h(int i11) {
                    super(null);
                    this.f87602b = i11;
                    this.f87603c = io.ktor.util.date.b.f62002h;
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87602b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87603c;
                }

                @Override // s40.c2.b.a
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.r("week-based-year", null, 2, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class i extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87604b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87605c;

                public i(int i11) {
                    super(null);
                    this.f87604b = i11;
                    this.f87605c = 'W';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87604b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87605c;
                }

                @Override // s40.c2.b.a
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.r("week-of-month", null, 2, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class j extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f87606b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87607c;

                public j(int i11) {
                    super(null);
                    this.f87606b = i11;
                    this.f87607c = 'w';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87606b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87607c;
                }

                @Override // s40.c2.b.a
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.a builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.r("week-of-week-based-year", null, 2, null);
                    throw new KotlinNothingValueException();
                }
            }

            public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
                this();
            }

            public abstract void c(@m80.k g0.a aVar);

            public a() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: s40.c2$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC1131b extends b {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$b$a */
            public static final class a extends AbstractC1131b {

                /* renamed from: b, reason: collision with root package name */
                public final int f87608b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87609c;

                public a(int i11) {
                    super(null);
                    this.f87608b = i11;
                    this.f87609c = 'O';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87608b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87609c;
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                public WhenToOutput e() {
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                public WhenToOutput f() {
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.e builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$b$b, reason: collision with other inner class name */
            public static final class C1132b extends AbstractC1131b {

                /* renamed from: b, reason: collision with root package name */
                public final int f87610b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87611c;

                public C1132b(int i11) {
                    super(null);
                    this.f87610b = i11;
                    this.f87611c = 'X';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87610b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87611c;
                }

                @Override // s40.c2.b.AbstractC1131b
                public void c(@m80.k g0.e builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        d(builder, true, false);
                        return;
                    }
                    if (a11 == 2) {
                        d(builder, true, false);
                        return;
                    }
                    if (a11 == 3) {
                        d(builder, true, true);
                        return;
                    }
                    if (a11 == 4) {
                        d(builder, true, false);
                    } else if (a11 == 5) {
                        d(builder, true, true);
                    } else {
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                public WhenToOutput e() {
                    return a() == 1 ? WhenToOutput.IF_NONZERO : WhenToOutput.ALWAYS;
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                public WhenToOutput f() {
                    return a() <= 3 ? WhenToOutput.NEVER : WhenToOutput.IF_NONZERO;
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$b$c */
            public static final class c extends AbstractC1131b {

                /* renamed from: b, reason: collision with root package name */
                public final int f87612b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87613c;

                public c(int i11) {
                    super(null);
                    this.f87612b = i11;
                    this.f87613c = 'x';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87612b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87613c;
                }

                @Override // s40.c2.b.AbstractC1131b
                public void c(@m80.k g0.e builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        d(builder, false, false);
                        return;
                    }
                    if (a11 == 2) {
                        d(builder, false, false);
                        return;
                    }
                    if (a11 == 3) {
                        d(builder, false, true);
                        return;
                    }
                    if (a11 == 4) {
                        d(builder, false, false);
                    } else if (a11 == 5) {
                        d(builder, false, true);
                    } else {
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                public WhenToOutput e() {
                    return a() == 1 ? WhenToOutput.IF_NONZERO : WhenToOutput.ALWAYS;
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                public WhenToOutput f() {
                    return a() <= 3 ? WhenToOutput.NEVER : WhenToOutput.IF_NONZERO;
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$b$d */
            public static final class d extends AbstractC1131b {

                /* renamed from: b, reason: collision with root package name */
                public final int f87614b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87615c;

                public d(int i11) {
                    super(null);
                    this.f87614b = i11;
                    this.f87615c = 'Z';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87614b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87615c;
                }

                @Override // s40.c2.b.AbstractC1131b
                public void c(@m80.k g0.e builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1 || a11 == 2 || a11 == 3) {
                        d(builder, false, false);
                        return;
                    }
                    if (a11 == 4) {
                        new a(4).c(builder);
                        throw new KotlinNothingValueException();
                    }
                    if (a11 == 5) {
                        d(builder, false, true);
                    } else {
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                public WhenToOutput e() {
                    return WhenToOutput.ALWAYS;
                }

                @Override // s40.c2.b.AbstractC1131b
                @m80.k
                public WhenToOutput f() {
                    return a() <= 3 ? WhenToOutput.NEVER : WhenToOutput.IF_NONZERO;
                }
            }

            public /* synthetic */ AbstractC1131b(kotlin.jvm.internal.v vVar) {
                this();
            }

            public abstract void c(@m80.k g0.e eVar);

            public final void d(@m80.k g0.e eVar, boolean z11, boolean z12) {
                kotlin.jvm.internal.g0.p(eVar, "<this>");
                e3.O(eVar, z11, z12, e(), f());
            }

            @m80.k
            public abstract WhenToOutput e();

            @m80.k
            public abstract WhenToOutput f();

            public AbstractC1131b() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class c extends b {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class a extends c {

                /* renamed from: b, reason: collision with root package name */
                public final int f87616b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87617c;

                public a(int i11) {
                    super(null);
                    this.f87616b = i11;
                    this.f87617c = io.ktor.util.date.b.f61999e;
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87616b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87617c;
                }

                @Override // s40.c2.b.c
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.d builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$c$b, reason: collision with other inner class name */
            public static final class C1133b extends c {

                /* renamed from: b, reason: collision with root package name */
                public final int f87618b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87619c;

                public C1133b(int i11) {
                    super(null);
                    this.f87618b = i11;
                    this.f87619c = 'a';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87618b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87619c;
                }

                @Override // s40.c2.b.c
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.d builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$c$c, reason: collision with other inner class name */
            public static final class C1134c extends c {

                /* renamed from: b, reason: collision with root package name */
                public final int f87620b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87621c;

                public C1134c(int i11) {
                    super(null);
                    this.f87620b = i11;
                    this.f87621c = 'H';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87620b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87621c;
                }

                @Override // s40.c2.b.c
                public void c(@m80.k g0.d builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        builder.w(Padding.NONE);
                    } else if (a11 == 2) {
                        builder.w(Padding.ZERO);
                    } else {
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class d extends c {

                /* renamed from: b, reason: collision with root package name */
                public final int f87622b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87623c;

                public d(int i11) {
                    super(null);
                    this.f87622b = i11;
                    this.f87623c = io.ktor.util.date.b.f61998d;
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87622b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87623c;
                }

                @Override // s40.c2.b.c
                public void c(@m80.k g0.d builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        builder.t(Padding.NONE);
                    } else if (a11 == 2) {
                        builder.t(Padding.ZERO);
                    } else {
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static abstract class e extends c {

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static final class a extends e {

                    /* renamed from: b, reason: collision with root package name */
                    public final int f87624b;

                    /* renamed from: c, reason: collision with root package name */
                    public final char f87625c;

                    public a(int i11) {
                        super(null);
                        this.f87624b = i11;
                        this.f87625c = io.ktor.util.date.b.f61997c;
                    }

                    @Override // s40.c2.b
                    public int a() {
                        return this.f87624b;
                    }

                    @Override // s40.c2.b
                    public char b() {
                        return this.f87625c;
                    }

                    @Override // s40.c2.b.c
                    public void c(@m80.k g0.d builder) {
                        kotlin.jvm.internal.g0.p(builder, "builder");
                        int a11 = a();
                        if (a11 == 1) {
                            builder.u(Padding.NONE);
                        } else if (a11 == 2) {
                            builder.u(Padding.ZERO);
                        } else {
                            f2.p(this);
                            throw new KotlinNothingValueException();
                        }
                    }
                }

                public /* synthetic */ e(kotlin.jvm.internal.v vVar) {
                    this();
                }

                public e() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static abstract class f extends e {

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static final class a extends f {

                    /* renamed from: b, reason: collision with root package name */
                    public final int f87626b;

                    /* renamed from: c, reason: collision with root package name */
                    public final char f87627c;

                    public a(int i11) {
                        super(null);
                        this.f87626b = i11;
                        this.f87627c = 'S';
                    }

                    @Override // s40.c2.b
                    public int a() {
                        return this.f87626b;
                    }

                    @Override // s40.c2.b
                    public char b() {
                        return this.f87627c;
                    }

                    @Override // s40.c2.b.c
                    public void c(@m80.k g0.d builder) {
                        kotlin.jvm.internal.g0.p(builder, "builder");
                        builder.N(a());
                    }
                }

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                /* renamed from: s40.c2$b$c$f$b, reason: collision with other inner class name */
                public static final class C1135b extends f {

                    /* renamed from: b, reason: collision with root package name */
                    public final int f87628b;

                    /* renamed from: c, reason: collision with root package name */
                    public final char f87629c;

                    public C1135b(int i11) {
                        super(null);
                        this.f87628b = i11;
                        this.f87629c = 'A';
                    }

                    @Override // s40.c2.b
                    public int a() {
                        return this.f87628b;
                    }

                    @Override // s40.c2.b
                    public char b() {
                        return this.f87629c;
                    }

                    @Override // s40.c2.b.c
                    @m80.k
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public Void c(@m80.k g0.d builder) {
                        kotlin.jvm.internal.g0.p(builder, "builder");
                        f2.r("millisecond-of-day", null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                }

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                /* renamed from: s40.c2$b$c$f$c, reason: collision with other inner class name */
                public static final class C1136c extends f {

                    /* renamed from: b, reason: collision with root package name */
                    public final int f87630b;

                    /* renamed from: c, reason: collision with root package name */
                    public final char f87631c;

                    public C1136c(int i11) {
                        super(null);
                        this.f87630b = i11;
                        this.f87631c = 'N';
                    }

                    @Override // s40.c2.b
                    public int a() {
                        return this.f87630b;
                    }

                    @Override // s40.c2.b
                    public char b() {
                        return this.f87631c;
                    }

                    @Override // s40.c2.b.c
                    @m80.k
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public Void c(@m80.k g0.d builder) {
                        kotlin.jvm.internal.g0.p(builder, "builder");
                        f2.r("nanosecond-of-day", null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                }

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static final class d extends f {

                    /* renamed from: b, reason: collision with root package name */
                    public final int f87632b;

                    /* renamed from: c, reason: collision with root package name */
                    public final char f87633c;

                    public d(int i11) {
                        super(null);
                        this.f87632b = i11;
                        this.f87633c = 'n';
                    }

                    @Override // s40.c2.b
                    public int a() {
                        return this.f87632b;
                    }

                    @Override // s40.c2.b
                    public char b() {
                        return this.f87633c;
                    }

                    @Override // s40.c2.b.c
                    @m80.k
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public Void c(@m80.k g0.d builder) {
                        kotlin.jvm.internal.g0.p(builder, "builder");
                        f2.q("nano-of-second", "Maybe you meant 'S' instead of 'n'?");
                        throw new KotlinNothingValueException();
                    }
                }

                public /* synthetic */ f(kotlin.jvm.internal.v vVar) {
                    this();
                }

                public f() {
                    super(null);
                }
            }

            public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
                this();
            }

            public abstract void c(@m80.k g0.d dVar);

            public c() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class d extends a {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class a extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87634b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87635c;

                public a(int i11) {
                    super(null);
                    this.f87634b = i11;
                    this.f87635c = 'U';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87634b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87635c;
                }

                @Override // s40.c2.b.d
                @m80.k
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public Void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.r("cyclic-year", null, 2, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$d$b, reason: collision with other inner class name */
            public static final class C1137b extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87636b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87637c;

                public C1137b(int i11) {
                    super(null);
                    this.f87636b = i11;
                    this.f87637c = 'G';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87636b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87637c;
                }

                @Override // s40.c2.b.d
                @m80.k
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public Void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class c extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87638b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87639c;

                public c(int i11) {
                    super(null);
                    this.f87638b = i11;
                    this.f87639c = io.ktor.util.date.b.f62001g;
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87638b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87639c;
                }

                @Override // s40.c2.b.d
                public void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        builder.b(Padding.NONE);
                        return;
                    }
                    if (a11 == 2) {
                        builder.b(Padding.ZERO);
                    } else {
                        if (a11 == 3 || a11 == 4 || a11 == 5) {
                            f2.n(this, null, 1, null);
                            throw new KotlinNothingValueException();
                        }
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$d$d, reason: collision with other inner class name */
            public static final class C1138d extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87640b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87641c;

                public C1138d(int i11) {
                    super(null);
                    this.f87640b = i11;
                    this.f87641c = 'Q';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87640b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87641c;
                }

                @Override // s40.c2.b.d
                public void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1 || a11 == 2) {
                        f2.r("quarter-of-year", null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    if (a11 == 3 || a11 == 4 || a11 == 5) {
                        f2.n(this, null, 1, null);
                        throw new KotlinNothingValueException();
                    }
                    f2.p(this);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class e extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87642b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87643c;

                public e(int i11) {
                    super(null);
                    this.f87642b = i11;
                    this.f87643c = 'r';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87642b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87643c;
                }

                @Override // s40.c2.b.d
                @m80.k
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public Void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.r("related-gregorian-year", null, 2, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class f extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87644b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87645c;

                public f(int i11) {
                    super(null);
                    this.f87644b = i11;
                    this.f87645c = 'L';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87644b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87645c;
                }

                @Override // s40.c2.b.d
                public void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        builder.b(Padding.NONE);
                        return;
                    }
                    if (a11 == 2) {
                        builder.b(Padding.ZERO);
                    } else {
                        if (a11 == 3 || a11 == 4 || a11 == 5) {
                            f2.n(this, null, 1, null);
                            throw new KotlinNothingValueException();
                        }
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class g extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87646b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87647c;

                public g(int i11) {
                    super(null);
                    this.f87646b = i11;
                    this.f87647c = 'q';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87646b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87647c;
                }

                @Override // s40.c2.b.d
                public void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1 || a11 == 2) {
                        f2.r("standalone-quarter-of-year", null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    if (a11 == 3 || a11 == 4 || a11 == 5) {
                        f2.n(this, null, 1, null);
                        throw new KotlinNothingValueException();
                    }
                    f2.p(this);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class h extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87648b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87649c;

                public h(int i11) {
                    super(null);
                    this.f87648b = i11;
                    this.f87649c = l50.b.f69934p;
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87648b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87649c;
                }

                @Override // s40.c2.b.d
                public void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        builder.v(Padding.NONE);
                        return;
                    }
                    if (a11 == 2) {
                        builder.q(2000);
                        return;
                    }
                    if (a11 == 3) {
                        f2.s(this, a());
                        throw new KotlinNothingValueException();
                    }
                    if (a11 == 4) {
                        builder.v(Padding.ZERO);
                    } else {
                        f2.s(this, a());
                        throw new KotlinNothingValueException();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class i extends d {

                /* renamed from: b, reason: collision with root package name */
                public final int f87650b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87651c;

                public i(int i11) {
                    super(null);
                    this.f87650b = i11;
                    this.f87651c = 'y';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87650b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87651c;
                }

                @Override // s40.c2.b.d
                public void d(@m80.k g0.f builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    int a11 = a();
                    if (a11 == 1) {
                        o3.j(builder, Padding.NONE);
                        return;
                    }
                    if (a11 == 2) {
                        o3.k(builder, 2000);
                        return;
                    }
                    if (a11 == 3) {
                        f2.s(this, a());
                        throw new KotlinNothingValueException();
                    }
                    if (a11 == 4) {
                        o3.j(builder, Padding.ZERO);
                    } else {
                        f2.s(this, a());
                        throw new KotlinNothingValueException();
                    }
                }
            }

            public /* synthetic */ d(kotlin.jvm.internal.v vVar) {
                this();
            }

            @Override // s40.c2.b.a
            public void c(@m80.k g0.a builder) {
                kotlin.jvm.internal.g0.p(builder, "builder");
                d(builder);
            }

            public abstract void d(@m80.k g0.f fVar);

            public d() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class e extends b {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class a extends e {

                /* renamed from: b, reason: collision with root package name */
                public final int f87652b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87653c;

                public a(int i11) {
                    super(null);
                    this.f87652b = i11;
                    this.f87653c = 'v';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87652b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87653c;
                }

                @Override // s40.c2.b.e
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.c builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.n(this, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: s40.c2$b$e$b, reason: collision with other inner class name */
            public static final class C1139b extends e {

                /* renamed from: b, reason: collision with root package name */
                public final int f87654b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87655c;

                public C1139b(int i11) {
                    super(null);
                    this.f87654b = i11;
                    this.f87655c = 'V';
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87654b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87655c;
                }

                @Override // s40.c2.b.e
                public void c(@m80.k g0.c builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    if (a() == 2) {
                        builder.C();
                    } else {
                        f2.p(this);
                        throw new KotlinNothingValueException();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class c extends e {

                /* renamed from: b, reason: collision with root package name */
                public final int f87656b;

                /* renamed from: c, reason: collision with root package name */
                public final char f87657c;

                public c(int i11) {
                    super(null);
                    this.f87656b = i11;
                    this.f87657c = io.ktor.util.date.b.f62003i;
                }

                @Override // s40.c2.b
                public int a() {
                    return this.f87656b;
                }

                @Override // s40.c2.b
                public char b() {
                    return this.f87657c;
                }

                @Override // s40.c2.b.e
                @m80.k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Void c(@m80.k g0.c builder) {
                    kotlin.jvm.internal.g0.p(builder, "builder");
                    f2.m(this, "Format 'V' can be used to format time zone IDs in a locale-invariant manner.");
                    throw new KotlinNothingValueException();
                }
            }

            public /* synthetic */ e(kotlin.jvm.internal.v vVar) {
                this();
            }

            public abstract void c(@m80.k g0.c cVar);

            public e() {
                super(null);
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public abstract int a();

        public abstract char b();

        public boolean equals(@m80.l Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return b() == bVar.b() && a() == bVar.a();
        }

        public int hashCode() {
            return (Character.hashCode(b()) * 31) + a();
        }

        @m80.k
        public String toString() {
            return u30.f0.v2(String.valueOf(b()), a());
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements c2 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final c2 f87658b;

        public c(@m80.k c2 format) {
            kotlin.jvm.internal.g0.p(format, "format");
            this.f87658b = format;
        }

        public static /* synthetic */ c c(c cVar, c2 c2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c2Var = cVar.f87658b;
            }
            return cVar.b(c2Var);
        }

        @m80.k
        public final c2 a() {
            return this.f87658b;
        }

        @m80.k
        public final c b(@m80.k c2 format) {
            kotlin.jvm.internal.g0.p(format, "format");
            return new c(format);
        }

        @m80.k
        public final c2 d() {
            return this.f87658b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.g0.g(this.f87658b, ((c) obj).f87658b);
        }

        public int hashCode() {
            return this.f87658b.hashCode();
        }

        @m80.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            sb2.append(this.f87658b);
            sb2.append(l50.b.f69930l);
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements c2 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<c2> f87659b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@m80.k List<? extends c2> formats) {
            kotlin.jvm.internal.g0.p(formats, "formats");
            this.f87659b = formats;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d c(d dVar, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = dVar.f87659b;
            }
            return dVar.b(list);
        }

        @m80.k
        public final List<c2> a() {
            return this.f87659b;
        }

        @m80.k
        public final d b(@m80.k List<? extends c2> formats) {
            kotlin.jvm.internal.g0.p(formats, "formats");
            return new d(formats);
        }

        @m80.k
        public final List<c2> d() {
            return this.f87659b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.g0.g(this.f87659b, ((d) obj).f87659b);
        }

        public int hashCode() {
            return this.f87659b.hashCode();
        }

        @m80.k
        public String toString() {
            return a00.r0.r3(this.f87659b, "", null, null, 0, null, null, 62, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUnicode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Unicode.kt\nkotlinx/datetime/format/UnicodeFormat$StringLiteral\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,659:1\n1088#2,2:660\n*S KotlinDebug\n*F\n+ 1 Unicode.kt\nkotlinx/datetime/format/UnicodeFormat$StringLiteral\n*L\n243#1:660,2\n*E\n"})
    public static final class e implements c2 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f87660b;

        public e(@m80.k String literal) {
            kotlin.jvm.internal.g0.p(literal, "literal");
            this.f87660b = literal;
        }

        public static /* synthetic */ e c(e eVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = eVar.f87660b;
            }
            return eVar.b(str);
        }

        @m80.k
        public final String a() {
            return this.f87660b;
        }

        @m80.k
        public final e b(@m80.k String literal) {
            kotlin.jvm.internal.g0.p(literal, "literal");
            return new e(literal);
        }

        @m80.k
        public final String d() {
            return this.f87660b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.g0.g(this.f87660b, ((e) obj).f87660b);
        }

        public int hashCode() {
            return this.f87660b.hashCode();
        }

        @m80.k
        public String toString() {
            if (kotlin.jvm.internal.g0.g(this.f87660b, "'")) {
                return "''";
            }
            String str = this.f87660b;
            for (int i11 = 0; i11 < str.length(); i11++) {
                if (Character.isLetter(str.charAt(i11))) {
                    return '\'' + this.f87660b + '\'';
                }
            }
            return this.f87660b.length() == 0 ? "" : this.f87660b;
        }
    }
}
