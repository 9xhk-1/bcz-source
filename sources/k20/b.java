package k20;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b {
    public static final C0752b A;
    public static final C0752b B;
    public static final C0752b C;
    public static final C0752b D;
    public static final C0752b E;
    public static final C0752b F;
    public static final C0752b G;
    public static final C0752b H;
    public static final C0752b I;
    public static final C0752b J;
    public static final C0752b K;
    public static final C0752b L;
    public static final C0752b M;
    public static final C0752b N;
    public static final C0752b O;
    public static final C0752b P;

    /* renamed from: a, reason: collision with root package name */
    public static final C0752b f65163a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0752b f65164b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0752b f65165c;

    /* renamed from: d, reason: collision with root package name */
    public static final d<ProtoBuf.Visibility> f65166d;

    /* renamed from: e, reason: collision with root package name */
    public static final d<ProtoBuf.Modality> f65167e;

    /* renamed from: f, reason: collision with root package name */
    public static final d<ProtoBuf.Class.Kind> f65168f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0752b f65169g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0752b f65170h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0752b f65171i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0752b f65172j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0752b f65173k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0752b f65174l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0752b f65175m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0752b f65176n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0752b f65177o;

    /* renamed from: p, reason: collision with root package name */
    public static final d<ProtoBuf.MemberKind> f65178p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0752b f65179q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0752b f65180r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0752b f65181s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0752b f65182t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0752b f65183u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0752b f65184v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0752b f65185w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0752b f65186x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0752b f65187y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0752b f65188z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k20.b$b, reason: collision with other inner class name */
    public static class C0752b extends d<Boolean> {
        public C0752b(int i11) {
            super(i11, 1);
        }

        public static /* synthetic */ void f(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", ct.d.f46852f));
        }

        @Override // k20.b.d
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i11) {
            return Boolean.valueOf((i11 & (1 << this.f65190a)) != 0);
        }

        @Override // k20.b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f65190a;
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<E extends h.a> extends d<E> {

        /* renamed from: c, reason: collision with root package name */
        public final E[] f65189c;

        public c(int i11, E[] eArr) {
            super(i11, g(eArr));
            this.f65189c = eArr;
        }

        private static /* synthetic */ void f(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public static <E> int g(@k E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i11 = 31; i11 >= 0; i11--) {
                if (((1 << i11) & length) != 0) {
                    return i11 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // k20.b.d
        @l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i11) {
            int i12 = (1 << this.f65191b) - 1;
            int i13 = this.f65190a;
            int i14 = (i11 & (i12 << i13)) >> i13;
            for (E e11 : this.f65189c) {
                if (e11.getNumber() == i14) {
                    return e11;
                }
            }
            return null;
        }

        @Override // k20.b.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e11) {
            return e11.getNumber() << this.f65190a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d<E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f65190a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65191b;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/h$a;>(Lk20/b$d<*>;[TE;)Lk20/b$d<TE;>; */
        public static d a(d dVar, h.a[] aVarArr) {
            return new c(dVar.f65190a + dVar.f65191b, aVarArr);
        }

        public static C0752b b(d<?> dVar) {
            return new C0752b(dVar.f65190a + dVar.f65191b);
        }

        public static C0752b c() {
            return new C0752b(0);
        }

        public abstract E d(int i11);

        public abstract int e(E e11);

        public d(int i11, int i12) {
            this.f65190a = i11;
            this.f65191b = i12;
        }
    }

    static {
        C0752b c11 = d.c();
        f65163a = c11;
        f65164b = d.b(c11);
        C0752b c12 = d.c();
        f65165c = c12;
        d<ProtoBuf.Visibility> a11 = d.a(c12, ProtoBuf.Visibility.values());
        f65166d = a11;
        d<ProtoBuf.Modality> a12 = d.a(a11, ProtoBuf.Modality.values());
        f65167e = a12;
        d<ProtoBuf.Class.Kind> a13 = d.a(a12, ProtoBuf.Class.Kind.values());
        f65168f = a13;
        C0752b b11 = d.b(a13);
        f65169g = b11;
        C0752b b12 = d.b(b11);
        f65170h = b12;
        C0752b b13 = d.b(b12);
        f65171i = b13;
        C0752b b14 = d.b(b13);
        f65172j = b14;
        C0752b b15 = d.b(b14);
        f65173k = b15;
        C0752b b16 = d.b(b15);
        f65174l = b16;
        f65175m = d.b(b16);
        C0752b b17 = d.b(a11);
        f65176n = b17;
        f65177o = d.b(b17);
        d<ProtoBuf.MemberKind> a14 = d.a(a12, ProtoBuf.MemberKind.values());
        f65178p = a14;
        C0752b b18 = d.b(a14);
        f65179q = b18;
        C0752b b19 = d.b(b18);
        f65180r = b19;
        C0752b b21 = d.b(b19);
        f65181s = b21;
        C0752b b22 = d.b(b21);
        f65182t = b22;
        C0752b b23 = d.b(b22);
        f65183u = b23;
        C0752b b24 = d.b(b23);
        f65184v = b24;
        C0752b b25 = d.b(b24);
        f65185w = b25;
        f65186x = d.b(b25);
        C0752b b26 = d.b(a14);
        f65187y = b26;
        C0752b b27 = d.b(b26);
        f65188z = b27;
        C0752b b28 = d.b(b27);
        A = b28;
        C0752b b29 = d.b(b28);
        B = b29;
        C0752b b31 = d.b(b29);
        C = b31;
        C0752b b32 = d.b(b31);
        D = b32;
        C0752b b33 = d.b(b32);
        E = b33;
        C0752b b34 = d.b(b33);
        F = b34;
        G = d.b(b34);
        C0752b b35 = d.b(c12);
        H = b35;
        C0752b b36 = d.b(b35);
        I = b36;
        J = d.b(b36);
        C0752b b37 = d.b(a12);
        K = b37;
        C0752b b38 = d.b(b37);
        L = b38;
        M = d.b(b38);
        C0752b c13 = d.c();
        N = c13;
        O = d.b(c13);
        P = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k20.b.a(int):void");
    }

    public static int b(boolean z11, @k ProtoBuf.Visibility visibility, @k ProtoBuf.Modality modality, boolean z12, boolean z13, boolean z14) {
        if (visibility == null) {
            a(10);
        }
        if (modality == null) {
            a(11);
        }
        return f65165c.e(Boolean.valueOf(z11)) | f65167e.e(modality) | f65166d.e(visibility) | K.e(Boolean.valueOf(z12)) | L.e(Boolean.valueOf(z13)) | M.e(Boolean.valueOf(z14));
    }
}
