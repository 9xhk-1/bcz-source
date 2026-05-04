package vx;

import java.io.File;
import java.io.FileOutputStream;
import java.security.KeyStore;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/network/tls/certificates/BuildersKt\n+ 2 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,188:1\n12#2,14:189\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/network/tls/certificates/BuildersKt\n*L\n184#1:189,14\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    @m80.k
    public static final KeyStore a(@m80.k x00.l<? super n0, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        n0 n0Var = new n0();
        block.invoke(n0Var);
        return n0Var.a();
    }

    public static final void b(@m80.k KeyStore keyStore, @m80.k File output, @m80.k String password) {
        kotlin.jvm.internal.g0.p(keyStore, "<this>");
        kotlin.jvm.internal.g0.p(output, "output");
        kotlin.jvm.internal.g0.p(password, "password");
        File parentFile = output.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(output);
        try {
            keyStore.store(fileOutputStream, xy.v.b(password));
            g2 g2Var = g2.f100423a;
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                yz.r.a(th2, th3);
            }
            throw th2;
        }
    }
}
