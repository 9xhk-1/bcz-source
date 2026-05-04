package com.baicizhan.biz.online.advertise_api;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BczLaunchAdClickType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ BczLaunchAdClickType[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final BczLaunchAdClickType WEBVIEW = new BczLaunchAdClickType("WEBVIEW", 0, 1);
    public static final BczLaunchAdClickType BROWSER = new BczLaunchAdClickType("BROWSER", 1, 2);
    public static final BczLaunchAdClickType OTHERAPP = new BczLaunchAdClickType("OTHERAPP", 2, 3);
    public static final BczLaunchAdClickType OTHERAPP_THEN_WEBVIEW = new BczLaunchAdClickType("OTHERAPP_THEN_WEBVIEW", 3, 4);
    public static final BczLaunchAdClickType OTHERAPP_THEN_BROWSER = new BczLaunchAdClickType("OTHERAPP_THEN_BROWSER", 4, 5);
    public static final BczLaunchAdClickType MINI_PROGRAM = new BczLaunchAdClickType("MINI_PROGRAM", 5, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final BczLaunchAdClickType a(int i11) {
            switch (i11) {
                case 1:
                    return BczLaunchAdClickType.WEBVIEW;
                case 2:
                    return BczLaunchAdClickType.BROWSER;
                case 3:
                    return BczLaunchAdClickType.OTHERAPP;
                case 4:
                    return BczLaunchAdClickType.OTHERAPP_THEN_WEBVIEW;
                case 5:
                    return BczLaunchAdClickType.OTHERAPP_THEN_BROWSER;
                case 6:
                    return BczLaunchAdClickType.MINI_PROGRAM;
                default:
                    return null;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ BczLaunchAdClickType[] $values() {
        return new BczLaunchAdClickType[]{WEBVIEW, BROWSER, OTHERAPP, OTHERAPP_THEN_WEBVIEW, OTHERAPP_THEN_BROWSER, MINI_PROGRAM};
    }

    static {
        BczLaunchAdClickType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private BczLaunchAdClickType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<BczLaunchAdClickType> getEntries() {
        return $ENTRIES;
    }

    public static BczLaunchAdClickType valueOf(String str) {
        return (BczLaunchAdClickType) Enum.valueOf(BczLaunchAdClickType.class, str);
    }

    public static BczLaunchAdClickType[] values() {
        return (BczLaunchAdClickType[]) $VALUES.clone();
    }
}
