package com.tencent.liteav.network;

import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
class c {

    /* renamed from: b, reason: collision with root package name */
    private final String f43734b = "https://tcdns.myqcloud.com/queryip";

    /* renamed from: c, reason: collision with root package name */
    private final String f43735c = "https://tcdnsipv6.myqcloud.com/queryip";

    /* renamed from: d, reason: collision with root package name */
    private final String f43736d = "forward_stream";

    /* renamed from: e, reason: collision with root package name */
    private final String f43737e = "forward_num";

    /* renamed from: f, reason: collision with root package name */
    private final String f43738f = "request_type";

    /* renamed from: g, reason: collision with root package name */
    private final String f43739g = "sdk_version";

    /* renamed from: h, reason: collision with root package name */
    private final String f43740h = HianalyticsBaseData.SDK_TYPE;

    /* renamed from: i, reason: collision with root package name */
    private final String f43741i = "use";

    /* renamed from: j, reason: collision with root package name */
    private final String f43742j = "51451748-d8f2-4629-9071-db2983aa7251";

    /* renamed from: k, reason: collision with root package name */
    private final int f43743k = 5;

    /* renamed from: l, reason: collision with root package name */
    private final int f43744l = 2;

    /* renamed from: a, reason: collision with root package name */
    public b f43733a = null;

    /* renamed from: m, reason: collision with root package name */
    private Thread f43745m = null;

    /* renamed from: n, reason: collision with root package name */
    private int f43746n = 5;

