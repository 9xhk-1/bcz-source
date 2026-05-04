package com.baicizhan.client.business.util;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Profiler {
    private final boolean NEED_LOG = false;
    Map<String, Long> mStartTimeMap = new HashMap();

    public long closeFunc(String name) {
        return 0L;
    }

    public void closeAndPrintFunc(String tag, String name) {
    }

    public void openFunc(String tag, String name) {
    }
}
