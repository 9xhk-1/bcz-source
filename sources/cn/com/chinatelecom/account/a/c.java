package cn.com.chinatelecom.account.a;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.Helper;
import cn.com.chinatelecom.account.api.d.g;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;
import r60.f;

/* loaded from: classes3.dex */
public class c extends cn.com.chinatelecom.account.api.c.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8828b = "c";

    private static int b(Context context) {
        try {
            return cn.com.chinatelecom.account.api.d.c.b(context, "key_c_l_l_v", 0);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized Queue<String> c(Context context, List<String> list, int i11) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (c.class) {
            try {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                String a11 = b.a(context);
                if (!TextUtils.isEmpty(a11)) {
                    try {
                        JSONArray jSONArray = new JSONArray(new String(Helper.dneulret(cn.com.chinatelecom.account.api.a.c.a(a11))));
                        int length = jSONArray.length();
                        for (int i12 = 0; i12 < length && i12 <= 10; i12++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            if (jSONObject != null) {
                                concurrentLinkedQueue.add(jSONObject.toString());
                            }
                        }
                        b.a(context, "");
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (i11 == -1) {
                    for (String str : list) {
                        try {
                            if (new JSONObject(str).getInt("rt") != 0) {
                                concurrentLinkedQueue.add(str);
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                } else if (i11 == 0) {
                    concurrentLinkedQueue.addAll(list);
                }
                while (concurrentLinkedQueue.size() > 10) {
                    concurrentLinkedQueue.poll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return concurrentLinkedQueue;
    }

    private static String b(Context context, String str) {
        return a.a(context, g.c(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        b.a(context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Context context, Queue<String> queue) {
        JSONArray jSONArray = new JSONArray();
        String jSONArray2 = jSONArray.toString();
        if (!queue.isEmpty()) {
            Iterator<String> it = queue.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(new JSONObject(it.next()));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        if (jSONArray.length() <= 0) {
            return "";
        }
        String jSONArray3 = jSONArray.toString();
        if (!TextUtils.isEmpty(jSONArray3)) {
            try {
                jSONArray2 = URLEncoder.encode(Helper.guulam(context, jSONArray3), "UTF-8");
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return b(context, jSONArray2);
    }

    private static void a(Context context, int i11) {
        try {
            cn.com.chinatelecom.account.api.d.c.a(context, "key_c_l_l_v", i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private static void b(final Context context, final List<String> list, final int i11) {
        cn.com.chinatelecom.account.api.c.a.a(new Runnable() { // from class: cn.com.chinatelecom.account.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Queue c11 = c.c(context, list, i11);
                    if (c11.isEmpty()) {
                        return;
                    }
                    String b11 = c.b(context, (Queue<String>) c11);
                    JSONObject jSONObject = null;
                    int i12 = -1;
                    try {
                        if (!TextUtils.isEmpty(b11)) {
                            JSONObject jSONObject2 = new JSONObject(b11);
                            try {
                                i12 = jSONObject2.getInt("code");
                                jSONObject = jSONObject2;
                            } catch (Exception e11) {
                                e = e11;
                                jSONObject = jSONObject2;
                                e.printStackTrace();
                                if (jSONObject != null) {
                                }
                                c.b(context, (Queue<String>) c11, i11);
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    if (jSONObject != null || i12 != 0) {
                        c.b(context, (Queue<String>) c11, i11);
                    } else {
                        c.c(context);
                        c11.clear();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(Context context, String str) {
        char c11;
        str.getClass();
        int i11 = 0;
        switch (str.hashCode()) {
            case 64897:
                if (str.equals(f.f83306f)) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 78159:
                if (str.equals("OFF")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 66247144:
                if (str.equals("ERROR")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 1:
                i11 = -2;
                break;
            case 2:
                i11 = -1;
                break;
        }
        a(context, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, Queue<String> queue, int i11) {
        String str;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (queue != null && !queue.isEmpty()) {
            Iterator<String> it = queue.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                try {
                    jSONObject = new JSONObject(it.next());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (i11 != -1 || jSONObject.getInt("rt") != 0) {
                    jSONArray.put(jSONObject);
                    i12++;
                    if (i12 > 10) {
                        break;
                    }
                }
            }
        }
        if (jSONArray.length() > 0) {
            try {
                str = Helper.eneulret(jSONArray.toString());
            } catch (Exception e12) {
                e12.printStackTrace();
                str = null;
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b.a(context, str);
    }

    public static void a(Context context, List<String> list) {
        int b11 = b(context);
        if (b11 == -2) {
            return;
        }
        b(context, list, b11);
    }
}
