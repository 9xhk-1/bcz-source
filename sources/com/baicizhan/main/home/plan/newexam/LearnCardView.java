package com.baicizhan.main.home.plan.newexam;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
import androidx.fragment.app.FragmentActivity;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.util.HiltContextUtilsKt;
import com.baicizhan.client.business.webview.BczWebDirector;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.ShowOffActivity;
import com.baicizhan.main.home.plan.newexam.a;
import com.baicizhan.main.home.plan.newexam.c;
import com.baicizhan.main.web.BczWebWorker;
import com.baicizhan.main.wordlist.activity.WordListActivity;
import com.jiongji.andriod.card.R;
import kc.d;
import kc.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import tj.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nLearnCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCardView.kt\ncom/baicizhan/main/home/plan/newexam/LearnCardView\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,281:1\n46#2,7:282\n86#3,6:289\n1247#4,6:295\n1247#4,6:301\n1247#4,6:307\n1247#4,6:313\n1247#4,6:319\n1247#4,6:325\n1247#4,6:331\n85#5:337\n*S KotlinDebug\n*F\n+ 1 LearnCardView.kt\ncom/baicizhan/main/home/plan/newexam/LearnCardView\n*L\n70#1:282,7\n70#1:289,6\n73#1:295,6\n74#1:301,6\n75#1:307,6\n88#1:313,6\n90#1:319,6\n91#1:325,6\n94#1:331,6\n71#1:337\n*E\n"})
/* loaded from: classes4.dex */
public final class LearnCardView extends AbstractComposeView {

    /* renamed from: c, reason: collision with root package name */
    public static final int f22561c = 8;

