package ju;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface a extends k {
    List<Duration> D(String str);

    a F(a aVar, com.typesafe.config.b bVar);

    boolean G();

    Period H(String str);

    @Deprecated
    List<Long> I(String str);

    List<Boolean> J(String str);

    List<Long> K(String str);

    <T extends Enum<T>> List<T> L(Class<T> cls, String str);

    Object M(String str);

    long N(String str, TimeUnit timeUnit);

    a O(String str);

    @Deprecated
    List<Long> P(String str);

    List<Integer> R(String str);

    a S(a aVar);

    a T(String str);

    boolean U(String str);

    @Deprecated
    Long V(String str);

    Duration W(String str);

    a X(com.typesafe.config.b bVar);

    List<Number> Y(String str);

    @Override // ju.k
    a a(k kVar);

    List<? extends l> b0(String str);

    @Deprecated
    Long d0(String str);

    Set<Map.Entry<String, t>> entrySet();

    a f(String str, t tVar);

    m g();

    boolean g0(String str);

    boolean getBoolean(String str);

    Long getBytes(String str);

    double getDouble(String str);

    int getInt(String str);

    long getLong(String str);

    l getObject(String str);

    String getString(String str);

    t getValue(String str);

    a h(String str);

    TemporalAmount i0(String str);

    boolean isEmpty();

    a j(String str);

    a k(String str);

    a l();

    boolean m(String str);

    List<Double> n(String str);

    List<Long> o(String str);

    Number p(String str);

    List<? extends Object> r(String str);

    l root();

    List<String> s(String str);

    j t(String str);

    List<j> u(String str);

    <T extends Enum<T>> T v(Class<T> cls, String str);

    h w(String str);

    List<Long> x(String str, TimeUnit timeUnit);

    List<? extends a> y(String str);

    void z(a aVar, String... strArr);
}
