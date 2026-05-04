package com.baicizhan.app.biz.platform;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class DeviceType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType Android = new DeviceType("Android", 0);
    public static final DeviceType IOS = new DeviceType("IOS", 1);
    public static final DeviceType OHOS = new DeviceType("OHOS", 2);

    private static final /* synthetic */ DeviceType[] $values() {
        return new DeviceType[]{Android, IOS, OHOS};
    }

    static {
        DeviceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private DeviceType(String str, int i11) {
    }

    @k
    public static a<DeviceType> getEntries() {
        return $ENTRIES;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }
}
