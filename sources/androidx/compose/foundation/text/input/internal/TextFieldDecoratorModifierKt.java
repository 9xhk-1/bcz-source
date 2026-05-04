package androidx.compose.foundation.text.input.internal;

import a00.v1;
import androidx.compose.foundation.content.MediaType;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierKt {

    @m80.k
    private static final Set<MediaType> MediaTypesAll;

    @m80.k
    private static final Set<MediaType> MediaTypesText;

    static {
        MediaType.Companion companion = MediaType.Companion;
        MediaTypesText = v1.f(companion.getText());
        MediaTypesAll = v1.f(companion.getAll());
    }

    private static /* synthetic */ void getMediaTypesAll$annotations() {
    }

    private static /* synthetic */ void getMediaTypesText$annotations() {
    }
}
