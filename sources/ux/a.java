package ux;

import io.ktor.network.tls.CipherType;
import io.ktor.network.tls.SecretExchangeType;
import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCipherSuites.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSuites.kt\nio/ktor/network/tls/CIOCipherSuites\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n774#2:160\n865#2,2:161\n*S KotlinDebug\n*F\n+ 1 CipherSuites.kt\nio/ktor/network/tls/CIOCipherSuites\n*L\n153#1:160\n153#1:161,2\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f92549a = new a();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final e f92550b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final e f92551c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final e f92552d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final e f92553e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final e f92554f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final e f92555g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final e f92556h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final List<e> f92557i;

    static {
        SecretExchangeType secretExchangeType = SecretExchangeType.RSA;
        HashAlgorithm hashAlgorithm = HashAlgorithm.SHA256;
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.RSA;
        e eVar = new e((short) 156, "TLS_RSA_WITH_AES_128_GCM_SHA256", "AES128-GCM-SHA256", secretExchangeType, "AES/GCM/NoPadding", 128, 4, 12, 16, "AEAD", 0, hashAlgorithm, signatureAlgorithm, null, 8192, null);
        f92550b = eVar;
        SecretExchangeType secretExchangeType2 = SecretExchangeType.ECDHE;
        HashAlgorithm hashAlgorithm2 = HashAlgorithm.SHA384;
        SignatureAlgorithm signatureAlgorithm2 = SignatureAlgorithm.ECDSA;
        e eVar2 = new e((short) -16340, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "ECDHE-ECDSA-AES256-GCM-SHA384", secretExchangeType2, "AES/GCM/NoPadding", 256, 4, 12, 16, "AEAD", 0, hashAlgorithm2, signatureAlgorithm2, null, 8192, null);
        f92551c = eVar2;
        e eVar3 = new e((short) -16341, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "ECDHE-ECDSA-AES128-GCM-SHA256", secretExchangeType2, "AES/GCM/NoPadding", 128, 4, 12, 16, "AEAD", 0, hashAlgorithm, signatureAlgorithm2, null, 8192, null);
        f92552d = eVar3;
        e eVar4 = new e((short) -16336, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "ECDHE-RSA-AES256-GCM-SHA384", secretExchangeType2, "AES/GCM/NoPadding", 256, 4, 12, 16, "AEAD", 0, hashAlgorithm2, signatureAlgorithm, null, 8192, null);
        f92553e = eVar4;
        e eVar5 = new e((short) -16337, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "ECDHE-RSA-AES128-GCM-SHA256", secretExchangeType2, "AES/GCM/NoPadding", 128, 4, 12, 16, "AEAD", 0, hashAlgorithm, signatureAlgorithm, null, 8192, null);
        f92554f = eVar5;
        CipherType cipherType = CipherType.CBC;
        e eVar6 = new e((short) 53, "TLS_RSA_WITH_AES_256_CBC_SHA", "AES-256-CBC-SHA", secretExchangeType, "AES/CBC/NoPadding", 256, 16, 48, 20, "HmacSHA1", 160, hashAlgorithm, signatureAlgorithm, cipherType);
        f92555g = eVar6;
        e eVar7 = new e((short) 47, "TLS_RSA_WITH_AES_128_CBC_SHA", "AES-128-CBC-SHA", secretExchangeType, "AES/CBC/NoPadding", 128, 16, 48, 20, "HmacSHA1", 160, hashAlgorithm, signatureAlgorithm, cipherType);
        f92556h = eVar7;
        List Q = a00.h0.Q(eVar2, eVar4, eVar3, eVar5, eVar, eVar6, eVar7);
        ArrayList arrayList = new ArrayList();
        for (Object obj : Q) {
            if (f.a((e) obj)) {
                arrayList.add(obj);
            }
        }
        f92557i = arrayList;
    }

    @m80.k
    public final e a() {
        return f92552d;
    }

    @m80.k
    public final e b() {
        return f92551c;
    }

    @m80.k
    public final e c() {
        return f92554f;
    }

    @m80.k
    public final e d() {
        return f92553e;
    }

    @m80.k
    public final List<e> e() {
        return f92557i;
    }

    @m80.k
    public final e f() {
        return f92556h;
    }

    @m80.k
    public final e g() {
        return f92555g;
    }

    @m80.k
    public final e h() {
        return f92550b;
    }
}
