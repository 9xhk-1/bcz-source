package com.baicizhan.client.business.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class LunarUtils {
    private static int[] lunar_month_days = {1887, 5780, 5802, 19157, 2742, 50359, 1198, 2646, 46378, 7466, com.badlogic.gdx.graphics.f.f11559b1, 30122, 5482, 67949, 2396, 5294, 43597, 6732, 6954, com.badlogic.gdx.graphics.f.B4, 2772, 4954, 18781, 2396, 54427, 5274, 6730, 47781, 5800, 6868, 21210, 4790, 59703, 2350, 5270, 46667, 3402, 3496, 38325, 1388, 4782, 18735, 2350, 52374, 6804, 7498, 44457, 2906, 1388, 29294, 4700, 63789, 6442, 6804, 56138, 5802, 2772, 38235, 1210, 4698, 22827, 5418, 63125, 3476, 5802, 43701, 2484, 5302, 27223, 2646, 70954, 7466, com.badlogic.gdx.graphics.f.f11559b1, 54698, 5482, 2412, 38062, 5294, 2636, 32038, 6954, 60245, 2772, 4826, 43357, 2394, 5274, 39501, 6730, 72357, 5800, 5844, 53978, 4790, 2358, 38039, 5270, 87627, 3402, 3496, 54708, 5484, 4782, 43311, 2350, 3222, 27978, 7498, 68965, 2904, 5484, 45677, 4700, 6444, 39573, 6804, 6986, 19285, 2772, 62811, 1210, 4698, 47403, 5418, 5780, 38570, 5546, 76469, 2420, 5302, 51799, 2646, 5414, 36501, com.badlogic.gdx.graphics.f.f11559b1, 5546, 18869, 2412, 54446, 5276, 6732, 48422, 6822, 2900, 28010, 4826, 92509, 2394, 5274, 55883, 6730, 6820, 47956, 5812, 2778, 18779, 2358, 62615, 5270, 5450, 46757, 3492, 5556, 27318, 4718, 67887, 2350, 3222, 52554, 7498, 3428, 38252, 5468, 4700, 31022, 6444, 64149, 6804, 6986, 43861, 2772, 5338, 35421, 2650, 70955, 5418, 5780, 54954, 5546, 2740, 38074, 5302, 2646, 29991, 3366, 61011, com.badlogic.gdx.graphics.f.f11559b1, 5546, 43445, 2412, 5294, 35406, 6732, 72998, 6820, 6996, 52586, 2778, 2396, 38045, 5274, 6698, 23333, 6820, 64338, 5812, 2746, 43355, 2358, 5270, 39499, 5450, 79525, 3492, 5548};
    private static int[] solar_1_1 = {1887, 966732, 967231, 967733, 968265, 968766, 969297, 969798, 970298, 970829, 971330, 971830, 972362, 972863, 973395, 973896, 974397, 974928, 975428, 975929, 976461, 976962, 977462, 977994, 978494, 979026, 979526, 980026, 980558, 981059, 981559, 982091, 982593, 983124, 983624, 984124, 984656, 985157, 985656, 986189, 986690, 987191, 987722, 988222, 988753, 989254, 989754, 990286, 990788, 991288, 991819, 992319, 992851, 993352, 993851, 994383, 994885, 995385, 995917, 996418, 996918, 997450, 997949, 998481, 998982, 999483, 1000014, 1000515, 1001016, 1001548, 1002047, 1002578, 1003080, 1003580, 1004111, 1004613, 1005113, 1005645, 1006146, 1006645, 1007177, 1007678, 1008209, 1008710, 1009211, 1009743, 1010243, 1010743, 1011275, 1011775, 1012306, 1012807, 1013308, 1013840, 1014341, 1014841, 1015373, 1015874, 1016404, 1016905, 1017405, 1017937, 1018438, 1018939, 1019471, 1019972, 1020471, 1021002, 1021503, 1022035, 1022535, 1023036, 1023568, 1024069, 1024568, 1025100, 1025601, 1026102, 1026633, 1027133, 1027666, 1028167, 1028666, 1029198, 1029699, 1030199, 1030730, 1031231, 1031763, 1032264, 1032764, 1033296, 1033797, 1034297, 1034828, 1035329, 1035830, 1036362, 1036861, 1037393, 1037894, 1038394, 1038925, 1039427, 1039927, 1040459, 1040959, 1041491, 1041992, 1042492, 1043023, 1043524, 1044024, 1044556, 1045057, 1045558, 1046090, 1046590, 1047121, 1047622, 1048122, 1048654, 1049154, 1049655, 1050187, 1050689, 1051219, 1051720, 1052220, 1052751, 1053252, 1053752, 1054284, 1054786, 1055285, 1055817, 1056317, 1056849, 1057349, 1057850, 1058382, 1058883, 1059383, 1059915, 1060415, 1060947, 1061447, 1061947, 1062479, 1062981, 1063480, 1064012, 1064514, 1065014, 1065545, 1066045, 1066577, 1067078, 1067578, 1068110, 1068611, 1069112, 1069642, 1070142, 1070674, 1071175, 1071675, 1072207, 1072709, 1073209, 1073740, 1074241, 1074741, 1075273, 1075773, 1076305, 1076807, 1077308, 1077839, 1078340, 1078840, 1079372, 1079871, 1080403, 1080904};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Lunar {
        public boolean isleap;
        public int lunarDay;
        public int lunarMonth;
        public int lunarYear;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Solar {
        public int solarDay;
        public int solarMonth;
        public int solarYear;
    }

    private static int GetBitInt(int data, int length, int shift) {
        return (data & (((1 << length) - 1) << shift)) >> shift;
    }

    public static Solar LunarToSolar(Lunar lunar) {
        int[] iArr = lunar_month_days;
        int i11 = iArr[lunar.lunarYear - iArr[0]];
        int GetBitInt = GetBitInt(i11, 4, 13);
        if (!lunar.isleap) {
            int i12 = lunar.lunarMonth;
            GetBitInt = (i12 <= GetBitInt || GetBitInt == 0) ? i12 - 1 : i12;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < GetBitInt; i14++) {
            i13 += GetBitInt(i11, 1, 12 - i14) == 1 ? 30 : 29;
        }
        int i15 = i13 + lunar.lunarDay;
        int[] iArr2 = solar_1_1;
        int i16 = iArr2[lunar.lunarYear - iArr2[0]];
        return SolarFromInt((SolarToInt(GetBitInt(i16, 12, 9), GetBitInt(i16, 4, 5), GetBitInt(i16, 5, 0)) + i15) - 1);
    }

    private static Solar SolarFromInt(long g11) {
        long j11 = ((10000 * g11) + 14780) / 3652425;
        long j12 = g11 - ((((j11 * 365) + (j11 / 4)) - (j11 / 100)) + (j11 / 400));
        if (j12 < 0) {
            j11--;
            j12 = g11 - ((((365 * j11) + (j11 / 4)) - (j11 / 100)) + (j11 / 400));
        }
        long j13 = ((100 * j12) + 52) / 3060;
        long j14 = 2 + j13;
        long j15 = (j14 % 12) + 1;
        long j16 = j11 + (j14 / 12);
        Solar solar = new Solar();
        solar.solarYear = (int) j16;
        solar.solarMonth = (int) j15;
        solar.solarDay = (int) ((j12 - (((j13 * 306) + 5) / 10)) + 1);
        return solar;
    }

    private static long SolarToInt(int y11, int m11, int d11) {
        int i11 = y11 - (((m11 + 9) % 12) / 10);
        return (((i11 * 365) + (i11 / 4)) - (i11 / 100)) + (i11 / 400) + (((r3 * 306) + 5) / 10) + (d11 - 1);
    }

    public static Lunar SolarToLunar(Solar solar) {
        Lunar lunar = new Lunar();
        int i11 = solar.solarYear;
        int[] iArr = solar_1_1;
        int i12 = i11 - iArr[0];
        if (iArr[i12] > ((i11 << 9) | (solar.solarMonth << 5) | solar.solarDay)) {
            i12--;
        }
        int i13 = iArr[i12];
        long SolarToInt = SolarToInt(solar.solarYear, solar.solarMonth, solar.solarDay) - SolarToInt(GetBitInt(i13, 12, 9), GetBitInt(i13, 4, 5), GetBitInt(i13, 5, 0));
        int i14 = lunar_month_days[i12];
        int GetBitInt = GetBitInt(i14, 4, 13);
        int i15 = i12 + solar_1_1[0];
        long j11 = SolarToInt + 1;
        int i16 = 1;
        for (int i17 = 0; i17 < 13; i17++) {
            long j12 = GetBitInt(i14, 1, 12 - i17) == 1 ? 30 : 29;
            if (j11 <= j12) {
                break;
            }
            i16++;
            j11 -= j12;
        }
        int i18 = (int) j11;
        lunar.lunarYear = i15;
        lunar.lunarMonth = i16;
        lunar.isleap = false;
        if (GetBitInt != 0 && i16 > GetBitInt) {
            lunar.lunarMonth = i16 - 1;
            if (i16 == GetBitInt + 1) {
                lunar.isleap = true;
            }
        }
        lunar.lunarDay = i18;
        return lunar;
    }

    public static String lunarYearToGanZhi(int lunarYear) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = lunarYear - 4;
        sb2.append(new String[]{"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"}[i11 % 10]);
        sb2.append(new String[]{"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"}[i11 % 12]);
        sb2.append("年");
        return sb2.toString();
    }
}
