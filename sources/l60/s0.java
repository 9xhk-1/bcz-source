package l60;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class s0 {
    @m80.k
    public static final e1 a(@m80.k File file) throws FileNotFoundException {
        kotlin.jvm.internal.g0.p(file, "<this>");
        return r0.p(new FileOutputStream(file, true));
    }

    @m80.k
    public static final okio.b b(@m80.k ClassLoader classLoader) {
        kotlin.jvm.internal.g0.p(classLoader, "<this>");
        return new m60.q(classLoader, true, null, 4, null);
    }

    @m80.k
    public static final n c(@m80.k e1 e1Var, @m80.k Cipher cipher) {
        kotlin.jvm.internal.g0.p(e1Var, "<this>");
        kotlin.jvm.internal.g0.p(cipher, "cipher");
        return new n(r0.d(e1Var), cipher);
    }

    @m80.k
    public static final o d(@m80.k g1 g1Var, @m80.k Cipher cipher) {
        kotlin.jvm.internal.g0.p(g1Var, "<this>");
        kotlin.jvm.internal.g0.p(cipher, "cipher");
        return new o(r0.e(g1Var), cipher);
    }

    @m80.k
    public static final a0 e(@m80.k e1 e1Var, @m80.k MessageDigest digest) {
        kotlin.jvm.internal.g0.p(e1Var, "<this>");
        kotlin.jvm.internal.g0.p(digest, "digest");
        return new a0(e1Var, digest);
    }

    @m80.k
    public static final a0 f(@m80.k e1 e1Var, @m80.k Mac mac) {
        kotlin.jvm.internal.g0.p(e1Var, "<this>");
        kotlin.jvm.internal.g0.p(mac, "mac");
        return new a0(e1Var, mac);
    }

    @m80.k
    public static final b0 g(@m80.k g1 g1Var, @m80.k MessageDigest digest) {
        kotlin.jvm.internal.g0.p(g1Var, "<this>");
        kotlin.jvm.internal.g0.p(digest, "digest");
        return new b0(g1Var, digest);
    }

    @m80.k
    public static final b0 h(@m80.k g1 g1Var, @m80.k Mac mac) {
        kotlin.jvm.internal.g0.p(g1Var, "<this>");
        kotlin.jvm.internal.g0.p(mac, "mac");
        return new b0(g1Var, mac);
    }

    @m80.k
    public static final f1[] i(long j11) {
        y0 y0Var = new y0(j11);
        y0 y0Var2 = new y0(j11);
        return new f1[]{new m60.n(y0Var, y0Var2), new m60.n(y0Var2, y0Var)};
    }

    @w00.k
    @m80.k
    public static final e1 j(@m80.k File file) throws FileNotFoundException {
        kotlin.jvm.internal.g0.p(file, "<this>");
        return o(file, false, 1, null);
    }

    @w00.k
    @m80.k
    public static final e1 k(@m80.k File file, boolean z11) throws FileNotFoundException {
        kotlin.jvm.internal.g0.p(file, "<this>");
        return r0.p(new FileOutputStream(file, z11));
    }

    @m80.k
    public static final e1 l(@m80.k OutputStream outputStream) {
        kotlin.jvm.internal.g0.p(outputStream, "<this>");
        return new w0(outputStream, new i1());
    }

    @m80.k
    public static final e1 m(@m80.k Socket socket) throws IOException {
        kotlin.jvm.internal.g0.p(socket, "<this>");
        m60.r rVar = new m60.r(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.g0.o(outputStream, "getOutputStream(...)");
        return rVar.E(new w0(outputStream, rVar));
    }

    @m80.k
    public static final e1 n(@m80.k Path path, @m80.k OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.g0.o(newOutputStream, "newOutputStream(...)");
        return r0.p(newOutputStream);
    }

    public static /* synthetic */ e1 o(File file, boolean z11, int i11, Object obj) throws FileNotFoundException {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return r0.o(file, z11);
    }

    @w00.j(name = "socket")
    @m80.k
    public static final f1 p(@m80.k Socket socket) {
        kotlin.jvm.internal.g0.p(socket, "<this>");
        return new m60.j(socket);
    }

    @m80.k
    public static final g1 q(@m80.k File file) throws FileNotFoundException {
        kotlin.jvm.internal.g0.p(file, "<this>");
        return new d0(new FileInputStream(file), i1.f70438f);
    }

    @m80.k
    public static final g1 r(@m80.k InputStream inputStream) {
        kotlin.jvm.internal.g0.p(inputStream, "<this>");
        return new d0(inputStream, new i1());
    }

    @m80.k
    public static final g1 s(@m80.k Socket socket) throws IOException {
        kotlin.jvm.internal.g0.p(socket, "<this>");
        m60.r rVar = new m60.r(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.g0.o(inputStream, "getInputStream(...)");
        return rVar.F(new d0(inputStream, rVar));
    }

    @m80.k
    public static final g1 t(@m80.k Path path, @m80.k OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.g0.o(newInputStream, "newInputStream(...)");
        return r0.v(newInputStream);
    }
}
