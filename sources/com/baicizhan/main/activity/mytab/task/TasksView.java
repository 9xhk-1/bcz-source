package com.baicizhan.main.activity.mytab.task;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import he.x;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nUiTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiTasks.kt\ncom/baicizhan/main/activity/mytab/task/TasksView\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,439:1\n46#2,7:440\n86#3,6:447\n1247#4,6:453\n1247#4,6:459\n1247#4,6:465\n85#5:471\n*S KotlinDebug\n*F\n+ 1 UiTasks.kt\ncom/baicizhan/main/activity/mytab/task/TasksView\n*L\n361#1:440,7\n361#1:447,6\n367#1:453,6\n372#1:459,6\n378#1:465,6\n362#1:471\n*E\n"})
/* loaded from: classes4.dex */
public final class TasksView extends AbstractComposeView {

    /* renamed from: b, reason: collision with root package name */
    public static final int f18704b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public x00.l<? super String, g2> f18705a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public TasksView(@m80.k Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 f(final TasksView tasksView, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062934200, i11, -1, "com.baicizhan.main.activity.mytab.task.TasksView.Content.<anonymous> (UiTasks.kt:360)");
            }
            composer.startReplaceableGroup(1890788296);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory createHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) TaskVM.class, current, (String) null, createHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 36936, 0);
            Composer composer2 = composer;
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            final TaskVM taskVM = (TaskVM) viewModel;
            he.x g11 = g(FlowExtKt.collectAsStateWithLifecycle(taskVM.m(), (LifecycleOwner) null, (Lifecycle.State) null, (kotlin.coroutines.d) null, composer2, 0, 7));
            x.b bVar = g11 instanceof x.b ? (x.b) g11 : null;
            if (bVar == null) {
                composer2.startReplaceGroup(921365148);
            } else {
                composer2.startReplaceGroup(921365149);
                le.a d11 = bVar.d();
                Object rememberedValue = composer2.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.mytab.task.s
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            g2 h11;
                            h11 = TasksView.h(TaskVM.this, (com.baicizhan.main.activity.mytab.task.data.i) obj);
                            return h11;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                x00.l lVar = (x00.l) rememberedValue;
                Object rememberedValue2 = composer2.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.activity.mytab.task.t
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            g2 i12;
                            i12 = TasksView.i(TaskVM.this, tasksView, (String) obj);
                            return i12;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                x00.l lVar2 = (x00.l) rememberedValue2;
                Object rememberedValue3 = composer2.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.activity.mytab.task.u
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            g2 j11;
                            j11 = TasksView.j(TaskVM.this, ((Integer) obj).intValue());
                            return j11;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                r0.F(null, d11, lVar, lVar2, (x00.l) rememberedValue3, composer2, 28032, 1);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final he.x g(State<? extends he.x> state) {
        return state.getValue();
    }

    public static final g2 h(TaskVM taskVM, com.baicizhan.main.activity.mytab.task.data.i task) {
        kotlin.jvm.internal.g0.p(task, "task");
        taskVM.b(task);
        return g2.f100423a;
    }

    public static final g2 i(TaskVM taskVM, TasksView tasksView, String url) {
        kotlin.jvm.internal.g0.p(url, "url");
        taskVM.c();
        x00.l<? super String, g2> lVar = tasksView.f18705a;
        if (lVar != null) {
            lVar.invoke(url);
        }
        return g2.f100423a;
    }

    public static final g2 j(TaskVM taskVM, int i11) {
        taskVM.o(i11);
        return g2.f100423a;
    }

    public static final g2 k(TasksView tasksView, int i11, Composer composer, int i12) {
        tasksView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1105528716);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1105528716, i12, -1, "com.baicizhan.main.activity.mytab.task.TasksView.Content (UiTasks.kt:358)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1062934200, true, new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.q
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 f11;
                    f11 = TasksView.f(TasksView.this, (Composer) obj, ((Integer) obj2).intValue());
                    return f11;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.r
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 k11;
                    k11 = TasksView.k(TasksView.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return k11;
                }
            });
        }
    }

    @m80.l
    public final x00.l<String, g2> getGoExchange() {
        return this.f18705a;
    }

    public final void setGoExchange(@m80.l x00.l<? super String, g2> lVar) {
        this.f18705a = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public TasksView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public TasksView(@m80.k Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public /* synthetic */ TasksView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
