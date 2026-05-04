package a00;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n14484#2,14:3052\n14514#2,14:3066\n14544#2,14:3080\n14574#2,14:3094\n14604#2,14:3108\n14634#2,14:3122\n14664#2,14:3136\n14694#2,14:3150\n14724#2,14:3164\n17456#2,14:3178\n17486#2,14:3192\n17516#2,14:3206\n17546#2,14:3220\n17576#2,14:3234\n17606#2,14:3248\n17636#2,14:3262\n17666#2,14:3276\n17696#2,14:3290\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2443#1:3052,14\n2450#1:3066,14\n2457#1:3080,14\n2464#1:3094,14\n2471#1:3108,14\n2478#1:3122,14\n2485#1:3136,14\n2492#1:3150,14\n2499#1:3164,14\n2641#1:3178,14\n2648#1:3192,14\n2655#1:3206,14\n2662#1:3220,14\n2669#1:3234,14\n2676#1:3248,14\n2683#1:3262,14\n2690#1:3276,14\n2697#1:3290,14\n*E\n"})
/* loaded from: classes8.dex */
public class q extends p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends a00.d<Byte> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f1122a;

        public a(byte[] bArr) {
            this.f1122a = bArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return d(((Number) obj).byteValue());
            }
            return false;
        }

        public boolean d(byte b11) {
            return a0.v8(this.f1122a, b11);
        }

        @Override // a00.d, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Byte get(int i11) {
            return Byte.valueOf(this.f1122a[i11]);
        }

        public int g(byte b11) {
            return a0.Vf(this.f1122a, b11);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1122a.length;
        }

        public int h(byte b11) {
            return a0.Zh(this.f1122a, b11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return g(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return this.f1122a.length == 0;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return h(((Number) obj).byteValue());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a00.d<Short> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ short[] f1123a;

        public b(short[] sArr) {
            this.f1123a = sArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return d(((Number) obj).shortValue());
            }
            return false;
        }

        public boolean d(short s11) {
            return a0.C8(this.f1123a, s11);
        }

        @Override // a00.d, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Short get(int i11) {
            return Short.valueOf(this.f1123a[i11]);
        }

        public int g(short s11) {
            return a0.cg(this.f1123a, s11);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1123a.length;
        }

        public int h(short s11) {
            return a0.gi(this.f1123a, s11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return g(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return this.f1123a.length == 0;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return h(((Number) obj).shortValue());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends a00.d<Integer> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f1124a;

        public c(int[] iArr) {
            this.f1124a = iArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return d(((Number) obj).intValue());
            }
            return false;
        }

        public boolean d(int i11) {
            return a0.z8(this.f1124a, i11);
        }

        @Override // a00.d, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer get(int i11) {
            return Integer.valueOf(this.f1124a[i11]);
        }

        public int g(int i11) {
            return a0.Zf(this.f1124a, i11);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1124a.length;
        }

        public int h(int i11) {
            return a0.di(this.f1124a, i11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return g(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return this.f1124a.length == 0;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return h(((Number) obj).intValue());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends a00.d<Long> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long[] f1125a;

        public d(long[] jArr) {
            this.f1125a = jArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return d(((Number) obj).longValue());
            }
            return false;
        }

        public boolean d(long j11) {
            return a0.A8(this.f1125a, j11);
        }

        @Override // a00.d, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long get(int i11) {
            return Long.valueOf(this.f1125a[i11]);
        }

        public int g(long j11) {
            return a0.ag(this.f1125a, j11);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1125a.length;
        }

        public int h(long j11) {
            return a0.ei(this.f1125a, j11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return g(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return this.f1125a.length == 0;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return h(((Number) obj).longValue());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n13020#2,2:3052\n1832#2,6:3054\n1940#2,6:3060\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3052,2\n201#1:3054,6\n202#1:3060,6\n*E\n"})
    public static final class e extends a00.d<Float> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float[] f1126a;

        public e(float[] fArr) {
            this.f1126a = fArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return d(((Number) obj).floatValue());
            }
            return false;
        }

        public boolean d(float f11) {
            for (float f12 : this.f1126a) {
                if (Float.floatToIntBits(f12) == Float.floatToIntBits(f11)) {
                    return true;
                }
            }
            return false;
        }

        @Override // a00.d, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Float get(int i11) {
            return Float.valueOf(this.f1126a[i11]);
        }

        public int g(float f11) {
            float[] fArr = this.f1126a;
            int length = fArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (Float.floatToIntBits(fArr[i11]) == Float.floatToIntBits(f11)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1126a.length;
        }

        public int h(float f11) {
            float[] fArr = this.f1126a;
            int length = fArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f11)) {
                        return length;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
            }
            return -1;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return g(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return this.f1126a.length == 0;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return h(((Number) obj).floatValue());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n13030#2,2:3052\n1844#2,6:3054\n1952#2,6:3060\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3052,2\n215#1:3054,6\n216#1:3060,6\n*E\n"})
    public static final class f extends a00.d<Double> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ double[] f1127a;

        public f(double[] dArr) {
            this.f1127a = dArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return d(((Number) obj).doubleValue());
            }
            return false;
        }

        public boolean d(double d11) {
            for (double d12 : this.f1127a) {
                if (Double.doubleToLongBits(d12) == Double.doubleToLongBits(d11)) {
                    return true;
                }
            }
            return false;
        }

        @Override // a00.d, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Double get(int i11) {
            return Double.valueOf(this.f1127a[i11]);
        }

        public int g(double d11) {
            double[] dArr = this.f1127a;
            int length = dArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (Double.doubleToLongBits(dArr[i11]) == Double.doubleToLongBits(d11)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1127a.length;
        }

        public int h(double d11) {
            double[] dArr = this.f1127a;
            int length = dArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d11)) {
                        return length;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
            }
            return -1;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return g(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return this.f1127a.length == 0;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return h(((Number) obj).doubleValue());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends a00.d<Boolean> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f1128a;

        public g(boolean[] zArr) {
            this.f1128a = zArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return d(((Boolean) obj).booleanValue());
            }
            return false;
        }

        public boolean d(boolean z11) {
            return a0.D8(this.f1128a, z11);
        }

        @Override // a00.d, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean get(int i11) {
            return Boolean.valueOf(this.f1128a[i11]);
        }

        public int g(boolean z11) {
            return a0.dg(this.f1128a, z11);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1128a.length;
        }

        public int h(boolean z11) {
            return a0.hi(this.f1128a, z11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return g(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return this.f1128a.length == 0;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return h(((Boolean) obj).booleanValue());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends a00.d<Character> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ char[] f1129a;

        public h(char[] cArr) {
            this.f1129a = cArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return d(((Character) obj).charValue());
            }
            return false;
        }

        public boolean d(char c11) {
            return a0.w8(this.f1129a, c11);
        }

        @Override // a00.d, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Character get(int i11) {
            return Character.valueOf(this.f1129a[i11]);
        }

        public int g(char c11) {
            return a0.Wf(this.f1129a, c11);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1129a.length;
        }

        public int h(char c11) {
            return a0.ai(this.f1129a, c11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return g(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return this.f1129a.length == 0;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return h(((Character) obj).charValue());
            }
            return -1;
        }
    }

    public static final int A(@m80.k int[] iArr, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return Arrays.binarySearch(iArr, i12, i13, i11);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static long[] A0(@m80.k long[] jArr, @m80.k long[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(jArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @o00.f
    public static final float A1(float[] fArr, int i11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr[i11];
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object A2(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(objArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Bl(objArr, comparator);
    }

    @m80.k
    public static short[] A3(@m80.k short[] sArr, short s11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, length + 1);
        copyOf[length] = s11;
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger A4(short[] sArr, x00.l<? super Short, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (short s11 : sArr) {
            valueOf = valueOf.add(selector.invoke(Short.valueOf(s11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int B(@m80.k long[] jArr, long j11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return Arrays.binarySearch(jArr, i11, i12, j11);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static <T> T[] B0(@m80.k T[] tArr, @m80.k T[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(tArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @o00.f
    public static final int B1(int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr[i11];
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short B2(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Cl(sArr, comparator);
    }

    @m80.k
    public static short[] B3(@m80.k short[] sArr, @m80.k short[] elements) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] copyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger B4(boolean[] zArr, x00.l<? super Boolean, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (boolean z11 : zArr) {
            valueOf = valueOf.add(selector.invoke(Boolean.valueOf(z11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final <T> int C(@m80.k T[] tArr, T t11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return Arrays.binarySearch(tArr, i11, i12, t11);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static short[] C0(@m80.k short[] sArr, @m80.k short[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(sArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @o00.f
    public static final long C1(long[] jArr, int i11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr[i11];
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte C2(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return a0.yn(bArr);
    }

    @m80.k
    public static final boolean[] C3(@m80.k boolean[] zArr, @m80.k Collection<Boolean> elements) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().booleanValue();
            length++;
        }
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @m80.k
    public static final SortedSet<Byte> C4(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return (SortedSet) a0.Cy(bArr, new TreeSet());
    }

    public static final <T> int D(@m80.k T[] tArr, T t11, @m80.k Comparator<? super T> comparator, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return Arrays.binarySearch(tArr, i11, i12, t11, comparator);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static final boolean[] D0(@m80.k boolean[] zArr, @m80.k boolean[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(zArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @o00.f
    public static final <T> T D1(T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr[i11];
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character D2(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return a0.zn(cArr);
    }

    @m80.k
    public static final boolean[] D3(@m80.k boolean[] zArr, boolean z11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        copyOf[length] = z11;
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @m80.k
    public static final SortedSet<Character> D4(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return (SortedSet) a0.Dy(cArr, new TreeSet());
    }

    public static final int E(@m80.k short[] sArr, short s11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return Arrays.binarySearch(sArr, i11, i12, s11);
    }

    public static /* synthetic */ byte[] E0(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = bArr.length;
        }
        return v0(bArr, bArr2, i11, i12, i13);
    }

    @o00.f
    public static final short E1(short[] sArr, int i11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr[i11];
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable E2(Comparable[] comparableArr) {
        kotlin.jvm.internal.g0.p(comparableArr, "<this>");
        return a0.An(comparableArr);
    }

    @m80.k
    public static boolean[] E3(@m80.k boolean[] zArr, @m80.k boolean[] elements) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @m80.k
    public static final SortedSet<Double> E4(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return (SortedSet) a0.Ey(dArr, new TreeSet());
    }

    public static /* synthetic */ int F(byte[] bArr, byte b11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return w(bArr, b11, i11, i12);
    }

    public static /* synthetic */ char[] F0(char[] cArr, char[] cArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = cArr.length;
        }
        return w0(cArr, cArr2, i11, i12, i13);
    }

    @o00.f
    public static final boolean F1(boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr[i11];
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double F2(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return a0.Bn(dArr);
    }

    @o00.f
    public static final <T> T[] F3(T[] tArr, T t11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (T[]) w3(tArr, t11);
    }

    @m80.k
    public static final SortedSet<Float> F4(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return (SortedSet) a0.Fy(fArr, new TreeSet());
    }

    public static /* synthetic */ int G(char[] cArr, char c11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = cArr.length;
        }
        return x(cArr, c11, i11, i12);
    }

    public static /* synthetic */ double[] G0(double[] dArr, double[] dArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = dArr.length;
        }
        return x0(dArr, dArr2, i11, i12, i13);
    }

    public static void G1(@m80.k byte[] bArr, byte b11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        Arrays.fill(bArr, i11, i12, b11);
    }

    @yz.y0(version = "1.1")
    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double G2(Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return a0.Cn(dArr);
    }

    public static final void G3(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @m80.k
    public static final SortedSet<Integer> G4(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return (SortedSet) a0.Gy(iArr, new TreeSet());
    }

    public static /* synthetic */ int H(double[] dArr, double d11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = dArr.length;
        }
        return y(dArr, d11, i11, i12);
    }

    public static /* synthetic */ float[] H0(float[] fArr, float[] fArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = fArr.length;
        }
        return y0(fArr, fArr2, i11, i12, i13);
    }

    public static void H1(@m80.k char[] cArr, char c11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        Arrays.fill(cArr, i11, i12, c11);
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float H2(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return a0.Dn(fArr);
    }

    public static final void H3(@m80.k byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        Arrays.sort(bArr, i11, i12);
    }

    @m80.k
    public static final SortedSet<Long> H4(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return (SortedSet) a0.Hy(jArr, new TreeSet());
    }

    public static /* synthetic */ int I(float[] fArr, float f11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = fArr.length;
        }
        return z(fArr, f11, i11, i12);
    }

    public static /* synthetic */ int[] I0(int[] iArr, int[] iArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = iArr.length;
        }
        return z0(iArr, iArr2, i11, i12, i13);
    }

    public static final void I1(@m80.k double[] dArr, double d11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        Arrays.fill(dArr, i11, i12, d11);
    }

    @yz.y0(version = "1.1")
    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float I2(Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return a0.En(fArr);
    }

    public static final void I3(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @m80.k
    public static final <T extends Comparable<? super T>> SortedSet<T> I4(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (SortedSet) a0.Iy(tArr, new TreeSet());
    }

    public static /* synthetic */ int J(int[] iArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = iArr.length;
        }
        return A(iArr, i11, i12, i13);
    }

    public static /* synthetic */ long[] J0(long[] jArr, long[] jArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = jArr.length;
        }
        return A0(jArr, jArr2, i11, i12, i13);
    }

    public static final void J1(@m80.k float[] fArr, float f11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        Arrays.fill(fArr, i11, i12, f11);
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer J2(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return a0.Fn(iArr);
    }

    public static final void J3(@m80.k char[] cArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        Arrays.sort(cArr, i11, i12);
    }

    @m80.k
    public static final <T> SortedSet<T> J4(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return (SortedSet) a0.Iy(tArr, new TreeSet(comparator));
    }

    public static /* synthetic */ int K(long[] jArr, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = jArr.length;
        }
        return B(jArr, j11, i11, i12);
    }

    public static /* synthetic */ Object[] K0(Object[] objArr, Object[] objArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = objArr.length;
        }
        return B0(objArr, objArr2, i11, i12, i13);
    }

    public static void K1(@m80.k int[] iArr, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        Arrays.fill(iArr, i12, i13, i11);
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long K2(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return a0.Gn(jArr);
    }

    public static final void K3(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @m80.k
    public static final SortedSet<Short> K4(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return (SortedSet) a0.Jy(sArr, new TreeSet());
    }

    public static /* synthetic */ int L(Object[] objArr, Object obj, int i11, int i12, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = objArr.length;
        }
        return C(objArr, obj, i11, i12);
    }

    public static /* synthetic */ short[] L0(short[] sArr, short[] sArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = sArr.length;
        }
        return C0(sArr, sArr2, i11, i12, i13);
    }

    public static void L1(@m80.k long[] jArr, long j11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        Arrays.fill(jArr, i11, i12, j11);
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short L2(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return a0.Hn(sArr);
    }

    public static void L3(@m80.k double[] dArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        Arrays.sort(dArr, i11, i12);
    }

    @m80.k
    public static final SortedSet<Boolean> L4(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return (SortedSet) a0.Ky(zArr, new TreeSet());
    }

    public static /* synthetic */ int M(Object[] objArr, Object obj, Comparator comparator, int i11, int i12, int i13, Object obj2) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return D(objArr, obj, comparator, i11, i12);
    }

    public static /* synthetic */ boolean[] M0(boolean[] zArr, boolean[] zArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = zArr.length;
        }
        return D0(zArr, zArr2, i11, i12, i13);
    }

    public static <T> void M1(@m80.k T[] tArr, T t11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        Arrays.fill(tArr, i11, i12, t11);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean M2(boolean[] zArr, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z11 = zArr[0];
        int Qe = a0.Qe(zArr);
        if (Qe == 0) {
            return Boolean.valueOf(z11);
        }
        R invoke = selector.invoke(Boolean.valueOf(z11));
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                boolean z12 = zArr[i11];
                R invoke2 = selector.invoke(Boolean.valueOf(z12));
                if (invoke.compareTo(invoke2) > 0) {
                    z11 = z12;
                    invoke = invoke2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z11);
    }

    public static final void M3(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @m80.k
    public static Boolean[] M4(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolArr[i11] = Boolean.valueOf(zArr[i11]);
        }
        return boolArr;
    }

    public static /* synthetic */ int N(short[] sArr, short s11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = sArr.length;
        }
        return E(sArr, s11, i11, i12);
    }

    @o00.f
    public static final byte[] N0(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static void N1(@m80.k short[] sArr, short s11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        Arrays.fill(sArr, i11, i12, s11);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte N2(byte[] bArr, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = a0.Ie(bArr);
        if (Ie == 0) {
            return Byte.valueOf(b11);
        }
        R invoke = selector.invoke(Byte.valueOf(b11));
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                R invoke2 = selector.invoke(Byte.valueOf(b12));
                if (invoke.compareTo(invoke2) > 0) {
                    b11 = b12;
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    public static void N3(@m80.k float[] fArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        Arrays.sort(fArr, i11, i12);
    }

    @m80.k
    public static final Byte[] N4(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            bArr2[i11] = Byte.valueOf(bArr[i11]);
        }
        return bArr2;
    }

    @o00.i
    @w00.j(name = "contentDeepEqualsInline")
    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> boolean O(T[] tArr, T[] other) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return p.g(tArr, other);
    }

    @o00.f
    public static final byte[] O0(byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final void O1(@m80.k boolean[] zArr, boolean z11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        Arrays.fill(zArr, i11, i12, z11);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character O2(char[] cArr, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = a0.Je(cArr);
        if (Je == 0) {
            return Character.valueOf(c11);
        }
        R invoke = selector.invoke(Character.valueOf(c11));
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                R invoke2 = selector.invoke(Character.valueOf(c12));
                if (invoke.compareTo(invoke2) > 0) {
                    c11 = c12;
                    invoke = invoke2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    public static void O3(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @m80.k
    public static final Character[] O4(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            chArr[i11] = Character.valueOf(cArr[i11]);
        }
        return chArr;
    }

    @w00.j(name = "contentDeepEqualsNullable")
    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> boolean P(T[] tArr, T[] tArr2) {
        return p.g(tArr, tArr2);
    }

    @o00.f
    public static final char[] P0(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void P1(byte[] bArr, byte b11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        G1(bArr, b11, i11, i12);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double P2(double[] dArr, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = a0.Ke(dArr);
        if (Ke == 0) {
            return Double.valueOf(d11);
        }
        R invoke = selector.invoke(Double.valueOf(d11));
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                double d12 = dArr[i11];
                R invoke2 = selector.invoke(Double.valueOf(d12));
                if (invoke.compareTo(invoke2) > 0) {
                    d11 = d12;
                    invoke = invoke2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    public static void P3(@m80.k int[] iArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        Arrays.sort(iArr, i11, i12);
    }

    @m80.k
    public static Double[] P4(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            dArr2[i11] = Double.valueOf(dArr[i11]);
        }
        return dArr2;
    }

    @o00.i
    @w00.j(name = "contentDeepHashCodeInline")
    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> int Q(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return o.b(tArr);
    }

    @o00.f
    public static final char[] Q0(char[] cArr, int i11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void Q1(char[] cArr, char c11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = cArr.length;
        }
        H1(cArr, c11, i11, i12);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float Q2(float[] fArr, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = a0.Le(fArr);
        if (Le == 0) {
            return Float.valueOf(f11);
        }
        R invoke = selector.invoke(Float.valueOf(f11));
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                float f12 = fArr[i11];
                R invoke2 = selector.invoke(Float.valueOf(f12));
                if (invoke.compareTo(invoke2) > 0) {
                    f11 = f12;
                    invoke = invoke2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    public static final void Q3(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @m80.k
    public static Float[] Q4(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            fArr2[i11] = Float.valueOf(fArr[i11]);
        }
        return fArr2;
    }

    @w00.j(name = "contentDeepHashCodeNullable")
    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> int R(T[] tArr) {
        return o.b(tArr);
    }

    @o00.f
    public static final double[] R0(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void R1(double[] dArr, double d11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = dArr.length;
        }
        I1(dArr, d11, i11, i12);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer R2(int[] iArr, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = a0.Me(iArr);
        if (Me == 0) {
            return Integer.valueOf(i11);
        }
        R invoke = selector.invoke(Integer.valueOf(i11));
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                R invoke2 = selector.invoke(Integer.valueOf(i13));
                if (invoke.compareTo(invoke2) > 0) {
                    i11 = i13;
                    invoke = invoke2;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    public static void R3(@m80.k long[] jArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        Arrays.sort(jArr, i11, i12);
    }

    @m80.k
    public static Integer[] R4(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }

    @o00.i
    @w00.j(name = "contentDeepToStringInline")
    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> String S(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return p.h(tArr);
    }

    @o00.f
    public static final double[] S0(double[] dArr, int i11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void S1(float[] fArr, float f11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = fArr.length;
        }
        J1(fArr, f11, i11, i12);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long S2(long[] jArr, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = a0.Ne(jArr);
        if (Ne == 0) {
            return Long.valueOf(j11);
        }
        R invoke = selector.invoke(Long.valueOf(j11));
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                R invoke2 = selector.invoke(Long.valueOf(j12));
                if (invoke.compareTo(invoke2) > 0) {
                    j11 = j12;
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @o00.f
    public static final <T extends Comparable<? super T>> void S3(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        U3(tArr);
    }

    @m80.k
    public static Long[] S4(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            lArr[i11] = Long.valueOf(jArr[i11]);
        }
        return lArr;
    }

    @w00.j(name = "contentDeepToStringNullable")
    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> String T(T[] tArr) {
        return p.h(tArr);
    }

    @o00.f
    public static final float[] T0(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void T1(int[] iArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = iArr.length;
        }
        K1(iArr, i11, i12, i13);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T T2(T[] tArr, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int Oe = a0.Oe(tArr);
        if (Oe != 0) {
            R invoke = selector.invoke(t11);
            int i11 = 1;
            if (1 <= Oe) {
                while (true) {
                    T t12 = tArr[i11];
                    R invoke2 = selector.invoke(t12);
                    if (invoke.compareTo(invoke2) > 0) {
                        t11 = t12;
                        invoke = invoke2;
                    }
                    if (i11 == Oe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    public static final <T extends Comparable<? super T>> void T3(@m80.k T[] tArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        Arrays.sort(tArr, i11, i12);
    }

    @m80.k
    public static final Short[] T4(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            shArr[i11] = Short.valueOf(sArr[i11]);
        }
        return shArr;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean U(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @o00.f
    public static final float[] U0(float[] fArr, int i11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void U1(long[] jArr, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = jArr.length;
        }
        L1(jArr, j11, i11, i12);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short U2(short[] sArr, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = a0.Pe(sArr);
        if (Pe == 0) {
            return Short.valueOf(s11);
        }
        R invoke = selector.invoke(Short.valueOf(s11));
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                R invoke2 = selector.invoke(Short.valueOf(s12));
                if (invoke.compareTo(invoke2) > 0) {
                    s11 = s12;
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    public static final <T> void U3(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean V(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @o00.f
    public static final int[] V0(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void V1(Object[] objArr, Object obj, int i11, int i12, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = objArr.length;
        }
        M1(objArr, obj, i11, i12);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean V2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Sn(zArr, comparator);
    }

    public static final <T> void V3(@m80.k T[] tArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        Arrays.sort(tArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean W(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @o00.f
    public static final int[] W0(int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void W1(short[] sArr, short s11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = sArr.length;
        }
        N1(sArr, s11, i11, i12);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte W2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Tn(bArr, comparator);
    }

    public static final void W3(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean X(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @o00.f
    public static final long[] X0(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void X1(boolean[] zArr, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = zArr.length;
        }
        O1(zArr, z11, i11, i12);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Un(cArr, comparator);
    }

    public static final void X3(@m80.k short[] sArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        Arrays.sort(sArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean Y(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @o00.f
    public static final long[] Y0(long[] jArr, int i11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @m80.k
    public static final <R> List<R> Y1(@m80.k Object[] objArr, @m80.k Class<R> klass) {
        kotlin.jvm.internal.g0.p(objArr, "<this>");
        kotlin.jvm.internal.g0.p(klass, "klass");
        return (List) Z1(objArr, new ArrayList(), klass);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double Y2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Vn(dArr, comparator);
    }

    public static /* synthetic */ void Y3(byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = bArr.length;
        }
        H3(bArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean Z(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @o00.f
    public static final <T> T[] Z0(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.g0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @m80.k
    public static final <C extends Collection<? super R>, R> C Z1(@m80.k Object[] objArr, @m80.k C destination, @m80.k Class<R> klass) {
        kotlin.jvm.internal.g0.p(objArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float Z2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Wn(fArr, comparator);
    }

    public static /* synthetic */ void Z3(char[] cArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = cArr.length;
        }
        J3(cArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> boolean a0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @o00.f
    public static final <T> T[] a1(T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i11);
        kotlin.jvm.internal.g0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte a2(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return a0.al(bArr);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer a3(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Xn(iArr, comparator);
    }

    public static /* synthetic */ void a4(double[] dArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = dArr.length;
        }
        L3(dArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean b0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @o00.f
    public static final short[] b1(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character b2(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return a0.bl(cArr);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long b3(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Yn(jArr, comparator);
    }

    public static /* synthetic */ void b4(float[] fArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = fArr.length;
        }
        N3(fArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean c0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @o00.f
    public static final short[] c1(short[] sArr, int i11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable c2(Comparable[] comparableArr) {
        kotlin.jvm.internal.g0.p(comparableArr, "<this>");
        return a0.cl(comparableArr);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object c3(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(objArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Zn(objArr, comparator);
    }

    public static /* synthetic */ void c4(int[] iArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = iArr.length;
        }
        P3(iArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int d0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @o00.f
    public static final boolean[] d1(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double d2(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return a0.dl(dArr);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short d3(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.ao(sArr, comparator);
    }

    public static /* synthetic */ void d4(long[] jArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = jArr.length;
        }
        R3(jArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int e0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @o00.f
    public static final boolean[] e1(boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @yz.y0(version = "1.1")
    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double e2(Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return a0.el(dArr);
    }

    @m80.k
    public static byte[] e3(@m80.k byte[] bArr, byte b11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + 1);
        copyOf[length] = b11;
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void e4(Comparable[] comparableArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = comparableArr.length;
        }
        T3(comparableArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int f0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static byte[] f1(@m80.k byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        o.c(i12, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11, i12);
        kotlin.jvm.internal.g0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float f2(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return a0.fl(fArr);
    }

    @m80.k
    public static final byte[] f3(@m80.k byte[] bArr, @m80.k Collection<Byte> elements) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().byteValue();
            length++;
        }
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void f4(Object[] objArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = objArr.length;
        }
        V3(objArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int g0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static final char[] g1(@m80.k char[] cArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        o.c(i12, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i11, i12);
        kotlin.jvm.internal.g0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @yz.y0(version = "1.1")
    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float g2(Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return a0.gl(fArr);
    }

    @m80.k
    public static byte[] g3(@m80.k byte[] bArr, @m80.k byte[] elements) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void g4(short[] sArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = sArr.length;
        }
        X3(sArr, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int h0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static final double[] h1(@m80.k double[] dArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        o.c(i12, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i11, i12);
        kotlin.jvm.internal.g0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer h2(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return a0.hl(iArr);
    }

    @m80.k
    public static final char[] h3(@m80.k char[] cArr, char c11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, length + 1);
        copyOf[length] = c11;
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    public static final <T> void h4(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int i0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static float[] i1(@m80.k float[] fArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        o.c(i12, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i11, i12);
        kotlin.jvm.internal.g0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long i2(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return a0.il(jArr);
    }

    @m80.k
    public static final char[] i3(@m80.k char[] cArr, @m80.k Collection<Character> elements) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().charValue();
            length++;
        }
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    public static <T> void i4(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Arrays.sort(tArr, i11, i12, comparator);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> int j0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static int[] j1(@m80.k int[] iArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        o.c(i12, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i11, i12);
        kotlin.jvm.internal.g0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short j2(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return a0.jl(sArr);
    }

    @m80.k
    public static final char[] j3(@m80.k char[] cArr, @m80.k char[] elements) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void j4(Object[] objArr, Comparator comparator, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = objArr.length;
        }
        i4(objArr, comparator, i11, i12);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int k0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static long[] k1(@m80.k long[] jArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        o.c(i12, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i11, i12);
        kotlin.jvm.internal.g0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean k2(boolean[] zArr, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z11 = zArr[0];
        int Qe = a0.Qe(zArr);
        if (Qe == 0) {
            return Boolean.valueOf(z11);
        }
        R invoke = selector.invoke(Boolean.valueOf(z11));
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                boolean z12 = zArr[i11];
                R invoke2 = selector.invoke(Boolean.valueOf(z12));
                if (invoke.compareTo(invoke2) < 0) {
                    z11 = z12;
                    invoke = invoke2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z11);
    }

    @m80.k
    public static final double[] k3(@m80.k double[] dArr, double d11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
        copyOf[length] = d11;
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal k4(byte[] bArr, x00.l<? super Byte, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (byte b11 : bArr) {
            valueOf = valueOf.add(selector.invoke(Byte.valueOf(b11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int l0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static <T> T[] l1(@m80.k T[] tArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        o.c(i12, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i11, i12);
        kotlin.jvm.internal.g0.o(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte l2(byte[] bArr, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = a0.Ie(bArr);
        if (Ie == 0) {
            return Byte.valueOf(b11);
        }
        R invoke = selector.invoke(Byte.valueOf(b11));
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                R invoke2 = selector.invoke(Byte.valueOf(b12));
                if (invoke.compareTo(invoke2) < 0) {
                    b11 = b12;
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    @m80.k
    public static final double[] l3(@m80.k double[] dArr, @m80.k Collection<Double> elements) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().doubleValue();
            length++;
        }
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal l4(char[] cArr, x00.l<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (char c11 : cArr) {
            valueOf = valueOf.add(selector.invoke(Character.valueOf(c11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final String m0(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static short[] m1(@m80.k short[] sArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        o.c(i12, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i11, i12);
        kotlin.jvm.internal.g0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m2(char[] cArr, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = a0.Je(cArr);
        if (Je == 0) {
            return Character.valueOf(c11);
        }
        R invoke = selector.invoke(Character.valueOf(c11));
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                R invoke2 = selector.invoke(Character.valueOf(c12));
                if (invoke.compareTo(invoke2) < 0) {
                    c11 = c12;
                    invoke = invoke2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    @m80.k
    public static double[] m3(@m80.k double[] dArr, @m80.k double[] elements) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal m4(double[] dArr, x00.l<? super Double, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (double d11 : dArr) {
            valueOf = valueOf.add(selector.invoke(Double.valueOf(d11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static List<Byte> n(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return new a(bArr);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final String n0(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRange")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static final boolean[] n1(@m80.k boolean[] zArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        o.c(i12, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i11, i12);
        kotlin.jvm.internal.g0.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double n2(double[] dArr, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = a0.Ke(dArr);
        if (Ke == 0) {
            return Double.valueOf(d11);
        }
        R invoke = selector.invoke(Double.valueOf(d11));
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                double d12 = dArr[i11];
                R invoke2 = selector.invoke(Double.valueOf(d12));
                if (invoke.compareTo(invoke2) < 0) {
                    d11 = d12;
                    invoke = invoke2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    @m80.k
    public static final float[] n3(@m80.k float[] fArr, float f11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        copyOf[length] = f11;
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal n4(float[] fArr, x00.l<? super Float, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (float f11 : fArr) {
            valueOf = valueOf.add(selector.invoke(Float.valueOf(f11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static final List<Character> o(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return new h(cArr);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final String o0(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final byte[] o1(byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return f1(bArr, i11, i12);
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float o2(float[] fArr, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = a0.Le(fArr);
        if (Le == 0) {
            return Float.valueOf(f11);
        }
        R invoke = selector.invoke(Float.valueOf(f11));
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                float f12 = fArr[i11];
                R invoke2 = selector.invoke(Float.valueOf(f12));
                if (invoke.compareTo(invoke2) < 0) {
                    f11 = f12;
                    invoke = invoke2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    @m80.k
    public static final float[] o3(@m80.k float[] fArr, @m80.k Collection<Float> elements) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().floatValue();
            length++;
        }
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal o4(int[] iArr, x00.l<? super Integer, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (int i11 : iArr) {
            valueOf = valueOf.add(selector.invoke(Integer.valueOf(i11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static List<Double> p(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return new f(dArr);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final String p0(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final char[] p1(char[] cArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return g1(cArr, i11, i12);
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer p2(int[] iArr, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = a0.Me(iArr);
        if (Me == 0) {
            return Integer.valueOf(i11);
        }
        R invoke = selector.invoke(Integer.valueOf(i11));
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                R invoke2 = selector.invoke(Integer.valueOf(i13));
                if (invoke.compareTo(invoke2) < 0) {
                    i11 = i13;
                    invoke = invoke2;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    @m80.k
    public static float[] p3(@m80.k float[] fArr, @m80.k float[] elements) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal p4(long[] jArr, x00.l<? super Long, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (long j11 : jArr) {
            valueOf = valueOf.add(selector.invoke(Long.valueOf(j11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static final List<Float> q(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return new e(fArr);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final String q0(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final double[] q1(double[] dArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return h1(dArr, i11, i12);
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long q2(long[] jArr, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = a0.Ne(jArr);
        if (Ne == 0) {
            return Long.valueOf(j11);
        }
        R invoke = selector.invoke(Long.valueOf(j11));
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                R invoke2 = selector.invoke(Long.valueOf(j12));
                if (invoke.compareTo(invoke2) < 0) {
                    j11 = j12;
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @m80.k
    public static int[] q3(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i11;
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> BigDecimal q4(T[] tArr, x00.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (T t11 : tArr) {
            valueOf = valueOf.add(selector.invoke(t11));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static List<Integer> r(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return new c(iArr);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final String r0(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final float[] r1(float[] fArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return i1(fArr, i11, i12);
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T r2(T[] tArr, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int Oe = a0.Oe(tArr);
        if (Oe != 0) {
            R invoke = selector.invoke(t11);
            int i11 = 1;
            if (1 <= Oe) {
                while (true) {
                    T t12 = tArr[i11];
                    R invoke2 = selector.invoke(t12);
                    if (invoke.compareTo(invoke2) < 0) {
                        t11 = t12;
                        invoke = invoke2;
                    }
                    if (i11 == Oe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return t11;
    }

    @m80.k
    public static final int[] r3(@m80.k int[] iArr, @m80.k Collection<Integer> elements) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().intValue();
            length++;
        }
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal r4(short[] sArr, x00.l<? super Short, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (short s11 : sArr) {
            valueOf = valueOf.add(selector.invoke(Short.valueOf(s11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static List<Long> s(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return new d(jArr);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> String s0(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final int[] s1(int[] iArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return j1(iArr, i11, i12);
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short s2(short[] sArr, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = a0.Pe(sArr);
        if (Pe == 0) {
            return Short.valueOf(s11);
        }
        R invoke = selector.invoke(Short.valueOf(s11));
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                R invoke2 = selector.invoke(Short.valueOf(s12));
                if (invoke.compareTo(invoke2) < 0) {
                    s11 = s12;
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    @m80.k
    public static int[] s3(@m80.k int[] iArr, @m80.k int[] elements) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal s4(boolean[] zArr, x00.l<? super Boolean, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (boolean z11 : zArr) {
            valueOf = valueOf.add(selector.invoke(Boolean.valueOf(z11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static <T> List<T> t(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        List<T> a11 = b0.a(tArr);
        kotlin.jvm.internal.g0.o(a11, "asList(...)");
        return a11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final String t0(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final long[] t1(long[] jArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return k1(jArr, i11, i12);
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean t2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.ul(zArr, comparator);
    }

    @m80.k
    public static long[] t3(@m80.k long[] jArr, long j11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        copyOf[length] = j11;
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger t4(byte[] bArr, x00.l<? super Byte, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (byte b11 : bArr) {
            valueOf = valueOf.add(selector.invoke(Byte.valueOf(b11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static final List<Short> u(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return new b(sArr);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final String u0(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        return arrays;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final <T> T[] u1(T[] tArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (T[]) l1(tArr, i11, i12);
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte u2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.vl(bArr, comparator);
    }

    @m80.k
    public static final long[] u3(@m80.k long[] jArr, @m80.k Collection<Long> elements) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().longValue();
            length++;
        }
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger u4(char[] cArr, x00.l<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (char c11 : cArr) {
            valueOf = valueOf.add(selector.invoke(Character.valueOf(c11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static final List<Boolean> v(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return new g(zArr);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static byte[] v0(@m80.k byte[] bArr, @m80.k byte[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(bArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final short[] v1(short[] sArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return m1(sArr, i11, i12);
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character v2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.wl(cArr, comparator);
    }

    @m80.k
    public static long[] v3(@m80.k long[] jArr, @m80.k long[] elements) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger v4(double[] dArr, x00.l<? super Double, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (double d11 : dArr) {
            valueOf = valueOf.add(selector.invoke(Double.valueOf(d11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int w(@m80.k byte[] bArr, byte b11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return Arrays.binarySearch(bArr, i11, i12, b11);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static char[] w0(@m80.k char[] cArr, @m80.k char[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(cArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @w00.j(name = "copyOfRangeInline")
    @o00.f
    public static final boolean[] w1(boolean[] zArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return n1(zArr, i11, i12);
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double w2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.xl(dArr, comparator);
    }

    @m80.k
    public static <T> T[] w3(@m80.k T[] tArr, T t11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t11;
        kotlin.jvm.internal.g0.m(tArr2);
        return tArr2;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger w4(float[] fArr, x00.l<? super Float, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (float f11 : fArr) {
            valueOf = valueOf.add(selector.invoke(Float.valueOf(f11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int x(@m80.k char[] cArr, char c11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return Arrays.binarySearch(cArr, i11, i12, c11);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static double[] x0(@m80.k double[] dArr, @m80.k double[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(dArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @o00.f
    public static final byte x1(byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr[i11];
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float x2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.yl(fArr, comparator);
    }

    @m80.k
    public static final <T> T[] x3(@m80.k T[] tArr, @m80.k Collection<? extends T> elements) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.g0.m(tArr2);
        return tArr2;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger x4(int[] iArr, x00.l<? super Integer, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (int i11 : iArr) {
            valueOf = valueOf.add(selector.invoke(Integer.valueOf(i11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int y(@m80.k double[] dArr, double d11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return Arrays.binarySearch(dArr, i11, i12, d11);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static float[] y0(@m80.k float[] fArr, @m80.k float[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(fArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @o00.f
    public static final char y1(char[] cArr, int i11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr[i11];
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer y2(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.zl(iArr, comparator);
    }

    @m80.k
    public static <T> T[] y3(@m80.k T[] tArr, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        kotlin.jvm.internal.g0.m(tArr2);
        return tArr2;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger y4(long[] jArr, x00.l<? super Long, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (long j11 : jArr) {
            valueOf = valueOf.add(selector.invoke(Long.valueOf(j11)));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int z(@m80.k float[] fArr, float f11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return Arrays.binarySearch(fArr, i11, i12, f11);
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static int[] z0(@m80.k int[] iArr, @m80.k int[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        System.arraycopy(iArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    @o00.f
    public static final double z1(double[] dArr, int i11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr[i11];
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long z2(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a0.Al(jArr, comparator);
    }

    @m80.k
    public static final short[] z3(@m80.k short[] sArr, @m80.k Collection<Short> elements) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().shortValue();
            length++;
        }
        kotlin.jvm.internal.g0.m(copyOf);
        return copyOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> BigInteger z4(T[] tArr, x00.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (T t11 : tArr) {
            valueOf = valueOf.add(selector.invoke(t11));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }
}
