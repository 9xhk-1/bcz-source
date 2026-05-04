package p90;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e<C extends i> implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f80303a;

    /* renamed from: b, reason: collision with root package name */
    public final g<C> f80304b;

    public e(String[] strArr, g gVar) {
        this.f80303a = strArr;
        this.f80304b = gVar;
    }

    @Override // p90.c
    public BigInteger A(Enum<?> r82, String str, String... strArr) {
        return (BigInteger) this.f80304b.H(this.f80303a, r82, BigInteger.class, null, str, strArr);
    }

    @Override // p90.c
    public String A0(Enum<?> r52) {
        return (String) this.f80304b.G(this.f80303a, r52, String.class, null);
    }

    @Override // p90.c
    public Long B(Enum<?> r52) {
        return (Long) this.f80304b.G(this.f80303a, r52, Long.class, null);
    }

    @Override // p90.c
    public Integer B0(Enum<?> r52) {
        return (Integer) this.f80304b.G(this.f80303a, r52, Integer.class, null);
    }

    @Override // p90.c
    public <T extends Enum<T>> Map<T, Object> C(Map<T, Object> map, T... tArr) {
        for (Enum<?> r12 : E0(tArr.getClass().getComponentType(), tArr)) {
            map.put(r12, this.f80304b.G(this.f80303a, r12, null, null));
        }
        return map;
    }

    @Override // p90.c
    public Boolean C0(int i11, String str, String str2) {
        return (Boolean) this.f80304b.F(this.f80303a, i11, Boolean.class, Boolean.FALSE, str, str2);
    }

    @Override // p90.c
    public <T> T D(Enum<?> r32, T t11, r90.g... gVarArr) {
        return (T) this.f80304b.O(this.f80303a, r32, t11, gVarArr);
    }

    public final int[] D0(int[] iArr) {
        if (iArr.length == 0) {
            iArr = new int[this.f80303a.length];
            for (int i11 = 0; i11 < this.f80303a.length; i11++) {
                iArr[i11] = i11;
            }
        }
        return iArr;
    }

    @Override // p90.c
    public String[] E(Enum<?>... enumArr) {
        int length = enumArr.length;
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            strArr[i11] = A0(enumArr[i11]);
        }
        return strArr;
    }

    public <T extends Enum<T>> T[] E0(Class<T> cls, T... tArr) {
        return tArr.length == 0 ? cls.getEnumConstants() : tArr;
    }

    @Override // p90.c
    public <T extends Enum<T>> Map<T, String> F(Class<T> cls, T... tArr) {
        return o0(new EnumMap(cls), tArr);
    }

    public final String[] F0(String[] strArr) {
        return strArr.length == 0 ? this.f80304b.a() : strArr;
    }

    @Override // p90.c
    public Integer G(Enum<?> r82, String str, String... strArr) {
        return (Integer) this.f80304b.H(this.f80303a, r82, Integer.class, null, str, strArr);
    }

    public final String G0(String str, int i11) {
        if (str == null) {
            return null;
        }
        if (i11 >= 0) {
            return str.length() > i11 ? str.substring(0, i11) : str;
        }
        throw new IllegalArgumentException("Maximum length can't be negative");
    }

    @Override // p90.c
    public Map<String, Object> H(Map<String, Object> map, String... strArr) {
        for (String str : F0(strArr)) {
            map.put(str, this.f80304b.I(this.f80303a, str, null, null));
        }
        return map;
    }

    @Override // p90.c
    public BigInteger I(String str) {
        return (BigInteger) this.f80304b.I(this.f80303a, str, BigInteger.class, null);
    }

    @Override // p90.c
    public Character J(int i11) {
        return (Character) this.f80304b.E(this.f80303a, i11, Character.class, null);
    }

    @Override // p90.c
    public <T> T K(Enum<?> r32, Class<T> cls, r90.g... gVarArr) {
        return (T) this.f80304b.N(this.f80303a, r32, cls, gVarArr);
    }

    @Override // p90.c
    public String[] L(int... iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            strArr[i11] = getString(iArr[i11]);
        }
        return strArr;
    }

    @Override // p90.c
    public Character M(Enum<?> r52) {
        return (Character) this.f80304b.G(this.f80303a, r52, Character.class, null);
    }

    @Override // p90.c
    public Byte N(int i11, String str, String... strArr) {
        return (Byte) this.f80304b.F(this.f80303a, i11, Byte.class, null, str, strArr);
    }

    @Override // p90.c
    public Calendar O(String str) {
        return (Calendar) this.f80304b.I(this.f80303a, str, Calendar.class, null);
    }

    @Override // p90.c
    public BigDecimal P(int i11, String str, String... strArr) {
        return (BigDecimal) this.f80304b.F(this.f80303a, i11, BigDecimal.class, null, str, strArr);
    }

    @Override // p90.c
    public Float Q(String str, String str2, String... strArr) {
        return (Float) this.f80304b.J(this.f80303a, str, Float.class, null, str2, strArr);
    }

    @Override // p90.c
    public String R(String str, int i11) {
        return G0(this.f80304b.T(this.f80303a, str), i11);
    }

    @Override // p90.c
    public <T> T S(String str, Class<T> cls, r90.g... gVarArr) {
        return (T) this.f80304b.P(this.f80303a, str, cls, gVarArr);
    }

    @Override // p90.c
    public Long T(Enum<?> r82, String str, String... strArr) {
        return (Long) this.f80304b.H(this.f80303a, r82, Long.class, null, str, strArr);
    }

    @Override // p90.c
    public Map<Integer, Object> U(Map<Integer, Object> map, int... iArr) {
        int[] D0 = D0(iArr);
        for (int i11 = 0; i11 < D0.length; i11++) {
            map.put(Integer.valueOf(D0[i11]), this.f80304b.E(this.f80303a, D0[i11], null, null));
        }
        return map;
    }

    @Override // p90.c
    public Date V(String str, String str2, String... strArr) {
        return (Date) this.f80304b.J(this.f80303a, str, Date.class, null, str2, strArr);
    }

    @Override // p90.c
    public Byte W(String str, String str2, String... strArr) {
        return (Byte) this.f80304b.J(this.f80303a, str, Byte.class, null, str2, strArr);
    }

    @Override // p90.c
    public <T> T X(String str, Class<T> cls) {
        return (T) this.f80304b.I(this.f80303a, str, cls, null);
    }

    @Override // p90.c
    public BigInteger Y(String str, String str2, String... strArr) {
        return (BigInteger) this.f80304b.J(this.f80303a, str, BigInteger.class, null, str2, strArr);
    }

    @Override // p90.c
    public <T> T Z(Enum<?> r42, T t11) {
        return (T) this.f80304b.G(this.f80303a, r42, t11.getClass(), t11);
    }

    @Override // p90.c
    public Date a(int i11, String str, String... strArr) {
        return (Date) this.f80304b.F(this.f80303a, i11, Date.class, null, str, strArr);
    }

    @Override // p90.c
    public Long a0(int i11, String str, String... strArr) {
        return (Long) this.f80304b.F(this.f80303a, i11, Long.class, null, str, strArr);
    }

    @Override // p90.c
    public Map<Integer, String> b(Map<Integer, String> map, int... iArr) {
        int[] D0 = D0(iArr);
        for (int i11 = 0; i11 < D0.length; i11++) {
            map.put(Integer.valueOf(D0[i11]), getString(D0[i11]));
        }
        return map;
    }

    @Override // p90.c
    public BigInteger b0(int i11) {
        return (BigInteger) this.f80304b.E(this.f80303a, i11, BigInteger.class, null);
    }

    @Override // p90.c
    public Float c(int i11, String str, String... strArr) {
        return (Float) this.f80304b.F(this.f80303a, i11, Float.class, null, str, strArr);
    }

    @Override // p90.c
    public Calendar c0(int i11) {
        return (Calendar) this.f80304b.E(this.f80303a, i11, Calendar.class, null);
    }

    @Override // p90.c
    public <T> T d(int i11, Class<T> cls, r90.g... gVarArr) {
        return (T) this.f80304b.L(this.f80303a, i11, cls, gVarArr);
    }

    @Override // p90.c
    public <T> T d0(String str, T t11) {
        return (T) this.f80304b.I(this.f80303a, str, t11.getClass(), t11);
    }

    @Override // p90.c
    public Double e(Enum<?> r82, String str, String... strArr) {
        return (Double) this.f80304b.H(this.f80303a, r82, Double.class, null, str, strArr);
    }

    @Override // p90.c
    public <T> T e0(String str, T t11, r90.g... gVarArr) {
        return (T) this.f80304b.Q(this.f80303a, str, t11, gVarArr);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p90.c
    public BigInteger f(int i11, String str, String... strArr) {
        return (BigInteger) this.f80304b.F(this.f80303a, i11, BigInteger.class, null, str, strArr);
    }

    @Override // p90.c
    public BigDecimal f0(Enum<?> r82, String str, String... strArr) {
        return (BigDecimal) this.f80304b.H(this.f80303a, r82, BigDecimal.class, null, str, strArr);
    }

    @Override // p90.c
    public BigInteger g(Enum<?> r52) {
        return (BigInteger) this.f80304b.G(this.f80303a, r52, BigInteger.class, null);
    }

    @Override // p90.c
    public Boolean g0(String str, String str2, String str3) {
        return (Boolean) this.f80304b.J(this.f80303a, str, Boolean.class, Boolean.FALSE, str2, str3);
    }

    @Override // p90.c
    public BigDecimal getBigDecimal(String str) {
        return (BigDecimal) this.f80304b.I(this.f80303a, str, BigDecimal.class, null);
    }

    @Override // p90.c
    public Boolean getBoolean(String str) {
        return (Boolean) this.f80304b.I(this.f80303a, str, Boolean.class, null);
    }

    @Override // p90.c
    public Byte getByte(String str) {
        return (Byte) this.f80304b.I(this.f80303a, str, Byte.class, null);
    }

    @Override // p90.c
    public Date getDate(String str) {
        return (Date) this.f80304b.I(this.f80303a, str, Date.class, null);
    }

    @Override // p90.c
    public Double getDouble(String str) {
        return (Double) this.f80304b.I(this.f80303a, str, Double.class, null);
    }

    @Override // p90.c
    public Float getFloat(String str) {
        return (Float) this.f80304b.I(this.f80303a, str, Float.class, null);
    }

    @Override // p90.c
    public Integer getInt(String str) {
        return (Integer) this.f80304b.I(this.f80303a, str, Integer.class, null);
    }

    @Override // p90.c
    public Long getLong(String str) {
        return (Long) this.f80304b.I(this.f80303a, str, Long.class, null);
    }

    @Override // p90.c
    public f getMetaData() {
        return this.f80304b;
    }

    @Override // p90.c
    public Short getShort(String str) {
        return (Short) this.f80304b.I(this.f80303a, str, Short.class, null);
    }

    @Override // p90.c
    public String getString(String str) {
        return (String) this.f80304b.I(this.f80303a, str, String.class, null);
    }

    @Override // p90.c
    public String[] getValues() {
        return this.f80303a;
    }

    @Override // p90.c
    public Long h(String str, String str2, String... strArr) {
        return (Long) this.f80304b.J(this.f80303a, str, Long.class, null, str2, strArr);
    }

    @Override // p90.c
    public Short h0(Enum<?> r52) {
        return (Short) this.f80304b.G(this.f80303a, r52, Short.class, null);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f80303a);
    }

    @Override // p90.c
    public Map<Integer, Object> i(int... iArr) {
        return U(new HashMap(iArr.length), iArr);
    }

    @Override // p90.c
    public Calendar i0(String str, String str2, String... strArr) {
        return (Calendar) this.f80304b.J(this.f80303a, str, Calendar.class, null, str2, strArr);
    }

    @Override // p90.c
    public Byte j(Enum<?> r52) {
        return (Byte) this.f80304b.G(this.f80303a, r52, Byte.class, null);
    }

    @Override // p90.c
    public Map<String, String> j0(String... strArr) {
        return s0(new HashMap(strArr.length), strArr);
    }

    @Override // p90.c
    public Float k(Enum<?> r82, String str, String... strArr) {
        return (Float) this.f80304b.H(this.f80303a, r82, Float.class, null, str, strArr);
    }

    @Override // p90.c
    public String[] k0(String... strArr) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            strArr2[i11] = getString(strArr[i11]);
        }
        return strArr2;
    }

    @Override // p90.c
    public Date l(Enum<?> r52) {
        return (Date) this.f80304b.G(this.f80303a, r52, Date.class, null);
    }

    @Override // p90.c
    public Double l0(Enum<?> r52) {
        return (Double) this.f80304b.G(this.f80303a, r52, Double.class, null);
    }

    @Override // p90.c
    public Float m(Enum<?> r52) {
        return (Float) this.f80304b.G(this.f80303a, r52, Float.class, null);
    }

    @Override // p90.c
    public Integer m0(String str, String str2, String... strArr) {
        return (Integer) this.f80304b.J(this.f80303a, str, Integer.class, null, str2, strArr);
    }

    @Override // p90.c
    public Character n(String str) {
        return (Character) this.f80304b.I(this.f80303a, str, Character.class, null);
    }

    @Override // p90.c
    public Map<String, Object> n0(String... strArr) {
        return H(new HashMap(strArr.length), strArr);
    }

    @Override // p90.c
    public Calendar o(Enum<?> r82, String str, String... strArr) {
        return (Calendar) this.f80304b.H(this.f80303a, r82, Calendar.class, null, str, strArr);
    }

    @Override // p90.c
    public <T extends Enum<T>> Map<T, String> o0(Map<T, String> map, T... tArr) {
        for (T t11 : tArr) {
            map.put(t11, A0(t11));
        }
        return map;
    }

    @Override // p90.c
    public BigDecimal p(String str, String str2, String... strArr) {
        return (BigDecimal) this.f80304b.J(this.f80303a, str, BigDecimal.class, null, str2, strArr);
    }

    @Override // p90.c
    public Double p0(String str, String str2, String... strArr) {
        return (Double) this.f80304b.J(this.f80303a, str, Double.class, null, str2, strArr);
    }

    @Override // p90.c
    public Boolean q(Enum<?> r82, String str, String str2) {
        return (Boolean) this.f80304b.H(this.f80303a, r82, Boolean.class, Boolean.FALSE, str, str2);
    }

    @Override // p90.c
    public <T extends Enum<T>> Map<T, Object> q0(Class<T> cls, T... tArr) {
        return C(new EnumMap(cls), tArr);
    }

    @Override // p90.c
    public Map<Integer, String> r(int... iArr) {
        return b(new HashMap(iArr.length), iArr);
    }

    @Override // p90.c
    public Double r0(int i11, String str, String... strArr) {
        return (Double) this.f80304b.F(this.f80303a, i11, Double.class, null, str, strArr);
    }

    @Override // p90.c
    public Calendar s(Enum<?> r52) {
        return (Calendar) this.f80304b.G(this.f80303a, r52, Calendar.class, null);
    }

    @Override // p90.c
    public Map<String, String> s0(Map<String, String> map, String... strArr) {
        for (String str : F0(strArr)) {
            map.put(str, getString(str));
        }
        return map;
    }

    @Override // p90.c
    public Integer t(int i11, String str, String... strArr) {
        return (Integer) this.f80304b.F(this.f80303a, i11, Integer.class, null, str, strArr);
    }

    @Override // p90.c
    public Boolean t0(Enum<?> r52) {
        return (Boolean) this.f80304b.G(this.f80303a, r52, Boolean.class, null);
    }

    public String toString() {
        String[] strArr = this.f80303a;
        if (strArr == null) {
            return "null";
        }
        if (strArr.length == 0) {
            return okhttp3.i.f77289p;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f80303a.length; i11++) {
            if (sb2.length() != 0) {
                sb2.append(',');
                sb2.append(' ');
            }
            sb2.append(this.f80303a[i11]);
        }
        return sb2.toString();
    }

    @Override // p90.c
    public BigDecimal u(Enum<?> r52) {
        return (BigDecimal) this.f80304b.G(this.f80303a, r52, BigDecimal.class, null);
    }

    @Override // p90.c
    public String u0(Enum<?> r32, int i11) {
        return G0(this.f80304b.S(this.f80303a, r32), i11);
    }

    @Override // p90.c
    public Byte v(Enum<?> r82, String str, String... strArr) {
        return (Byte) this.f80304b.H(this.f80303a, r82, Byte.class, null, str, strArr);
    }

    @Override // p90.c
    public <T> T v0(Enum<?> r42, Class<T> cls) {
        return (T) this.f80304b.G(this.f80303a, r42, cls, null);
    }

    @Override // p90.c
    public Date w(Enum<?> r82, String str, String... strArr) {
        return (Date) this.f80304b.H(this.f80303a, r82, Date.class, null, str, strArr);
    }

    @Override // p90.c
    public Short w0(int i11, String str, String... strArr) {
        return (Short) this.f80304b.F(this.f80303a, i11, Short.class, null, str, strArr);
    }

    @Override // p90.c
    public Short x(String str, String str2, String... strArr) {
        return (Short) this.f80304b.J(this.f80303a, str, Short.class, null, str2, strArr);
    }

    @Override // p90.c
    public <T> T x0(int i11, T t11, r90.g... gVarArr) {
        return (T) this.f80304b.M(this.f80303a, i11, t11, gVarArr);
    }

    @Override // p90.c
    public Short y(Enum<?> r82, String str, String... strArr) {
        return (Short) this.f80304b.H(this.f80303a, r82, Short.class, null, str, strArr);
    }

    @Override // p90.c
    public <T> T y0(int i11, Class<T> cls) {
        return (T) this.f80304b.E(this.f80303a, i11, cls, null);
    }

    @Override // p90.c
    public <T> T z(int i11, T t11) {
        return (T) this.f80304b.E(this.f80303a, i11, t11.getClass(), t11);
    }

    @Override // p90.c
    public Calendar z0(int i11, String str, String... strArr) {
        return (Calendar) this.f80304b.F(this.f80303a, i11, Calendar.class, null, str, strArr);
    }

    @Override // p90.c
    public BigDecimal getBigDecimal(int i11) {
        return (BigDecimal) this.f80304b.E(this.f80303a, i11, BigDecimal.class, null);
    }

    @Override // p90.c
    public Boolean getBoolean(int i11) {
        return (Boolean) this.f80304b.E(this.f80303a, i11, Boolean.class, null);
    }

    @Override // p90.c
    public Byte getByte(int i11) {
        return (Byte) this.f80304b.E(this.f80303a, i11, Byte.class, null);
    }

    @Override // p90.c
    public Date getDate(int i11) {
        return (Date) this.f80304b.E(this.f80303a, i11, Date.class, null);
    }

    @Override // p90.c
    public Double getDouble(int i11) {
        return (Double) this.f80304b.E(this.f80303a, i11, Double.class, null);
    }

    @Override // p90.c
    public Float getFloat(int i11) {
        return (Float) this.f80304b.E(this.f80303a, i11, Float.class, null);
    }

    @Override // p90.c
    public Integer getInt(int i11) {
        return (Integer) this.f80304b.E(this.f80303a, i11, Integer.class, null);
    }

    @Override // p90.c
    public Long getLong(int i11) {
        return (Long) this.f80304b.E(this.f80303a, i11, Long.class, null);
    }

    @Override // p90.c
    public Short getShort(int i11) {
        return (Short) this.f80304b.E(this.f80303a, i11, Short.class, null);
    }

    @Override // p90.c
    public String getString(int i11) {
        return (String) this.f80304b.E(this.f80303a, i11, String.class, null);
    }

    @Override // p90.c
    public String getString(int i11, int i12) {
        return G0(this.f80304b.R(this.f80303a, i11), i12);
    }
}
