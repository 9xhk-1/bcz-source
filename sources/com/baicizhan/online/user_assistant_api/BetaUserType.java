package com.baicizhan.online.user_assistant_api;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public enum BetaUserType implements TEnum {
    BETA_TYPE_DICT(0),
    BETA_TYPE_IREADING(1),
    BETA_TYPE_INTENSE_REVIEW(2),
    BETA_TYPE_IOS_HTTPS(3),
    BETA_TYPE_SPOTLIGHT_DICT(4),
    BETA_TYPE_WIKI_SHOW_DICT_DOWNLOAD(5),
    BETA_TYPE_SHOW_MORE_WIKI(6),
    BETA_TYPE_USE_PUSH_MSG(7),
    BETA_TYPE_DAKA_LOTTERY(8),
    BETA_TYPE_DICT_TRANSLATE(9),
    BETA_TYPE_DAKA_SHARE_BONUS(10),
    BETA_TYPE_OCR_PDF(11);

    private final int value;

    BetaUserType(int value) {
        this.value = value;
    }

    public static BetaUserType findByValue(int value) {
        switch (value) {
            case 0:
                return BETA_TYPE_DICT;
            case 1:
                return BETA_TYPE_IREADING;
            case 2:
                return BETA_TYPE_INTENSE_REVIEW;
            case 3:
                return BETA_TYPE_IOS_HTTPS;
            case 4:
                return BETA_TYPE_SPOTLIGHT_DICT;
            case 5:
                return BETA_TYPE_WIKI_SHOW_DICT_DOWNLOAD;
            case 6:
                return BETA_TYPE_SHOW_MORE_WIKI;
            case 7:
                return BETA_TYPE_USE_PUSH_MSG;
            case 8:
                return BETA_TYPE_DAKA_LOTTERY;
            case 9:
                return BETA_TYPE_DICT_TRANSLATE;
            case 10:
                return BETA_TYPE_DAKA_SHARE_BONUS;
            case 11:
                return BETA_TYPE_OCR_PDF;
            default:
                return null;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
