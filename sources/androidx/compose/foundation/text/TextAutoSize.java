package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnitKt;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface TextAutoSize {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: StepBased-vU-0ePk$default, reason: not valid java name */
        public static /* synthetic */ TextAutoSize m1122StepBasedvU0ePk$default(Companion companion, long j11, long j12, long j13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = TextAutoSizeDefaults.INSTANCE.m1125getMinFontSizeXSAIIZE();
            }
            long j14 = j11;
            if ((i11 & 2) != 0) {
                j12 = TextAutoSizeDefaults.INSTANCE.m1124getMaxFontSizeXSAIIZE();
            }
            long j15 = j12;
            if ((i11 & 4) != 0) {
                j13 = TextUnitKt.getSp(0.25d);
            }
            return companion.m1123StepBasedvU0ePk(j14, j15, j13);
        }

        @k
        /* renamed from: StepBased-vU-0ePk, reason: not valid java name */
        public final TextAutoSize m1123StepBasedvU0ePk(long j11, long j12, long j13) {
            return new AutoSizeStepBased(j11, j12, j13, null);
        }
    }

    boolean equals(@l Object obj);

    /* renamed from: getFontSize-Ci0_558 */
    long mo1023getFontSizeCi0_558(@k TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j11, @k AnnotatedString annotatedString);

    int hashCode();
}
