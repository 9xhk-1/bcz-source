package androidx.core.util;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"})
/* loaded from: classes2.dex */
public final class AtomicFileKt {
    @k
    public static final byte[] readBytes(@k android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @k
    public static final String readText(@k android.util.AtomicFile atomicFile, @k Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(@k android.util.AtomicFile atomicFile, @k l<? super FileOutputStream, g2> lVar) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            lVar.invoke(startWrite);
            d0.d(1);
            atomicFile.finishWrite(startWrite);
            d0.c(1);
        } catch (Throwable th2) {
            d0.d(1);
            atomicFile.failWrite(startWrite);
            d0.c(1);
            throw th2;
        }
    }

    public static final void writeBytes(@k android.util.AtomicFile atomicFile, @k byte[] bArr) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th2) {
            atomicFile.failWrite(startWrite);
            throw th2;
        }
    }

    public static final void writeText(@k android.util.AtomicFile atomicFile, @k String str, @k Charset charset) {
        byte[] bytes = str.getBytes(charset);
        g0.o(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        writeText(atomicFile, str, charset);
    }
}
