package com.alipay.sdk.m.c0;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public File f10507a;

    /* renamed from: b, reason: collision with root package name */
    public com.alipay.sdk.m.g0.a f10508b;

    public b(String str, com.alipay.sdk.m.g0.a aVar) {
        this.f10507a = null;
        this.f10508b = null;
        this.f10507a = new File(str);
        this.f10508b = aVar;
    }

    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        try {
            File file = this.f10507a;
            if (file == null) {
                return;
            }
            if (file.exists() && this.f10507a.isDirectory() && this.f10507a.list().length != 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f10507a.list()) {
                    arrayList.add(str);
                }
                Collections.sort(arrayList);
                String str2 = (String) arrayList.get(arrayList.size() - 1);
                int size = arrayList.size();
                if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                    if (arrayList.size() < 2) {
                        return;
                    }
                    str2 = (String) arrayList.get(arrayList.size() - 2);
                    size--;
                }
                if (!this.f10508b.logCollect(a(com.alipay.sdk.m.z.b.a(this.f10507a.getAbsolutePath(), str2)))) {
                    size--;
                }
                for (int i11 = 0; i11 < size; i11++) {
                    new File(this.f10507a, (String) arrayList.get(i11)).delete();
                }
            }
        } finally {
        }
    }

    public final void a() {
        new Thread(new c(this)).start();
    }
}
