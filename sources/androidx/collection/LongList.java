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
@u0({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,972:1\n364#1:973\n367#1:974\n237#1,6:975\n265#1,6:981\n237#1,6:987\n74#1:993\n237#1,6:994\n364#1:1000\n237#1,6:1001\n237#1,6:1007\n251#1,6:1013\n265#1,6:1019\n279#1,6:1025\n251#1,6:1031\n251#1,6:1037\n279#1,6:1043\n364#1:1049\n70#1:1050\n265#1,6:1051\n279#1,6:1057\n65#1:1063\n251#1,6:1064\n251#1,6:1070\n237#1,6:1076\n74#1:1082\n485#1,10:1083\n251#1,4:1093\n495#1,9:1097\n256#1:1106\n504#1,2:1107\n485#1,10:1109\n251#1,4:1119\n495#1,9:1123\n256#1:1132\n504#1,2:1133\n485#1,10:1135\n251#1,4:1145\n495#1,9:1149\n256#1:1158\n504#1,2:1159\n485#1,10:1161\n251#1,4:1171\n495#1,9:1175\n256#1:1184\n504#1,2:1185\n485#1,10:1187\n251#1,4:1197\n495#1,9:1201\n256#1:1210\n504#1,2:1211\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n78#1:973\n83#1:974\n89#1:975,6\n103#1:981,6\n113#1:987,6\n126#1:993\n143#1:994,6\n152#1:1000\n166#1:1001,6\n182#1:1007,6\n196#1:1013,6\n212#1:1019,6\n226#1:1025,6\n328#1:1031,6\n342#1:1037,6\n355#1:1043,6\n374#1:1049\n377#1:1050\n388#1:1051,6\n401#1:1057,6\n423#1:1063\n463#1:1064,6\n494#1:1070,6\n510#1:1076,6\n523#1:1082\n-1#1:1083,10\n-1#1:1093,4\n-1#1:1097,9\n-1#1:1106\n-1#1:1107,2\n-1#1:1109,10\n-1#1:1119,4\n-1#1:1123,9\n-1#1:1132\n-1#1:1133,2\n-1#1:1135,10\n-1#1:1145,4\n-1#1:1149,9\n-1#1:1158\n-1#1:1159,2\n-1#1:1161,10\n-1#1:1171,4\n-1#1:1175,9\n-1#1:1184\n-1#1:1185,2\n-1#1:1187,10\n-1#1:1197,4\n-1#1:1201,9\n-1#1:1210\n-1#1:1211,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class LongList {

    @g
    public int _size;

    @g
    @k
    public long[] content;

    public /* synthetic */ LongList(int i11, v vVar) {
        this(i11);
    }

    public static /* synthetic */ int binarySearch$default(LongList longList, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = longList._size;
        }
        return longList.binarySearch(i11, i12, i13);
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
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
        return longList.joinToString(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @w00.k
    public final int binarySearch(int i11) {
        return binarySearch$default(this, i11, 0, 0, 6, null);
    }

    public final boolean contains(long j11) {
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (jArr[i12] == j11) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@k LongList elements) {
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

    public final long elementAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i11];
    }

    public final long elementAtOrElse(@IntRange(from = 0) int i11, @k x00.l<? super Integer, Long> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= this._size) ? defaultValue.invoke(Integer.valueOf(i11)).longValue() : this.content[i11];
    }

    public boolean equals(@m80.l Object obj) {
        if (obj instanceof LongList) {
            LongList longList = (LongList) obj;
            int i11 = longList._size;
            int i12 = this._size;
            if (i11 == i12) {
                long[] jArr = this.content;
                long[] jArr2 = longList.content;
                l W1 = u.W1(0, i12);
                int d11 = W1.d();
                int f11 = W1.f();
                if (d11 > f11) {
                    return true;
                }
                while (jArr[d11] == jArr2[d11]) {
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

    public final long first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("LongList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r11, @k p<? super R, ? super Long, ? extends R> operation) {
        g0.p(operation, "operation");
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            r11 = operation.invoke(r11, Long.valueOf(jArr[i12]));
        }
        return r11;
    }

    public final <R> R foldIndexed(R r11, @k q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        g0.p(operation, "operation");
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            R r12 = r11;
            r11 = operation.invoke(Integer.valueOf(i12), r12, Long.valueOf(jArr[i12]));
        }
        return r11;
    }

    public final <R> R foldRight(R r11, @k p<? super Long, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        long[] jArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Long.valueOf(jArr[i11]), r11);
        }
    }

    public final <R> R foldRightIndexed(R r11, @k q<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        long[] jArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i11]), r11);
        }
    }

    public final void forEach(@k x00.l<? super Long, g2> block) {
        g0.p(block, "block");
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Long.valueOf(jArr[i12]));
        }
    }

    public final void forEachIndexed(@k p<? super Integer, ? super Long, g2> block) {
        g0.p(block, "block");
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Integer.valueOf(i12), Long.valueOf(jArr[i12]));
        }
    }

    public final void forEachReversed(@k x00.l<? super Long, g2> block) {
        g0.p(block, "block");
        long[] jArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Long.valueOf(jArr[i11]));
            }
        }
    }

    public final void forEachReversedIndexed(@k p<? super Integer, ? super Long, g2> block) {
        g0.p(block, "block");
        long[] jArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i11]));
            }
        }
    }

    public final long get(@IntRange(from = 0) int i11) {
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
        long[] jArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += Long.hashCode(jArr[i13]) * 31;
        }
        return i12;
    }

    public final int indexOf(long j11) {
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (j11 == jArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@k x00.l<? super Long, Boolean> predicate) {
        g0.p(predicate, "predicate");
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(Long.valueOf(jArr[i12])).booleanValue()) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfLast(@k x00.l<? super Long, Boolean> predicate) {
        g0.p(predicate, "predicate");
        long[] jArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (!predicate.invoke(Long.valueOf(jArr[i11])).booleanValue());
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

    public final long last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("LongList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(long j11) {
        long[] jArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (jArr[i11] != j11);
        return i11;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@k x00.l<? super Long, Boolean> predicate) {
        g0.p(predicate, "predicate");
        long[] jArr = this.content;
        for (int i11 = this._size - 1; -1 < i11; i11--) {
            if (predicate.invoke(Long.valueOf(jArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongList(int i11) {
        this.content = i11 == 0 ? LongSetKt.getEmptyLongArray() : new long[i11];
    }

    public final boolean any(@k x00.l<? super Long, Boolean> predicate) {
        g0.p(predicate, "predicate");
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(Long.valueOf(jArr[i12])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @w00.k
    public final int binarySearch(int i11, int i12) {
        return binarySearch$default(this, i11, i12, 0, 4, null);
    }

    public final int count(@k x00.l<? super Long, Boolean> predicate) {
        g0.p(predicate, "predicate");
        long[] jArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (predicate.invoke(Long.valueOf(jArr[i13])).booleanValue()) {
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
            long j11 = this.content[i15];
            long j12 = i11;
            if (j11 < j12) {
                i12 = i15 + 1;
            } else {
                if (j11 <= j12) {
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

    public final long first(@k x00.l<? super Long, Boolean> predicate) {
        g0.p(predicate, "predicate");
        long[] jArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jArr[i12];
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return j11;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, x00.l transform, int i12, Object obj) {
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
            long[] jArr = longList.content;
            int i13 = longList._size;
            int i14 = 0;
            while (true) {
                if (i14 < i13) {
                    long j11 = jArr[i14];
                    if (i14 == i11) {
                        sb2.append(truncated);
                        break;
                    }
                    if (i14 != 0) {
                        sb2.append(separator);
                    }
                    sb2.append((CharSequence) transform.invoke(Long.valueOf(j11)));
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

    public final long last(@k x00.l<? super Long, Boolean> predicate) {
        long j11;
        g0.p(predicate, "predicate");
        long[] jArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 < i11) {
                j11 = jArr[i11];
            } else {
                throw new NoSuchElementException("LongList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Long.valueOf(j11)).booleanValue());
        return j11;
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
        long[] jArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                long j11 = jArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(j11);
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @k x00.l<? super Long, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                long j11 = jArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Long.valueOf(j11)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k x00.l<? super Long, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                long j11 = jArr[i13];
                if (i13 == i11) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Long.valueOf(j11)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, @k x00.l<? super Long, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                long j11 = jArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Long.valueOf(j11)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k x00.l<? super Long, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                long j11 = jArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Long.valueOf(j11)));
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
    public final String joinToString(@k CharSequence separator, @k x00.l<? super Long, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                long j11 = jArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Long.valueOf(j11)));
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
    public final String joinToString(@k x00.l<? super Long, ? extends CharSequence> transform) {
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                long j11 = jArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append((CharSequence) j2.O);
                }
                sb2.append(transform.invoke(Long.valueOf(j11)));
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
