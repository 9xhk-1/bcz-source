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
public final class AdvertiseLoadingModule {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ AdvertiseLoadingModule[] $VALUES;

    @k
    public static final a Companion;
    public static final AdvertiseLoadingModule MODULE_FM = new AdvertiseLoadingModule("MODULE_FM", 0, 1);
    public static final AdvertiseLoadingModule MODULE_MAIN = new AdvertiseLoadingModule("MODULE_MAIN", 1, 2);
    public static final AdvertiseLoadingModule MODULE_PK = new AdvertiseLoadingModule("MODULE_PK", 2, 3);

    @g
    public final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final AdvertiseLoadingModule a(int i11) {
            if (i11 == 1) {
                return AdvertiseLoadingModule.MODULE_FM;
            }
            if (i11 == 2) {
                return AdvertiseLoadingModule.MODULE_MAIN;
            }
            if (i11 != 3) {
                return null;
            }
            return AdvertiseLoadingModule.MODULE_PK;
        }

        public a() {
        }
    }

    private static final /* synthetic */ AdvertiseLoadingModule[] $values() {
        return new AdvertiseLoadingModule[]{MODULE_FM, MODULE_MAIN, MODULE_PK};
    }

    static {
        AdvertiseLoadingModule[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private AdvertiseLoadingModule(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<AdvertiseLoadingModule> getEntries() {
        return $ENTRIES;
    }

    public static AdvertiseLoadingModule valueOf(String str) {
        return (AdvertiseLoadingModule) Enum.valueOf(AdvertiseLoadingModule.class, str);
    }

    public static AdvertiseLoadingModule[] values() {
        return (AdvertiseLoadingModule[]) $VALUES.clone();
    }
}
