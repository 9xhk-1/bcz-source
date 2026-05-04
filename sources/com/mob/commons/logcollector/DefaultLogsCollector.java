package com.mob.commons.logcollector;

import com.mob.tools.log.LogCollector;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;

@Deprecated
/* loaded from: classes7.dex */
public class DefaultLogsCollector implements LogCollector, PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static DefaultLogsCollector f40364a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, Integer> f40365b = new HashMap<>();

    private DefaultLogsCollector() {
    }

    public static synchronized DefaultLogsCollector get() {
        DefaultLogsCollector defaultLogsCollector;
        synchronized (DefaultLogsCollector.class) {
            try {
                if (f40364a == null) {
                    f40364a = new DefaultLogsCollector();
                }
                defaultLogsCollector = f40364a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return defaultLogsCollector;
    }

    public void addSDK(String str, int i11) {
        synchronized (this.f40365b) {
            this.f40365b.put(str, Integer.valueOf(i11));
        }
    }

    @Override // com.mob.tools.log.LogCollector
    public final void log(String str, int i11, int i12, String str2, String str3) {
        Integer num = this.f40365b.get(str);
        if (num == null) {
            num = -1;
        }
        NLog.getInstance(str, num.intValue(), str).log(i11, str3, new Object[0]);
    }
}
