package io.ktor.server.routing;

import io.ktor.server.routing.i0;
import ix.p1;
import java.util.Iterator;
import kotlin.text.Regex;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRegexRouting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegexRouting.kt\nio/ktor/server/routing/PathSegmentRegexRouteSelector\n+ 2 Parameters.kt\nio/ktor/http/Parameters$Companion\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,291:1\n24#2:292\n1317#3,2:293\n1104#4,3:295\n*S KotlinDebug\n*F\n+ 1 RegexRouting.kt\nio/ktor/server/routing/PathSegmentRegexRouteSelector\n*L\n259#1:292\n260#1:293,2\n275#1:295,3\n*E\n"})
/* loaded from: classes8.dex */
public final class t extends h0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f61738b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Regex f61739c;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Regex f61740a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    static {
        f61739c = io.ktor.util.a.f61985a.c() ? new Regex("(^|[^\\\\])\\(\\?<(\\p{L}[\\p{L}\\p{N}]*)>(.*?[^\\\\])?\\)") : new Regex("(^|[^\\\\])\\(\\?<(\\p{Alpha}\\p{Alnum}*)>(.*?[^\\\\])?\\)");
    }

    public t(@m80.k Regex regex) {
        kotlin.jvm.internal.g0.p(regex, "regex");
        this.f61740a = regex;
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        int b11;
        String str;
        String str2 = (u30.k0.A5(this.f61740a.getPattern(), '/', false, 2, null) || u30.f0.J2(this.f61740a.getPattern(), "\\/", false, 2, null)) ? "/" : "";
        String r32 = a00.r0.r3(a00.r0.g2(p1Var.f(), i11), "/", str2, (u30.k0.s3(this.f61740a.getPattern(), '/', false, 2, null) && k.e(p1Var.c())) ? "/" : "", 0, null, null, 56, null);
        u30.o find$default = Regex.find$default(this.f61740a, r32, 0, 2, null);
        if (find$default == null) {
            return i0.f61619b.c();
        }
        int length = find$default.getValue().length();
        if (r32.length() == length) {
            b11 = p1Var.f().size() - i11;
        } else {
            if (r32.charAt(length) != '/') {
                if (length >= 1) {
                    int i12 = length - 1;
                    if (r32.charAt(i12) == '/') {
                        b11 = b(find$default, i12, str2);
                    }
                }
                return i0.f61619b.c();
            }
            b11 = b(find$default, length, str2);
        }
        u30.m c11 = find$default.c();
        kotlin.jvm.internal.g0.n(c11, "null cannot be cast to non-null type kotlin.text.MatchNamedGroupCollection");
        u30.n nVar = (u30.n) c11;
        p1.a aVar = ix.p1.f62972b;
        ix.q1 b12 = ix.t1.b(0, 1, null);
        Iterator it = Regex.findAll$default(f61739c, this.f61740a.getPattern(), 0, 2, null).iterator();
        while (it.hasNext()) {
            String str3 = ((u30.o) it.next()).a().k().b().get(2);
            u30.l lVar = nVar.get(str3);
            if (lVar == null || (str = lVar.f()) == null) {
                str = "";
            }
            b12.k(str3, str);
        }
        return new i0.c(1.0d, b12.build(), b11);
    }

    public final int b(u30.o oVar, int i11, String str) {
        String substring = oVar.getValue().substring(0, i11);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        int i12 = 0;
        for (int i13 = 0; i13 < substring.length(); i13++) {
            if (substring.charAt(i13) == '/') {
                i12++;
            }
        }
        return kotlin.jvm.internal.g0.g(str, "/") ? i12 : i12 + 1;
    }

    @m80.k
    public String toString() {
        return "Regex(" + this.f61740a.getPattern() + ')';
    }
}
