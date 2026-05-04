package com.tencent.open.b;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g {
    public static void a(String str) {
    }

    public static List<Serializable> b(String str) {
        return Collections.synchronizedList(new ArrayList());
    }

    public static void a(String str, List<Serializable> list) {
    }

    public static void a() {
        Context a11 = com.tencent.open.utils.g.a();
        if (a11 == null) {
            return;
        }
        a11.deleteDatabase("sdk_report.db");
    }
}
