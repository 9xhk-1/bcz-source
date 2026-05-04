package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class cy {

    public static class a extends cx {
        public a() {
            super(1);
        }

        @Override // com.xiaomi.push.cx
        public String a(Context context, String str, List<bh> list) {
            URL url;
            if (list == null) {
                url = new URL(str);
            } else {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (bh bhVar : list) {
                    buildUpon.appendQueryParameter(bhVar.a(), bhVar.b());
                }
                url = new URL(buildUpon.toString());
            }
            return bi.a(context, url);
        }
    }

    public static int a(int i11, int i12) {
        return (((i12 + 243) / 1448) * 132) + pd.a.f80340j + i11 + i12;
    }

    public static int a(int i11, int i12, int i13) {
        return (((i12 + 200) / 1448) * 132) + 1011 + i12 + i11 + i13;
    }

    private static int a(cx cxVar, String str, List<bh> list, String str2) {
        if (cxVar.a() == 1) {
            return a(str.length(), a(str2));
        }
        if (cxVar.a() != 2) {
            return -1;
        }
        return a(str.length(), a(list), a(str2));
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    public static int a(List<bh> list) {
        int i11 = 0;
        for (bh bhVar : list) {
            if (!TextUtils.isEmpty(bhVar.a())) {
                i11 += bhVar.a().length();
            }
            if (!TextUtils.isEmpty(bhVar.b())) {
                i11 += bhVar.b().length();
            }
        }
        return i11 * 2;
    }

    public static String a(Context context, String str, List<bh> list) {
        return a(context, str, list, new a(), true);
    }

    public static String a(Context context, String str, List<bh> list, cx cxVar, boolean z11) {
        String str2;
        cq cqVar;
        IOException iOException;
        String str3;
        String str4;
        if (!bi.b(context)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (z11) {
                cqVar = cu.a().m5805a(str);
                if (cqVar != null) {
                    arrayList = cqVar.a(str);
                }
            } else {
                cqVar = null;
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            Iterator<String> it = arrayList.iterator();
            String str5 = null;
            while (it.hasNext()) {
                String next = it.next();
                ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                } catch (IOException e11) {
                    str2 = null;
                    iOException = e11;
                    str3 = str5;
                }
                if (!cxVar.m5815a(context, next, (List<bh>) arrayList2)) {
                    return str5;
                }
                String a11 = cxVar.a(context, next, (List<bh>) arrayList2);
                try {
                } catch (IOException e12) {
                    e = e12;
                    str3 = a11;
                    str2 = null;
                }
                if (!TextUtils.isEmpty(a11)) {
                    if (cqVar != null) {
                        try {
                            str2 = null;
                            str4 = next;
                            cqVar = cqVar;
                            cqVar.a(str4, System.currentTimeMillis() - currentTimeMillis, a(cxVar, next, arrayList2, a11));
                        } catch (IOException e13) {
                            e = e13;
                            str2 = null;
                        }
                    }
                    return a11;
                }
                str4 = next;
                str2 = null;
                if (cqVar != null) {
                    try {
                        str3 = a11;
                        try {
                            cqVar.a(str4, System.currentTimeMillis() - currentTimeMillis, a(cxVar, str4, arrayList2, a11), null);
                        } catch (IOException e14) {
                            e = e14;
                            next = str4;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        next = str4;
                    }
                } else {
                    str3 = a11;
                }
                str5 = str3;
                e = e15;
                next = str4;
                str3 = a11;
                iOException = e;
                if (cqVar != null) {
                    try {
                        cqVar.a(next, System.currentTimeMillis() - currentTimeMillis, a(cxVar, next, arrayList2, str3), iOException);
                    } catch (MalformedURLException e16) {
                        e = e16;
                        e.printStackTrace();
                        return str2;
                    }
                }
                iOException.printStackTrace();
                str5 = str3;
            }
            return str5;
        } catch (MalformedURLException e17) {
            e = e17;
            str2 = null;
        }
    }
}