    private String b(String str, int i11, String str2) {
        InputStream c11;
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            c11 = c(str, i11, str2);
        } catch (IOException e11) {
            TXCLog.e("TXCIntelligentRoute", "get json string from url failed.", e11);
        }
        if (c11 == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c11));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            stringBuffer.append(readLine);
        }
        return stringBuffer.toString();
    }

    private InputStream c(String str, int i11, String str2) throws IOException {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str2).openConnection();
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("forward_stream", str);
            httpsURLConnection.setRequestProperty("forward_num", "2");
            httpsURLConnection.setRequestProperty("sdk_version", TXCCommonUtil.getSDKVersionStr());
            if (i11 == 1) {
                httpsURLConnection.setRequestProperty("request_type", "1");
            } else if (i11 == 2) {
                httpsURLConnection.setRequestProperty("request_type", "2");
            } else {
                httpsURLConnection.setRequestProperty("request_type", "3");
            }
            int i12 = this.f43746n;
            if (i12 > 0) {
                httpsURLConnection.setConnectTimeout(i12 * 1000);
                httpsURLConnection.setReadTimeout(this.f43746n * 1000);
            }
            httpsURLConnection.connect();
            if (httpsURLConnection.getResponseCode() == 200) {
                return httpsURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e11) {
            TXCLog.e("TXCIntelligentRoute", "https failed.", e11);
            return null;
        }
    }

    private boolean d(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public void a(final String str, final int i11) {
        Thread thread = new Thread("TXCPushRoute") { // from class: com.tencent.liteav.network.c.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (c.this.f43733a == null) {
                    return;
                }
                int i12 = 7;
                while (i12 > 0) {
                    if (c.this.a(str, i11, i12 > 2 ? "https://tcdns.myqcloud.com/queryip" : "https://tcdnsipv6.myqcloud.com/queryip")) {
                        return;
                    }
                    if (i12 == 1) {
                        TXCLog.w("TXCIntelligentRoute", "fetchByUrl failed, bad response, no retryCount left, push directly to domain name");
                        c.this.f43733a.onFetchDone(-1, null);
                        return;
                    }
                    try {
                        Thread.sleep(1000L, 0);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("fetchByUrl failed, bad response, bad response, retryCount left:");
                        sb2.append(i12 - 1);
                        TXCLog.w("TXCIntelligentRoute", sb2.toString());
                    } catch (InterruptedException unused) {
                    }
                    i12--;
                }
            }
        };
        this.f43745m = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, int i11, String str2) {
        ArrayList<a> arrayList;
        try {
            String b11 = b(str, i11, str2);
            JSONObject jSONObject = new JSONObject(b11);
            boolean has = jSONObject.has("use");
            if (!has) {
                arrayList = a(b11);
            } else {
                int i12 = jSONObject.getInt("use");
                if (i12 == -1) {
                    TXCLog.w("TXCIntelligentRoute", "server error, use = -1, but current SDK isn't international, push directly to domain name");
                } else if (i12 != 0) {
                    TXCLog.w("TXCIntelligentRoute", "unknown value for key:'use', push directly to domain name. use = " + i12);
                }
                arrayList = null;
            }
            if (!has) {
                if (arrayList == null || arrayList.size() <= 0) {
                    return false;
                }
                this.f43733a.onFetchDone(0, arrayList);
                return true;
            }
            this.f43733a.onFetchDone(0, null);
            return true;
        } catch (Exception e11) {
            TXCLog.e("TXCIntelligentRoute", "get value from json failed.", e11);
            return false;
        }
    }

    private boolean b(String str) {
        return str.split(":").length > 1;
    }

    private ArrayList<a> a(String str) {
        JSONArray jSONArray;
        ArrayList<a> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("state") != 0 || (jSONArray = jSONObject.getJSONObject("content").getJSONArray("list")) == null) {
                return null;
            }
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                a a11 = a((JSONObject) jSONArray.opt(i11));
                if (a11 != null && a11.f43710c) {
                    arrayList.add(a11);
                }
            }
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                a a12 = a((JSONObject) jSONArray.opt(i12));
                if (a12 != null && !a12.f43710c) {
                    arrayList.add(a12);
                }
            }
            if (com.tencent.liteav.basic.d.c.a().a("Network", "EnableRouteOptimize") == 1 && n.a().c()) {
                ArrayList<a> a13 = a(arrayList, true);
                a(a13);
                return a13;
            }
            long a14 = com.tencent.liteav.basic.d.c.a().a("Network", "RouteSamplingMaxCount");
            if (a14 >= 1) {
                long a15 = n.a().a("51451748-d8f2-4629-9071-db2983aa7251");
                if (a15 <= a14) {
                    arrayList = a(arrayList, false);
                    n.a().a("51451748-d8f2-4629-9071-db2983aa7251", a15 + 1);
                }
            }
            a(arrayList);
            return arrayList;
        } catch (JSONException e11) {
            TXCLog.e("TXCIntelligentRoute", "get records from json string failed.", e11);
            return arrayList;
        }
    }

    private boolean c(String str) {
        if (!b(str) && str != null) {
            for (String str2 : str.split("[.]")) {
                if (!d(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private a a(JSONObject jSONObject) {
        a aVar = new a();
        try {
            aVar.f43708a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            aVar.f43709b = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            aVar.f43712e = 0;
            aVar.f43710c = false;
            aVar.f43711d = c(aVar.f43708a);
            if (!jSONObject.has("type") || jSONObject.getInt("type") != 2) {
                return aVar;
            }
            aVar.f43710c = true;
            return aVar;
        } catch (JSONException e11) {
            TXCLog.e("TXCIntelligentRoute", "get ip record from json object failed.", e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList<a> a(ArrayList<a> arrayList, boolean z11) {
        a aVar;
        a aVar2;
        a aVar3 = null;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<a> it = arrayList.iterator();
        loop0: while (true) {
            aVar = aVar3;
            while (it.hasNext()) {
                aVar3 = it.next();
                if (aVar3.f43710c) {
                    arrayList2.add(aVar3);
                } else {
                    if (aVar3.f43711d) {
                        break;
                    }
                    arrayList3.add(aVar3);
                }
            }
        }
        ArrayList<a> arrayList4 = new ArrayList<>();
        while (true) {
            if (arrayList2.size() <= 0 && arrayList3.size() <= 0) {
                break;
            }
            if (z11) {
                if (aVar != null) {
                    arrayList4.add(aVar);
                }
                if (arrayList2.size() > 0) {
                    arrayList4.add(arrayList2.get(0));
                    arrayList2.remove(0);
                }
            } else {
                if (arrayList2.size() > 0) {
                    arrayList4.add(arrayList2.get(0));
                    arrayList2.remove(0);
                }
                if (aVar != null) {
                    arrayList4.add(aVar);
                }
            }
            if (arrayList3.size() > 0) {
                arrayList4.add(arrayList3.get(0));
                arrayList3.remove(0);
            }
        }
        int size = arrayList4.size();
        if (size > 0 && (aVar2 = (a) arrayList4.get(size - 1)) != null && !c(aVar2.f43708a) && aVar != null) {
            arrayList4.add(aVar);
        }
        return arrayList4;
    }

    private void a(ArrayList<a> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<a> it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            a next = it.next();
            str = str + " \n Nearest IP: " + next.f43708a + " Port: " + next.f43709b + " Q Channel: " + next.f43710c;
        }
        TXCLog.e("TXCIntelligentRoute", str);
    }
}
