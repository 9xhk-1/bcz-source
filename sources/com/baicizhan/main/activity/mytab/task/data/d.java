package com.baicizhan.main.activity.mytab.task.data;

import a00.h0;
import a00.r0;
import com.baicizhan.online.user_study_api.CreditCenter;
import com.baicizhan.online.user_study_api.Task;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import q30.k0;
import q30.m;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d {
    @k
    public static final f b(@k CreditCenter creditCenter, long j11) {
        List J;
        m E1;
        m N1;
        g0.p(creditCenter, "<this>");
        int i11 = creditCenter.credit;
        int i12 = creditCenter.daily_inc_credit;
        List<String> credit_item_img = creditCenter.credit_item_img;
        g0.o(credit_item_img, "credit_item_img");
        String credit_mall_url = creditCenter.credit_mall_url;
        g0.o(credit_mall_url, "credit_mall_url");
        int i13 = creditCenter.new_flag;
        List<Task> task = creditCenter.getTask();
        if (task == null || (E1 = r0.E1(task)) == null || (N1 = k0.N1(E1, new l() { // from class: com.baicizhan.main.activity.mytab.task.data.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                i c11;
                c11 = d.c((Task) obj);
                return c11;
            }
        })) == null || (J = (List) k0.G3(N1, new ArrayList())) == null) {
            J = h0.J();
        }
        return new f(i11, i12, credit_item_img, credit_mall_url, i13, J, j11);
    }

    public static final i c(Task task) {
        ActionType actionType;
        int i11 = task.task_id;
        String task_title = task.task_title;
        g0.o(task_title, "task_title");
        String task_sub_title = task.task_sub_title;
        g0.o(task_sub_title, "task_sub_title");
        String award = task.award;
        g0.o(award, "award");
        String button_desc = task.button_desc;
        g0.o(button_desc, "button_desc");
        int i12 = task.status;
        TaskStatus taskStatus = i12 != 1 ? i12 != 2 ? TaskStatus.FINISH : TaskStatus.REWARDING : TaskStatus.DOING;
        if (i12 == 2) {
            actionType = ActionType.GET_AWARD;
        } else {
            int i13 = task.button_action_type;
            actionType = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? ActionType.NONE : ActionType.H5 : ActionType.NATIVE : ActionType.NONE : ActionType.SIGN_IN;
        }
        return new i(i11, task_title, task_sub_title, award, button_desc, taskStatus, actionType, task.button_redirect_url);
    }
}
