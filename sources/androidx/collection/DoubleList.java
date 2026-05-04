package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import g10.l;
import g10.u;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.g;
import x00.p;
import x00.q;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleList\n*L\n1#1,983:1\n367#1:984\n370#1:985\n239#1,6:986\n267#1,6:992\n239#1,6:998\n76#1:1004\n239#1,6:1005\n367#1:1011\n239#1,6:1012\n239#1,6:1018\n253#1,6:1024\n267#1,6:1030\n281#1,6:1036\n253#1,6:1042\n253#1,6:1048\n281#1,6:1054\n367#1:1060\n72#1:1061\n267#1,6:1062\n281#1,6:1068\n65#1:1074\n253#1,6:1075\n253#1,6:1081\n239#1,6:1087\n76#1:1093\n488#1,10:1094\n253#1,4:1104\n498#1,9:1108\n258#1:1117\n507#1,2:1118\n488#1,10:1120\n253#1,4:1130\n498#1,9:1134\n258#1:1143\n507#1,2:1144\n488#1,10:1146\n253#1,4:1156\n498#1,9:1160\n258#1:1169\n507#1,2:1170\n488#1,10:1172\n253#1,4:1182\n498#1,9:1186\n258#1:1195\n507#1,2:1196\n488#1,10:1198\n253#1,4:1208\n498#1,9:1212\n258#1:1221\n507#1,2:1222\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleList\n*L\n80#1:984\n85#1:985\n91#1:986,6\n105#1:992,6\n115#1:998,6\n128#1:1004\n145#1:1005,6\n154#1:1011\n168#1:1012,6\n184#1:1018,6\n198#1:1024,6\n214#1:1030,6\n228#1:1036,6\n330#1:1042,6\n344#1:1048,6\n358#1:1054,6\n377#1:1060\n380#1:1061\n391#1:1062,6\n404#1:1068,6\n426#1:1074\n466#1:1075,6\n497#1:1081,6\n513#1:1087,6\n527#1:1093\n-1#1:1094,10\n-1#1:1104,4\n-1#1:1108,9\n-1#1:1117\n-1#1:1118,2\n-1#1:1120,10\n-1#1:1130,4\n-1#1:1134,9\n-1#1:1143\n-1#1:1144,2\n-1#1:1146,10\n-1#1:1156,4\n-1#1:1160,9\n-1#1:1169\n-1#1:1170,2\n-1#1:1172,10\n-1#1:1182,4\n-1#1:1186,9\n-1#1:1195\n-1#1:1196,2\n-1#1:1198,10\n-1#1:1208,4\n-1#1:1212,9\n-1#1:1221\n-1#1:1222,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class DoubleList {

    @g
    public int _size;

    @g
    @k
    public double[] content;

    public /* synthetic */ DoubleList(int i11, v vVar) {
        this(i11);
    }

    public static /* synthetic */ int binarySearch$default(DoubleList doubleList, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = doubleList._size;
        }
        return doubleList.binarySearch(i11, i12, i13);
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return doubleList.joinToString(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @w00.k
    public final int binarySearch(int i11) {
        return binarySearch$default(this, i11, 0, 0, 6, null);
    }

    public final boolean contains(double d11) {
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (dArr[i12] == d11) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@k DoubleList elements) {
        g0.p(elements, "elements");
        l W1 = u.W1(0, elements._size);
        int d11 = W1.d();
        int f11 = W1.f();
        if (d11 > f11) {
            return true;
        }
        while (contains(elements.get(d11))) {
            if (d11 == f11) {
                return true;
            }
            d11++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final double elementAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i11];
    }

    public final double elementAtOrElse(@IntRange(from = 0) int i11, @k x00.l<? super Integer, Double> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= this._size) ? defaultValue.invoke(Integer.valueOf(i11)).doubleValue() : this.content[i11];
    }

    public boolean equals(@m80.l Object obj) {
        if (obj instanceof DoubleList) {
            DoubleList doubleList = (DoubleList) obj;
            int i11 = doubleList._size;
            int i12 = this._size;
            if (i11 == i12) {
                double[] dArr = this.content;
                double[] dArr2 = doubleList.content;
                l W1 = u.W1(0, i12);
                int d11 = W1.d();
                int f11 = W1.f();
                if (d11 > f11) {
                    return true;
                }
                while (dArr[d11] == dArr2[d11]) {
                    if (d11 == f11) {
                        return true;
                    }
                    d11++;
                }
                return false;
            }
        }
        return false;
    }

    public final double first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r11, @k p<? super R, ? super Double, ? extends R> operation) {
        g0.p(operation, "operation");
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            r11 = operation.invoke(r11, Double.valueOf(dArr[i12]));
        }
        return r11;
    }

    public final <R> R foldIndexed(R r11, @k q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        g0.p(operation, "operation");
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            R r12 = r11;
            r11 = operation.invoke(Integer.valueOf(i12), r12, Double.valueOf(dArr[i12]));
        }
        return r11;
    }

    public final <R> R foldRight(R r11, @k p<? super Double, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        double[] dArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Double.valueOf(dArr[i11]), r11);
        }
    }

    public final <R> R foldRightIndexed(R r11, @k q<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        double[] dArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]), r11);
        }
    }

    public final void forEach(@k x00.l<? super Double, g2> block) {
        g0.p(block, "block");
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Double.valueOf(dArr[i12]));
        }
    }

    public final void forEachIndexed(@k p<? super Integer, ? super Double, g2> block) {
        g0.p(block, "block");
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Integer.valueOf(i12), Double.valueOf(dArr[i12]));
        }
    }

    public final void forEachReversed(@k x00.l<? super Double, g2> block) {
        g0.p(block, "block");
        double[] dArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Double.valueOf(dArr[i11]));
            }
        }
    }

    public final void forEachReversedIndexed(@k p<? super Integer, ? super Double, g2> block) {
        g0.p(block, "block");
        double[] dArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]));
            }
        }
    }

    public final double get(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i11];
    }

    @k
    public final l getIndices() {
        return u.W1(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += Double.hashCode(dArr[i13]) * 31;
        }
        return i12;
    }

    public final int indexOf(double d11) {
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (d11 == dArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@k x00.l<? super Double, Boolean> predicate) {
        g0.p(predicate, "predicate");
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(Double.valueOf(dArr[i12])).booleanValue()) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfLast(@k x00.l<? super Double, Boolean> predicate) {
        g0.p(predicate, "predicate");
        double[] dArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (!predicate.invoke(Double.valueOf(dArr[i11])).booleanValue());
        return i11;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @w00.k
    @k
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final double last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(double d11) {
        double[] dArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (dArr[i11] != d11);
        return i11;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@k x00.l<? super Double, Boolean> predicate) {
        g0.p(predicate, "predicate");
        double[] dArr = this.content;
        for (int i11 = this._size - 1; -1 < i11; i11--) {
            if (predicate.invoke(Double.valueOf(dArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private DoubleList(int i11) {
        this.content = i11 == 0 ? DoubleSetKt.getEmptyDoubleArray() : new double[i11];
    }

    public final boolean any(@k x00.l<? super Double, Boolean> predicate) {
        g0.p(predicate, "predicate");
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(Double.valueOf(dArr[i12])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @w00.k
    public final int binarySearch(int i11, int i12) {
        return binarySearch$default(this, i11, i12, 0, 4, null);
    }

    public final int count(@k x00.l<? super Double, Boolean> predicate) {
        g0.p(predicate, "predicate");
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (predicate.invoke(Double.valueOf(dArr[i13])).booleanValue()) {
                i12++;
            }
        }
        return i12;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator) {
        g0.p(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @w00.k
    public final int binarySearch(int i11, int i12, int i13) {
        if (i12 < 0 || i12 >= i13 || i13 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i14 = i13 - 1;
        while (i12 <= i14) {
            int i15 = (i12 + i14) >>> 1;
            double d11 = this.content[i15];
            double d12 = i11;
            if (d11 < d12) {
                i12 = i15 + 1;
            } else {
                if (d11 <= d12) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return -(i12 + 1);
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final double first(@k x00.l<? super Double, Boolean> predicate) {
        g0.p(predicate, "predicate");
        double[] dArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            double d11 = dArr[i12];
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return d11;
            }
        }
        throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, x00.l transform, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                separator = j2.O;
            }
            if ((i12 & 2) != 0) {
                prefix = "";
            }
            if ((i12 & 4) != 0) {
                postfix = "";
            }
            if ((i12 & 8) != 0) {
                i11 = -1;
            }
            if ((i12 & 16) != 0) {
                truncated = "...";
            }
            g0.p(separator, "separator");
            g0.p(prefix, "prefix");
            g0.p(postfix, "postfix");
            g0.p(truncated, "truncated");
            g0.p(transform, "transform");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(prefix);
            double[] dArr = doubleList.content;
            int i13 = doubleList._size;
            int i14 = 0;
            while (true) {
                if (i14 < i13) {
                    double d11 = dArr[i14];
                    if (i14 == i11) {
                        sb2.append(truncated);
                        break;
                    }
                    if (i14 != 0) {
                        sb2.append(separator);
                    }
                    sb2.append((CharSequence) transform.invoke(Double.valueOf(d11)));
                    i14++;
                } else {
                    sb2.append(postfix);
                    break;
                }
            }
            String sb3 = sb2.toString();
            g0.o(sb3, "toString(...)");
            return sb3;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i11, null, 16, null);
    }

    public final double last(@k x00.l<? super Double, Boolean> predicate) {
        double d11;
        g0.p(predicate, "predicate");
        double[] dArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 < i11) {
                d11 = dArr[i11];
            } else {
                throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Double.valueOf(d11)).booleanValue());
        return d11;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                double d11 = dArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(d11);
                i13++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @v0
    public static /* synthetic */ void getContent$annotations() {
    }

    @v0
    public static /* synthetic */ void get_size$annotations() {
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @k x00.l<? super Double, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                double d11 = dArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d11)));
                i13++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k x00.l<? super Double, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                double d11 = dArr[i13];
                if (i13 == i11) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d11)));
                i13++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, @k x00.l<? super Double, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                double d11 = dArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d11)));
                i12++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k x00.l<? super Double, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                double d11 = dArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d11)));
                i12++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k x00.l<? super Double, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                double d11 = dArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d11)));
                i12++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k x00.l<? super Double, ? extends CharSequence> transform) {
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                double d11 = dArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append((CharSequence) j2.O);
                }
                sb2.append(transform.invoke(Double.valueOf(d11)));
                i12++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}
