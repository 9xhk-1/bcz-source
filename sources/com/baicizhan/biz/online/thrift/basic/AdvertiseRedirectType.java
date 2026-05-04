package com.baicizhan.biz.online.thrift.basic;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class AdvertiseRedirectType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ AdvertiseRedirectType[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final AdvertiseRedirectType REDIRECT_NOTHING = new AdvertiseRedirectType("REDIRECT_NOTHING", 0, 0);
    public static final AdvertiseRedirectType REDIRECT_TAOBAO = new AdvertiseRedirectType("REDIRECT_TAOBAO", 1, 1);
    public static final AdvertiseRedirectType REDIRECT_BROWSER = new AdvertiseRedirectType("REDIRECT_BROWSER", 2, 2);
    public static final AdvertiseRedirectType REDIRECT_SYS_NOTIFY = new AdvertiseRedirectType("REDIRECT_SYS_NOTIFY", 3, 3);
    public static final AdvertiseRedirectType REDIRECT_LOCAL_STORE = new AdvertiseRedirectType("REDIRECT_LOCAL_STORE", 4, 4);
    public static final AdvertiseRedirectType REDIRECT_PI = new AdvertiseRedirectType("REDIRECT_PI", 5, 5);
    public static final AdvertiseRedirectType REDIRECT_ONLY_NATIVE_MALL = new AdvertiseRedirectType("REDIRECT_ONLY_NATIVE_MALL", 6, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final AdvertiseRedirectType a(int i11) {
            switch (i11) {
                case 0:
                    return AdvertiseRedirectType.REDIRECT_NOTHING;
                case 1:
                    return AdvertiseRedirectType.REDIRECT_TAOBAO;
                case 2:
                    return AdvertiseRedirectType.REDIRECT_BROWSER;
                case 3:
                    return AdvertiseRedirectType.REDIRECT_SYS_NOTIFY;
                case 4:
                    return AdvertiseRedirectType.REDIRECT_LOCAL_STORE;
                case 5:
                    return AdvertiseRedirectType.REDIRECT_PI;
                case 6:
                    return AdvertiseRedirectType.REDIRECT_ONLY_NATIVE_MALL;
                default:
                    return null;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ AdvertiseRedirectType[] $values() {
        return new AdvertiseRedirectType[]{REDIRECT_NOTHING, REDIRECT_TAOBAO, REDIRECT_BROWSER, REDIRECT_SYS_NOTIFY, REDIRECT_LOCAL_STORE, REDIRECT_PI, REDIRECT_ONLY_NATIVE_MALL};
    }

    static {
        AdvertiseRedirectType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private AdvertiseRedirectType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<AdvertiseRedirectType> getEntries() {
        return $ENTRIES;
    }

    public static AdvertiseRedirectType valueOf(String str) {
        return (AdvertiseRedirectType) Enum.valueOf(AdvertiseRedirectType.class, str);
    }

    public static AdvertiseRedirectType[] values() {
        return (AdvertiseRedirectType[]) $VALUES.clone();
    }
}
