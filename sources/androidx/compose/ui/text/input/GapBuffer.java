package androidx.compose.ui.text.input;

import a00.q;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
/* loaded from: classes2.dex */
final class GapBuffer {

    @k
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(@k char[] cArr, int i11, int i12) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i11;
        this.gapEnd = i12;
    }

    private final void delete(int i11, int i12) {
        int i13 = this.gapStart;
        if (i11 < i13 && i12 <= i13) {
            int i14 = i13 - i12;
            char[] cArr = this.buffer;
            q.w0(cArr, cArr, this.gapEnd - i14, i12, i13);
            this.gapStart = i11;
            this.gapEnd -= i14;
            return;
        }
        if (i11 < i13 && i12 >= i13) {
            this.gapEnd = i12 + gapLength();
            this.gapStart = i11;
            return;
        }
        int gapLength = i11 + gapLength();
        int gapLength2 = i12 + gapLength();
        int i15 = this.gapEnd;
        char[] cArr2 = this.buffer;
        q.w0(cArr2, cArr2, this.gapStart, i15, gapLength);
        this.gapStart += gapLength - i15;
        this.gapEnd = gapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i11) {
        if (i11 <= gapLength()) {
            return;
        }
        int gapLength = i11 - gapLength();
        int i12 = this.capacity;
        do {
            i12 *= 2;
        } while (i12 - this.capacity < gapLength);
        char[] cArr = new char[i12];
        q.w0(this.buffer, cArr, 0, 0, this.gapStart);
        int i13 = this.capacity;
        int i14 = this.gapEnd;
        int i15 = i13 - i14;
        int i16 = i12 - i15;
        q.w0(this.buffer, cArr, i16, i14, i15 + i14);
        this.buffer = cArr;
        this.capacity = i12;
        this.gapEnd = i16;
    }

    public final void append(@k StringBuilder sb2) {
        sb2.append(this.buffer, 0, this.gapStart);
        g0.o(sb2, "append(...)");
        char[] cArr = this.buffer;
        int i11 = this.gapEnd;
        sb2.append(cArr, i11, this.capacity - i11);
        g0.o(sb2, "append(...)");
    }

    public final char get(int i11) {
        int i12 = this.gapStart;
        return i11 < i12 ? this.buffer[i11] : this.buffer[(i11 - i12) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i11, int i12, @k String str) {
        makeSureAvailableSpace(str.length() - (i12 - i11));
        delete(i11, i12);
        GapBufferKt.toCharArray(str, this.buffer, this.gapStart);
        this.gapStart += str.length();
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }
}
