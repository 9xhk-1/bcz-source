package com.android.volley;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class NetworkResponse {

    @Nullable
    public final List<Header> allHeaders;
    public final byte[] data;

    @Nullable
    public final Map<String, String> headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    @Deprecated
    public NetworkResponse(int i11, byte[] bArr, @Nullable Map<String, String> map, boolean z11, long j11) {
        this(i11, bArr, map, toAllHeaderList(map), z11, j11);
    }

    @Nullable
    private static List<Header> toAllHeaderList(@Nullable Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Nullable
    private static Map<String, String> toHeaderMap(@Nullable List<Header> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Header header : list) {
            treeMap.put(header.getName(), header.getValue());
        }
        return treeMap;
    }

    public NetworkResponse(int i11, byte[] bArr, boolean z11, long j11, @Nullable List<Header> list) {
        this(i11, bArr, toHeaderMap(list), list, z11, j11);
    }

    @Deprecated
    public NetworkResponse(int i11, byte[] bArr, @Nullable Map<String, String> map, boolean z11) {
        this(i11, bArr, map, z11, 0L);
    }

    public NetworkResponse(byte[] bArr) {
        this(200, bArr, false, 0L, (List<Header>) Collections.EMPTY_LIST);
    }

    @Deprecated
    public NetworkResponse(byte[] bArr, @Nullable Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private NetworkResponse(int i11, byte[] bArr, @Nullable Map<String, String> map, @Nullable List<Header> list, boolean z11, long j11) {
        this.statusCode = i11;
        this.data = bArr;
        this.headers = map;
        if (list == null) {
            this.allHeaders = null;
        } else {
            this.allHeaders = Collections.unmodifiableList(list);
        }
        this.notModified = z11;
        this.networkTimeMs = j11;
    }
}
