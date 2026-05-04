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
@u0({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,976:1\n365#1:977\n368#1:978\n237#1,6:979\n265#1,6:985\n237#1,6:991\n74#1:997\n237#1,6:998\n365#1:1004\n237#1,6:1005\n237#1,6:1011\n251#1,6:1017\n265#1,6:1023\n279#1,6:1029\n251#1,6:1035\n251#1,6:1041\n279#1,6:1047\n365#1:1053\n70#1:1054\n265#1,6:1055\n279#1,6:1061\n65#1:1067\n251#1,6:1068\n251#1,6:1074\n237#1,6:1080\n74#1:1086\n486#1,10:1087\n251#1,4:1097\n496#1,9:1101\n256#1:1110\n505#1,2:1111\n486#1,10:1113\n251#1,4:1123\n496#1,9:1127\n256#1:1136\n505#1,2:1137\n486#1,10:1139\n251#1,4:1149\n496#1,9:1153\n256#1:1162\n505#1,2:1163\n486#1,10:1165\n251#1,4:1175\n496#1,9:1179\n256#1:1188\n505#1,2:1189\n486#1,10:1191\n251#1,4:1201\n496#1,9:1205\n256#1:1214\n505#1,2:1215\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n78#1:977\n83#1:978\n89#1:979,6\n103#1:985,6\n113#1:991,6\n126#1:997\n143#1:998,6\n152#1:1004\n166#1:1005,6\n182#1:1011,6\n196#1:1017,6\n212#1:1023,6\n226#1:1029,6\n328#1:1035,6\n342#1:1041,6\n356#1:1047,6\n375#1:1053\n378#1:1054\n389#1:1055,6\n402#1:1061,6\n424#1:1067\n464#1:1068,6\n495#1:1074,6\n511#1:1080,6\n524#1:1086\n-1#1:1087,10\n-1#1:1097,4\n-1#1:1101,9\n-1#1:1110\n-1#1:1111,2\n-1#1:1113,10\n-1#1:1123,4\n-1#1:1127,9\n-1#1:1136\n-1#1:1137,2\n-1#1:1139,10\n-1#1:1149,4\n-1#1:1153,9\n-1#1:1162\n-1#1:1163,2\n-1#1:1165,10\n-1#1:1175,4\n-1#1:1179,9\n-1#1:1188\n-1#1:1189,2\n-1#1:1191,10\n-1#1:1201,4\n-1#1:1205,9\n-1#1:1214\n-1#1:1215,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatList {

    @g
    public int _size;

    @g
    @k
    public float[] content;

    public /* synthetic */ FloatList(int i11, v vVar) {
        this(i11);
    }

    public static /* synthetic */ int binarySearch$default(FloatList floatList, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = floatList._size;
        }
        return floatList.binarySearch(i11, i12, i13);
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
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
        return floatList.joinToString(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @w00.k
    public final int binarySearch(int i11) {
        return binarySearch$default(this, i11, 0, 0, 6, null);
    }

    public final boolean contains(float f11) {
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (fArr[i12] == f11) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@k FloatList elements) {
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

    public final float elementAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i11];
    }

    public final float elementAtOrElse(@IntRange(from = 0) int i11, @k x00.l<? super Integer, Float> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= this._size) ? defaultValue.invoke(Integer.valueOf(i11)).floatValue() : this.content[i11];
    }

    public boolean equals(@m80.l Object obj) {
        if (obj instanceof FloatList) {
            FloatList floatList = (FloatList) obj;
            int i11 = floatList._size;
            int i12 = this._size;
            if (i11 == i12) {
                float[] fArr = this.content;
                float[] fArr2 = floatList.content;
                l W1 = u.W1(0, i12);
                int d11 = W1.d();
                int f11 = W1.f();
                if (d11 > f11) {
                    return true;
                }
                while (fArr[d11] == fArr2[d11]) {
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

    public final float first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("FloatList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r11, @k p<? super R, ? super Float, ? extends R> operation) {
        g0.p(operation, "operation");
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            r11 = operation.invoke(r11, Float.valueOf(fArr[i12]));
        }
        return r11;
    }

    public final <R> R foldIndexed(R r11, @k q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        g0.p(operation, "operation");
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            R r12 = r11;
            r11 = operation.invoke(Integer.valueOf(i12), r12, Float.valueOf(fArr[i12]));
        }
        return r11;
    }

    public final <R> R foldRight(R r11, @k p<? super Float, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        float[] fArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Float.valueOf(fArr[i11]), r11);
        }
    }

    public final <R> R foldRightIndexed(R r11, @k q<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        g0.p(operation, "operation");
        float[] fArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return r11;
            }
            r11 = operation.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]), r11);
        }
    }

    public final void forEach(@k x00.l<? super Float, g2> block) {
        g0.p(block, "block");
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Float.valueOf(fArr[i12]));
        }
    }

    public final void forEachIndexed(@k p<? super Integer, ? super Float, g2> block) {
        g0.p(block, "block");
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(Integer.valueOf(i12), Float.valueOf(fArr[i12]));
        }
    }

    public final void forEachReversed(@k x00.l<? super Float, g2> block) {
        g0.p(block, "block");
        float[] fArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Float.valueOf(fArr[i11]));
            }
        }
    }

    public final void forEachReversedIndexed(@k p<? super Integer, ? super Float, g2> block) {
        g0.p(block, "block");
        float[] fArr = this.content;
        int i11 = this._size;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            } else {
                block.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]));
            }
        }
    }

    public final float get(@IntRange(from = 0) int i11) {
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
        float[] fArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += Float.hashCode(fArr[i13]) * 31;
        }
        return i12;
    }

    public final int indexOf(float f11) {
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (f11 == fArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@k x00.l<? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(Float.valueOf(fArr[i12])).booleanValue()) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfLast(@k x00.l<? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (!predicate.invoke(Float.valueOf(fArr[i11])).booleanValue());
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

    public final float last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("FloatList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(float f11) {
        float[] fArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (fArr[i11] != f11);
        return i11;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@k x00.l<? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.content;
        for (int i11 = this._size - 1; -1 < i11; i11--) {
            if (predicate.invoke(Float.valueOf(fArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private FloatList(int i11) {
        this.content = i11 == 0 ? FloatSetKt.getEmptyFloatArray() : new float[i11];
    }

    public final boolean any(@k x00.l<? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (predicate.invoke(Float.valueOf(fArr[i12])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @w00.k
    public final int binarySearch(int i11, int i12) {
        return binarySearch$default(this, i11, i12, 0, 4, null);
    }

    public final int count(@k x00.l<? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (predicate.invoke(Float.valueOf(fArr[i13])).booleanValue()) {
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
            float f11 = this.content[i15];
            float f12 = i11;
            if (f11 < f12) {
                i12 = i15 + 1;
            } else {
                if (f11 <= f12) {
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

    public final float first(@k x00.l<? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            float f11 = fArr[i12];
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return f11;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, x00.l transform, int i12, Object obj) {
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
            float[] fArr = floatList.content;
            int i13 = floatList._size;
            int i14 = 0;
            while (true) {
                if (i14 < i13) {
                    float f11 = fArr[i14];
                    if (i14 == i11) {
                        sb2.append(truncated);
                        break;
                    }
                    if (i14 != 0) {
                        sb2.append(separator);
                    }
                    sb2.append((CharSequence) transform.invoke(Float.valueOf(f11)));
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

    public final float last(@k x00.l<? super Float, Boolean> predicate) {
        float f11;
        g0.p(predicate, "predicate");
        float[] fArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 < i11) {
                f11 = fArr[i11];
            } else {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Float.valueOf(f11)).booleanValue());
        return f11;
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
        float[] fArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                float f11 = fArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(f11);
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @k x00.l<? super Float, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                float f11 = fArr[i13];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Float.valueOf(f11)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k x00.l<? super Float, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.content;
        int i12 = this._size;
        int i13 = 0;
        while (true) {
            if (i13 < i12) {
                float f11 = fArr[i13];
                if (i13 == i11) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Float.valueOf(f11)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, @k x00.l<? super Float, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                float f11 = fArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Float.valueOf(f11)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k x00.l<? super Float, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                float f11 = fArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Float.valueOf(f11)));
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
    public final String joinToString(@k CharSequence separator, @k x00.l<? super Float, ? extends CharSequence> transform) {
        g0.p(separator, "separator");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                float f11 = fArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Float.valueOf(f11)));
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
    public final String joinToString(@k x00.l<? super Float, ? extends CharSequence> transform) {
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                float f11 = fArr[i12];
                if (i12 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append((CharSequence) j2.O);
                }
                sb2.append(transform.invoke(Float.valueOf(f11)));
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
