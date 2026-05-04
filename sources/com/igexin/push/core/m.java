package com.igexin.push.core;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.igexin.assist.sdk.AssistPushManager;
import com.igexin.assist.util.AssistUtils;
import com.igexin.push.config.a.AnonymousClass3;
import com.igexin.push.config.a.AnonymousClass4;
import com.igexin.push.core.d;
import com.igexin.push.core.e.f.AnonymousClass20;
import com.igexin.push.core.e.f.AnonymousClass21;
import com.igexin.push.d.c.o;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.main.FeedbackImpl;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k3.u0;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38351a = "PushController";

    /* renamed from: b, reason: collision with root package name */
    private static m f38352b;

    private m() {
    }

    public static m a() {
        if (f38352b == null) {
            f38352b = new m();
        }
        return f38352b;
    }

    private static void b(int i11) {
        com.igexin.push.config.d.f37586f = i11;
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass4(), false, true);
    }

    private static void a(int i11) {
        com.igexin.push.config.d.f37585e = i11;
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass3(), false, true);
        if (e.f38044u) {
            System.currentTimeMillis();
            com.igexin.c.a.c.a.a("setHeartbeatInterval heartbeatReq", new Object[0]);
            if (System.currentTimeMillis() - e.Y > 5000) {
                e.Y = System.currentTimeMillis();
                com.igexin.push.core.a.b.d();
                com.igexin.push.core.a.b.f();
            }
        }
    }

    private static void b(String str) {
        if (TextUtils.isEmpty(e.A)) {
            return;
        }
        if (System.currentTimeMillis() - e.f38026c < com.igexin.push.config.d.f37568a * 1000 && e.f38027d != null) {
            com.igexin.c.a.c.a.a("PushController|query tag already cache, tag = " + e.f38027d, new Object[0]);
            l.a().a(str, "0", e.f38027d);
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", "query_tag");
                jSONObject.put("id", String.valueOf(currentTimeMillis));
                jSONObject.put("cid", e.A);
                jSONObject.put("appid", e.f37998a);
                jSONObject.put("sn", str);
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
            String jSONObject2 = jSONObject.toString();
            com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis, jSONObject2, (byte) 11, currentTimeMillis));
            o oVar = new o();
            oVar.f38418c = 128;
            oVar.f38420e = b.O;
            oVar.f38421f = jSONObject2;
            d.a.f37956a.f37949h.a("C-" + e.A, oVar, false);
            com.igexin.push.core.e.f a11 = com.igexin.push.core.e.f.a();
            if (e.f38026c != currentTimeMillis) {
                e.f38026c = currentTimeMillis;
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.new AnonymousClass21(), false, true);
            }
            com.igexin.c.a.c.a.a("PushController｜queryTag", new Object[0]);
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
        }
    }

    public static void a(int i11, int i12) {
        com.igexin.push.config.d.f37582b = i11;
        com.igexin.push.config.d.f37583c = i12;
        com.igexin.push.config.a.a().b();
        com.igexin.push.f.f.a().d();
        com.igexin.c.a.c.a.d.a().a("[PushController] setSilentTime success");
    }

    private static void b(String str, String str2) {
        if (TextUtils.isEmpty(e.A)) {
            com.igexin.c.a.c.a.d.a().a("bindAlias : " + str + ", failed, has not get clientid");
            l.a().b(str2, "30005");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - e.f37999aa <= 1000) {
            com.igexin.c.a.c.a.a("PushController|bindAlias frequently called", new Object[0]);
            return;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(currentTimeMillis));
        if (!format.equals(e.Z)) {
            com.igexin.push.core.e.f.a().d(format);
            com.igexin.push.core.e.f.a().a(0);
        }
        int i11 = e.f38000ab;
        com.igexin.c.a.c.a.a("-> CoreRuntimeInfo.opAliasTimes:" + e.f38000ab, new Object[0]);
        if (e.f38000ab < 100) {
            com.igexin.c.a.c.a.a("start bindAlias ###", new Object[0]);
            e.f37999aa = currentTimeMillis;
            com.igexin.push.core.e.f.a().a(e.f38000ab + 1);
            a(str, str2, false, true);
            return;
        }
        com.igexin.c.a.c.a.a("PushController|bindAlias times exceed", new Object[0]);
        com.igexin.c.a.c.a.d.a().a("bindAlias : " + str + ", failed, , the number of calls per day cannot exceed 100");
        l.a().b(str2, "30003");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    private static void a(Bundle bundle) {
        int i11;
        int i12;
        String string = bundle.getString("action");
        com.igexin.c.a.c.a.a("PushController|action pushmanager action = ".concat(String.valueOf(string)), new Object[0]);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        string.getClass();
        switch (string) {
            case "queryPushOnLine":
                l.a().b();
                break;
            case "setVivoBadgeNum":
                com.igexin.push.g.d.b(bundle.getInt("badgeNum"), true);
                break;
            case "setNotificationIcon":
                e.aK = bundle.getString("smallIcon", "");
                e.aL = bundle.getString("largeIcon", "");
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.core.e.f.a().new AnonymousClass20(e.aK, e.aL), false, true);
                com.igexin.c.a.c.a.d.a().a("[PushController] setNotificationIcon success");
                break;
            case "queryTag":
                String string2 = bundle.getString("sn");
                if (!TextUtils.isEmpty(e.A)) {
                    if (System.currentTimeMillis() - e.f38026c < com.igexin.push.config.d.f37568a * 1000 && e.f38027d != null) {
                        com.igexin.c.a.c.a.a("PushController|query tag already cache, tag = " + e.f38027d, new Object[0]);
                        l.a().a(string2, "0", e.f38027d);
                        break;
                    } else {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("action", "query_tag");
                                jSONObject.put("id", String.valueOf(currentTimeMillis));
                                jSONObject.put("cid", e.A);
                                jSONObject.put("appid", e.f37998a);
                                jSONObject.put("sn", string2);
                            } catch (Exception e11) {
                                com.igexin.c.a.c.a.a(e11);
                            }
                            String jSONObject2 = jSONObject.toString();
                            com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis, jSONObject2, (byte) 11, currentTimeMillis));
                            o oVar = new o();
                            oVar.f38418c = 128;
                            oVar.f38420e = b.O;
                            oVar.f38421f = jSONObject2;
                            d.a.f37956a.f37949h.a("C-" + e.A, oVar, false);
                            com.igexin.push.core.e.f a11 = com.igexin.push.core.e.f.a();
                            if (e.f38026c != currentTimeMillis) {
                                e.f38026c = currentTimeMillis;
                                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.new AnonymousClass21(), false, true);
                            }
                            com.igexin.c.a.c.a.a("PushController｜queryTag", new Object[0]);
                            break;
                        } catch (Exception e12) {
                            com.igexin.c.a.c.a.a(e12);
                            return;
                        }
                    }
                }
                break;
            case "setOppoBadgeNum":
                com.igexin.push.g.d.c(bundle.getInt("badgeNum"), true);
                break;
            case "bindAlias":
                String string3 = bundle.getString(PushConstants.SUB_ALIAS_STATUS_NAME);
                String string4 = bundle.getString("sn");
                com.igexin.c.a.c.a.a("PushController|onPushManagerMessage bindAlias...", new Object[0]);
                if (!TextUtils.isEmpty(e.A)) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - e.f37999aa <= 1000) {
                        com.igexin.c.a.c.a.a("PushController|bindAlias frequently called", new Object[0]);
                        break;
                    } else {
                        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(currentTimeMillis2));
                        if (format.equals(e.Z)) {
                            i11 = 0;
                        } else {
                            com.igexin.push.core.e.f.a().d(format);
                            i11 = 0;
                            com.igexin.push.core.e.f.a().a(0);
                        }
                        int i13 = e.f38000ab;
                        com.igexin.c.a.c.a.a("-> CoreRuntimeInfo.opAliasTimes:" + e.f38000ab, new Object[i11]);
                        if (e.f38000ab >= 100) {
                            com.igexin.c.a.c.a.a("PushController|bindAlias times exceed", new Object[i11]);
                            com.igexin.c.a.c.a.d.a().a("bindAlias : " + string3 + ", failed, , the number of calls per day cannot exceed 100");
                            l.a().b(string4, "30003");
                            break;
                        } else {
                            com.igexin.c.a.c.a.a("start bindAlias ###", new Object[i11]);
                            e.f37999aa = currentTimeMillis2;
                            com.igexin.push.core.e.f.a().a(e.f38000ab + 1);
                            a(string3, string4, i11, true);
                            break;
                        }
                    }
                } else {
                    com.igexin.c.a.c.a.d.a().a("bindAlias : " + string3 + ", failed, has not get clientid");
                    l.a().b(string4, "30005");
                    break;
                }
            case "setHwBadgeNum":
                com.igexin.push.g.d.a(bundle.getInt("badgeNum"), true);
                break;
            case "setTag":
                if (com.igexin.push.config.d.f37591k) {
                    String string5 = bundle.getString("tags");
                    String string6 = bundle.getString("sn");
                    if (TextUtils.isEmpty(e.A)) {
                        com.igexin.c.a.c.a.d.a().a("setTag : " + string5 + ", failed, has not get clientid");
                        l.a().a(string6, "20008");
                        break;
                    } else {
                        try {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("action", "set_tag");
                                jSONObject3.put("id", String.valueOf(currentTimeMillis3));
                                jSONObject3.put("cid", e.A);
                                jSONObject3.put("appid", e.f37998a);
                                jSONObject3.put("tags", URLEncoder.encode(string5, "utf-8"));
                                jSONObject3.put("sn", string6);
                            } catch (Exception e13) {
                                com.igexin.c.a.c.a.a(e13);
                            }
                            e.f38028e = string5.replaceAll(",", " ");
                            String jSONObject4 = jSONObject3.toString();
                            com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis3, jSONObject4, (byte) 2, e.f38044u ? currentTimeMillis3 : 0L));
                            o oVar2 = new o();
                            oVar2.f38418c = 128;
                            oVar2.f38420e = b.O;
                            oVar2.f38421f = jSONObject4;
                            d.a.f37956a.f37949h.a("C-" + e.A, oVar2, false);
                            com.igexin.c.a.c.a.a("settag", new Object[0]);
                            break;
                        } catch (Exception e14) {
                            com.igexin.c.a.c.a.a(e14);
                            return;
                        }
                    }
                }
                break;
            case "unbindAlias":
                String string7 = bundle.getString(PushConstants.SUB_ALIAS_STATUS_NAME);
                String string8 = bundle.getString("sn");
                boolean z11 = bundle.getBoolean("isSeft");
                com.igexin.c.a.c.a.a("PushController|onPushManagerMessage unbindAlias...", new Object[0]);
                if (!TextUtils.isEmpty(e.A)) {
                    if (!z11 || !TextUtils.isEmpty(e.A)) {
                        long currentTimeMillis4 = System.currentTimeMillis();
                        if (currentTimeMillis4 - e.f37999aa <= 1000) {
                            com.igexin.c.a.c.a.a("PushController|unbindAlias frequently called", new Object[0]);
                            break;
                        } else {
                            String format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(currentTimeMillis4));
                            if (format2.equals(e.Z)) {
                                i12 = 0;
                            } else {
                                com.igexin.push.core.e.f.a().d(format2);
                                i12 = 0;
                                com.igexin.push.core.e.f.a().a(0);
                            }
                            if (e.f38000ab >= 100) {
                                com.igexin.c.a.c.a.a("PushController|unbindAlias times exceed", new Object[i12]);
                                com.igexin.c.a.c.a.d.a().a("unbindAlias : " + string7 + ", failed, , the number of calls per day cannot exceed 100");
                                l.a().c(string8, "30003");
                                break;
                            } else {
                                com.igexin.c.a.c.a.a("start unbindAlias ###", new Object[i12]);
                                e.f37999aa = currentTimeMillis4;
                                com.igexin.push.core.e.f.a().a(e.f38000ab + 1);
                                a(string7, string8, true, z11);
                                break;
                            }
                        }
                    }
                } else {
                    com.igexin.c.a.c.a.d.a().a("unbindAlias : " + string7 + ", failed, has not get clientid");
                    l.a().c(string8, "30005");
                    break;
                }
                break;
            case "turnOffPush":
                d dVar = d.a.f37956a;
                if (e.f38035l != null) {
                    com.igexin.push.core.d.d.a().a("p", Boolean.FALSE);
                    e.f38042s = false;
                    e.f38045v = false;
                    dVar.f37949h.b();
                }
                AssistPushManager.getInstance().turnOffPush(e.f38035l);
                break;
            case "registerPushActivity":
            case "registerUserService":
                e.a();
                break;
            case "sendApplinkFeedback":
                String string9 = bundle.getString("url");
                boolean z12 = com.igexin.push.config.d.E;
                if (!TextUtils.isEmpty(string9)) {
                    try {
                        Uri parse = Uri.parse(string9);
                        String host = parse.getHost();
                        String queryParameter = parse.getQueryParameter("p");
                        if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(queryParameter)) {
                            if (!com.igexin.push.config.d.E) {
                                com.igexin.c.a.c.a.a("PushController|isApplinkFeedback is false, not feedback", new Object[0]);
                                break;
                            } else if (!com.igexin.push.g.c.c(host)) {
                                com.igexin.c.a.c.a.a("PushController|checkIsWhiteApplinkDomain is false, not feedback", new Object[0]);
                                break;
                            } else {
                                com.igexin.c.a.c.a.a("PushController|isApplinkFeedback is true and checkIsWhiteApplinkDomain is true, to feedback", new Object[0]);
                                PushTaskBean pushTaskBean = new PushTaskBean();
                                pushTaskBean.setTaskId("getuiapplinkup");
                                pushTaskBean.setMessageId(queryParameter);
                                pushTaskBean.setAppid(e.f37998a);
                                FeedbackImpl.getInstance().feedbackMessageAction(pushTaskBean, PushConsts.SEND_MESSAGE_ERROR);
                                break;
                            }
                        }
                        com.igexin.c.a.c.a.a("PushController|url " + string9 + " is invalid", new Object[0]);
                    } catch (Exception e15) {
                        com.igexin.c.a.c.a.a(e15);
                        com.igexin.c.a.c.a.a("PushController|" + e15.toString(), new Object[0]);
                        return;
                    }
                }
                break;
            case "setBadgeNum":
                if (!com.igexin.push.g.n.d().equalsIgnoreCase("huawei") && !com.igexin.push.g.n.d().equalsIgnoreCase(AssistUtils.BRAND_HON)) {
                    if (!com.igexin.push.g.n.d().equalsIgnoreCase("oppo")) {
                        if (com.igexin.push.g.n.d().equalsIgnoreCase("vivo")) {
                            com.igexin.push.g.d.b(bundle.getInt("badgeNum"), true);
                            break;
                        }
                    } else {
                        com.igexin.push.g.d.c(bundle.getInt("badgeNum"), true);
                        break;
                    }
                } else {
                    com.igexin.push.g.d.a(bundle.getInt("badgeNum"), true);
                    break;
                }
                break;
            case "setLinkMerge":
                boolean z13 = bundle.getBoolean(u0.f65628b, true);
                com.igexin.push.config.e.a(z13, z13);
                e.a();
                com.igexin.c.a.c.a.d.a().a("[PushController] setLinkMerge success");
                break;
            case "setGuardOptions":
                com.igexin.push.config.e.a(bundle.getBoolean("guardMe", true), bundle.getBoolean("guardOthers", true));
                e.a();
                com.igexin.c.a.c.a.d.a().a("[PushController] setGuardOptions success");
                break;
            case "setDeviceToken":
                try {
                    String string10 = bundle.getString("token", "");
                    if (!TextUtils.isEmpty(string10) && e.b().booleanValue() && !string10.equals(e.I)) {
                        com.igexin.push.core.e.f.a().b(string10);
                        if (e.f38044u) {
                            com.igexin.c.a.c.a.b(f38351a, "online, send addphoneinfo");
                            com.igexin.push.core.a.b.d().i();
                        }
                    }
                    com.igexin.c.a.c.a.d.a().a("[PushController] setDeviceToken success ".concat(String.valueOf(string10)));
                    break;
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                    return;
                }
            case "setSilentTime":
                if (com.igexin.push.config.d.f37592l) {
                    int i14 = bundle.getInt("beginHour", 0);
                    int i15 = bundle.getInt("duration", 0);
                    e.f38035l.getPackageName();
                    a(i14, i15);
                    AssistPushManager.getInstance().setSilentTime(e.f38035l, i14, i15);
                    break;
                }
                break;
            case "setSocketTimeout":
                if (com.igexin.push.config.d.f37594n) {
                    int i16 = bundle.getInt("submitTimeoutEvent", 0);
                    e.f38035l.getPackageName();
                    com.igexin.push.config.d.f37586f = i16;
                    com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass4(), false, true);
                    break;
                }
                break;
            case "sendMessage":
                boolean z14 = com.igexin.push.config.d.f37590j;
                com.igexin.c.a.c.a.a("PushController onPushManagerMessage recevie action : sendMessage", new Object[0]);
                if (com.igexin.push.config.d.f37590j) {
                    String string11 = bundle.getString("taskid");
                    byte[] byteArray = bundle.getByteArray("extraData");
                    com.igexin.c.a.c.a.a("PushController receive broadcast msg data , task id : " + string11 + " ######@##@@@#", new Object[0]);
                    if (e.A != null) {
                        JSONObject jSONObject5 = new JSONObject();
                        long currentTimeMillis5 = System.currentTimeMillis();
                        try {
                            jSONObject5.put("action", "sendmessage");
                            jSONObject5.put("id", String.valueOf(currentTimeMillis5));
                            jSONObject5.put("cid", e.A);
                            jSONObject5.put("appid", e.f37998a);
                            jSONObject5.put("taskid", string11);
                            jSONObject5.put("extraData", Base64.encodeToString(byteArray, 0));
                            String jSONObject6 = jSONObject5.toString();
                            com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis5, jSONObject6, (byte) 6, currentTimeMillis5));
                            com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
                            bVar.f38418c = 128;
                            bVar.f38417b = (int) currentTimeMillis5;
                            String str = e.A;
                            bVar.f38420e = str;
                            bVar.f38421f = jSONObject6;
                            bVar.f38422g = byteArray;
                            bVar.f38423h = str;
                            d.a.f37956a.f37949h.a("C-" + e.A, bVar, false);
                            if (string11 != null && string11.startsWith("4T5@S_")) {
                                com.igexin.c.a.c.a.a("PushController sending lbs report message : ".concat(String.valueOf(jSONObject6)), new Object[0]);
                                break;
                            }
                        } catch (Throwable th3) {
                            com.igexin.c.a.c.a.a(th3);
                            return;
                        }
                    }
                }
                break;
            case "setHeartbeatInterval":
                if (com.igexin.push.config.d.f37593m) {
                    int i17 = bundle.getInt("interval", 0);
                    e.f38035l.getPackageName();
                    com.igexin.push.config.d.f37585e = i17;
                    com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass3(), false, true);
                    if (e.f38044u) {
                        System.currentTimeMillis();
                        com.igexin.c.a.c.a.a("setHeartbeatInterval heartbeatReq", new Object[0]);
                        if (System.currentTimeMillis() - e.Y > 5000) {
                            e.Y = System.currentTimeMillis();
                            com.igexin.push.core.a.b.d();
                            com.igexin.push.core.a.b.f();
                            break;
                        }
                    }
                }
                break;
            case "sendFeedbackMessage":
                boolean z15 = com.igexin.push.config.d.f37595o;
                int i18 = e.f38011am;
                if (com.igexin.push.config.d.f37595o && e.f38011am <= 200) {
                    String string12 = bundle.getString("taskid");
                    String string13 = bundle.getString("messageid");
                    String string14 = bundle.getString("actionid");
                    String str2 = string12 + ":" + string13 + ":" + string14;
                    if (e.f38010al.get(str2) == null) {
                        long currentTimeMillis6 = System.currentTimeMillis();
                        PushTaskBean pushTaskBean2 = new PushTaskBean();
                        pushTaskBean2.setTaskId(string12);
                        pushTaskBean2.setMessageId(string13);
                        pushTaskBean2.setAppid(e.f37998a);
                        FeedbackImpl.getInstance().feedbackMessageAction(pushTaskBean2, string14);
                        e.f38011am++;
                        e.f38010al.put(str2, Long.valueOf(currentTimeMillis6));
                        break;
                    }
                }
                break;
        }
    }

    private static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String queryParameter = parse.getQueryParameter("p");
            if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(queryParameter)) {
                if (!com.igexin.push.config.d.E) {
                    com.igexin.c.a.c.a.a("PushController|isApplinkFeedback is false, not feedback", new Object[0]);
                    return;
                }
                if (!com.igexin.push.g.c.c(host)) {
                    com.igexin.c.a.c.a.a("PushController|checkIsWhiteApplinkDomain is false, not feedback", new Object[0]);
                    return;
                }
                com.igexin.c.a.c.a.a("PushController|isApplinkFeedback is true and checkIsWhiteApplinkDomain is true, to feedback", new Object[0]);
                PushTaskBean pushTaskBean = new PushTaskBean();
                pushTaskBean.setTaskId("getuiapplinkup");
                pushTaskBean.setMessageId(queryParameter);
                pushTaskBean.setAppid(e.f37998a);
                FeedbackImpl.getInstance().feedbackMessageAction(pushTaskBean, PushConsts.SEND_MESSAGE_ERROR);
                return;
            }
            com.igexin.c.a.c.a.a("PushController|url " + str + " is invalid", new Object[0]);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a("PushController|" + e11.toString(), new Object[0]);
        }
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(e.A)) {
            com.igexin.c.a.c.a.d.a().a("setTag : " + str + ", failed, has not get clientid");
            l.a().a(str2, "20008");
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", "set_tag");
                jSONObject.put("id", String.valueOf(currentTimeMillis));
                jSONObject.put("cid", e.A);
                jSONObject.put("appid", e.f37998a);
                jSONObject.put("tags", URLEncoder.encode(str, "utf-8"));
                jSONObject.put("sn", str2);
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
            e.f38028e = str.replaceAll(",", " ");
            String jSONObject2 = jSONObject.toString();
            com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis, jSONObject2, (byte) 2, e.f38044u ? currentTimeMillis : 0L));
            o oVar = new o();
            oVar.f38418c = 128;
            oVar.f38420e = b.O;
            oVar.f38421f = jSONObject2;
            d.a.f37956a.f37949h.a("C-" + e.A, oVar, false);
            com.igexin.c.a.c.a.a("settag", new Object[0]);
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
        }
    }

    private static void a(String str, String str2, boolean z11) {
        if (TextUtils.isEmpty(e.A)) {
            com.igexin.c.a.c.a.d.a().a("unbindAlias : " + str + ", failed, has not get clientid");
            l.a().c(str2, "30005");
            return;
        }
        if (z11 && TextUtils.isEmpty(e.A)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - e.f37999aa <= 1000) {
            com.igexin.c.a.c.a.a("PushController|unbindAlias frequently called", new Object[0]);
            return;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(currentTimeMillis));
        if (!format.equals(e.Z)) {
            com.igexin.push.core.e.f.a().d(format);
            com.igexin.push.core.e.f.a().a(0);
        }
        if (e.f38000ab < 100) {
            com.igexin.c.a.c.a.a("start unbindAlias ###", new Object[0]);
            e.f37999aa = currentTimeMillis;
            com.igexin.push.core.e.f.a().a(e.f38000ab + 1);
            a(str, str2, true, z11);
            return;
        }
        com.igexin.c.a.c.a.a("PushController|unbindAlias times exceed", new Object[0]);
        com.igexin.c.a.c.a.d.a().a("unbindAlias : " + str + ", failed, , the number of calls per day cannot exceed 100");
        l.a().c(str2, "30003");
    }

    public static void a(String str, String str2, boolean z11, boolean z12) {
        if (TextUtils.isEmpty(e.A)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            String str3 = z11 ? "unbind_alias" : "bind_alias";
            byte b11 = z11 ? (byte) 8 : (byte) 7;
            try {
                jSONObject.put("action", str3);
                jSONObject.put("id", String.valueOf(currentTimeMillis));
                jSONObject.put("cid", e.A);
                jSONObject.put("appid", e.f37998a);
                jSONObject.put(PushConstants.SUB_ALIAS_STATUS_NAME, str);
                jSONObject.put("sn", str2);
                if (z11) {
                    jSONObject.put("is_self", z12);
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
            String jSONObject2 = jSONObject.toString();
            com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis, jSONObject2, b11, e.f38044u ? currentTimeMillis : 0L));
            o oVar = new o();
            oVar.f38418c = 128;
            oVar.f38420e = b.O;
            oVar.f38421f = jSONObject2;
            d.a.f37956a.f37949h.a("C-" + e.A, oVar, false);
            com.igexin.c.a.c.a.a(str3 + " = " + jSONObject2, new Object[0]);
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
        }
    }

    private static void a(String str, byte[] bArr) {
        if (e.A != null) {
            JSONObject jSONObject = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                jSONObject.put("action", "sendmessage");
                jSONObject.put("id", String.valueOf(currentTimeMillis));
                jSONObject.put("cid", e.A);
                jSONObject.put("appid", e.f37998a);
                jSONObject.put("taskid", str);
                jSONObject.put("extraData", Base64.encodeToString(bArr, 0));
                String jSONObject2 = jSONObject.toString();
                com.igexin.push.core.e.e.a().b(new com.igexin.push.core.b.n(currentTimeMillis, jSONObject2, (byte) 6, currentTimeMillis));
                com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
                bVar.f38418c = 128;
                bVar.f38417b = (int) currentTimeMillis;
                String str2 = e.A;
                bVar.f38420e = str2;
                bVar.f38421f = jSONObject2;
                bVar.f38422g = bArr;
                bVar.f38423h = str2;
                d.a.f37956a.f37949h.a("C-" + e.A, bVar, false);
                if (str == null || !str.startsWith("4T5@S_")) {
                    return;
                }
                com.igexin.c.a.c.a.a("PushController sending lbs report message : ".concat(String.valueOf(jSONObject2)), new Object[0]);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }
}
