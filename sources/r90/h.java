package r90;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.EnumSelector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f83854a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final r f83855b = new r();

    /* renamed from: c, reason: collision with root package name */
    public static final z f83856c = new z();

    /* renamed from: d, reason: collision with root package name */
    public static final y f83857d = new y();

    public static e A(String... strArr) {
        return new e(Locale.getDefault(), strArr);
    }

    public static f B() {
        return new f();
    }

    public static f C(Character ch2) {
        return new f(ch2, null);
    }

    public static f D(Character ch2, String str) {
        return new f(ch2, str);
    }

    public static i E(Date date, String str, String... strArr) {
        return new i(Locale.getDefault(), date, str, strArr);
    }

    public static i F(Date date, String... strArr) {
        return new i(Locale.getDefault(), date, null, strArr);
    }

    public static i G(Locale locale, Date date, String str, String... strArr) {
        return new i(locale, date, str, strArr);
    }

    public static i H(Locale locale, Date date, String... strArr) {
        return new i(locale, date, null, strArr);
    }

    public static i I(Locale locale, String... strArr) {
        return new i(locale, strArr);
    }

    public static i J(TimeZone timeZone, Locale locale, Date date, String str, String... strArr) {
        return new i(timeZone, locale, date, str, strArr);
    }

    public static i K(String... strArr) {
        return new i(Locale.getDefault(), strArr);
    }

    public static j L() {
        return new j();
    }

    public static <T extends Enum<T>> k<T> M(Class<T> cls) {
        return new k<>(cls);
    }

    public static <T extends Enum<T>> k<T> N(Class<T> cls, T t11, String str, String str2, EnumSelector... enumSelectorArr) {
        return new k<>(cls, t11, str, str2, enumSelectorArr);
    }

    public static <T extends Enum<T>> k<T> O(Class<T> cls, String str, EnumSelector... enumSelectorArr) {
        return N(cls, null, null, str, new EnumSelector[0]);
    }

    public static <T extends Enum<T>> k<T> P(Class<T> cls, EnumSelector... enumSelectorArr) {
        return N(cls, null, null, null, enumSelectorArr);
    }

    public static l Q() {
        return new l();
    }

    public static o R(String str) {
        return U(str, null, null);
    }

    public static o S(String str, String str2) {
        return U(str, null, str2);
    }

    public static o T(String str, Locale locale) {
        return U(str, locale, null);
    }

    public static o U(String str, Locale locale, String str2) {
        return new o(str, locale, str2);
    }

    public static p V() {
        return new p();
    }

    public static q W() {
        return new q();
    }

    public static r X() {
        return f83855b;
    }

    public static t Y(String... strArr) {
        return new t(strArr);
    }

    public static x Z() {
        return new x();
    }

    public static m a(BigDecimal bigDecimal, String str, String... strArr) {
        return new m(bigDecimal, str, strArr);
    }

    public static a0 a0() {
        return f83854a;
    }

    public static m b(BigDecimal bigDecimal, String... strArr) {
        return new m(bigDecimal, null, strArr);
    }

    public static z b0() {
        return f83856c;
    }

    public static m c(String... strArr) {
        return new m(strArr);
    }

    public static z c0(int i11) {
        return new z(i11);
    }

    public static <T extends Number> u<T> d(Class<T> cls, String... strArr) {
        return new b(strArr);
    }

    public static b0 d0(boolean z11, boolean z12) {
        return new b0(z11, z12, null, null, null);
    }

    public static u<Number> e(String... strArr) {
        return new a(strArr);
    }

    public static b0 e0(boolean z11, boolean z12, String str) {
        return new b0(z11, z12, null, null, str);
    }

    public static b0 f(String... strArr) {
        return new b0(false, false, null, strArr, null);
    }

    public static b0 f0(boolean z11, boolean z12, String[] strArr, String[] strArr2) {
        return new b0(z11, z12, strArr, strArr2, null);
    }

    public static b0 g() {
        return f0(false, false, null, null);
    }

    public static b0 g0(boolean z11, boolean z12, String[] strArr, String[] strArr2, String str) {
        return new b0(z11, z12, strArr, strArr2, str);
    }

    public static b0 h(String str) {
        return g0(false, false, null, null, str);
    }

    public static b0 i() {
        return f0(false, true, null, null);
    }

    public static b0 j(String... strArr) {
        return new b0(false, false, strArr, null, null);
    }

    public static w k(String str, String str2) {
        return new w(str, str2);
    }

    public static y l() {
        return f83857d;
    }

    public static r90.a m() {
        return new r90.a();
    }

    public static r90.b n() {
        return new r90.b();
    }

    public static c o() {
        return r(n6.m.f74525c, "false");
    }

    public static c p(Boolean bool, String str, String str2, String str3) {
        return new c(bool, str, new String[]{str2}, new String[]{str3});
    }

    public static c q(Boolean bool, String str, String[] strArr, String[] strArr2) {
        return new c(bool, str, strArr, strArr2);
    }

    public static c r(String str, String str2) {
        return new c(new String[]{str}, new String[]{str2});
    }

    public static c s(String[] strArr, String[] strArr2) {
        return new c(strArr, strArr2);
    }

    public static d t() {
        return new d();
    }

    public static e u(Calendar calendar, String str, String... strArr) {
        return new e(Locale.getDefault(), calendar, str, strArr);
    }

    public static e v(Calendar calendar, String... strArr) {
        return new e(Locale.getDefault(), calendar, null, strArr);
    }

    public static e w(Locale locale, Calendar calendar, String str, String... strArr) {
        return new e(TimeZone.getDefault(), locale, calendar, str, strArr);
    }

    public static e x(Locale locale, Calendar calendar, String... strArr) {
        return new e(locale, calendar, null, strArr);
    }

    public static e y(Locale locale, String... strArr) {
        return new e(locale, strArr);
    }

    public static e z(TimeZone timeZone, Locale locale, Calendar calendar, String str, String... strArr) {
        return new e(timeZone, locale, calendar, str, strArr);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends u<Number> {
        public a(String... strArr) {
            super(strArr);
        }

        @Override // r90.u
        public void t(DecimalFormat decimalFormat) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> extends u<T> {
        public b(String... strArr) {
            super(strArr);
        }

        @Override // r90.u
        public void t(DecimalFormat decimalFormat) {
        }
    }
}
