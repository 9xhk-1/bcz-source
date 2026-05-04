package io.ktor.client.plugins.cache;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ValidateStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ValidateStatus[] $VALUES;
    public static final ValidateStatus ShouldValidate = new ValidateStatus("ShouldValidate", 0);
    public static final ValidateStatus ShouldNotValidate = new ValidateStatus("ShouldNotValidate", 1);
    public static final ValidateStatus ShouldWarn = new ValidateStatus("ShouldWarn", 2);

    private static final /* synthetic */ ValidateStatus[] $values() {
        return new ValidateStatus[]{ShouldValidate, ShouldNotValidate, ShouldWarn};
    }

    static {
        ValidateStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ValidateStatus(String str, int i11) {
    }

    @k
    public static a<ValidateStatus> getEntries() {
        return $ENTRIES;
    }

    public static ValidateStatus valueOf(String str) {
        return (ValidateStatus) Enum.valueOf(ValidateStatus.class, str);
    }

    public static ValidateStatus[] values() {
        return (ValidateStatus[]) $VALUES.clone();
    }
}
