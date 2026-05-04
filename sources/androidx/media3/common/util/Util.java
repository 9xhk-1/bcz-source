package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.Player;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.d1;
import com.google.common.util.concurrent.h2;
import com.google.common.util.concurrent.p1;
import com.google.common.util.concurrent.w1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.jiongji.andriod.card.R;
import com.xiaomi.mipush.sdk.Constants;
import ix.l1;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Util {
    private static final int[] CRC16_BYTES_MSBF;
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;

    @UnstableApi
    @Deprecated
    public static final String DEVICE;

    @UnstableApi
    public static final String DEVICE_DEBUG_INFO;

    @UnstableApi
    public static final byte[] EMPTY_BYTE_ARRAY;

    @UnstableApi
    public static final long[] EMPTY_LONG_ARRAY;
    private static final Pattern ESCAPED_CHARACTER_PATTERN;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_PATH_PATTERN;

    @UnstableApi
    @Deprecated
    public static final String MANUFACTURER;

    @UnstableApi
    @Deprecated
    public static final String MODEL;

    @UnstableApi
    public static final int SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN;
    private static final Pattern XS_DURATION_PATTERN;
    private static final int ZLIB_INFLATE_HEADER = 120;
    private static final String[] additionalIsoLanguageReplacements;
    private static final String[] isoLegacyTagReplacements;

    @Nullable
    private static HashMap<String, String> languageTagReplacementMap;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29 {
        private Api29() {
        }

        public static void startForeground(Service service, int i11, Notification notification, int i12, String str) {
            try {
                service.startForeground(i11, notification, i12);
            } catch (RuntimeException e11) {
                Log.e(Util.TAG, "The service must be declared with a foregroundServiceType that includes " + str);
                throw e11;
            }
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        SDK_INT = i11;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + j2.O + str3 + j2.O + str2 + j2.O + i11;
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_LONG_ARRAY = new long[0];
        XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_PATH_PATTERN = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", oc.h.f76767b, "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC16_BYTES_MSBF = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, R.styleable.Theme_drawable_tab_friends_new, R.styleable.Theme_drawable_tab_review, R.styleable.Theme_drawable_tab_lecture, R.styleable.Theme_drawable_wiki_sound1, R.styleable.Theme_drawable_wiki_sound, R.styleable.Theme_drawable_time, R.styleable.Theme_drawable_walk_sound1, R.styleable.Theme_drawable_right_arrow, R.styleable.Theme_drawable_sound1, R.styleable.Theme_drawable_review_sound, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, R.styleable.Theme_drawable_searchwords, R.styleable.Theme_drawable_share, R.styleable.Theme_drawable_reset_plan, 210, 255, R.styleable.Theme_drawable_walk_sound4, R.styleable.Theme_drawable_test_nodate, R.styleable.Theme_drawable_walk_sound2, R.styleable.Theme_drawable_syncview, R.styleable.Theme_drawable_syncview_error, R.styleable.Theme_drawable_tab_mall_new, R.styleable.Theme_drawable_tab_lecture_new, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, R.styleable.Theme_drawable_walk_sound3, 240, R.styleable.Theme_drawable_syncview_update, 226, R.styleable.Theme_drawable_tab_mall, R.styleable.Theme_drawable_tab_mall_1111, 193, 198, 207, 200, R.styleable.Theme_drawable_share_close, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, R.styleable.Theme_drawable_sound, 217, 208, R.styleable.Theme_drawable_revocation, 194, 197, 204, 203, R.styleable.Theme_drawable_tab_friends, 225, R.styleable.Theme_drawable_tab_home, R.styleable.Theme_drawable_tab_surrounding, 250, 253, 244, 243};
    }

    private Util() {
    }

    public static /* synthetic */ void a(h2 h2Var, Runnable runnable, Object obj) {
        try {
            if (h2Var.isCancelled()) {
                return;
            }
            runnable.run();
            h2Var.B(obj);
        } catch (Throwable th2) {
            h2Var.C(th2);
        }
    }

    @UnstableApi
    public static long addWithOverflowDefault(long j11, long j12, long j13) {
        long j14 = j11 + j12;
        return ((j11 ^ j14) & (j12 ^ j14)) < 0 ? j13 : j14;
    }

    @uo.l(imports = {"java.util.Objects"}, replacement = "Objects.equals(o1, o2)")
    @UnstableApi
    @Deprecated
    public static boolean areEqual(@Nullable Object obj, @Nullable Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static /* synthetic */ void b(h2 h2Var, p1 p1Var) {
        if (h2Var.isCancelled()) {
            p1Var.cancel(false);
        }
    }

    @UnstableApi
    public static int binarySearchCeil(int[] iArr, int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int binarySearch = Arrays.binarySearch(iArr, i11);
        if (binarySearch < 0) {
            i13 = ~binarySearch;
        } else {
            while (true) {
                i12 = binarySearch + 1;
                if (i12 >= iArr.length || iArr[i12] != i11) {
                    break;
                }
                binarySearch = i12;
            }
            i13 = z11 ? binarySearch : i12;
        }
        return z12 ? Math.min(iArr.length - 1, i13) : i13;
    }

    @UnstableApi
    public static int binarySearchFloor(int[] iArr, int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int binarySearch = Arrays.binarySearch(iArr, i11);
        if (binarySearch < 0) {
            i13 = -(binarySearch + 2);
        } else {
            while (true) {
                i12 = binarySearch - 1;
                if (i12 < 0 || iArr[i12] != i11) {
                    break;
                }
                binarySearch = i12;
            }
            i13 = z11 ? binarySearch : i12;
        }
        return z12 ? Math.max(0, i13) : i13;
    }

    public static /* synthetic */ void c(p1 p1Var, h2 h2Var, com.google.common.util.concurrent.x xVar) {
        try {
            try {
                h2Var.D(xVar.apply(d1.j(p1Var)));
            } catch (Throwable th2) {
                h2Var.C(th2);
            }
        } catch (Error e11) {
            e = e11;
            h2Var.C(e);
        } catch (CancellationException unused) {
            h2Var.cancel(false);
        } catch (RuntimeException e12) {
            e = e12;
            h2Var.C(e);
        } catch (ExecutionException e13) {
            e = e13;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            h2Var.C(e);
        }
    }

    @UnstableApi
    public static int ceilDivide(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItemArr) {
        if (SDK_INT < 24) {
            return true;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isTrafficRestricted(localConfiguration.uri)) {
                    return false;
                }
                for (int i11 = 0; i11 < mediaItem.localConfiguration.subtitleConfigurations.size(); i11++) {
                    if (isTrafficRestricted(mediaItem.localConfiguration.subtitleConfigurations.get(i11).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @UnstableApi
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @UnstableApi
    public static int compareLong(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    @UnstableApi
    public static int constrainValue(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i11, i13));
    }

    @UnstableApi
    public static boolean contains(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public static <T> boolean contentEquals(@Nullable SparseArray<T> sparseArray, @Nullable SparseArray<T> sparseArray2) {
        boolean contentEquals;
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (SDK_INT >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
            return contentEquals;
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!Objects.equals(sparseArray.valueAt(i11), sparseArray2.get(sparseArray.keyAt(i11)))) {
                return false;
            }
        }
        return true;
    }

    @UnstableApi
    public static <T> int contentHashCode(SparseArray<T> sparseArray) {
        int contentHashCode;
        if (SDK_INT >= 31) {
            contentHashCode = sparseArray.contentHashCode();
            return contentHashCode;
        }
        int i11 = 17;
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            i11 = (((i11 * 31) + sparseArray.keyAt(i12)) * 31) + Objects.hashCode(sparseArray.valueAt(i12));
        }
        return i11;
    }

    @UnstableApi
    public static int crc16(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            int p11 = ro.r.p(bArr[i11]);
            i13 = crc16UpdateFourBits(p11 & 15, crc16UpdateFourBits(p11 >> 4, i13));
            i11++;
        }
        return i13;
    }

    private static int crc16UpdateFourBits(int i11, int i12) {
        return (CRC16_BYTES_MSBF[(i11 ^ ((i12 >> 12) & 255)) & 255] ^ ((i12 << 4) & 65535)) & 65535;
    }

    @UnstableApi
    public static int crc32(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = CRC32_BYTES_MSBF[((i13 >>> 24) ^ (bArr[i11] & 255)) & 255] ^ (i13 << 8);
            i11++;
        }
        return i13;
    }

    @UnstableApi
    public static int crc8(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = CRC8_BYTES_MSBF[i13 ^ (bArr[i11] & 255)];
            i11++;
        }
        return i13;
    }

    @UnstableApi
    public static Handler createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
        int i11 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = additionalIsoLanguageReplacements;
            if (i11 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i11], strArr[i11 + 1]);
            i11 += 2;
        }
    }

    @UnstableApi
    public static ByteBuffer createReadOnlyByteBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    @UnstableApi
    public static File createTempDirectory(Context context, String str) throws IOException {
        File createTempFile = createTempFile(context, str);
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    @UnstableApi
    public static File createTempFile(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) Assertions.checkNotNull(context.getCacheDir()));
    }

    public static /* synthetic */ Thread d(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @UnstableApi
    public static long durationUsToSampleCount(long j11, int i11) {
        return scaleLargeValue(j11, i11, 1000000L, RoundingMode.UP);
    }

    public static /* synthetic */ Thread e(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @UnstableApi
    public static String escapeFileName(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (shouldEscapeCharacter(str.charAt(i13))) {
                i12++;
            }
        }
        if (i12 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i12 * 2) + length);
        while (i12 > 0) {
            int i14 = i11 + 1;
            char charAt = str.charAt(i11);
            if (shouldEscapeCharacter(charAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(charAt));
                i12--;
            } else {
                sb2.append(charAt);
            }
            i11 = i14;
        }
        if (i11 < length) {
            sb2.append((CharSequence) str, i11, length);
        }
        return sb2.toString();
    }

    @UnstableApi
    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    @UnstableApi
    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @UnstableApi
    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    @UnstableApi
    public static int generateAudioSessionIdV21(Context context) {
        return AudioManagerCompat.getAudioManager(context).generateAudioSessionId();
    }

    @Nullable
    public static String getAdaptiveMimeTypeForContentType(int i11) {
        if (i11 == 0) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (i11 == 1) {
            return MimeTypes.APPLICATION_SS;
        }
        if (i11 != 2) {
            return null;
        }
        return MimeTypes.APPLICATION_M3U8;
    }

    @UnstableApi
    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i11) {
        if (i11 == 20) {
            return 30;
        }
        if (i11 == 22) {
            return 31;
        }
        if (i11 == 30) {
            return 34;
        }
        switch (i11) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i11) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    @UnstableApi
    @Deprecated
    public static int getAudioContentTypeForStreamType(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 5 || i11 == 8) {
                return 4;
            }
            if (i11 != 10) {
                return 2;
            }
        }
        return 1;
    }

    @UnstableApi
    public static AudioFormat getAudioFormat(int i11, int i12, int i13) {
        return new AudioFormat.Builder().setSampleRate(i11).setChannelMask(i12).setEncoding(i13).build();
    }

    @SuppressLint({"InlinedApi"})
    @UnstableApi
    public static int getAudioTrackChannelConfig(int i11) {
        if (i11 == 10) {
            return SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i11 == 12) {
            return 743676;
        }
        if (i11 == 24) {
            return SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i11) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return R.styleable.Theme_drawable_share;
            case 6:
                return R.styleable.Theme_drawable_wiki_sound1;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    @UnstableApi
    public static int getAudioUsageForStreamType(int i11) {
        if (i11 == 0) {
            return 2;
        }
        if (i11 == 1) {
            return 13;
        }
        if (i11 == 2) {
            return 6;
        }
        int i12 = 4;
        if (i11 != 4) {
            i12 = 5;
            if (i11 != 5) {
                if (i11 != 8) {
                    return i11 != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i12;
    }

    @UnstableApi
    public static String getAuxiliaryTrackTypeString(int i11) {
        if (i11 == 0) {
            return "undefined";
        }
        if (i11 == 1) {
            return "original";
        }
        if (i11 == 2) {
            return "depth-linear";
        }
        if (i11 == 3) {
            return "depth-inverse";
        }
        if (i11 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    @UnstableApi
    public static Player.Commands getAvailableCommands(Player player, Player.Commands commands) {
        boolean isPlayingAd = player.isPlayingAd();
        boolean isCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean hasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean hasNextMediaItem = player.hasNextMediaItem();
        boolean isCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean isCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean isEmpty = player.getCurrentTimeline().isEmpty();
        boolean z11 = false;
        Player.Commands.Builder addIf = new Player.Commands.Builder().addAll(commands).addIf(4, !isPlayingAd).addIf(5, isCurrentMediaItemSeekable && !isPlayingAd).addIf(6, hasPreviousMediaItem && !isPlayingAd).addIf(7, !isEmpty && (hasPreviousMediaItem || !isCurrentMediaItemLive || isCurrentMediaItemSeekable) && !isPlayingAd).addIf(8, hasNextMediaItem && !isPlayingAd).addIf(9, !isEmpty && (hasNextMediaItem || (isCurrentMediaItemLive && isCurrentMediaItemDynamic)) && !isPlayingAd).addIf(10, !isPlayingAd).addIf(11, isCurrentMediaItemSeekable && !isPlayingAd);
        if (isCurrentMediaItemSeekable && !isPlayingAd) {
            z11 = true;
        }
        return addIf.addIf(12, z11).build();
    }

    @UnstableApi
    public static int getBigEndianInt(ByteBuffer byteBuffer, int i11) {
        int i12 = byteBuffer.getInt(i11);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i12 : Integer.reverseBytes(i12);
    }

    @UnstableApi
    public static int getByteDepth(int i11) {
        if (i11 != 2) {
            if (i11 == 3) {
                return 1;
            }
            if (i11 != 4) {
                if (i11 != 21) {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    @UnstableApi
    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) ((Character.digit(str.charAt(i12), 16) << 4) + Character.digit(str.charAt(i12 + 1), 16));
        }
        return bArr;
    }

    @UnstableApi
    public static int getCodecCountOfType(@Nullable String str, int i11) {
        int i12 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i11 == MimeTypes.getTrackTypeOfCodec(str2)) {
                i12++;
            }
        }
        return i12;
    }

    @Nullable
    @UnstableApi
    public static String getCodecsOfType(@Nullable String str, int i11) {
        String[] splitCodecs = splitCodecs(str);
        if (splitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : splitCodecs) {
            if (i11 == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @Nullable
    @UnstableApi
    public static String getCodecsWithoutType(@Nullable String str, int i11) {
        String[] splitCodecs = splitCodecs(str);
        if (splitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : splitCodecs) {
            if (i11 != MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @UnstableApi
    public static String getCountryCode(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return ho.c.j(networkCountryIso);
            }
        }
        return ho.c.j(Locale.getDefault().getCountry());
    }

    @UnstableApi
    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    @UnstableApi
    public static Looper getCurrentOrMainLooper() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    @UnstableApi
    public static Uri getDataUriForString(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    @UnstableApi
    public static Locale getDefaultDisplayLocale() {
        return SDK_INT >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    @RequiresApi(23)
    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    @UnstableApi
    public static Drawable getDrawable(Context context, Resources resources, @DrawableRes int i11) {
        return resources.getDrawable(i11, context.getTheme());
    }

    @Nullable
    public static UUID getDrmUuid(String str) {
        String g11 = ho.c.g(str);
        g11.getClass();
        switch (g11) {
            case "playready":
                return C.PLAYREADY_UUID;
            case "widevine":
                return C.WIDEVINE_UUID;
            case "clearkey":
                return C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    @UnstableApi
    public static int getErrorCodeForMediaDrmErrorCode(int i11) {
        if (i11 == 2 || i11 == 4) {
            return 6005;
        }
        if (i11 == 10) {
            return 6004;
        }
        if (i11 == 7) {
            return 6005;
        }
        if (i11 == 8) {
            return 6003;
        }
        switch (i11) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i11) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    @UnstableApi
    public static int getErrorCodeFromPlatformDiagnosticsInfo(@Nullable String str) {
        String[] split;
        int length;
        int i11 = 0;
        if (str == null || (length = (split = split(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z11 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            i11 = Integer.parseInt((String) Assertions.checkNotNull(str2));
            if (z11) {
                return -i11;
            }
        } catch (NumberFormatException unused) {
        }
        return i11;
    }

    @UnstableApi
    public static String getFormatSupportString(int i11) {
        if (i11 == 0) {
            return "NO";
        }
        if (i11 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i11 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i11 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i11 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    @UnstableApi
    public static int getIntegerCodeForString(String str) {
        int length = str.length();
        Assertions.checkArgument(length <= 4);
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 = (i11 << 8) | str.charAt(i12);
        }
        return i11;
    }

    @UnstableApi
    public static String getLocaleLanguageTag(Locale locale) {
        return locale.toLanguageTag();
    }

    @UnstableApi
    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context) {
        return isFrameDropAllowedOnSurfaceInput(context) ? 1 : 5;
    }

    @UnstableApi
    public static long getMediaDurationForPlayoutDuration(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 * f11);
    }

    @UnstableApi
    public static long getNowUnixTimeMs(long j11) {
        return j11 == C.TIME_UNSET ? System.currentTimeMillis() : android.os.SystemClock.elapsedRealtime() + j11;
    }

    @UnstableApi
    public static int getPcmEncoding(int i11) {
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return 2;
        }
        if (i11 != 24) {
            return i11 != 32 ? 0 : 22;
        }
        return 21;
    }

    @UnstableApi
    public static Format getPcmFormat(int i11, int i12, int i13) {
        return new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(i12).setSampleRate(i13).setPcmEncoding(i11).build();
    }

    @UnstableApi
    public static int getPcmFrameSize(int i11, int i12) {
        return getByteDepth(i11) * i12;
    }

    @UnstableApi
    public static long getPlayoutDurationForMediaDuration(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 / f11);
    }

    @UnstableApi
    public static List<String> getRoleFlagStrings(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i11 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i11 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i11 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i11 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i11 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i11 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i11 & 256) != 0) {
            arrayList.add(HwPayConstant.KEY_SIGN);
        }
        if ((i11 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i11 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i11 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i11 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i11 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i11 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i11 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    @UnstableApi
    public static List<String> getSelectionFlagStrings(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i11 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    @UnstableApi
    @Deprecated
    public static int getStreamTypeForAudioUsage(int i11) {
        switch (i11) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    @UnstableApi
    public static String getStringForTime(StringBuilder sb2, Formatter formatter, long j11) {
        if (j11 == C.TIME_UNSET) {
            j11 = 0;
        }
        String str = j11 < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
        long abs = (Math.abs(j11) + 500) / 1000;
        long j12 = abs % 60;
        long j13 = (abs / 60) % 60;
        long j14 = abs / 3600;
        sb2.setLength(0);
        return j14 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12)).toString();
    }

    @UnstableApi
    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i11 = 0; i11 < systemLocales.length; i11++) {
            systemLocales[i11] = normalizeLanguageCode(systemLocales[i11]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return SDK_INT >= 24 ? getSystemLocalesV24(configuration) : new String[]{getLocaleLanguageTag(configuration.locale)};
    }

    @RequiresApi(24)
    private static String[] getSystemLocalesV24(Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), ",");
    }

    @Nullable
    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ct.d.f46852f, String.class).invoke(cls, str);
        } catch (Exception e11) {
            Log.e(TAG, "Failed to read system property " + str, e11);
            return null;
        }
    }

    @UnstableApi
    public static String getTrackTypeString(int i11) {
        switch (i11) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i11 < 10000) {
                    return "?";
                }
                return "custom (" + i11 + pn.j.f81007d;
        }
    }

    @UnstableApi
    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + MediaLibraryInfo.VERSION_SLASHY;
    }

    @UnstableApi
    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    @UnstableApi
    public static byte[] gzip(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (IOException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public static boolean handlePauseButtonAction(@Nullable Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean handlePlayButtonAction(@androidx.annotation.Nullable androidx.media3.common.Player r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.getPlaybackState()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.isCommandAvailable(r3)
            if (r3 == 0) goto L17
            r4.prepare()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.isCommandAvailable(r3)
            if (r1 == 0) goto L24
            r4.seekToDefaultPosition()
            goto L15
        L24:
            boolean r1 = r4.isCommandAvailable(r2)
            if (r1 == 0) goto L2e
            r4.play()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.handlePlayButtonAction(androidx.media3.common.Player):boolean");
    }

    public static boolean handlePlayPauseButtonAction(@Nullable Player player) {
        return handlePlayPauseButtonAction(player, true);
    }

    @UnstableApi
    @Deprecated
    public static int inferContentType(Uri uri, @Nullable String str) {
        return TextUtils.isEmpty(str) ? inferContentType(uri) : inferContentTypeForExtension(str);
    }

    public static int inferContentTypeForExtension(String str) {
        String g11 = ho.c.g(str);
        g11.getClass();
        switch (g11) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, @Nullable String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    @UnstableApi
    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, @Nullable Inflater inflater) {
        if (parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int i11 = 0;
        while (true) {
            try {
                i11 += inflater.inflate(parsableByteArray2.getData(), i11, parsableByteArray2.capacity() - i11);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i11 == parsableByteArray2.capacity()) {
                        parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
                    }
                } else {
                    parsableByteArray2.setLimit(i11);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    @UnstableApi
    public static String intToStringMaxRadix(int i11) {
        return Integer.toString(i11, 36);
    }

    private static boolean isAppSpecificStorageFileUri(Activity activity, Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            String canonicalPath = new File(path).getCanonicalPath();
            String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            String str = null;
            File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                str = externalFilesDir.getCanonicalPath();
            }
            if (canonicalPath.startsWith(canonicalPath2)) {
                return true;
            }
            if (str != null) {
                if (canonicalPath.startsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    @UnstableApi
    public static boolean isAutomotive(Context context) {
        return SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    @UnstableApi
    public static boolean isBitmapFactorySupportedMimeType(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
                return SDK_INT >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    @UnstableApi
    public static boolean isEncodingHighResolutionPcm(int i11) {
        return i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4;
    }

    @UnstableApi
    public static boolean isEncodingLinearPcm(int i11) {
        return i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4;
    }

    @UnstableApi
    public static boolean isFrameDropAllowedOnSurfaceInput(Context context) {
        int i11 = SDK_INT;
        if (i11 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i11 == 30) {
            String str = Build.MODEL;
            if (ho.c.a(str, "moto g(20)") || ho.c.a(str, "rmx3231")) {
                return true;
            }
        }
        return i11 == 34 && ho.c.a(Build.MODEL, "sm-x200");
    }

    @UnstableApi
    public static boolean isLinebreak(int i11) {
        return i11 == 10 || i11 == 13;
    }

    @UnstableApi
    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    private static boolean isMediaStoreExternalContentUri(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !l1.a.f62928f.equals(uri.getAuthority())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        return "external".equals(str) || "external_primary".equals(str);
    }

    @ChecksSdkIntAtLeast(api = 23)
    private static boolean isReadStoragePermissionRequestNeeded(Activity activity, Uri uri) {
        if (SDK_INT < 23) {
            return false;
        }
        return isLocalFileUri(uri) ? !isAppSpecificStorageFileUri(activity, uri) : isMediaStoreExternalContentUri(uri);
    }

    @UnstableApi
    public static boolean isRunningOnEmulator() {
        String g11 = ho.c.g(Build.DEVICE);
        return g11.contains("emulator") || g11.contains("emu64a") || g11.contains("emu64x") || g11.contains("generic");
    }

    @RequiresApi(api = 24)
    private static boolean isTrafficRestricted(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) Assertions.checkNotNull(uri.getHost()));
    }

    @UnstableApi
    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    @UnstableApi
    public static boolean isWear(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    @UnstableApi
    public static int linearSearch(int[] iArr, int i11) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @UnstableApi
    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return fromUtf8Bytes(po.g.u(inputStream));
        } finally {
            closeQuietly(inputStream);
        }
    }

    @UnstableApi
    public static long maxValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long j11 = Long.MIN_VALUE;
        for (int i11 = 0; i11 < sparseLongArray.size(); i11++) {
            j11 = Math.max(j11, sparseLongArray.valueAt(i11));
        }
        return j11;
    }

    @UnstableApi
    public static boolean maybeInflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, @Nullable Inflater inflater) {
        return parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 120 && inflate(parsableByteArray, parsableByteArray2, inflater);
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
        int i11 = 0;
        while (true) {
            String[] strArr = isoLegacyTagReplacements;
            if (i11 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i11])) {
                return strArr[i11 + 1] + str.substring(strArr[i11].length());
            }
            i11 += 2;
        }
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (maybeRequestReadStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean maybeRequestReadStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (maybeRequestReadStoragePermission(activity, localConfiguration.uri)) {
                    return true;
                }
                ImmutableList<MediaItem.SubtitleConfiguration> immutableList = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i11 = 0; i11 < immutableList.size(); i11++) {
                    if (maybeRequestReadStoragePermission(activity, immutableList.get(i11).uri)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @UnstableApi
    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < sparseLongArray.size(); i11++) {
            j11 = Math.min(j11, sparseLongArray.valueAt(i11));
        }
        return j11;
    }

    @UnstableApi
    public static <T> void moveItems(List<T> list, int i11, int i12, int i13) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i14 = (i12 - i11) - 1; i14 >= 0; i14--) {
            arrayDeque.addFirst(list.remove(i11 + i14));
        }
        list.addAll(Math.min(i13, list.size()), arrayDeque);
    }

    @UnstableApi
    public static long msToUs(long j11) {
        return (j11 == C.TIME_UNSET || j11 == Long.MIN_VALUE) ? j11 : j11 * 1000;
    }

    @UnstableApi
    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.u
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.e(str, runnable);
            }
        });
    }

    @UnstableApi
    public static ScheduledExecutorService newSingleThreadScheduledExecutor(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.d(str, runnable);
            }
        });
    }

    @UnstableApi
    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String g11 = ho.c.g(str);
        String str2 = splitAtFirst(g11, Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            g11 = str3 + g11.substring(str2.length());
            str2 = str3;
        }
        return (ma.b.I0.equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? maybeReplaceLegacyLanguageTags(g11) : g11;
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t11) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t11;
        return (T[]) castNonNullTypeArray(copyOf);
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i11) {
        Assertions.checkArgument(i11 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i11);
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i11, int i12) {
        Assertions.checkArgument(i11 >= 0);
        Assertions.checkArgument(i12 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i11, i12);
    }

    @UnstableApi
    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        Assertions.checkState(list.size() == tArr.length);
        list.toArray(tArr);
    }

    @UnstableApi
    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i11 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i11 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(matcher.group(11))) {
                i11 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i11 != 0 ? timeInMillis - (i11 * 60000) : timeInMillis;
    }

    @UnstableApi
    public static long parseXsDuration(String str) {
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    @UnstableApi
    public static boolean postOrRun(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    @UnstableApi
    public static <T> p1<T> postOrRunWithCompletion(Handler handler, final Runnable runnable, final T t11) {
        final h2 F = h2.F();
        postOrRun(handler, new Runnable() { // from class: androidx.media3.common.util.v
            @Override // java.lang.Runnable
            public final void run() {
                Util.a(h2.this, runnable, t11);
            }
        });
        return F;
    }

    @UnstableApi
    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @UnstableApi
    public static void recursiveDelete(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    @Nullable
    @UnstableApi
    public static Intent registerReceiverNotExported(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (SDK_INT < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, 4);
        return registerReceiver;
    }

    @UnstableApi
    public static <T> void removeRange(List<T> list, int i11, int i12) {
        if (i11 < 0 || i12 > list.size() || i11 > i12) {
            throw new IllegalArgumentException();
        }
        if (i11 != i12) {
            list.subList(i11, i12).clear();
        }
    }

    @RequiresApi(api = 23)
    private static boolean requestExternalStoragePermission(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    @RequiresApi(api = 33)
    private static boolean requestReadMediaPermissions(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    @UnstableApi
    public static long sampleCountToDurationUs(long j11, int i11) {
        return scaleLargeValue(j11, 1000000L, i11, RoundingMode.DOWN);
    }

    @UnstableApi
    public static long scaleLargeTimestamp(long j11, long j12, long j13) {
        return scaleLargeValue(j11, j12, j13, RoundingMode.DOWN);
    }

    @UnstableApi
    public static long[] scaleLargeTimestamps(List<Long> list, long j11, long j12) {
        return scaleLargeValues(list, j11, j12, RoundingMode.DOWN);
    }

    @UnstableApi
    public static void scaleLargeTimestampsInPlace(long[] jArr, long j11, long j12) {
        scaleLargeValuesInPlace(jArr, j11, j12, RoundingMode.DOWN);
    }

    @UnstableApi
    public static long scaleLargeValue(long j11, long j12, long j13, RoundingMode roundingMode) {
        if (j11 == 0 || j12 == 0) {
            return 0L;
        }
        return (j13 < j12 || j13 % j12 != 0) ? (j13 >= j12 || j12 % j13 != 0) ? (j13 < j11 || j13 % j11 != 0) ? (j13 >= j11 || j11 % j13 != 0) ? scaleLargeValueFallback(j11, j12, j13, roundingMode) : com.google.common.math.h.y(j12, com.google.common.math.h.g(j11, j13, RoundingMode.UNNECESSARY)) : com.google.common.math.h.g(j12, com.google.common.math.h.g(j13, j11, RoundingMode.UNNECESSARY), roundingMode) : com.google.common.math.h.y(j11, com.google.common.math.h.g(j12, j13, RoundingMode.UNNECESSARY)) : com.google.common.math.h.g(j11, com.google.common.math.h.g(j13, j12, RoundingMode.UNNECESSARY), roundingMode);
    }

    private static long scaleLargeValueFallback(long j11, long j12, long j13, RoundingMode roundingMode) {
        long y11 = com.google.common.math.h.y(j11, j12);
        if (y11 != Long.MAX_VALUE && y11 != Long.MIN_VALUE) {
            return com.google.common.math.h.g(y11, j13, roundingMode);
        }
        long k11 = com.google.common.math.h.k(Math.abs(j12), Math.abs(j13));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long g11 = com.google.common.math.h.g(j12, k11, roundingMode2);
        long g12 = com.google.common.math.h.g(j13, k11, roundingMode2);
        long k12 = com.google.common.math.h.k(Math.abs(j11), Math.abs(g12));
        long g13 = com.google.common.math.h.g(j11, k12, roundingMode2);
        long g14 = com.google.common.math.h.g(g12, k12, roundingMode2);
        long y12 = com.google.common.math.h.y(g13, g11);
        if (y12 != Long.MAX_VALUE && y12 != Long.MIN_VALUE) {
            return com.google.common.math.h.g(y12, g14, roundingMode);
        }
        double d11 = g13 * (g11 / g14);
        if (d11 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d11 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return com.google.common.math.c.q(d11, roundingMode);
    }

    @UnstableApi
    public static long[] scaleLargeValues(List<Long> list, long j11, long j12, RoundingMode roundingMode) {
        long j13 = j11;
        long j14 = j12;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j13 != 0) {
            int i11 = 0;
            if (j14 >= j13 && j14 % j13 == 0) {
                long g11 = com.google.common.math.h.g(j14, j13, RoundingMode.UNNECESSARY);
                while (i11 < size) {
                    jArr[i11] = com.google.common.math.h.g(list.get(i11).longValue(), g11, roundingMode2);
                    i11++;
                }
            } else if (j14 >= j13 || j13 % j14 != 0) {
                int i12 = 0;
                while (i12 < size) {
                    long longValue = list.get(i12).longValue();
                    if (longValue != 0) {
                        if (j14 >= longValue && j14 % longValue == 0) {
                            jArr[i12] = com.google.common.math.h.g(j13, com.google.common.math.h.g(j14, longValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j14 >= longValue || longValue % j14 != 0) {
                            jArr[i12] = scaleLargeValueFallback(longValue, j13, j14, roundingMode2);
                        } else {
                            jArr[i12] = com.google.common.math.h.y(j13, com.google.common.math.h.g(longValue, j14, RoundingMode.UNNECESSARY));
                        }
                    }
                    i12++;
                    j13 = j11;
                    j14 = j12;
                    roundingMode2 = roundingMode;
                }
            } else {
                long g12 = com.google.common.math.h.g(j13, j14, RoundingMode.UNNECESSARY);
                while (i11 < size) {
                    jArr[i11] = com.google.common.math.h.y(list.get(i11).longValue(), g12);
                    i11++;
                }
            }
        }
        return jArr;
    }

    @UnstableApi
    public static void scaleLargeValuesInPlace(long[] jArr, long j11, long j12, RoundingMode roundingMode) {
        if (j11 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i11 = 0;
        if (j12 >= j11 && j12 % j11 == 0) {
            long g11 = com.google.common.math.h.g(j12, j11, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = com.google.common.math.h.g(jArr[i11], g11, roundingMode);
                i11++;
            }
            return;
        }
        if (j12 < j11 && j11 % j12 == 0) {
            long g12 = com.google.common.math.h.g(j11, j12, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = com.google.common.math.h.y(jArr[i11], g12);
                i11++;
            }
            return;
        }
        for (int i12 = 0; i12 < jArr.length; i12++) {
            long j13 = jArr[i12];
            if (j13 != 0) {
                if (j12 >= j13 && j12 % j13 == 0) {
                    jArr[i12] = com.google.common.math.h.g(j11, com.google.common.math.h.g(j12, j13, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j12 >= j13 || j13 % j12 != 0) {
                    jArr[i12] = scaleLargeValueFallback(j13, j11, j12, roundingMode);
                } else {
                    jArr[i12] = com.google.common.math.h.y(j11, com.google.common.math.h.g(j13, j12, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    @UnstableApi
    public static void setForegroundServiceNotification(Service service, int i11, Notification notification, int i12, String str) {
        if (SDK_INT >= 29) {
            Api29.startForeground(service, i11, notification, i12, str);
        } else {
            service.startForeground(i11, notification);
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    @UnstableApi
    public static boolean shouldEnablePlayPauseButton(@Nullable Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        return (player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) ? false : true;
    }

    private static boolean shouldEscapeCharacter(char c11) {
        return c11 == '\"' || c11 == '%' || c11 == '*' || c11 == '/' || c11 == ':' || c11 == '<' || c11 == '\\' || c11 == '|' || c11 == '>' || c11 == '?';
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(@Nullable Player player) {
        return shouldShowPlayButton(player, true);
    }

    @UnstableApi
    public static void sneakyThrow(Throwable th2) {
        sneakyThrowInternal(th2);
    }

    @UnstableApi
    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    @UnstableApi
    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    @UnstableApi
    public static String[] splitCodecs(@Nullable String str) {
        return TextUtils.isEmpty(str) ? new String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    @Nullable
    @UnstableApi
    public static ComponentName startForegroundService(Context context, Intent intent) {
        ComponentName startForegroundService;
        if (SDK_INT < 26) {
            return context.startService(intent);
        }
        startForegroundService = context.startForegroundService(intent);
        return startForegroundService;
    }

    @UnstableApi
    public static long subtractWithOverflowDefault(long j11, long j12, long j13) {
        long j14 = j11 - j12;
        return ((j11 ^ j14) & (j12 ^ j11)) < 0 ? j13 : j14;
    }

    @UnstableApi
    public static long sum(long... jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        return j11;
    }

    @UnstableApi
    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    @UnstableApi
    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        return po.g.u(inputStream);
    }

    @UnstableApi
    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            sb2.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i11] & 15, 16));
        }
        return sb2.toString();
    }

    @UnstableApi
    public static long toLong(int i11, int i12) {
        return toUnsignedLong(i12) | (toUnsignedLong(i11) << 32);
    }

    @UnstableApi
    public static long toUnsignedLong(int i11) {
        return i11 & 4294967295L;
    }

    @UnstableApi
    public static <T, U> p1<T> transformFutureAsync(final p1<U> p1Var, final com.google.common.util.concurrent.x<U, T> xVar) {
        final h2 F = h2.F();
        F.addListener(new Runnable() { // from class: androidx.media3.common.util.s
            @Override // java.lang.Runnable
            public final void run() {
                Util.b(h2.this, p1Var);
            }
        }, w1.c());
        p1Var.addListener(new Runnable() { // from class: androidx.media3.common.util.t
            @Override // java.lang.Runnable
            public final void run() {
                Util.c(p1.this, F, xVar);
            }
        }, w1.c());
        return F;
    }

    @Nullable
    @UnstableApi
    public static String unescapeFileName(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.charAt(i13) == '%') {
                i12++;
            }
        }
        if (i12 == 0) {
            return str;
        }
        int i14 = length - (i12 * 2);
        StringBuilder sb2 = new StringBuilder(i14);
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i12 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 16);
            sb2.append((CharSequence) str, i11, matcher.start());
            sb2.append(parseInt);
            i11 = matcher.end();
            i12--;
        }
        if (i11 < length) {
            sb2.append((CharSequence) str, i11, length);
        }
        if (sb2.length() != i14) {
            return null;
        }
        return sb2.toString();
    }

    @UnstableApi
    public static long usToMs(long j11) {
        return (j11 == C.TIME_UNSET || j11 == Long.MIN_VALUE) ? j11 : j11 / 1000;
    }

    @UnstableApi
    public static void writeBoolean(Parcel parcel, boolean z11) {
        parcel.writeInt(z11 ? 1 : 0);
    }

    @UnstableApi
    public static long ceilDivide(long j11, long j12) {
        return ((j11 + j12) - 1) / j12;
    }

    @UnstableApi
    public static long constrainValue(long j11, long j12, long j13) {
        return Math.max(j12, Math.min(j11, j13));
    }

    @UnstableApi
    public static Handler createHandlerForCurrentLooper(@Nullable Handler.Callback callback) {
        return createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), callback);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentOrMainLooper(@Nullable Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    @UnstableApi
    public static String fromUtf8Bytes(byte[] bArr, int i11, int i12) {
        return new String(bArr, i11, i12, StandardCharsets.UTF_8);
    }

    @UnstableApi
    public static boolean handlePlayPauseButtonAction(@Nullable Player player, boolean z11) {
        return shouldShowPlayButton(player, z11) ? handlePlayButtonAction(player) : handlePauseButtonAction(player);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    @UnstableApi
    public static boolean shouldShowPlayButton(@Nullable Player player, boolean z11) {
        return player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4 || (z11 && player.getPlaybackSuppressionReason() != 0);
    }

    @UnstableApi
    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i11 = 0;
        for (int i12 : iArr) {
            bArr[i11] = (byte) (i12 >> 24);
            bArr[i11 + 1] = (byte) (i12 >> 16);
            int i13 = i11 + 3;
            bArr[i11 + 2] = (byte) (i12 >> 8);
            i11 += 4;
            bArr[i13] = (byte) i12;
        }
        return bArr;
    }

    @UnstableApi
    public static float constrainValue(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f11, f13));
    }

    @UnstableApi
    public static <T> boolean contains(SparseArray<T> sparseArray, int i11) {
        return sparseArray.indexOfKey(i11) >= 0;
    }

    @UnstableApi
    public static int linearSearch(long[] jArr, long j11) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            if (jArr[i11] == j11) {
                return i11;
            }
        }
        return -1;
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        return maybeRequestReadStoragePermission(activity, mediaItemArr);
    }

    @UnstableApi
    public static int binarySearchCeil(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            i12 = ~binarySearch;
        } else {
            while (true) {
                i11 = binarySearch + 1;
                if (i11 >= jArr.length || jArr[i11] != j11) {
                    break;
                }
                binarySearch = i11;
            }
            i12 = z11 ? binarySearch : i11;
        }
        return z12 ? Math.min(jArr.length - 1, i12) : i12;
    }

    @UnstableApi
    public static int binarySearchFloor(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            i12 = -(binarySearch + 2);
        } else {
            while (true) {
                i11 = binarySearch - 1;
                if (i11 < 0 || jArr[i11] != j11) {
                    break;
                }
                binarySearch = i11;
            }
            i12 = z11 ? binarySearch : i11;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    public static int inferContentType(Uri uri) {
        int inferContentTypeForExtension;
        String scheme = uri.getScheme();
        if (scheme != null && (ho.c.a("rtsp", scheme) || ho.c.a("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (inferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return inferContentTypeForExtension;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher((CharSequence) Assertions.checkNotNull(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains(ISM_DASH_FORMAT_EXTENSION)) {
                return 0;
            }
            if (group.contains(ISM_HLS_FORMAT_EXTENSION)) {
                return 2;
            }
        }
        return 1;
    }

    @UnstableApi
    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int binarySearch = Collections.binarySearch(list, t11);
        if (binarySearch < 0) {
            i12 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i11 = binarySearch + 1;
                if (i11 >= size || list.get(i11).compareTo(t11) != 0) {
                    break;
                }
                binarySearch = i11;
            }
            i12 = z11 ? binarySearch : i11;
        }
        return z12 ? Math.min(list.size() - 1, i12) : i12;
    }

    @UnstableApi
    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int binarySearch = Collections.binarySearch(list, t11);
        if (binarySearch < 0) {
            i12 = -(binarySearch + 2);
        } else {
            while (true) {
                i11 = binarySearch - 1;
                if (i11 < 0 || list.get(i11).compareTo(t11) != 0) {
                    break;
                }
                binarySearch = i11;
            }
            i12 = z11 ? binarySearch : i11;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    @UnstableApi
    public static Format getPcmFormat(AudioProcessor.AudioFormat audioFormat) {
        return getPcmFormat(audioFormat.encoding, audioFormat.channelCount, audioFormat.sampleRate);
    }

    @UnstableApi
    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        String systemProperty;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (SDK_INT < 28) {
                systemProperty = getSystemProperty("sys.display-size");
            } else {
                systemProperty = getSystemProperty("vendor.display-size");
            }
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] split = split(systemProperty.trim(), "x");
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e(TAG, "Invalid display size: " + systemProperty);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (SDK_INT >= 23) {
            getDisplaySizeV23(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    private static boolean maybeRequestReadStoragePermission(Activity activity, Uri uri) {
        if (!isReadStoragePermissionRequestNeeded(activity, uri)) {
            return false;
        }
        if (SDK_INT < 33) {
            return requestExternalStoragePermission(activity);
        }
        return requestReadMediaPermissions(activity);
    }

    @UnstableApi
    public static byte[] toByteArray(float f11) {
        return ro.i.F(Float.floatToIntBits(f11));
    }

    @UnstableApi
    public static int binarySearchFloor(LongArray longArray, long j11, boolean z11, boolean z12) {
        int i11;
        int size = longArray.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            if (longArray.get(i13) < j11) {
                i12 = i13 + 1;
            } else {
                size = i13 - 1;
            }
        }
        if (z11 && (i11 = size + 1) < longArray.size() && longArray.get(i11) == j11) {
            return i11;
        }
        if (z12 && size == -1) {
            return 0;
        }
        return size;
    }

    @UnstableApi
    @Deprecated
    public static int inferContentType(String str) {
        return inferContentType(Uri.parse("file:///" + str));
    }

    @EnsuresNonNull({"#1"})
    @UnstableApi
    public static <T> T castNonNull(@Nullable T t11) {
        return t11;
    }

    @EnsuresNonNull({"#1"})
    @UnstableApi
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th2) throws Throwable {
        throw th2;
    }
}
