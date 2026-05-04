package org.fusesource.jansi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.fusesource.jansi.Ansi;
import r60.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Ansi implements Appendable {

    /* renamed from: c, reason: collision with root package name */
    public static final char f77778c = 27;

    /* renamed from: d, reason: collision with root package name */
    public static final char f77779d = '[';

    /* renamed from: e, reason: collision with root package name */
    public static final String f77780e = Ansi.class.getName() + ".disable";

    /* renamed from: f, reason: collision with root package name */
    public static Callable<Boolean> f77781f = new Callable() { // from class: f80.a
        @Override // java.util.concurrent.Callable
        public final Object call() {
            Boolean valueOf;
            valueOf = Boolean.valueOf(!Boolean.getBoolean(Ansi.f77780e));
            return valueOf;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final InheritableThreadLocal<Boolean> f77782g = new a();

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f77783a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<Integer> f77784b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Attribute {
        RESET(0, "RESET"),
        INTENSITY_BOLD(1, "INTENSITY_BOLD"),
        INTENSITY_FAINT(2, "INTENSITY_FAINT"),
        ITALIC(3, "ITALIC_ON"),
        UNDERLINE(4, "UNDERLINE_ON"),
        BLINK_SLOW(5, "BLINK_SLOW"),
        BLINK_FAST(6, "BLINK_FAST"),
        NEGATIVE_ON(7, "NEGATIVE_ON"),
        CONCEAL_ON(8, "CONCEAL_ON"),
        STRIKETHROUGH_ON(9, "STRIKETHROUGH_ON"),
        UNDERLINE_DOUBLE(21, "UNDERLINE_DOUBLE"),
        INTENSITY_BOLD_OFF(22, "INTENSITY_BOLD_OFF"),
        ITALIC_OFF(23, "ITALIC_OFF"),
        UNDERLINE_OFF(24, "UNDERLINE_OFF"),
        BLINK_OFF(25, "BLINK_OFF"),
        NEGATIVE_OFF(27, "NEGATIVE_OFF"),
        CONCEAL_OFF(28, "CONCEAL_OFF"),
        STRIKETHROUGH_OFF(29, "STRIKETHROUGH_OFF");

        private final String name;
        private final int value;

        Attribute(int i11, String str) {
            this.value = i11;
            this.name = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        public int value() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Color {
        BLACK(0, "BLACK"),
        RED(1, "RED"),
        GREEN(2, "GREEN"),
        YELLOW(3, "YELLOW"),
        BLUE(4, "BLUE"),
        MAGENTA(5, "MAGENTA"),
        CYAN(6, "CYAN"),
        WHITE(7, "WHITE"),
        DEFAULT(9, "DEFAULT");

        private final String name;
        private final int value;

        Color(int i11, String str) {
            this.value = i11;
            this.name = str;
        }

        public int bg() {
            return this.value + 40;
        }

        public int bgBright() {
            return this.value + 100;
        }

        public int fg() {
            return this.value + 30;
        }

        public int fgBright() {
            return this.value + 90;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        public int value() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Erase {
        FORWARD(0, "FORWARD"),
        BACKWARD(1, "BACKWARD"),
        ALL(2, f.f83306f);

        private final String name;
        private final int value;

        Erase(int i11, String str) {
            this.value = i11;
            this.name = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        public int value() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends InheritableThreadLocal<Boolean> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean initialValue() {
            return Boolean.valueOf(Ansi.F0());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface b {
        void a(Ansi ansi);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends Ansi {
        public c() {
        }

        @Override // org.fusesource.jansi.Ansi, java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(char c11) throws IOException {
            return super.append(c11);
        }

        public c(int i11) {
            super(i11);
        }

        @Override // org.fusesource.jansi.Ansi, java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
            return super.append(charSequence);
        }

        public c(StringBuilder sb2) {
            super(sb2);
        }

        @Override // org.fusesource.jansi.Ansi, java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
            return super.append(charSequence, i11, i12);
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi K0() {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        @Deprecated
        public Ansi L0() {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi M0() {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi P0() {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi V() {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi c0() {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi e0() {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi g0() {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi A(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi B(Color color) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi C(Color color) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi S0(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi T0(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi U(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi W(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi X(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi Z(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi a0(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi b0(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi d0(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi f0(Erase erase) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi h0(Erase erase) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi i0(int i11) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi j0(Color color) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi m(Attribute attribute) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi m0(Color color) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi T(int i11, int i12) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi B0(int i11, int i12, int i13) {
            return this;
        }

        @Override // org.fusesource.jansi.Ansi
        public Ansi P(int i11, int i12, int i13) {
            return this;
        }
    }

    public Ansi() {
        this(new StringBuilder(80));
    }

    public static boolean F0() {
        try {
            return f77781f.call().booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean G0() {
        return f77782g.get().booleanValue();
    }

    public static void U0(Callable<Boolean> callable) {
        if (callable == null) {
            throw new IllegalArgumentException();
        }
        f77781f = callable;
    }

    public static void V0(boolean z11) {
        f77782g.set(Boolean.valueOf(z11));
    }

    public static Ansi q() {
        return G0() ? new Ansi() : new c();
    }

    public static Ansi r(int i11) {
        return G0() ? new Ansi(i11) : new c(i11);
    }

    public static Ansi s(StringBuilder sb2) {
        return G0() ? new Ansi(sb2) : new c(sb2);
    }

    public Ansi A(int i11) {
        this.f77784b.add(48);
        this.f77784b.add(5);
        this.f77784b.add(Integer.valueOf(i11 & 255));
        return this;
    }

    public Ansi A0(int i11) {
        return B0(i11 >> 16, i11 >> 8, i11);
    }

    public Ansi B(Color color) {
        this.f77784b.add(Integer.valueOf(color.bg()));
        return this;
    }

    public Ansi B0(int i11, int i12, int i13) {
        this.f77784b.add(38);
        this.f77784b.add(2);
        this.f77784b.add(Integer.valueOf(i11 & 255));
        this.f77784b.add(Integer.valueOf(i12 & 255));
        this.f77784b.add(Integer.valueOf(i13 & 255));
        return this;
    }

    public Ansi C(Color color) {
        this.f77784b.add(Integer.valueOf(color.bgBright()));
        return this;
    }

    public Ansi C0() {
        return j0(Color.YELLOW);
    }

    public Ansi D() {
        return C(Color.CYAN);
    }

    public final void D0() {
        if (this.f77784b.isEmpty()) {
            return;
        }
        if (this.f77784b.size() == 1 && this.f77784b.get(0).intValue() == 0) {
            this.f77783a.append(f77778c);
            this.f77783a.append('[');
            this.f77783a.append(io.ktor.util.date.b.f61998d);
        } else {
            b(io.ktor.util.date.b.f61998d, this.f77784b.toArray());
        }
        this.f77784b.clear();
    }

    public Ansi E() {
        return C(Color.DEFAULT);
    }

    public Ansi E0(String str, Object... objArr) {
        D0();
        this.f77783a.append(String.format(str, objArr));
        return this;
    }

    public Ansi F() {
        return C(Color.GREEN);
    }

    public Ansi G() {
        return C(Color.MAGENTA);
    }

    public Ansi H() {
        return C(Color.RED);
    }

    public Ansi H0() {
        D0();
        this.f77783a.append(System.getProperty("line.separator"));
        return this;
    }

    public Ansi I() {
        return C(Color.YELLOW);
    }

    public Ansi I0(String str) {
        k(AnsiRenderer.b(str));
        return this;
    }

    public Ansi J() {
        return B(Color.CYAN);
    }

    public Ansi J0(String str, Object... objArr) {
        k(String.format(AnsiRenderer.b(str), objArr));
        return this;
    }

    public Ansi K() {
        return B(Color.DEFAULT);
    }

    public Ansi K0() {
        return m(Attribute.RESET);
    }

    public Ansi L() {
        return B(Color.GREEN);
    }

    @Deprecated
    public Ansi L0() {
        return M0();
    }

    public Ansi M() {
        return B(Color.MAGENTA);
    }

    public Ansi M0() {
        O0();
        return N0();
    }

    public Ansi N() {
        return B(Color.RED);
    }

    public Ansi N0() {
        this.f77783a.append(f77778c);
        this.f77783a.append('8');
        return this;
    }

    public Ansi O(int i11) {
        return P(i11 >> 16, i11 >> 8, i11);
    }

    public Ansi O0() {
        return w(l50.b.f69934p);
    }

    public Ansi P(int i11, int i12, int i13) {
        this.f77784b.add(48);
        this.f77784b.add(2);
        this.f77784b.add(Integer.valueOf(i11 & 255));
        this.f77784b.add(Integer.valueOf(i12 & 255));
        this.f77784b.add(Integer.valueOf(i13 & 255));
        return this;
    }

    public Ansi P0() {
        R0();
        return Q0();
    }

    public Ansi Q() {
        return B(Color.YELLOW);
    }

    public Ansi Q0() {
        this.f77783a.append(f77778c);
        this.f77783a.append('7');
        return this;
    }

    public Ansi R() {
        return m(Attribute.INTENSITY_BOLD);
    }

    public Ansi R0() {
        return w(io.ktor.util.date.b.f61997c);
    }

    public Ansi S() {
        return m(Attribute.INTENSITY_BOLD_OFF);
    }

    public Ansi S0(int i11) {
        return i11 == Integer.MIN_VALUE ? T0(Integer.MAX_VALUE) : i11 > 0 ? x('T', i11) : i11 < 0 ? T0(-i11) : this;
    }

    public Ansi T(int i11, int i12) {
        return y('H', Integer.valueOf(Math.max(1, i11)), Integer.valueOf(Math.max(1, i12)));
    }

    public Ansi T0(int i11) {
        return i11 == Integer.MIN_VALUE ? S0(Integer.MAX_VALUE) : i11 > 0 ? x('S', i11) : i11 < 0 ? S0(-i11) : this;
    }

    public Ansi U(int i11) {
        return i11 > 0 ? x('B', i11) : i11 < 0 ? b0(-i11) : this;
    }

    public Ansi V() {
        return w('E');
    }

    public Ansi W(int i11) {
        return i11 < 0 ? d0(-i11) : x('E', i11);
    }

    public Ansi X(int i11) {
        return i11 > 0 ? x('D', i11) : i11 < 0 ? Z(-i11) : this;
    }

    public Ansi Y(int i11, int i12) {
        return Z(i11).U(i12);
    }

    public Ansi Z(int i11) {
        return i11 > 0 ? x('C', i11) : i11 < 0 ? X(-i11) : this;
    }

    public Ansi a0(int i11) {
        return x('G', Math.max(1, i11));
    }

    public final Ansi b(char c11, Object... objArr) {
        this.f77783a.append(f77778c);
        this.f77783a.append('[');
        int length = objArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                this.f77783a.append(l70.f.f70689d);
            }
            Object obj = objArr[i11];
            if (obj != null) {
                this.f77783a.append(obj);
            }
        }
        this.f77783a.append(c11);
        return this;
    }

    public Ansi b0(int i11) {
        return i11 > 0 ? x('A', i11) : i11 < 0 ? U(-i11) : this;
    }

    public Ansi c(char c11) {
        D0();
        this.f77783a.append(c11);
        return this;
    }

    public Ansi c0() {
        return w('F');
    }

    public Ansi d(double d11) {
        D0();
        this.f77783a.append(d11);
        return this;
    }

    public Ansi d0(int i11) {
        return i11 < 0 ? W(-i11) : x('F', i11);
    }

    public Ansi e(float f11) {
        D0();
        this.f77783a.append(f11);
        return this;
    }

    public Ansi e0() {
        return w('K');
    }

    public Ansi f(int i11) {
        D0();
        this.f77783a.append(i11);
        return this;
    }

    public Ansi f0(Erase erase) {
        return x('K', erase.value());
    }

    public Ansi g(long j11) {
        D0();
        this.f77783a.append(j11);
        return this;
    }

    public Ansi g0() {
        return x('J', Erase.ALL.value());
    }

    public Ansi h(CharSequence charSequence) {
        D0();
        this.f77783a.append(charSequence);
        return this;
    }

    public Ansi h0(Erase erase) {
        return x('J', erase.value());
    }

    public Ansi i(CharSequence charSequence, int i11, int i12) {
        D0();
        this.f77783a.append(charSequence, i11, i12);
        return this;
    }

    public Ansi i0(int i11) {
        this.f77784b.add(38);
        this.f77784b.add(5);
        this.f77784b.add(Integer.valueOf(i11 & 255));
        return this;
    }

    public Ansi j(Object obj) {
        D0();
        this.f77783a.append(obj);
        return this;
    }

    public Ansi j0(Color color) {
        this.f77784b.add(Integer.valueOf(color.fg()));
        return this;
    }

    public Ansi k(String str) {
        D0();
        this.f77783a.append(str);
        return this;
    }

    public Ansi k0() {
        return j0(Color.BLACK);
    }

    public Ansi l(StringBuffer stringBuffer) {
        D0();
        this.f77783a.append(stringBuffer);
        return this;
    }

    public Ansi l0() {
        return j0(Color.BLUE);
    }

    public Ansi m(Attribute attribute) {
        this.f77784b.add(Integer.valueOf(attribute.value()));
        return this;
    }

    public Ansi m0(Color color) {
        this.f77784b.add(Integer.valueOf(color.fgBright()));
        return this;
    }

    public Ansi n(boolean z11) {
        D0();
        this.f77783a.append(z11);
        return this;
    }

    public Ansi n0() {
        return m0(Color.BLACK);
    }

    public Ansi o(char[] cArr) {
        D0();
        this.f77783a.append(cArr);
        return this;
    }

    public Ansi o0() {
        return m0(Color.BLUE);
    }

    public Ansi p(char[] cArr, int i11, int i12) {
        D0();
        this.f77783a.append(cArr, i11, i12);
        return this;
    }

    public Ansi p0() {
        return m0(Color.CYAN);
    }

    public Ansi q0() {
        return m0(Color.DEFAULT);
    }

    public Ansi r0() {
        return m0(Color.GREEN);
    }

    public Ansi s0() {
        return m0(Color.MAGENTA);
    }

    @Override // java.lang.Appendable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Ansi append(char c11) {
        this.f77783a.append(c11);
        return this;
    }

    public Ansi t0() {
        return m0(Color.RED);
    }

    public String toString() {
        D0();
        return this.f77783a.toString();
    }

    @Override // java.lang.Appendable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Ansi append(CharSequence charSequence) {
        this.f77783a.append(charSequence);
        return this;
    }

    public Ansi u0() {
        return m0(Color.YELLOW);
    }

    @Override // java.lang.Appendable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Ansi append(CharSequence charSequence, int i11, int i12) {
        this.f77783a.append(charSequence, i11, i12);
        return this;
    }

    public Ansi v0() {
        return j0(Color.CYAN);
    }

    public final Ansi w(char c11) {
        D0();
        this.f77783a.append(f77778c);
        this.f77783a.append('[');
        this.f77783a.append(c11);
        return this;
    }

    public Ansi w0() {
        return j0(Color.DEFAULT);
    }

    public final Ansi x(char c11, int i11) {
        D0();
        this.f77783a.append(f77778c);
        this.f77783a.append('[');
        this.f77783a.append(i11);
        this.f77783a.append(c11);
        return this;
    }

    public Ansi x0() {
        return j0(Color.GREEN);
    }

    public final Ansi y(char c11, Object... objArr) {
        D0();
        return b(c11, objArr);
    }

    public Ansi y0() {
        return j0(Color.MAGENTA);
    }

    public Ansi z(b bVar) {
        bVar.a(this);
        return this;
    }

    public Ansi z0() {
        return j0(Color.RED);
    }

    public Ansi(Ansi ansi) {
        this(new StringBuilder(ansi.f77783a));
        this.f77784b.addAll(ansi.f77784b);
    }

    public Ansi(int i11) {
        this(new StringBuilder(i11));
    }

    public Ansi(StringBuilder sb2) {
        this.f77784b = new ArrayList<>(5);
        this.f77783a = sb2;
    }
}
