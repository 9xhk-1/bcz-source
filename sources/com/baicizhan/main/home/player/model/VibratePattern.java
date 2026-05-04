package com.baicizhan.main.home.player.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class VibratePattern {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VibratePattern[] $VALUES;
    public static final VibratePattern SHORT = new VibratePattern("SHORT", 0);
    public static final VibratePattern LONG = new VibratePattern("LONG", 1);

    private static final /* synthetic */ VibratePattern[] $values() {
        return new VibratePattern[]{SHORT, LONG};
    }

    static {
        VibratePattern[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private VibratePattern(String str, int i11) {
    }

    @k
    public static a<VibratePattern> getEntries() {
        return $ENTRIES;
    }

    public static VibratePattern valueOf(String str) {
        return (VibratePattern) Enum.valueOf(VibratePattern.class, str);
    }

    public static VibratePattern[] values() {
        return (VibratePattern[]) $VALUES.clone();
    }
}
