package ux;

import a00.m0;
import a00.r0;
import io.ktor.network.tls.NoPrivateKeyException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSConfigBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSConfigBuilder.kt\nio/ktor/network/tls/TLSConfigBuilderKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,142:1\n4135#2,11:143\n12371#2,2:155\n11165#2:157\n11500#2,3:158\n4135#2,11:163\n1#3:154\n37#4,2:161\n*S KotlinDebug\n*F\n+ 1 TLSConfigBuilder.kt\nio/ktor/network/tls/TLSConfigBuilderKt\n*L\n98#1:143,11\n105#1:155,2\n111#1:157\n111#1:158,3\n140#1:163,11\n112#1:161,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e0 {
    public static final void b(@m80.k d0 d0Var, @m80.k X509Certificate[] chain, @m80.k PrivateKey key) {
        kotlin.jvm.internal.g0.p(d0Var, "<this>");
        kotlin.jvm.internal.g0.p(chain, "chain");
        kotlin.jvm.internal.g0.p(key, "key");
        d0Var.b().add(new b(chain, key));
    }

    @w00.j(name = "addKeyStoreNullablePassword")
    public static final void c(@m80.k d0 d0Var, @m80.k KeyStore store, @m80.l char[] cArr, @m80.l String str) {
        List<String> list;
        kotlin.jvm.internal.g0.p(d0Var, "<this>");
        kotlin.jvm.internal.g0.p(store, "store");
        String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
        kotlin.jvm.internal.g0.m(defaultAlgorithm);
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
        kotlin.jvm.internal.g0.m(keyManagerFactory);
        keyManagerFactory.init(store, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        kotlin.jvm.internal.g0.o(keyManagers, "getKeyManagers(...)");
        ArrayList arrayList = new ArrayList();
        for (KeyManager keyManager : keyManagers) {
            if (keyManager instanceof X509KeyManager) {
                arrayList.add(keyManager);
            }
        }
        if (str == null || (list = a00.g0.l(str)) == null) {
            Enumeration<String> aliases = store.aliases();
            kotlin.jvm.internal.g0.m(aliases);
            list = Collections.list(aliases);
            kotlin.jvm.internal.g0.o(list, "list(...)");
        }
        for (String str2 : list) {
            Certificate[] certificateChain = store.getCertificateChain(str2);
            if (certificateChain == null) {
                throw new IllegalStateException(("Fail to get the certificate chain for this alias: " + str2).toString());
            }
            for (Certificate certificate : certificateChain) {
                if (!(certificate instanceof X509Certificate)) {
                    throw new IllegalStateException(("Fail to add key store " + store + ". Only X509 certificate format supported.").toString());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PrivateKey privateKey = ((X509KeyManager) it.next()).getPrivateKey(str2);
                if (privateKey != null) {
                    ArrayList arrayList2 = new ArrayList(certificateChain.length);
                    for (Certificate certificate2 : certificateChain) {
                        kotlin.jvm.internal.g0.n(certificate2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        arrayList2.add((X509Certificate) certificate2);
                    }
                    b(d0Var, (X509Certificate[]) arrayList2.toArray(new X509Certificate[0]), privateKey);
                }
            }
            throw new NoPrivateKeyException(str2, store);
        }
    }

    public static /* synthetic */ void d(d0 d0Var, KeyStore keyStore, char[] cArr, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        c(d0Var, keyStore, cArr, str);
    }

    public static final X509TrustManager e() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        kotlin.jvm.internal.g0.m(trustManagerFactory);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.g0.m(trustManagers);
        ArrayList arrayList = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList.add(trustManager);
            }
        }
        return (X509TrustManager) r0.G2(arrayList);
    }

    public static final void f(@m80.k d0 d0Var, @m80.k d0 other) {
        kotlin.jvm.internal.g0.p(d0Var, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        m0.s0(d0Var.b(), other.b());
        d0Var.h(other.d());
        d0Var.g(other.c());
        d0Var.i(other.e());
        d0Var.j(other.f());
    }
}
