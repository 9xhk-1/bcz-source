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
@u0({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,968:1\n363#1:969\n366#1:970\n237#1,6:971\n265#1,6:977\n237#1,6:983\n74#1:989\n237#1,6:990\n363#1:996\n237#1,6:997\n237#1,6:1003\n251#1,6:1009\n265#1,6:1015\n279#1,6:1021\n251#1,6:1027\n251#1,6:1033\n279#1,6:1039\n363#1:1045\n70#1:1046\n265#1,6:1047\n279#1,6:1053\n65#1:1059\n251#1,6:1060\n251#1,6:1066\n237#1,6:1072\n74#1:1078\n484#1,10:1079\n251#1,4:1089\n494#1,9:1093\n256#1:1102\n503#1,2:1103\n484#1,10:1105\n251#1,4:1115\n494#1,9:1119\n256#1:1128\n503#1,2:1129\n484#1,10:1131\n251#1,4:1141\n494#1,9:1145\n256#1:1154\n503#1,2:1155\n484#1,10:1157\n251#1,4:1167\n494#1,9:1171\n256#1:1180\n503#1,2:1181\n484#1,10:1183\n251#1,4:1193\n494#1,9:1197\n256#1:1206\n503#1,2:1207\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n78#1:969\n83#1:970\n89#1:971,6\n103#1:977,6\n113#1:983,6\n126#1:989\n143#1:990,6\n152#1:996\n166#1:997,6\n182#1:1003,6\n196#1:1009,6\n212#1:1015,6\n226#1:1021,6\n328#1:1027,6\n341#1:1033,6\n354#1:1039,6\n373#1:1045\n376#1:1046\n387#1:1047,6\n400#1:1053,6\n422#1:1059\n462#1:1060,6\n493#1:1066,6\n509#1:1072,6\n522#1:1078\n-1#1:1079,10\n-1#1:1089,4\n-1#1:1093,9\n-1#1:1102\n-1#1:1103,2\n-1#1:1105,10\n-1#1:1115,4\n-1#1:1119,9\n-1#1:1128\n-1#1:1129,2\n-1#1:1131,10\n-1#1:1141,4\n-1#1:1145,9\n-1#1:1154\n-1#1:1155,2\n-1#1:1157,10\n-1#1:1167,4\n-1#1:1171,9\n-1#1:1180\n-1#1:1181,2\n-1#1:1183,10\n-1#1:1193,4\n-1#1:1197,9\n-1#1:1206\n-1#1:1207,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class IntList {

    @g
    public int _size;

    @g
    @k
    public int[] content;

    public /* synthetic */ IntList(int i11, v vVar) {
        this(i11);
    }

    public static /* synthetic */ int binarySearch$default(IntList intList, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = intList._size;
        }
        return intList.binarySearch(i11, i12, i13);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
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
        return intList.joinToString(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @w00.k
    public final int binarySearch(int i11) {
        return binarySearch$default(this, i11, 0, 0, 6, null);
    }

    public final boolean contains(int i11) {
        int[] iArr = this.content;
        int i12 = this._size;
        for (int i13 = 0; i13 < i12; i13++) {
            if (iArr[i13] == i11) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@k IntList elements) {
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

    public final int elementAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i11];
    }

    public final int elementAtOrElse(@IntRange(from = 0) int i11, @k x00.l<? super Integer, Integer> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= this._size) ? defaultValue.invoke(Integer.valueOf(i11)).intValue() : this.content[i11];
    }

    public boolean equals(@m80.l Object obj) {
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i11 = intList._size;
            int i12 = this._size;
            if (i11 == i12) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                l W1 = u.W1(0, i12);
                int d11 = W1.d();
                int f11 = W1.f();
                if (d11 > f11) {
                    return true;
                }
                while (iArr[d11] == iArr2[d11]) {
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

    public final int first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r11, @k p<? super R, ? super Integer, ? extends R> operation) {
        g0.p(operation, "operation");
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            r11 = operation.invoke(r11, Integer.valueOf(iArr[i12]));
        }
        return r11;
    }

    public final <R> R foldIndexed(R r11, @k q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        g0.p(operation, "operation");
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            R r12 = r11;
            r11 = operation.invoke(Integer.valueOf(i12), r12, Integer.valueOf(iArr[i12]));
        }
        return r11;
    }

    public final <R> R foldRight(R r11, @k p<? super Integer, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        int[] iArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Integer.valueOf(iArr[i11]), r11);
        }
    }

    public final <R> R foldRightIndexed(R r11, @k q<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        int[] iArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]), r11);
        }
    }

    public final void forEach(@k x00.l<? super Integer, g2> block) {
        g0.p(block, "block");
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Integer.valueOf(iArr[i12]));
        }
    }

    public final void forEachIndexed(@k p<? super Integer, ? super Integer, g2> block) {
        g0.p(block, "block");
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i12]));
        }
    }

    public final void forEachReversed(@k x00.l<? super Integer, g2> block) {
        g0.p(block, "block");
        int[] iArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Integer.valueOf(iArr[i11]));
            }
        }
    }

    public final void forEachReversedIndexed(@k p<? super Integer, ? super Integer, g2> block) {
        g0.p(block, "block");
        int[] iArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]));
            }
        }
    }

    public final int get(@IntRange(from = 0) int i11) {
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
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += Integer.hashCode(iArr[i13]) * 31;
        }
        return i12;
    }

    public final int indexOf(int i11) {
        int[] iArr = this.content;
        int i12 = this._size;
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 == iArr[i13]) {
                return i13;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@k x00.l<? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(Integer.valueOf(iArr[i12])).booleanValue()) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfLast(@k x00.l<? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (!predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue());
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

    public final int last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(int i11) {
        int[] iArr = this.content;
        int i12 = this._size;
        do {
            i12--;
            if (-1 >= i12) {
                return -1;
            }
        } while (iArr[i12] != i11);
        return i12;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@k x00.l<? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.content;
        for (int i11 = this._size - 1; -1 < i11; i11--) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private IntList(int i11) {
        this.content = i11 == 0 ? IntSetKt.getEmptyIntArray() : new int[i11];
    }

    public final boolean any(@k x00.l<? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(Integer.valueOf(iArr[i12])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @w00.k
    public final int binarySearch(int i11, int i12) {
        return binarySearch$default(this, i11, i12, 0, 4, null);
    }

    public final int count(@k x00.l<? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (predicate.invoke(Integer.valueOf(iArr[i13])).booleanValue()) {
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
            int i16 = this.content[i15];
            if (i16 < i11) {
                i12 = i15 + 1;
            } else {
                if (i16 <= i11) {
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

    public final int first(@k x00.l<? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (predicate.invoke(Integer.valueOf(i13)).booleanValue()) {
                return i13;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, x00.l transform, int i12, Object obj) {
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
            int[] iArr = intList.content;
            int i13 = intList._size;
            int i14 = 0;
            while (true) {
                if (i14 < i13) {
                    int i15 = iArr[i14];
                    if (i14 == i11) {
                        sb2.append(truncated);
                        break;
                    }
                    if (i14 != 0) {
                        sb2.append(separator);
                    }
                    sb2.append((CharSequence) transform.invoke(Integer.valueOf(i15)));
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

    public final int last(@k x00.l<? super Integer, Boolean> predicate) {
        int i11;
        g0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i12 = this._size;
        do {
            i12--;
            if (-1 < i12) {
                i11 = iArr[i12];
            } else {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Integer.valueOf(i11)).booleanValue());
        return i11;
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
        int[] iArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                int i14 = iArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(i14);
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @k x00.l<? super Integer, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                int i14 = iArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Integer.valueOf(i14)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k x00.l<? super Integer, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                int i14 = iArr[i13];
                if (i13 == i11) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Integer.valueOf(i14)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, @k x00.l<? super Integer, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                int i13 = iArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Integer.valueOf(i13)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k x00.l<? super Integer, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                int i13 = iArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Integer.valueOf(i13)));
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
    public final String joinToString(@k CharSequence separator, @k x00.l<? super Integer, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                int i13 = iArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Integer.valueOf(i13)));
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
    public final String joinToString(@k x00.l<? super Integer, ? extends CharSequence> transform) {
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                int i13 = iArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append((CharSequence) j2.O);
                }
                sb2.append(transform.invoke(Integer.valueOf(i13)));
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
