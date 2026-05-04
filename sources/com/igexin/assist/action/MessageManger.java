package com.igexin.assist.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.getui.gtc.base.GtcProvider;
import com.igexin.assist.MessageBean;
import com.igexin.assist.control.AbstractPushManager;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.assist.util.AssistUtils;
import com.igexin.push.core.d;
import com.igexin.push.core.e;
import com.igexin.push.core.e.d;
import com.igexin.push.core.e.f;
import com.igexin.push.core.l;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.main.FeedbackImpl;
import com.igexin.sdk.message.GTTransmitMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MessageManger {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37001a = "Assist_MessageManger";

    /* renamed from: b, reason: collision with root package name */
    private String f37002b;

    /* renamed from: com.igexin.assist.action.MessageManger$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37004b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f37005c;

        public AnonymousClass1(String str, boolean z11, Context context) {
            this.f37003a = str;
            this.f37004b = z11;
            this.f37005c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (e.f38036m.get()) {
                com.igexin.c.a.c.a.b(MessageManger.f37001a, "delay 1s save token = " + this.f37003a);
                MessageManger.b(this.f37003a, this.f37004b);
                return;
            }
            Context context = this.f37005c;
            if (context == null) {
                com.igexin.c.a.c.a.b(MessageManger.f37001a, " save token in SP ,but context is null " + this.f37003a);
                return;
            }
            d a11 = d.a(context);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("token", this.f37003a);
                jSONObject.put("isForce", this.f37004b);
            } catch (JSONException e11) {
                com.igexin.c.a.c.a.a(e11);
            }
            a11.a(jSONObject);
        }
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        MessageBean f37007a;

        public a(MessageBean messageBean) {
            this.f37007a = messageBean;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                MessageBean messageBean = this.f37007a;
                if (messageBean != null) {
                    GtcProvider.setContext(messageBean.getContext());
                    String messageType = this.f37007a.getMessageType();
                    int hashCode = messageType.hashCode();
                    if (hashCode == -1161803523) {
                        if (!messageType.equals(AssistPushConsts.MSG_TYPE_ACTIONS) || TextUtils.isEmpty(this.f37007a.getStringMessage())) {
                            return;
                        }
                        com.igexin.assist.action.a aVar = new com.igexin.assist.action.a();
                        aVar.a(this.f37007a);
                        if (aVar.a(true) && aVar.f37014e.equals(AssistPushConsts.MSG_VALUE_PAYLOAD)) {
                            MessageManger.a(this.f37007a.getContext(), aVar);
                            return;
                        }
                        return;
                    }
                    if (hashCode != -786701938) {
                        if (hashCode == 110541305 && messageType.equals("token")) {
                            MessageManger.a(MessageManger.this, this.f37007a.getContext(), this.f37007a.getStringMessage(), this.f37007a.extra.getBoolean("isForce"));
                            return;
                        }
                        return;
                    }
                    if (!messageType.equals(AssistPushConsts.MSG_TYPE_PAYLOAD) || TextUtils.isEmpty(this.f37007a.getStringMessage())) {
                        return;
                    }
                    com.igexin.assist.action.a aVar2 = new com.igexin.assist.action.a();
                    aVar2.a(this.f37007a);
                    if (aVar2.a(false) && aVar2.f37014e.equals(AssistPushConsts.MSG_VALUE_PAYLOAD)) {
                        MessageManger.a(MessageManger.this, aVar2, this.f37007a.getContext());
                    }
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final MessageManger f37009a = new MessageManger(0);

        private b() {
        }
    }

    private MessageManger() {
    }

    private static PushTaskBean a(com.igexin.assist.action.a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        PushTaskBean pushTaskBean = new PushTaskBean();
        pushTaskBean.setAppid(aVar.f37013d);
        pushTaskBean.setMessageId(aVar.f37012c);
        pushTaskBean.setTaskId(aVar.f37011b);
        pushTaskBean.setId(String.valueOf(currentTimeMillis));
        pushTaskBean.setCurrentActionid(1);
        return pushTaskBean;
    }

    private static void b(Context context, com.igexin.assist.action.a aVar) {
        if (!e.f38036m.get()) {
            AssistUtils.startGetuiService(context);
        }
        if (aVar == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = com.igexin.push.core.b.U;
        obtain.obj = aVar.f37015f;
        Bundle bundle = new Bundle();
        bundle.putString("content", aVar.f37015f);
        byte[] bArr = aVar.f37010a;
        if (bArr != null) {
            bundle.putByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD, bArr);
        }
        obtain.setData(bundle);
        d.a.f37956a.a(obtain);
    }

    public static MessageManger getInstance() {
        return b.f37009a;
    }

    public void addMessage(MessageBean messageBean) {
        com.igexin.b.a.a().f37028a.execute(new a(messageBean));
    }

    public void feedbackPushMessage(Context context, com.igexin.assist.action.a aVar, String str) {
        try {
            if (e.f38036m.get()) {
                FeedbackImpl feedbackImpl = FeedbackImpl.getInstance();
                long currentTimeMillis = System.currentTimeMillis();
                PushTaskBean pushTaskBean = new PushTaskBean();
                pushTaskBean.setAppid(aVar.f37013d);
                pushTaskBean.setMessageId(aVar.f37012c);
                pushTaskBean.setTaskId(aVar.f37011b);
                pushTaskBean.setId(String.valueOf(currentTimeMillis));
                pushTaskBean.setCurrentActionid(1);
                feedbackImpl.feedbackMultiBrandMessageAction(pushTaskBean, str);
                return;
            }
            com.igexin.push.core.e.d a11 = com.igexin.push.core.e.d.a(context);
            long currentTimeMillis2 = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", String.valueOf(currentTimeMillis2));
            jSONObject.put("messageid", aVar.f37012c);
            jSONObject.put("taskid", aVar.f37011b);
            jSONObject.put("multaid", str);
            jSONObject.put(com.alipay.sdk.m.t.a.f11034k, String.valueOf(System.currentTimeMillis()));
            a11.a(aVar.f37011b, jSONObject);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public String getBrandCode() {
        if (!TextUtils.isEmpty(this.f37002b)) {
            return this.f37002b;
        }
        AbstractPushManager abstractPushManager = com.igexin.assist.sdk.a.a().f37025b;
        String brandCode = abstractPushManager == null ? "" : abstractPushManager.getBrandCode();
        this.f37002b = brandCode;
        return brandCode;
    }

    public /* synthetic */ MessageManger(byte b11) {
        this();
    }

    public static /* synthetic */ void a(Context context, com.igexin.assist.action.a aVar) {
        if (!e.f38036m.get()) {
            AssistUtils.startGetuiService(context);
        }
        Message obtain = Message.obtain();
        obtain.what = com.igexin.push.core.b.U;
        obtain.obj = aVar.f37015f;
        Bundle bundle = new Bundle();
        bundle.putString("content", aVar.f37015f);
        byte[] bArr = aVar.f37010a;
        if (bArr != null) {
            bundle.putByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD, bArr);
        }
        obtain.setData(bundle);
        d.a.f37956a.a(obtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, boolean z11) {
        a(str);
        if (!z11) {
            try {
                if (str.equals(e.I)) {
                    return;
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                return;
            }
        }
        f.a().b(str);
        if (e.f38044u) {
            com.igexin.c.a.c.a.b(f37001a, "online, send addphoneinfo");
            com.igexin.push.core.a.b.d().i();
        } else if (z11) {
            f.a().c("");
        }
    }

    private void a(Context context, String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.igexin.c.a.c.a.e.a(f37001a, "other token = ".concat(String.valueOf(str)));
        if (e.f38036m.get()) {
            b(str, z11);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass1(str, z11, context), 1000L);
        }
    }

    public static /* synthetic */ void a(MessageManger messageManger, Context context, String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.igexin.c.a.c.a.e.a(f37001a, "other token = ".concat(String.valueOf(str)));
        if (e.f38036m.get()) {
            b(str, z11);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(messageManger.new AnonymousClass1(str, z11, context), 1000L);
        }
    }

    public static /* synthetic */ void a(MessageManger messageManger, com.igexin.assist.action.a aVar, Context context) {
        StringBuilder sb2;
        if (context == null) {
            return;
        }
        try {
            com.igexin.push.core.e.d a11 = com.igexin.push.core.e.d.a(context);
            if (a11.a(aVar.f37011b)) {
                sb2 = new StringBuilder();
                sb2.append(messageManger.getBrandCode());
                sb2.append("1");
            } else {
                a11.b(aVar.f37011b);
                Bundle bundle = new Bundle();
                bundle.putInt("action", 10001);
                bundle.putSerializable(PushConsts.KEY_MESSAGE_DATA, new GTTransmitMessage(aVar.f37011b, aVar.f37012c, aVar.f37012c + ":" + aVar.f37011b, aVar.f37010a));
                l.a(context);
                l.a().a(bundle);
                sb2 = new StringBuilder();
                sb2.append(messageManger.getBrandCode());
                sb2.append("0");
            }
            messageManger.feedbackPushMessage(context, aVar, sb2.toString());
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    private void a(com.igexin.assist.action.a aVar, Context context) {
        StringBuilder sb2;
        if (aVar == null || context == null) {
            return;
        }
        try {
            com.igexin.push.core.e.d a11 = com.igexin.push.core.e.d.a(context);
            if (a11.a(aVar.f37011b)) {
                sb2 = new StringBuilder();
                sb2.append(getBrandCode());
                sb2.append("1");
            } else {
                a11.b(aVar.f37011b);
                Bundle bundle = new Bundle();
                bundle.putInt("action", 10001);
                bundle.putSerializable(PushConsts.KEY_MESSAGE_DATA, new GTTransmitMessage(aVar.f37011b, aVar.f37012c, aVar.f37012c + ":" + aVar.f37011b, aVar.f37010a));
                l.a(context);
                l.a().a(bundle);
                sb2 = new StringBuilder();
                sb2.append(getBrandCode());
                sb2.append("0");
            }
            feedbackPushMessage(context, aVar, sb2.toString());
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    private static void a(String str) {
        try {
            l.a().a(str);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }
}
