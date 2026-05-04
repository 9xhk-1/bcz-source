package androidx.core.content;

import android.content.res.Configuration;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(@m80.k Consumer<Configuration> consumer);

    void removeOnConfigurationChangedListener(@m80.k Consumer<Configuration> consumer);
}
