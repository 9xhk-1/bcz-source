package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.badlogic.gdx.scenes.scene2d.ui.w;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.igexin.assist.sdk.AssistPushConsts;
import com.jiongji.andriod.card.R;
import ho.o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jp.k;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.fusesource.jansi.Ansi;
import qp.j;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;

    @Nullable
    @SuppressLint({"NonFinalStaticField", "StaticFieldLeak"})
    private static DefaultBandwidthMeter singletonInstance;

    @GuardedBy("this")
    private long bitrateEstimate;
    private final Clock clock;

    @Nullable
    private final Context context;
    private String countryCode;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;

    @GuardedBy("this")
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;

    @GuardedBy("this")
    private long sampleBytesTransferred;

    @GuardedBy("this")
    private long sampleStartTimeMs;

    @GuardedBy("this")
    private final SlidingPercentile slidingPercentile;

    @GuardedBy("this")
    private int streamCount;

    @GuardedBy("this")
    private long totalBytesTransferred;

    @GuardedBy("this")
    private long totalElapsedTimeMs;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);

    static {
        Long valueOf = Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.of((long) valueOf, 1300000L, 1000000L, 860000L, 610000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.of(2500000L, 1700000L, (long) Long.valueOf(com.igexin.push.config.c.f37548g), 970000L, 680000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.of(2700000L, (long) valueOf, 1600000L, 1300000L, 1000000L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int[] getInitialBitrateCountryGroupAssignment(String str) {
        str.getClass();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c11 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c11 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c11 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c11 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c11 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c11 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c11 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c11 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c11 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c11 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c11 = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c11 = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c11 = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c11 = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c11 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c11 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c11 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c11 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c11 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c11 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c11 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c11 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c11 = Ansi.f77778c;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c11 = sp.b.f88892n;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c11 = sp.b.f88893o;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c11 = sp.b.f88894p;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c11 = to.c.f90845b;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c11 = ' ';
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c11 = PublicSuffixDatabase.f77441i;
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c11 = '\"';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c11 = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c11 = '$';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c11 = '%';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c11 = u0.f91708d;
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c11 = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c11 = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c11 = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c11 = '*';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c11 = '+';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c11 = ',';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c11 = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c11 = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c11 = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c11 = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c11 = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c11 = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c11 = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c11 = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c11 = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c11 = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c11 = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c11 = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c11 = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c11 = ':';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c11 = l70.f.f70689d;
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c11 = u0.f91709e;
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c11 = '=';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c11 = u0.f91710f;
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c11 = s60.d.f88057a;
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c11 = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c11 = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c11 = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c11 = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c11 = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c11 = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c11 = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c11 = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c11 = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c11 = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c11 = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c11 = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c11 = 'L';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c11 = io.ktor.util.date.b.f62001g;
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c11 = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c11 = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c11 = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c11 = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c11 = 'R';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c11 = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c11 = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c11 = 'U';
                    break;
                }
                break;
            case 2285:
                if (str.equals(com.igexin.push.core.b.f37738j)) {
                    c11 = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c11 = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c11 = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c11 = io.ktor.util.date.b.f62002h;
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c11 = 'Z';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c11 = '[';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c11 = '\\';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c11 = l50.b.f69930l;
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c11 = '^';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c11 = '_';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c11 = '`';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c11 = 'a';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c11 = 'b';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c11 = 'c';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c11 = io.ktor.util.date.b.f62000f;
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c11 = 'e';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c11 = 'f';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c11 = 'g';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c11 = io.ktor.util.date.b.f61999e;
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c11 = 'i';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c11 = 'j';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c11 = 'k';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c11 = 'l';
                    break;
                }
                break;
            case 2396:
                if (str.equals(k.f64571q)) {
                    c11 = io.ktor.util.date.b.f61998d;
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c11 = 'n';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c11 = 'o';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c11 = 'p';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c11 = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c11 = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c11 = io.ktor.util.date.b.f61997c;
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c11 = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c11 = l50.b.f69934p;
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c11 = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals(k.f64572r)) {
                    c11 = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c11 = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c11 = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c11 = io.ktor.util.date.b.f62003i;
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c11 = l50.b.f69927i;
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c11 = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c11 = l50.b.f69928j;
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c11 = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c11 = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c11 = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c11 = j.f82604a;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c11 = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c11 = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c11 = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c11 = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c11 = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c11 = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c11 = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c11 = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c11 = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c11 = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c11 = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c11 = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c11 = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c11 = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c11 = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c11 = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c11 = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c11 = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c11 = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c11 = w.f13083u1;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c11 = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c11 = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c11 = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c11 = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c11 = 154;
                    break;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    c11 = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c11 = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c11 = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c11 = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c11 = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c11 = u0.f91711g;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c11 = 161;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c11 = u0.f91713i;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c11 = u0.f91714j;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c11 = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c11 = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c11 = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c11 = u0.f91715k;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c11 = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c11 = u0.f91716l;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c11 = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c11 = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c11 = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c11 = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c11 = u0.f91719o;
                    break;
                }
                break;
            case 2564:
                if (str.equals(AssistPushConsts.MSG_VALUE_PAYLOAD)) {
                    c11 = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c11 = u0.f91720p;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c11 = u0.f91721q;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c11 = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c11 = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c11 = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c11 = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c11 = u0.f91722r;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c11 = u0.f91723s;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c11 = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c11 = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c11 = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c11 = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c11 = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c11 = u0.f91724t;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c11 = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c11 = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c11 = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c11 = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c11 = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c11 = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c11 = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c11 = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c11 = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c11 = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c11 = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c11 = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c11 = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c11 = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c11 = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c11 = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c11 = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c11 = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c11 = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c11 = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c11 = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c11 = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c11 = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c11 = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c11 = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c11 = u0.f91712h;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c11 = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c11 = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c11 = 218;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c11 = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c11 = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c11 = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c11 = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c11 = 223;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c11 = 224;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c11 = 225;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c11 = 226;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c11 = 227;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c11 = 228;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c11 = 229;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c11 = j.f82605b;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c11 = j.f82606c;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c11 = 232;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c11 = 233;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c11 = 234;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c11 = j.f82607d;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c11 = j.f82608e;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c11 = j.f82609f;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c11 = j.f82610g;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 4:
            case 17:
            case 29:
            case '2':
            case '9':
            case 'q':
            case 't':
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case ')':
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '\b':
            case '?':
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 2, 2, 1, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case '=':
            case ']':
            case 'f':
            case 127:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 3, 1, 1, 3, 0};
            case '\r':
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case '3':
            case 'y':
            case 144:
            case 172:
            case 195:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case '7':
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 'j':
            case R.styleable.Theme_drawable_review_sound /* 214 */:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 'T':
            case '\\':
            case 154:
            case 226:
            case R.styleable.Theme_drawable_tab_lecture_new /* 234 */:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case 141:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case ' ':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '!':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '\"':
                return new int[]{1, 2, 3, 3, 2, 2};
            case '#':
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '$':
            case R.styleable.Theme_drawable_searchwords /* 219 */:
                return new int[]{0, 2, 1, 2, 3, 3};
            case '%':
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '&':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '\'':
            case '>':
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case '(':
                return new int[]{0, 1, 0, 0, 0, 2};
            case '+':
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case ',':
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case '-':
                return new int[]{2, 0, 1, 1, 3, 1};
            case '.':
                return new int[]{2, 3, 3, 2, 2, 2};
            case '/':
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case '0':
            case 'o':
            case 161:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case '1':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '4':
                return new int[]{1, 0, 1, 0, 0, 2};
            case '5':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '6':
                return new int[]{0, 1, 4, 2, 2, 1};
            case '8':
                return new int[]{0, 0, 2, 0, 0, 2};
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ';':
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case '<':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
                return new int[]{0, 0, 0, 0, 1, 0};
            case 'A':
                return new int[]{4, 3, 4, 4, 4, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'D':
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{4, 2, 4, 0, 2, 2};
            case 'F':
                return new int[]{0, 2, 2, 0, 2, 2};
            case 'G':
                return new int[]{1, 1, 1, 1, 0, 2};
            case 'H':
                return new int[]{3, 4, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 1, 3, 2, 2, 2};
            case 'J':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 'K':
                return new int[]{1, 1, 0, 2, 2, 2};
            case 'L':
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'M':
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'N':
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'O':
            case 'a':
            case 'h':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'P':
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 'Q':
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'R':
                return new int[]{3, 4, 4, 2, 2, 2};
            case 'S':
                return new int[]{2, 1, 1, 3, 2, 2};
            case 'U':
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'V':
                return new int[]{2, 1, 2, 1, 2, 2};
            case 'W':
                return new int[]{2, 2, 4, 3, 3, 2};
            case 'X':
                return new int[]{4, 4, 1, 2, 2, 2};
            case 'Y':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 0, 1, 1, 0};
            case '[':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '^':
                return new int[]{3, 1, 3, 3, 2, 4};
            case '_':
                return new int[]{1, 1, 1, 1, 1, 2};
            case '`':
                return new int[]{1, 2, 2, 3, 4, 2};
            case 'b':
                return new int[]{1, 1, 3, 2, 2, 3};
            case 'c':
                return new int[]{3, 2, 2, 0, 2, 2};
            case 'd':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'e':
                return new int[]{4, 2, 3, 3, 4, 3};
            case 'g':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'i':
                return new int[]{2, 4, 3, 1, 2, 2};
            case 'k':
                return new int[]{0, 3, 2, 3, 4, 2};
            case 'l':
                return new int[]{3, 2, 1, 1, 1, 2};
            case 'm':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'n':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'p':
            case R.styleable.Theme_drawable_tab_friends /* 230 */:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 'r':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 3, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 1, 1, 2, 2, 2};
            case 'x':
                return new int[]{2, 2, 1, 1, 2, 2};
            case 'z':
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case '|':
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case '}':
                return new int[]{0, 1, 0, 1, 0, 2};
            case '~':
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case R.styleable.Theme_drawable_right_arrow /* 216 */:
            case R.styleable.Theme_drawable_tab_friends_new /* 231 */:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case R.styleable.Theme_drawable_tab_home /* 232 */:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case R.styleable.Theme_drawable_tab_mall /* 235 */:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case R.styleable.Theme_drawable_tab_review /* 238 */:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 207:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case R.styleable.Theme_drawable_reset_plan /* 213 */:
                return new int[]{3, 2, 4, 3, 2, 2};
            case R.styleable.Theme_drawable_revocation /* 215 */:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case R.styleable.Theme_drawable_share /* 220 */:
                return new int[]{3, 3, 2, 3, 4, 2};
            case R.styleable.Theme_drawable_share_close /* 221 */:
                return new int[]{2, 2, 4, 1, 3, 1};
            case R.styleable.Theme_drawable_sound /* 222 */:
                return new int[]{2, 1, 1, 2, 1, 2};
            case R.styleable.Theme_drawable_sound1 /* 223 */:
                return new int[]{1, 2, 3, 4, 3, 2};
            case R.styleable.Theme_drawable_syncview /* 227 */:
                return new int[]{2, 2, 1, 1, 2, 4};
            case R.styleable.Theme_drawable_syncview_error /* 228 */:
                return new int[]{0, 2, 1, 2, 2, 2};
            case R.styleable.Theme_drawable_syncview_update /* 229 */:
                return new int[]{0, 0, 1, 2, 2, 2};
            case R.styleable.Theme_drawable_tab_lecture /* 233 */:
                return new int[]{1, 2, 1, 1, 2, 2};
            case R.styleable.Theme_drawable_tab_mall_1111 /* 236 */:
                return new int[]{2, 4, 2, 1, 1, 2};
            case R.styleable.Theme_drawable_tab_mall_new /* 237 */:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i11) {
        Long l11 = this.initialBitrateEstimates.get(Integer.valueOf(i11));
        if (l11 == null) {
            l11 = this.initialBitrateEstimates.get(0);
        } else if (l11.longValue() == C.TIME_UNSET) {
            l11 = Long.valueOf(getInitialBitrateEstimatesForCountry(this.countryCode, i11));
        }
        if (l11 == null) {
            l11 = 1000000L;
        }
        return l11.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getInitialBitrateEstimatesForCountry(@Nullable String str, int i11) {
        int[] initialBitrateCountryGroupAssignment = getInitialBitrateCountryGroupAssignment(o0.g(str));
        if (i11 != 2) {
            if (i11 == 3) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]).longValue();
            }
            if (i11 == 4) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]).longValue();
            }
            if (i11 == 5) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]).longValue();
            }
            if (i11 != 7) {
                if (i11 == 9) {
                    return DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]).longValue();
                }
                if (i11 != 10) {
                    return 1000000L;
                }
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]).longValue();
            }
        }
        return DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]).longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        synchronized (DefaultBandwidthMeter.class) {
            try {
                if (singletonInstance == null) {
                    singletonInstance = new Builder(context).build();
                }
                defaultBandwidthMeter = singletonInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return defaultBandwidthMeter;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z11) {
        return z11 && !dataSpec.isFlagSet(8);
    }

    @GuardedBy("this")
    private void maybeNotifyBandwidthSample(int i11, long j11, long j12) {
        if (i11 == 0 && j11 == 0 && j12 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j12;
        this.eventDispatcher.bandwidthSample(i11, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i11) {
        Throwable th2;
        try {
            try {
                int i12 = this.networkType;
                if (i12 != 0) {
                    try {
                        if (!this.resetOnNetworkTypeChange) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (this.networkTypeOverrideSet) {
                    i11 = this.networkTypeOverride;
                }
                if (i12 != i11 || this.countryCode == null) {
                    this.networkType = i11;
                    if (i11 == 1 || i11 == 0 || i11 == 8) {
                        return;
                    }
                    if (this.countryCode == null) {
                        this.countryCode = Util.getCountryCode(this.context);
                    }
                    this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i11);
                    long elapsedRealtime = this.clock.elapsedRealtime();
                    maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (elapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                    this.sampleStartTimeMs = elapsedRealtime;
                    this.sampleBytesTransferred = 0L;
                    this.totalBytesTransferred = 0L;
                    this.totalElapsedTimeMs = 0L;
                    this.slidingPercentile.reset();
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z11, int i11) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z11)) {
            this.sampleBytesTransferred += i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10.totalBytesTransferred >= android.support.v4.media.session.PlaybackStateCompat.F) goto L22;
     */
    @Override // androidx.media3.datasource.TransferListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferEnd(androidx.media3.datasource.DataSource r11, androidx.media3.datasource.DataSpec r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = isTransferAtFullNetworkSpeed(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.streamCount     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            androidx.media3.common.util.Assertions.checkState(r11)     // Catch: java.lang.Throwable -> L72
            androidx.media3.common.util.Clock r11 = r10.clock     // Catch: java.lang.Throwable -> L72
            long r0 = r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.sampleStartTimeMs     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.totalElapsedTimeMs = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.totalBytesTransferred = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            androidx.media3.exoplayer.upstream.SlidingPercentile r13 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.addSample(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            androidx.media3.exoplayer.upstream.SlidingPercentile r11 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.getPercentile(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.bitrateEstimate = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r8 = r10.bitrateEstimate     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.maybeNotifyBandwidthSample(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.sampleStartTimeMs = r0     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r4.sampleBytesTransferred = r0     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r11 = r4.streamCount     // Catch: java.lang.Throwable -> L6f
            int r11 = r11 - r12
            r4.streamCount = r11     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)
            return
        L7d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.onTransferEnd(androidx.media3.datasource.DataSource, androidx.media3.datasource.DataSpec, boolean):void");
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z11) {
        try {
            if (isTransferAtFullNetworkSpeed(dataSpec, z11)) {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i11) {
        this.networkTypeOverride = i11;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private Clock clock;

        @Nullable
        private final Context context;
        private final Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            Long valueOf = Long.valueOf(C.TIME_UNSET);
            this.context = context == null ? null : context.getApplicationContext();
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
            HashMap hashMap = new HashMap(8);
            this.initialBitrateEstimates = hashMap;
            hashMap.put(0, 1000000L);
            hashMap.put(2, valueOf);
            hashMap.put(3, valueOf);
            hashMap.put(4, valueOf);
            hashMap.put(5, valueOf);
            hashMap.put(10, valueOf);
            hashMap.put(9, valueOf);
            hashMap.put(7, valueOf);
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        @uo.a
        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @uo.a
        public Builder setInitialBitrateEstimate(long j11) {
            Iterator<Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j11);
            }
            return this;
        }

        @uo.a
        public Builder setResetOnNetworkTypeChange(boolean z11) {
            this.resetOnNetworkTypeChange = z11;
            return this;
        }

        @uo.a
        public Builder setSlidingWindowMaxWeight(int i11) {
            this.slidingWindowMaxWeight = i11;
            return this;
        }

        @uo.a
        public Builder setInitialBitrateEstimate(int i11, long j11) {
            this.initialBitrateEstimates.put(Integer.valueOf(i11), Long.valueOf(j11));
            return this;
        }

        @uo.a
        public Builder setInitialBitrateEstimate(String str) {
            String j11 = ho.c.j(str);
            for (Integer num : this.initialBitrateEstimates.keySet()) {
                setInitialBitrateEstimate(num.intValue(), DefaultBandwidthMeter.getInitialBitrateEstimatesForCountry(j11, num.intValue()));
            }
            return this;
        }
    }

    private DefaultBandwidthMeter(@Nullable Context context, Map<Integer, Long> map, int i11, Clock clock, boolean z11) {
        this.context = context == null ? null : context.getApplicationContext();
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i11);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z11;
        if (context == null) {
            this.networkType = 0;
            this.bitrateEstimate = 1000000L;
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: androidx.media3.exoplayer.upstream.c
            @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i12) {
                DefaultBandwidthMeter.this.onNetworkTypeChanged(i12);
            }
        }, BackgroundExecutor.get());
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z11) {
    }
}
