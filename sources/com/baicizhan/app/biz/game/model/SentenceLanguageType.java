package com.baicizhan.app.biz.game.model;

import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class SentenceLanguageType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SentenceLanguageType[] $VALUES;
    private final int value;
    public static final SentenceLanguageType Unknown = new SentenceLanguageType(PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN, 0, -1);
    public static final SentenceLanguageType Jp = new SentenceLanguageType("Jp", 1, 1);
    public static final SentenceLanguageType En = new SentenceLanguageType("En", 2, 2);
    public static final SentenceLanguageType Kr = new SentenceLanguageType("Kr", 3, 3);
    public static final SentenceLanguageType Fr = new SentenceLanguageType("Fr", 4, 4);
    public static final SentenceLanguageType Es = new SentenceLanguageType("Es", 5, 5);

    private static final /* synthetic */ SentenceLanguageType[] $values() {
        return new SentenceLanguageType[]{Unknown, Jp, En, Kr, Fr, Es};
    }

    static {
        SentenceLanguageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SentenceLanguageType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<SentenceLanguageType> getEntries() {
        return $ENTRIES;
    }

    public static SentenceLanguageType valueOf(String str) {
        return (SentenceLanguageType) Enum.valueOf(SentenceLanguageType.class, str);
    }

    public static SentenceLanguageType[] values() {
        return (SentenceLanguageType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
