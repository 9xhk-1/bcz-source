package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsPropertiesAndroid {

    @k
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();

    @k
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new p<Boolean, Boolean, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final Boolean invoke(Boolean bool, boolean z11) {
            return bool;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return invoke(bool, bool2.booleanValue());
        }
    });
    public static final int $stable = 8;

    private SemanticsPropertiesAndroid() {
    }

    @k
    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }

    public static /* synthetic */ void getTestTagsAsResourceId$annotations() {
    }
}
