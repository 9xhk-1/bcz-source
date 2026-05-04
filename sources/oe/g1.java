package oe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.home.player.HomeActivity;
import com.jiongji.andriod.card.R;
import java.io.Serializable;
import kc.d;
import kc.u;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nScheduleUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleUtil.kt\ncom/baicizhan/main/activity/schedule_v2/ScheduleUtilKt\n+ 2 utils.kt\ncom/baicizhan/base/UtilsKt\n*L\n1#1,44:1\n14#2,6:45\n*S KotlinDebug\n*F\n+ 1 ScheduleUtil.kt\ncom/baicizhan/main/activity/schedule_v2/ScheduleUtilKt\n*L\n24#1:45,6\n*E\n"})
/* loaded from: classes4.dex */
public final class g1 {
    public static final void c(@m80.k EditScheduleActivity editScheduleActivity, @m80.l Serializable serializable) {
        Intent intent;
        kotlin.jvm.internal.g0.p(editScheduleActivity, "<this>");
        if (!d1.c(editScheduleActivity.Q0().d())) {
            if (!d1.b(editScheduleActivity.Q0().d()) || serializable == null) {
                intent = null;
            } else {
                intent = new Intent();
                intent.putExtra("planData", serializable);
                g2 g2Var = g2.f100423a;
            }
            editScheduleActivity.setResult(-1, intent);
            LocalBroadcastManager.getInstance(editScheduleActivity).sendBroadcast(new Intent(jc.a.f64015b));
        } else if (com.baicizhan.main.home.experiment.q0.f21394a.b()) {
            editScheduleActivity.startActivity(new Intent(editScheduleActivity, (Class<?>) HomeActivity.class));
        } else {
            Intent intent2 = new Intent(editScheduleActivity, (Class<?>) MainTabActivity.class);
            Bundle bundle = new Bundle();
            editScheduleActivity.overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
            g2 g2Var2 = g2.f100423a;
            editScheduleActivity.startActivity(intent2, bundle);
        }
        editScheduleActivity.finish();
    }

    public static /* synthetic */ void d(EditScheduleActivity editScheduleActivity, Serializable serializable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            serializable = null;
        }
        c(editScheduleActivity, serializable);
    }

    @m80.k
    public static final Object e(@m80.k Fragment fragment, @m80.k final x00.a<g2> onPositive) {
        kotlin.jvm.internal.g0.p(fragment, "<this>");
        kotlin.jvm.internal.g0.p(onPositive, "onPositive");
        return mc.a.i(fragment, null, null, new x00.l() { // from class: oe.e1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = g1.f(x00.a.this, (u.a) obj);
                return f11;
            }
        }, 3, null);
    }

    public static final g2 f(final x00.a aVar, u.a prompt) {
        kotlin.jvm.internal.g0.p(prompt, "$this$prompt");
        prompt.U(R.string.schedule_devices_plan_sync_prompt);
        d.a.J(prompt, null, null, new x00.l() { // from class: oe.f1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = g1.g(x00.a.this, (View) obj);
                return g11;
            }
        }, 3, null);
        return g2.f100423a;
    }

    public static final g2 g(x00.a aVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        aVar.invoke();
        return g2.f100423a;
    }
}
