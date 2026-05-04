package com.baicizhan.main.auth;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SmsCaptcha {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SmsCaptcha[] $VALUES;
    private final int type;
    public static final SmsCaptcha LOGIN_OR_REG = new SmsCaptcha("LOGIN_OR_REG", 0, 5);
    public static final SmsCaptcha SECURITY_VERIFICATION = new SmsCaptcha("SECURITY_VERIFICATION", 1, 6);
    public static final SmsCaptcha NEW_BINDING = new SmsCaptcha("NEW_BINDING", 2, 7);

    private static final /* synthetic */ SmsCaptcha[] $values() {
        return new SmsCaptcha[]{LOGIN_OR_REG, SECURITY_VERIFICATION, NEW_BINDING};
    }

    static {
        SmsCaptcha[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SmsCaptcha(String str, int i11, int i12) {
        this.type = i12;
    }

    @k
    public static a<SmsCaptcha> getEntries() {
        return $ENTRIES;
    }

    public static SmsCaptcha valueOf(String str) {
        return (SmsCaptcha) Enum.valueOf(SmsCaptcha.class, str);
    }

    public static SmsCaptcha[] values() {
        return (SmsCaptcha[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
