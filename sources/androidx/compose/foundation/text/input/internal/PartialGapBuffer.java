package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,316:1\n96#2,5:317\n96#2,5:322\n96#2,5:327\n96#2,5:332\n*S KotlinDebug\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n*L\n231#1:317,5\n232#1:322,5\n233#1:327,5\n234#1:332,5\n*E\n"})
/* loaded from: classes.dex */
public final class PartialGapBuffer implements CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    @m80.l
    private GapBuffer buffer;

    @m80.k
    private CharSequence text;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public PartialGapBuffer(@m80.k CharSequence charSequence) {
        this.text = charSequence;
    }

    public static /* synthetic */ void replace$default(PartialGapBuffer partialGapBuffer, int i11, int i12, CharSequence charSequence, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i13 = 0;
        }
        int i16 = i13;
        if ((i15 & 16) != 0) {
            i14 = charSequence.length();
        }
        partialGapBuffer.replace(i11, i12, charSequence, i16, i14);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return get(i11);
    }

    public final boolean contentEquals(@m80.k CharSequence charSequence) {
        return kotlin.jvm.internal.g0.g(toString(), charSequence.toString());
    }

    public char get(int i11) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i11);
        }
        if (i11 < this.bufStart) {
            return this.text.charAt(i11);
        }
        int length = gapBuffer.length();
        int i12 = this.bufStart;
        return i11 < length + i12 ? gapBuffer.get(i11 - i12) : this.text.charAt(i11 - ((length - this.bufEnd) + i12));
    }

    public int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final void replace(int i11, int i12, @m80.k CharSequence charSequence, int i13, int i14) {
        if (!(i11 <= i12)) {
            InlineClassHelperKt.throwIllegalArgumentException("start=" + i11 + " > end=" + i12);
        }
        if (!(i13 <= i14)) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart=" + i13 + " > textEnd=" + i14);
        }
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i11);
        }
        if (!(i13 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart must be non-negative, but was " + i13);
        }
        GapBuffer gapBuffer = this.buffer;
        int i15 = i14 - i13;
        if (gapBuffer != null) {
            int i16 = this.bufStart;
            int i17 = i11 - i16;
            int i18 = i12 - i16;
            if (i17 >= 0 && i18 <= gapBuffer.length()) {
                gapBuffer.replace(i17, i18, charSequence, i13, i14);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i11, i12, charSequence, i13, i14);
            return;
        }
        int max = Math.max(255, i15 + 128);
        char[] cArr = new char[max];
        int min = Math.min(i11, 64);
        int min2 = Math.min(this.text.length() - i12, 64);
        int i19 = i11 - min;
        ToCharArray_androidKt.toCharArray(this.text, cArr, 0, i19, i11);
        int i21 = max - min2;
        int i22 = min2 + i12;
        ToCharArray_androidKt.toCharArray(this.text, cArr, i21, i12, i22);
        ToCharArray_androidKt.toCharArray(charSequence, cArr, min, i13, i14);
        this.buffer = new GapBuffer(cArr, min + i15, i21);
        this.bufStart = i19;
        this.bufEnd = i22;
    }

    @Override // java.lang.CharSequence
    @m80.k
    public CharSequence subSequence(int i11, int i12) {
        return toString().subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    @m80.k
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.text, 0, this.bufStart);
        gapBuffer.append(sb2);
        CharSequence charSequence = this.text;
        sb2.append(charSequence, this.bufEnd, charSequence.length());
        return sb2.toString();
    }
}
