package kotlin.text;

import a00.m0;
import g10.u;
import ix.l1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import q30.m;
import q30.q;
import q30.x;
import u30.k0;
import u30.o;
import u30.s;
import x00.p;
import yz.g2;
import yz.j2;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n24#2,3:405\n1#3:408\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n105#1:405,3\n*E\n"})
/* loaded from: classes8.dex */
public final class Regex implements Serializable {

    @k
    public static final a Companion = new a(null);

    @l
    private Set<? extends RegexOption> _options;

    @k
    private final Pattern nativePattern;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final int b(int i11) {
            return (i11 & 2) != 0 ? i11 | 64 : i11;
        }

        @k
        public final String c(@k String literal) {
            g0.p(literal, "literal");
            String quote = Pattern.quote(literal);
            g0.o(quote, "quote(...)");
            return quote;
        }

        @k
        public final String d(@k String literal) {
            g0.p(literal, "literal");
            String quoteReplacement = Matcher.quoteReplacement(literal);
            g0.o(quoteReplacement, "quoteReplacement(...)");
            return quoteReplacement;
        }

        @k
        public final Regex e(@k String literal) {
            g0.p(literal, "literal");
            return new Regex(literal, RegexOption.LITERAL);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f67733c = new a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f67734a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67735b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public /* synthetic */ a(v vVar) {
                this();
            }

            public a() {
            }
        }

