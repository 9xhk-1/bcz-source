package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MultiWindowModeChangedInfo {
    private final boolean isInMultiWindowMode;

    @m80.l
    @RequiresApi(26)
    private Configuration newConfiguration;

    public MultiWindowModeChangedInfo(boolean z11) {
        this.isInMultiWindowMode = z11;
    }

    @RequiresApi(26)
    @m80.k
    public final Configuration getNewConfig() {
        Configuration configuration = this.newConfiguration;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean isInMultiWindowMode() {
        return this.isInMultiWindowMode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(26)
    public MultiWindowModeChangedInfo(boolean z11, @m80.k Configuration newConfig) {
        this(z11);
        g0.p(newConfig, "newConfig");
        this.newConfiguration = newConfig;
    }
}
