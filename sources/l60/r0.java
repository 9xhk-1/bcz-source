package l60;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes8.dex */
public final class r0 {
    @m80.k
    public static final e1 a(@m80.k File file) throws FileNotFoundException {
        return s0.a(file);
    }

    @m80.k
    public static final okio.b b(@m80.k ClassLoader classLoader) {
        return s0.b(classLoader);
    }

    @w00.j(name = "blackhole")
    @m80.k
    public static final e1 c() {
        return t0.a();
    }

    @m80.k
    public static final l d(@m80.k e1 e1Var) {
        return t0.b(e1Var);
    }

    @m80.k
    public static final m e(@m80.k g1 g1Var) {
        return t0.c(g1Var);
    }

    @m80.k
    public static final n f(@m80.k e1 e1Var, @m80.k Cipher cipher) {
        return s0.c(e1Var, cipher);
    }

    @m80.k
    public static final o g(@m80.k g1 g1Var, @m80.k Cipher cipher) {
        return s0.d(g1Var, cipher);
    }

    @m80.k
    public static final a0 h(@m80.k e1 e1Var, @m80.k MessageDigest messageDigest) {
        return s0.e(e1Var, messageDigest);
    }

    @m80.k
    public static final a0 i(@m80.k e1 e1Var, @m80.k Mac mac) {
        return s0.f(e1Var, mac);
    }

    @m80.k
    public static final b0 j(@m80.k g1 g1Var, @m80.k MessageDigest messageDigest) {
        return s0.g(g1Var, messageDigest);
    }

    @m80.k
    public static final b0 k(@m80.k g1 g1Var, @m80.k Mac mac) {
        return s0.h(g1Var, mac);
    }

    @m80.k
    public static final f1[] l(long j11) {
        return s0.i(j11);
    }

    @m80.k
    public static final okio.b m(@m80.k okio.b bVar, @m80.k okio.f fVar) throws IOException {
        return u0.a(bVar, fVar);
    }

    @w00.k
    @m80.k
    public static final e1 n(@m80.k File file) throws FileNotFoundException {
        return s0.j(file);
    }

    @w00.k
    @m80.k
    public static final e1 o(@m80.k File file, boolean z11) throws FileNotFoundException {
        return s0.k(file, z11);
    }

    @m80.k
    public static final e1 p(@m80.k OutputStream outputStream) {
        return s0.l(outputStream);
    }

    @m80.k
    public static final e1 q(@m80.k Socket socket) throws IOException {
        return s0.m(socket);
    }

    @m80.k
    public static final e1 r(@m80.k Path path, @m80.k OpenOption... openOptionArr) throws IOException {
        return s0.n(path, openOptionArr);
    }

    @w00.j(name = "socket")
    @m80.k
    public static final f1 t(@m80.k Socket socket) {
        return s0.p(socket);
    }

    @m80.k
    public static final g1 u(@m80.k File file) throws FileNotFoundException {
        return s0.q(file);
    }

    @m80.k
    public static final g1 v(@m80.k InputStream inputStream) {
        return s0.r(inputStream);
    }

    @m80.k
    public static final g1 w(@m80.k Socket socket) throws IOException {
        return s0.s(socket);
    }

    @m80.k
    public static final g1 x(@m80.k Path path, @m80.k OpenOption... openOptionArr) throws IOException {
        return s0.t(path, openOptionArr);
    }

    public static final <T extends Closeable, R> R y(T t11, @m80.k x00.l<? super T, ? extends R> lVar) {
        return (R) t0.d(t11, lVar);
    }
}
