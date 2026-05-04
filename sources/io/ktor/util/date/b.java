package io.ktor.util.date;

import bz.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGMTDateParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GMTDateParser.kt\nio/ktor/util/date/GMTDateParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,128:1\n1#2:129\n1069#3,2:130\n*S KotlinDebug\n*F\n+ 1 GMTDateParser.kt\nio/ktor/util/date/GMTDateParser\n*L\n89#1:130,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f61996b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final char f61997c = 's';

    /* renamed from: d, reason: collision with root package name */
    public static final char f61998d = 'm';

    /* renamed from: e, reason: collision with root package name */
    public static final char f61999e = 'h';

    /* renamed from: f, reason: collision with root package name */
    public static final char f62000f = 'd';

    /* renamed from: g, reason: collision with root package name */
    public static final char f62001g = 'M';

    /* renamed from: h, reason: collision with root package name */
    public static final char f62002h = 'Y';

    /* renamed from: i, reason: collision with root package name */
    public static final char f62003i = 'z';

    /* renamed from: j, reason: collision with root package name */
    public static final char f62004j = '*';

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f62005a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public b(@k String pattern) {
        g0.p(pattern, "pattern");
        this.f62005a = pattern;
        if (pattern.length() <= 0) {
            throw new IllegalStateException("Date parser pattern shouldn't be empty.");
        }
    }

    public final void a(c cVar, char c11, String str) {
        if (c11 != '*') {
            if (c11 == 'M') {
                cVar.k(Month.Companion.b(str));
                return;
            }
            if (c11 == 'Y') {
                cVar.m(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c11 == 'd') {
                cVar.h(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c11 == 'h') {
                cVar.i(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c11 == 'm') {
                cVar.j(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c11 == 's') {
                cVar.l(Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (c11 == 'z') {
                if (!g0.g(str, "GMT")) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                if (str.charAt(i11) != c11) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
    }

    @k
    public final bz.b b(@k String dateString) {
        g0.p(dateString, "dateString");
        c cVar = new c();
        char charAt = this.f62005a.charAt(0);
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i12 < this.f62005a.length()) {
            try {
                if (this.f62005a.charAt(i12) == charAt) {
                    i12++;
                } else {
                    int i14 = (i13 + i12) - i11;
                    String substring = dateString.substring(i13, i14);
                    g0.o(substring, "substring(...)");
                    a(cVar, charAt, substring);
                    try {
                        charAt = this.f62005a.charAt(i12);
                        i11 = i12;
                        i12++;
                        i13 = i14;
                    } catch (Throwable unused) {
                        i13 = i14;
                        throw new InvalidDateStringException(dateString, i13, this.f62005a);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i13 < dateString.length()) {
            String substring2 = dateString.substring(i13);
            g0.o(substring2, "substring(...)");
            a(cVar, charAt, substring2);
        }
        return cVar.a();
    }
}
