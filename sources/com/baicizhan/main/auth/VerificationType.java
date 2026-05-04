package com.baicizhan.main.auth;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class VerificationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VerificationType[] $VALUES;
    public static final VerificationType LOGIN_PHONE = new VerificationType("LOGIN_PHONE", 0);
    public static final VerificationType LOGIN_PHONE_PURE = new VerificationType("LOGIN_PHONE_PURE", 1);
    public static final VerificationType LOGIN_PHONE_DIRECTLY = new VerificationType("LOGIN_PHONE_DIRECTLY", 2);
    public static final VerificationType LOGIN_EMAIL = new VerificationType("LOGIN_EMAIL", 3);
    public static final VerificationType BIND_PHONE = new VerificationType("BIND_PHONE", 4);
    public static final VerificationType BIND_PHONE_AUTO = new VerificationType("BIND_PHONE_AUTO", 5);
    public static final VerificationType BIND_PHONE_CHANGE = new VerificationType("BIND_PHONE_CHANGE", 6);
    public static final VerificationType BIND_PHONE_DIRECTLY = new VerificationType("BIND_PHONE_DIRECTLY", 7);
    public static final VerificationType BIND_PHONE_DIRECTLY_AUTO = new VerificationType("BIND_PHONE_DIRECTLY_AUTO", 8);
    public static final VerificationType VERIFY_PHONE_FOR_RESULT = new VerificationType("VERIFY_PHONE_FOR_RESULT", 9);
    public static final VerificationType EMAIL_PASSWORD_RESET = new VerificationType("EMAIL_PASSWORD_RESET", 10);

    private static final /* synthetic */ VerificationType[] $values() {
        return new VerificationType[]{LOGIN_PHONE, LOGIN_PHONE_PURE, LOGIN_PHONE_DIRECTLY, LOGIN_EMAIL, BIND_PHONE, BIND_PHONE_AUTO, BIND_PHONE_CHANGE, BIND_PHONE_DIRECTLY, BIND_PHONE_DIRECTLY_AUTO, VERIFY_PHONE_FOR_RESULT, EMAIL_PASSWORD_RESET};
    }

    static {
        VerificationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private VerificationType(String str, int i11) {
    }

    @k
    public static a<VerificationType> getEntries() {
        return $ENTRIES;
    }

    public static VerificationType valueOf(String str) {
        return (VerificationType) Enum.valueOf(VerificationType.class, str);
    }

    public static VerificationType[] values() {
        return (VerificationType[]) $VALUES.clone();
    }
}
