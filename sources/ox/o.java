package ox;

import a00.h0;
import a00.m0;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParserDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/ParserDslKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1863#2,2:64\n*S KotlinDebug\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/ParserDslKt\n*L\n58#1:64,2\n*E\n"})
/* loaded from: classes8.dex */
public final class o {
    @m80.k
    public static final e b(@m80.k String value) {
        g0.p(value, "value");
        return new a(value);
    }

    @m80.k
    public static final e c(@m80.k e grammar) {
        g0.p(grammar, "grammar");
        return new b(grammar);
    }

    public static final /* synthetic */ <T extends c> List<e> d(List<? extends e> list) {
        g0.p(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (obj instanceof c) {
                m0.s0(arrayList, ((c) obj).a());
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final e e(@m80.k e grammar) {
        g0.p(grammar, "grammar");
        return new h(grammar);
    }

    @m80.k
    public static final e f(@m80.k String value) {
        g0.p(value, "value");
        return new i(new u(value));
    }

    @m80.k
    public static final e g(@m80.k e grammar) {
        g0.p(grammar, "grammar");
        return new i(grammar);
    }

    @m80.k
    public static final x00.a<e> h(@m80.k final x00.l<? super f, g2> block) {
        g0.p(block, "block");
        return new x00.a() { // from class: ox.n
            @Override // x00.a
            public final Object invoke() {
                e i11;
                i11 = o.i(x00.l.this);
                return i11;
            }
        };
    }

    public static final e i(x00.l lVar) {
        f fVar = new f();
        lVar.invoke(fVar);
        return g(fVar.a());
    }

    @m80.k
    public static final e j(@m80.k e eVar, @m80.k String name) {
        g0.p(eVar, "<this>");
        g0.p(name, "name");
        return new j(name, eVar);
    }

    @m80.k
    public static final e k(@m80.k String str, @m80.k e grammar) {
        g0.p(str, "<this>");
        g0.p(grammar, "grammar");
        return m(new u(str), grammar);
    }

    @m80.k
    public static final e l(@m80.k e eVar, @m80.k String value) {
        g0.p(eVar, "<this>");
        g0.p(value, "value");
        return m(eVar, new u(value));
    }

    @m80.k
    public static final e m(@m80.k e eVar, @m80.k e grammar) {
        g0.p(eVar, "<this>");
        g0.p(grammar, "grammar");
        return new k(h0.Q(eVar, grammar));
    }

    @m80.k
    public static final e n(@m80.k String str, @m80.k e grammar) {
        g0.p(str, "<this>");
        g0.p(grammar, "grammar");
        return p(new u(str), grammar);
    }

    @m80.k
    public static final e o(@m80.k e eVar, @m80.k String value) {
        g0.p(eVar, "<this>");
        g0.p(value, "value");
        return p(eVar, new u(value));
    }

    @m80.k
    public static final e p(@m80.k e eVar, @m80.k e grammar) {
        g0.p(eVar, "<this>");
        g0.p(grammar, "grammar");
        return new s(h0.Q(eVar, grammar));
    }

    @m80.k
    public static final e q(char c11, char c12) {
        return new q(c11, c12);
    }
}
