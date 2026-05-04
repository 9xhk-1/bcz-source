package com.getui.gtc.h;

import com.getui.gtc.base.http.MediaType;
import com.getui.gtc.base.http.Request;
import com.getui.gtc.base.http.RequestBody;
import com.getui.gtc.base.http.Response;
import com.getui.gtc.base.http.crypt.GtRASCryptoInterceptor;
import com.getui.gtc.base.util.io.IOUtils;
import com.getui.gtc.server.ServerManager;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a {
    public static void a(String str, int i11) throws Exception {
        while (true) {
            String server = ServerManager.getServer("gtc.bs");
            try {
                Request build = new Request.Builder().url(String.format("%s/api.php?format=json&t=1", server)).method("POST").body(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), b(str, i11))).cryptInterceptor(new GtRASCryptoInterceptor(com.getui.gtc.c.b.f29832i, com.getui.gtc.c.b.f29831h)).tag("type" + i11 + " task ").build();
                com.getui.gtc.i.c.a.a("type " + i11 + " data: " + str);
                Response execute = d.f30097a.newCall(build).execute();
                ServerManager.confirmServer("gtc.bs", server);
                execute.close();
                return;
            } catch (Exception e11) {
                com.getui.gtc.i.c.a.b("type " + i11 + " error : " + e11.getMessage());
                if (!(e11 instanceof IOException) || !ServerManager.switchServer("gtc.bs", server)) {
                    throw e11;
                }
                com.getui.gtc.i.c.a.b("type " + i11 + " failed with server: " + server + ", try again with: " + ServerManager.getServer("gtc.bs"));
            }
        }
    }

    private static String b(String str, int i11) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", "upload_BI");
        jSONObject.put("BIType", String.valueOf(i11));
        jSONObject.put("cid", com.getui.gtc.c.b.f29827d);
        jSONObject.put("BIData", new String(IOUtils.encode(str.getBytes(), 0), "UTF-8"));
        return jSONObject.toString();
    }
}
