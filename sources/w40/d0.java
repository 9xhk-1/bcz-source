package w40;

import a00.d1;
import a00.h0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;
import u30.r0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0<Output> implements q<Output> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f95233b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final w40.a<Output, String> f95234a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nParserOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/TimeZoneParserOperation$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,557:1\n171#1:561\n171#1:565\n171#1,3:566\n171#1:569\n171#1:570\n171#1:571\n295#2,2:558\n1740#2,3:562\n1#3:560\n*S KotlinDebug\n*F\n+ 1 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/TimeZoneParserOperation$Companion\n*L\n181#1:561\n186#1:565\n189#1:566,3\n194#1:569\n195#1:570\n196#1:571\n179#1:558,2\n185#1:562,3\n*E\n"})
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: w40.d0$a$a, reason: collision with other inner class name */
        public static final class EnumC1279a {

            /* renamed from: a, reason: collision with root package name */
            public static final EnumC1279a f95235a = new EnumC1279a("START", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC1279a f95236b = new EnumC1279a("AFTER_PREFIX", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC1279a f95237c = new EnumC1279a("AFTER_SIGN", 2);

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC1279a f95238d = new EnumC1279a("AFTER_INIT_SIGN", 3);

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC1279a f95239e = new EnumC1279a("AFTER_HOUR", 4);

            /* renamed from: f, reason: collision with root package name */
            public static final EnumC1279a f95240f = new EnumC1279a("AFTER_INIT_HOUR", 5);

            /* renamed from: g, reason: collision with root package name */
            public static final EnumC1279a f95241g = new EnumC1279a("AFTER_MINUTE", 6);

            /* renamed from: h, reason: collision with root package name */
            public static final EnumC1279a f95242h = new EnumC1279a("AFTER_COLON_MINUTE", 7);

            /* renamed from: i, reason: collision with root package name */
            public static final EnumC1279a f95243i = new EnumC1279a("IN_PART", 8);

            /* renamed from: j, reason: collision with root package name */
            public static final EnumC1279a f95244j = new EnumC1279a("AFTER_SLASH", 9);

            /* renamed from: k, reason: collision with root package name */
            public static final EnumC1279a f95245k = new EnumC1279a("END", 10);

            /* renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ EnumC1279a[] f95246l;

            /* renamed from: m, reason: collision with root package name */
            public static final /* synthetic */ m00.a f95247m;

            static {
                EnumC1279a[] a11 = a();
                f95246l = a11;
                f95247m = m00.c.c(a11);
            }

            public EnumC1279a(String str, int i11) {
            }

            public static final /* synthetic */ EnumC1279a[] a() {
                return new EnumC1279a[]{f95235a, f95236b, f95237c, f95238d, f95239e, f95240f, f95241g, f95242h, f95243i, f95244j, f95245k};
            }

            @m80.k
            public static m00.a<EnumC1279a> b() {
                return f95247m;
            }

            public static EnumC1279a valueOf(String str) {
                return (EnumC1279a) Enum.valueOf(EnumC1279a.class, str);
            }

            public static EnumC1279a[] values() {
                return (EnumC1279a[]) f95246l.clone();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f95248a;

            static {
                int[] iArr = new int[EnumC1279a.values().length];
                try {
                    iArr[EnumC1279a.f95235a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1279a.f95236b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1279a.f95237c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1279a.f95238d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1279a.f95239e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1279a.f95240f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC1279a.f95241g.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC1279a.f95242h.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC1279a.f95243i.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC1279a.f95244j.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC1279a.f95245k.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                f95248a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static final boolean e(char c11) {
            return f(c11) || t40.h.b(c11) || c11 == '-' || c11 == '+';
        }

        public static final boolean f(char c11) {
            return t40.h.c(c11) || c11 == '.' || c11 == '_';
        }

        public static final boolean g(CharSequence charSequence, Ref.IntRef intRef, List<String> list) {
            String str;
            Object obj;
            Iterator<T> it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                CharSequence charSequence2 = charSequence;
                if (k0.B5(charSequence2, (String) obj, intRef.element, false, 4, null)) {
                    break;
                }
                charSequence = charSequence2;
            }
            String str2 = (String) obj;
            if (str2 != null) {
                intRef.element += str2.length();
                str = str2;
            }
            return str != null;
        }

        public static final boolean h(CharSequence charSequence, Ref.IntRef intRef) {
            a aVar = d0.f95233b;
            if (!h0.Q('+', '-').contains(Character.valueOf(charSequence.charAt(intRef.element)))) {
                return false;
            }
            intRef.element++;
            return true;
        }

        public static final boolean i(CharSequence charSequence, Ref.IntRef intRef) {
            a aVar = d0.f95233b;
            if (!(charSequence.charAt(intRef.element) == '/')) {
                return false;
            }
            intRef.element++;
            return true;
        }

        public static final boolean j(Ref.IntRef intRef, CharSequence charSequence, int i11) {
            boolean z11;
            a aVar = d0.f95233b;
            int i12 = intRef.element;
            Iterable W1 = g10.u.W1(i12, i12 + i11);
            if (!(W1 instanceof Collection) || !((Collection) W1).isEmpty()) {
                Iterator it = W1.iterator();
                while (it.hasNext()) {
                    Character O7 = r0.O7(charSequence, ((d1) it).nextInt());
                    if (!(O7 != null ? t40.h.b(O7.charValue()) : false)) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (!z11) {
                return false;
            }
            intRef.element += i11;
            return true;
        }

        public static final boolean k(CharSequence charSequence, Ref.IntRef intRef) {
            a aVar = d0.f95233b;
            if (charSequence.charAt(intRef.element) == ':') {
                intRef.element++;
                if (j(intRef, charSequence, 2)) {
                    return true;
                }
                intRef.element--;
            }
            return false;
        }

        public static final boolean l(CharSequence charSequence, Ref.IntRef intRef) {
            a aVar = d0.f95233b;
            if (!e(charSequence.charAt(intRef.element))) {
                return false;
            }
            intRef.element++;
            return true;
        }

        public static final boolean m(CharSequence charSequence, Ref.IntRef intRef) {
            a aVar = d0.f95233b;
            if (!f(charSequence.charAt(intRef.element))) {
                return false;
            }
            intRef.element++;
            return true;
        }

        public final boolean b(boolean z11, x00.a<g2> aVar) {
            if (z11) {
                return true;
            }
            aVar.invoke();
            return false;
        }

        public final boolean c(boolean z11, x00.a<g2> aVar) {
            if (!z11) {
                return false;
            }
            aVar.invoke();
            return true;
        }

        public final int d(CharSequence charSequence, int i11) {
            int i12;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = i11;
            EnumC1279a enumC1279a = EnumC1279a.f95235a;
            while (true) {
                i12 = 1;
                if (intRef.element < charSequence.length()) {
                    switch (b.f95248a[enumC1279a.ordinal()]) {
                        case 1:
                            if (!g(charSequence, intRef, h0.Q("UTC", "GMT", "UT"))) {
                                if (!h(charSequence, intRef)) {
                                    if (!m(charSequence, intRef)) {
                                        break;
                                    } else {
                                        enumC1279a = EnumC1279a.f95243i;
                                    }
                                } else {
                                    enumC1279a = EnumC1279a.f95238d;
                                }
                            } else {
                                enumC1279a = EnumC1279a.f95236b;
                            }
                        case 2:
                            if (h(charSequence, intRef)) {
                                enumC1279a = EnumC1279a.f95237c;
                            } else {
                                enumC1279a = EnumC1279a.f95243i;
                                continue;
                            }
                        case 3:
                            if (j(intRef, charSequence, 2)) {
                                enumC1279a = EnumC1279a.f95239e;
                            } else {
                                enumC1279a = EnumC1279a.f95243i;
                                continue;
                            }
                        case 4:
                            if (!j(intRef, charSequence, 2)) {
                                if (!j(intRef, charSequence, 1)) {
                                    break;
                                } else {
                                    enumC1279a = EnumC1279a.f95245k;
                                }
                            } else {
                                enumC1279a = EnumC1279a.f95240f;
                            }
                        case 5:
                            if (k(charSequence, intRef)) {
                                enumC1279a = EnumC1279a.f95242h;
                            } else {
                                enumC1279a = EnumC1279a.f95243i;
                                continue;
                            }
                        case 6:
                            if (!k(charSequence, intRef)) {
                                if (!j(intRef, charSequence, 2)) {
                                    break;
                                } else {
                                    enumC1279a = EnumC1279a.f95241g;
                                }
                            } else {
                                enumC1279a = EnumC1279a.f95242h;
                            }
                        case 7:
                            if (!j(intRef, charSequence, 2)) {
                                break;
                            } else {
                                enumC1279a = EnumC1279a.f95245k;
                            }
                        case 8:
                            if (!k(charSequence, intRef)) {
                                break;
                            } else {
                                enumC1279a = EnumC1279a.f95245k;
                            }
                        case 9:
                            if (!l(charSequence, intRef)) {
                                if (!i(charSequence, intRef)) {
                                    break;
                                } else {
                                    enumC1279a = EnumC1279a.f95244j;
                                }
                            } else {
                                enumC1279a = EnumC1279a.f95243i;
                            }
                        case 10:
                            if (!m(charSequence, intRef)) {
                                break;
                            } else {
                                enumC1279a = EnumC1279a.f95243i;
                            }
                        case 11:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
            int i13 = intRef.element;
            if (enumC1279a != EnumC1279a.f95244j && enumC1279a != EnumC1279a.f95238d) {
                i12 = 0;
            }
            return i13 - i12;
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@m80.k w40.a<? super Output, String> setter) {
        g0.p(setter, "setter");
        this.f95234a = setter;
    }

    public static final String c() {
        return "Invalid timezone format";
    }

    @Override // w40.q
    @m80.k
    public Object a(Output output, @m80.k CharSequence input, int i11) {
        g0.p(input, "input");
        int d11 = f95233b.d(input, i11);
        if (d11 <= i11) {
            return m.f95273b.a(i11, new x00.a() { // from class: w40.c0
                @Override // x00.a
                public final Object invoke() {
                    String c11;
                    c11 = d0.c();
                    return c11;
                }
            });
        }
        s.e(this.f95234a, output, input.subSequence(i11, d11).toString(), i11, d11);
        return m.f95273b.b(d11);
    }
}
