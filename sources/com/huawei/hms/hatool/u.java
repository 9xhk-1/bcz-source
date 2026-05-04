package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private List<b1> f35924a;

    /* renamed from: b, reason: collision with root package name */
    private String f35925b;

    /* renamed from: c, reason: collision with root package name */
    private String f35926c;

    /* renamed from: d, reason: collision with root package name */
    private String f35927d;

    public u(List<b1> list, String str, String str2, String str3) {
        this.f35924a = list;
        this.f35925b = str;
        this.f35926c = str2;
        this.f35927d = str3;
    }

    public void a() {
        if (!"_default_config_tag".equals(this.f35926c)) {
            a(this.f35924a, this.f35926c, this.f35925b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (b1 b1Var : this.f35924a) {
            String c11 = b1Var.c();
            if (TextUtils.isEmpty(c11) || "oper".equals(c11)) {
                arrayList4.add(b1Var);
            } else if ("maint".equals(c11)) {
                arrayList.add(b1Var);
            } else if ("preins".equals(c11)) {
                arrayList2.add(b1Var);
            } else if ("diffprivacy".equals(c11)) {
                arrayList3.add(b1Var);
            }
        }
        a(arrayList4, "oper", "_default_config_tag");
        a(arrayList, "maint", "_default_config_tag");
        a(arrayList2, "preins", "_default_config_tag");
        a(arrayList3, "diffprivacy", "_default_config_tag");
    }

    private void a(List<b1> list, String str, String str2) {
        String str3;
        String str4;
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 * 500;
            List<b1> subList = list.subList(i12, Math.min(list.size(), i12 + 500));
            String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            long currentTimeMillis = System.currentTimeMillis();
            long b11 = a1.b(str2, str) * 86400000;
            ArrayList arrayList = new ArrayList();
            for (b1 b1Var : subList) {
                if (!c0.a(b1Var.b(), currentTimeMillis, b11)) {
                    arrayList.add(b1Var);
                }
            }
            if (arrayList.size() > 0) {
                str3 = str;
                str4 = str2;
                new l0(str4, str3, this.f35927d, arrayList, replace).a();
            } else {
                str3 = str;
                str4 = str2;
                v.e("hmsSdk", "No data to report handler");
            }
            i11++;
            str2 = str4;
            str = str3;
        }
    }
}
