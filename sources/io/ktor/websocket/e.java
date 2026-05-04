package io.ktor.websocket;

import io.ktor.websocket.d;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFrameCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameCommon.kt\nio/ktor/websocket/FrameCommonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,173:1\n1#2:174\n15#3,3:175\n15#3,3:178\n*S KotlinDebug\n*F\n+ 1 FrameCommon.kt\nio/ktor/websocket/FrameCommonKt\n*L\n144#1:175,3\n162#1:178,3\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    @m80.k
    public static final byte[] a(@m80.k d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        byte[] d11 = dVar.d();
        byte[] copyOf = Arrays.copyOf(d11, d11.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @m80.l
    public static final CloseReason b(@m80.k d.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        if (bVar.d().length < 2) {
            return null;
        }
        y40.b bVar2 = new y40.b();
        jz.h.i(bVar2, bVar.d(), 0, 0, 6, null);
        return new CloseReason(bVar2.readShort(), jz.s.g(bVar2, null, 0, 3, null));
    }

    @m80.k
    public static final String c(@m80.k d.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        if (!fVar.f()) {
            throw new IllegalArgumentException("Text could be only extracted from non-fragmented frame");
        }
        CharsetDecoder newDecoder = u30.d.f91599b.newDecoder();
        kotlin.jvm.internal.g0.o(newDecoder, "newDecoder(...)");
        y40.b bVar = new y40.b();
        jz.h.i(bVar, fVar.d(), 0, 0, 6, null);
        return iz.b.b(newDecoder, bVar, 0, 2, null);
    }
}
