package com.mob.tools.utils;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;

@Deprecated
/* loaded from: classes7.dex */
public class Hashon implements PublicMemberKeeper {
    public String format(String str) {
        return HashonHelper.format(str);
    }

    public <T> String fromHashMap(HashMap<String, T> hashMap) {
        return HashonHelper.fromHashMap(hashMap);
    }

    public <T> HashMap<String, T> fromJson(String str) {
        return HashonHelper.fromJson(str);
    }

    public String fromObject(Object obj) {
        return HashonHelper.fromObject(obj);
    }

    public <T> T fromJson(String str, Class<T> cls) {
        return (T) HashonHelper.fromJson(str, cls);
    }
}
