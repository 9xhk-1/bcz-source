package com.baicizhan.app.biz.game.impl.home.uieffect.internal;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class EffectType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EffectType[] $VALUES;
    public static final EffectType Default = new EffectType("Default", 0);
    public static final EffectType Dialog = new EffectType("Dialog", 1);

    private static final /* synthetic */ EffectType[] $values() {
        return new EffectType[]{Default, Dialog};
    }

    static {
        EffectType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private EffectType(String str, int i11) {
    }

    @k
    public static a<EffectType> getEntries() {
        return $ENTRIES;
    }

    public static EffectType valueOf(String str) {
        return (EffectType) Enum.valueOf(EffectType.class, str);
    }

    public static EffectType[] values() {
        return (EffectType[]) $VALUES.clone();
    }
}
