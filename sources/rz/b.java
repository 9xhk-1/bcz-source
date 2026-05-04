package rz;

import a00.q;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import jz.g;
import jz.j;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import pz.h;
import y40.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDeflaterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterUtils.kt\nio/ktor/websocket/internals/DeflaterUtilsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,86:1\n15#2,2:87\n17#2:94\n15#2,3:95\n15#2,2:98\n17#2:105\n156#3,5:89\n156#3,5:100\n*S KotlinDebug\n*F\n+ 1 DeflaterUtils.kt\nio/ktor/websocket/internals/DeflaterUtilsKt\n*L\n20#1:87,2\n20#1:94\n36#1:95,3\n46#1:98,2\n46#1:105\n21#1:89,5\n47#1:100,5\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final byte[] f86991a = {0, 0, 0, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final byte[] f86992b = {0, 0, -1, -1};

    @k
    public static final byte[] a(@k Deflater deflater, @k byte[] data) {
        g0.p(deflater, "<this>");
        g0.p(data, "data");
        deflater.setInput(data);
        y40.b bVar = new y40.b();
        h<ByteBuffer> a11 = yy.a.a();
        ByteBuffer U6 = a11.U6();
        try {
            ByteBuffer byteBuffer = U6;
            while (!deflater.needsInput()) {
                b(bVar, deflater, byteBuffer, false);
            }
            while (b(bVar, deflater, byteBuffer, true) != 0) {
            }
            g2 g2Var = g2.f100423a;
            a11.b4(U6);
            if (a.a(bVar, f86991a)) {
                byte[] d11 = y40.g0.d(bVar, ((int) j.j(bVar)) - f86992b.length);
                bVar.close();
                return d11;
            }
            y40.b bVar2 = new y40.b();
            jz.h.j(bVar2, bVar);
            bVar2.u((byte) 0);
            return y40.g0.c(bVar2);
        } catch (Throwable th2) {
            a11.b4(U6);
            throw th2;
        }
    }

    public static final int b(x xVar, Deflater deflater, ByteBuffer byteBuffer, boolean z11) {
        byteBuffer.clear();
        int deflate = z11 ? deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2) : deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (deflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + deflate);
        byteBuffer.flip();
        g.a(xVar, byteBuffer);
        return deflate;
    }

    @k
    public static final byte[] c(@k Inflater inflater, @k byte[] data) {
        g0.p(inflater, "<this>");
        g0.p(data, "data");
        inflater.setInput(q.g3(data, f86992b));
        y40.b bVar = new y40.b();
        h<ByteBuffer> a11 = yy.a.a();
        ByteBuffer U6 = a11.U6();
        try {
            ByteBuffer byteBuffer = U6;
            long length = r9.length + inflater.getBytesRead();
            while (inflater.getBytesRead() < length) {
                byteBuffer.clear();
                byteBuffer.position(byteBuffer.position() + inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()));
                byteBuffer.flip();
                g.a(bVar, byteBuffer);
            }
            g2 g2Var = g2.f100423a;
            a11.b4(U6);
            return y40.g0.c(bVar);
        } catch (Throwable th2) {
            a11.b4(U6);
            throw th2;
        }
    }
}
