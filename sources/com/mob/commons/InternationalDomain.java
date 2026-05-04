package com.mob.commons;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.mob.MobSDK;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.utils.SharePrefrenceHelper;
import com.tencent.connect.common.Constants;

/* loaded from: classes7.dex */
public enum InternationalDomain implements EverythingKeeper {
    AD("ad", "Andorra"),
    AE("ae", "United Arab Emirates"),
    AF("af", "Afghanistan"),
    AG("ag", "Antigua and Barbuda"),
    AI("ai", "Anguilla"),
    AL("al", "Albania"),
    AM("am", "Armenia"),
    AO("ao", "Angola"),
    AR("ar", "Argentina"),
    AT("at", "Austria"),
    AU(ActVideoSetting.ACT_URL, "Australia"),
    AZ("az", "Azerbaijan"),
    BB("bb", "Barbados"),
    BD("bd", "Bangladesh"),
    BE("be", "Belgium"),
    BF("bf", "Burkina-faso"),
    BG("bg", "Bulgaria"),
    BH("bh", "Bahrain"),
    BI("bi", "Burundi"),
    BJ("bj", "Benin"),
    BL(CmcdConfiguration.KEY_BUFFER_LENGTH, "Palestine"),
    BM("bm", "Bermuda Is."),
    BN("bn", "Brunei"),
    BO("bo", "Bolivia"),
    BR("br", "Brazil"),
    BS("bs", "Bahamas"),
    BW("bw", "Botswana"),
    BY("by", "Belarus"),
    BZ("bz", "Belize"),
    CA(com.igexin.push.core.b.f37706ac, "Canada"),
    CF("cf", "Central African Republic"),
    CG("cg", "Congo"),
    CH("ch", "Switzerland"),
    CK("ck", "Cook Is."),
    CL("cl", "Chile"),
    CM("cm", "Cameroon"),
    CN(AdvanceSetting.CLEAR_NOTIFICATION, "China"),
    CO("co", "Colombia"),
    CR("cr", "Costa Rica"),
    CS("cs", "Czech"),
    CU("cu", "Cuba"),
    CY("cy", "Cyprus"),
    CZ("cz", "Czech Republic"),
    DE("de", "Germany"),
    DJ("dj", "Djibouti"),
    DK("dk", "Denmark"),
    DO("do", "Dominica Rep."),
    DZ("dz", "Algeria"),
    EC("ec", "Ecuador"),
    EE("ee", "Estonia"),
    EG("eg", "Egypt"),
    ES("es", "Spain"),
    ET("et", "Ethiopia"),
    FI("fi", "Finland"),
    FJ("fj", "Fiji"),
    FR("fr", "France"),
    GA("ga", "Gabon"),
    GB("gb", "United Kiongdom"),
    GD("gd", "Grenada"),
    GE("ge", "Georgia"),
    GF("gf", "French Guiana"),
    GH("gh", "Ghana"),
    GI("gi", "Gibraltar"),
    GM("gm", "Gambia"),
    GN("gn", "Guinea"),
    GR("gr", "Greece"),
    GT("gt", "Guatemala"),
    GU("gu", "Guam"),
    GY("gy", "Guyana"),
    HK("hk", "Hongkong"),
    HN(AdvanceSetting.HEAD_UP_NOTIFICATION, "Honduras"),
    HT("ht", "Haiti"),
    HU("hu", "Hungary"),
    ID("id", "Indonesia"),
    IE("ie", "Ireland"),
    IL("il", "Israel"),
    IN("in", "India"),
    IQ("iq", "Iraq"),
    IR("ir", "Iran"),
    IS("is", "Iceland"),
    IT("it", "Italy"),
    JM("jm", "Jamaica"),
    JO("jo", "Jordan"),
    JP("jp", "Japan"),
    KE("ke", "Kenya"),
    KG("kg", "Kyrgyzstan"),
    KH("kh", "Kampuchea (Cambodia )"),
    KP("kp", "North Korea"),
    KR("kr", "Korea"),
    KT("kt", "Republic of Ivory Coast"),
    KW("kw", "Kuwait"),
    KZ("kz", "Kazakstan"),
    LA("la", "Laos"),
    LB("lb", "Lebanon"),
    LC("lc", "St.Lucia"),
    LI(AppIconSetting.LARGE_ICON_URL, "Liechtenstein"),
    LK("lk", "Sri Lanka"),
    LR("lr", "Liberia"),
    LS("ls", "Lesotho"),
    LT("lt", "Lithuania"),
    LU("lu", "Luxembourg"),
    LV("lv", "Latvia"),
    LY("ly", "Libya"),
    MA("ma", "Morocco"),
    MC("mc", "Monaco"),
    MD("md", "Moldova, Republic of"),
    MG("mg", "Madagascar"),
    ML("ml", "Mali"),
    MM("mm", "Burma"),
    MN("mn", "Mongolia"),
    MO("mo", "Macao"),
    MS("ms", "Montserrat Is"),
    MT("mt", "Malta"),
    MU("mu", "Mauritius"),
    MV("mv", "Maldives"),
    MW("mw", "Malawi"),
    MX("mx", "Mexico"),
    MY("my", "Malaysia"),
    MZ("mz", "Mozambique"),
    NA("na", "Namibia"),
    NE("ne", "Niger"),
    NG("ng", "Nigeria"),
    NI("ni", "Nicaragua"),
    NL("nl", "Netherlands"),
    NO(ma.b.I0, "Norway"),
    NP("np", "Nepal"),
    NR("nr", "Nauru"),
    NZ("nz", "New Zealand"),
    OM("om", "Oman"),
    PA(com.alipay.sdk.m.l.b.f10734k, "Panama"),
    PE("pe", "Peru"),
    PF(Constants.PARAM_PLATFORM_ID, "French Polynesia"),
    PG("pg", "Papua New Cuinea"),
    PH("ph", "Philippines"),
    PK("pk", "Pakistan"),
    PL("pl", "Poland"),
    PR(CmcdConfiguration.KEY_PLAYBACK_RATE, "Puerto Rico"),
    PT(AdvertisementOption.PRIORITY_VALID_TIME, "Portugal"),
    PY("py", "Paraguay"),
    QA("qa", "Qatar"),
    RO("ro", "Romania"),
    RU("ru", "Russia"),
    SA("sa", "Saudi Arabia"),
    SB("sb", "Solomon Is"),
    SC(com.igexin.push.g.o.f38736e, "Seychelles"),
    SD("sd", "Sudan"),
    SE("se", "Sweden"),
    SG("sg", "Singapore"),
    SI("si", "Slovenia"),
    SK("sk", "Slovakia"),
    SL("sl", "Sierra Leone"),
    SM("sm", "San Marino"),
    SN("sn", "Senegal"),
    SO("so", "Somali"),
    SR("sr", "Suriname"),
    ST("st", "Sao Tome and Principe"),
    SV(com.alipay.sdk.m.s.a.f11006t, "EI Salvador"),
    SY("sy", "Syria"),
    SZ("sz", "Swaziland"),
    TD(TimeDisplaySetting.TIME_DISPLAY, "Chad"),
    TG("tg", "Togo"),
    TH("th", "Thailand"),
    TJ("tj", "Tajikstan"),
    TM("tm", "Turkmenistan"),
    TN("tn", "Tunisia"),
    TO("to", "Tonga"),
    TR("tr", "Turkey"),
    TT("tt", "Trinidad and Tobago"),
    TW("tw", "Taiwan"),
    TZ("tz", "Tanzania"),
    UA(com.igexin.push.g.o.f38735d, "Ukraine"),
    UG("ug", "Uganda"),
    US("us", "United States of America"),
    UY("uy", "Uruguay"),
    UZ("uz", "Uzbekistan"),
    VC("vc", "Saint Vincent"),
    VE("ve", "Venezuela"),
    VN("vn", "Vietnam"),
    YE("ye", "Yemen"),
    YU("yu", "Yugoslavia"),
    ZA("za", "South Africa"),
    ZM("zm", "Zambia"),
    ZR("zr", "Zaire"),
    ZW("zw", "Zimbabwe"),
    DEFAULT(null, null);


