package com.baicizhan.client.business.util;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import kc.d;
import kc.u;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ThirdAppDialogKt {
    @w00.k
    @m80.k
    public static final kc.u thirdAppDialog(@m80.k Context context, @m80.k x00.a<g2> click) {
        g0.p(context, "context");
        g0.p(click, "click");
        return thirdAppDialog$default(context, click, null, null, 12, null);
    }

    public static /* synthetic */ kc.u thirdAppDialog$default(Context context, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar2 = new x00.a() { // from class: com.baicizhan.client.business.util.z
                @Override // x00.a
                public final Object invoke() {
                    g2 g2Var;
                    g2Var = g2.f100423a;
                    return g2Var;
                }
            };
        }
        if ((i11 & 8) != 0) {
            aVar3 = new x00.a() { // from class: com.baicizhan.client.business.util.a0
                @Override // x00.a
                public final Object invoke() {
                    g2 g2Var;
                    g2Var = g2.f100423a;
                    return g2Var;
                }
            };
        }
        return thirdAppDialog(context, aVar, aVar2, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 thirdAppDialog$lambda$2(x00.a aVar, View it) {
        g0.p(it, "it");
        aVar.invoke();
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 thirdAppDialog$lambda$3(x00.a aVar, View it) {
        g0.p(it, "it");
        aVar.invoke();
        return g2.f100423a;
    }

    @w00.k
    @m80.k
    public static final kc.u thirdAppDialog(@m80.k Context context, @m80.k x00.a<g2> click, @m80.k x00.a<g2> cancel) {
        g0.p(context, "context");
        g0.p(click, "click");
        g0.p(cancel, "cancel");
        return thirdAppDialog$default(context, click, cancel, null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    @m80.k
    public static final kc.u thirdAppDialog(@m80.k Context context, @m80.k final x00.a<g2> click, @m80.k final x00.a<g2> cancel, @m80.k final x00.a<g2> dismiss) {
        g0.p(context, "context");
        g0.p(click, "click");
        g0.p(cancel, "cancel");
        g0.p(dismiss, "dismiss");
        kc.u uVar = (kc.u) ((u.a) ((u.a) d.a.J(((u.a) new u.a(context).V("该服务需要跳转外部App完成。").q("取消", new x00.l() { // from class: com.baicizhan.client.business.util.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 thirdAppDialog$lambda$2;
                thirdAppDialog$lambda$2 = ThirdAppDialogKt.thirdAppDialog$lambda$2(x00.a.this, (View) obj);
                return thirdAppDialog$lambda$2;
            }
        })).b0(ButtonType.DOUBLE), gi.k.f53787g, null, new x00.l() { // from class: com.baicizhan.client.business.util.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 thirdAppDialog$lambda$3;
                thirdAppDialog$lambda$3 = ThirdAppDialogKt.thirdAppDialog$lambda$3(x00.a.this, (View) obj);
                return thirdAppDialog$lambda$3;
            }
        }, 2, null)).f(false)).d();
        uVar.B(new DialogInterface.OnDismissListener() { // from class: com.baicizhan.client.business.util.y
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                x00.a.this.invoke();
            }
        });
        return uVar;
    }
}
