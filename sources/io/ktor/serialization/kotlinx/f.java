package io.ktor.serialization.kotlinx;

import f50.i;
import f50.p0;
import f50.w;
import io.ktor.serialization.WebsocketConverterNotFoundException;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.websocket.d;
import java.nio.charset.Charset;
import kotlin.jvm.internal.g0;
import kotlinx.serialization.SerializationException;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f implements io.ktor.serialization.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final w f61189a;

    public f(@k w format) {
        g0.p(format, "format");
        this.f61189a = format;
        if ((format instanceof f50.a) || (format instanceof p0)) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + format + " is not supported.").toString());
    }

    @Override // io.ktor.serialization.d
    @l
    public Object a(@k Charset charset, @k gz.a aVar, @l Object obj, @k j00.c<? super io.ktor.websocket.d> cVar) {
        i<?> b11;
        try {
            b11 = g.d(this.f61189a.getSerializersModule(), aVar);
        } catch (SerializationException unused) {
            b11 = g.b(obj, this.f61189a.getSerializersModule());
        }
        return d(b11, this.f61189a, obj);
    }

    @Override // io.ktor.serialization.d
    public boolean b(@k io.ktor.websocket.d frame) {
        g0.p(frame, "frame");
        return (frame instanceof d.f) || (frame instanceof d.a);
    }

    @Override // io.ktor.serialization.d
    @l
    public Object c(@k Charset charset, @k gz.a aVar, @k io.ktor.websocket.d dVar, @k j00.c<Object> cVar) {
        if (!b(dVar)) {
            throw new WebsocketConverterNotFoundException("Unsupported frame " + dVar.g().name(), null, 2, null);
        }
        i<?> d11 = g.d(this.f61189a.getSerializersModule(), aVar);
        w wVar = this.f61189a;
        if (wVar instanceof p0) {
            if (dVar instanceof d.f) {
                return ((p0) wVar).c(d11, io.ktor.websocket.e.c((d.f) dVar));
            }
            throw new WebsocketDeserializeException("Unsupported format " + this.f61189a + " for " + dVar.g().name(), null, dVar, 2, null);
        }
        if (!(wVar instanceof f50.a)) {
            throw new IllegalStateException(("Unsupported format " + this.f61189a).toString());
        }
        if (dVar instanceof d.a) {
            return ((f50.a) wVar).d(d11, io.ktor.websocket.e.a(dVar));
        }
        throw new WebsocketDeserializeException("Unsupported format " + this.f61189a + " for " + dVar.g().name(), null, dVar, 2, null);
    }

    public final io.ktor.websocket.d d(i<?> iVar, w wVar, Object obj) {
        if (wVar instanceof p0) {
            g0.n(iVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new d.f(((p0) wVar).a(iVar, obj));
        }
        if (wVar instanceof f50.a) {
            g0.n(iVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new d.a(true, ((f50.a) wVar).b(iVar, obj));
        }
        throw new IllegalStateException(("Unsupported format " + wVar).toString());
    }
}
