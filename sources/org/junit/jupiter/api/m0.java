package org.junit.jupiter.api;

import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.opentest4j.MultipleFailuresError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class m0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "5.9.1", status = API.Status.INTERNAL)
    public interface a<T extends Throwable> {
        T a(Duration timeout, Supplier<String> messageSupplier, Throwable cause);
    }

    @API(since = "5.3", status = API.Status.STABLE)
    public m0() {
    }

    public static void A(int[] expected, int[] actual, Supplier<String> messageSupplier) {
        g.C(expected, actual, messageSupplier);
    }

    public static void A0(int expected, Integer actual) {
        i.y(Integer.valueOf(expected), actual);
    }

    public static void A1(Short expected, short actual, String message) {
        i.z(expected, Short.valueOf(actual), message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void A2(float unexpected, float actual, Supplier<String> messageSupplier) {
        r.r(unexpected, actual, messageSupplier);
    }

    public static void A3(Object unexpected, Object actual) {
        r.y(unexpected, actual);
    }

    public static <V> V A4() {
        l0.e();
        return null;
    }

    public static void B(long[] expected, long[] actual) {
        g.D(expected, actual);
    }

    public static void B0(int expected, Integer actual, String message) {
        i.z(Integer.valueOf(expected), actual, message);
    }

    public static void B1(Short expected, short actual, Supplier<String> messageSupplier) {
        i.A(expected, Short.valueOf(actual), messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void B2(float unexpected, Float actual) {
        r.y(Float.valueOf(unexpected), actual);
    }

    public static void B3(Object unexpected, Object actual, String message) {
        r.z(unexpected, actual, message);
    }

    public static <V> V B4(String message) {
        l0.f(message);
        return null;
    }

    public static void C(long[] expected, long[] actual, String message) {
        g.E(expected, actual, message);
    }

    public static void C0(int expected, Integer actual, Supplier<String> messageSupplier) {
        i.A(Integer.valueOf(expected), actual, messageSupplier);
    }

    public static void C1(short expected, Short actual) {
        i.y(Short.valueOf(expected), actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void C2(float unexpected, Float actual, String message) {
        r.z(Float.valueOf(unexpected), actual, message);
    }

    public static void C3(Object unexpected, Object actual, Supplier<String> messageSupplier) {
        r.A(unexpected, actual, messageSupplier);
    }

    public static <V> V C4(String message, Throwable cause) {
        l0.g(message, cause);
        return null;
    }

    public static void D(long[] expected, long[] actual, Supplier<String> messageSupplier) {
        g.G(expected, actual, messageSupplier);
    }

    public static void D0(long expected, long actual) {
        i.v(expected, actual);
    }

    public static void D1(short expected, Short actual, String message) {
        i.z(Short.valueOf(expected), actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void D2(float unexpected, Float actual, Supplier<String> messageSupplier) {
        r.A(Float.valueOf(unexpected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void D3(Short unexpected, Short actual) {
        r.y(unexpected, actual);
    }

    public static <V> V D4(Throwable cause) {
        l0.h(cause);
        return null;
    }

    public static void E(Object[] expected, Object[] actual) {
        g.H(expected, actual);
    }

    public static void E0(long expected, long actual, String message) {
        i.w(expected, actual, message);
    }

    public static void E1(short expected, Short actual, Supplier<String> messageSupplier) {
        i.A(Short.valueOf(expected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void E2(int unexpected, int actual) {
        r.s(unexpected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void E3(Short unexpected, Short actual, String message) {
        r.z(unexpected, actual, message);
    }

    public static <V> V E4(Supplier<String> messageSupplier) {
        l0.i(messageSupplier);
        return null;
    }

    public static void F(Object[] expected, Object[] actual, String message) {
        g.I(expected, actual, message);
    }

    public static void F0(long expected, long actual, Supplier<String> messageSupplier) {
        i.x(expected, actual, messageSupplier);
    }

    public static void F1(short expected, short actual) {
        i.B(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void F2(int unexpected, int actual, String message) {
        r.t(unexpected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void F3(Short unexpected, Short actual, Supplier<String> messageSupplier) {
        r.A(unexpected, actual, messageSupplier);
    }

    public static void G(Object[] expected, Object[] actual, Supplier<String> messageSupplier) {
        g.K(expected, actual, messageSupplier);
    }

    public static void G0(long expected, Long actual) {
        i.y(Long.valueOf(expected), actual);
    }

    public static void G1(short expected, short actual, String message) {
        i.C(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void G2(int unexpected, int actual, Supplier<String> messageSupplier) {
        r.u(unexpected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void G3(Short unexpected, short actual) {
        r.y(unexpected, Short.valueOf(actual));
    }

    public static void H(short[] expected, short[] actual) {
        g.L(expected, actual);
    }

    public static void H0(long expected, Long actual, String message) {
        i.z(Long.valueOf(expected), actual, message);
    }

    public static void H1(short expected, short actual, Supplier<String> messageSupplier) {
        i.D(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void H2(int unexpected, Integer actual) {
        r.y(Integer.valueOf(unexpected), actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void H3(Short unexpected, short actual, String message) {
        r.z(unexpected, Short.valueOf(actual), message);
    }

    public static void I(short[] expected, short[] actual, String message) {
        g.M(expected, actual, message);
    }

    public static void I0(long expected, Long actual, Supplier<String> messageSupplier) {
        i.A(Long.valueOf(expected), actual, messageSupplier);
    }

    public static void I1(BooleanSupplier booleanSupplier) {
        j.a(booleanSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void I2(int unexpected, Integer actual, String message) {
        r.z(Integer.valueOf(unexpected), actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void I3(Short unexpected, short actual, Supplier<String> messageSupplier) {
        r.A(unexpected, Short.valueOf(actual), messageSupplier);
    }

    public static void J(short[] expected, short[] actual, Supplier<String> messageSupplier) {
        g.O(expected, actual, messageSupplier);
    }

    public static void J0(Byte expected, byte actual) {
        i.y(expected, Byte.valueOf(actual));
    }

    public static void J1(BooleanSupplier booleanSupplier, String message) {
        j.b(booleanSupplier, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void J2(int unexpected, Integer actual, Supplier<String> messageSupplier) {
        r.A(Integer.valueOf(unexpected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void J3(short unexpected, Short actual) {
        r.y(Short.valueOf(unexpected), actual);
    }

    public static void K(boolean[] expected, boolean[] actual) {
        g.P(expected, actual);
    }

    public static void K0(Byte expected, byte actual, String message) {
        i.z(expected, Byte.valueOf(actual), message);
    }

    public static void K1(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier) {
        j.c(booleanSupplier, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void K2(long unexpected, long actual) {
        r.v(unexpected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void K3(short unexpected, Short actual, String message) {
        r.z(Short.valueOf(unexpected), actual, message);
    }

    public static void L(boolean[] expected, boolean[] actual, String message) {
        g.Q(expected, actual, message);
    }

    public static void L0(Byte expected, byte actual, Supplier<String> messageSupplier) {
        i.A(expected, Byte.valueOf(actual), messageSupplier);
    }

    public static void L1(boolean condition) {
        j.d(condition);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void L2(long unexpected, long actual, String message) {
        r.w(unexpected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void L3(short unexpected, Short actual, Supplier<String> messageSupplier) {
        r.A(Short.valueOf(unexpected), actual, messageSupplier);
    }

    public static void M(boolean[] expected, boolean[] actual, Supplier<String> messageSupplier) {
        g.S(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void M0(Byte expected, Byte actual) {
        i.y(expected, actual);
    }

    public static void M1(boolean condition, String message) {
        j.e(condition, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void M2(long unexpected, long actual, Supplier<String> messageSupplier) {
        r.x(unexpected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void M3(short unexpected, short actual) {
        r.B(unexpected, actual);
    }

    @API(since = "5.2", status = API.Status.STABLE)
    public static <T> T N(r80.c<T> cVar) {
        return (T) h.a(cVar);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void N0(Byte expected, Byte actual, String message) {
        i.z(expected, actual, message);
    }

    public static void N1(boolean condition, Supplier<String> messageSupplier) {
        j.f(condition, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void N2(long unexpected, Long actual) {
        r.y(Long.valueOf(unexpected), actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void N3(short unexpected, short actual, String message) {
        r.C(unexpected, actual, message);
    }

    @API(since = "5.2", status = API.Status.STABLE)
    public static <T> T O(r80.c<T> cVar, String str) {
        return (T) h.c(cVar, str);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void O0(Byte expected, Byte actual, Supplier<String> messageSupplier) {
        i.A(expected, actual, messageSupplier);
    }

    @API(since = "5.10", status = API.Status.STABLE)
    public static <T> T O1(Class<T> cls, Object obj) {
        return (T) k.a(cls, obj);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void O2(long unexpected, Long actual, String message) {
        r.z(Long.valueOf(unexpected), actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void O3(short unexpected, short actual, Supplier<String> messageSupplier) {
        r.D(unexpected, actual, messageSupplier);
    }

    @API(since = "5.2", status = API.Status.STABLE)
    public static <T> T P(r80.c<T> cVar, Supplier<String> supplier) {
        return (T) h.d(cVar, supplier);
    }

    public static void P0(Character expected, char actual) {
        i.y(expected, Character.valueOf(actual));
    }

    @API(since = "5.10", status = API.Status.STABLE)
    public static <T> T P1(Class<T> cls, Object obj, String str) {
        return (T) k.c(cls, obj, str);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void P2(long unexpected, Long actual, Supplier<String> messageSupplier) {
        r.A(Long.valueOf(unexpected), actual, messageSupplier);
    }

    public static void P3(Object actual) {
        s.a(actual);
    }

    @API(since = "5.2", status = API.Status.STABLE)
    public static void Q(r80.a executable) {
        h.e(executable);
    }

    public static void Q0(Character expected, char actual, String message) {
        i.z(expected, Character.valueOf(actual), message);
    }

    @API(since = "5.10", status = API.Status.STABLE)
    public static <T> T Q1(Class<T> cls, Object obj, Supplier<String> supplier) {
        return (T) k.d(cls, obj, supplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void Q2(Byte unexpected, byte actual) {
        r.y(unexpected, Byte.valueOf(actual));
    }

    public static void Q3(Object actual, String message) {
        s.b(actual, message);
    }

    @API(since = "5.2", status = API.Status.STABLE)
    public static void R(r80.a executable, String message) {
        h.g(executable, message);
    }

    public static void R0(Character expected, char actual, Supplier<String> messageSupplier) {
        i.A(expected, Character.valueOf(actual), messageSupplier);
    }

    public static void R1(Iterable<?> expected, Iterable<?> actual) {
        n.d(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void R2(Byte unexpected, byte actual, String message) {
        r.z(unexpected, Byte.valueOf(actual), message);
    }

    public static void R3(Object actual, Supplier<String> messageSupplier) {
        s.c(actual, messageSupplier);
    }

    @API(since = "5.2", status = API.Status.STABLE)
    public static void S(r80.a executable, Supplier<String> messageSupplier) {
        h.h(executable, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void S0(Character expected, Character actual) {
        i.y(expected, actual);
    }

    public static void S1(Iterable<?> expected, Iterable<?> actual, String message) {
        n.e(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void S2(Byte unexpected, byte actual, Supplier<String> messageSupplier) {
        r.A(unexpected, Byte.valueOf(actual), messageSupplier);
    }

    public static void S3(Object unexpected, Object actual) {
        t.a(unexpected, actual);
    }

    public static void T(byte expected, byte actual) {
        i.a(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void T0(Character expected, Character actual, String message) {
        i.z(expected, actual, message);
    }

    public static void T1(Iterable<?> expected, Iterable<?> actual, Supplier<String> messageSupplier) {
        n.h(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void T2(Byte unexpected, Byte actual) {
        r.y(unexpected, actual);
    }

    public static void T3(Object unexpected, Object actual, String message) {
        t.b(unexpected, actual, message);
    }

    public static void U(byte expected, byte actual, String message) {
        i.b(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void U0(Character expected, Character actual, Supplier<String> messageSupplier) {
        i.A(expected, actual, messageSupplier);
    }

    public static void U1(List<String> expectedLines, List<String> actualLines) {
        q.b(expectedLines, actualLines);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void U2(Byte unexpected, Byte actual, String message) {
        r.z(unexpected, actual, message);
    }

    public static void U3(Object unexpected, Object actual, Supplier<String> messageSupplier) {
        t.c(unexpected, actual, messageSupplier);
    }

    public static void V(byte expected, byte actual, Supplier<String> messageSupplier) {
        i.c(expected, actual, messageSupplier);
    }

    public static void V0(Double expected, double actual) {
        i.y(expected, Double.valueOf(actual));
    }

    public static void V1(List<String> expectedLines, List<String> actualLines, String message) {
        q.d(expectedLines, actualLines, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void V2(Byte unexpected, Byte actual, Supplier<String> messageSupplier) {
        r.A(unexpected, actual, messageSupplier);
    }

    public static void V3(Object actual) {
        u.a(actual);
    }

    public static void W(byte expected, Byte actual) {
        i.y(Byte.valueOf(expected), actual);
    }

    public static void W0(Double expected, double actual, String message) {
        i.z(expected, Double.valueOf(actual), message);
    }

    public static void W1(List<String> expectedLines, List<String> actualLines, Supplier<String> messageSupplier) {
        q.c(expectedLines, actualLines, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void W2(Character unexpected, char actual) {
        r.y(unexpected, Character.valueOf(actual));
    }

    public static void W3(Object actual, String message) {
        u.b(actual, message);
    }

    public static void X(byte expected, Byte actual, String message) {
        i.z(Byte.valueOf(expected), actual, message);
    }

    public static void X0(Double expected, double actual, Supplier<String> messageSupplier) {
        i.A(expected, Double.valueOf(actual), messageSupplier);
    }

    public static void X1(Stream<String> expectedLines, Stream<String> actualLines) {
        q.e(expectedLines, actualLines);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void X2(Character unexpected, char actual, String message) {
        r.z(unexpected, Character.valueOf(actual), message);
    }

    public static void X3(Object actual, Supplier<String> messageSupplier) {
        u.c(actual, messageSupplier);
    }

    public static void Y(byte expected, Byte actual, Supplier<String> messageSupplier) {
        i.A(Byte.valueOf(expected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void Y0(Double expected, Double actual) {
        i.y(expected, actual);
    }

    public static void Y1(Stream<String> expectedLines, Stream<String> actualLines, String message) {
        q.g(expectedLines, actualLines, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void Y2(Character unexpected, char actual, Supplier<String> messageSupplier) {
        r.A(unexpected, Character.valueOf(actual), messageSupplier);
    }

    public static void Y3(Object expected, Object actual) {
        v.a(expected, actual);
    }

    public static void Z(char expected, char actual) {
        i.d(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void Z0(Double expected, Double actual, String message) {
        i.z(expected, actual, message);
    }

    public static void Z1(Stream<String> expectedLines, Stream<String> actualLines, Supplier<String> messageSupplier) {
        q.f(expectedLines, actualLines, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void Z2(Character unexpected, Character actual) {
        r.y(unexpected, actual);
    }

    public static void Z3(Object expected, Object actual, String message) {
        v.b(expected, actual, message);
    }

    public static void a(String heading, Collection<r80.a> executables) throws MultipleFailuresError {
        f.b(heading, executables);
    }

    public static void a0(char expected, char actual, String message) {
        i.e(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void a1(Double expected, Double actual, Supplier<String> messageSupplier) {
        i.A(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void a2(byte unexpected, byte actual) {
        r.a(unexpected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void a3(Character unexpected, Character actual, String message) {
        r.z(unexpected, actual, message);
    }

    public static void a4(Object expected, Object actual, Supplier<String> messageSupplier) {
        v.c(expected, actual, messageSupplier);
    }

    public static void b(String heading, Stream<r80.a> executables) throws MultipleFailuresError {
        f.c(heading, executables);
    }

    public static void b0(char expected, char actual, Supplier<String> messageSupplier) {
        i.f(expected, actual, messageSupplier);
    }

    public static void b1(Float expected, float actual) {
        i.y(expected, Float.valueOf(actual));
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void b2(byte unexpected, byte actual, String message) {
        r.b(unexpected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void b3(Character unexpected, Character actual, Supplier<String> messageSupplier) {
        r.A(unexpected, actual, messageSupplier);
    }

    public static <T extends Throwable> T b4(Class<T> cls, r80.a aVar) {
        return (T) w.a(cls, aVar);
    }

    public static void c(String heading, r80.a... executables) throws MultipleFailuresError {
        f.d(heading, executables);
    }

    public static void c0(char expected, Character actual) {
        i.y(Character.valueOf(expected), actual);
    }

    public static void c1(Float expected, float actual, String message) {
        i.z(expected, Float.valueOf(actual), message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void c2(byte unexpected, byte actual, Supplier<String> messageSupplier) {
        r.c(unexpected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void c3(Double unexpected, double actual) {
        r.y(unexpected, Double.valueOf(actual));
    }

    public static <T extends Throwable> T c4(Class<T> cls, r80.a aVar, String str) {
        return (T) w.c(cls, aVar, str);
    }

    public static void d(Collection<r80.a> executables) throws MultipleFailuresError {
        f.e(executables);
    }

    public static void d0(char expected, Character actual, String message) {
        i.z(Character.valueOf(expected), actual, message);
    }

    public static void d1(Float expected, float actual, Supplier<String> messageSupplier) {
        i.A(expected, Float.valueOf(actual), messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void d2(byte unexpected, Byte actual) {
        r.y(Byte.valueOf(unexpected), actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void d3(Double unexpected, double actual, String message) {
        r.z(unexpected, Double.valueOf(actual), message);
    }

    public static <T extends Throwable> T d4(Class<T> cls, r80.a aVar, Supplier<String> supplier) {
        return (T) w.d(cls, aVar, supplier);
    }

    public static void e(Stream<r80.a> executables) throws MultipleFailuresError {
        f.f(executables);
    }

    public static void e0(char expected, Character actual, Supplier<String> messageSupplier) {
        i.A(Character.valueOf(expected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void e1(Float expected, Float actual) {
        i.y(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void e2(byte unexpected, Byte actual, String message) {
        r.z(Byte.valueOf(unexpected), actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void e3(Double unexpected, double actual, Supplier<String> messageSupplier) {
        r.A(unexpected, Double.valueOf(actual), messageSupplier);
    }

    @API(since = "5.10", status = API.Status.STABLE)
    public static <T extends Throwable> T e4(Class<T> cls, r80.a aVar) {
        return (T) x.a(cls, aVar);
    }

    public static void f(r80.a... executables) throws MultipleFailuresError {
        f.g(executables);
    }

    public static void f0(double expected, double actual) {
        i.g(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void f1(Float expected, Float actual, String message) {
        i.z(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void f2(byte unexpected, Byte actual, Supplier<String> messageSupplier) {
        r.A(Byte.valueOf(unexpected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void f3(Double unexpected, Double actual) {
        r.y(unexpected, actual);
    }

    @API(since = "5.10", status = API.Status.STABLE)
    public static <T extends Throwable> T f4(Class<T> cls, r80.a aVar, String str) {
        return (T) x.c(cls, aVar, str);
    }

    public static void g(byte[] expected, byte[] actual) {
        g.b(expected, actual);
    }

    public static void g0(double expected, double actual, double delta) {
        i.h(expected, actual, delta);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void g1(Float expected, Float actual, Supplier<String> messageSupplier) {
        i.A(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void g2(char unexpected, char actual) {
        r.d(unexpected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void g3(Double unexpected, Double actual, String message) {
        r.z(unexpected, actual, message);
    }

    @API(since = "5.10", status = API.Status.STABLE)
    public static <T extends Throwable> T g4(Class<T> cls, r80.a aVar, Supplier<String> supplier) {
        return (T) x.d(cls, aVar, supplier);
    }

    public static void h(byte[] expected, byte[] actual, String message) {
        g.c(expected, actual, message);
    }

    public static void h0(double expected, double actual, double delta, String message) {
        i.i(expected, actual, delta, message);
    }

    public static void h1(Integer expected, int actual) {
        i.y(expected, Integer.valueOf(actual));
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void h2(char unexpected, char actual, String message) {
        r.e(unexpected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void h3(Double unexpected, Double actual, Supplier<String> messageSupplier) {
        r.A(unexpected, actual, messageSupplier);
    }

    public static <T> T h4(Duration duration, r80.c<T> cVar) {
        return (T) a0.c(duration, cVar);
    }

    public static void i(byte[] expected, byte[] actual, Supplier<String> messageSupplier) {
        g.e(expected, actual, messageSupplier);
    }

    public static void i0(double expected, double actual, double delta, Supplier<String> messageSupplier) {
        i.j(expected, actual, delta, messageSupplier);
    }

    public static void i1(Integer expected, int actual, String message) {
        i.z(expected, Integer.valueOf(actual), message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void i2(char unexpected, char actual, Supplier<String> messageSupplier) {
        r.f(unexpected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void i3(Float unexpected, float actual) {
        r.y(unexpected, Float.valueOf(actual));
    }

    public static <T> T i4(Duration duration, r80.c<T> cVar, String str) {
        return (T) a0.e(duration, cVar, str);
    }

    public static void j(char[] expected, char[] actual) {
        g.f(expected, actual);
    }

    public static void j0(double expected, double actual, String message) {
        i.k(expected, actual, message);
    }

    public static void j1(Integer expected, int actual, Supplier<String> messageSupplier) {
        i.A(expected, Integer.valueOf(actual), messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void j2(char unexpected, Character actual) {
        r.y(Character.valueOf(unexpected), actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void j3(Float unexpected, float actual, String message) {
        r.z(unexpected, Float.valueOf(actual), message);
    }

    public static <T> T j4(Duration duration, r80.c<T> cVar, Supplier<String> supplier) {
        return (T) a0.f(duration, cVar, supplier);
    }

    public static void k(char[] expected, char[] actual, String message) {
        g.g(expected, actual, message);
    }

    public static void k0(double expected, double actual, Supplier<String> messageSupplier) {
        i.l(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void k1(Integer expected, Integer actual) {
        i.y(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void k2(char unexpected, Character actual, String message) {
        r.z(Character.valueOf(unexpected), actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void k3(Float unexpected, float actual, Supplier<String> messageSupplier) {
        r.A(unexpected, Float.valueOf(actual), messageSupplier);
    }

    public static void k4(Duration timeout, r80.a executable) {
        a0.g(timeout, executable);
    }

    public static void l(char[] expected, char[] actual, Supplier<String> messageSupplier) {
        g.i(expected, actual, messageSupplier);
    }

    public static void l0(double expected, Double actual) {
        i.y(Double.valueOf(expected), actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void l1(Integer expected, Integer actual, String message) {
        i.z(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void l2(char unexpected, Character actual, Supplier<String> messageSupplier) {
        r.A(Character.valueOf(unexpected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void l3(Float unexpected, Float actual) {
        r.y(unexpected, actual);
    }

    public static void l4(Duration timeout, r80.a executable, String message) {
        a0.h(timeout, executable, message);
    }

    public static void m(double[] expected, double[] actual) {
        g.j(expected, actual);
    }

    public static void m0(double expected, Double actual, String message) {
        i.z(Double.valueOf(expected), actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void m1(Integer expected, Integer actual, Supplier<String> messageSupplier) {
        i.A(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void m2(double unexpected, double actual) {
        r.g(unexpected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void m3(Float unexpected, Float actual, String message) {
        r.z(unexpected, actual, message);
    }

    public static void m4(Duration timeout, r80.a executable, Supplier<String> messageSupplier) {
        a0.i(timeout, executable, messageSupplier);
    }

    public static void n(double[] expected, double[] actual, double delta) {
        g.k(expected, actual, delta);
    }

    public static void n0(double expected, Double actual, Supplier<String> messageSupplier) {
        i.A(Double.valueOf(expected), actual, messageSupplier);
    }

    public static void n1(Long expected, long actual) {
        i.y(expected, Long.valueOf(actual));
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void n2(double unexpected, double actual, double delta) {
        r.h(unexpected, actual, delta);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void n3(Float unexpected, Float actual, Supplier<String> messageSupplier) {
        r.A(unexpected, actual, messageSupplier);
    }

    public static <T> T n4(Duration duration, r80.c<T> cVar) {
        return (T) h0.f(duration, cVar);
    }

    public static void o(double[] expected, double[] actual, double delta, String message) {
        g.l(expected, actual, delta, message);
    }

    public static void o0(float expected, float actual) {
        i.m(expected, actual);
    }

    public static void o1(Long expected, long actual, String message) {
        i.z(expected, Long.valueOf(actual), message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void o2(double unexpected, double actual, double delta, String message) {
        r.i(unexpected, actual, delta, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void o3(Integer unexpected, int actual) {
        r.y(unexpected, Integer.valueOf(actual));
    }

    public static <T> T o4(Duration duration, r80.c<T> cVar, String str) {
        return (T) h0.g(duration, cVar, str);
    }

    public static void p(double[] expected, double[] actual, double delta, Supplier<String> messageSupplier) {
        g.n(expected, actual, delta, messageSupplier);
    }

    public static void p0(float expected, float actual, float delta) {
        i.n(expected, actual, delta);
    }

    public static void p1(Long expected, long actual, Supplier<String> messageSupplier) {
        i.A(expected, Long.valueOf(actual), messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void p2(double unexpected, double actual, double delta, Supplier<String> messageSupplier) {
        r.j(unexpected, actual, delta, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void p3(Integer unexpected, int actual, String message) {
        r.z(unexpected, Integer.valueOf(actual), message);
    }

    public static <T> T p4(Duration duration, r80.c<T> cVar, Supplier<String> supplier) {
        return (T) h0.h(duration, cVar, supplier);
    }

    public static void q(double[] expected, double[] actual, String message) {
        g.o(expected, actual, message);
    }

    public static void q0(float expected, float actual, float delta, String message) {
        i.o(expected, actual, delta, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void q1(Long expected, Long actual) {
        i.y(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void q2(double unexpected, double actual, String message) {
        r.k(unexpected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void q3(Integer unexpected, int actual, Supplier<String> messageSupplier) {
        r.A(unexpected, Integer.valueOf(actual), messageSupplier);
    }

    @API(since = "5.9.1", status = API.Status.INTERNAL)
    public static <T, E extends Throwable> T q4(Duration duration, r80.c<T> cVar, Supplier<String> supplier, a<E> aVar) throws Throwable {
        return (T) h0.i(duration, cVar, supplier, aVar);
    }

    public static void r(double[] expected, double[] actual, Supplier<String> messageSupplier) {
        g.q(expected, actual, messageSupplier);
    }

    public static void r0(float expected, float actual, float delta, Supplier<String> messageSupplier) {
        i.p(expected, actual, delta, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void r1(Long expected, Long actual, String message) {
        i.z(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void r2(double unexpected, double actual, Supplier<String> messageSupplier) {
        r.l(unexpected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void r3(Integer unexpected, Integer actual) {
        r.y(unexpected, actual);
    }

    public static void r4(Duration timeout, r80.a executable) {
        h0.j(timeout, executable);
    }

    public static void s(float[] expected, float[] actual) {
        g.r(expected, actual);
    }

    public static void s0(float expected, float actual, String message) {
        i.q(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void s1(Long expected, Long actual, Supplier<String> messageSupplier) {
        i.A(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void s2(double unexpected, Double actual) {
        r.y(Double.valueOf(unexpected), actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void s3(Integer unexpected, Integer actual, String message) {
        r.z(unexpected, actual, message);
    }

    public static void s4(Duration timeout, r80.a executable, String message) {
        h0.k(timeout, executable, message);
    }

    public static void t(float[] expected, float[] actual, float delta) {
        g.s(expected, actual, delta);
    }

    public static void t0(float expected, float actual, Supplier<String> messageSupplier) {
        i.r(expected, actual, messageSupplier);
    }

    public static void t1(Object expected, Object actual) {
        i.y(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void t2(double unexpected, Double actual, String message) {
        r.z(Double.valueOf(unexpected), actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void t3(Integer unexpected, Integer actual, Supplier<String> messageSupplier) {
        r.A(unexpected, actual, messageSupplier);
    }

    public static void t4(Duration timeout, r80.a executable, Supplier<String> messageSupplier) {
        h0.l(timeout, executable, messageSupplier);
    }

    public static void u(float[] expected, float[] actual, float delta, String message) {
        g.t(expected, actual, delta, message);
    }

    public static void u0(float expected, Float actual) {
        i.y(Float.valueOf(expected), actual);
    }

    public static void u1(Object expected, Object actual, String message) {
        i.z(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void u2(double unexpected, Double actual, Supplier<String> messageSupplier) {
        r.A(Double.valueOf(unexpected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void u3(Long unexpected, long actual) {
        r.y(unexpected, Long.valueOf(actual));
    }

    public static void u4(BooleanSupplier booleanSupplier) {
        i0.a(booleanSupplier);
    }

    public static void v(float[] expected, float[] actual, float delta, Supplier<String> messageSupplier) {
        g.v(expected, actual, delta, messageSupplier);
    }

    public static void v0(float expected, Float actual, String message) {
        i.z(Float.valueOf(expected), actual, message);
    }

    public static void v1(Object expected, Object actual, Supplier<String> messageSupplier) {
        i.A(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void v2(float unexpected, float actual) {
        r.m(unexpected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void v3(Long unexpected, long actual, String message) {
        r.z(unexpected, Long.valueOf(actual), message);
    }

    public static void v4(BooleanSupplier booleanSupplier, String message) {
        i0.b(booleanSupplier, message);
    }

    public static void w(float[] expected, float[] actual, String message) {
        g.w(expected, actual, message);
    }

    public static void w0(float expected, Float actual, Supplier<String> messageSupplier) {
        i.A(Float.valueOf(expected), actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void w1(Short expected, Short actual) {
        i.y(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void w2(float unexpected, float actual, float delta) {
        r.n(unexpected, actual, delta);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void w3(Long unexpected, long actual, Supplier<String> messageSupplier) {
        r.A(unexpected, Long.valueOf(actual), messageSupplier);
    }

    public static void w4(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier) {
        i0.c(booleanSupplier, messageSupplier);
    }

    public static void x(float[] expected, float[] actual, Supplier<String> messageSupplier) {
        g.y(expected, actual, messageSupplier);
    }

    public static void x0(int expected, int actual) {
        i.s(expected, actual);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void x1(Short expected, Short actual, String message) {
        i.z(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void x2(float unexpected, float actual, float delta, String message) {
        r.o(unexpected, actual, delta, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void x3(Long unexpected, Long actual) {
        r.y(unexpected, actual);
    }

    public static void x4(boolean condition) {
        i0.d(condition);
    }

    public static void y(int[] expected, int[] actual) {
        g.z(expected, actual);
    }

    public static void y0(int expected, int actual, String message) {
        i.t(expected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void y1(Short expected, Short actual, Supplier<String> messageSupplier) {
        i.A(expected, actual, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void y2(float unexpected, float actual, float delta, Supplier<String> messageSupplier) {
        r.p(unexpected, actual, delta, messageSupplier);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void y3(Long unexpected, Long actual, String message) {
        r.z(unexpected, actual, message);
    }

    public static void y4(boolean condition, String message) {
        i0.e(condition, message);
    }

    public static void z(int[] expected, int[] actual, String message) {
        g.A(expected, actual, message);
    }

    public static void z0(int expected, int actual, Supplier<String> messageSupplier) {
        i.u(expected, actual, messageSupplier);
    }

    public static void z1(Short expected, short actual) {
        i.y(expected, Short.valueOf(actual));
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void z2(float unexpected, float actual, String message) {
        r.q(unexpected, actual, message);
    }

    @API(since = "5.4", status = API.Status.STABLE)
    public static void z3(Long unexpected, Long actual, Supplier<String> messageSupplier) {
        r.A(unexpected, actual, messageSupplier);
    }

    public static void z4(boolean condition, Supplier<String> messageSupplier) {
        i0.f(condition, messageSupplier);
    }
}
