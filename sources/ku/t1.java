package ku;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class t1 implements ju.a, p0, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f68815b = false;
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final c f68816a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68817a;

        static {
            ChronoUnit[] values;
            ChronoUnit chronoUnit;
            int ordinal;
            ChronoUnit chronoUnit2;
            int ordinal2;
            ChronoUnit chronoUnit3;
            int ordinal3;
            ChronoUnit chronoUnit4;
            int ordinal4;
            values = ChronoUnit.values();
            int[] iArr = new int[values.length];
            f68817a = iArr;
            try {
                chronoUnit4 = ChronoUnit.DAYS;
                ordinal4 = chronoUnit4.ordinal();
                iArr[ordinal4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f68817a;
                chronoUnit3 = ChronoUnit.WEEKS;
                ordinal3 = chronoUnit3.ordinal();
                iArr2[ordinal3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f68817a;
                chronoUnit2 = ChronoUnit.MONTHS;
                ordinal2 = chronoUnit2.ordinal();
                iArr3[ordinal2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f68817a;
                chronoUnit = ChronoUnit.YEARS;
                ordinal = chronoUnit.ordinal();
                iArr4[ordinal] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        BYTES("", 1024, 0),
        KILOBYTES("kilo", 1000, 1),
        MEGABYTES("mega", 1000, 2),
        GIGABYTES("giga", 1000, 3),
        TERABYTES("tera", 1000, 4),
        PETABYTES("peta", 1000, 5),
        EXABYTES("exa", 1000, 6),
        ZETTABYTES("zetta", 1000, 7),
        YOTTABYTES("yotta", 1000, 8),
        KIBIBYTES("kibi", 1024, 1),
        MEBIBYTES("mebi", 1024, 2),
        GIBIBYTES("gibi", 1024, 3),
        TEBIBYTES("tebi", 1024, 4),
        PEBIBYTES("pebi", 1024, 5),
        EXBIBYTES("exbi", 1024, 6),
        ZEBIBYTES("zebi", 1024, 7),
        YOBIBYTES("yobi", 1024, 8);


        /* renamed from: v, reason: collision with root package name */
        public static Map<String, b> f68835v = a();

        /* renamed from: a, reason: collision with root package name */
        public final String f68837a;

        /* renamed from: b, reason: collision with root package name */
        public final int f68838b;

        /* renamed from: c, reason: collision with root package name */
        public final int f68839c;

        /* renamed from: d, reason: collision with root package name */
        public final BigInteger f68840d;

        b(String str, int i11, int i12) {
            this.f68837a = str;
            this.f68838b = i11;
            this.f68839c = i12;
            this.f68840d = BigInteger.valueOf(i11).pow(i12);
        }

        public static Map<String, b> a() {
            HashMap hashMap = new HashMap();
            for (b bVar : values()) {
                hashMap.put(bVar.f68837a + "byte", bVar);
                hashMap.put(bVar.f68837a + "bytes", bVar);
                if (bVar.f68837a.length() == 0) {
                    hashMap.put(yr.e.f100279a, bVar);
                    hashMap.put("B", bVar);
                    hashMap.put("", bVar);
                } else {
                    String substring = bVar.f68837a.substring(0, 1);
                    String upperCase = substring.toUpperCase();
                    int i11 = bVar.f68838b;
                    if (i11 == 1024) {
                        hashMap.put(substring, bVar);
                        hashMap.put(upperCase, bVar);
                        hashMap.put(upperCase + "i", bVar);
                        hashMap.put(upperCase + "iB", bVar);
                    } else {
                        if (i11 != 1000) {
                            throw new RuntimeException("broken MemoryUnit enum");
                        }
                        if (bVar.f68839c == 1) {
                            hashMap.put(substring + "B", bVar);
                        } else {
                            hashMap.put(upperCase + "B", bVar);
                        }
                    }
                }
            }
            return hashMap;
        }

        public static b b(String str) {
            return f68835v.get(str);
        }
    }

    public t1(c cVar) {
        this.f68816a = cVar;
    }

    public static void A(List<ConfigException.ValidationProblem> list, String str, s0 s0Var, ju.m mVar) {
        a0(list, s0Var, mVar, "No setting at '" + s0Var.k() + "', expecting: " + str);
    }

    public static d A0(c cVar, s0 s0Var, ConfigValueType configValueType, s0 s0Var2) {
        try {
            String b11 = s0Var.b();
            s0 j11 = s0Var.j();
            return j11 == null ? y0(cVar, b11, configValueType, s0Var2) : A0((c) w0(cVar, b11, ConfigValueType.OBJECT, s0Var2.n(0, s0Var2.e() - j11.e())), j11, configValueType, s0Var2);
        } catch (ConfigException.NotResolved e11) {
            throw p.v(s0Var, e11);
        }
    }

    public static void C0(Set<Map.Entry<String, ju.t>> set, s0 s0Var, c cVar) {
        for (Map.Entry<String, ju.t> entry : cVar.entrySet()) {
            String key = entry.getKey();
            ju.t value = entry.getValue();
            s0 f11 = s0.f(key);
            if (s0Var != null) {
                f11 = f11.i(s0Var);
            }
            if (value instanceof c) {
                C0(set, f11, (c) value);
            } else if (!(value instanceof f0)) {
                set.add(new AbstractMap.SimpleImmutableEntry(f11.k(), value));
            }
        }
    }

    public static String H0(ConfigValueType configValueType) {
        return configValueType.name().toLowerCase();
    }

    public static String I0(ju.t tVar) {
        if (!(tVar instanceof c)) {
            return H0(tVar.valueType());
        }
        c cVar = (c) tVar;
        if (cVar.isEmpty()) {
            return H0(tVar.valueType());
        }
        return "object with keys " + cVar.keySet();
    }

    public static String N0(String str) {
        int length = str.length() - 1;
        while (length >= 0 && Character.isLetter(str.charAt(length))) {
            length--;
        }
        return str.substring(length + 1);
    }

    public static boolean Q0(ConfigValueType configValueType, d dVar) {
        if (configValueType == ConfigValueType.NULL || t0(dVar)) {
            return true;
        }
        return configValueType == ConfigValueType.OBJECT ? dVar instanceof c : configValueType == ConfigValueType.LIST ? (dVar instanceof v1) || (dVar instanceof w1) : configValueType == ConfigValueType.STRING || (dVar instanceof j0) || configValueType == dVar.valueType();
    }

    public static boolean R0(ju.t tVar, d dVar) {
        if (t0((d) tVar)) {
            return true;
        }
        return Q0(tVar.valueType(), dVar);
    }

    public static BigInteger S0(String str, ju.m mVar, String str2) {
        String o11 = q.o(str);
        String N0 = N0(o11);
        String o12 = q.o(o11.substring(0, o11.length() - N0.length()));
        if (o12.length() == 0) {
            throw new ConfigException.BadValue(mVar, str2, "No number in size-in-bytes value '" + str + "'");
        }
        b b11 = b.b(N0);
        if (b11 == null) {
            throw new ConfigException.BadValue(mVar, str2, "Could not parse size-in-bytes unit '" + N0 + "' (try k, K, kB, KiB, kilobytes, kibibytes)");
        }
        try {
            return o12.matches("[0-9]+") ? b11.f68840d.multiply(new BigInteger(o12)) : new BigDecimal(b11.f68840d).multiply(new BigDecimal(o12)).toBigInteger();
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(mVar, str2, "Could not parse size-in-bytes number '" + o12 + "'");
        }
    }

    public static long T0(String str, ju.m mVar, String str2) {
        String str3;
        TimeUnit timeUnit;
        String o11 = q.o(str);
        String N0 = N0(o11);
        String o12 = q.o(o11.substring(0, o11.length() - N0.length()));
        if (o12.length() == 0) {
            throw new ConfigException.BadValue(mVar, str2, "No number in duration value '" + str + "'");
        }
        if (N0.length() <= 2 || N0.endsWith("s")) {
            str3 = N0;
        } else {
            str3 = N0 + "s";
        }
        if (str3.equals("") || str3.equals("ms") || str3.equals("millis") || str3.equals("milliseconds")) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (str3.equals("us") || str3.equals("micros") || str3.equals("microseconds")) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else if (str3.equals(NotificationStyle.NOTIFICATION_STYLE) || str3.equals("nanos") || str3.equals("nanoseconds")) {
            timeUnit = TimeUnit.NANOSECONDS;
        } else if (str3.equals("d") || str3.equals("days")) {
            timeUnit = TimeUnit.DAYS;
        } else if (str3.equals(CmcdData.STREAMING_FORMAT_HLS) || str3.equals("hours")) {
            timeUnit = TimeUnit.HOURS;
        } else if (str3.equals("s") || str3.equals("seconds")) {
            timeUnit = TimeUnit.SECONDS;
        } else {
            if (!str3.equals("m") && !str3.equals("minutes")) {
                throw new ConfigException.BadValue(mVar, str2, "Could not parse time unit '" + N0 + "' (try ns, us, ms, s, m, h, d)");
            }
            timeUnit = TimeUnit.MINUTES;
        }
        try {
            if (o12.matches("[+-]?[0-9]+")) {
                return timeUnit.toNanos(Long.parseLong(o12));
            }
            return (long) (Double.parseDouble(o12) * timeUnit.toNanos(1L));
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(mVar, str2, "Could not parse duration number '" + o12 + "'");
        }
    }

    public static Period U0(String str, ju.m mVar, String str2) {
        String str3;
        ChronoUnit chronoUnit;
        String o11 = q.o(str);
        String N0 = N0(o11);
        String o12 = q.o(o11.substring(0, o11.length() - N0.length()));
        if (o12.length() == 0) {
            throw new ConfigException.BadValue(mVar, str2, "No number in period value '" + str + "'");
        }
        if (N0.length() <= 2 || N0.endsWith("s")) {
            str3 = N0;
        } else {
            str3 = N0 + "s";
        }
        if (str3.equals("") || str3.equals("d") || str3.equals("days")) {
            chronoUnit = ChronoUnit.DAYS;
        } else if (str3.equals("w") || str3.equals("weeks")) {
            chronoUnit = ChronoUnit.WEEKS;
        } else if (str3.equals("m") || str3.equals("mo") || str3.equals("months")) {
            chronoUnit = ChronoUnit.MONTHS;
        } else {
            if (!str3.equals("y") && !str3.equals("years")) {
                throw new ConfigException.BadValue(mVar, str2, "Could not parse time unit '" + N0 + "' (try d, w, mo, y)");
            }
            chronoUnit = ChronoUnit.YEARS;
        }
        try {
            return W0(Integer.parseInt(o12), chronoUnit);
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(mVar, str2, "Could not parse duration number '" + o12 + "'");
        }
    }

    private d V0(s0 s0Var) {
        return root().e1(s0Var);
    }

    public static Period W0(int i11, ChronoUnit chronoUnit) {
        boolean isTimeBased;
        int ordinal;
        Period ofDays;
        Period ofWeeks;
        Period ofMonths;
        Period ofYears;
        isTimeBased = chronoUnit.isTimeBased();
        if (isTimeBased) {
            g1.a();
            throw f1.a(chronoUnit + " cannot be converted to a java.time.Period");
        }
        int[] iArr = a.f68817a;
        ordinal = chronoUnit.ordinal();
        int i12 = iArr[ordinal];
        if (i12 == 1) {
            ofDays = Period.ofDays(i11);
            return ofDays;
        }
        if (i12 == 2) {
            ofWeeks = Period.ofWeeks(i11);
            return ofWeeks;
        }
        if (i12 == 3) {
            ofMonths = Period.ofMonths(i11);
            return ofMonths;
        }
        if (i12 == 4) {
            ofYears = Period.ofYears(i11);
            return ofYears;
        }
        g1.a();
        throw f1.a(chronoUnit + " cannot be converted to a java.time.Period");
    }

    public static void Z(List<ConfigException.ValidationProblem> list, ju.t tVar, s0 s0Var, ju.m mVar) {
        A(list, I0(tVar), s0Var, mVar);
    }

    public static void a0(List<ConfigException.ValidationProblem> list, s0 s0Var, ju.m mVar, String str) {
        list.add(new ConfigException.ValidationProblem(s0Var.k(), mVar, str));
    }

    public static void c0(List<ConfigException.ValidationProblem> list, ConfigValueType configValueType, d dVar, s0 s0Var) {
        h0(list, H0(configValueType), dVar, s0Var);
    }

    public static d c1(d dVar, ConfigValueType configValueType, s0 s0Var) {
        if (dVar.valueType() == ConfigValueType.NULL) {
            throw new ConfigException.Null(dVar.g(), s0Var.k(), configValueType != null ? configValueType.name() : null);
        }
        return dVar;
    }

    public static void h0(List<ConfigException.ValidationProblem> list, String str, d dVar, s0 s0Var) {
        a0(list, s0Var, dVar.g(), "Wrong value type at '" + s0Var.k() + "', expecting: " + str + " but got: " + I0(dVar));
    }

    public static /* synthetic */ Long i(t1 t1Var, ju.t tVar, String str, BigInteger bigInteger) {
        t1Var.getClass();
        return t1Var.e1(bigInteger, tVar.g(), str);
    }

    public static void j0(List<ConfigException.ValidationProblem> list, ju.t tVar, d dVar, s0 s0Var) {
        h0(list, I0(tVar), dVar, s0Var);
    }

    public static void n0(s0 s0Var, v1 v1Var, v1 v1Var2, List<ConfigException.ValidationProblem> list) {
        if (v1Var.isEmpty() || v1Var2.isEmpty()) {
            return;
        }
        d dVar = v1Var.get(0);
        Iterator<ju.t> it = v1Var2.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (!R0(dVar, dVar2)) {
                a0(list, s0Var, dVar2.g(), "List at '" + s0Var.k() + "' contains wrong value type, expecting list of " + I0(dVar) + " but got element of type " + I0(dVar2));
                return;
            }
        }
    }

    public static void p0(s0 s0Var, ConfigValueType configValueType, d dVar, List<ConfigException.ValidationProblem> list) {
        if (!Q0(configValueType, dVar)) {
            c0(list, configValueType, dVar, s0Var);
            return;
        }
        ConfigValueType configValueType2 = ConfigValueType.LIST;
        if (configValueType == configValueType2 && (dVar instanceof w1) && !(l0.a(dVar, configValueType2) instanceof v1)) {
            c0(list, configValueType, dVar, s0Var);
        }
    }

    public static void q(List<ConfigException.ValidationProblem> list, ConfigValueType configValueType, s0 s0Var, ju.m mVar) {
        A(list, H0(configValueType), s0Var, mVar);
    }

    public static void q0(s0 s0Var, ju.t tVar, d dVar, List<ConfigException.ValidationProblem> list) {
        if (!R0(tVar, dVar)) {
            j0(list, tVar, dVar, s0Var);
            return;
        }
        if ((tVar instanceof c) && (dVar instanceof c)) {
            r0(s0Var, (c) tVar, (c) dVar, list);
            return;
        }
        boolean z11 = tVar instanceof v1;
        if (z11 && (dVar instanceof v1)) {
            n0(s0Var, (v1) tVar, (v1) dVar, list);
            return;
        }
        if (z11 && (dVar instanceof w1)) {
            v1 v1Var = (v1) tVar;
            d a11 = l0.a(dVar, ConfigValueType.LIST);
            if (a11 instanceof v1) {
                n0(s0Var, v1Var, (v1) a11, list);
            } else {
                j0(list, tVar, dVar, s0Var);
            }
        }
    }

    public static void r0(s0 s0Var, c cVar, c cVar2, List<ConfigException.ValidationProblem> list) {
        for (Map.Entry<String, ju.t> entry : cVar.entrySet()) {
            String key = entry.getKey();
            s0 i11 = s0Var != null ? s0.f(key).i(s0Var) : s0.f(key);
            d dVar = cVar2.get(key);
            if (dVar == null) {
                Z(list, entry.getValue(), i11, cVar2.g());
            } else {
                q0(i11, entry.getValue(), dVar, list);
            }
        }
    }

    public static boolean t0(d dVar) {
        ConfigValueType configValueType = ConfigValueType.NULL;
        return l0.a(dVar, configValueType).valueType() == configValueType;
    }

    public static d w0(c cVar, String str, ConfigValueType configValueType, s0 s0Var) {
        return c1(y0(cVar, str, configValueType, s0Var), configValueType, s0Var);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new c1(this);
    }

    public static d y0(c cVar, String str, ConfigValueType configValueType, s0 s0Var) {
        d c12 = cVar.c1(str, s0Var);
        if (c12 == null) {
            throw new ConfigException.Missing(cVar.g(), s0Var.k());
        }
        if (configValueType != null) {
            c12 = l0.a(c12, configValueType);
        }
        if (configValueType == null || c12.valueType() == configValueType || c12.valueType() == ConfigValueType.NULL) {
            return c12;
        }
        throw new ConfigException.WrongType(c12.g(), s0Var.k(), configValueType.name(), c12.valueType().name());
    }

    public final d B0(s0 s0Var, ConfigValueType configValueType, s0 s0Var2) {
        return A0(this.f68816a, s0Var, configValueType, s0Var2);
    }

    @Override // ju.a
    public List<Duration> D(String str) {
        Duration ofNanos;
        List<Long> x11 = x(str, TimeUnit.NANOSECONDS);
        ArrayList arrayList = new ArrayList(x11.size());
        Iterator<Long> it = x11.iterator();
        while (it.hasNext()) {
            ofNanos = Duration.ofNanos(it.next().longValue());
            arrayList.add(ofNanos);
        }
        return arrayList;
    }

    public final BigInteger D0(String str) {
        BigInteger S0;
        d u02 = u0(str, ConfigValueType.STRING);
        try {
            S0 = BigInteger.valueOf(getLong(str));
        } catch (ConfigException.WrongType unused) {
            S0 = S0((String) u02.c(), u02.g(), str);
        }
        if (S0.signum() >= 0) {
            return S0;
        }
        throw new ConfigException.BadValue(u02.g(), str, "Attempt to construct memory size with negative number: " + S0);
    }

    public final List<BigInteger> E0(String str) {
        BigInteger S0;
        ArrayList arrayList = new ArrayList();
        for (ju.t tVar : w(str)) {
            if (tVar.valueType() == ConfigValueType.NUMBER) {
                S0 = BigInteger.valueOf(((Number) tVar.c()).longValue());
            } else {
                if (tVar.valueType() != ConfigValueType.STRING) {
                    throw new ConfigException.WrongType(tVar.g(), str, "memory size string or number of bytes", tVar.valueType().name());
                }
                S0 = S0((String) tVar.c(), tVar.g(), str);
            }
            if (S0.signum() < 0) {
                throw new ConfigException.BadValue(tVar.g(), str, "Attempt to construct ConfigMemorySize with negative number: " + S0);
            }
            arrayList.add(S0);
        }
        return arrayList;
    }

    @Override // ju.a
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public t1 O(String str) {
        return getObject(str).f0();
    }

    @Override // ju.a
    public boolean G() {
        return root().N0() == b1.RESOLVED;
    }

    public final g0 G0(String str) {
        return (g0) u0(str, ConfigValueType.NUMBER);
    }

    @Override // ju.a
    public Period H(String str) {
        d u02 = u0(str, ConfigValueType.STRING);
        return U0((String) u02.c(), u02.g(), str);
    }

    @Override // ju.a
    @Deprecated
    public List<Long> I(String str) {
        return x(str, TimeUnit.MILLISECONDS);
    }

    @Override // ju.a
    public List<Boolean> J(String str) {
        return K0(str, ConfigValueType.BOOLEAN);
    }

    public final <T extends Enum<T>> T J0(String str, Class<T> cls, ju.t tVar) {
        String str2 = (String) tVar.c();
        try {
            return (T) Enum.valueOf(cls, str2);
        } catch (IllegalArgumentException unused) {
            ArrayList arrayList = new ArrayList();
            T[] enumConstants = cls.getEnumConstants();
            if (enumConstants != null) {
                for (T t11 : enumConstants) {
                    arrayList.add(t11.name());
                }
            }
            throw new ConfigException.BadValue(tVar.g(), str, String.format("The enum class %s has no constant of the name '%s' (should be one of %s.)", cls.getSimpleName(), str2, arrayList));
        }
    }

    @Override // ju.a
    public List<Long> K(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<Number> it = Y(str).iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().longValue()));
        }
        return arrayList;
    }

    public final <T> List<T> K0(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : w(str)) {
            if (configValueType != null) {
                dVar = l0.a(dVar, configValueType);
            }
            if (dVar.valueType() != configValueType) {
                throw new ConfigException.WrongType(dVar.g(), str, "list of " + configValueType.name(), "list of " + dVar.valueType().name());
            }
            arrayList.add(dVar.c());
        }
        return arrayList;
    }

    @Override // ju.a
    public <T extends Enum<T>> List<T> L(Class<T> cls, String str) {
        List L0 = L0(str, ConfigValueType.STRING);
        ArrayList arrayList = new ArrayList();
        Iterator it = L0.iterator();
        while (it.hasNext()) {
            arrayList.add(J0(str, cls, (j0) it.next()));
        }
        return arrayList;
    }

    public final <T extends ju.t> List<T> L0(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : w(str)) {
            if (configValueType != null) {
                dVar = l0.a(dVar, configValueType);
            }
            if (dVar.valueType() != configValueType) {
                throw new ConfigException.WrongType(dVar.g(), str, "list of " + configValueType.name(), "list of " + dVar.valueType().name());
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    @Override // ju.a
    public Object M(String str) {
        return u0(str, null).c();
    }

    @Override // ju.a
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public c getObject(String str) {
        return (c) u0(str, ConfigValueType.OBJECT);
    }

    @Override // ju.a
    public long N(String str, TimeUnit timeUnit) {
        d u02 = u0(str, ConfigValueType.STRING);
        return timeUnit.convert(T0((String) u02.c(), u02.g(), str), TimeUnit.NANOSECONDS);
    }

    @Override // ju.a
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public d getValue(String str) {
        return u0(str, null);
    }

    @Override // ju.a
    @Deprecated
    public List<Long> P(String str) {
        return x(str, TimeUnit.NANOSECONDS);
    }

    public final ju.t P0(String str) {
        s0 g11 = s0.g(str);
        try {
            return this.f68816a.e1(g11);
        } catch (ConfigException.NotResolved e11) {
            throw p.v(g11, e11);
        }
    }

    @Override // ju.a
    public List<Integer> R(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = L0(str, ConfigValueType.NUMBER).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((g0) ((d) it.next())).V0(str)));
        }
        return arrayList;
    }

    @Override // ju.a
    public boolean U(String str) {
        return z0(str, null).valueType() == ConfigValueType.NULL;
    }

    @Override // ju.a
    @Deprecated
    public Long V(String str) {
        return Long.valueOf(N(str, TimeUnit.MILLISECONDS));
    }

    @Override // ju.a
    public Duration W(String str) {
        Duration ofNanos;
        d u02 = u0(str, ConfigValueType.STRING);
        ofNanos = Duration.ofNanos(T0((String) u02.c(), u02.g(), str));
        return ofNanos;
    }

    @Override // ju.a
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public t1 l() {
        return X(com.typesafe.config.b.b());
    }

    @Override // ju.a
    public List<Number> Y(String str) {
        return K0(str, ConfigValueType.NUMBER);
    }

    @Override // ju.a
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public t1 X(com.typesafe.config.b bVar) {
        return F(this, bVar);
    }

    @Override // ju.a
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public t1 S(ju.a aVar) {
        return F(aVar, com.typesafe.config.b.b());
    }

    @Override // ju.a
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public t1 F(ju.a aVar, com.typesafe.config.b bVar) {
        d k11 = x0.k(this.f68816a, ((t1) aVar).f68816a, bVar);
        return k11 == this.f68816a ? this : new t1((c) k11);
    }

    @Override // ju.a
    public List<ju.l> b0(String str) {
        return L0(str, ConfigValueType.OBJECT);
    }

    @Override // ju.a
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public c root() {
        return this.f68816a;
    }

    @Override // ju.a
    @Deprecated
    public Long d0(String str) {
        return Long.valueOf(N(str, TimeUnit.NANOSECONDS));
    }

    @Override // ku.p0
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public c Q() {
        return this.f68816a;
    }

    public final Long e1(BigInteger bigInteger, ju.m mVar, String str) {
        if (bigInteger.bitLength() < 64) {
            return Long.valueOf(bigInteger.longValue());
        }
        throw new ConfigException.BadValue(mVar, str, "size-in-bytes value is out of range for a 64-bit long: '" + bigInteger + "'");
    }

    @Override // ju.a
    public Set<Map.Entry<String, ju.t>> entrySet() {
        HashSet hashSet = new HashSet();
        C0(hashSet, null, this.f68816a);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            return this.f68816a.equals(((t1) obj).f68816a);
        }
        return false;
    }

    @Override // ju.a, ju.k
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public t1 a(ju.k kVar) {
        return this.f68816a.R0(kVar).f0();
    }

    @Override // ju.a
    public ju.m g() {
        return this.f68816a.g();
    }

    @Override // ju.a
    public boolean g0(String str) {
        return P0(str) != null;
    }

    @Override // ju.a
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public t1 T(String str) {
        return new t1(root().n1(s0.g(str)));
    }

    @Override // ju.a
    public boolean getBoolean(String str) {
        return ((Boolean) u0(str, ConfigValueType.BOOLEAN).c()).booleanValue();
    }

    @Override // ju.a
    public Long getBytes(String str) {
        return e1(D0(str), u0(str, ConfigValueType.STRING).g(), str);
    }

    @Override // ju.a
    public double getDouble(String str) {
        return p(str).doubleValue();
    }

    @Override // ju.a
    public int getInt(String str) {
        return G0(str).V0(str);
    }

    @Override // ju.a
    public long getLong(String str) {
        return p(str).longValue();
    }

    @Override // ju.a
    public String getString(String str) {
        return (String) u0(str, ConfigValueType.STRING).c();
    }

    @Override // ju.a
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public t1 f(String str, ju.t tVar) {
        return new t1(root().r1(s0.g(str), tVar));
    }

    public final int hashCode() {
        return this.f68816a.hashCode() * 41;
    }

    @Override // ju.a
    public TemporalAmount i0(String str) {
        try {
            return W(str);
        } catch (ConfigException.BadValue unused) {
            return H(str);
        }
    }

    @Override // ju.a
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public t1 h(String str) {
        return new t1(root().t1(s0.g(str)));
    }

    @Override // ju.a
    public boolean isEmpty() {
        return this.f68816a.isEmpty();
    }

    @Override // ju.a
    public ju.a j(String str) {
        return root().j(str);
    }

    @Override // ju.a
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public t1 k(String str) {
        return root().k(str);
    }

    public t1 l0(ju.m mVar, String str) {
        return root().l0(mVar, str);
    }

    @Override // ju.a
    public boolean m(String str) {
        ju.t P0 = P0(str);
        return (P0 == null || P0.valueType() == ConfigValueType.NULL) ? false : true;
    }

    @Override // ju.a
    public List<Double> n(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<Number> it = Y(str).iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(it.next().doubleValue()));
        }
        return arrayList;
    }

    @Override // ju.a
    public List<Long> o(final String str) {
        final d u02 = u0(str, ConfigValueType.LIST);
        return (List) E0(str).stream().map(new Function() { // from class: ku.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return t1.i(t1.this, u02, str, (BigInteger) obj);
            }
        }).collect(Collectors.toList());
    }

    @Override // ju.a
    public Number p(String str) {
        return G0(str).c();
    }

    @Override // ju.a
    public List<? extends Object> r(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<ju.t> it = w(str).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }

    @Override // ju.a
    public List<String> s(String str) {
        return K0(str, ConfigValueType.STRING);
    }

    @Override // ju.a
    public ju.j t(String str) {
        return ju.j.b(D0(str));
    }

    public String toString() {
        return "Config(" + this.f68816a.toString() + pn.j.f81007d;
    }

    @Override // ju.a
    public List<ju.j> u(String str) {
        return (List) E0(str).stream().map(new Function() { // from class: ku.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ju.j.b((BigInteger) obj);
            }
        }).collect(Collectors.toList());
    }

    public d u0(String str, ConfigValueType configValueType) {
        s0 g11 = s0.g(str);
        return v0(g11, configValueType, g11);
    }

    @Override // ju.a
    public <T extends Enum<T>> T v(Class<T> cls, String str) {
        return (T) J0(str, cls, u0(str, ConfigValueType.STRING));
    }

    public d v0(s0 s0Var, ConfigValueType configValueType, s0 s0Var2) {
        return c1(A0(this.f68816a, s0Var, configValueType, s0Var2), configValueType, s0Var2);
    }

    @Override // ju.a
    public ju.h w(String str) {
        return (ju.h) u0(str, ConfigValueType.LIST);
    }

    @Override // ju.a
    public List<Long> x(String str, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList();
        for (ju.t tVar : w(str)) {
            if (tVar.valueType() == ConfigValueType.NUMBER) {
                arrayList.add(Long.valueOf(timeUnit.convert(((Number) tVar.c()).longValue(), TimeUnit.MILLISECONDS)));
            } else {
                if (tVar.valueType() != ConfigValueType.STRING) {
                    throw new ConfigException.WrongType(tVar.g(), str, "duration string or number of milliseconds", tVar.valueType().name());
                }
                arrayList.add(Long.valueOf(timeUnit.convert(T0((String) tVar.c(), tVar.g(), str), TimeUnit.NANOSECONDS)));
            }
        }
        return arrayList;
    }

    @Override // ju.a
    public List<? extends ju.a> y(String str) {
        List<ju.l> b02 = b0(str);
        ArrayList arrayList = new ArrayList();
        Iterator<ju.l> it = b02.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f0());
        }
        return arrayList;
    }

    @Override // ju.a
    public void z(ju.a aVar, String... strArr) {
        t1 t1Var = (t1) aVar;
        b1 N0 = t1Var.root().N0();
        b1 b1Var = b1.RESOLVED;
        if (N0 != b1Var) {
            throw new ConfigException.BugOrBroken("do not call checkValid() with an unresolved reference config, call Config#resolve(), see Config#resolve() API docs");
        }
        if (root().N0() != b1Var) {
            throw new ConfigException.NotResolved("need to Config#resolve() each config before using it, see the API docs for Config#resolve()");
        }
        ArrayList arrayList = new ArrayList();
        if (strArr.length == 0) {
            r0(null, t1Var.root(), root(), arrayList);
        } else {
            for (String str : strArr) {
                s0 g11 = s0.g(str);
                d V0 = t1Var.V0(g11);
                if (V0 != null) {
                    d V02 = V0(g11);
                    if (V02 != null) {
                        q0(g11, V0, V02, arrayList);
                    } else {
                        Z(arrayList, V0, g11, g());
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            throw new ConfigException.ValidationFailed(arrayList);
        }
    }

    public final d z0(String str, ConfigValueType configValueType) {
        s0 g11 = s0.g(str);
        return B0(g11, configValueType, g11);
    }
}
