package io.ktor.server.engine;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDefaultTransformJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTransformJvm.kt\nio/ktor/server/engine/DefaultTransformJvmKt\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,54:1\n79#2:55\n79#2:56\n79#2:57\n79#2:58\n*S KotlinDebug\n*F\n+ 1 DefaultTransformJvm.kt\nio/ktor/server/engine/DefaultTransformJvmKt\n*L\n26#1:55\n35#1:56\n38#1:57\n44#1:58\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 {
    @m80.l
    public static final Object a(@m80.k io.ktor.util.pipeline.d<Object, zx.k0> dVar, @m80.k Object obj, @m80.k j00.c<Object> cVar) {
        io.ktor.utils.io.g gVar = obj instanceof io.ktor.utils.io.g ? (io.ktor.utils.io.g) obj : null;
        if (gVar == null) {
            return null;
        }
        h10.d<?> b11 = zx.l0.b(dVar.d()).b();
        if (kotlin.jvm.internal.g0.g(b11, kotlin.jvm.internal.o0.d(InputStream.class))) {
            return d(gVar);
        }
        if (kotlin.jvm.internal.g0.g(b11, kotlin.jvm.internal.o0.d(mx.r.class))) {
            return b(dVar, gVar);
        }
        return null;
    }

    @m80.k
    public static final mx.r b(@m80.k io.ktor.util.pipeline.d<?, zx.k0> dVar, @m80.k io.ktor.utils.io.g rc2) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        kotlin.jvm.internal.g0.p(rc2, "rc");
        py.g f11 = dVar.d().f();
        ix.y0 y0Var = ix.y0.f63006a;
        String r11 = py.e.r(f11, y0Var.C());
        if (r11 == null) {
            throw new IllegalStateException("Content-Type header is required for multipart processing");
        }
        String r12 = py.e.r(dVar.d().f(), y0Var.z());
        return new kx.g(dVar.getCoroutineContext().plus(c40.h1.g()), rc2, r11, r12 != null ? Long.valueOf(Long.parseLong(r12)) : null, py.b.c(dVar.d()));
    }

    @m80.k
    public static final String c(@m80.k y40.c0 c0Var, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return r00.u.m(new InputStreamReader(qz.a.b(c0Var), charset));
    }

    public static final InputStream d(io.ktor.utils.io.g gVar) {
        return mz.a.b(gVar, null, 1, null);
    }
}
