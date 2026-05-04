package com.baicizhan.app.api.service.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class MemberShipTypeVo {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MemberShipTypeVo[] $VALUES;
    public static final MemberShipTypeVo Free = new MemberShipTypeVo("Free", 0);
    public static final MemberShipTypeVo Vip = new MemberShipTypeVo("Vip", 1);
    public static final MemberShipTypeVo TrialVip = new MemberShipTypeVo("TrialVip", 2);

    private static final /* synthetic */ MemberShipTypeVo[] $values() {
        return new MemberShipTypeVo[]{Free, Vip, TrialVip};
    }

    static {
        MemberShipTypeVo[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private MemberShipTypeVo(String str, int i11) {
    }

    @k
    public static a<MemberShipTypeVo> getEntries() {
        return $ENTRIES;
    }

    public static MemberShipTypeVo valueOf(String str) {
        return (MemberShipTypeVo) Enum.valueOf(MemberShipTypeVo.class, str);
    }

    public static MemberShipTypeVo[] values() {
        return (MemberShipTypeVo[]) $VALUES.clone();
    }
}
