package com.baicizhan.main.vld.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class VocabularyDeviceInfo implements Serializable {
    public static final int $stable = 0;
    private final long deviceId;
    private final int deviceType;

    @k
    private final String image;

    @k
    private final String model;

    @k
    private final String name;
    private final boolean online;

    @k
    private final String serialNumber;

    @k
    private final String version;

    public VocabularyDeviceInfo(long j11, int i11, @k String name, @k String image, @k String model, @k String serialNumber, @k String version, boolean z11) {
        g0.p(name, "name");
        g0.p(image, "image");
        g0.p(model, "model");
        g0.p(serialNumber, "serialNumber");
        g0.p(version, "version");
        this.deviceId = j11;
        this.deviceType = i11;
        this.name = name;
        this.image = image;
        this.model = model;
        this.serialNumber = serialNumber;
        this.version = version;
        this.online = z11;
    }

    public static /* synthetic */ VocabularyDeviceInfo copy$default(VocabularyDeviceInfo vocabularyDeviceInfo, long j11, int i11, String str, String str2, String str3, String str4, String str5, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = vocabularyDeviceInfo.deviceId;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            i11 = vocabularyDeviceInfo.deviceType;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = vocabularyDeviceInfo.name;
        }
        String str6 = str;
        if ((i12 & 8) != 0) {
            str2 = vocabularyDeviceInfo.image;
        }
        return vocabularyDeviceInfo.copy(j12, i13, str6, str2, (i12 & 16) != 0 ? vocabularyDeviceInfo.model : str3, (i12 & 32) != 0 ? vocabularyDeviceInfo.serialNumber : str4, (i12 & 64) != 0 ? vocabularyDeviceInfo.version : str5, (i12 & 128) != 0 ? vocabularyDeviceInfo.online : z11);
    }

    public final long component1() {
        return this.deviceId;
    }

    public final int component2() {
        return this.deviceType;
    }

    @k
    public final String component3() {
        return this.name;
    }

    @k
    public final String component4() {
        return this.image;
    }

    @k
    public final String component5() {
        return this.model;
    }

    @k
    public final String component6() {
        return this.serialNumber;
    }

    @k
    public final String component7() {
        return this.version;
    }

    public final boolean component8() {
        return this.online;
    }

    @k
    public final VocabularyDeviceInfo copy(long j11, int i11, @k String name, @k String image, @k String model, @k String serialNumber, @k String version, boolean z11) {
        g0.p(name, "name");
        g0.p(image, "image");
        g0.p(model, "model");
        g0.p(serialNumber, "serialNumber");
        g0.p(version, "version");
        return new VocabularyDeviceInfo(j11, i11, name, image, model, serialNumber, version, z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VocabularyDeviceInfo)) {
            return false;
        }
        VocabularyDeviceInfo vocabularyDeviceInfo = (VocabularyDeviceInfo) obj;
        return this.deviceId == vocabularyDeviceInfo.deviceId && this.deviceType == vocabularyDeviceInfo.deviceType && g0.g(this.name, vocabularyDeviceInfo.name) && g0.g(this.image, vocabularyDeviceInfo.image) && g0.g(this.model, vocabularyDeviceInfo.model) && g0.g(this.serialNumber, vocabularyDeviceInfo.serialNumber) && g0.g(this.version, vocabularyDeviceInfo.version) && this.online == vocabularyDeviceInfo.online;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @k
    public final String getImage() {
        return this.image;
    }

    @k
    public final String getModel() {
        return this.model;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final boolean getOnline() {
        return this.online;
    }

    @k
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @k
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.deviceId) * 31) + Integer.hashCode(this.deviceType)) * 31) + this.name.hashCode()) * 31) + this.image.hashCode()) * 31) + this.model.hashCode()) * 31) + this.serialNumber.hashCode()) * 31) + this.version.hashCode()) * 31) + Boolean.hashCode(this.online);
    }

    @k
    public String toString() {
        return "VocabularyDeviceInfo(deviceId=" + this.deviceId + ", deviceType=" + this.deviceType + ", name=" + this.name + ", image=" + this.image + ", model=" + this.model + ", serialNumber=" + this.serialNumber + ", version=" + this.version + ", online=" + this.online + j.f81007d;
    }
}
