package androidx.compose.ui.text.android.selection;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface SegmentFinder {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DONE = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DONE = -1;

        private Companion() {
        }
    }

    int nextEndBoundary(int i11);

    int nextStartBoundary(int i11);

    int previousEndBoundary(int i11);

    int previousStartBoundary(int i11);
}
