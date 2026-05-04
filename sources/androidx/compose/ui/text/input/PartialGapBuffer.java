package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@InternalTextApi
@u0({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/PartialGapBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,318:1\n114#2,8:319\n114#2,8:327\n*S KotlinDebug\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/PartialGapBuffer\n*L\n242#1:319,8\n245#1:327,8\n*E\n"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    @l
    private GapBuffer buffer;

    @k
    private String text;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public PartialGapBuffer(@k String str) {
        this.text = str;
    }

    public final char get(int i11) {
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

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final void replace(int i11, int i12, @k String str) {
        if (!(i11 <= i12)) {
            InlineClassHelperKt.throwIllegalArgumentException("start index must be less than or equal to end index: " + i11 + " > " + i12);
        }
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i11);
        }
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer != null) {
            int i13 = this.bufStart;
            int i14 = i11 - i13;
            int i15 = i12 - i13;
            if (i14 >= 0 && i15 <= gapBuffer.length()) {
                gapBuffer.replace(i14, i15, str);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i11, i12, str);
            return;
        }
        int max = Math.max(255, str.length() + 128);
        char[] cArr = new char[max];
        int min = Math.min(i11, 64);
        int min2 = Math.min(this.text.length() - i12, 64);
        int i16 = i11 - min;
        GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i16, i11);
        int i17 = max - min2;
        int i18 = min2 + i12;
        GapBuffer_jvmKt.toCharArray(this.text, cArr, i17, i12, i18);
        GapBufferKt.toCharArray(str, cArr, min);
        this.buffer = new GapBuffer(cArr, min + str.length(), i17);
        this.bufStart = i16;
        this.bufEnd = i18;
    }

    public final void setText(@k String str) {
        this.text = str;
    }

    @k
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb2);
        String str = this.text;
        sb2.append((CharSequence) str, this.bufEnd, str.length());
        return sb2.toString();
    }
}
