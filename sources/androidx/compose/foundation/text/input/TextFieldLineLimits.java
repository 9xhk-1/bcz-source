package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface TextFieldLineLimits {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final TextFieldLineLimits Default;

        static {
            int i11 = 0;
            Default = new MultiLine(i11, i11, 3, null);
        }

        private Companion() {
        }

        @k
        public final TextFieldLineLimits getDefault() {
            return Default;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTextFieldLineLimits.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLineLimits.kt\nandroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,91:1\n96#2,5:92\n*S KotlinDebug\n*F\n+ 1 TextFieldLineLimits.kt\nandroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine\n*L\n61#1:92,5\n*E\n"})
    @Immutable
    public static final class MultiLine implements TextFieldLineLimits {
        public static final int $stable = 0;
        private final int maxHeightInLines;
        private final int minHeightInLines;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MultiLine() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldLineLimits.MultiLine.<init>():void");
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MultiLine.class != obj.getClass()) {
                return false;
            }
            MultiLine multiLine = (MultiLine) obj;
            return this.minHeightInLines == multiLine.minHeightInLines && this.maxHeightInLines == multiLine.maxHeightInLines;
        }

        public final int getMaxHeightInLines() {
            return this.maxHeightInLines;
        }

        public final int getMinHeightInLines() {
            return this.minHeightInLines;
        }

        public int hashCode() {
            return (this.minHeightInLines * 31) + this.maxHeightInLines;
        }

        @k
        public String toString() {
            return "MultiLine(minHeightInLines=" + this.minHeightInLines + ", maxHeightInLines=" + this.maxHeightInLines + ')';
        }

        public MultiLine(int i11, int i12) {
            this.minHeightInLines = i11;
            this.maxHeightInLines = i12;
            boolean z11 = false;
            if (1 <= i11 && i11 <= i12) {
                z11 = true;
            }
            if (z11) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i11 + j2.O + i12);
        }

        public /* synthetic */ MultiLine(int i11, int i12, int i13, v vVar) {
            this((i13 & 1) != 0 ? 1 : i11, (i13 & 2) != 0 ? Integer.MAX_VALUE : i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class SingleLine implements TextFieldLineLimits {
        public static final int $stable = 0;

        @k
        public static final SingleLine INSTANCE = new SingleLine();

        private SingleLine() {
        }

        @k
        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }
}
