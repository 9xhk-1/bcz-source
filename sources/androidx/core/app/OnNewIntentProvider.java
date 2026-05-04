package androidx.core.app;

import android.content.Intent;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface OnNewIntentProvider {
    void addOnNewIntentListener(@m80.k Consumer<Intent> consumer);

    void removeOnNewIntentListener(@m80.k Consumer<Intent> consumer);
}
