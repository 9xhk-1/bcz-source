package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class QuirkSettings {
    private final boolean mEnabledWhenDeviceHasQuirk;
    private final Set<Class<? extends Quirk>> mForceDisabledQuirks;
    private final Set<Class<? extends Quirk>> mForceEnabledQuirks;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {
        private boolean mEnabledWhenDeviceHasQuirk = true;
        private Set<Class<? extends Quirk>> mForceDisabledQuirks;
        private Set<Class<? extends Quirk>> mForceEnabledQuirks;

        @NonNull
        public QuirkSettings build() {
            return new QuirkSettings(this.mEnabledWhenDeviceHasQuirk, this.mForceEnabledQuirks, this.mForceDisabledQuirks);
        }

        @NonNull
        public Builder forceDisableQuirks(@NonNull Set<Class<? extends Quirk>> set) {
            this.mForceDisabledQuirks = new HashSet(set);
            return this;
        }

        @NonNull
        public Builder forceEnableQuirks(@NonNull Set<Class<? extends Quirk>> set) {
            this.mForceEnabledQuirks = new HashSet(set);
            return this;
        }

        @NonNull
        public Builder setEnabledWhenDeviceHasQuirk(boolean z11) {
            this.mEnabledWhenDeviceHasQuirk = z11;
            return this;
        }
    }

    @NonNull
    public static QuirkSettings withAllQuirksDisabled() {
        return new Builder().setEnabledWhenDeviceHasQuirk(false).build();
    }

    @NonNull
    public static QuirkSettings withDefaultBehavior() {
        return new Builder().setEnabledWhenDeviceHasQuirk(true).build();
    }

    @NonNull
    public static QuirkSettings withQuirksForceDisabled(@NonNull Set<Class<? extends Quirk>> set) {
        return new Builder().forceDisableQuirks(set).build();
    }

    @NonNull
    public static QuirkSettings withQuirksForceEnabled(@NonNull Set<Class<? extends Quirk>> set) {
        return new Builder().forceEnableQuirks(set).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof QuirkSettings)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        QuirkSettings quirkSettings = (QuirkSettings) obj;
        return this.mEnabledWhenDeviceHasQuirk == quirkSettings.mEnabledWhenDeviceHasQuirk && Objects.equals(this.mForceEnabledQuirks, quirkSettings.mForceEnabledQuirks) && Objects.equals(this.mForceDisabledQuirks, quirkSettings.mForceDisabledQuirks);
    }

    @NonNull
    public Set<Class<? extends Quirk>> getForceDisabledQuirks() {
        return Collections.unmodifiableSet(this.mForceDisabledQuirks);
    }

    @NonNull
    public Set<Class<? extends Quirk>> getForceEnabledQuirks() {
        return Collections.unmodifiableSet(this.mForceEnabledQuirks);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mEnabledWhenDeviceHasQuirk), this.mForceEnabledQuirks, this.mForceDisabledQuirks);
    }

    public boolean isEnabledWhenDeviceHasQuirk() {
        return this.mEnabledWhenDeviceHasQuirk;
    }

    public boolean shouldEnableQuirk(@NonNull Class<? extends Quirk> cls, boolean z11) {
        if (this.mForceEnabledQuirks.contains(cls)) {
            return true;
        }
        return !this.mForceDisabledQuirks.contains(cls) && this.mEnabledWhenDeviceHasQuirk && z11;
    }

    @NonNull
    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.mEnabledWhenDeviceHasQuirk + ", forceEnabledQuirks=" + this.mForceEnabledQuirks + ", forceDisabledQuirks=" + this.mForceDisabledQuirks + l50.b.f69928j;
    }

    private QuirkSettings(boolean z11, @Nullable Set<Class<? extends Quirk>> set, @Nullable Set<Class<? extends Quirk>> set2) {
        this.mEnabledWhenDeviceHasQuirk = z11;
        this.mForceEnabledQuirks = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.mForceDisabledQuirks = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }
}
