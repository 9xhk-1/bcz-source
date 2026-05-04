package lx;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCharArrayBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharArrayBuilder.kt\nio/ktor/http/cio/internals/CharArrayBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements CharSequence, Appendable {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final pz.h<char[]> f71651a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public List<char[]> f71652b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public char[] f71653c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f71654d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f71655e;

    /* renamed from: f, reason: collision with root package name */
    public int f71656f;

    /* renamed from: g, reason: collision with root package name */
    public int f71657g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCharArrayBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharArrayBuilder.kt\nio/ktor/http/cio/internals/CharArrayBuilder$SubSequenceImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
    public final class a implements CharSequence {

        /* renamed from: a, reason: collision with root package name */
        public final int f71658a;

        /* renamed from: b, reason: collision with root package name */
        public final int f71659b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f71660c;

        public a(int i11, int i12) {
            this.f71658a = i11;
            this.f71659b = i12;
        }

        public final int D() {
            return this.f71658a;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i11) {
            return h(i11);
        }

        public boolean equals(@l Object obj) {
            if (!(obj instanceof CharSequence)) {
                return false;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() != length()) {
                return false;
            }
            return d.this.O(this.f71658a, charSequence, 0, length());
        }

        public char h(int i11) {
            int i12 = this.f71658a + i11;
            if (i11 < 0) {
                throw new IllegalArgumentException(("index is negative: " + i11).toString());
            }
            if (i12 < this.f71659b) {
                return d.this.J(i12);
            }
            throw new IllegalArgumentException(("index (" + i11 + ") should be less than length (" + length() + ')').toString());
        }

        public int hashCode() {
            String str = this.f71660c;
            return str != null ? str.hashCode() : d.this.M(this.f71658a, this.f71659b);
        }

        public final int j() {
            return this.f71659b;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return n();
        }

        public int n() {
            return this.f71659b - this.f71658a;
        }

        @Override // java.lang.CharSequence
        @m80.k
        public CharSequence subSequence(int i11, int i12) {
            if (i11 < 0) {
                throw new IllegalArgumentException(("start is negative: " + i11).toString());
            }
            if (i11 > i12) {
                throw new IllegalArgumentException(("start (" + i11 + ") should be less or equal to end (" + i12 + ')').toString());
            }
            int i13 = this.f71659b;
            int i14 = this.f71658a;
            if (i12 <= i13 - i14) {
                return i11 == i12 ? "" : d.this.new a(i11 + i14, i14 + i12);
            }
            throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
        }

        @Override // java.lang.CharSequence
        @m80.k
        public String toString() {
            String str = this.f71660c;
            if (str != null) {
                return str;
            }
            String obj = d.this.G(this.f71658a, this.f71659b).toString();
            this.f71660c = obj;
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final char[] E() {
        char[] U6 = this.f71651a.U6();
        char[] cArr = this.f71653c;
        this.f71653c = U6;
        this.f71656f = U6.length;
        this.f71655e = false;
        if (cArr != null) {
            List<char[]> list = this.f71652b;
            List<char[]> list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f71652b = arrayList;
                arrayList.add(cArr);
                list2 = arrayList;
            }
            list2.add(U6);
        }
        return U6;
    }

    public final char[] F(int i11) {
        List<char[]> list = this.f71652b;
        if (list != null) {
            char[] cArr = this.f71653c;
            g0.m(cArr);
            return list.get(i11 / cArr.length);
        }
        if (i11 >= 2048) {
            Q(i11);
            throw new KotlinNothingValueException();
        }
        char[] cArr2 = this.f71653c;
        if (cArr2 != null) {
            return cArr2;
        }
        Q(i11);
        throw new KotlinNothingValueException();
    }

    public final CharSequence G(int i11, int i12) {
        if (i11 == i12) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 - i11);
        for (int i13 = i11 - (i11 % 2048); i13 < i12; i13 += 2048) {
            char[] F = F(i13);
            int min = Math.min(i12 - i13, 2048);
            for (int max = Math.max(0, i11 - i13); max < min; max++) {
                sb2.append(F[max]);
            }
        }
        return sb2;
    }

    public final int H() {
        char[] cArr = this.f71653c;
        g0.m(cArr);
        return cArr.length - this.f71656f;
    }

    public char I(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(("index is negative: " + i11).toString());
        }
        if (i11 < length()) {
            return J(i11);
        }
        throw new IllegalArgumentException(("index " + i11 + " is not in range [0, " + length() + ')').toString());
    }

    public final char J(int i11) {
        char[] F = F(i11);
        char[] cArr = this.f71653c;
        g0.m(cArr);
        return F[i11 % cArr.length];
    }

    public int K() {
        return this.f71657g;
    }

    @m80.k
    public final pz.h<char[]> L() {
        return this.f71651a;
    }

    public final int M(int i11, int i12) {
        int i13 = 0;
        while (i11 < i12) {
            i13 = (i13 * 31) + J(i11);
            i11++;
        }
        return i13;
    }

    public final char[] N() {
        if (this.f71656f == 0) {
            return E();
        }
        char[] cArr = this.f71653c;
        g0.m(cArr);
        return cArr;
    }

    public final boolean O(int i11, CharSequence charSequence, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (J(i11 + i14) != charSequence.charAt(i12 + i14)) {
                return false;
            }
        }
        return true;
    }

    public final void P() {
        List<char[]> list = this.f71652b;
        if (list != null) {
            this.f71653c = null;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f71651a.b4(list.get(i11));
            }
        } else {
            char[] cArr = this.f71653c;
            if (cArr != null) {
                this.f71651a.b4(cArr);
            }
            this.f71653c = null;
        }
        this.f71655e = true;
        this.f71652b = null;
        this.f71654d = null;
        this.f71657g = 0;
        this.f71656f = 0;
    }

    public final Void Q(int i11) {
        if (this.f71655e) {
            throw new IllegalStateException("Buffer is already released");
        }
        throw new IndexOutOfBoundsException(i11 + " is not in range [0; " + H() + ')');
    }

    @Override // java.lang.Appendable
    @m80.k
    public Appendable append(char c11) {
        char[] N = N();
        char[] cArr = this.f71653c;
        g0.m(cArr);
        int length = cArr.length;
        int i11 = this.f71656f;
        N[length - i11] = c11;
        this.f71654d = null;
        this.f71656f = i11 - 1;
        this.f71657g = length() + 1;
        return this;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return I(i11);
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (length() != charSequence.length()) {
            return false;
        }
        return O(0, charSequence, 0, length());
    }

    public int hashCode() {
        String str = this.f71654d;
        return str != null ? str.hashCode() : M(0, length());
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return K();
    }

    @Override // java.lang.CharSequence
    @m80.k
    public CharSequence subSequence(int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException(("startIndex (" + i11 + ") should be less or equal to endIndex (" + i12 + ')').toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("startIndex is negative: " + i11).toString());
        }
        if (i12 <= length()) {
            return new a(i11, i12);
        }
        throw new IllegalArgumentException(("endIndex (" + i12 + ") is greater than length (" + length() + ')').toString());
    }

    @Override // java.lang.CharSequence
    @m80.k
    public String toString() {
        String str = this.f71654d;
        if (str != null) {
            return str;
        }
        String obj = G(0, length()).toString();
        this.f71654d = obj;
        return obj;
    }

    public d(@m80.k pz.h<char[]> pool) {
        g0.p(pool, "pool");
        this.f71651a = pool;
    }

    public /* synthetic */ d(pz.h hVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? f.a() : hVar);
    }

    @Override // java.lang.Appendable
    @m80.k
    public Appendable append(@l CharSequence charSequence, int i11, int i12) {
        if (charSequence == null) {
            return this;
        }
        int i13 = i11;
        while (i13 < i12) {
            char[] N = N();
            int length = N.length;
            int i14 = this.f71656f;
            int i15 = length - i14;
            int min = Math.min(i12 - i13, i14);
            for (int i16 = 0; i16 < min; i16++) {
                N[i15 + i16] = charSequence.charAt(i13 + i16);
            }
            i13 += min;
            this.f71656f -= min;
        }
        this.f71654d = null;
        this.f71657g = length() + (i12 - i11);
        return this;
    }

    @Override // java.lang.Appendable
    @m80.k
    public Appendable append(@l CharSequence charSequence) {
        return charSequence == null ? this : append(charSequence, 0, charSequence.length());
    }
}
