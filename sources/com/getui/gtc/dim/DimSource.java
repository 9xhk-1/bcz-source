package com.getui.gtc.dim;

import android.util.Base64;
import com.getui.gtc.dim.e.b;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class DimSource {
    private static final HashMap<Caller, DimSource> SOURCE_MAP = new HashMap<>(4);

    public static synchronized DimSource of(Caller caller) {
        synchronized (DimSource.class) {
            String str = null;
            if (caller != null) {
                if (caller != Caller.UNKNOWN) {
                    HashMap<Caller, DimSource> hashMap = SOURCE_MAP;
                    if (hashMap.containsKey(caller)) {
                        return hashMap.get(caller);
                    }
                    if (caller == Caller.PUSH) {
                        str = "Y29tLmlnZXhpbi5wdXNo";
                    } else if (caller == Caller.IDO) {
                        str = "Y29tLmdldHVpLmdz";
                    } else if (caller == Caller.GY) {
                        str = "Y29tLmcuZ3lzZGs=";
                    } else if (caller == Caller.WUS) {
                        str = "Y29tLnNkay5wbHVz";
                    } else if (caller == Caller.ONEID) {
                        str = "Y29tLmdldHVpLm9uZWlk";
                    }
                    DimSource of2 = of(str);
                    hashMap.put(caller, of2);
                    return of2;
                }
            }
            return null;
        }
    }

    public abstract <P, V> V get(P p11, DimCallback<P, V> dimCallback);

    private static DimSource of(String str) {
        try {
            return (DimSource) Class.forName(new String(Base64.decode(str, 0)) + ".SdkSource").getDeclaredField("INSTANCE").get(null);
        } catch (Throwable th2) {
            b.b(th2);
            return null;
        }
    }
}
