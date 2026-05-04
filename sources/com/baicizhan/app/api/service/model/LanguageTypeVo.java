package com.baicizhan.app.api.service.model;

import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class LanguageTypeVo {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LanguageTypeVo[] $VALUES;
    public static final LanguageTypeVo Unknown = new LanguageTypeVo(PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN, 0);
    public static final LanguageTypeVo Jp = new LanguageTypeVo("Jp", 1);
    public static final LanguageTypeVo En = new LanguageTypeVo("En", 2);
    public static final LanguageTypeVo Kr = new LanguageTypeVo("Kr", 3);
    public static final LanguageTypeVo Fr = new LanguageTypeVo("Fr", 4);
    public static final LanguageTypeVo Es = new LanguageTypeVo("Es", 5);

    private static final /* synthetic */ LanguageTypeVo[] $values() {
        return new LanguageTypeVo[]{Unknown, Jp, En, Kr, Fr, Es};
    }

    static {
        LanguageTypeVo[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LanguageTypeVo(String str, int i11) {
    }

    @k
    public static a<LanguageTypeVo> getEntries() {
        return $ENTRIES;
    }

    public static LanguageTypeVo valueOf(String str) {
        return (LanguageTypeVo) Enum.valueOf(LanguageTypeVo.class, str);
    }

    public static LanguageTypeVo[] values() {
        return (LanguageTypeVo[]) $VALUES.clone();
    }
}
