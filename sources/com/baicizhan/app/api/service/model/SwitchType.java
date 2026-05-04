package com.baicizhan.app.api.service.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class SwitchType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SwitchType[] $VALUES;
    public static final SwitchType Unit = new SwitchType("Unit", 0);
    public static final SwitchType Sku = new SwitchType("Sku", 1);
    public static final SwitchType StudyProgress = new SwitchType("StudyProgress", 2);

    private static final /* synthetic */ SwitchType[] $values() {
        return new SwitchType[]{Unit, Sku, StudyProgress};
    }

    static {
        SwitchType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SwitchType(String str, int i11) {
    }

    @k
    public static a<SwitchType> getEntries() {
        return $ENTRIES;
    }

    public static SwitchType valueOf(String str) {
        return (SwitchType) Enum.valueOf(SwitchType.class, str);
    }

    public static SwitchType[] values() {
        return (SwitchType[]) $VALUES.clone();
    }
}