    /* renamed from: sp, reason: collision with root package name */
    private static SharePrefrenceHelper f40088sp;
    private String domain;
    private String region;

    InternationalDomain(String str, String str2) {
        this.domain = str;
        this.region = str2;
    }

    public static InternationalDomain domainOf(String str) {
        if (str == null) {
            return DEFAULT;
        }
        for (InternationalDomain internationalDomain : values()) {
            if (str.equalsIgnoreCase(internationalDomain.domain)) {
                return internationalDomain;
            }
        }
        return DEFAULT;
    }

    public static synchronized InternationalDomain readFromBuffer() {
        synchronized (InternationalDomain.class) {
            try {
                if (f40088sp == null) {
                    SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
                    f40088sp = sharePrefrenceHelper;
                    sharePrefrenceHelper.open("domain", 1);
                }
                String string = f40088sp.getString("domain");
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                if ("null".equalsIgnoreCase(string)) {
                    return DEFAULT;
                }
                return domainOf(string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void saveBuffer(InternationalDomain internationalDomain) {
        synchronized (InternationalDomain.class) {
            try {
                if (f40088sp == null) {
                    SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
                    f40088sp = sharePrefrenceHelper;
                    sharePrefrenceHelper.open("domain", 1);
                }
                if (internationalDomain == null) {
                    f40088sp.putString("domain", "null");
                } else {
                    f40088sp.putString("domain", internationalDomain.domain);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String getDomain() {
        return this.domain;
    }

    public String getRegion() {
        return this.region;
    }
}
