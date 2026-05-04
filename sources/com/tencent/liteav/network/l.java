package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f43804a = 5;

    /* renamed from: b, reason: collision with root package name */
    private final int f43805b = 2;

    /* renamed from: c, reason: collision with root package name */
    private String f43806c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f43807d = "";

    /* renamed from: e, reason: collision with root package name */
    private int f43808e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f43809f = "";

    /* renamed from: g, reason: collision with root package name */
    private Handler f43810g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(int i11, String str, Vector<e> vector);
    }

    public l(Context context) {
        if (context != null) {
            this.f43810g = new Handler(context.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long e() {
        return com.tencent.liteav.basic.d.c.a().a("Network", "AccRetryCountWithoutSecret");
    }

    public String d() {
        return this.f43809f;
    }

    public int c() {
        return this.f43808e;
    }

    public String b() {
        return this.f43807d;
    }

    public String a() {
        return this.f43806c;
    }

    public int a(String str, int i11, final a aVar) {
        this.f43806c = "";
        this.f43807d = "";
        this.f43808e = 0;
        this.f43809f = "";
        if (str == null || str.isEmpty()) {
            TXCLog.i("TXRTMPAccUrlFetcher", "getAccerateStreamPlayUrl input playUrl is empty");
            return -1;
        }
        final String streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(str);
        if (streamIDByStreamUrl == null || streamIDByStreamUrl.isEmpty()) {
            TXCLog.i("TXRTMPAccUrlFetcher", "getAccerateStreamPlayUrl streamID is empty");
            return -2;
        }
        final String a11 = a("bizid", str);
        final String a12 = a("txSecret", str);
        final String a13 = a("txTime", str);
        if (!a(true, a11, a13, a12)) {
            return -3;
        }
        a(streamIDByStreamUrl, a11, a12, a13, i11, new a() { // from class: com.tencent.liteav.network.l.1
            @Override // com.tencent.liteav.network.l.a
            public void a(int i12, String str2, Vector<e> vector) {
                l.this.f43806c = streamIDByStreamUrl;
                l.this.f43807d = a11;
                l.this.f43808e = i12;
                l.this.f43809f = str2;
                if (vector == null || vector.isEmpty()) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(i12, str2, null);
                        return;
                    }
                    return;
                }
                Vector<e> vector2 = new Vector<>();
                Iterator<e> it = vector.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    String str3 = next.f43771a;
                    if (str3.indexOf("?") != -1) {
                        str3 = str3.substring(0, str3.indexOf("?"));
                    }
                    vector2.add(new e(str3 + "?txSecret=" + a12 + "&txTime=" + a13 + "&bizid=" + a11, next.f43772b));
                }
                if (aVar != null) {
                    Iterator<e> it2 = vector2.iterator();
                    while (it2.hasNext()) {
                        e next2 = it2.next();
                        TXCLog.e("TXRTMPAccUrlFetcher", "accurl = " + next2.f43771a + " quic = " + next2.f43772b);
                    }
                    aVar.a(i12, str2, vector2);
                }
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z11, String str, String str2, String str3) {
        return z11 ? (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty()) ? false : true : (str == null || str2 == null || str3 == null) ? false : true;
    }

    private void a(final String str, final String str2, final String str3, final String str4, final int i11, final a aVar) {
        new Thread("getRTMPAccUrl") { // from class: com.tencent.liteav.network.l.2
            /* JADX WARN: Can't wrap try/catch for region: R(16:13|14|(1:16)(1:123)|17|(2:18|(1:20)(1:21))|22|(1:24)|(3:26|(1:28)|29)|30|(7:32|(3:79|80|(7:82|(4:85|(10:87|88|89|90|(1:92)(1:111)|93|94|95|96|(1:(2:101|102)(2:104|105)))(2:115|116)|103|83)|117|118|36|37|(3:69|70|(3:72|74|75))(7:39|(3:60|61|(3:63|64|65))(5:41|(2:44|42)|45|46|(3:56|57|58))|48|49|50|52|53)))|34|35|36|37|(0)(0))(1:122)|76|48|49|50|52|53) */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0292, code lost:
            
                com.tencent.liteav.basic.log.TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception sleep");
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x022b  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r11v14 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v20 */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 686
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.network.l.AnonymousClass2.run():void");
            }
        }.start();
    }

    private String a(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (String str3 : str2.split("[?&]")) {
            if (str3.indexOf(ContainerUtils.KEY_VALUE_DELIMITER) != -1) {
                String[] split = str3.split("[=]");
                if (split.length == 2) {
                    String str4 = split[0];
                    String str5 = split[1];
                    if (str4 != null && str4.toLowerCase().equalsIgnoreCase(lowerCase)) {
                        return str5;
                    }
                } else {
                    continue;
                }
            }
        }
        return "";
    }
}
