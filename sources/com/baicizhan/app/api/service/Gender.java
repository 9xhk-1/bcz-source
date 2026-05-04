package com.baicizhan.app.api.service;

import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class Gender {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Gender[] $VALUES;
    public static final Gender Boy = new Gender("Boy", 0);
    public static final Gender Girl = new Gender("Girl", 1);
    public static final Gender Unknown = new Gender(PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN, 2);

    private static final /* synthetic */ Gender[] $values() {
        return new Gender[]{Boy, Girl, Unknown};
    }

    static {
        Gender[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private Gender(String str, int i11) {
    }

    @k
    public static a<Gender> getEntries() {
        return $ENTRIES;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) $VALUES.clone();
    }
}
