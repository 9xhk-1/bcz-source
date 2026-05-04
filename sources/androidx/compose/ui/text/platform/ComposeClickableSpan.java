package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ComposeClickableSpan extends ClickableSpan {

    @k
    private final LinkAnnotation link;

    public ComposeClickableSpan(@k LinkAnnotation linkAnnotation) {
        this.link = linkAnnotation;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@k View view) {
        LinkInteractionListener linkInteractionListener = this.link.getLinkInteractionListener();
        if (linkInteractionListener != null) {
            linkInteractionListener.onClick(this.link);
        }
    }
}
