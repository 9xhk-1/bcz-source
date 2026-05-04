package ux;

import io.ktor.network.tls.extensions.NamedCurve;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.u0;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSClientHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSClientHandshake.kt\nio/ktor/network/tls/TLSClientHandshakeKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,552:1\n37#2,2:553\n*S KotlinDebug\n*F\n+ 1 TLSClientHandshake.kt\nio/ktor/network/tls/TLSClientHandshakeKt\n*L\n548#1:553,2\n*E\n"})
/* loaded from: classes8.dex */
public final class x {
    public static final byte[] c(SecureRandom secureRandom) {
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        bArr[0] = (byte) (currentTimeMillis >> 24);
        bArr[1] = (byte) (currentTimeMillis >> 16);
        bArr[2] = (byte) (currentTimeMillis >> 8);
        bArr[3] = (byte) currentTimeMillis;
        return bArr;
    }

    public static final i d(NamedCurve namedCurve, ECPoint eCPoint) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        kotlin.jvm.internal.g0.m(keyPairGenerator);
        keyPairGenerator.initialize(new ECGenParameterSpec(namedCurve.name()));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        kotlin.jvm.internal.g0.m(generateKeyPair);
        PublicKey publicKey = generateKeyPair.getPublic();
        kotlin.jvm.internal.g0.n(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        kotlin.jvm.internal.g0.m(keyFactory);
        ECParameterSpec params = ((ECPublicKey) publicKey).getParams();
        kotlin.jvm.internal.g0.m(params);
        PublicKey generatePublic = keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, params));
        kotlin.jvm.internal.g0.m(generatePublic);
        PublicKey publicKey2 = generateKeyPair.getPublic();
        kotlin.jvm.internal.g0.o(publicKey2, "getPublic(...)");
        PrivateKey privateKey = generateKeyPair.getPrivate();
        kotlin.jvm.internal.g0.o(privateKey, "getPrivate(...)");
        return new i(generatePublic, publicKey2, privateKey);
    }

    @m80.k
    public static final c e(@m80.k y40.c0 packet) {
        kotlin.jvm.internal.g0.p(packet, "packet");
        byte[] d11 = y40.g0.d(packet, packet.readByte() & 255);
        int readShort = packet.readShort() & c2.f100412d;
        ArrayList arrayList = new ArrayList();
        int i11 = readShort / 2;
        for (int i12 = 0; i12 < i11; i12++) {
            io.ktor.network.tls.extensions.a c11 = io.ktor.network.tls.extensions.b.c(io.ktor.network.tls.extensions.a.f61114e, packet.readByte(), packet.readByte());
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        int readShort2 = packet.readShort() & c2.f100412d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i13 = 0;
        while (i13 < readShort2) {
            int readShort3 = packet.readShort() & c2.f100412d;
            i13 += readShort3 + 2;
            linkedHashSet.add(new X500Principal(y40.g0.d(packet, readShort3)));
        }
        c cVar = new c(d11, (io.ktor.network.tls.extensions.a[]) arrayList.toArray(new io.ktor.network.tls.extensions.a[0]), linkedHashSet);
        if (packet.J()) {
            return cVar;
        }
        throw new IllegalStateException("Check failed.");
    }
}
