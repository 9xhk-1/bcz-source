package com.baicizhan.biz.online.user_assistant_api;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BetaUserType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ BetaUserType[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final BetaUserType BETA_TYPE_DICT = new BetaUserType("BETA_TYPE_DICT", 0, 0);
    public static final BetaUserType BETA_TYPE_IREADING = new BetaUserType("BETA_TYPE_IREADING", 1, 1);
    public static final BetaUserType BETA_TYPE_INTENSE_REVIEW = new BetaUserType("BETA_TYPE_INTENSE_REVIEW", 2, 2);
    public static final BetaUserType BETA_TYPE_IOS_HTTPS = new BetaUserType("BETA_TYPE_IOS_HTTPS", 3, 3);
    public static final BetaUserType BETA_TYPE_SPOTLIGHT_DICT = new BetaUserType("BETA_TYPE_SPOTLIGHT_DICT", 4, 4);
    public static final BetaUserType BETA_TYPE_WIKI_SHOW_DICT_DOWNLOAD = new BetaUserType("BETA_TYPE_WIKI_SHOW_DICT_DOWNLOAD", 5, 5);
    public static final BetaUserType BETA_TYPE_SHOW_MORE_WIKI = new BetaUserType("BETA_TYPE_SHOW_MORE_WIKI", 6, 6);
    public static final BetaUserType BETA_TYPE_USE_PUSH_MSG = new BetaUserType("BETA_TYPE_USE_PUSH_MSG", 7, 7);
    public static final BetaUserType BETA_TYPE_DAKA_LOTTERY = new BetaUserType("BETA_TYPE_DAKA_LOTTERY", 8, 8);
    public static final BetaUserType BETA_TYPE_DICT_TRANSLATE = new BetaUserType("BETA_TYPE_DICT_TRANSLATE", 9, 9);
    public static final BetaUserType BETA_TYPE_DAKA_SHARE_BONUS = new BetaUserType("BETA_TYPE_DAKA_SHARE_BONUS", 10, 10);
    public static final BetaUserType BETA_TYPE_OCR_PDF = new BetaUserType("BETA_TYPE_OCR_PDF", 11, 11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final BetaUserType a(int i11) {
            switch (i11) {
                case 0:
                    return BetaUserType.BETA_TYPE_DICT;
                case 1:
                    return BetaUserType.BETA_TYPE_IREADING;
                case 2:
                    return BetaUserType.BETA_TYPE_INTENSE_REVIEW;
                case 3:
                    return BetaUserType.BETA_TYPE_IOS_HTTPS;
                case 4:
                    return BetaUserType.BETA_TYPE_SPOTLIGHT_DICT;
                case 5:
                    return BetaUserType.BETA_TYPE_WIKI_SHOW_DICT_DOWNLOAD;
                case 6:
                    return BetaUserType.BETA_TYPE_SHOW_MORE_WIKI;
                case 7:
                    return BetaUserType.BETA_TYPE_USE_PUSH_MSG;
                case 8:
                    return BetaUserType.BETA_TYPE_DAKA_LOTTERY;
                case 9:
                    return BetaUserType.BETA_TYPE_DICT_TRANSLATE;
                case 10:
                    return BetaUserType.BETA_TYPE_DAKA_SHARE_BONUS;
                case 11:
                    return BetaUserType.BETA_TYPE_OCR_PDF;
                default:
                    return null;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ BetaUserType[] $values() {
        return new BetaUserType[]{BETA_TYPE_DICT, BETA_TYPE_IREADING, BETA_TYPE_INTENSE_REVIEW, BETA_TYPE_IOS_HTTPS, BETA_TYPE_SPOTLIGHT_DICT, BETA_TYPE_WIKI_SHOW_DICT_DOWNLOAD, BETA_TYPE_SHOW_MORE_WIKI, BETA_TYPE_USE_PUSH_MSG, BETA_TYPE_DAKA_LOTTERY, BETA_TYPE_DICT_TRANSLATE, BETA_TYPE_DAKA_SHARE_BONUS, BETA_TYPE_OCR_PDF};
    }

    static {
        BetaUserType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private BetaUserType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<BetaUserType> getEntries() {
        return $ENTRIES;
    }

    public static BetaUserType valueOf(String str) {
        return (BetaUserType) Enum.valueOf(BetaUserType.class, str);
    }

    public static BetaUserType[] values() {
        return (BetaUserType[]) $VALUES.clone();
    }
}
