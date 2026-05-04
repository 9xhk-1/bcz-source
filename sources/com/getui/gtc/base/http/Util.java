package com.getui.gtc.base.http;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class Util {
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static int checkDuration(String str, long j11, TimeUnit timeUnit) {
        if (j11 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j11);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(str + " too large.");
        }
        if (millis != 0 || j11 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str + " too small.");
    }

    public static void checkHeaderItem(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str));
            }
        }
        if (str2 == null) {
            throw new NullPointerException("value for name " + str + " == null");
        }
        int length2 = str2.length();
        for (int i12 = 0; i12 < length2; i12++) {
            char charAt2 = str2.charAt(i12);
            if ((charAt2 <= 31 && charAt2 != '\t') || charAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i12), str, str2));
            }
        }
    }

    public static void checkOffsetAndCount(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Throwable unused) {
            }
        }
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        return map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }
}
