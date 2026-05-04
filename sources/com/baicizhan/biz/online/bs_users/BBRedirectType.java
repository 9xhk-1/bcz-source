package com.baicizhan.biz.online.bs_users;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BBRedirectType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ BBRedirectType[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final BBRedirectType REDIRECT_NOTHING = new BBRedirectType("REDIRECT_NOTHING", 0, 0);
    public static final BBRedirectType REDIRECT_TAOBAO = new BBRedirectType("REDIRECT_TAOBAO", 1, 1);
    public static final BBRedirectType REDIRECT_BROWSER = new BBRedirectType("REDIRECT_BROWSER", 2, 2);
    public static final BBRedirectType REDIRECT_SYS_NOTIFY = new BBRedirectType("REDIRECT_SYS_NOTIFY", 3, 3);
    public static final BBRedirectType REDIRECT_LOCAL_STORE = new BBRedirectType("REDIRECT_LOCAL_STORE", 4, 4);
    public static final BBRedirectType REDIRECT_PI = new BBRedirectType("REDIRECT_PI", 5, 5);
    public static final BBRedirectType REDIRECT_ONLY_NATIVE_MALL = new BBRedirectType("REDIRECT_ONLY_NATIVE_MALL", 6, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final BBRedirectType a(int i11) {
            switch (i11) {
                case 0:
                    return BBRedirectType.REDIRECT_NOTHING;
                case 1:
                    return BBRedirectType.REDIRECT_TAOBAO;
                case 2:
                    return BBRedirectType.REDIRECT_BROWSER;
                case 3:
                    return BBRedirectType.REDIRECT_SYS_NOTIFY;
                case 4:
                    return BBRedirectType.REDIRECT_LOCAL_STORE;
                case 5:
                    return BBRedirectType.REDIRECT_PI;
                case 6:
                    return BBRedirectType.REDIRECT_ONLY_NATIVE_MALL;
                default:
                    return null;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ BBRedirectType[] $values() {
        return new BBRedirectType[]{REDIRECT_NOTHING, REDIRECT_TAOBAO, REDIRECT_BROWSER, REDIRECT_SYS_NOTIFY, REDIRECT_LOCAL_STORE, REDIRECT_PI, REDIRECT_ONLY_NATIVE_MALL};
    }

    static {
        BBRedirectType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private BBRedirectType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<BBRedirectType> getEntries() {
        return $ENTRIES;
    }

    public static BBRedirectType valueOf(String str) {
        return (BBRedirectType) Enum.valueOf(BBRedirectType.class, str);
    }

    public static BBRedirectType[] values() {
        return (BBRedirectType[]) $VALUES.clone();
    }
}
