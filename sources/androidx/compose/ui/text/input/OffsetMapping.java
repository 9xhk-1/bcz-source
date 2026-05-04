package androidx.compose.ui.text.input;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface OffsetMapping {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final OffsetMapping Identity = new OffsetMapping() { // from class: androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int i11) {
                return i11;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int i11) {
                return i11;
            }
        };

        private Companion() {
        }

        @k
        public final OffsetMapping getIdentity() {
            return Identity;
        }
    }

    int originalToTransformed(int i11);

    int transformedToOriginal(int i11);
}