    /* renamed from: a, reason: collision with root package name */
    public og.t f22562a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public va.b f22563b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public LearnCardView(@m80.k Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public static final yz.g2 A(a aVar, u.a prompt) {
        kotlin.jvm.internal.g0.p(prompt, "$this$prompt");
        a.c cVar = (a.c) aVar;
        prompt.M(cVar.f());
        prompt.V(cVar.e());
        prompt.b0(ButtonType.SINGLE_POSITIVE);
        d.a.I(prompt, R.string.force_dialog_i_know, null, new x00.l() { // from class: com.baicizhan.main.home.plan.newexam.p4
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 B;
                B = LearnCardView.B((View) obj);
                return B;
            }
        }, 2, null);
        return yz.g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 B(View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        qb.c.i(x4.f22861a, "CLIKC I KNOWN", new Object[0]);
        return yz.g2.f100423a;
    }

    public static final yz.g2 C(LearnCardView learnCardView, Context context, a aVar) {
        learnCardView.y(context, ((a.d) aVar).d());
        return yz.g2.f100423a;
    }

    private final q9.x D() {
        q9.x r11 = q9.x.r();
        if (r11 == null) {
            return null;
        }
        r11.e0();
        r11.a(4);
        r11.w0(true);
        qb.c.i(x4.f22861a, "", new Object[0]);
        return r11;
    }

    public static final void F(RadioGroup radioGroup, LearnCardView learnCardView, Activity activity, RadioGroup radioGroup2, int i11) {
        View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        kotlin.jvm.internal.g0.n(findViewById, "null cannot be cast to non-null type android.widget.RadioButton");
        CharSequence text = ((RadioButton) findViewById).getText();
        kotlin.jvm.internal.g0.n(text, "null cannot be cast to non-null type kotlin.String");
        String str = (String) text;
        va.b bVar = learnCardView.f22563b;
        if (bVar != null) {
            bVar.k(activity.getString(R.string.dialog_plan_more_title, Integer.valueOf(Integer.parseInt(str))));
            bVar.m(true);
        }
    }

    public static final void G(RadioGroup radioGroup, ExamVM examVM, x00.a aVar, int i11, Activity activity, DialogInterface dialogInterface, int i12) {
        View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        kotlin.jvm.internal.g0.n(findViewById, "null cannot be cast to non-null type android.widget.RadioButton");
        CharSequence text = ((RadioButton) findViewById).getText();
        kotlin.jvm.internal.g0.n(text, "null cannot be cast to non-null type kotlin.String");
        int parseInt = Integer.parseInt((String) text);
        ma.l.b(ma.t.f73009h, ma.a.f72790m0, ma.u.d(new String[]{"count", "plan_type"}, new Object[]{Integer.valueOf(parseInt), ma.v.f73035f}, false, 4, null));
        examVM.l(parseInt);
        aVar.invoke();
        if (i11 != parseInt) {
            i9.f.k(activity, i9.f.f60390p, parseInt);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 o(final LearnCardView learnCardView, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1288697181, i11, -1, "com.baicizhan.main.home.plan.newexam.LearnCardView.Content.<anonymous> (LearnCardView.kt:64)");
            }
            ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(learnCardView);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            int i12 = LocalViewModelStoreOwner.$stable;
            if (localViewModelStoreOwner.getCurrent(composer, i12) == null || viewModelStoreOwner == null) {
                qb.c.b(x4.f22861a, "viewModelStoreOwner unavailable...", new Object[0]);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return yz.g2.f100423a;
            }
            composer.startReplaceableGroup(1890788296);
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer, i12);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory createHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ExamVM.class, current, (String) null, createHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 36936, 0);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            final ExamVM examVM = (ExamVM) viewModel;
            State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(examVM.h(), (LifecycleOwner) null, (Lifecycle.State) null, (kotlin.coroutines.d) null, composer, 0, 7);
            boolean changedInstance = composer.changedInstance(learnCardView);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.s4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 q11;
                        q11 = LearnCardView.q(LearnCardView.this);
                        return q11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(learnCardView);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.t4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 r11;
                        r11 = LearnCardView.r(LearnCardView.this);
                        return r11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.a aVar2 = (x00.a) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(learnCardView);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.u4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 s11;
                        s11 = LearnCardView.s(LearnCardView.this);
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            x00.a aVar3 = (x00.a) rememberedValue3;
            boolean changedInstance4 = composer.changedInstance(learnCardView);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.v4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 t11;
                        t11 = LearnCardView.t(LearnCardView.this);
                        return t11;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            x00.a aVar4 = (x00.a) rememberedValue4;
            boolean changedInstance5 = composer.changedInstance(learnCardView);
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.w4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u11;
                        u11 = LearnCardView.u(LearnCardView.this);
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            x00.a aVar5 = (x00.a) rememberedValue5;
            boolean changedInstance6 = composer.changedInstance(learnCardView);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue6 == Composer.Companion.getEmpty()) {
                rememberedValue6 = new x00.l() { // from class: com.baicizhan.main.home.plan.newexam.k4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 v11;
                        v11 = LearnCardView.v(LearnCardView.this, (th.a) obj);
                        return v11;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            x00.l lVar = (x00.l) rememberedValue6;
            boolean changedInstance7 = composer.changedInstance(learnCardView) | composer.changedInstance(examVM);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance7 || rememberedValue7 == Composer.Companion.getEmpty()) {
                rememberedValue7 = new x00.l() { // from class: com.baicizhan.main.home.plan.newexam.l4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 w11;
                        w11 = LearnCardView.w(LearnCardView.this, examVM, (b) obj);
                        return w11;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            x00.l lVar2 = (x00.l) rememberedValue7;
            qb.c.i(x4.f22861a, learnCardView.hashCode() + " " + p(collectAsStateWithLifecycle), new Object[0]);
            c p11 = p(collectAsStateWithLifecycle);
            if (p11 instanceof c.e) {
                composer.startReplaceGroup(1136574653);
                composer.endReplaceGroup();
            } else if (p11 instanceof c.g) {
                composer.startReplaceGroup(1136625276);
                i4.c0((c.g) p11, aVar, aVar2, aVar4, aVar5, lVar, lVar2, composer, 0);
                composer.endReplaceGroup();
            } else if (p11 instanceof c.d) {
                composer.startReplaceGroup(1136862023);
                i4.R((c.d) p11, aVar, aVar2, aVar4, aVar5, lVar, lVar2, lVar2, composer, 0);
                composer.endReplaceGroup();
            } else if (p11 instanceof c.f) {
                composer.startReplaceGroup(-1487339259);
                i4.H((c.f) p11, aVar, aVar2, aVar3, aVar4, composer, 0);
                composer.endReplaceGroup();
            } else if (p11 instanceof c.C0313c) {
                composer.startReplaceGroup(-1487332705);
                i4.F((c.C0313c) p11, aVar, aVar2, aVar3, aVar4, composer, 0);
                composer.endReplaceGroup();
            } else if (p11 instanceof c.b) {
                composer.startReplaceGroup(-1487326201);
                i4.D((c.b) p11, aVar, aVar2, aVar3, aVar4, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(p11 instanceof c.a)) {
                    composer.startReplaceGroup(-1487357882);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1487319580);
                i4.z((c.a) p11, aVar, aVar4, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final c p(State<? extends c> state) {
        return state.getValue();
    }

    public static final yz.g2 q(LearnCardView learnCardView) {
        learnCardView.getOldVM().g0();
        return yz.g2.f100423a;
    }

    public static final yz.g2 r(LearnCardView learnCardView) {
        learnCardView.getOldVM().C();
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(LearnCardView learnCardView) {
        Pair<BookRecord, Integer> a02 = learnCardView.getOldVM().a0();
        if (a02 != null) {
            Context context = learnCardView.getContext();
            kotlin.jvm.internal.g0.o(context, "getContext(...)");
            Context unWrapHiltContext = HiltContextUtilsKt.unWrapHiltContext(context);
            kotlin.jvm.internal.g0.n(unWrapHiltContext, "null cannot be cast to non-null type android.app.Activity");
            ShowOffActivity.Q0((Activity) unWrapHiltContext, a02.getFirst().bookName, a02.getFirst().wordCount, a02.getSecond().intValue(), a02.getFirst().bookId);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 t(LearnCardView learnCardView) {
        Context context = learnCardView.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        WordListActivity.q1(HiltContextUtilsKt.unWrapHiltContext(context));
        return yz.g2.f100423a;
    }

    public static final yz.g2 u(LearnCardView learnCardView) {
        learnCardView.getOldVM().G0();
        return yz.g2.f100423a;
    }

    public static final yz.g2 v(LearnCardView learnCardView, th.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        i.a aVar = tj.i.f90704f;
        Context context = learnCardView.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        Context unWrapHiltContext = HiltContextUtilsKt.unWrapHiltContext(context);
        kotlin.jvm.internal.g0.o(unWrapHiltContext, "unWrapHiltContext(...)");
        aVar.e(unWrapHiltContext, com.baicizhan.main.rx.a.a(it), 0);
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(LearnCardView learnCardView, ExamVM examVM, b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        Context context = learnCardView.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        Context unWrapHiltContext = HiltContextUtilsKt.unWrapHiltContext(context);
        kotlin.jvm.internal.g0.o(unWrapHiltContext, "unWrapHiltContext(...)");
        learnCardView.z(unWrapHiltContext, it, examVM);
        x4.b(it);
        return yz.g2.f100423a;
    }

    public static final yz.g2 x(LearnCardView learnCardView, int i11, Composer composer, int i12) {
        learnCardView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    private final void y(Context context, String str) {
        new BczWebDirector.Builder().setDefaultUrl(str).setWebWorker(new BczWebWorker()).build().goToWeb(context);
        D();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1491742159);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1491742159, i12, -1, "com.baicizhan.main.home.plan.newexam.LearnCardView.Content (LearnCardView.kt:62)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1288697181, true, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.m4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 o11;
                    o11 = LearnCardView.o(LearnCardView.this, (Composer) obj, ((Integer) obj2).intValue());
                    return o11;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.n4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 x11;
                    x11 = LearnCardView.x(LearnCardView.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return x11;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(final android.app.Activity r18, final x00.a<yz.g2> r19, final com.baicizhan.main.home.plan.newexam.ExamVM r20) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.newexam.LearnCardView.E(android.app.Activity, x00.a, com.baicizhan.main.home.plan.newexam.ExamVM):void");
    }

    @m80.k
    public final og.t getOldVM() {
        og.t tVar = this.f22562a;
        if (tVar != null) {
            return tVar;
        }
        kotlin.jvm.internal.g0.S("oldVM");
        return null;
    }

    public final void setOldVM(@m80.k og.t tVar) {
        kotlin.jvm.internal.g0.p(tVar, "<set-?>");
        this.f22562a = tVar;
    }

    public final void z(final Context context, b bVar, ExamVM examVM) {
        final a g11 = bVar.g();
        if (g11 instanceof a.C0312a) {
            qb.c.i(x4.f22861a, bVar.toString(), new Object[0]);
            return;
        }
        if (g11 instanceof a.b) {
            Context unWrapHiltContext = HiltContextUtilsKt.unWrapHiltContext(context);
            kotlin.jvm.internal.g0.o(unWrapHiltContext, "unWrapHiltContext(...)");
            y(unWrapHiltContext, ((a.b) g11).d());
            return;
        }
        if (g11 instanceof a.c) {
            Context unWrapHiltContext2 = HiltContextUtilsKt.unWrapHiltContext(context);
            FragmentActivity fragmentActivity = unWrapHiltContext2 instanceof FragmentActivity ? (FragmentActivity) unWrapHiltContext2 : null;
            if (fragmentActivity != null) {
                mc.a.j(fragmentActivity, "study_hint_dialog", null, new x00.l() { // from class: com.baicizhan.main.home.plan.newexam.j4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 A;
                        A = LearnCardView.A(a.this, (u.a) obj);
                        return A;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (!(g11 instanceof a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        Context unWrapHiltContext3 = HiltContextUtilsKt.unWrapHiltContext(context);
        FragmentActivity fragmentActivity2 = unWrapHiltContext3 instanceof FragmentActivity ? (FragmentActivity) unWrapHiltContext3 : null;
        if (fragmentActivity2 != null) {
            E(fragmentActivity2, new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.o4
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 C;
                    C = LearnCardView.C(LearnCardView.this, context, g11);
                    return C;
                }
            }, examVM);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public LearnCardView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public LearnCardView(@m80.k Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public /* synthetic */ LearnCardView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
