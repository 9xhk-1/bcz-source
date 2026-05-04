package com.heytap.openid.sdk;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.heytap.openid.sdk.m_b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class m_d {
    public static boolean m_a = false;
    public static boolean m_b = false;
    public static boolean m_c = false;
    public static Context m_d;

    public static HashMap<String, String> m_a(int i11) {
        String str;
        String str2;
        String str3;
        int m_a2 = m_a.m_a(i11);
        if (m_a2 != 10000) {
            throw new RuntimeException(m_a2 + "");
        }
        ArrayList arrayList = new ArrayList();
        if ((i11 & 8) == 8) {
            arrayList.add("OUID");
            arrayList.add("OUID_STATUS");
        }
        if ((i11 & 32) == 32 && !arrayList.contains("OUID_STATUS")) {
            arrayList.add("OUID_STATUS");
        }
        if ((i11 & 2) == 2) {
            arrayList.add("AUID");
        }
        if ((i11 & 16) == 16) {
            arrayList.add("GUID");
        }
        if ((i11 & 1) == 1) {
            arrayList.add("APID");
        }
        if ((i11 & 4) == 4) {
            arrayList.add("DUID");
        }
        if (!m_a()) {
            HashMap<String, String> hashMap = new HashMap<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                hashMap.put(str4, str4 == "OUID_STATUS" ? "FALSE" : "");
            }
            return hashMap;
        }
        m_b m_bVar = m_b.C0441m_b.m_a;
        Context context = m_d;
        HashMap<String, String> m_a3 = m_bVar.m_a(context, arrayList);
        if (arrayList.isEmpty()) {
            str = "2040";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (m_bVar.m_a.isEmpty()) {
                m_a.m_a(context, m_bVar.m_a);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str5 = (String) it2.next();
                if (m_bVar.m_a.containsKey(str5)) {
                    m_f m_fVar = m_bVar.m_a.get(str5);
                    if (!m_fVar.m_a(str5)) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(str5);
                        m_h.m_a("1025");
                        m_a.m_a.execute(new com.heytap.openid.base.m_a(m_bVar, context, arrayList3));
                    }
                    str3 = m_fVar.m_a;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    arrayList2.add(str5);
                }
            }
            if (!arrayList2.isEmpty()) {
                m_h.m_a("1026");
                m_bVar.m_a(context, (List<String>) arrayList2, false);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str6 = (String) it3.next();
                m_f m_fVar2 = m_bVar.m_a.get(str6);
                if (m_fVar2 == null) {
                    str2 = str6 == "OUID_STATUS" ? "FALSE" : "";
                } else {
                    if (str6.equals("OUID") || str6.equals("OUID_STATUS")) {
                        m_bVar.m_a.remove(str6);
                    }
                    str2 = m_fVar2.m_a;
                }
                m_a3.put(str6, str2);
            }
            str = "2025";
        }
        m_h.m_a(str);
        return m_a3;
    }

    public static boolean m_a() {
        String str;
        if (!m_a) {
            str = "1001";
        } else if (!m_b && !m_c) {
            str = "1002";
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return true;
            }
            str = "1003";
        }
        Log.e("IDHelper", str);
        return false;
    }
}
