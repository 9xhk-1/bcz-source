package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import yz.g2;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 11 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 12 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 15 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 16 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 17 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 18 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 19 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 20 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 21 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/ProcessResult\n+ 22 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 23 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 24 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 25 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/LazyWindowInfo\n+ 26 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,3106:1\n1662#1,4:3228\n1662#1,4:3232\n76#2,7:3107\n56#2,5:3128\n76#2,7:3269\n76#2,7:3280\n32#3:3114\n32#3:3240\n80#4:3115\n80#4:3241\n53#4,3:3309\n60#4:3313\n70#4:3316\n60#4:3319\n70#4:3322\n53#4,3:3324\n60#4:3328\n70#4:3331\n60#4:3333\n70#4:3336\n53#4,3:3339\n53#4,3:3343\n53#4,3:3347\n60#4:3351\n70#4:3354\n53#4,3:3356\n1516#5:3116\n85#6:3117\n113#6,2:3118\n85#6:3199\n113#6,2:3200\n85#6:3202\n85#6:3203\n113#6,2:3204\n85#6:3206\n113#6,2:3207\n95#7:3120\n308#8,6:3121\n179#8:3127\n180#8:3133\n181#8,3:3137\n184#8,6:3141\n314#8:3147\n437#8,6:3148\n447#8,2:3155\n449#8,17:3160\n466#8,8:3180\n315#8:3188\n190#8,8:3189\n316#8:3197\n1101#9:3134\n1083#9,2:3135\n519#10:3140\n423#10,9:3248\n423#10,9:3258\n246#11:3154\n240#12,3:3157\n243#12,3:3177\n1#13:3198\n1#13:3360\n26#14:3209\n26#14:3210\n26#14:3211\n26#14:3212\n22#14:3314\n22#14:3317\n22#14:3320\n22#14:3329\n22#14:3334\n22#14:3337\n22#14:3352\n919#15,2:3213\n919#15,2:3276\n919#15,2:3278\n924#15,2:3289\n924#15,2:3291\n26#16,5:3215\n26#16,5:3220\n26#16,3:3225\n30#16:3236\n26#16,5:3296\n61#17,3:3237\n41#18,5:3242\n207#19:3247\n207#19:3257\n20#20,2:3267\n20#20,2:3287\n241#21:3293\n244#21:3294\n241#21:3295\n241#21:3307\n241#21:3362\n212#22,6:3301\n30#23:3308\n30#23:3323\n30#23:3338\n30#23:3342\n30#23:3346\n30#23:3355\n65#24:3312\n69#24:3315\n65#24:3318\n69#24:3321\n65#24:3327\n69#24:3330\n65#24:3332\n69#24:3335\n65#24:3350\n69#24:3353\n58#25:3359\n59#25:3361\n139#26:3363\n139#26:3364\n139#26:3365\n139#26:3366\n139#26:3367\n139#26:3368\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n1630#1:3228,4\n1631#1:3232,4\n593#1:3107,7\n315#1:3128,5\n2037#1:3269,7\n2058#1:3280,7\n666#1:3114\n1713#1:3240\n666#1:3115\n1713#1:3241\n2395#1:3309,3\n2397#1:3313\n2398#1:3316\n2456#1:3319\n2456#1:3322\n2456#1:3324,3\n2462#1:3328\n2462#1:3331\n2467#1:3333\n2468#1:3336\n2469#1:3339,3\n2490#1:3343,3\n2503#1:3347,3\n2506#1:3351\n2506#1:3354\n2506#1:3356,3\n832#1:3116\n261#1:3117\n261#1:3118,2\n687#1:3199\n687#1:3200,2\n696#1:3202\n760#1:3203\n760#1:3204,2\n772#1:3206\n772#1:3207,2\n315#1:3120\n315#1:3121,6\n315#1:3127\n315#1:3133\n315#1:3137,3\n315#1:3141,6\n315#1:3147\n315#1:3148,6\n315#1:3155,2\n315#1:3160,17\n315#1:3180,8\n315#1:3188\n315#1:3189,8\n315#1:3197\n315#1:3134\n315#1:3135,2\n315#1:3140\n1970#1:3248,9\n1976#1:3258,9\n315#1:3154\n315#1:3157,3\n315#1:3177,3\n2515#1:3360\n943#1:3209\n944#1:3210\n945#1:3211\n946#1:3212\n2397#1:3314\n2398#1:3317\n2456#1:3320\n2462#1:3329\n2467#1:3334\n2468#1:3337\n2506#1:3352\n1292#1:3213,2\n2048#1:3276,2\n2049#1:3278,2\n2076#1:3289,2\n2077#1:3291,2\n1539#1:3215,5\n1552#1:3220,5\n1626#1:3225,3\n1626#1:3236\n2204#1:3296,5\n1705#1:3237,3\n1887#1:3242,5\n1970#1:3247\n1976#1:3257\n1991#1:3267,2\n2063#1:3287,2\n2140#1:3293\n2174#1:3294\n2178#1:3295\n2355#1:3307\n2613#1:3362\n2346#1:3301,6\n2395#1:3308\n2456#1:3323\n2469#1:3338\n2490#1:3342\n2503#1:3346\n2506#1:3355\n2397#1:3312\n2398#1:3315\n2456#1:3318\n2456#1:3321\n2462#1:3327\n2462#1:3330\n2467#1:3332\n2468#1:3335\n2506#1:3350\n2506#1:3353\n2515#1:3359\n2515#1:3361\n2618#1:3363\n2619#1:3364\n2620#1:3365\n2621#1:3366\n2627#1:3367\n2628#1:3368\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver {

    @m80.l
    private static Method getBooleanMethod;

    @m80.l
    private static Class<?> systemPropertiesClass;

    @m80.l
    private AndroidViewsHandler _androidViewsHandler;

    @m80.l
    private final AndroidAutofill _autofill;

    @m80.l
    private final AndroidAutofillManager _autofillManager;

    @m80.k
    private final InputModeManagerImpl _inputModeManager;

    @m80.k
    private final MutableState _viewTreeOwners$delegate;

    @m80.k
    private final LazyWindowInfo _windowInfo;

    @m80.k
    private final AndroidAccessibilityManager accessibilityManager;

    @m80.k
    private final AutofillTree autofillTree;

    @m80.k
    private final AndroidComposeView$bringIntoViewNode$1 bringIntoViewNode;

    @m80.k
    private final CanvasHolder canvasHolder;

    @m80.k
    private final AndroidClipboard clipboard;

    @m80.k
    private final AndroidClipboardManager clipboardManager;

    @m80.k
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;

    @m80.k
    private x00.l<? super Configuration, g2> configurationChangeObserver;

    @m80.k
    private AndroidContentCaptureManager contentCaptureManager;

    @m80.k
    private kotlin.coroutines.d coroutineContext;
    private int currentFontWeightAdjustment;

    @m80.k
    private final MutableState density$delegate;

    @m80.k
    private final List<OwnedLayer> dirtyLayers;

    @m80.k
    private final AndroidDragAndDropManager dragAndDropManager;

    @m80.k
    private final MutableObjectList<x00.a<g2>> endApplyChangesListeners;

    @m80.k
    private final FocusOwner focusOwner;

    @m80.k
    private final MutableState fontFamilyResolver$delegate;

    @m80.k
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;

    @m80.k
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;

    @m80.k
    private final GraphicsContext graphicsContext;

    @m80.k
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;

    @m80.k
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;

    @m80.k
    private final WeakCache<OwnedLayer> layerCache;

    @m80.k
    private final MutableState layoutDirection$delegate;

    @m80.k
    private final MutableIntObjectMap<LayoutNode> layoutNodes;

    @m80.k
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;

    @m80.k
    private final CalculateMatrixToWindow matrixToWindow;

    @m80.k
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;

    @m80.k
    private final ModifierLocalManager modifierLocalManager;

    @m80.k
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;

    @m80.l
    private Constraints onMeasureConstraints;

    @m80.l
    private x00.l<? super ViewTreeOwners, g2> onViewTreeOwnersAvailable;

    @m80.k
    private final PointerIconService pointerIconService;

    @m80.k
    private final PointerInputEventProcessor pointerInputEventProcessor;

    @m80.l
    private List<OwnedLayer> postponedDirtyLayers;

    @m80.l
    private MotionEvent previousMotionEvent;
    private boolean processingRequestFocusForNextNonChildView;

    @m80.k
    private final RectManager rectManager;
    private long relayoutTime;

    @m80.k
    private final x00.a<g2> resendMotionEventOnLayout;

    @m80.k
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;

    @m80.k
    private final LayoutNode root;

    @m80.k
    private final RootForTest rootForTest;

    @m80.k
    private final EmptySemanticsModifier rootSemanticsNode;

    @m80.k
    private final Modifier rotaryInputModifier;

    @m80.l
    private final ScrollCapture scrollCapture;

    @m80.k
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;

    @m80.k
    private final EmptySemanticsElement semanticsModifier;

    @m80.k
    private final SemanticsOwner semanticsOwner;

    @m80.k
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;

    @m80.k
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;

    @m80.k
    private final OwnerSnapshotObserver snapshotObserver;

    @m80.k
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;

    @m80.k
    private final TextInputService textInputService;

    @m80.k
    private final AtomicReference<SessionMutex.Session<Object>> textInputSessionMutex;

    @m80.k
    private final TextToolbar textToolbar;

    @m80.k
    private final float[] tmpMatrix;

    @m80.k
    private final int[] tmpPositionArray;

    @m80.k
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;

    @m80.k
    private final ViewConfiguration viewConfiguration;

    @m80.l
    private DrawChildContainer viewLayersContainer;

    @m80.k
    private final float[] viewToWindowMatrix;

    @m80.k
    private final State viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;

    @m80.k
    private final float[] windowToViewMatrix;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class ViewTreeOwners {
        public static final int $stable = 8;

        @m80.k
        private final LifecycleOwner lifecycleOwner;

        @m80.k
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(@m80.k LifecycleOwner lifecycleOwner, @m80.k SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        @m80.k
        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @m80.k
        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.Modifier, androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1] */
    public AndroidComposeView(@m80.k Context context, @m80.k kotlin.coroutines.d dVar) {
        super(context);
        AndroidComposeView androidComposeView;
        AndroidAutofillManager androidAutofillManager;
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m2283getUnspecifiedF1C5BW0();
        int i11 = 1;
        this.superclassInitComplete = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.sharedDrawScope = new LayoutNodeDrawScope(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        this.density$delegate = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(context), SnapshotStateKt.referentialEqualityPolicy());
        EmptySemanticsModifier emptySemanticsModifier = new EmptySemanticsModifier();
        this.rootSemanticsNode = emptySemanticsModifier;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(emptySemanticsModifier);
        this.semanticsModifier = emptySemanticsElement;
        ?? r52 = new ModifierNodeElement<BringIntoViewOnScreenResponderNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return AndroidComposeView.this.hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("BringIntoViewOnScreen");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public BringIntoViewOnScreenResponderNode create() {
                return new BringIntoViewOnScreenResponderNode(AndroidComposeView.this);
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(BringIntoViewOnScreenResponderNode bringIntoViewOnScreenResponderNode) {
                bringIntoViewOnScreenResponderNode.setView(AndroidComposeView.this);
            }
        };
        this.bringIntoViewNode = r52;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this), new AndroidComposeView$focusOwner$2(this), new AndroidComposeView$focusOwner$3(this), new AndroidComposeView$focusOwner$4(this), new AndroidComposeView$focusOwner$5(this), new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$6
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((AndroidComposeView) this.receiver).setLayoutDirection((LayoutDirection) obj);
            }
        });
        this.coroutineContext = dVar;
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this._windowInfo = new LazyWindowInfo();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new x00.l<KeyEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m4232invokeZmokQxo(keyEvent.m3577unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m4232invokeZmokQxo(android.view.KeyEvent keyEvent) {
                Rect onFetchFocusRect;
                View findNextNonChildView;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                int[] iArr4;
                int[] iArr5;
                int[] iArr6;
                boolean m4223onMoveFocusInChildren3ESFkO8;
                final FocusDirection mo4178getFocusDirectionP8AzH3I = AndroidComposeView.this.mo4178getFocusDirectionP8AzH3I(keyEvent);
                if (mo4178getFocusDirectionP8AzH3I == null || !KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3585getKeyDownCS__XNY())) {
                    return Boolean.FALSE;
                }
                Integer m2164toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m2164toAndroidFocusDirection3ESFkO8(mo4178getFocusDirectionP8AzH3I.m2155unboximpl());
                if (ComposeUiFlags.isViewFocusFixEnabled && AndroidComposeView.this.hasFocus() && m2164toAndroidFocusDirection3ESFkO8 != null) {
                    m4223onMoveFocusInChildren3ESFkO8 = AndroidComposeView.this.m4223onMoveFocusInChildren3ESFkO8(mo4178getFocusDirectionP8AzH3I.m2155unboximpl());
                    if (m4223onMoveFocusInChildren3ESFkO8) {
                        return Boolean.TRUE;
                    }
                }
                onFetchFocusRect = AndroidComposeView.this.onFetchFocusRect();
                Boolean mo2170focusSearchULY8qGw = AndroidComposeView.this.getFocusOwner().mo2170focusSearchULY8qGw(mo4178getFocusDirectionP8AzH3I.m2155unboximpl(), onFetchFocusRect, new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.mo2183requestFocus3ESFkO8(FocusDirection.this.m2155unboximpl()));
                    }
                });
                if (mo2170focusSearchULY8qGw != null ? mo2170focusSearchULY8qGw.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!FocusOwnerImplKt.m2176is1dFocusSearch3ESFkO8(mo4178getFocusDirectionP8AzH3I.m2155unboximpl())) {
                    return Boolean.FALSE;
                }
                if (m2164toAndroidFocusDirection3ESFkO8 != null) {
                    findNextNonChildView = AndroidComposeView.this.findNextNonChildView(m2164toAndroidFocusDirection3ESFkO8.intValue());
                    if (kotlin.jvm.internal.g0.g(findNextNonChildView, AndroidComposeView.this)) {
                        findNextNonChildView = null;
                    }
                    if (findNextNonChildView != null) {
                        android.graphics.Rect androidRect = onFetchFocusRect != null ? RectHelper_androidKt.toAndroidRect(onFetchFocusRect) : null;
                        if (androidRect == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        iArr = AndroidComposeView.this.tmpPositionArray;
                        findNextNonChildView.getLocationInWindow(iArr);
                        iArr2 = AndroidComposeView.this.tmpPositionArray;
                        int i12 = iArr2[0];
                        iArr3 = AndroidComposeView.this.tmpPositionArray;
                        int i13 = iArr3[1];
                        AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                        iArr4 = androidComposeView2.tmpPositionArray;
                        androidComposeView2.getLocationInWindow(iArr4);
                        iArr5 = AndroidComposeView.this.tmpPositionArray;
                        int i14 = iArr5[0];
                        iArr6 = AndroidComposeView.this.tmpPositionArray;
                        androidRect.offset(i14 - i12, iArr6[1] - i13);
                        if (FocusInteropUtils_androidKt.requestInteropFocus(findNextNonChildView, m2164toAndroidFocusDirection3ESFkO8, androidRect)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!AndroidComposeView.this.getFocusOwner().mo2167clearFocusI7lrPNg(false, true, false, mo4178getFocusDirectionP8AzH3I.m2155unboximpl())) {
                    return Boolean.TRUE;
                }
                Boolean mo2170focusSearchULY8qGw2 = AndroidComposeView.this.getFocusOwner().mo2170focusSearchULY8qGw(mo4178getFocusDirectionP8AzH3I.m2155unboximpl(), null, new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1.1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.mo2183requestFocus3ESFkO8(FocusDirection.this.m2155unboximpl()));
                    }
                });
                return Boolean.valueOf(mo2170focusSearchULY8qGw2 != null ? mo2170focusSearchULY8qGw2.booleanValue() : true);
            }
        });
        this.keyInputModifier = onKeyEvent;
        Modifier onRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, new x00.l<RotaryScrollEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // x00.l
            public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
                return Boolean.FALSE;
            }
        });
        this.rotaryInputModifier = onRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        this.viewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        Object[] objArr4 = 0;
        LayoutNode layoutNode = new LayoutNode(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(getViewConfiguration());
        layoutNode.setModifier(companion2.then(emptySemanticsElement).then(onRotaryScrollEvent).then(onKeyEvent).then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()).then(r52));
        this.root = layoutNode;
        this.layoutNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.rectManager = new RectManager(getLayoutNodes());
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot(), emptySemanticsModifier, getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = new x00.l<Configuration, g2>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Configuration configuration) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Configuration configuration) {
                invoke2(configuration);
                return g2.f100423a;
            }
        };
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        if (autofillSupported()) {
            AutofillManager a11 = androidx.compose.ui.autofill.d.a(context.getSystemService(androidx.compose.ui.autofill.c.a()));
            if (a11 == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Autofill service could not be located.");
                throw new KotlinNothingValueException();
            }
            androidComposeView = this;
            androidAutofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(a11), getSemanticsOwner(), androidComposeView, getRectManager(), context.getPackageName());
        } else {
            androidComposeView = this;
            androidAutofillManager = null;
        }
        androidComposeView._autofillManager = androidAutofillManager;
        androidComposeView.clipboardManager = new AndroidClipboardManager(context);
        androidComposeView.clipboard = new AndroidClipboard(getClipboardManager());
        androidComposeView.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        androidComposeView.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        long j11 = Integer.MAX_VALUE;
        androidComposeView.globalPosition = IntOffset.m5237constructorimpl((j11 & 4294967295L) | (j11 << 32));
        androidComposeView.tmpPositionArray = new int[]{0, 0};
        float[] m2739constructorimpl$default = Matrix.m2739constructorimpl$default(null, 1, null);
        androidComposeView.tmpMatrix = m2739constructorimpl$default;
        androidComposeView.viewToWindowMatrix = Matrix.m2739constructorimpl$default(null, 1, null);
        androidComposeView.windowToViewMatrix = Matrix.m2739constructorimpl$default(null, 1, null);
        androidComposeView.lastMatrixRecalculationAnimationTime = -1L;
        androidComposeView.windowPosition = companion.m2282getInfiniteF1C5BW0();
        androidComposeView.isRenderNodeCompatible = true;
        androidComposeView._viewTreeOwners$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        androidComposeView.viewTreeOwners$delegate = SnapshotStateKt.derivedStateOf(new x00.a<ViewTreeOwners>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final AndroidComposeView.ViewTreeOwners invoke() {
                AndroidComposeView.ViewTreeOwners viewTreeOwners;
                viewTreeOwners = AndroidComposeView.this.get_viewTreeOwners();
                return viewTreeOwners;
            }
        });
        androidComposeView.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        androidComposeView.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        androidComposeView.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.d
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                AndroidComposeView.touchModeChangeListener$lambda$8(AndroidComposeView.this, z11);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        androidComposeView.legacyTextInputServiceAndroid = textInputServiceAndroid;
        androidComposeView.textInputService = new TextInputService(AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        androidComposeView.textInputSessionMutex = SessionMutex.m2088constructorimpl();
        androidComposeView.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        androidComposeView.fontLoader = new AndroidFontResourceLoader(context);
        androidComposeView.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        androidComposeView.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(context.getResources().getConfiguration());
        LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        androidComposeView.layoutDirection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection, null, 2, null);
        androidComposeView.hapticFeedBack = new PlatformHapticFeedback(this);
        androidComposeView._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.Companion.m3271getTouchaOaMEAU() : InputMode.Companion.m3270getKeyboardaOaMEAU(), new x00.l<InputMode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(InputMode inputMode) {
                return m4228invokeiuPiT84(inputMode.m3269unboximpl());
            }

            /* renamed from: invoke-iuPiT84, reason: not valid java name */
            public final Boolean m4228invokeiuPiT84(int i12) {
                InputMode.Companion companion3 = InputMode.Companion;
                return Boolean.valueOf(InputMode.m3266equalsimpl0(i12, companion3.m3271getTouchaOaMEAU()) ? AndroidComposeView.this.isInTouchMode() : InputMode.m3266equalsimpl0(i12, companion3.m3270getKeyboardaOaMEAU()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false);
            }
        }, objArr3 == true ? 1 : 0);
        androidComposeView.modifierLocalManager = new ModifierLocalManager(this);
        androidComposeView.textToolbar = new AndroidTextToolbar(this);
        androidComposeView.layerCache = new WeakCache<>();
        androidComposeView.endApplyChangesListeners = new MutableObjectList<>(objArr4 == true ? 1 : 0, i11, objArr2 == true ? 1 : 0);
        androidComposeView.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MotionEvent motionEvent;
                long j12;
                AndroidComposeView.this.removeCallbacks(this);
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z11 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z11) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i12 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i12 = 2;
                    }
                    AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                    j12 = androidComposeView2.relayoutTime;
                    androidComposeView2.sendSimulatedEvent(motionEvent, i12, j12, false);
                }
            }
        };
        androidComposeView.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.e
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.sendHoverExitEvent$lambda$10(AndroidComposeView.this);
            }
        };
        androidComposeView.resendMotionEventOnLayout = new x00.a<g2>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
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
                MotionEvent motionEvent;
                AndroidComposeView$resendMotionEventRunnable$1 androidComposeView$resendMotionEventRunnable$1;
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        AndroidComposeView.this.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                        androidComposeView$resendMotionEventRunnable$1 = androidComposeView2.resendMotionEventRunnable;
                        androidComposeView2.post(androidComposeView$resendMotionEventRunnable$1);
                    }
                }
            }
        };
        int i12 = Build.VERSION.SDK_INT;
        androidComposeView.matrixToWindow = i12 < 29 ? new CalculateMatrixToWindowApi21(m2739constructorimpl$default, objArr == true ? 1 : 0) : new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(androidComposeView.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        if (i12 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        x00.l<ViewRootForTest, g2> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        getRoot().attach$ui_release(this);
        if (i12 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        androidComposeView.scrollCapture = i12 >= 31 ? new ScrollCapture() : null;
        androidComposeView.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentMouseCursorIcon = PointerIcon.Companion.getDefault();
            private PointerIcon currentStylusHoverIcon;

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getIcon() {
                return this.currentMouseCursorIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getStylusHoverIcon() {
                return this.currentStylusHoverIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.currentMouseCursorIcon = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(AndroidComposeView.this, pointerIcon);
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setStylusHoverIcon(PointerIcon pointerIcon) {
                this.currentStylusHoverIcon = pointerIcon;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int orDefault;
        if (kotlin.jvm.internal.g0.g(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release())) {
            int orDefault2 = this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().getOrDefault(i11, -1);
            if (orDefault2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.g0.g(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal$ui_release()) || (orDefault = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().getOrDefault(i11, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, orDefault);
    }

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        return (parent$ui_release == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release()) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m4219component1VKZWuLQ(long j11) {
        return (int) w1.i(j11 >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m4220component2VKZWuLQ(long j11) {
        return (int) w1.i(j11 & 4294967295L);
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m4221convertMeasureSpecI7RO_PI(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return m4225packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m4225packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m4225packZIaKswc(size, size);
        }
        throw new IllegalStateException();
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int i11) {
        boolean containsDescendant;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view = this;
        while (view != null) {
            View rootView = getRootView();
            kotlin.jvm.internal.g0.n(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            view = focusFinder.findNextFocus((ViewGroup) rootView, view, i11);
            if (view != null) {
                containsDescendant = AndroidComposeView_androidKt.containsDescendant(this, view);
                if (!containsDescendant) {
                    return view;
                }
            }
        }
        return null;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i11, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.g0.g(declaredMethod.invoke(view, null), Integer.valueOf(i11))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i11, viewGroup.getChildAt(i12));
                    if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                        return findViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        int i11;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i11 = configuration.fontWeightAdjustment;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:90:0x003e, B:25:0x0089, B:27:0x0092, B:28:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00a3, B:35:0x00a9, B:37:0x00af, B:40:0x00b7, B:41:0x00bd, B:43:0x00c3, B:45:0x00c9, B:47:0x00cf, B:48:0x00d5, B:50:0x00d9, B:51:0x00dd, B:56:0x00f0, B:58:0x00f4, B:59:0x00fb, B:65:0x010b, B:66:0x0110, B:72:0x0115), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0069  */
    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m4222handleMotionEvent8iAsVTc(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.m4222handleMotionEvent8iAsVTc(android.view.MotionEvent):int");
    }

    private final boolean handleRotaryEvent(final MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f11 = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f11, f11 * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()), new x00.a<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                boolean dispatchGenericMotionEvent;
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent(motionEvent);
                return Boolean.valueOf(dispatchGenericMotionEvent);
            }
        });
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            invalidateLayers(layoutNodeArr[i11]);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            invalidateLayoutNodeMeasurement(layoutNodeArr[i11]);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z11 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z11) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i11 = 1; i11 < pointerCount; i11++) {
                z11 = (Float.floatToRawIntBits(motionEvent.getX(i11)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i11)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(motionEvent, i11));
                if (z11) {
                    break;
                }
            }
        }
        return z11;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        return 0.0f <= x11 && x11 <= ((float) getWidth()) && 0.0f <= y11 && y11 <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClearFocusForOwner() {
        if (isFocused() || (!ComposeUiFlags.isViewFocusFixEnabled && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect onFetchFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(findFocus, this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMoveFocusInChildren-3ESFkO8, reason: not valid java name */
    public final boolean m4223onMoveFocusInChildren3ESFkO8(int i11) {
        AndroidViewsHandler androidViewsHandler;
        View findNextFocusFromRect;
        if (!ComposeUiFlags.isViewFocusFixEnabled) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m2152equalsimpl0(i11, companion.m2157getEnterdhqQ8s()) || FocusDirection.m2152equalsimpl0(i11, companion.m2158getExitdhqQ8s())) {
                return false;
            }
            Integer m2164toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m2164toAndroidFocusDirection3ESFkO8(i11);
            if (m2164toAndroidFocusDirection3ESFkO8 == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int intValue = m2164toAndroidFocusDirection3ESFkO8.intValue();
            Rect onFetchFocusRect = onFetchFocusRect();
            r2 = onFetchFocusRect != null ? RectHelper_androidKt.toAndroidRect(onFetchFocusRect) : null;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View findNextFocus = r2 == null ? focusFinder.findNextFocus(this, findFocus(), intValue) : focusFinder.findNextFocusFromRect(this, r2, intValue);
            if (findNextFocus != null) {
                return FocusInteropUtils_androidKt.requestInteropFocus(findNextFocus, Integer.valueOf(intValue), r2);
            }
            return false;
        }
        FocusDirection.Companion companion2 = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion2.m2157getEnterdhqQ8s()) || FocusDirection.m2152equalsimpl0(i11, companion2.m2158getExitdhqQ8s()) || !hasFocus() || (androidViewsHandler = this._androidViewsHandler) == null) {
            return false;
        }
        Integer m2164toAndroidFocusDirection3ESFkO82 = FocusInteropUtils_androidKt.m2164toAndroidFocusDirection3ESFkO8(i11);
        if (m2164toAndroidFocusDirection3ESFkO82 == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int intValue2 = m2164toAndroidFocusDirection3ESFkO82.intValue();
        View rootView = getRootView();
        kotlin.jvm.internal.g0.n(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        View findFocus = viewGroup.findFocus();
        if (findFocus == null) {
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        FocusFinder focusFinder2 = FocusFinder.getInstance();
        if (FocusOwnerImplKt.m2176is1dFocusSearch3ESFkO8(i11) && androidViewsHandler.hasFocus()) {
            findNextFocusFromRect = Build.VERSION.SDK_INT >= 26 ? focusFinder2.findNextFocus(viewGroup, findFocus, intValue2) : FocusFinderCompat.Companion.getInstance().findNextFocus1d(viewGroup, findFocus, intValue2);
        } else {
            Rect onFetchFocusRect2 = onFetchFocusRect();
            r2 = onFetchFocusRect2 != null ? RectHelper_androidKt.toAndroidRect(onFetchFocusRect2) : null;
            findNextFocusFromRect = focusFinder2.findNextFocusFromRect(viewGroup, r2, intValue2);
            if (findNextFocusFromRect != null) {
                findNextFocusFromRect.getLocationInWindow(this.tmpPositionArray);
            }
            int[] iArr = this.tmpPositionArray;
            int i12 = iArr[0];
            int i13 = iArr[1];
            getLocationInWindow(iArr);
            if (r2 != null) {
                int[] iArr2 = this.tmpPositionArray;
                r2.offset(iArr2[0] - i12, iArr2[1] - i13);
            }
        }
        if (findNextFocusFromRect == null || findNextFocusFromRect == findFocus) {
            return false;
        }
        View focusedChild = androidViewsHandler.getFocusedChild();
        ViewParent parent = findNextFocusFromRect.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return FocusInteropUtils_androidKt.requestInteropFocus(findNextFocusFromRect, Integer.valueOf(intValue2), r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onRequestFocusForOwner-7o62pno, reason: not valid java name */
    public final boolean m4224onRequestFocusForOwner7o62pno(FocusDirection focusDirection, Rect rect) {
        Integer m2164toAndroidFocusDirection3ESFkO8;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (m2164toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m2164toAndroidFocusDirection3ESFkO8(focusDirection.m2155unboximpl())) == null) ? 130 : m2164toAndroidFocusDirection3ESFkO8.intValue(), rect != null ? RectHelper_androidKt.toAndroidRect(rect) : null);
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m4225packZIaKswc(int i11, int i12) {
        return w1.i(w1.i(i12) | w1.i(w1.i(i11) << 32));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f11 = iArr[0];
            float f12 = iArr[1];
            view.getLocationInWindow(iArr);
            float f13 = this.tmpPositionArray[0];
            float f14 = f12 - r0[1];
            this.windowPosition = Offset.m2260constructorimpl((Float.floatToRawIntBits(f11 - f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L));
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo4241calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m4267invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                layoutNode = layoutNode.getParent$ui_release();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$10(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        kotlin.jvm.internal.g0.m(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.m4226sendMotionEvent8iAsVTc(motionEvent);
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m4226sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m4275setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m3794constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (convertToPointerInputEvent$ui_release == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        List<PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
        int size = pointers.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                pointerInputEventData = pointers.get(size);
                if (pointerInputEventData.getDown()) {
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
        }
        pointerInputEventData = null;
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.m3748getPositionF1C5BW0();
        }
        int m3753processBIzXfog = this.pointerInputEventProcessor.m3753processBIzXfog(convertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            return m3753processBIzXfog;
        }
        if ((m3753processBIzXfog & 1) != 0) {
            return m3753processBIzXfog;
        }
        this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return m3753processBIzXfog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i11, long j11, boolean z11) {
        int actionMasked = motionEvent.getActionMasked();
        int i12 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i12 = motionEvent.getActionIndex();
            }
        } else if (i11 != 9 && i11 != 10) {
            i12 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i12 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerPropertiesArr[i13] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i14 = 0; i14 < pointerCount; i14++) {
            pointerCoordsArr[i14] = new MotionEvent.PointerCoords();
        }
        int i15 = 0;
        while (i15 < pointerCount) {
            int i16 = ((i12 < 0 || i15 < i12) ? 0 : 1) + i15;
            motionEvent.getPointerProperties(i16, pointerPropertiesArr[i15]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i15];
            motionEvent.getPointerCoords(i16, pointerCoords);
            float f11 = pointerCoords.x;
            long mo3812localToScreenMKHz9U = mo3812localToScreenMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U & 4294967295L));
            i15++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j11 : motionEvent.getDownTime(), j11, i11, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z11 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(obtain, this);
        kotlin.jvm.internal.g0.m(convertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m3753processBIzXfog(convertToPointerInputEvent$ui_release, this, true);
        obtain.recycle();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i11, long j11, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i11, j11, z11);
    }

    private void setDensity(Density density) {
        this.density$delegate.setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m4227startDrag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j11, x00.l<? super DrawScope, g2> lVar) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j11, lVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$8(AndroidComposeView androidComposeView, boolean z11) {
        androidComposeView._inputModeManager.m3274setInputModeiuPiT84(z11 ? InputMode.Companion.m3271getTouchaOaMEAU() : InputMode.Companion.m3270getKeyboardaOaMEAU());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j11 = this.globalPosition;
        int m5243getXimpl = IntOffset.m5243getXimpl(j11);
        int m5244getYimpl = IntOffset.m5244getYimpl(j11);
        int[] iArr = this.tmpPositionArray;
        boolean z11 = false;
        int i11 = iArr[0];
        if (m5243getXimpl != i11 || m5244getYimpl != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.globalPosition = IntOffset.m5237constructorimpl((i11 << 32) | (iArr[1] & 4294967295L));
            if (m5243getXimpl != Integer.MAX_VALUE && m5244getYimpl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z11 = true;
            }
        }
        recalculateWindowPosition();
        getRectManager().m4348updateOffsetsucfNpQE(this.globalPosition, IntOffsetKt.m5260roundk4lQ0M(this.windowPosition), this.viewToWindowMatrix);
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z11);
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().dispatchCallbacks();
        }
    }

    private final void updateWindowMetrics() {
        MutableState mutableState = this._windowInfo._containerSize;
        if (mutableState != null) {
            mutableState.setValue(IntSize.m5278boximpl(AndroidWindowInfo_androidKt.calculateWindowSize(this)));
        }
    }

    public final void addAndroidView(@m80.k AndroidViewHolder androidViewHolder, @m80.k final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        androidViewHolder.setImportantForAccessibility(1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
            
                if (r0.intValue() == r4.this$0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L19;
             */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View r5, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r6) {
                /*
                    r4 = this;
                    super.onInitializeAccessibilityNodeInfo(r5, r6)
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r5 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r5)
                    boolean r5 = r5.isEnabled$ui_release()
                    if (r5 == 0) goto L13
                    r5 = 0
                    r6.setVisibleToUser(r5)
                L13:
                    androidx.compose.ui.node.LayoutNode r5 = r2
                    androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
                L19:
                    r0 = 0
                    if (r5 == 0) goto L32
                    androidx.compose.ui.node.NodeChain r1 = r5.getNodes$ui_release()
                    r2 = 8
                    int r2 = androidx.compose.ui.node.NodeKind.m4118constructorimpl(r2)
                    boolean r1 = r1.m4079hasH91voCI$ui_release(r2)
                    if (r1 == 0) goto L2d
                    goto L33
                L2d:
                    androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
                    goto L19
                L32:
                    r5 = r0
                L33:
                    if (r5 == 0) goto L3d
                    int r5 = r5.getSemanticsId()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L3d:
                    r5 = -1
                    if (r0 == 0) goto L54
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.semantics.SemanticsOwner r1 = r1.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r1 = r1.getUnmergedRootSemanticsNode()
                    int r1 = r1.getId()
                    int r2 = r0.intValue()
                    if (r2 != r1) goto L58
                L54:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L58:
                    androidx.compose.ui.platform.AndroidComposeView r1 = r3
                    int r0 = r0.intValue()
                    r6.setParent(r1, r0)
                    androidx.compose.ui.node.LayoutNode r0 = r2
                    int r0 = r0.getSemanticsId()
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    androidx.collection.MutableIntIntMap r1 = r1.getIdToBeforeMap$ui_release()
                    int r1 = r1.getOrDefault(r0, r5)
                    if (r1 == r5) goto L9f
                    androidx.compose.ui.platform.AndroidComposeView r2 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidViewsHandler r2 = r2.getAndroidViewsHandler$ui_release()
                    android.view.View r2 = androidx.compose.ui.platform.SemanticsUtils_androidKt.semanticsIdToView(r2, r1)
                    if (r2 == 0) goto L87
                    r6.setTraversalBefore(r2)
                    goto L8c
                L87:
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    r6.setTraversalBefore(r2, r1)
                L8c:
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    android.view.accessibility.AccessibilityNodeInfo r2 = r6.unwrap()
                    androidx.compose.ui.platform.AndroidComposeView r3 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r3)
                    java.lang.String r3 = r3.getExtraDataTestTraversalBeforeVal$ui_release()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r0, r2, r3)
                L9f:
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    androidx.collection.MutableIntIntMap r1 = r1.getIdToAfterMap$ui_release()
                    int r1 = r1.getOrDefault(r0, r5)
                    if (r1 == r5) goto Ld7
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidViewsHandler r5 = r5.getAndroidViewsHandler$ui_release()
                    android.view.View r5 = androidx.compose.ui.platform.SemanticsUtils_androidKt.semanticsIdToView(r5, r1)
                    if (r5 == 0) goto Lbf
                    r6.setTraversalAfter(r5)
                    goto Lc4
                Lbf:
                    androidx.compose.ui.platform.AndroidComposeView r5 = r3
                    r6.setTraversalAfter(r5, r1)
                Lc4:
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                    android.view.accessibility.AccessibilityNodeInfo r6 = r6.unwrap()
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r1 = r1.getExtraDataTestTraversalAfterVal$ui_release()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r5, r0, r6, r1)
                Ld7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.ViewGroup
    public void addView(@m80.l View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public void autofill(@m80.k SparseArray<AutofillValue> sparseArray) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported()) {
            if (ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
                androidAutofillManager.performAutofill(sparseArray);
            }
            AndroidAutofill androidAutofill = this._autofill;
            if (androidAutofill != null) {
                AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
            }
        }
    }

    @m80.l
    public final Object boundsUpdatesAccessibilityEventLoop(@m80.k j00.c<? super g2> cVar) {
        Object boundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(cVar);
        return boundsUpdatesEventLoop$ui_release == kotlin.coroutines.intrinsics.b.l() ? boundsUpdatesEventLoop$ui_release : g2.f100423a;
    }

    @m80.l
    public final Object boundsUpdatesContentCaptureEventLoop(@m80.k j00.c<? super g2> cVar) {
        Object boundsUpdatesEventLoop$ui_release = this.contentCaptureManager.boundsUpdatesEventLoop$ui_release(cVar);
        return boundsUpdatesEventLoop$ui_release == kotlin.coroutines.intrinsics.b.l() ? boundsUpdatesEventLoop$ui_release : g2.f100423a;
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo4176calculateLocalPositionMKHz9U(long j11) {
        recalculateWindowPosition();
        return Matrix.m2745mapMKHz9U(this.windowToViewMatrix, j11);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo4177calculatePositionInWindowMKHz9U(long j11) {
        recalculateWindowPosition();
        return Matrix.m2745mapMKHz9U(this.viewToWindowMatrix, j11);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        return this.composeAccessibilityDelegate.m4235canScroll0AR0LA0$ui_release(false, i11, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        return this.composeAccessibilityDelegate.m4235canScroll0AR0LA0$ui_release(true, i11, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public OwnedLayer createLayer(@m80.k x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar, @m80.k x00.a<g2> aVar, @m80.l GraphicsLayer graphicsLayer, boolean z11) {
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, pVar, aVar);
        }
        if (!z11) {
            OwnedLayer pop = this.layerCache.pop();
            if (pop == null) {
                return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, pVar, aVar);
            }
            pop.reuseLayer(pVar, aVar);
            return pop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, pVar, aVar);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            DrawChildContainer drawChildContainer = companion.getShouldUseDispatchDraw() ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
            this.viewLayersContainer = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.viewLayersContainer;
        kotlin.jvm.internal.g0.m(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, pVar, aVar);
    }

    @Override // androidx.compose.ui.node.Owner
    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 1) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), false);
            }
            this.sensitiveComponentCount--;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@m80.k android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.notifyObjectsInitialized();
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas(), null);
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.dirtyLayers.get(i11).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            kotlin.jvm.internal.g0.m(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@m80.k MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        return motionEvent.getActionMasked() == 8 ? (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : (m4222handleMotionEvent8iAsVTc(motionEvent) & 1) != 0 : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@m80.k MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (!isBadMotionEvent(motionEvent) && isAttachedToWindow()) {
            this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && isInBounds(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.previousMotionEvent;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                    this.hoverExitReceived = true;
                    postDelayed(this.sendHoverExitEvent, 8L);
                    return false;
                }
            } else if (!isPositionChanged(motionEvent)) {
                return false;
            }
            if ((m4222handleMotionEvent8iAsVTc(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@m80.k final android.view.KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().mo2169dispatchKeyEventYhN2O0w(KeyEvent.m3572constructorimpl(keyEvent), new x00.a<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    boolean dispatchKeyEvent;
                    dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent(keyEvent);
                    return Boolean.valueOf(dispatchKeyEvent);
                }
            });
        }
        this._windowInfo.m4275setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m3794constructorimpl(keyEvent.getMetaState()));
        return FocusOwner.m2166dispatchKeyEventYhN2O0w$default(getFocusOwner(), KeyEvent.m3572constructorimpl(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(@m80.k android.view.KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().mo2168dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent.m3572constructorimpl(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(@m80.k ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            AndroidComposeViewAssistHelperMethodsO.INSTANCE.setClassName(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@m80.k MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            kotlin.jvm.internal.g0.m(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent))) {
            return false;
        }
        int m4222handleMotionEvent8iAsVTc = m4222handleMotionEvent8iAsVTc(motionEvent);
        if ((m4222handleMotionEvent8iAsVTc & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (m4222handleMotionEvent8iAsVTc & 1) != 0;
    }

    public final void drawAndroidView(@m80.k AndroidViewHolder androidViewHolder, @m80.k android.graphics.Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    @m80.l
    public final View findViewByAccessibilityIdTraversal(int i11) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(i11, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i11));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    @m80.l
    public View focusSearch(@m80.l View view, int i11) {
        Rect calculateBoundingRectRelativeTo;
        if (view == null || this.measureAndLayoutDelegate.getDuringMeasureLayout$ui_release()) {
            return super.focusSearch(view, i11);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i11);
        if (view == this) {
            calculateBoundingRectRelativeTo = getFocusOwner().getFocusRect();
            if (calculateBoundingRectRelativeTo == null) {
                calculateBoundingRectRelativeTo = FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(view, this);
            }
        } else {
            calculateBoundingRectRelativeTo = FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(view, this);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i11);
        int m2155unboximpl = focusDirection != null ? focusDirection.m2155unboximpl() : FocusDirection.Companion.m2156getDowndhqQ8s();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (getFocusOwner().mo2170focusSearchULY8qGw(m2155unboximpl, calculateBoundingRectRelativeTo, new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = focusTargetNode;
                return Boolean.TRUE;
            }
        }) != null) {
            if (objectRef.element != 0) {
                if (findNextFocus != null) {
                    if (FocusOwnerImplKt.m2176is1dFocusSearch3ESFkO8(m2155unboximpl)) {
                        return super.focusSearch(view, i11);
                    }
                    T t11 = objectRef.element;
                    kotlin.jvm.internal.g0.m(t11);
                    if (TwoDimensionalFocusSearchKt.m2216isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) t11), FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(findNextFocus, this), calculateBoundingRectRelativeTo, m2155unboximpl)) {
                    }
                }
                return this;
            }
            if (findNextFocus == null) {
            }
            return findNextFocus;
        }
        return view;
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean z11) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui_release(z11);
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(@m80.k LayoutNode layoutNode, boolean z11) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z11);
    }

    @m80.k
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        kotlin.jvm.internal.g0.m(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.l
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.l
    public androidx.compose.ui.autofill.AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @m80.k
    public final x00.l<Configuration, g2> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @m80.k
    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @m80.k
    public Density getDensity() {
        return (Density) this.density$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.l
    /* renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo4178getFocusDirectionP8AzH3I(@m80.k android.view.KeyEvent keyEvent) {
        long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3516getTabEK5gGoQ())) {
            return FocusDirection.m2149boximpl(KeyEvent_androidKt.m3594isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m2161getPreviousdhqQ8s() : FocusDirection.Companion.m2160getNextdhqQ8s());
        }
        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3357getDirectionRightEK5gGoQ())) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2162getRightdhqQ8s());
        }
        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3356getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2159getLeftdhqQ8s());
        }
        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3358getDirectionUpEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3469getPageUpEK5gGoQ())) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2163getUpdhqQ8s());
        }
        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3353getDirectionDownEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3468getPageDownEK5gGoQ())) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2156getDowndhqQ8s());
        }
        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3352getDirectionCenterEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3366getEnterEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3458getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2157getEnterdhqQ8s());
        }
        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3295getBackEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3369getEscapeEK5gGoQ())) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2158getExitdhqQ8s());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(@m80.k android.graphics.Rect rect) {
        g2 g2Var;
        Rect onFetchFocusRect = onFetchFocusRect();
        if (onFetchFocusRect != null) {
            rect.left = Math.round(onFetchFocusRect.getLeft());
            rect.top = Math.round(onFetchFocusRect.getTop());
            rect.right = Math.round(onFetchFocusRect.getRight());
            rect.bottom = Math.round(onFetchFocusRect.getBottom());
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @m80.k
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @m80.k
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @m80.k
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @m80.l
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @m80.l
    public final AndroidAutofillManager get_autofillManager$ui_release() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 0) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), true);
            }
            this.sensitiveComponentCount++;
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED;
    }

    @Override // androidx.compose.ui.input.pointer.MatrixPositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo3661localToScreen58bKbWc(@m80.k float[] fArr) {
        recalculateWindowPosition();
        Matrix.m2758timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m4240preTranslatecG2Xzmc(fArr, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo3812localToScreenMKHz9U(long j11) {
        recalculateWindowPosition();
        long m2745mapMKHz9U = Matrix.m2745mapMKHz9U(this.viewToWindowMatrix, j11);
        float intBitsToFloat = Float.intBitsToFloat((int) (m2745mapMKHz9U >> 32)) + Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m2745mapMKHz9U & 4294967295L)) + Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z11) {
        x00.a<g2> aVar;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z11) {
                try {
                    aVar = this.resendMotionEventOnLayout;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                aVar = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(aVar)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            dispatchPendingInteropLayoutCallbacks();
            g2 g2Var = g2.f100423a;
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo4179measureAndLayout0kLqBqw(@m80.k LayoutNode layoutNode, long j11) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m4067measureAndLayout0kLqBqw(layoutNode, j11);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
                dispatchPendingInteropLayoutCallbacks();
            }
            if (ComposeUiFlags.isRectTrackingEnabled) {
                getRectManager().dispatchCallbacks();
            }
            g2 g2Var = g2.f100423a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
    }

    public final void notifyLayerIsDirty$ui_release(@m80.k OwnedLayer ownedLayer, boolean z11) {
        if (!z11) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(ownedLayer);
            List<OwnedLayer> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(ownedLayer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(ownedLayer);
            return;
        }
        List list2 = this.postponedDirtyLayers;
        if (list2 == null) {
            list2 = new ArrayList();
            this.postponedDirtyLayers = list2;
        }
        list2.add(ownedLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        this._windowInfo.setWindowFocused(hasWindowFocus());
        this._windowInfo.setOnInitializeContainerSize(new x00.a<IntSize>() { // from class: androidx.compose.ui.platform.AndroidComposeView$onAttachedToWindow$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ IntSize invoke() {
                return IntSize.m5278boximpl(m4233invokeYbymL2g());
            }

            /* renamed from: invoke-YbymL2g, reason: not valid java name */
            public final long m4233invokeYbymL2g() {
                return AndroidWindowInfo_androidKt.calculateWindowSize(AndroidComposeView.this);
            }
        });
        updateWindowMetrics();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner3 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle2 = null;
        if (viewTreeOwners == null || (lifecycleOwner3 != null && savedStateRegistryOwner != null && (lifecycleOwner3 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner3.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner3, savedStateRegistryOwner);
            set_viewTreeOwners(viewTreeOwners2);
            x00.l<? super ViewTreeOwners, g2> lVar = this.onViewTreeOwnersAvailable;
            if (lVar != null) {
                lVar.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.m3274setInputModeiuPiT84(isInTouchMode() ? InputMode.Companion.m3271getTouchaOaMEAU() : InputMode.Companion.m3270getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        if (viewTreeOwners3 != null && (lifecycleOwner2 = viewTreeOwners3.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle2.addObserver(this);
        lifecycle2.addObserver(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getFocusOwner().getListeners().add(androidAutofillManager);
            getSemanticsOwner().getListeners$ui_release().add(androidAutofillManager);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m2092getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.isEditorFocused() : androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@m80.k Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AndroidDensity_androidKt.Density(getContext()));
        updateWindowMetrics();
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // android.view.View
    @m80.l
    public InputConnection onCreateInputConnection(@m80.k EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m2092getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.createInputConnection(editorInfo) : androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onCreateVirtualViewTranslationRequests(@m80.k long[] jArr, @m80.k int[] iArr, @m80.k Consumer<ViewTranslationRequest> consumer) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui_release(jArr, iArr, consumer);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(@m80.k LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        getLayoutNodes().remove(layoutNode.getSemanticsId());
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().remove(layoutNode);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onDetach$ui_release(layoutNode);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        Lifecycle lifecycle = null;
        this._windowInfo.setOnInitializeContainerSize(null);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null) {
            lifecycle = lifecycleOwner.getLifecycle();
        }
        if (lifecycle == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle.removeObserver(this.contentCaptureManager);
        lifecycle.removeObserver(this);
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getSemanticsOwner().getListeners$ui_release().remove(androidAutofillManager);
            getFocusOwner().getListeners().remove(androidAutofillManager);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        AndroidAutofillManager androidAutofillManager;
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onEndApplyChanges$ui_release();
        }
        while (this.endApplyChangesListeners.isNotEmpty() && this.endApplyChangesListeners.get(0) != null) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                x00.a<g2> aVar = this.endApplyChangesListeners.get(i11);
                this.endApplyChangesListeners.set(i11, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z11, int i11, @m80.l android.graphics.Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (z11 || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onInteropViewLayoutChange(@m80.k View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(@m80.k LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui_release();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutNodeDeactivated(@m80.k LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().remove(layoutNode);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onLayoutNodeDeactivated$ui_release(layoutNode);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long m4221convertMeasureSpecI7RO_PI = m4221convertMeasureSpecI7RO_PI(i11);
            int i13 = (int) w1.i(m4221convertMeasureSpecI7RO_PI >>> 32);
            int i14 = (int) w1.i(m4221convertMeasureSpecI7RO_PI & 4294967295L);
            long m4221convertMeasureSpecI7RO_PI2 = m4221convertMeasureSpecI7RO_PI(i12);
            long m5076fitPrioritizingHeightZbe2FdA = Constraints.Companion.m5076fitPrioritizingHeightZbe2FdA(i13, i14, (int) w1.i(m4221convertMeasureSpecI7RO_PI2 >>> 32), (int) w1.i(4294967295L & m4221convertMeasureSpecI7RO_PI2));
            Constraints constraints = this.onMeasureConstraints;
            boolean z11 = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m5055boximpl(m5076fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    z11 = Constraints.m5061equalsimpl0(constraints.m5074unboximpl(), m5076fitPrioritizingHeightZbe2FdA);
                }
                if (!z11) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m4068updateRootConstraintsBRTryo0(m5076fitPrioritizingHeightZbe2FdA);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            g2 g2Var = g2.f100423a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostAttach(@m80.k LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onPostAttach$ui_release(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostLayoutNodeReused(@m80.k LayoutNode layoutNode, int i11) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onPostLayoutNodeReused$ui_release(layoutNode, i11);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreAttach(@m80.k LayoutNode layoutNode) {
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreLayoutNodeReused(@m80.k LayoutNode layoutNode, int i11) {
        getLayoutNodes().remove(i11);
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@m80.l ViewStructure viewStructure, int i11) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || viewStructure == null) {
            return;
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.populateViewStructure(viewStructure);
        }
        AndroidAutofill androidAutofill = this._autofill;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(@m80.k LayoutNode layoutNode, boolean z11, boolean z12, boolean z13) {
        if (z11) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z12) && z13) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, z12) && z13) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(@m80.k LayoutNode layoutNode, boolean z11, boolean z12) {
        if (z11) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z12)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, z12)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(24)
    @m80.k
    public android.view.PointerIcon onResolvePointerIcon(@m80.k MotionEvent motionEvent, int i11) {
        PointerIcon stylusHoverIcon;
        int toolType = motionEvent.getToolType(i11);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(InputDeviceCompat.SOURCE_STYLUS) || !(toolType == 2 || toolType == 4) || (stylusHoverIcon = getPointerIconService().getStylusHoverIcon()) == null) ? super.onResolvePointerIcon(motionEvent, i11) : AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), stylusHoverIcon);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@m80.k LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(i11);
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(@m80.k android.graphics.Rect rect, @m80.k Point point, @m80.k Consumer<ScrollCaptureTarget> consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
        this.contentCaptureManager.onSemanticsChange$ui_release();
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onVirtualViewTranslationResponses(@m80.k LongSparseArray<ViewTranslationResponse> longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui_release(androidContentCaptureManager, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z11) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z11);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z11);
        if (!z11 || getShowLayoutBounds() == (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui_release(@m80.k OwnedLayer ownedLayer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        this.dirtyLayers.remove(ownedLayer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(@m80.k x00.a<g2> aVar) {
        if (this.endApplyChangesListeners.contains(aVar)) {
            return;
        }
        this.endApplyChangesListeners.add(aVar);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(@m80.k Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(@m80.k final AndroidViewHolder androidViewHolder) {
        registerOnEndApplyChangesListener(new x00.a<g2>() { // from class: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1
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
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(androidViewHolder);
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
                androidViewHolder.setImportantForAccessibility(0);
            }
        });
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestAutofill(@m80.k LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.requestAutofill$ui_release(layoutNode);
        }
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i11, @m80.l android.graphics.Rect rect) {
        View findNextNonChildView;
        if (!ComposeUiFlags.isViewFocusFixEnabled) {
            if (isFocused()) {
                return true;
            }
            if (getFocusOwner().getRootState().getHasFocus()) {
                return super.requestFocus(i11, rect);
            }
            FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i11);
            final int m2155unboximpl = focusDirection != null ? focusDirection.m2155unboximpl() : FocusDirection.Companion.m2157getEnterdhqQ8s();
            return kotlin.jvm.internal.g0.g(getFocusOwner().mo2170focusSearchULY8qGw(m2155unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.valueOf(focusTargetNode.mo2183requestFocus3ESFkO8(m2155unboximpl));
                }
            }), Boolean.TRUE);
        }
        if (isFocused()) {
            return true;
        }
        if (this.processingRequestFocusForNextNonChildView || getFocusOwner().getFocusTransactionManager().getOngoingTransaction()) {
            return false;
        }
        FocusDirection focusDirection2 = FocusInteropUtils_androidKt.toFocusDirection(i11);
        final int m2155unboximpl2 = focusDirection2 != null ? focusDirection2.m2155unboximpl() : FocusDirection.Companion.m2157getEnterdhqQ8s();
        if (hasFocus() && m4223onMoveFocusInChildren3ESFkO8(m2155unboximpl2)) {
            return true;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Boolean mo2170focusSearchULY8qGw = getFocusOwner().mo2170focusSearchULY8qGw(m2155unboximpl2, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocus$focusSearchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Ref.BooleanRef.this.element = true;
                return Boolean.valueOf(focusTargetNode.mo2183requestFocus3ESFkO8(m2155unboximpl2));
            }
        });
        if (mo2170focusSearchULY8qGw == null) {
            return false;
        }
        if (mo2170focusSearchULY8qGw.booleanValue()) {
            return true;
        }
        if (booleanRef.element) {
            return false;
        }
        if ((rect != null && !hasFocus() && kotlin.jvm.internal.g0.g(getFocusOwner().mo2170focusSearchULY8qGw(m2155unboximpl2, null, new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocus$altFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo2183requestFocus3ESFkO8(m2155unboximpl2));
            }
        }), Boolean.TRUE)) || (findNextNonChildView = findNextNonChildView(i11)) == null || findNextNonChildView == this) {
            return true;
        }
        this.processingRequestFocusForNextNonChildView = true;
        boolean requestFocus = findNextNonChildView.requestFocus(i11);
        this.processingRequestFocusForNextNonChildView = false;
        return requestFocus;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(@m80.k LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo3813screenToLocalMKHz9U(long j11) {
        recalculateWindowPosition();
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return Matrix.m2745mapMKHz9U(this.windowToViewMatrix, Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2))));
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo4180sendKeyEventZmokQxo(@m80.k android.view.KeyEvent keyEvent) {
        return getFocusOwner().mo2168dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || FocusOwner.m2166dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long j11) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui_release(j11);
    }

    public final void setConfigurationChangeObserver(@m80.k x00.l<? super Configuration, g2> lVar) {
        this.configurationChangeObserver = lVar;
    }

    public final void setContentCaptureManager$ui_release(@m80.k AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public void setCoroutineContext(@m80.k kotlin.coroutines.d dVar) {
        this.coroutineContext = dVar;
        DelegatableNode head$ui_release = getRoot().getNodes$ui_release().getHead$ui_release();
        if (head$ui_release instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode) head$ui_release).resetPointerInputHandler();
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
        if (!head$ui_release.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = head$ui_release.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, head$ui_release.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = node2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                PointerInputModifierNode pointerInputModifierNode = (PointerInputModifierNode) delegatingNode;
                                if (pointerInputModifierNode instanceof SuspendingPointerInputModifierNode) {
                                    ((SuspendingPointerInputModifierNode) pointerInputModifierNode).resetPointerInputHandler();
                                }
                            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i11 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector2.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i11 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j11) {
        this.lastMatrixRecalculationAnimationTime = j11;
    }

    public final void setOnViewTreeOwnersAvailable(@m80.k x00.l<? super ViewTreeOwners, g2> lVar) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = lVar;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z11) {
        this.showLayoutBounds = z11;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.node.Owner
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object textInputSession(@m80.k x00.p<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super j00.c<?>, ? extends java.lang.Object> r5, @m80.k j00.c<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.e.n(r6)
            goto L44
        L31:
            kotlin.e.n(r6)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<java.lang.Object>> r6 = r4.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.m2095withSessionCancellingPreviousimpl(r6, r2, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.textInputSession(x00.p, j00.c):java.lang.Object");
    }

    @Override // android.view.ViewGroup
    public void addView(@m80.l View view, int i11) {
        kotlin.jvm.internal.g0.m(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i11, layoutParams);
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @m80.k
    public MutableIntObjectMap<LayoutNode> getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public void addView(@m80.l View view, int i11, int i12) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i11;
        generateDefaultLayoutParams.height = i12;
        g2 g2Var = g2.f100423a;
        addView(view, -1, generateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@m80.l View view, @m80.l ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(@m80.l View view, int i11, @m80.l ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i11, layoutParams, true);
    }

    @yz.n(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @yz.w0(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @yz.n(message = "Use PlatformTextInputModifierNode instead.")
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    @m80.k
    public View getView() {
        return this;
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] fArr = this.viewToWindowMatrix;
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        long m2745mapMKHz9U = Matrix.m2745mapMKHz9U(fArr, Offset.m2260constructorimpl((Float.floatToRawIntBits(y11) & 4294967295L) | (Float.floatToRawIntBits(x11) << 32)));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (m2745mapMKHz9U >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (m2745mapMKHz9U & 4294967295L));
        this.windowPosition = Offset.m2260constructorimpl((Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L));
    }

    @Override // android.view.View
    public void onDraw(@m80.k android.graphics.Canvas canvas) {
    }
}
