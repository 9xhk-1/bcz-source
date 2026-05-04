package p90;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface c {
    BigInteger A(Enum<?> r12, String str, String... strArr);

    String A0(Enum<?> r12);

    Long B(Enum<?> r12);

    Integer B0(Enum<?> r12);

    <T extends Enum<T>> Map<T, Object> C(Map<T, Object> map, T... tArr);

    Boolean C0(int i11, String str, String str2);

    <T> T D(Enum<?> r12, T t11, r90.g... gVarArr);

    String[] E(Enum<?>... enumArr);

    <T extends Enum<T>> Map<T, String> F(Class<T> cls, T... tArr);

    Integer G(Enum<?> r12, String str, String... strArr);

    Map<String, Object> H(Map<String, Object> map, String... strArr);

    BigInteger I(String str);

    Character J(int i11);

    <T> T K(Enum<?> r12, Class<T> cls, r90.g... gVarArr);

    String[] L(int... iArr);

    Character M(Enum<?> r12);

    Byte N(int i11, String str, String... strArr);

    Calendar O(String str);

    BigDecimal P(int i11, String str, String... strArr);

    Float Q(String str, String str2, String... strArr);

    String R(String str, int i11);

    <T> T S(String str, Class<T> cls, r90.g... gVarArr);

    Long T(Enum<?> r12, String str, String... strArr);

    Map<Integer, Object> U(Map<Integer, Object> map, int... iArr);

    Date V(String str, String str2, String... strArr);

    Byte W(String str, String str2, String... strArr);

    <T> T X(String str, Class<T> cls);

    BigInteger Y(String str, String str2, String... strArr);

    <T> T Z(Enum<?> r12, T t11);

    Date a(int i11, String str, String... strArr);

    Long a0(int i11, String str, String... strArr);

    Map<Integer, String> b(Map<Integer, String> map, int... iArr);

    BigInteger b0(int i11);

    Float c(int i11, String str, String... strArr);

    Calendar c0(int i11);

    <T> T d(int i11, Class<T> cls, r90.g... gVarArr);

    <T> T d0(String str, T t11);

    Double e(Enum<?> r12, String str, String... strArr);

    <T> T e0(String str, T t11, r90.g... gVarArr);

    BigInteger f(int i11, String str, String... strArr);

    BigDecimal f0(Enum<?> r12, String str, String... strArr);

    BigInteger g(Enum<?> r12);

    Boolean g0(String str, String str2, String str3);

    BigDecimal getBigDecimal(int i11);

    BigDecimal getBigDecimal(String str);

    Boolean getBoolean(int i11);

    Boolean getBoolean(String str);

    Byte getByte(int i11);

    Byte getByte(String str);

    Date getDate(int i11);

    Date getDate(String str);

    Double getDouble(int i11);

    Double getDouble(String str);

    Float getFloat(int i11);

    Float getFloat(String str);

    Integer getInt(int i11);

    Integer getInt(String str);

    Long getLong(int i11);

    Long getLong(String str);

    f getMetaData();

    Short getShort(int i11);

    Short getShort(String str);

    String getString(int i11);

    String getString(int i11, int i12);

    String getString(String str);

    String[] getValues();

    Long h(String str, String str2, String... strArr);

    Short h0(Enum<?> r12);

    Map<Integer, Object> i(int... iArr);

    Calendar i0(String str, String str2, String... strArr);

    Byte j(Enum<?> r12);

    Map<String, String> j0(String... strArr);

    Float k(Enum<?> r12, String str, String... strArr);

    String[] k0(String... strArr);

    Date l(Enum<?> r12);

    Double l0(Enum<?> r12);

    Float m(Enum<?> r12);

    Integer m0(String str, String str2, String... strArr);

    Character n(String str);

    Map<String, Object> n0(String... strArr);

    Calendar o(Enum<?> r12, String str, String... strArr);

    <T extends Enum<T>> Map<T, String> o0(Map<T, String> map, T... tArr);

    BigDecimal p(String str, String str2, String... strArr);

    Double p0(String str, String str2, String... strArr);

    Boolean q(Enum<?> r12, String str, String str2);

    <T extends Enum<T>> Map<T, Object> q0(Class<T> cls, T... tArr);

    Map<Integer, String> r(int... iArr);

    Double r0(int i11, String str, String... strArr);

    Calendar s(Enum<?> r12);

    Map<String, String> s0(Map<String, String> map, String... strArr);

    Integer t(int i11, String str, String... strArr);

    Boolean t0(Enum<?> r12);

    BigDecimal u(Enum<?> r12);

    String u0(Enum<?> r12, int i11);

    Byte v(Enum<?> r12, String str, String... strArr);

    <T> T v0(Enum<?> r12, Class<T> cls);

    Date w(Enum<?> r12, String str, String... strArr);

    Short w0(int i11, String str, String... strArr);

    Short x(String str, String str2, String... strArr);

    <T> T x0(int i11, T t11, r90.g... gVarArr);

    Short y(Enum<?> r12, String str, String... strArr);

    <T> T y0(int i11, Class<T> cls);

    <T> T z(int i11, T t11);

    Calendar z0(int i11, String str, String... strArr);
}
