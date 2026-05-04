package com.android.volley.toolbox;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.alipay.sdk.m.u.i;
import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyLog;
import com.huawei.hms.framework.common.ContainerUtils;
import fx.d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class HttpHeaderParser {
    private static final String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String RFC1123_OUTPUT_FORMAT = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";
    private static final String RFC1123_PARSE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss zzz";

    public static List<Header> combineHeaders(List<Header> list, Cache.Entry entry) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<Header> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().getName());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<Header> list2 = entry.allResponseHeaders;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (Header header : entry.allResponseHeaders) {
                    if (!treeSet.contains(header.getName())) {
                        arrayList.add(header);
                    }
                }
            }
        } else if (!entry.responseHeaders.isEmpty()) {
            for (Map.Entry<String, String> entry2 : entry.responseHeaders.entrySet()) {
                if (!treeSet.contains(entry2.getKey())) {
                    arrayList.add(new Header(entry2.getKey(), entry2.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static String formatEpochAsRfc1123(long j11) {
        return newUsGmtFormatter(RFC1123_OUTPUT_FORMAT).format(new Date(j11));
    }

    public static Map<String, String> getCacheHeaders(Cache.Entry entry) {
        if (entry == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        String str = entry.etag;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j11 = entry.lastModified;
        if (j11 > 0) {
            hashMap.put("If-Modified-Since", formatEpochAsRfc1123(j11));
        }
        return hashMap;
    }

    private static SimpleDateFormat newUsGmtFormatter(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    @Nullable
    public static Cache.Entry parseCacheHeaders(NetworkResponse networkResponse) {
        long j11;
        boolean z11;
        long j12;
        long j13;
        long j14;
        long j15;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = networkResponse.headers;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long parseDateAsEpoch = str != null ? parseDateAsEpoch(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i11 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z11 = false;
            j12 = 0;
            j13 = 0;
            while (i11 < split.length) {
                String trim = split[i11].trim();
                if (trim.equals(d.f52399f) || trim.equals(d.f52400g)) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j13 = Long.parseLong(trim.substring(23));
                } else if (trim.equals(d.f52402i) || trim.equals(d.f52405l)) {
                    z11 = true;
                }
                i11++;
            }
            j11 = 0;
            i11 = 1;
        } else {
            j11 = 0;
            z11 = false;
            j12 = 0;
            j13 = 0;
        }
        String str3 = map.get("Expires");
        long parseDateAsEpoch2 = str3 != null ? parseDateAsEpoch(str3) : j11;
        String str4 = map.get("Last-Modified");
        long parseDateAsEpoch3 = str4 != null ? parseDateAsEpoch(str4) : j11;
        String str5 = map.get("ETag");
        if (i11 != 0) {
            long j16 = currentTimeMillis + (j12 * 1000);
            j15 = z11 ? j16 : (j13 * 1000) + j16;
            j14 = j16;
        } else {
            j14 = (parseDateAsEpoch <= j11 || parseDateAsEpoch2 < parseDateAsEpoch) ? j11 : currentTimeMillis + (parseDateAsEpoch2 - parseDateAsEpoch);
            j15 = j14;
        }
        Cache.Entry entry = new Cache.Entry();
        entry.data = networkResponse.data;
        entry.etag = str5;
        entry.softTtl = j14;
        entry.ttl = j15;
        entry.serverDate = parseDateAsEpoch;
        entry.lastModified = parseDateAsEpoch3;
        entry.responseHeaders = map;
        entry.allResponseHeaders = networkResponse.allHeaders;
        return entry;
    }

    public static String parseCharset(@Nullable Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] split = str2.split(i.f11097b, 0);
            for (int i11 = 1; i11 < split.length; i11++) {
                String[] split2 = split[i11].trim().split(ContainerUtils.KEY_VALUE_DELIMITER, 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long parseDateAsEpoch(String str) {
        try {
            return newUsGmtFormatter("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e11) {
            if ("0".equals(str) || "-1".equals(str)) {
                VolleyLog.v("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            VolleyLog.e(e11, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static List<Header> toAllHeaderList(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static Map<String, String> toHeaderMap(List<Header> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Header header : list) {
            treeMap.put(header.getName(), header.getValue());
        }
        return treeMap;
    }

    public static String parseCharset(@Nullable Map<String, String> map) {
        return parseCharset(map, "ISO-8859-1");
    }
}
