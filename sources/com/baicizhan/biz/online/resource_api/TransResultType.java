package com.baicizhan.biz.online.resource_api;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class TransResultType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TransResultType[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final TransResultType TRANS = new TransResultType("TRANS", 0, 1);
    public static final TransResultType SUGGEST = new TransResultType("SUGGEST", 1, 2);
    public static final TransResultType NOTFOUND = new TransResultType("NOTFOUND", 2, 3);
    public static final TransResultType WORD = new TransResultType("WORD", 3, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final TransResultType a(int i11) {
            if (i11 == 1) {
                return TransResultType.TRANS;
            }
            if (i11 == 2) {
                return TransResultType.SUGGEST;
            }
            if (i11 == 3) {
                return TransResultType.NOTFOUND;
            }
            if (i11 != 4) {
                return null;
            }
            return TransResultType.WORD;
        }

        public a() {
        }
    }

    private static final /* synthetic */ TransResultType[] $values() {
        return new TransResultType[]{TRANS, SUGGEST, NOTFOUND, WORD};
    }

    static {
        TransResultType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private TransResultType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<TransResultType> getEntries() {
        return $ENTRIES;
    }

    public static TransResultType valueOf(String str) {
        return (TransResultType) Enum.valueOf(TransResultType.class, str);
    }

    public static TransResultType[] values() {
        return (TransResultType[]) $VALUES.clone();
    }
}
