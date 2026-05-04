package com.baicizhan.main.activity.mytab.task;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.baicizhan.main.activity.mytab.task.data.ActionType;
import com.baicizhan.main.activity.mytab.task.data.TaskStatus;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUiTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiTasks.kt\ncom/baicizhan/main/activity/mytab/task/ComposableSingletons$UiTasksKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,439:1\n1247#2,6:440\n1247#2,6:446\n1247#2,6:452\n*S KotlinDebug\n*F\n+ 1 UiTasks.kt\ncom/baicizhan/main/activity/mytab/task/ComposableSingletons$UiTasksKt\n*L\n132#1:440,6\n134#1:446,6\n137#1:452,6\n*E\n"})
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k f18843a = new k();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f18844b = ComposableLambdaKt.composableLambdaInstance(-1453955551, false, new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.g
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 f11;
            f11 = k.f((Composer) obj, ((Integer) obj2).intValue());
            return f11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 f(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1453955551, i11, -1, "com.baicizhan.main.activity.mytab.task.ComposableSingletons$UiTasksKt.lambda$-1453955551.<anonymous> (UiTasks.kt:96)");
            }
            le.b bVar = new le.b(100, 100, true);
            le.c cVar = new le.c(a00.h0.Q("https://7n.bczcdn.com/r/q9uweeng2wuwnqmybkh97ggp9zkdgfss.jpg", "https://7n.bczcdn.com/r/hq9lnykgz6fk2nda8n7nljdggmqj4yv8.jpg", "https://7n.bczcdn.com/r/fduc3mjxnuht6a6sfl9vjhzxwv4e8n3j.jpg"), "", true);
            TaskStatus taskStatus = TaskStatus.FINISH;
            ActionType actionType = ActionType.NONE;
            le.a aVar = new le.a(bVar, cVar, a00.h0.Q(new com.baicizhan.main.activity.mytab.task.data.i(1, "123", "埃里克地方加了凯撒等交房", "reward", "还有2天", taskStatus, actionType, ""), new com.baicizhan.main.activity.mytab.task.data.i(2, "123", "埃里克地方加了asdfasdfasdfasdfsadfasdfasdfsadfasdfasdf凯撒等交房", "reward", "还有2天", taskStatus, actionType, "")));
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.mytab.task.h
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 g11;
                        g11 = k.g((com.baicizhan.main.activity.mytab.task.data.i) obj);
                        return g11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.l lVar = (x00.l) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.activity.mytab.task.i
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 h11;
                        h11 = k.h((String) obj);
                        return h11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar2 = (x00.l) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.activity.mytab.task.j
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 i12;
                        i12 = k.i(((Integer) obj).intValue());
                        return i12;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            r0.F(null, aVar, lVar, lVar2, (x00.l) rememberedValue3, composer, 28032, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 g(com.baicizhan.main.activity.mytab.task.data.i it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return g2.f100423a;
    }

    public static final g2 h(String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return g2.f100423a;
    }

    public static final g2 i(int i11) {
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> e() {
        return f18844b;
    }
}
