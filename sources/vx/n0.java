package vx;

import java.security.KeyPair;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/network/tls/certificates/KeyStoreBuilder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,188:1\n216#2:189\n217#2:192\n37#3,2:190\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/network/tls/certificates/KeyStoreBuilder\n*L\n163#1:189\n163#1:192\n165#1:190,2\n*E\n"})
/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<String, c> f94387a = new LinkedHashMap();

    @m80.k
    public final KeyStore a() {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        kotlin.jvm.internal.g0.m(keyStore);
        keyStore.load(null, null);
        for (Map.Entry<String, c> entry : this.f94387a.entrySet()) {
            String key = entry.getKey();
            c value = entry.getValue();
            Certificate a11 = value.a();
            KeyPair b11 = value.b();
            String c11 = value.c();
            keyStore.setKeyEntry(key, b11.getPrivate(), xy.v.b(c11), (Certificate[]) a00.h0.S(a11, value.d()).toArray(new Certificate[0]));
        }
        return keyStore;
    }

    public final void b(@m80.k String alias, @m80.k x00.l<? super b, g2> block) {
        kotlin.jvm.internal.g0.p(alias, "alias");
        kotlin.jvm.internal.g0.p(block, "block");
        Map<String, c> map = this.f94387a;
        b bVar = new b();
        block.invoke(bVar);
        map.put(alias, bVar.a());
    }
}
