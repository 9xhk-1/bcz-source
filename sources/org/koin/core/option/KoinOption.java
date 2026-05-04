package org.koin.core.option;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class KoinOption {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ KoinOption[] $VALUES;
    public static final KoinOption VIEWMODEL_SCOPE_FACTORY = new KoinOption("VIEWMODEL_SCOPE_FACTORY", 0);

    private static final /* synthetic */ KoinOption[] $values() {
        return new KoinOption[]{VIEWMODEL_SCOPE_FACTORY};
    }

    static {
        KoinOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private KoinOption(String str, int i11) {
    }

    @k
    public static a<KoinOption> getEntries() {
        return $ENTRIES;
    }

    public static KoinOption valueOf(String str) {
        return (KoinOption) Enum.valueOf(KoinOption.class, str);
    }

    public static KoinOption[] values() {
        return (KoinOption[]) $VALUES.clone();
    }
}
