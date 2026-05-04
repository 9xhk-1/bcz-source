package ty;

import h10.n;
import io.ktor.server.plugins.MissingRequestParameterException;
import io.ktor.server.plugins.ParameterConversionException;
import ix.p1;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\nio/ktor/server/util/ParametersKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,63:1\n50#1:64\n58#2,16:65\n58#2,16:81\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\nio/ktor/server/util/ParametersKt\n*L\n31#1:64\n31#1:65,16\n50#1:81,16\n*E\n"})
/* loaded from: classes8.dex */
public final class g {
    public static final /* synthetic */ <R> R a(p1 p1Var, String name) {
        g0.p(p1Var, "<this>");
        g0.p(name, "name");
        g0.y(4, "R");
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, "R");
        } catch (Throwable unused) {
        }
        return (R) c(p1Var, name, new gz.a(d11, null));
    }

    @k
    public static final String b(@k p1 p1Var, @k String name) {
        g0.p(p1Var, "<this>");
        g0.p(name, "name");
        String str = p1Var.get(name);
        if (str != null) {
            return str;
        }
        throw new MissingRequestParameterException(name);
    }

    @v0
    @k
    public static final <R> R c(@k p1 p1Var, @k String name, @k gz.a typeInfo) {
        g0.p(p1Var, "<this>");
        g0.p(name, "name");
        g0.p(typeInfo, "typeInfo");
        List<String> a11 = p1Var.a(name);
        if (a11 == null) {
            throw new MissingRequestParameterException(name);
        }
        try {
            R r11 = (R) az.d.f5566a.a(a11, typeInfo);
            g0.n(r11, "null cannot be cast to non-null type R of io.ktor.server.util.ParametersKt.getOrFailImpl");
            return r11;
        } catch (Exception e11) {
            String C = typeInfo.b().C();
            if (C == null) {
                C = typeInfo.b().toString();
            }
            throw new ParameterConversionException(name, C, e11);
        }
    }

    public static final /* synthetic */ <R> R d(p1 p1Var, Object obj, n<?> property) {
        g0.p(p1Var, "<this>");
        g0.p(property, "property");
        String name = property.getName();
        g0.y(4, "R");
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, "R");
        } catch (Throwable unused) {
        }
        return (R) c(p1Var, name, new gz.a(d11, null));
    }
}
