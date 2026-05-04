package io.ktor.serialization;

import java.nio.charset.Charset;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @l
        public static Object a(@k d dVar, @k Charset charset, @k gz.a aVar, @l Object obj, @k j00.c<? super io.ktor.websocket.d> cVar) {
            g0.m(obj);
            return dVar.a(charset, aVar, obj, cVar);
        }
    }

    @l
    Object a(@k Charset charset, @k gz.a aVar, @l Object obj, @k j00.c<? super io.ktor.websocket.d> cVar);

    boolean b(@k io.ktor.websocket.d dVar);

    @l
    Object c(@k Charset charset, @k gz.a aVar, @k io.ktor.websocket.d dVar, @k j00.c<Object> cVar);
}
