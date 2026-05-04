package androidx.compose.ui.tooling;

import a00.h0;
import a00.i0;
import a00.m0;
import a00.r0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.unit.IntRect;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.k0;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n766#2:643\n857#2,2:644\n1549#2:646\n1620#2,3:647\n1549#2:650\n1620#2,3:651\n1549#2:654\n1620#2,3:655\n1549#2:658\n1620#2,3:659\n1360#2:662\n1446#2,2:663\n1603#2,9:665\n1855#2:674\n1856#2:676\n1612#2:677\n1448#2,3:678\n1747#2,3:681\n1360#2:685\n1446#2,5:686\n1855#2,2:691\n1#3:675\n1#3:684\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n*L\n238#1:643\n238#1:644,2\n238#1:646\n238#1:647,3\n253#1:650\n253#1:651,3\n289#1:654\n289#1:655,3\n304#1:658\n304#1:659,3\n307#1:662\n307#1:663,2\n315#1:665,9\n315#1:674\n315#1:676\n315#1:677\n307#1:678,3\n326#1:681,3\n381#1:685\n381#1:686,5\n382#1:691,2\n315#1:675\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposeViewAdapter extends FrameLayout {
    public static final int $stable = 8;

    @k
    private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 FakeActivityResultRegistryOwner;

    @k
    private final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 FakeOnBackPressedDispatcherOwner;

    @SuppressLint({"VisibleForTests"})
    @k
    private final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 FakeSavedStateRegistryOwner;

    @k
    private final ComposeViewAdapter$FakeViewModelStoreOwner$1 FakeViewModelStoreOwner;

    @k
    private final String TAG;
    public PreviewAnimationClock clock;

    @k
    private String composableName;

    @k
    private final ComposeView composeView;

    @l
    private Composition composition;

    @k
    private final MutableState<p<Composer, Integer, g2>> content;

    @k
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;

    @k
    private final ThreadSafeException delayedException;

    @k
    private List<String> designInfoList;

    @k
    private String designInfoProvidersArgument;
    private boolean forceCompositionInvalidation;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;

    @k
    private a<g2> onDraw;

    @k
    private p<? super Composer, ? super Integer, g2> previewComposition;

    @k
    private final CompositionDataRecord slotTableRecord;
    private boolean stitchTrees;

    @k
    private List<ViewInfo> viewInfos;

    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
        p pVar;
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = h0.J();
        this.designInfoList = h0.J();
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m5034getLambda2$ui_tooling_release();
        pVar = ComposeViewAdapter_androidKt.emptyContent;
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(pVar, null, 2, null);
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m2563toArgb8_81llA(Color.Companion.m2543getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            public LifecycleRegistry getLifecycle() {
                ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1;
                composeViewAdapter$FakeSavedStateRegistryOwner$1 = ComposeViewAdapter.this.FakeSavedStateRegistryOwner;
                return composeViewAdapter$FakeSavedStateRegistryOwner$1.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i11, ActivityResultContract<I, O> activityResultContract, I i12, ActivityOptionsCompat activityOptionsCompat) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void WrapPreview(final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(522143116);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(522143116, i12, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:402)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalFontLoader().provides(new LayoutlibFontResourceLoader(getContext())), CompositionLocalsKt.getLocalFontFamilyResolver().provides(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext())), LocalOnBackPressedDispatcherOwner.INSTANCE.provides(this.FakeOnBackPressedDispatcherOwner), LocalActivityResultRegistryOwner.INSTANCE.provides(this.FakeActivityResultRegistryOwner)}, ComposableLambdaKt.rememberComposableLambda(-1475548980, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                @Composable
                public final void invoke(Composer composer2, int i13) {
                    CompositionDataRecord compositionDataRecord;
                    if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1475548980, i13, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:413)");
                    }
                    compositionDataRecord = ComposeViewAdapter.this.slotTableRecord;
                    InspectableKt.Inspectable(compositionDataRecord, pVar, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposeViewAdapter.this.WrapPreview(pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private final void findAndTrackAnimations() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(i0.d0(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((CompositionData) it.next()));
        }
        boolean z11 = this.clock != null;
        AnimationSearch animationSearch = new AnimationSearch(new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackAnimations$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((ComposeViewAdapter) this.receiver).getClock$ui_tooling_release();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((ComposeViewAdapter) this.receiver).setClock$ui_tooling_release((PreviewAnimationClock) obj);
            }
        }, new ComposeViewAdapter$findAndTrackAnimations$2(this));
        boolean searchAny = animationSearch.searchAny(arrayList);
        this.hasAnimations = searchAny;
        if (z11 && searchAny) {
            animationSearch.attachAllAnimations(arrayList);
        }
    }

    private final void findDesignInfoProviders() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(i0.d0(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((CompositionData) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<Group> findAll = PreviewUtils_androidKt.findAll((Group) it2.next(), new x00.l<Group, Boolean>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1
                {
                    super(1);
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
                
                    if (r0 == false) goto L6;
                 */
                @Override // x00.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean invoke(androidx.compose.ui.tooling.data.Group r5) {
                    /*
                        r4 = this;
                        java.lang.String r0 = r5.getName()
                        java.lang.String r1 = "remember"
                        boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                        if (r0 != 0) goto L14
                        androidx.compose.ui.tooling.ComposeViewAdapter r0 = androidx.compose.ui.tooling.ComposeViewAdapter.this
                        boolean r0 = androidx.compose.ui.tooling.ComposeViewAdapter.access$hasDesignInfo(r0, r5)
                        if (r0 != 0) goto L4a
                    L14:
                        java.util.Collection r5 = r5.getChildren()
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        androidx.compose.ui.tooling.ComposeViewAdapter r0 = androidx.compose.ui.tooling.ComposeViewAdapter.this
                        boolean r2 = r5 instanceof java.util.Collection
                        if (r2 == 0) goto L2a
                        r2 = r5
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 == 0) goto L2a
                        goto L4c
                    L2a:
                        java.util.Iterator r5 = r5.iterator()
                    L2e:
                        boolean r2 = r5.hasNext()
                        if (r2 == 0) goto L4c
                        java.lang.Object r2 = r5.next()
                        androidx.compose.ui.tooling.data.Group r2 = (androidx.compose.ui.tooling.data.Group) r2
                        java.lang.String r3 = r2.getName()
                        boolean r3 = kotlin.jvm.internal.g0.g(r3, r1)
                        if (r3 == 0) goto L2e
                        boolean r2 = androidx.compose.ui.tooling.ComposeViewAdapter.access$hasDesignInfo(r0, r2)
                        if (r2 == 0) goto L2e
                    L4a:
                        r5 = 1
                        goto L4d
                    L4c:
                        r5 = 0
                    L4d:
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1.invoke(androidx.compose.ui.tooling.data.Group):java.lang.Boolean");
                }
            });
            ArrayList arrayList3 = new ArrayList();
            for (Group group : findAll) {
                String designInfoOrNull = getDesignInfoOrNull(group, group.getBox());
                if (designInfoOrNull == null) {
                    Iterator<T> it3 = group.getChildren().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            designInfoOrNull = null;
                            break;
                        }
                        String designInfoOrNull2 = getDesignInfoOrNull((Group) it3.next(), group.getBox());
                        if (designInfoOrNull2 != null) {
                            designInfoOrNull = designInfoOrNull2;
                            break;
                        }
                    }
                }
                if (designInfoOrNull != null) {
                    arrayList3.add(designInfoOrNull);
                }
            }
            m0.s0(arrayList2, arrayList3);
        }
        this.designInfoList = arrayList2;
    }

    private final Method getDesignInfoMethodOrNull(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Class cls2 = Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String getDesignInfoOrNull(Group group, IntRect intRect) {
        String str;
        Iterator<T> it = group.getData().iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                str = invokeGetDesignInfo(next, intRect.getLeft(), intRect.getRight());
            }
        } while (str == null);
        return str;
    }

    private final String getFileName(Group group) {
        String sourceFile;
        SourceLocation location = group.getLocation();
        return (location == null || (sourceFile = location.getSourceFile()) == null) ? "" : sourceFile;
    }

    private final int getLineNumber(Group group) {
        SourceLocation location = group.getLocation();
        if (location != null) {
            return location.getLineNumber();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasDesignInfo(Group group) {
        Collection<Object> data = group.getData();
        if ((data instanceof Collection) && data.isEmpty()) {
            return false;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? getDesignInfoMethodOrNull(next) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasNullSourcePosition(Group group) {
        return getFileName(group).length() == 0 && getLineNumber(group) == -1;
    }

    private final void init(AttributeSet attributeSet) {
        long j11;
        ViewTreeLifecycleOwner.set(this, this.FakeSavedStateRegistryOwner);
        ViewTreeSavedStateRegistryOwner.set(this, this.FakeSavedStateRegistryOwner);
        ViewTreeViewModelStoreOwner.set(this, this.FakeViewModelStoreOwner);
        addView(this.composeView);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        String X5 = k0.X5(attributeValue, '.', null, 2, null);
        String P5 = k0.P5(attributeValue, '.', null, 2, null);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass = attributeValue2 != null ? PreviewUtils_androidKt.asPreviewProviderClass(attributeValue2) : null;
        try {
            j11 = Long.parseLong(attributeSet.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        } catch (Exception unused) {
            j11 = -1;
        }
        init$ui_tooling_release$default(this, X5, P5, asPreviewProviderClass, attributeIntValue, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j11, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attributeSet.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, 3072, null);
    }

    public static /* synthetic */ void init$ui_tooling_release$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i11, boolean z11, boolean z12, long j11, boolean z13, boolean z14, String str3, a aVar, a aVar2, int i12, Object obj) {
        composeViewAdapter.init$ui_tooling_release(str, str2, (i12 & 4) != 0 ? null : cls, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? -1L : j11, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? false : z14, (i12 & 512) != 0 ? null : str3, (i12 & 1024) != 0 ? new a<g2>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }
        } : aVar, (i12 & 2048) != 0 ? new a<g2>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }
        } : aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidateComposition() {
        this.content.setValue(ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m5035getLambda3$ui_tooling_release());
        this.content.setValue(this.previewComposition);
        invalidate();
    }

    private final String invokeGetDesignInfo(Object obj, int i11, int i12) {
        Method designInfoMethodOrNull = getDesignInfoMethodOrNull(obj);
        if (designInfoMethodOrNull == null) {
            return null;
        }
        try {
            Object invoke = designInfoMethodOrNull.invoke(obj, Integer.valueOf(i11), Integer.valueOf(i12), this.designInfoProvidersArgument);
            g0.n(invoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) invoke;
            if (str.length() == 0) {
                return null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    private final boolean isNullGroup(Group group) {
        if (!hasNullSourcePosition(group) || !group.getChildren().isEmpty()) {
            return false;
        }
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        return (node instanceof LayoutInfo ? (LayoutInfo) node : null) == null;
    }

    private final void processViewInfos() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(i0.d0(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(toViewInfo(SlotTreeKt.asTree((CompositionData) it.next())));
        }
        List<ViewInfo> a62 = r0.a6(arrayList);
        if (this.stitchTrees) {
            a62 = ShadowViewInfo_androidKt.stitchTrees(a62);
        }
        this.viewInfos = a62;
        if (this.debugViewInfos) {
            Log.d(this.TAG, ViewInfoUtil_androidKt.toDebugString$default(a62, 0, null, 3, null));
        }
    }

    private final ViewInfo toViewInfo(Group group) {
        String str;
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (group.getChildren().size() == 1 && hasNullSourcePosition(group) && layoutInfo == null) {
            return toViewInfo((Group) r0.k5(group.getChildren()));
        }
        Collection<Group> children = group.getChildren();
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            if (!isNullGroup((Group) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toViewInfo((Group) it.next()));
        }
        SourceLocation location = group.getLocation();
        if (location == null || (str = location.getSourceFile()) == null) {
            str = "";
        }
        String str2 = str;
        SourceLocation location2 = group.getLocation();
        return new ViewInfo(str2, location2 != null ? location2.getLineNumber() : -1, group.getBox(), group.getLocation(), arrayList2, layoutInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@k Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.forceCompositionInvalidation) {
            invalidateComposition();
        }
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            List<ViewInfo> list = this.viewInfos;
            ArrayList<ViewInfo> arrayList = new ArrayList();
            for (ViewInfo viewInfo : list) {
                m0.s0(arrayList, r0.I4(a00.g0.l(viewInfo), viewInfo.allChildren()));
            }
            for (ViewInfo viewInfo2 : arrayList) {
                if (viewInfo2.hasBounds()) {
                    canvas.drawRect(new Rect(viewInfo2.getBounds().getLeft(), viewInfo2.getBounds().getTop(), viewInfo2.getBounds().getRight(), viewInfo2.getBounds().getBottom()), this.debugBoundsPaint);
                }
            }
        }
    }

    public final void dispose$ui_tooling_release() {
        this.composeView.disposeComposition();
        if (this.clock != null) {
            getClock$ui_tooling_release().dispose();
        }
        this.FakeSavedStateRegistryOwner.getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        this.FakeViewModelStoreOwner.getViewModelStore().clear();
    }

    @k
    public final PreviewAnimationClock getClock$ui_tooling_release() {
        PreviewAnimationClock previewAnimationClock = this.clock;
        if (previewAnimationClock != null) {
            return previewAnimationClock;
        }
        g0.S("clock");
        return null;
    }

    @k
    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    public final boolean getStitchTrees$ui_tooling_release() {
        return this.stitchTrees;
    }

    @k
    public final List<ViewInfo> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    public final boolean hasAnimations() {
        return this.hasAnimations;
    }

    @VisibleForTesting
    public final void init$ui_tooling_release(@k final String str, @k final String str2, @l final Class<? extends PreviewParameterProvider<?>> cls, final int i11, boolean z11, boolean z12, final long j11, boolean z13, boolean z14, @l String str3, @k final a<g2> aVar, @k a<g2> aVar2) {
        this.debugPaintBounds = z11;
        this.debugViewInfos = z12;
        this.composableName = str2;
        this.forceCompositionInvalidation = z13;
        this.lookForDesignInfoProviders = z14;
        if (str3 == null) {
            str3 = "";
        }
        this.designInfoProvidersArgument = str3;
        this.onDraw = aVar2;
        ComposableLambda composableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-2046245106, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Composer composer, int i12) {
                if (!composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2046245106, i12, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:466)");
                }
                EffectsKt.SideEffect(aVar, composer, 0);
                final ComposeViewAdapter composeViewAdapter = this;
                final String str4 = str;
                final String str5 = str2;
                final Class<? extends PreviewParameterProvider<?>> cls2 = cls;
                final int i13 = i11;
                final long j12 = j11;
                composeViewAdapter.WrapPreview(ComposableLambdaKt.rememberComposableLambda(320194433, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return g2.f100423a;
                    }

                    @Composable
                    public final void invoke(Composer composer2, int i14) {
                        final Composer composer3;
                        if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(320194433, i14, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:469)");
                        }
                        boolean changed = composer2.changed(str4) | composer2.changed(str5) | composer2.changedInstance(composer2) | composer2.changedInstance(cls2) | composer2.changed(i13) | composer2.changedInstance(composeViewAdapter);
                        final String str6 = str4;
                        final String str7 = str5;
                        final Class<? extends PreviewParameterProvider<?>> cls3 = cls2;
                        final int i15 = i13;
                        final ComposeViewAdapter composeViewAdapter2 = composeViewAdapter;
                        Object rememberedValue = composer2.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            composer3 = composer2;
                            rememberedValue = new a<g2>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$composable$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // x00.a
                                public /* bridge */ /* synthetic */ g2 invoke() {
                                    invoke2();
                                    return g2.f100423a;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    ThreadSafeException threadSafeException;
                                    Throwable cause;
                                    try {
                                        ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
                                        String str8 = str6;
                                        String str9 = str7;
                                        Composer composer4 = composer3;
                                        Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(cls3, i15);
                                        composableInvoker.invokeComposable(str8, str9, composer4, Arrays.copyOf(previewProviderParameters, previewProviderParameters.length));
                                    } catch (Throwable th2) {
                                        Throwable th3 = th2;
                                        while ((th3 instanceof ReflectiveOperationException) && (cause = th3.getCause()) != null) {
                                            th3 = cause;
                                        }
                                        threadSafeException = composeViewAdapter2.delayedException;
                                        threadSafeException.set(th3);
                                        throw th2;
                                    }
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue);
                        } else {
                            composer3 = composer2;
                        }
                        a aVar3 = (a) rememberedValue;
                        if (j12 >= 0) {
                            composer3.startReplaceGroup(-967474306);
                            ComposeViewAdapter composeViewAdapter3 = composeViewAdapter;
                            boolean changedInstance = composer3.changedInstance(composeViewAdapter3);
                            final ComposeViewAdapter composeViewAdapter4 = composeViewAdapter;
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new a<g2>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // x00.a
                                    public /* bridge */ /* synthetic */ g2 invoke() {
                                        invoke2();
                                        return g2.f100423a;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        View childAt = ComposeViewAdapter.this.getChildAt(0);
                                        g0.n(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                                        KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
                                        ViewRootForTest viewRootForTest = childAt2 instanceof ViewRootForTest ? (ViewRootForTest) childAt2 : null;
                                        if (viewRootForTest != null) {
                                            viewRootForTest.invalidateDescendants();
                                        }
                                        Snapshot.Companion.sendApplyNotifications();
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            composeViewAdapter3.setClock$ui_tooling_release(new PreviewAnimationClock((a) rememberedValue2));
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-966247109);
                            composer3.endReplaceGroup();
                        }
                        aVar3.invoke();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        this.previewComposition = composableLambdaInstance;
        this.composeView.setContent(composableLambdaInstance);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ViewTreeLifecycleOwner.set(this.composeView.getRootView(), this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.delayedException.throwIfPresent();
        processViewInfos();
        if (this.composableName.length() > 0) {
            findAndTrackAnimations();
            if (this.lookForDesignInfoProviders) {
                findDesignInfoProviders();
            }
        }
    }

    public final void setClock$ui_tooling_release(@k PreviewAnimationClock previewAnimationClock) {
        this.clock = previewAnimationClock;
    }

    public final void setDesignInfoList$ui_tooling_release(@k List<String> list) {
        this.designInfoList = list;
    }

    public final void setStitchTrees$ui_tooling_release(boolean z11) {
        this.stitchTrees = z11;
    }

    public final void setViewInfos$ui_tooling_release(@k List<ViewInfo> list) {
        this.viewInfos = list;
    }

    @VisibleForTesting
    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(@k Context context, @k AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p pVar;
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = h0.J();
        this.designInfoList = h0.J();
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m5034getLambda2$ui_tooling_release();
        pVar = ComposeViewAdapter_androidKt.emptyContent;
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(pVar, null, 2, null);
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m2563toArgb8_81llA(Color.Companion.m2543getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            public LifecycleRegistry getLifecycle() {
                ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1;
                composeViewAdapter$FakeSavedStateRegistryOwner$1 = ComposeViewAdapter.this.FakeSavedStateRegistryOwner;
                return composeViewAdapter$FakeSavedStateRegistryOwner$1.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i112, ActivityResultContract<I, O> activityResultContract, I i12, ActivityOptionsCompat activityOptionsCompat) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }
}
