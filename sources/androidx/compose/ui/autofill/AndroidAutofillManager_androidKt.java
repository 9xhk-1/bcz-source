package androidx.compose.ui.autofill;

import androidx.collection.MutableScatterMap;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidAutofillManager_androidKt {

    @m80.k
    private static final String logTag = "ComposeAutofillManager";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutofillable(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsActions.INSTANCE.getOnAutofillText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutoCommit(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutofill(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.getProps$ui_release().contains(SemanticsActions.INSTANCE.getOnAutofillText())) {
            return true;
        }
        MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release = semanticsConfiguration.getProps$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return props$ui_release.contains(semanticsProperties.getContentType()) || semanticsConfiguration.getProps$ui_release().contains(semanticsProperties.getContentDataType());
    }
}
