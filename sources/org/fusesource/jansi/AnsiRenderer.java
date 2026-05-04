package org.fusesource.jansi;

import java.io.IOException;
import java.util.Locale;
import org.fusesource.jansi.Ansi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class AnsiRenderer {

    /* renamed from: a, reason: collision with root package name */
    public static final String f77785a = "@|";

    /* renamed from: b, reason: collision with root package name */
    public static final String f77786b = "|@";

    /* renamed from: c, reason: collision with root package name */
    public static final String f77787c = " ";

    /* renamed from: d, reason: collision with root package name */
    public static final String f77788d = ",";

    /* renamed from: e, reason: collision with root package name */
    public static final int f77789e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f77790f = 2;

    public static Appendable a(String str, Appendable appendable) throws IOException {
        int i11 = 0;
        while (true) {
            int indexOf = str.indexOf(f77785a, i11);
            if (indexOf == -1) {
                if (i11 == 0) {
                    appendable.append(str);
                    return appendable;
                }
                appendable.append(str.substring(i11));
                return appendable;
            }
            appendable.append(str.substring(i11, indexOf));
            int indexOf2 = str.indexOf(f77786b, indexOf);
            if (indexOf2 == -1) {
                appendable.append(str);
                return appendable;
            }
            int i12 = indexOf + 2;
            if (indexOf2 < i12) {
                throw new IllegalArgumentException("Invalid input string found.");
            }
            String[] split = str.substring(i12, indexOf2).split(" ", 2);
            if (split.length == 1) {
                appendable.append(str);
                return appendable;
            }
            appendable.append(c(split[1], split[0].split(",")));
            i11 = indexOf2 + 2;
        }
    }

    public static String b(String str) throws IllegalArgumentException {
        try {
            return a(str, new StringBuilder()).toString();
        } catch (IOException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static String c(String str, String... strArr) {
        return d(Ansi.q(), strArr).k(str).K0().toString();
    }

    public static Ansi d(Ansi ansi, String... strArr) {
        for (String str : strArr) {
            Code valueOf = Code.valueOf(str.toUpperCase(Locale.ENGLISH));
            if (valueOf.isColor()) {
                if (valueOf.isBackground()) {
                    ansi.B(valueOf.getColor());
                } else {
                    ansi.j0(valueOf.getColor());
                }
            } else if (valueOf.isAttribute()) {
                ansi.m(valueOf.getAttribute());
            }
        }
        return ansi;
    }

    public static String e(String str) {
        return f(str.split("\\s"));
    }

    public static String f(String... strArr) {
        return d(Ansi.q(), strArr).toString();
    }

    public static boolean g(String str) {
        return str != null && str.contains(f77785a);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BLACK' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Code {
        private static final /* synthetic */ Code[] $VALUES;
        public static final Code BG_BLACK;
        public static final Code BG_BLUE;
        public static final Code BG_CYAN;
        public static final Code BG_DEFAULT;
        public static final Code BG_GREEN;
        public static final Code BG_MAGENTA;
        public static final Code BG_RED;
        public static final Code BG_WHITE;
        public static final Code BG_YELLOW;
        public static final Code BLACK;
        public static final Code BLINK_FAST;
        public static final Code BLINK_OFF;
        public static final Code BLINK_SLOW;
        public static final Code BLUE;
        public static final Code BOLD;
        public static final Code CONCEAL_OFF;
        public static final Code CONCEAL_ON;
        public static final Code CYAN;
        public static final Code DEFAULT;
        public static final Code FAINT;
        public static final Code FG_BLACK;
        public static final Code FG_BLUE;
        public static final Code FG_CYAN;
        public static final Code FG_DEFAULT;
        public static final Code FG_GREEN;
        public static final Code FG_MAGENTA;
        public static final Code FG_RED;
        public static final Code FG_WHITE;
        public static final Code FG_YELLOW;
        public static final Code GREEN;
        public static final Code INTENSITY_BOLD;
        public static final Code INTENSITY_FAINT;
        public static final Code ITALIC;
        public static final Code MAGENTA;
        public static final Code NEGATIVE_OFF;
        public static final Code NEGATIVE_ON;
        public static final Code RED;
        public static final Code RESET;
        public static final Code UNDERLINE;
        public static final Code UNDERLINE_DOUBLE;
        public static final Code UNDERLINE_OFF;
        public static final Code WHITE;
        public static final Code YELLOW;
        private final boolean background;

        /* renamed from: n, reason: collision with root package name */
        private final Enum<?> f77791n;

        static {
            Ansi.Color color = Ansi.Color.BLACK;
            Code code = new Code("BLACK", 0, color);
            BLACK = code;
            Ansi.Color color2 = Ansi.Color.RED;
            Code code2 = new Code("RED", 1, color2);
            RED = code2;
            Ansi.Color color3 = Ansi.Color.GREEN;
            Code code3 = new Code("GREEN", 2, color3);
            GREEN = code3;
            Ansi.Color color4 = Ansi.Color.YELLOW;
            Code code4 = new Code("YELLOW", 3, color4);
            YELLOW = code4;
            Ansi.Color color5 = Ansi.Color.BLUE;
            Code code5 = new Code("BLUE", 4, color5);
            BLUE = code5;
            Ansi.Color color6 = Ansi.Color.MAGENTA;
            Code code6 = new Code("MAGENTA", 5, color6);
            MAGENTA = code6;
            Ansi.Color color7 = Ansi.Color.CYAN;
            Code code7 = new Code("CYAN", 6, color7);
            CYAN = code7;
            Ansi.Color color8 = Ansi.Color.WHITE;
            Code code8 = new Code("WHITE", 7, color8);
            WHITE = code8;
            Ansi.Color color9 = Ansi.Color.DEFAULT;
            Code code9 = new Code("DEFAULT", 8, color9);
            DEFAULT = code9;
            Code code10 = new Code("FG_BLACK", 9, color, false);
            FG_BLACK = code10;
            Code code11 = new Code("FG_RED", 10, color2, false);
            FG_RED = code11;
            Code code12 = new Code("FG_GREEN", 11, color3, false);
            FG_GREEN = code12;
            Code code13 = new Code("FG_YELLOW", 12, color4, false);
            FG_YELLOW = code13;
            Code code14 = new Code("FG_BLUE", 13, color5, false);
            FG_BLUE = code14;
            Code code15 = new Code("FG_MAGENTA", 14, color6, false);
            FG_MAGENTA = code15;
            Code code16 = new Code("FG_CYAN", 15, color7, false);
            FG_CYAN = code16;
            Code code17 = new Code("FG_WHITE", 16, color8, false);
            FG_WHITE = code17;
            Code code18 = new Code("FG_DEFAULT", 17, color9, false);
            FG_DEFAULT = code18;
            Code code19 = new Code("BG_BLACK", 18, color, true);
            BG_BLACK = code19;
            Code code20 = new Code("BG_RED", 19, color2, true);
            BG_RED = code20;
            Code code21 = new Code("BG_GREEN", 20, color3, true);
            BG_GREEN = code21;
            Code code22 = new Code("BG_YELLOW", 21, color4, true);
            BG_YELLOW = code22;
            Code code23 = new Code("BG_BLUE", 22, color5, true);
            BG_BLUE = code23;
            Code code24 = new Code("BG_MAGENTA", 23, color6, true);
            BG_MAGENTA = code24;
            Code code25 = new Code("BG_CYAN", 24, color7, true);
            BG_CYAN = code25;
            Code code26 = new Code("BG_WHITE", 25, color8, true);
            BG_WHITE = code26;
            Code code27 = new Code("BG_DEFAULT", 26, color9, true);
            BG_DEFAULT = code27;
            Code code28 = new Code("RESET", 27, Ansi.Attribute.RESET);
            RESET = code28;
            Ansi.Attribute attribute = Ansi.Attribute.INTENSITY_BOLD;
            Code code29 = new Code("INTENSITY_BOLD", 28, attribute);
            INTENSITY_BOLD = code29;
            Ansi.Attribute attribute2 = Ansi.Attribute.INTENSITY_FAINT;
            Code code30 = new Code("INTENSITY_FAINT", 29, attribute2);
            INTENSITY_FAINT = code30;
            Code code31 = new Code("ITALIC", 30, Ansi.Attribute.ITALIC);
            ITALIC = code31;
            Code code32 = new Code("UNDERLINE", 31, Ansi.Attribute.UNDERLINE);
            UNDERLINE = code32;
            Code code33 = new Code("BLINK_SLOW", 32, Ansi.Attribute.BLINK_SLOW);
            BLINK_SLOW = code33;
            Code code34 = new Code("BLINK_FAST", 33, Ansi.Attribute.BLINK_FAST);
            BLINK_FAST = code34;
            Code code35 = new Code("BLINK_OFF", 34, Ansi.Attribute.BLINK_OFF);
            BLINK_OFF = code35;
            Code code36 = new Code("NEGATIVE_ON", 35, Ansi.Attribute.NEGATIVE_ON);
            NEGATIVE_ON = code36;
            Code code37 = new Code("NEGATIVE_OFF", 36, Ansi.Attribute.NEGATIVE_OFF);
            NEGATIVE_OFF = code37;
            Code code38 = new Code("CONCEAL_ON", 37, Ansi.Attribute.CONCEAL_ON);
            CONCEAL_ON = code38;
            Code code39 = new Code("CONCEAL_OFF", 38, Ansi.Attribute.CONCEAL_OFF);
            CONCEAL_OFF = code39;
            Code code40 = new Code("UNDERLINE_DOUBLE", 39, Ansi.Attribute.UNDERLINE_DOUBLE);
            UNDERLINE_DOUBLE = code40;
            Code code41 = new Code("UNDERLINE_OFF", 40, Ansi.Attribute.UNDERLINE_OFF);
            UNDERLINE_OFF = code41;
            Code code42 = new Code("BOLD", 41, attribute);
            BOLD = code42;
            Code code43 = new Code("FAINT", 42, attribute2);
            FAINT = code43;
            $VALUES = new Code[]{code, code2, code3, code4, code5, code6, code7, code8, code9, code10, code11, code12, code13, code14, code15, code16, code17, code18, code19, code20, code21, code22, code23, code24, code25, code26, code27, code28, code29, code30, code31, code32, code33, code34, code35, code36, code37, code38, code39, code40, code41, code42, code43};
        }

        private Code(String str, int i11, Enum r32, boolean z11) {
            this.f77791n = r32;
            this.background = z11;
        }

        public static Code valueOf(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        public static Code[] values() {
            return (Code[]) $VALUES.clone();
        }

        public Ansi.Attribute getAttribute() {
            return (Ansi.Attribute) this.f77791n;
        }

        public Ansi.Color getColor() {
            return (Ansi.Color) this.f77791n;
        }

        public boolean isAttribute() {
            return this.f77791n instanceof Ansi.Attribute;
        }

        public boolean isBackground() {
            return this.background;
        }

        public boolean isColor() {
            return this.f77791n instanceof Ansi.Color;
        }

        private Code(String str, int i11, Enum r42) {
            this(str, i11, r42, false);
        }
    }
}
