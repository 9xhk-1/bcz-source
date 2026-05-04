package kotlin.reflect.jvm.internal.calls;

import a00.a0;
import a00.q;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.v0;
import kotlin.reflect.jvm.internal.calls.a;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"})
/* loaded from: classes8.dex */
public abstract class b<M extends Member> implements kotlin.reflect.jvm.internal.calls.a<M> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d f67101e = new d(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final M f67102a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Type f67103b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Class<?> f67104c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Type> f67105d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,265:1\n262#2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n*L\n76#1:266\n*E\n"})
    public static final class a extends b<Constructor<?>> implements l10.f {

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Object f67106f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@m80.k java.lang.reflect.Constructor<?> r8, @m80.l java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L1f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L26
            L1f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = a00.q.l1(r0, r2, r1)
            L26:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r1.f67106f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @l
        public Object call(@k Object[] args) {
            g0.p(args, "args");
            c(args);
            Constructor<?> b11 = b();
            v0 v0Var = new v0(3);
            v0Var.a(this.f67106f);
            v0Var.b(args);
            v0Var.a(null);
            return b11.newInstance(v0Var.d(new Object[v0Var.c()]));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,265:1\n258#2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n*L\n62#1:266\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.calls.b$b, reason: collision with other inner class name */
    public static final class C0784b extends b<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0784b(@m80.k java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L1f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L25
            L1f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = a00.q.l1(r0, r2, r1)
            L25:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.C0784b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @l
        public Object call(@k Object[] args) {
            g0.p(args, "args");
            c(args);
            Constructor<?> b11 = b();
            v0 v0Var = new v0(2);
            v0Var.b(args);
            v0Var.a(null);
            return b11.newInstance(v0Var.d(new Object[v0Var.c()]));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends b<Constructor<?>> implements l10.f {

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Object f67107f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@m80.k java.lang.reflect.Constructor<?> r8, @m80.l java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r5, r0)
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r1.f67107f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @l
        public Object call(@k Object[] args) {
            g0.p(args, "args");
            c(args);
            Constructor<?> b11 = b();
            v0 v0Var = new v0(2);
            v0Var.a(this.f67107f);
            v0Var.b(args);
            return b11.newInstance(v0Var.d(new Object[v0Var.c()]));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {
        public /* synthetic */ d(v vVar) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends b<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(@m80.k java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L24
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L24
            L22:
                r4 = r1
                goto L26
            L24:
                r1 = 0
                goto L22
            L26:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.e.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @l
        public Object call(@k Object[] args) {
            g0.p(args, "args");
            c(args);
            return b().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f extends b<Field> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends f implements l10.f {

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Object f67108f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@k Field field, @l Object obj) {
                super(field, false, null);
                g0.p(field, "field");
                this.f67108f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.b.f, kotlin.reflect.jvm.internal.calls.a
            @l
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                return b().get(this.f67108f);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.calls.b$f$b, reason: collision with other inner class name */
        public static final class C0785b extends f implements l10.f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0785b(@k Field field) {
                super(field, false, null);
                g0.p(field, "field");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@k Field field) {
                super(field, true, null);
                g0.p(field, "field");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@k Field field) {
                super(field, true, null);
                g0.p(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.b
            public void c(@k Object[] args) {
                g0.p(args, "args");
                super.c(args);
                d(a0.Fc(args));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@k Field field) {
                super(field, false, null);
                g0.p(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z11, v vVar) {
            this(field, z11);
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @l
        public Object call(@k Object[] args) {
            g0.p(args, "args");
            c(args);
            return b().get(e() != null ? a0.jc(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "getGenericType(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                if (r8 == 0) goto L11
                java.lang.Class r8 = r7.getDeclaringClass()
            Lf:
                r3 = r8
                goto L13
            L11:
                r8 = 0
                goto Lf
            L13:
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.f.<init>(java.lang.reflect.Field, boolean):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class g extends b<Field> {

        /* renamed from: f, reason: collision with root package name */
        public final boolean f67109f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends g implements l10.f {

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Object f67110g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@k Field field, boolean z11, @l Object obj) {
                super(field, z11, false, null);
                g0.p(field, "field");
                this.f67110g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.b.g, kotlin.reflect.jvm.internal.calls.a
            @k
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                b().set(this.f67110g, a0.jc(args));
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.calls.b$g$b, reason: collision with other inner class name */
        public static final class C0786b extends g implements l10.f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0786b(@k Field field, boolean z11) {
                super(field, z11, false, null);
                g0.p(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.b.g, kotlin.reflect.jvm.internal.calls.a
            @k
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                b().set(null, a0.Th(args));
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@k Field field, boolean z11) {
                super(field, z11, true, null);
                g0.p(field, "field");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@k Field field, boolean z11) {
                super(field, z11, true, null);
                g0.p(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.b.g, kotlin.reflect.jvm.internal.calls.b
            public void c(@k Object[] args) {
                g0.p(args, "args");
                super.c(args);
                d(a0.Fc(args));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@k Field field, boolean z11) {
                super(field, z11, false, null);
                g0.p(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z11, boolean z12, v vVar) {
            this(field, z11, z12);
        }

        @Override // kotlin.reflect.jvm.internal.calls.b
        public void c(@k Object[] args) {
            g0.p(args, "args");
            super.c(args);
            if (this.f67109f && a0.Th(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @l
        public Object call(@k Object[] args) {
            g0.p(args, "args");
            c(args);
            b().set(e() != null ? a0.jc(args) : null, a0.Th(args));
            return g2.f100423a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public g(java.lang.reflect.Field r8, boolean r9, boolean r10) {
            /*
                r7 = this;
                java.lang.String r0 = "TYPE"
                java.lang.Class r3 = java.lang.Void.TYPE
                kotlin.jvm.internal.g0.o(r3, r0)
                if (r10 == 0) goto Lf
                java.lang.Class r10 = r8.getDeclaringClass()
            Ld:
                r4 = r10
                goto L11
            Lf:
                r10 = 0
                goto Ld
            L11:
                java.lang.reflect.Type r10 = r8.getGenericType()
                r0 = 1
                java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r0]
                r0 = 0
                r5[r0] = r10
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r1.f67109f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class h extends b<Method> {

        /* renamed from: f, reason: collision with root package name */
        public final boolean f67111f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends h implements l10.f {

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Object f67112g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@k Method method, @l Object obj) {
                super(method, false, null, 4, null);
                g0.p(method, "method");
                this.f67112g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            @l
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                return f(this.f67112g, args);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.calls.b$h$b, reason: collision with other inner class name */
        public static final class C0787b extends h implements l10.f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0787b(@k Method method) {
                super(method, false, null, 4, null);
                g0.p(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            @l
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                return f(null, args);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,265:1\n254#2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n*L\n126#1:266\n*E\n"})
        public static final class c extends h implements l10.f {

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Object f67113g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public c(@m80.k java.lang.reflect.Method r5, @m80.l java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "getGenericParameterTypes(...)"
                    kotlin.jvm.internal.g0.o(r0, r1)
                    int r1 = r0.length
                    r2 = 0
                    r3 = 1
                    if (r1 > r3) goto L16
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                    goto L1b
                L16:
                    int r1 = r0.length
                    java.lang.Object[] r0 = a00.q.l1(r0, r3, r1)
                L1b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r2, r0, r1)
                    r4.f67113g = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.h.c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            @l
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                v0 v0Var = new v0(2);
                v0Var.a(this.f67113g);
                v0Var.b(args);
                return f(null, v0Var.d(new Object[v0Var.c()]));
            }

            @l
            public final Object g() {
                return this.f67113g;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,265:1\n37#2,2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n*L\n139#1:266,2\n*E\n"})
        public static final class d extends h implements l10.f {

            /* renamed from: g, reason: collision with root package name */
            @k
            public final Object[] f67114g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d(@m80.k java.lang.reflect.Method r4, @m80.k java.lang.Object[] r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.lang.String r0 = "boundReceiverComponents"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.lang.reflect.Type[] r0 = r4.getGenericParameterTypes()
                    java.lang.String r1 = "getGenericParameterTypes(...)"
                    kotlin.jvm.internal.g0.o(r0, r1)
                    int r1 = r5.length
                    java.util.List r0 = a00.a0.D9(r0, r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    r1 = 0
                    java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r2 = 0
                    r3.<init>(r4, r1, r0, r2)
                    r3.f67114g = r5
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.h.d.<init>(java.lang.reflect.Method, java.lang.Object[]):void");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            @l
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                v0 v0Var = new v0(2);
                v0Var.b(this.f67114g);
                v0Var.b(args);
                return f(null, v0Var.d(new Object[v0Var.c()]));
            }

            @k
            public final Object[] g() {
                return this.f67114g;
            }

            public final int h() {
                return this.f67114g.length;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,265:1\n254#2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n*L\n113#1:266\n*E\n"})
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@k Method method) {
                super(method, false, null, 6, null);
                g0.p(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            @l
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                return f(args[0], args.length <= 1 ? new Object[0] : q.l1(args, 1, args.length));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,265:1\n254#2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n*L\n121#1:266\n*E\n"})
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(@k Method method) {
                super(method, true, null, 4, null);
                g0.p(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            @l
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                d(a0.Fc(args));
                return f(null, args.length <= 1 ? new Object[0] : q.l1(args, 1, args.length));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(@k Method method) {
                super(method, false, null, 6, null);
                g0.p(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            @l
            public Object call(@k Object[] args) {
                g0.p(args, "args");
                c(args);
                return f(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z11, Type[] typeArr, v vVar) {
            this(method, z11, typeArr);
        }

        @l
        public final Object f(@l Object obj, @k Object[] args) {
            g0.p(args, "args");
            return this.f67111f ? g2.f100423a : b().invoke(obj, Arrays.copyOf(args, args.length));
        }

        public /* synthetic */ h(Method method, boolean z11, Type[] typeArr, int i11, v vVar) {
            this(method, (i11 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z11, (i11 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "getGenericReturnType(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                if (r8 == 0) goto L11
                java.lang.Class r8 = r7.getDeclaringClass()
            Lf:
                r3 = r8
                goto L13
            L11:
                r8 = 0
                goto Lf
            L13:
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.g0.g(r7, r8)
                r0.f67111f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }

    public /* synthetic */ b(Member member, Type type, Class cls, Type[] typeArr, v vVar) {
        this(member, type, cls, typeArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public List<Type> a() {
        return this.f67105d;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public final M b() {
        return this.f67102a;
    }

    public void c(@k Object[] objArr) {
        a.C0783a.a(this, objArr);
    }

    public final void d(@l Object obj) {
        if (obj == null || !this.f67102a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @l
    public final Class<?> e() {
        return this.f67104c;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public final Type getReturnType() {
        return this.f67103b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f67102a = r1
            r0.f67103b = r2
            r0.f67104c = r3
            if (r3 == 0) goto L27
            kotlin.jvm.internal.v0 r1 = new kotlin.jvm.internal.v0
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = a00.h0.Q(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = a00.a0.dz(r4)
        L2b:
            r0.f67105d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.b.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
