package ho;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ho.j
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class d implements i0<Character> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f59562a = 65536;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends x {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f59563c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f59564d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final d this$0, d original, final String val$description) {
            super(original);
            this.f59563c = val$description;
            this.f59564d = this$0;
        }

        @Override // ho.d.w, ho.d
        public String toString() {
            return this.f59563c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a0 extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f59565b;

        /* renamed from: c, reason: collision with root package name */
        public final char[] f59566c;

        /* renamed from: d, reason: collision with root package name */
        public final char[] f59567d;

        public a0(String description, char[] rangeStarts, char[] rangeEnds) {
            this.f59565b = description;
            this.f59566c = rangeStarts;
            this.f59567d = rangeEnds;
            Preconditions.checkArgument(rangeStarts.length == rangeEnds.length);
            int i11 = 0;
            while (i11 < rangeStarts.length) {
                Preconditions.checkArgument(rangeStarts[i11] <= rangeEnds[i11]);
                int i12 = i11 + 1;
                if (i12 < rangeStarts.length) {
                    Preconditions.checkArgument(rangeEnds[i11] < rangeStarts[i12]);
                }
                i11 = i12;
            }
        }

        @Override // ho.d
        public boolean B(char c11) {
            int binarySearch = Arrays.binarySearch(this.f59566c, c11);
            if (binarySearch >= 0) {
                return true;
            }
            int i11 = (~binarySearch) - 1;
            return i11 >= 0 && c11 <= this.f59567d[i11];
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return this.f59565b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends d {

        /* renamed from: b, reason: collision with root package name */
        public final d f59568b;

        /* renamed from: c, reason: collision with root package name */
        public final d f59569c;

        public b(d a11, d b11) {
            this.f59568b = (d) Preconditions.checkNotNull(a11);
            this.f59569c = (d) Preconditions.checkNotNull(b11);
        }

        @Override // ho.d
        public boolean B(char c11) {
            return this.f59568b.B(c11) && this.f59569c.B(c11);
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            BitSet bitSet = new BitSet();
            this.f59568b.Q(bitSet);
            BitSet bitSet2 = new BitSet();
            this.f59569c.Q(bitSet2);
            bitSet.and(bitSet2);
            table.or(bitSet);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.and(" + this.f59568b + j2.O + this.f59569c + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b0 extends a0 {

        /* renamed from: e, reason: collision with root package name */
        public static final d f59570e = new b0();

        public b0() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺\ufdff\ufeffￜ".toCharArray());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends v {

        /* renamed from: c, reason: collision with root package name */
        public static final d f59571c = new c();

        public c() {
            super("CharMatcher.any()");
        }

        @Override // ho.d
        public int A(CharSequence sequence) {
            return sequence.length() - 1;
        }

        @Override // ho.d
        public boolean B(char c11) {
            return true;
        }

        @Override // ho.d
        public boolean C(CharSequence sequence) {
            Preconditions.checkNotNull(sequence);
            return true;
        }

        @Override // ho.d
        public boolean E(CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // ho.d.i, ho.d
        public d F() {
            return d.G();
        }

        @Override // ho.d
        public d I(d other) {
            Preconditions.checkNotNull(other);
            return this;
        }

        @Override // ho.d
        public String M(CharSequence sequence) {
            Preconditions.checkNotNull(sequence);
            return "";
        }

        @Override // ho.d
        public String N(CharSequence sequence, char replacement) {
            char[] cArr = new char[sequence.length()];
            Arrays.fill(cArr, replacement);
            return new String(cArr);
        }

        @Override // ho.d
        public String O(CharSequence sequence, CharSequence replacement) {
            StringBuilder sb2 = new StringBuilder(sequence.length() * replacement.length());
            for (int i11 = 0; i11 < sequence.length(); i11++) {
                sb2.append(replacement);
            }
            return sb2.toString();
        }

        @Override // ho.d
        public String U(CharSequence sequence) {
            Preconditions.checkNotNull(sequence);
            return "";
        }

        @Override // ho.d
        public d b(d other) {
            return (d) Preconditions.checkNotNull(other);
        }

        @Override // ho.d
        public String h(CharSequence sequence, char replacement) {
            return sequence.length() == 0 ? "" : String.valueOf(replacement);
        }

        @Override // ho.d
        public int i(CharSequence sequence) {
            return sequence.length();
        }

        @Override // ho.d
        public int n(CharSequence sequence) {
            return sequence.length() == 0 ? -1 : 0;
        }

        @Override // ho.d
        public int o(CharSequence sequence, int start) {
            int length = sequence.length();
            Preconditions.checkPositionIndex(start, length);
            if (start == length) {
                return -1;
            }
            return start;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static final class c0 extends v {

        /* renamed from: c, reason: collision with root package name */
        public static final String f59572c = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";

        /* renamed from: d, reason: collision with root package name */
        public static final int f59573d = 1682554634;

        /* renamed from: e, reason: collision with root package name */
        public static final int f59574e = Integer.numberOfLeadingZeros(31);

        /* renamed from: f, reason: collision with root package name */
        public static final d f59575f = new c0();

        public c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // ho.d
        public boolean B(char c11) {
            return f59572c.charAt((f59573d * c11) >>> f59574e) == c11;
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            for (int i11 = 0; i11 < 32; i11++) {
                table.set(f59572c.charAt(i11));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ho.d$d, reason: collision with other inner class name */
    public static final class C0677d extends d {

        /* renamed from: b, reason: collision with root package name */
        public final char[] f59576b;

        public C0677d(CharSequence chars) {
            char[] charArray = chars.toString().toCharArray();
            this.f59576b = charArray;
            Arrays.sort(charArray);
        }

        @Override // ho.d
        public boolean B(char c11) {
            return Arrays.binarySearch(this.f59576b, c11) >= 0;
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            for (char c11 : this.f59576b) {
                table.set(c11);
            }
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c11 : this.f59576b) {
                sb2.append(d.R(c11));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends v {

        /* renamed from: c, reason: collision with root package name */
        public static final d f59577c = new e();

        public e() {
            super("CharMatcher.ascii()");
        }

        @Override // ho.d
        public boolean B(char c11) {
            return c11 <= 127;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static final class f extends v {

        /* renamed from: c, reason: collision with root package name */
        public final BitSet f59578c;

        public /* synthetic */ f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }

        @Override // ho.d
        public boolean B(char c11) {
            return this.f59578c.get(c11);
        }

        @Override // ho.d
        public void Q(BitSet bitSet) {
            bitSet.or(this.f59578c);
        }

        public f(BitSet table, String description) {
            super(description);
            this.f59578c = table.length() + 64 < table.size() ? (BitSet) table.clone() : table;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f59579b = new g();

        @Override // ho.d
        public boolean B(char c11) {
            if (c11 != ' ' && c11 != 133 && c11 != 5760) {
                if (c11 != 8199) {
                    if (c11 != 8287 && c11 != 12288 && c11 != 8232 && c11 != 8233) {
                        switch (c11) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c11 >= 8192 && c11 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends a0 {

        /* renamed from: e, reason: collision with root package name */
        public static final String f59580e = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        /* renamed from: f, reason: collision with root package name */
        public static final d f59581f = new h();

        public h() {
            super("CharMatcher.digit()", Z(), Y());
        }

        public static char[] Y() {
            char[] cArr = new char[37];
            for (int i11 = 0; i11 < 37; i11++) {
                cArr[i11] = (char) (f59580e.charAt(i11) + '\t');
            }
            return cArr;
        }

        public static char[] Z() {
            return f59580e.toCharArray();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends d {

        /* renamed from: b, reason: collision with root package name */
        public final i0<? super Character> f59582b;

        public j(i0<? super Character> predicate) {
            this.f59582b = (i0) Preconditions.checkNotNull(predicate);
        }

        @Override // ho.d
        public boolean B(char c11) {
            return this.f59582b.apply(Character.valueOf(c11));
        }

        @Override // ho.d, ho.i0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean apply(Character character) {
            return this.f59582b.apply(Preconditions.checkNotNull(character));
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f59582b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends i {

        /* renamed from: b, reason: collision with root package name */
        public final char f59583b;

        /* renamed from: c, reason: collision with root package name */
        public final char f59584c;

        public k(char startInclusive, char endInclusive) {
            Preconditions.checkArgument(endInclusive >= startInclusive);
            this.f59583b = startInclusive;
            this.f59584c = endInclusive;
        }

        @Override // ho.d
        public boolean B(char c11) {
            return this.f59583b <= c11 && c11 <= this.f59584c;
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            table.set(this.f59583b, this.f59584c + 1);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.inRange('" + d.R(this.f59583b) + "', '" + d.R(this.f59584c) + "')";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends a0 {

        /* renamed from: e, reason: collision with root package name */
        public static final String f59585e = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        /* renamed from: f, reason: collision with root package name */
        public static final String f59586f = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";

        /* renamed from: g, reason: collision with root package name */
        public static final d f59587g = new l();

        public l() {
            super("CharMatcher.invisible()", f59585e.toCharArray(), f59586f.toCharArray());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends i {

        /* renamed from: b, reason: collision with root package name */
        public final char f59588b;

        public m(char match) {
            this.f59588b = match;
        }

        @Override // ho.d
        public boolean B(char c11) {
            return c11 == this.f59588b;
        }

        @Override // ho.d.i, ho.d
        public d F() {
            return d.s(this.f59588b);
        }

        @Override // ho.d
        public d I(d other) {
            return other.B(this.f59588b) ? other : super.I(other);
        }

        @Override // ho.d
        public String N(CharSequence sequence, char replacement) {
            return sequence.toString().replace(this.f59588b, replacement);
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            table.set(this.f59588b);
        }

        @Override // ho.d
        public d b(d other) {
            return other.B(this.f59588b) ? this : d.G();
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.is('" + d.R(this.f59588b) + "')";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends i {

        /* renamed from: b, reason: collision with root package name */
        public final char f59589b;

        /* renamed from: c, reason: collision with root package name */
        public final char f59590c;

        public n(char match1, char match2) {
            this.f59589b = match1;
            this.f59590c = match2;
        }

        @Override // ho.d
        public boolean B(char c11) {
            return c11 == this.f59589b || c11 == this.f59590c;
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            table.set(this.f59589b);
            table.set(this.f59590c);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.anyOf(\"" + d.R(this.f59589b) + d.R(this.f59590c) + "\")";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o extends i {

        /* renamed from: b, reason: collision with root package name */
        public final char f59591b;

        public o(char match) {
            this.f59591b = match;
        }

        @Override // ho.d
        public boolean B(char c11) {
            return c11 != this.f59591b;
        }

        @Override // ho.d.i, ho.d
        public d F() {
            return d.q(this.f59591b);
        }

        @Override // ho.d
        public d I(d other) {
            return other.B(this.f59591b) ? d.c() : this;
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            table.set(0, this.f59591b);
            table.set(this.f59591b + 1, 65536);
        }

        @Override // ho.d
        public d b(d other) {
            return other.B(this.f59591b) ? super.b(other) : other;
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.isNot('" + d.R(this.f59591b) + "')";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f59592b = new p();

        @Override // ho.d
        public boolean B(char c11) {
            return Character.isDigit(c11);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q extends v {

        /* renamed from: c, reason: collision with root package name */
        public static final d f59593c = new q();

        public q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // ho.d
        public boolean B(char c11) {
            if (c11 > 31) {
                return c11 >= 127 && c11 <= 159;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f59594b = new r();

        @Override // ho.d
        public boolean B(char c11) {
            return Character.isLetter(c11);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f59595b = new s();

        @Override // ho.d
        public boolean B(char c11) {
            return Character.isLetterOrDigit(c11);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f59596b = new t();

        @Override // ho.d
        public boolean B(char c11) {
            return Character.isLowerCase(c11);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f59597b = new u();

        @Override // ho.d
        public boolean B(char c11) {
            return Character.isUpperCase(c11);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class v extends i {

        /* renamed from: b, reason: collision with root package name */
        public final String f59598b;

        public v(String description) {
            this.f59598b = (String) Preconditions.checkNotNull(description);
        }

        @Override // ho.d
        public final String toString() {
            return this.f59598b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class w extends d {

        /* renamed from: b, reason: collision with root package name */
        public final d f59599b;

        public w(d original) {
            this.f59599b = (d) Preconditions.checkNotNull(original);
        }

        @Override // ho.d
        public boolean B(char c11) {
            return !this.f59599b.B(c11);
        }

        @Override // ho.d
        public boolean C(CharSequence sequence) {
            return this.f59599b.E(sequence);
        }

        @Override // ho.d
        public boolean E(CharSequence sequence) {
            return this.f59599b.C(sequence);
        }

        @Override // ho.d
        public d F() {
            return this.f59599b;
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            BitSet bitSet = new BitSet();
            this.f59599b.Q(bitSet);
            bitSet.flip(0, 65536);
            table.or(bitSet);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public int i(CharSequence sequence) {
            return sequence.length() - this.f59599b.i(sequence);
        }

        @Override // ho.d
        public String toString() {
            return this.f59599b + ".negate()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y extends v {

        /* renamed from: c, reason: collision with root package name */
        public static final d f59600c = new y();

        public y() {
            super("CharMatcher.none()");
        }

        @Override // ho.d
        public int A(CharSequence sequence) {
            Preconditions.checkNotNull(sequence);
            return -1;
        }

        @Override // ho.d
        public boolean B(char c11) {
            return false;
        }

        @Override // ho.d
        public boolean C(CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // ho.d
        public boolean E(CharSequence sequence) {
            Preconditions.checkNotNull(sequence);
            return true;
        }

        @Override // ho.d.i, ho.d
        public d F() {
            return d.c();
        }

        @Override // ho.d
        public d I(d other) {
            return (d) Preconditions.checkNotNull(other);
        }

        @Override // ho.d
        public String M(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // ho.d
        public String N(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // ho.d
        public String O(CharSequence sequence, CharSequence replacement) {
            Preconditions.checkNotNull(replacement);
            return sequence.toString();
        }

        @Override // ho.d
        public String U(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // ho.d
        public String V(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // ho.d
        public String W(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // ho.d
        public d b(d other) {
            Preconditions.checkNotNull(other);
            return this;
        }

        @Override // ho.d
        public String h(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // ho.d
        public int i(CharSequence sequence) {
            Preconditions.checkNotNull(sequence);
            return 0;
        }

        @Override // ho.d
        public int n(CharSequence sequence) {
            Preconditions.checkNotNull(sequence);
            return -1;
        }

        @Override // ho.d
        public int o(CharSequence sequence, int start) {
            Preconditions.checkPositionIndex(start, sequence.length());
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z extends d {

        /* renamed from: b, reason: collision with root package name */
        public final d f59601b;

        /* renamed from: c, reason: collision with root package name */
        public final d f59602c;

        public z(d a11, d b11) {
            this.f59601b = (d) Preconditions.checkNotNull(a11);
            this.f59602c = (d) Preconditions.checkNotNull(b11);
        }

        @Override // ho.d
        public boolean B(char c11) {
            return this.f59601b.B(c11) || this.f59602c.B(c11);
        }

        @Override // ho.d
        @go.c
        public void Q(BitSet table) {
            this.f59601b.Q(table);
            this.f59602c.Q(table);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public String toString() {
            return "CharMatcher.or(" + this.f59601b + j2.O + this.f59602c + pn.j.f81007d;
        }
    }

    public static d G() {
        return y.f59600c;
    }

    public static d H(CharSequence sequence) {
        return d(sequence).F();
    }

    @go.c
    public static d L(int totalCharacters, BitSet table, String description) {
        if (totalCharacters == 0) {
            return G();
        }
        if (totalCharacters == 1) {
            return q((char) table.nextSetBit(0));
        }
        if (totalCharacters != 2) {
            return t(totalCharacters, table.length()) ? l0.a0(table, description) : new f(table, description, null);
        }
        char nextSetBit = (char) table.nextSetBit(0);
        return r(nextSetBit, (char) table.nextSetBit(nextSetBit + 1));
    }

    public static String R(char c11) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = l50.b.f69934p;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(c11 & 15);
            c11 = (char) (c11 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static d S() {
        return b0.f59570e;
    }

    public static d X() {
        return c0.f59575f;
    }

    public static d c() {
        return c.f59571c;
    }

    public static d d(final CharSequence sequence) {
        int length = sequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new C0677d(sequence) : r(sequence.charAt(0), sequence.charAt(1)) : q(sequence.charAt(0)) : G();
    }

    public static d f() {
        return e.f59577c;
    }

    public static d g() {
        return g.f59579b;
    }

    @Deprecated
    public static d j() {
        return h.f59581f;
    }

    public static d l(final i0<? super Character> predicate) {
        return predicate instanceof d ? (d) predicate : new j(predicate);
    }

    public static d m(final char startInclusive, final char endInclusive) {
        return new k(startInclusive, endInclusive);
    }

    @Deprecated
    public static d p() {
        return l.f59587g;
    }

    public static d q(final char match) {
        return new m(match);
    }

    public static n r(char c12, char c22) {
        return new n(c12, c22);
    }

    public static d s(final char match) {
        return new o(match);
    }

    @go.c
    public static boolean t(int totalCharacters, int tableLength) {
        return totalCharacters <= 1023 && tableLength > totalCharacters * 64;
    }

    @Deprecated
    public static d u() {
        return p.f59592b;
    }

    public static d v() {
        return q.f59593c;
    }

    @Deprecated
    public static d w() {
        return r.f59594b;
    }

    @Deprecated
    public static d x() {
        return s.f59595b;
    }

    @Deprecated
    public static d y() {
        return t.f59596b;
    }

    @Deprecated
    public static d z() {
        return u.f59597b;
    }

    public int A(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (B(sequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean B(char c11);

    public boolean C(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!B(sequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean D(CharSequence sequence) {
        return !E(sequence);
    }

    public boolean E(CharSequence sequence) {
        return n(sequence) == -1;
    }

    public d F() {
        return new w(this);
    }

    public d I(d other) {
        return new z(this, other);
    }

    public d J() {
        return h0.h(this);
    }

    @go.c
    public d K() {
        String str;
        BitSet bitSet = new BitSet();
        Q(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= 65536) {
            return L(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i11 = 65536 - cardinality;
        String dVar = toString();
        if (dVar.endsWith(".negate()")) {
            str = dVar.substring(0, dVar.length() - 9);
        } else {
            str = dVar + ".negate()";
        }
        return new a(this, L(i11, bitSet, str), dVar);
    }

    public String M(CharSequence sequence) {
        String charSequence = sequence.toString();
        int n11 = n(charSequence);
        if (n11 == -1) {
            return charSequence;
        }
        char[] charArray = charSequence.toCharArray();
        int i11 = 1;
        while (true) {
            n11++;
            while (n11 != charArray.length) {
                if (B(charArray[n11])) {
                    break;
                }
                charArray[n11 - i11] = charArray[n11];
                n11++;
            }
            return new String(charArray, 0, n11 - i11);
            i11++;
        }
    }

    public String N(CharSequence sequence, char replacement) {
        String charSequence = sequence.toString();
        int n11 = n(charSequence);
        if (n11 == -1) {
            return charSequence;
        }
        char[] charArray = charSequence.toCharArray();
        charArray[n11] = replacement;
        while (true) {
            n11++;
            if (n11 >= charArray.length) {
                return new String(charArray);
            }
            if (B(charArray[n11])) {
                charArray[n11] = replacement;
            }
        }
    }

    public String O(CharSequence sequence, CharSequence replacement) {
        int length = replacement.length();
        if (length == 0) {
            return M(sequence);
        }
        int i11 = 0;
        if (length == 1) {
            return N(sequence, replacement.charAt(0));
        }
        String charSequence = sequence.toString();
        int n11 = n(charSequence);
        if (n11 == -1) {
            return charSequence;
        }
        int length2 = charSequence.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) charSequence, i11, n11);
            sb2.append(replacement);
            i11 = n11 + 1;
            n11 = o(charSequence, i11);
        } while (n11 != -1);
        sb2.append((CharSequence) charSequence, i11, length2);
        return sb2.toString();
    }

    public String P(CharSequence sequence) {
        return F().M(sequence);
    }

    @go.c
    public void Q(BitSet table) {
        for (int i11 = 65535; i11 >= 0; i11--) {
            if (B((char) i11)) {
                table.set(i11);
            }
        }
    }

    public String T(CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < length && B(sequence.charAt(i12))) {
            i12++;
        }
        int i13 = i11;
        while (i13 > i12 && B(sequence.charAt(i13))) {
            i13--;
        }
        if (i12 == 0 && i13 == i11) {
            return h(sequence, replacement);
        }
        int i14 = i13 + 1;
        return k(sequence, i12, i14, replacement, new StringBuilder(i14 - i12), false);
    }

    public String U(CharSequence sequence) {
        int length = sequence.length();
        int i11 = 0;
        while (i11 < length && B(sequence.charAt(i11))) {
            i11++;
        }
        int i12 = length - 1;
        while (i12 > i11 && B(sequence.charAt(i12))) {
            i12--;
        }
        return sequence.subSequence(i11, i12 + 1).toString();
    }

    public String V(CharSequence sequence) {
        int length = sequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!B(sequence.charAt(i11))) {
                return sequence.subSequence(i11, length).toString();
            }
        }
        return "";
    }

    public String W(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!B(sequence.charAt(length))) {
                return sequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public d b(d other) {
        return new b(this, other);
    }

    @Override // ho.i0
    @Deprecated
    /* renamed from: e */
    public boolean apply(Character character) {
        return B(character.charValue());
    }

    public String h(CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i11 = 0;
        while (i11 < length) {
            char charAt = sequence.charAt(i11);
            if (B(charAt)) {
                if (charAt != replacement || (i11 != length - 1 && B(sequence.charAt(i11 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(sequence, 0, i11);
                    sb2.append(replacement);
                    return k(sequence, i11 + 1, length, replacement, sb2, true);
                }
                i11++;
            }
            i11++;
            replacement = replacement;
        }
        return sequence.toString();
    }

    public int i(CharSequence sequence) {
        int i11 = 0;
        for (int i12 = 0; i12 < sequence.length(); i12++) {
            if (B(sequence.charAt(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public final String k(CharSequence sequence, int start, int end, char replacement, StringBuilder builder, boolean inMatchingGroup) {
        while (start < end) {
            char charAt = sequence.charAt(start);
            if (!B(charAt)) {
                builder.append(charAt);
                inMatchingGroup = false;
            } else if (!inMatchingGroup) {
                builder.append(replacement);
                inMatchingGroup = true;
            }
            start++;
        }
        return builder.toString();
    }

    public int n(CharSequence sequence) {
        return o(sequence, 0);
    }

    public int o(CharSequence sequence, int start) {
        int length = sequence.length();
        Preconditions.checkPositionIndex(start, length);
        while (start < length) {
            if (B(sequence.charAt(start))) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public String toString() {
        return super.toString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class i extends d {
        @Override // ho.d
        public d F() {
            return new x(this);
        }

        @Override // ho.d, ho.i0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // ho.d
        public final d J() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class x extends w {
        public x(d original) {
            super(original);
        }

        @Override // ho.d
        public final d J() {
            return this;
        }
    }
}