        public b(@k String pattern, int i11) {
            g0.p(pattern, "pattern");
            this.f67734a = pattern;
            this.f67735b = i11;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f67734a, this.f67735b);
            g0.o(compile, "compile(...)");
            return new Regex(compile);
        }

        public final int a() {
            return this.f67735b;
        }

        @k
        public final String b() {
            return this.f67734a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements x00.l<o, o> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f67736a = new c();

        public c() {
            super(1, o.class, l1.b.f62938h, "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke(o p02) {
            g0.p(p02, "p0");
            return p02.next();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,404:1\n*E\n"})
    public static final class d implements x00.l<RegexOption, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f67737a;

        public d(int i11) {
            this.f67737a = i11;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RegexOption regexOption) {
            RegexOption regexOption2 = regexOption;
            return Boolean.valueOf((this.f67737a & regexOption2.getMask()) == regexOption2.getValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {280, 288, 292}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "$this$sequence", "matcher", "nextStart", "splitCount", "$this$sequence", "matcher", "nextStart", "splitCount"}, nl = {281, 289, 293}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
    public static final class e extends RestrictedSuspendLambda implements p<q30.o<? super String>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f67738a;

        /* renamed from: b, reason: collision with root package name */
        public int f67739b;

        /* renamed from: c, reason: collision with root package name */
        public int f67740c;

        /* renamed from: d, reason: collision with root package name */
        public int f67741d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f67742e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ CharSequence f67744g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f67745h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CharSequence charSequence, int i11, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f67744g = charSequence;
            this.f67745h = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = Regex.this.new e(this.f67744g, this.f67745h, cVar);
            eVar.f67742e = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
        
            if (r0.b(r4, r10) != r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
        
            if (r0.b(r2, r10) == r1) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:13:0x0076). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f67742e
                q30.o r0 = (q30.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r10.f67741d
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L30
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r10.f67738a
                java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
                kotlin.e.n(r11)
                goto Lb2
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                int r2 = r10.f67740c
                java.lang.Object r6 = r10.f67738a
                java.util.regex.Matcher r6 = (java.util.regex.Matcher) r6
                kotlin.e.n(r11)
                goto L76
            L30:
                java.lang.Object r0 = r10.f67738a
                java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
                kotlin.e.n(r11)
                goto Ld0
            L39:
                kotlin.e.n(r11)
                kotlin.text.Regex r11 = kotlin.text.Regex.this
                java.util.regex.Pattern r11 = kotlin.text.Regex.access$getNativePattern$p(r11)
                java.lang.CharSequence r2 = r10.f67744g
                java.util.regex.Matcher r11 = r11.matcher(r2)
                int r2 = r10.f67745h
                if (r2 == r5) goto Lb5
                boolean r2 = r11.find()
                if (r2 != 0) goto L53
                goto Lb5
            L53:
                r2 = 0
                r6 = r11
                r11 = r2
            L56:
                java.lang.CharSequence r7 = r10.f67744g
                int r8 = r6.start()
                java.lang.CharSequence r7 = r7.subSequence(r2, r8)
                java.lang.String r7 = r7.toString()
                r10.f67742e = r0
                r10.f67738a = r6
                r10.f67739b = r2
                r10.f67740c = r11
                r10.f67741d = r4
                java.lang.Object r2 = r0.b(r7, r10)
                if (r2 != r1) goto L75
                goto Lcf
            L75:
                r2 = r11
            L76:
                int r11 = r6.end()
                int r2 = r2 + r5
                int r7 = r10.f67745h
                int r7 = r7 - r5
                if (r2 == r7) goto L8b
                boolean r7 = r6.find()
                if (r7 != 0) goto L87
                goto L8b
            L87:
                r9 = r2
                r2 = r11
                r11 = r9
                goto L56
            L8b:
                java.lang.CharSequence r4 = r10.f67744g
                int r5 = r4.length()
                java.lang.CharSequence r4 = r4.subSequence(r11, r5)
                java.lang.String r4 = r4.toString()
                java.lang.Object r5 = l00.k.a(r0)
                r10.f67742e = r5
                java.lang.Object r5 = l00.k.a(r6)
                r10.f67738a = r5
                r10.f67739b = r11
                r10.f67740c = r2
                r10.f67741d = r3
                java.lang.Object r11 = r0.b(r4, r10)
                if (r11 != r1) goto Lb2
                goto Lcf
            Lb2:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            Lb5:
                java.lang.CharSequence r2 = r10.f67744g
                java.lang.String r2 = r2.toString()
                java.lang.Object r3 = l00.k.a(r0)
                r10.f67742e = r3
                java.lang.Object r11 = l00.k.a(r11)
                r10.f67738a = r11
                r10.f67741d = r5
                java.lang.Object r11 = r0.b(r2, r10)
                if (r11 != r1) goto Ld0
            Lcf:
                return r1
            Ld0:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super String> oVar, j00.c<? super g2> cVar) {
            return ((e) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @v0
    public Regex(@k Pattern nativePattern) {
        g0.p(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ o find$default(Regex regex, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return regex.find(charSequence, i11);
    }

    public static /* synthetic */ m findAll$default(Regex regex, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return regex.findAll(charSequence, i11);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return regex.split(charSequence, i11);
    }

    public static /* synthetic */ m splitToSequence$default(Regex regex, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return regex.splitToSequence(charSequence, i11);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        g0.o(pattern, "pattern(...)");
        return new b(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@k CharSequence input) {
        g0.p(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    @l
    public final o find(@k CharSequence input, int i11) {
        o f11;
        g0.p(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        g0.o(matcher, "matcher(...)");
        f11 = s.f(matcher, i11, input);
        return f11;
    }

    @k
    public final m<o> findAll(@k final CharSequence input, final int i11) {
        g0.p(input, "input");
        if (i11 >= 0 && i11 <= input.length()) {
            return x.v(new x00.a() { // from class: u30.r
                @Override // x00.a
                public final Object invoke() {
                    o find;
                    find = Regex.this.find(input, i11);
                    return find;
                }
            }, c.f67736a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i11 + ", input length: " + input.length());
    }

    @k
    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet allOf = EnumSet.allOf(RegexOption.class);
        g0.m(allOf);
        m0.S0(allOf, new d(flags));
        Set<RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        g0.o(unmodifiableSet, "unmodifiableSet(...)");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    @k
    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        g0.o(pattern, "pattern(...)");
        return pattern;
    }

    @l
    @y0(version = "1.7")
    @j2(markerClass = {kotlin.c.class})
    public final o matchAt(@k CharSequence input, int i11) {
        g0.p(input, "input");
        Matcher region = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i11, input.length());
        if (!region.lookingAt()) {
            return null;
        }
        g0.m(region);
        return new u30.p(region, input);
    }

    @l
    public final o matchEntire(@k CharSequence input) {
        o h11;
        g0.p(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        g0.o(matcher, "matcher(...)");
        h11 = s.h(matcher, input);
        return h11;
    }

    public final boolean matches(@k CharSequence input) {
        g0.p(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    @y0(version = "1.7")
    @j2(markerClass = {kotlin.c.class})
    public final boolean matchesAt(@k CharSequence input, int i11) {
        g0.p(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i11, input.length()).lookingAt();
    }

    @k
    public final String replace(@k CharSequence input, @k String replacement) {
        g0.p(input, "input");
        g0.p(replacement, "replacement");
        String replaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        g0.o(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @k
    public final String replaceFirst(@k CharSequence input, @k String replacement) {
        g0.p(input, "input");
        g0.p(replacement, "replacement");
        String replaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        g0.o(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    @k
    public final List<String> split(@k CharSequence input, int i11) {
        g0.p(input, "input");
        k0.h5(i11);
        Matcher matcher = this.nativePattern.matcher(input);
        if (i11 == 1 || !matcher.find()) {
            return a00.g0.l(input.toString());
        }
        ArrayList arrayList = new ArrayList(i11 > 0 ? u.B(i11, 10) : 10);
        int i12 = i11 - 1;
        int i13 = 0;
        do {
            arrayList.add(input.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            if (i12 >= 0 && arrayList.size() == i12) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i13, input.length()).toString());
        return arrayList;
    }

    @y0(version = "1.6")
    @k
    public final m<String> splitToSequence(@k CharSequence input, int i11) {
        g0.p(input, "input");
        k0.h5(i11);
        return q.b(new e(input, i11, null));
    }

    @k
    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @k
    public String toString() {
        String pattern = this.nativePattern.toString();
        g0.o(pattern, "toString(...)");
        return pattern;
    }

    @k
    public final String replace(@k CharSequence input, @k x00.l<? super o, ? extends CharSequence> transform) {
        g0.p(input, "input");
        g0.p(transform, "transform");
        int i11 = 0;
        o find$default = find$default(this, input, 0, 2, null);
        if (find$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, i11, find$default.d().getStart().intValue());
            sb2.append(transform.invoke(find$default));
            i11 = find$default.d().getEndInclusive().intValue() + 1;
            find$default = find$default.next();
            if (i11 >= length) {
                break;
            }
        } while (find$default != null);
        if (i11 < length) {
            sb2.append(input, i11, length);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@m80.k java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@m80.k java.lang.String r2, @m80.k kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.Companion
            int r3 = r3.getValue()
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@m80.k java.lang.String r2, @m80.k java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.Companion
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r3 = u30.s.e(r3)
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
