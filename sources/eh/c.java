package eh;

import android.content.Context;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.BaicizhanApp;
import g10.u;
import gi.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import kotlin.text.Regex;
import m80.k;
import u30.k0;
import x00.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nShareCodeVerifyUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareCodeVerifyUtil.kt\ncom/baicizhan/main/operate/share_code/ShareCodeVerifyUtilKt\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,192:1\n18#2,2:193\n18#2,3:195\n20#2:198\n*S KotlinDebug\n*F\n+ 1 ShareCodeVerifyUtil.kt\ncom/baicizhan/main/operate/share_code/ShareCodeVerifyUtilKt\n*L\n162#1:193,2\n166#1:195,3\n162#1:198\n*E\n"})
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final char[] f49831a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i};

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Regex f49832b = new Regex("[0-9a-zA-Z]{5,128}");

    /* renamed from: c, reason: collision with root package name */
    public static final int f49833c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f49834d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final int f49835e = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f49836f = "ShareCodeVerifyUtil";

    @w00.k
    public static final boolean b(@k Context context, @k x00.a<g2> onSourceVisit) {
        g0.p(context, "<this>");
        g0.p(onSourceVisit, "onSourceVisit");
        return d(context, onSourceVisit, null, 2, null);
    }

    @w00.k
    public static final boolean c(@k Context context, @k x00.a<g2> onSourceVisit, @k l<? super String, g2> onCode) {
        g0.p(context, "<this>");
        g0.p(onSourceVisit, "onSourceVisit");
        g0.p(onCode, "onCode");
        if (!d.c(context)) {
            qb.c.b(f49836f, "no clip data...", new Object[0]);
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        g0.n(applicationContext, "null cannot be cast to non-null type com.baicizhan.main.BaicizhanApp");
        if (!((BaicizhanApp) applicationContext).l()) {
            qb.c.i(f49836f, "sharing disabled!", new Object[0]);
            return false;
        }
        String b11 = d.b();
        if (b11 != null && b11.length() != 0) {
            qb.c.b(f49836f, "source code:【" + b11 + "】", new Object[0]);
            onSourceVisit.invoke();
            Context applicationContext2 = context.getApplicationContext();
            g0.n(applicationContext2, "null cannot be cast to non-null type com.baicizhan.main.BaicizhanApp");
            ((BaicizhanApp) applicationContext2).f();
            String l11 = l(b11);
            if (l11 == null || l11.length() == 0 || !p(l11)) {
                return false;
            }
            onCode.invoke(l11);
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean d(Context context, x00.a aVar, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new l() { // from class: eh.b
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 e11;
                    e11 = c.e((String) obj2);
                    return e11;
                }
            };
        }
        return c(context, aVar, lVar);
    }

    public static final g2 e(String it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    public static final int f(String str) {
        char[] charArray = str.toCharArray();
        g0.o(charArray, "toCharArray(...)");
        int i11 = 0;
        for (char c11 : charArray) {
            i11 += c11;
        }
        return i11 % 62;
    }

    @k
    public static final String g(@k String businessMark, @k String businessCode) {
        g0.p(businessMark, "businessMark");
        g0.p(businessCode, "businessCode");
        String str = s(businessMark, f(String.valueOf(businessCode.charAt(businessCode.length() / 2)))) + businessCode;
        String substring = str.substring(str.length() / 2, (str.length() / 2) + 2);
        g0.o(substring, "substring(...)");
        return s(q(substring), f(str)) + str;
    }

    public static /* synthetic */ String h(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "tr";
        }
        return g(str, str2);
    }

    @k
    public static final char[] i() {
        return f49831a;
    }

    public static final int j(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('A' <= c11 && c11 < '[') {
            return c11 - '7';
        }
        if ('a' > c11 || c11 >= '{') {
            return 0;
        }
        return c11 - '=';
    }

    @k
    public static final Regex k() {
        return f49832b;
    }

    public static final String l(String str) {
        String subWith2Str;
        if (str == null || (subWith2Str = KotlinExtKt.subWith2Str(str, "→", "←")) == null) {
            return null;
        }
        return k0.b6(subWith2Str).toString();
    }

    @m80.l
    public static final String m(@m80.l String str) {
        if (str != null) {
            return l(str);
        }
        return null;
    }

    @k
    public static final String n() {
        int g12 = u.g1(new g10.l(3, 126), Random.Default);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < g12; i11++) {
            sb2.append(f49831a[u.g1(new g10.l(0, 61), Random.Default)]);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.l
    @n(message = "")
    public static final String o() {
        String subWith2Str;
        qb.c.i(f49836f, "clip text is " + d.b(), new Object[0]);
        String b11 = d.b();
        if (b11 == null || (subWith2Str = KotlinExtKt.subWith2Str(b11, "→", "←")) == null) {
            return null;
        }
        return k0.b6(subWith2Str).toString();
    }

    public static final boolean p(@m80.l String str) {
        if (str == null || str.length() == 0 || str.length() < 5 || str.length() > 128) {
            return false;
        }
        String substring = str.substring(0, 2);
        g0.o(substring, "substring(...)");
        String substring2 = str.substring(2);
        g0.o(substring2, "substring(...)");
        String substring3 = substring2.substring(substring2.length() / 2, (substring2.length() / 2) + 2);
        g0.o(substring3, "substring(...)");
        return g0.g(s(q(substring3), f(substring2)), substring);
    }

    public static final String q(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        g0.o(charArray, "toCharArray(...)");
        for (char c11 : charArray) {
            sb2.append(f49831a[c11 % u30.u0.f91710f]);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final char r(char c11, int i11) {
        return f49831a[((j(c11) + i11) + 62) % 62];
    }

    public static final String s(String str, int i11) {
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        g0.o(charArray, "toCharArray(...)");
        for (char c11 : charArray) {
            sb2.append(r(c11, i11));
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}
