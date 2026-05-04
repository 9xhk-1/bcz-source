package p60;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o60.k;
import o60.l;
import qr.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f79347a = 1024;

    public static String A(InputStream inputStream) throws IOException {
        return k.g(x(inputStream));
    }

    public static String B(String str) {
        return k.g(y(str));
    }

    public static String C(byte[] bArr) {
        return k.g(z(bArr));
    }

    public static byte[] D(InputStream inputStream) throws IOException {
        return a(g(), inputStream);
    }

    public static byte[] E(String str) {
        return F(b(str));
    }

    public static byte[] F(byte[] bArr) {
        return g().digest(bArr);
    }

    public static String G(InputStream inputStream) throws IOException {
        return k.g(D(inputStream));
    }

    public static String H(String str) {
        return k.g(E(str));
    }

    public static String I(byte[] bArr) {
        return k.g(F(bArr));
    }

    public static String J(InputStream inputStream) throws IOException {
        return k.g(o(inputStream));
    }

    public static String K(String str) {
        return k.g(p(str));
    }

    public static String L(byte[] bArr) {
        return k.g(q(bArr));
    }

    public static byte[] a(MessageDigest messageDigest, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        while (read > -1) {
            messageDigest.update(bArr, 0, read);
            read = inputStream.read(bArr, 0, 1024);
        }
        return messageDigest.digest();
    }

    public static byte[] b(String str) {
        return l.g(str);
    }

    public static MessageDigest c(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11.getMessage());
        }
    }

    public static MessageDigest d() {
        return c("MD5");
    }

    public static MessageDigest e() {
        return c("SHA-256");
    }

    public static MessageDigest f() {
        return c("SHA-384");
    }

    public static MessageDigest g() {
        return c("SHA-512");
    }

    public static MessageDigest h() {
        return c(d.f82669a);
    }

    public static byte[] i(InputStream inputStream) throws IOException {
        return a(d(), inputStream);
    }

    public static byte[] j(String str) {
        return k(b(str));
    }

    public static byte[] k(byte[] bArr) {
        return d().digest(bArr);
    }

    public static String l(InputStream inputStream) throws IOException {
        return k.g(i(inputStream));
    }

    public static String m(String str) {
        return k.g(j(str));
    }

    public static String n(byte[] bArr) {
        return k.g(k(bArr));
    }

    public static byte[] o(InputStream inputStream) throws IOException {
        return a(h(), inputStream);
    }

    public static byte[] p(String str) {
        return q(b(str));
    }

    public static byte[] q(byte[] bArr) {
        return h().digest(bArr);
    }

    public static byte[] r(InputStream inputStream) throws IOException {
        return a(e(), inputStream);
    }

    public static byte[] s(String str) {
        return t(b(str));
    }

    public static byte[] t(byte[] bArr) {
        return e().digest(bArr);
    }

    public static String u(InputStream inputStream) throws IOException {
        return k.g(r(inputStream));
    }

    public static String v(String str) {
        return k.g(s(str));
    }

    public static String w(byte[] bArr) {
        return k.g(t(bArr));
    }

    public static byte[] x(InputStream inputStream) throws IOException {
        return a(f(), inputStream);
    }

    public static byte[] y(String str) {
        return z(b(str));
    }

    public static byte[] z(byte[] bArr) {
        return f().digest(bArr);
    }
}
