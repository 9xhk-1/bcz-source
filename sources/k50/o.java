package k50;

import androidx.collection.SieveCacheKt;
import j50.v0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w0;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import l50.n1;
import l50.q1;
import l50.r1;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n1#1,350:1\n337#1,4:351\n329#1,4:355\n337#1,4:359\n329#1,4:363\n*S KotlinDebug\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n259#1:351,4\n269#1:355,4\n278#1:359,4\n284#1:363,4\n*E\n"})
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h50.f f65974a = v0.a("kotlinx.serialization.json.JsonUnquotedLiteral", g50.a.F(w0.f67050a));

    public static final long A(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        try {
            return C(l0Var);
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    @m80.l
    public static final Long B(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        try {
            return Long.valueOf(C(l0Var));
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    public static final long C(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        return new n1(l0Var.b()).q();
    }

    @yz.v0
    @m80.k
    public static final Void D(@m80.k String key, @m80.k String expected) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(expected, "expected");
        throw new IllegalArgumentException("Element " + key + " is not a " + expected);
    }

    @f50.f
    @m80.k
    public static final f0 a(@m80.l Void r02) {
        return f0.INSTANCE;
    }

    @m80.k
    public static final l0 b(@m80.l Boolean bool) {
        return bool == null ? f0.INSTANCE : new b0(bool, false, null, 4, null);
    }

    @m80.k
    public static final l0 c(@m80.l Number number) {
        return number == null ? f0.INSTANCE : new b0(number, false, null, 4, null);
    }

    @m80.k
    public static final l0 d(@m80.l String str) {
        return str == null ? f0.INSTANCE : new b0(str, true, null, 4, null);
    }

    @f50.f
    @m80.k
    public static final l0 e(byte b11) {
        return f(w1.i(b11 & 255));
    }

    @f50.f
    @r1
    @m80.k
    public static final l0 f(long j11) {
        String a11;
        a11 = n.a(j11, 10);
        return i(a11);
    }

    @f50.f
    @m80.k
    public static final l0 g(int i11) {
        return f(w1.i(i11 & 4294967295L));
    }

    @f50.f
    @m80.k
    public static final l0 h(short s11) {
        return f(w1.i(s11 & j60.g.f63638t));
    }

    @f50.f
    @m80.k
    public static final l0 i(@m80.l String str) {
        if (str == null) {
            return f0.INSTANCE;
        }
        if (kotlin.jvm.internal.g0.g(str, f0.INSTANCE.b())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new b0(str, false, f65974a);
    }

    public static final Void j(k kVar, String str) {
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.o0.d(kVar.getClass()) + " is not a " + str);
    }

    public static final <T> T k(x00.a<? extends T> aVar) {
        try {
            return aVar.invoke();
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    public static final <T> T l(x00.a<? extends T> aVar) {
        try {
            return aVar.invoke();
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    public static final boolean m(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        Boolean e11 = q1.e(l0Var.b());
        if (e11 != null) {
            return e11.booleanValue();
        }
        throw new IllegalStateException(l0Var + " does not represent a Boolean");
    }

    @m80.l
    public static final Boolean n(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        return q1.e(l0Var.b());
    }

    @m80.l
    public static final String o(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        if (l0Var instanceof f0) {
            return null;
        }
        return l0Var.b();
    }

    public static final double p(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        return Double.parseDouble(l0Var.b());
    }

    @m80.l
    public static final Double q(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        return u30.d0.Z0(l0Var.b());
    }

    public static final float r(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        return Float.parseFloat(l0Var.b());
    }

    @m80.l
    public static final Float s(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        return u30.d0.b1(l0Var.b());
    }

    public static final int t(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        try {
            long C = C(l0Var);
            if (SieveCacheKt.NodeMetaAndPreviousMask <= C && C <= SieveCacheKt.NodeLinkMask) {
                return (int) C;
            }
            throw new NumberFormatException(l0Var.b() + " is not an Int");
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    @m80.l
    public static final Integer u(@m80.k l0 l0Var) {
        Long l11;
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        try {
            l11 = Long.valueOf(C(l0Var));
        } catch (JsonDecodingException unused) {
            l11 = null;
        }
        if (l11 != null) {
            long longValue = l11.longValue();
            if (SieveCacheKt.NodeMetaAndPreviousMask <= longValue && longValue <= SieveCacheKt.NodeLinkMask) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    @m80.k
    public static final b v(@m80.k k kVar) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        b bVar = kVar instanceof b ? (b) kVar : null;
        if (bVar != null) {
            return bVar;
        }
        j(kVar, "JsonArray");
        throw new KotlinNothingValueException();
    }

    @m80.k
    public static final f0 w(@m80.k k kVar) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        f0 f0Var = kVar instanceof f0 ? (f0) kVar : null;
        if (f0Var != null) {
            return f0Var;
        }
        j(kVar, "JsonNull");
        throw new KotlinNothingValueException();
    }

    @m80.k
    public static final i0 x(@m80.k k kVar) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        i0 i0Var = kVar instanceof i0 ? (i0) kVar : null;
        if (i0Var != null) {
            return i0Var;
        }
        j(kVar, "JsonObject");
        throw new KotlinNothingValueException();
    }

    @m80.k
    public static final l0 y(@m80.k k kVar) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        l0 l0Var = kVar instanceof l0 ? (l0) kVar : null;
        if (l0Var != null) {
            return l0Var;
        }
        j(kVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    @m80.k
    public static final h50.f z() {
        return f65974a;
    }
}
