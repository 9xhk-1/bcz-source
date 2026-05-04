package com.baicizhan.biz.online.unified_user_service;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SendCaptchaAction {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SendCaptchaAction[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final SendCaptchaAction REGISTER = new SendCaptchaAction("REGISTER", 0, 1);
    public static final SendCaptchaAction RESET_PW = new SendCaptchaAction("RESET_PW", 1, 2);
    public static final SendCaptchaAction BIND_PHONE = new SendCaptchaAction("BIND_PHONE", 2, 3);
    public static final SendCaptchaAction LOGIN = new SendCaptchaAction("LOGIN", 3, 5);
    public static final SendCaptchaAction OLD_BIND = new SendCaptchaAction("OLD_BIND", 4, 6);
    public static final SendCaptchaAction NEW_BIND = new SendCaptchaAction("NEW_BIND", 5, 7);
    public static final SendCaptchaAction CHECK_PASS = new SendCaptchaAction("CHECK_PASS", 6, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final SendCaptchaAction a(int i11) {
            switch (i11) {
                case 1:
                    return SendCaptchaAction.REGISTER;
                case 2:
                    return SendCaptchaAction.RESET_PW;
                case 3:
                    return SendCaptchaAction.BIND_PHONE;
                case 4:
                default:
                    return null;
                case 5:
                    return SendCaptchaAction.LOGIN;
                case 6:
                    return SendCaptchaAction.OLD_BIND;
                case 7:
                    return SendCaptchaAction.NEW_BIND;
                case 8:
                    return SendCaptchaAction.CHECK_PASS;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ SendCaptchaAction[] $values() {
        return new SendCaptchaAction[]{REGISTER, RESET_PW, BIND_PHONE, LOGIN, OLD_BIND, NEW_BIND, CHECK_PASS};
    }

    static {
        SendCaptchaAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private SendCaptchaAction(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<SendCaptchaAction> getEntries() {
        return $ENTRIES;
    }

    public static SendCaptchaAction valueOf(String str) {
        return (SendCaptchaAction) Enum.valueOf(SendCaptchaAction.class, str);
    }

    public static SendCaptchaAction[] values() {
        return (SendCaptchaAction[]) $VALUES.clone();
    }
}
