package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilsJvm.kt\nio/ktor/websocket/UtilsKt__UtilsJvmKt\n+ 2 Utils.kt\nio/ktor/websocket/UtilsKt__UtilsKt\n*L\n1#1,24:1\n11#2:25\n*S KotlinDebug\n*F\n+ 1 UtilsJvm.kt\nio/ktor/websocket/UtilsKt__UtilsJvmKt\n*L\n18#1:25\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class q {
    public static final int a() {
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 8;
    }

    public static final void b(@m80.k ByteBuffer byteBuffer, @m80.k ByteBuffer other) {
        kotlin.jvm.internal.g0.p(byteBuffer, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        ByteBuffer slice = byteBuffer.slice();
        ByteBuffer slice2 = other.slice();
        int remaining = slice2.remaining();
        int remaining2 = slice.remaining();
        for (int i11 = 0; i11 < remaining2; i11++) {
            slice.put(i11, (byte) (slice.get(i11) ^ slice2.get(i11 % remaining)));
        }
    }
}
