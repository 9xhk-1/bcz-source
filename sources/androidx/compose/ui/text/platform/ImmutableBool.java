package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ImmutableBool implements State<Boolean> {
    private final boolean value;

    public ImmutableBool(boolean z11) {
        this.value = z11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @k
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
