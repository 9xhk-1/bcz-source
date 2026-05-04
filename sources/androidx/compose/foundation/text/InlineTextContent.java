package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import m80.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;

    @k
    private final q<String, Composer, Integer, g2> children;

    @k
    private final Placeholder placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineTextContent(@k Placeholder placeholder, @k q<? super String, ? super Composer, ? super Integer, g2> qVar) {
        this.placeholder = placeholder;
        this.children = qVar;
    }

    @k
    public final q<String, Composer, Integer, g2> getChildren() {
        return this.children;
    }

    @k
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
