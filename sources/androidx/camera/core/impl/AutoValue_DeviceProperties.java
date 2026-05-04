package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_DeviceProperties extends DeviceProperties {
    private final String manufacturer;
    private final String model;
    private final int sdkVersion;

    public AutoValue_DeviceProperties(String str, String str2, int i11) {
        if (str == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.manufacturer = str;
        if (str2 == null) {
            throw new NullPointerException("Null model");
        }
        this.model = str2;
        this.sdkVersion = i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeviceProperties) {
            DeviceProperties deviceProperties = (DeviceProperties) obj;
            if (this.manufacturer.equals(deviceProperties.manufacturer()) && this.model.equals(deviceProperties.model()) && this.sdkVersion == deviceProperties.sdkVersion()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.manufacturer.hashCode() ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.sdkVersion;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    @NonNull
    public String manufacturer() {
        return this.manufacturer;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    @NonNull
    public String model() {
        return this.model;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public int sdkVersion() {
        return this.sdkVersion;
    }

    public String toString() {
        return "DeviceProperties{manufacturer=" + this.manufacturer + ", model=" + this.model + ", sdkVersion=" + this.sdkVersion + com.alipay.sdk.m.u.i.f11099d;
    }
}
