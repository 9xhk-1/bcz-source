package coil.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@Immutable
/* loaded from: classes3.dex */
public interface p extends BoxScope {
    @m80.k
    ContentScale a();

    @m80.k
    AsyncImagePainter b();

    @m80.k
    Alignment getAlignment();

    float getAlpha();

    boolean getClipToBounds();

    @m80.l
    ColorFilter getColorFilter();

    @m80.l
    String getContentDescription();
}
