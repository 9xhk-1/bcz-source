package com.baicizhan.main.activity.aiclass;

import com.alipay.sdk.m.f0.c;
import m00.a;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class LoadingStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LoadingStatus[] $VALUES;
    public static final LoadingStatus LOADING = new LoadingStatus("LOADING", 0);
    public static final LoadingStatus SUCCESS = new LoadingStatus(c.f10532p, 1);
    public static final LoadingStatus ERROR_MEDIA = new LoadingStatus("ERROR_MEDIA", 2);
    public static final LoadingStatus ERROR_NO_NET = new LoadingStatus("ERROR_NO_NET", 3);
    public static final LoadingStatus ERROR_TIME_OUT = new LoadingStatus("ERROR_TIME_OUT", 4);
    public static final LoadingStatus ERROR_NO_INFO = new LoadingStatus("ERROR_NO_INFO", 5);

    private static final /* synthetic */ LoadingStatus[] $values() {
        return new LoadingStatus[]{LOADING, SUCCESS, ERROR_MEDIA, ERROR_NO_NET, ERROR_TIME_OUT, ERROR_NO_INFO};
    }

    static {
        LoadingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private LoadingStatus(String str, int i11) {
    }

    @k
    public static a<LoadingStatus> getEntries() {
        return $ENTRIES;
    }

    public static LoadingStatus valueOf(String str) {
        return (LoadingStatus) Enum.valueOf(LoadingStatus.class, str);
    }

    public static LoadingStatus[] values() {
        return (LoadingStatus[]) $VALUES.clone();
    }
}
