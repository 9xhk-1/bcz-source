package com.igexin.push.core;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.assist.sdk.AssistPushManager;
import com.igexin.push.core.d;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.push.g.o;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.main.FeedbackImpl;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private static String f37935a = "com.igexin.push.core.c";

    /* renamed from: b, reason: collision with root package name */
    private boolean f37936b;

    public c(Looper looper) {
        super(looper);
        this.f37936b = false;
    }

    private static void a() {
        if (e.f38044u || e.O <= 10000) {
            return;
        }
        int random = (int) ((Math.random() * 100.0d) + 150.0d);
        long j11 = e.O;
        com.igexin.c.a.c.a.a(f37935a + "|userPresent, rdelay = " + e.O + ", reset = " + random, new Object[0]);
        e.b((long) random);
        com.igexin.push.f.b.e.g().a(e.O);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        int i11 = message.what;
        if (i11 == b.T) {
            n.a().c();
            return;
        }
        Object obj = message.obj;
        if (obj == null) {
            return;
        }
        try {
            if (i11 != b.Q) {
                try {
                    if (i11 == b.R) {
                        com.igexin.push.core.a.b.d();
                        Intent intent = (Intent) message.obj;
                        if (intent == null || intent.getAction() == null) {
                            return;
                        }
                        String action = intent.getAction();
                        if (PushConsts.ACTION_BROADCAST_NETWORK_CHANGE.equals(action)) {
                            com.igexin.push.core.a.b.e();
                            return;
                        }
                        if (b.L.equals(action)) {
                            n.a().a(intent);
                            return;
                        }
                        if (b.N.equals(action)) {
                            if (com.igexin.push.config.d.f37583c != 0) {
                                com.igexin.push.f.f.a().d();
                                return;
                            }
                            return;
                        } else if (!"android.intent.action.SCREEN_ON".equals(action)) {
                            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                                e.f38048y = 0;
                                return;
                            }
                            return;
                        } else {
                            e.f38048y = 1;
                            com.igexin.push.f.a.a().a(true);
                            if (Build.VERSION.SDK_INT >= 26) {
                                com.igexin.push.core.a.b.b("screen on");
                                return;
                            }
                            return;
                        }
                    }
                    if (i11 != b.V) {
                        if (i11 == b.S) {
                            Bundle bundle = (Bundle) obj;
                            n.a().b(bundle.getString("taskid"), bundle.getString("messageid"), bundle.getString("actionid"));
                            return;
                        }
                        if (i11 == b.W) {
                            if (this.f37936b) {
                                return;
                            }
                            d unused = d.a.f37956a;
                            d.c();
                            this.f37936b = true;
                            return;
                        }
                        if (i11 == b.U && !"false".equals(e.I)) {
                            com.igexin.push.d.c.n nVar = new com.igexin.push.d.c.n();
                            nVar.f38498c = 128;
                            nVar.f38501f = message.obj;
                            nVar.f38502g = message.getData().getByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD);
                            new com.igexin.push.core.a.b.d().a(nVar);
                            return;
                        }
                        return;
                    }
                    Bundle bundle2 = (Bundle) obj;
                    String string = bundle2.getString("taskid");
                    String string2 = bundle2.getString("messageid");
                    n a11 = n.a();
                    if (string2 == null || string == null) {
                        return;
                    }
                    com.igexin.push.core.a.b.d();
                    String a12 = com.igexin.push.core.a.b.a(string, string2);
                    PushTaskBean pushTaskBean = e.f38006ah.get(a12);
                    if (pushTaskBean == null) {
                        return;
                    }
                    int status = pushTaskBean.getStatus();
                    int i12 = b.f37711ah;
                    if (status == i12) {
                        com.igexin.c.a.c.a.b("PushMessageExecutor", " has execute ".concat(String.valueOf(a12)));
                        return;
                    }
                    pushTaskBean.setStatus(i12);
                    com.igexin.c.a.c.a.b("PushMessageExecutor", " do processActionExecute ".concat(String.valueOf(a12)));
                    if (a11.a(string, string2) == PushMessageInterface.ActionPrepareState.success) {
                        com.igexin.push.core.e.c.a();
                        com.igexin.push.core.e.c.a(b.f37711ah, string);
                        pushTaskBean.setStatus(b.f37711ah);
                        if (a11.a(string, string2, "1")) {
                            return;
                        }
                        com.igexin.push.core.e.c.a();
                        com.igexin.push.core.e.c.a(b.f37710ag, string);
                    }
                    pushTaskBean.setStatus(b.f37710ag);
                    return;
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                    return;
                }
            }
            Intent intent2 = (Intent) obj;
            if (intent2.hasExtra("action")) {
                String stringExtra = intent2.getStringExtra("action");
                if (stringExtra.equals(PushConsts.ACTION_SERVICE_INITIALIZE)) {
                    com.igexin.push.core.a.b.d();
                    com.igexin.push.core.a.b.a(intent2);
                    return;
                }
                if (stringExtra.equals(PushConsts.ACTION_SERVICE_ONRESUME)) {
                    com.igexin.c.a.c.a.a(f37935a + "|handle onresume ~~~", new Object[0]);
                    com.igexin.push.core.a.b.d();
                    com.igexin.push.core.a.b.b("on fg");
                    return;
                }
                if (stringExtra.equals(PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE)) {
                    com.igexin.push.core.a.b.d();
                    com.igexin.push.core.a.b.b(intent2);
                    AssistPushManager.getInstance().turnOnPush(e.f38035l);
                    return;
                }
                if (stringExtra.equals(PushConsts.ACTION_BROADCAST_PUSHMANAGER)) {
                    String stringExtra2 = intent2.getStringExtra(o.f38736e);
                    if (TextUtils.isEmpty(e.f38032i) || e.f38032i.equals(stringExtra2)) {
                        Bundle bundleExtra = intent2.getBundleExtra("bundle");
                        com.igexin.push.core.a.b.d();
                        com.igexin.push.core.a.b.a(bundleExtra);
                        return;
                    }
                    com.igexin.c.a.c.a.a("safeCode not match!!" + e.f38032i + "," + stringExtra2, new Object[0]);
                    com.igexin.c.a.c.a.d.a().a("safeCode not match!!" + e.f38032i + "," + stringExtra2);
                    return;
                }
                if (stringExtra.equals(PushConsts.ACTION_BROADCAST_USER_PRESENT)) {
                    if (e.f38044u || e.O <= 10000) {
                        return;
                    }
                    int random = (int) ((Math.random() * 100.0d) + 150.0d);
                    long j11 = e.O;
                    com.igexin.c.a.c.a.a(f37935a + "|userPresent, rdelay = " + e.O + ", reset = " + random, new Object[0]);
                    e.b((long) random);
                    com.igexin.push.f.b.e.g().a(e.O);
                    return;
                }
                if (stringExtra.equals("com.igexin.action.notification.click")) {
                    Intent intent3 = (Intent) intent2.getParcelableExtra("broadcast_intent");
                    if (intent3 != null) {
                        com.igexin.push.core.f.a.a();
                        com.igexin.push.core.f.a.a(intent3);
                        return;
                    }
                    return;
                }
                if (stringExtra.equals(b.M)) {
                    HashMap hashMap = (HashMap) intent2.getSerializableExtra("push_action");
                    com.igexin.c.a.c.a.a(f37935a + "| handle other push action broadcast", new Object[0]);
                    n.a().f38356a.putAll(hashMap);
                    n.a().d();
                    return;
                }
                if (!stringExtra.equals("com.igexin.action.notification.delete")) {
                    if (stringExtra.equals(PushConsts.ACTION_BROADCAST_UPLOAD_TYPE253)) {
                        String stringExtra3 = intent2.getStringExtra("id");
                        String stringExtra4 = intent2.getStringExtra("aid");
                        com.igexin.push.core.c.a.a();
                        com.igexin.push.core.c.a.a(stringExtra3, stringExtra4);
                        return;
                    }
                    return;
                }
                if (intent2.getBooleanExtra("isSummary", false)) {
                    String stringExtra5 = intent2.getStringExtra("groupId");
                    e.f38008aj.remove(stringExtra5);
                    e.f38009ak.remove(stringExtra5);
                    return;
                }
                PushTaskBean pushTaskBean2 = new PushTaskBean();
                pushTaskBean2.setAppid(intent2.getStringExtra("appid"));
                pushTaskBean2.setMessageId(intent2.getStringExtra("messageid"));
                String stringExtra6 = intent2.getStringExtra("taskid");
                pushTaskBean2.setTaskId(stringExtra6);
                pushTaskBean2.setId(intent2.getStringExtra("id"));
                pushTaskBean2.setAppKey(intent2.getStringExtra(com.alipay.sdk.m.s.a.f11004r));
                com.igexin.push.core.e.c.a();
                com.igexin.push.core.e.c.a(stringExtra6, b.f37715al, intent2.getIntExtra("redisplayFreq", 0));
                int parseInt = Integer.parseInt(intent2.getStringExtra("feedbackid")) + 30040;
                pushTaskBean2.setCurrentActionid(parseInt);
                FeedbackImpl.getInstance().feedbackMessageAction(pushTaskBean2, String.valueOf(parseInt), "notifyStyle:" + intent2.getStringExtra("notifyStyle"));
                com.igexin.push.core.a.b.d();
                String a13 = com.igexin.push.core.a.b.a(intent2.getStringExtra("taskid"), intent2.getStringExtra("messageid"));
                com.igexin.c.a.c.a.a(f37935a + "|notification delete = " + a13, new Object[0]);
                try {
                    e.f38006ah.remove(a13);
                    com.igexin.c.a.c.a.a(f37935a + "|del notification, pushMessageMap remove = " + a13, new Object[0]);
                    return;
                } catch (Exception e11) {
                    com.igexin.c.a.c.a.a(e11);
                    com.igexin.c.a.c.a.a("EndAction|" + e11.toString(), new Object[0]);
                    return;
                }
            }
            return;
        } catch (Throwable th3) {
            com.igexin.c.a.c.a.a(th3);
        }
        com.igexin.c.a.c.a.a(th3);
    }

    private static void a(Intent intent) {
        String stringExtra = intent.getStringExtra("action");
        if (stringExtra.equals(PushConsts.ACTION_SERVICE_INITIALIZE)) {
            com.igexin.push.core.a.b.d();
            com.igexin.push.core.a.b.a(intent);
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_SERVICE_ONRESUME)) {
            com.igexin.c.a.c.a.a(f37935a + "|handle onresume ~~~", new Object[0]);
            com.igexin.push.core.a.b.d();
            com.igexin.push.core.a.b.b("on fg");
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE)) {
            com.igexin.push.core.a.b.d();
            com.igexin.push.core.a.b.b(intent);
            AssistPushManager.getInstance().turnOnPush(e.f38035l);
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_BROADCAST_PUSHMANAGER)) {
            String stringExtra2 = intent.getStringExtra(o.f38736e);
            if (TextUtils.isEmpty(e.f38032i) || e.f38032i.equals(stringExtra2)) {
                Bundle bundleExtra = intent.getBundleExtra("bundle");
                com.igexin.push.core.a.b.d();
                com.igexin.push.core.a.b.a(bundleExtra);
                return;
            }
            com.igexin.c.a.c.a.a("safeCode not match!!" + e.f38032i + "," + stringExtra2, new Object[0]);
            com.igexin.c.a.c.a.d.a().a("safeCode not match!!" + e.f38032i + "," + stringExtra2);
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_BROADCAST_USER_PRESENT)) {
            if (e.f38044u || e.O <= 10000) {
                return;
            }
            int random = (int) ((Math.random() * 100.0d) + 150.0d);
            long j11 = e.O;
            com.igexin.c.a.c.a.a(f37935a + "|userPresent, rdelay = " + e.O + ", reset = " + random, new Object[0]);
            e.b((long) random);
            com.igexin.push.f.b.e.g().a(e.O);
            return;
        }
        if (stringExtra.equals("com.igexin.action.notification.click")) {
            Intent intent2 = (Intent) intent.getParcelableExtra("broadcast_intent");
            if (intent2 != null) {
                com.igexin.push.core.f.a.a();
                com.igexin.push.core.f.a.a(intent2);
                return;
            }
            return;
        }
        if (stringExtra.equals(b.M)) {
            HashMap hashMap = (HashMap) intent.getSerializableExtra("push_action");
            com.igexin.c.a.c.a.a(f37935a + "| handle other push action broadcast", new Object[0]);
            n.a().f38356a.putAll(hashMap);
            n.a().d();
            return;
        }
        if (!stringExtra.equals("com.igexin.action.notification.delete")) {
            if (stringExtra.equals(PushConsts.ACTION_BROADCAST_UPLOAD_TYPE253)) {
                String stringExtra3 = intent.getStringExtra("id");
                String stringExtra4 = intent.getStringExtra("aid");
                com.igexin.push.core.c.a.a();
                com.igexin.push.core.c.a.a(stringExtra3, stringExtra4);
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("isSummary", false)) {
            String stringExtra5 = intent.getStringExtra("groupId");
            e.f38008aj.remove(stringExtra5);
            e.f38009ak.remove(stringExtra5);
            return;
        }
        PushTaskBean pushTaskBean = new PushTaskBean();
        pushTaskBean.setAppid(intent.getStringExtra("appid"));
        pushTaskBean.setMessageId(intent.getStringExtra("messageid"));
        String stringExtra6 = intent.getStringExtra("taskid");
        pushTaskBean.setTaskId(stringExtra6);
        pushTaskBean.setId(intent.getStringExtra("id"));
        pushTaskBean.setAppKey(intent.getStringExtra(com.alipay.sdk.m.s.a.f11004r));
        com.igexin.push.core.e.c.a();
        com.igexin.push.core.e.c.a(stringExtra6, b.f37715al, intent.getIntExtra("redisplayFreq", 0));
        int parseInt = Integer.parseInt(intent.getStringExtra("feedbackid")) + 30040;
        pushTaskBean.setCurrentActionid(parseInt);
        FeedbackImpl.getInstance().feedbackMessageAction(pushTaskBean, String.valueOf(parseInt), "notifyStyle:" + intent.getStringExtra("notifyStyle"));
        com.igexin.push.core.a.b.d();
        String a11 = com.igexin.push.core.a.b.a(intent.getStringExtra("taskid"), intent.getStringExtra("messageid"));
        com.igexin.c.a.c.a.a(f37935a + "|notification delete = " + a11, new Object[0]);
        try {
            e.f38006ah.remove(a11);
            com.igexin.c.a.c.a.a(f37935a + "|del notification, pushMessageMap remove = " + a11, new Object[0]);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a("EndAction|" + e11.toString(), new Object[0]);
        }
    }
}
