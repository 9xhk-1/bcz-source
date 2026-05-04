package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.VisualTransformation;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public interface VisualTransformation {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    @k
    TransformedText filter(@k AnnotatedString annotatedString);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final VisualTransformation None = new VisualTransformation() { // from class: androidx.compose.ui.text.input.f
            @Override // androidx.compose.ui.text.input.VisualTransformation
            public final TransformedText filter(AnnotatedString annotatedString) {
                TransformedText None$lambda$0;
                None$lambda$0 = VisualTransformation.Companion.None$lambda$0(annotatedString);
                return None$lambda$0;
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText None$lambda$0(AnnotatedString annotatedString) {
            return new TransformedText(annotatedString, OffsetMapping.Companion.getIdentity());
        }

        @k
        public final VisualTransformation getNone() {
            return None;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
