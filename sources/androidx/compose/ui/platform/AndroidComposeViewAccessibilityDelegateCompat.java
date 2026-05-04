package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 IntList.kt\nandroidx/collection/IntList\n+ 11 IntList.kt\nandroidx/collection/IntListKt\n+ 12 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 16 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 17 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 18 IntSet.kt\nandroidx/collection/IntSet\n+ 19 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n1#1,3362:1\n111#2,2:3363\n65#2:3404\n69#2:3407\n65#2:3410\n69#2:3413\n65#2:3472\n69#2:3475\n65#2:3478\n69#2:3481\n397#3,3:3365\n354#3,6:3368\n364#3,3:3375\n367#3,9:3379\n400#3:3388\n425#3:3420\n382#3,4:3531\n354#3,6:3535\n364#3,3:3542\n367#3,9:3546\n386#3:3555\n390#3,3:3556\n354#3,6:3559\n364#3,3:3566\n367#3,2:3570\n370#3,6:3615\n393#3:3621\n425#3:3626\n425#3:3658\n1399#4:3374\n1270#4:3378\n1399#4:3516\n1270#4:3520\n1399#4:3541\n1270#4:3545\n1399#4:3565\n1270#4:3569\n1399#4:3589\n1270#4:3593\n1399#4:3639\n1270#4:3643\n76#5,7:3389\n76#5,7:3572\n30#6:3396\n30#6:3400\n30#6:3464\n30#6:3468\n30#6:3484\n53#7,3:3397\n53#7,3:3401\n60#7:3405\n70#7:3408\n60#7:3411\n70#7:3414\n60#7:3451\n70#7:3454\n53#7,3:3465\n53#7,3:3469\n60#7:3473\n70#7:3476\n60#7:3479\n70#7:3482\n53#7,3:3485\n22#8:3406\n22#8:3409\n22#8:3412\n22#8:3415\n22#8:3452\n22#8:3455\n22#8:3474\n22#8:3477\n22#8:3480\n22#8:3483\n34#9,4:3416\n39#9:3421\n34#9,4:3431\n39#9:3436\n70#9,6:3437\n70#9,6:3443\n34#9,6:3456\n34#9,6:3596\n34#9,6:3602\n34#9,4:3622\n39#9:3627\n34#9,4:3654\n39#9:3659\n65#10:3422\n65#10:3423\n237#10,6:3425\n905#11:3424\n438#12:3435\n1#13:3449\n57#14:3450\n61#14:3453\n37#15,2:3462\n91#16:3488\n91#16:3489\n26#17,5:3490\n26#17,5:3495\n26#17,5:3500\n26#17,5:3660\n26#17,5:3665\n255#18,4:3505\n225#18,7:3509\n236#18,3:3517\n239#18,9:3521\n259#18:3530\n255#18,4:3628\n225#18,7:3632\n236#18,3:3640\n239#18,9:3644\n259#18:3653\n357#19,4:3579\n329#19,6:3583\n339#19,3:3590\n342#19,2:3594\n345#19,6:3608\n361#19:3614\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n468#1:3363,2\n555#1:3404\n556#1:3407\n557#1:3410\n558#1:3413\n1723#1:3472\n1724#1:3475\n1725#1:3478\n1726#1:3481\n477#1:3365,3\n477#1:3368,6\n477#1:3375,3\n477#1:3379,9\n477#1:3388\n616#1:3420\n2087#1:3531,4\n2087#1:3535,6\n2087#1:3542,3\n2087#1:3546,9\n2087#1:3555\n2110#1:3556,3\n2110#1:3559,6\n2110#1:3566,3\n2110#1:3570,2\n2110#1:3615,6\n2110#1:3621\n2578#1:3626\n2596#1:3658\n477#1:3374\n477#1:3378\n2069#1:3516\n2069#1:3520\n2087#1:3541\n2087#1:3545\n2110#1:3565\n2110#1:3569\n2121#1:3589\n2121#1:3593\n2588#1:3639\n2588#1:3643\n530#1:3389,7\n2115#1:3572,7\n550#1:3396\n552#1:3400\n1719#1:3464\n1721#1:3468\n1797#1:3484\n550#1:3397,3\n552#1:3401,3\n555#1:3405\n556#1:3408\n557#1:3411\n558#1:3414\n1415#1:3451\n1450#1:3454\n1719#1:3465,3\n1721#1:3469,3\n1723#1:3473\n1724#1:3476\n1725#1:3479\n1726#1:3482\n1797#1:3485,3\n555#1:3406\n556#1:3409\n557#1:3412\n558#1:3415\n1415#1:3452\n1450#1:3455\n1723#1:3474\n1724#1:3477\n1725#1:3480\n1726#1:3483\n615#1:3416,4\n615#1:3421\n1007#1:3431,4\n1007#1:3436\n1018#1:3437,6\n1025#1:3443,6\n1628#1:3456,6\n2396#1:3596,6\n2398#1:3602,6\n2577#1:3622,4\n2577#1:3627\n2595#1:3654,4\n2595#1:3659\n987#1:3422\n990#1:3423\n1004#1:3425,6\n1003#1:3424\n1008#1:3435\n1415#1:3450\n1450#1:3453\n1690#1:3462,2\n1812#1:3488\n2025#1:3489\n2051#1:3490,5\n2060#1:3495,5\n2063#1:3500,5\n1891#1:3660,5\n1892#1:3665,5\n2069#1:3505,4\n2069#1:3509,7\n2069#1:3517,3\n2069#1:3521,9\n2069#1:3530\n2588#1:3628,4\n2588#1:3632,7\n2588#1:3640,3\n2588#1:3644,9\n2588#1:3653\n2121#1:3579,4\n2121#1:3583,6\n2121#1:3590,3\n2121#1:3594,2\n2121#1:3608,6\n2121#1:3614\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;

    @m80.k
    public static final String ClassName = "android.view.View";

    @m80.k
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";

    @m80.k
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;

    @m80.k
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;

    @m80.k
    public static final String TextClassName = "android.widget.TextView";

    @m80.k
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;

    @m80.k
    private final String ExtraDataTestTraversalAfterVal;

    @m80.k
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;

    @m80.k
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @m80.k
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;

    @m80.k
    private final e40.o<g2> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;

    @m80.k
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;

    @m80.l
    private AccessibilityNodeInfoCompat currentlyAccessibilityFocusedANI;

    @m80.l
    private AccessibilityNodeInfoCompat currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;

    @m80.k
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;

    @m80.k
    private final Handler handler;

    @m80.k
    private MutableIntIntMap idToAfterMap;

    @m80.k
    private MutableIntIntMap idToBeforeMap;

    @m80.k
    private SparseArrayCompat<MutableObjectIntMap<CharSequence>> labelToActionId;

    @m80.k
    private ComposeAccessibilityNodeProvider nodeProvider;

    @m80.k
    private MutableIntSet paneDisplayed;

    @m80.k
    private final MutableIntObjectMap<ScrollAxisRange> pendingHorizontalScrollEvents;

    @m80.l
    private PendingTextTraversedEvent pendingTextTraversedEvent;

    @m80.k
    private final MutableIntObjectMap<ScrollAxisRange> pendingVerticalScrollEvents;

    @m80.k
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;

    @m80.k
    private SemanticsNodeCopy previousSemanticsRoot;

    @m80.l
    private Integer previousTraversedNode;

    @m80.k
    private final x00.l<ScrollObservationScope, g2> scheduleScrollEventIfNeededLambda;

    @m80.k
    private final List<ScrollObservationScope> scrollObservationScopes;

    @m80.k
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;

    @m80.k
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;

    @m80.k
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    @m80.k
    private final URLSpanCache urlSpanCache;

    @m80.k
    private final AndroidComposeView view;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @m80.k
    private static final IntList AccessibilityActionsResourceIds = IntListKt.intListOf(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;

    @m80.k
    private x00.l<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new x00.l<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // x00.l
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat.this.getView().getParent().requestSendAccessibilityEvent(AndroidComposeViewAccessibilityDelegateCompat.this.getView(), accessibilityEvent));
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static final class Api24Impl {

        @m80.k
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @w00.o
        public static final void addSetProgressAction(@m80.k AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @m80.k SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class Api29Impl {

        @m80.k
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @w00.o
        public static final void addPageActions(@m80.k AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @m80.k SemanticsNode semanticsNode) {
            boolean enabled;
            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                if (role == null ? false : Role.m4319equalsimpl0(role.m4322unboximpl(), Role.Companion.m4324getCarouselo7Vup1c())) {
                    return;
                }
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void addExtraDataToAccessibilityNodeInfo(int i11, @m80.k AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @m80.k String str, @m80.l Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i11, accessibilityNodeInfoCompat, str, bundle);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        @m80.l
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i11) {
            AccessibilityNodeInfoCompat createNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i11);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (i11 == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = createNodeInfo;
                }
                if (i11 == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = createNodeInfo;
                }
            }
            return createNodeInfo;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        @m80.l
        public AccessibilityNodeInfoCompat findFocus(int i11) {
            if (i11 == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (i11 == 2) {
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            throw new IllegalArgumentException("Unknown focus type: " + i11);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i11, int i12, @m80.l Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i11, i12, bundle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;

        @m80.k
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(@m80.k SemanticsNode semanticsNode, int i11, int i12, int i13, int i14, long j11) {
            this.node = semanticsNode;
            this.action = i11;
            this.granularity = i12;
            this.fromIndex = i13;
            this.toIndex = i14;
            this.traverseTime = j11;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        @m80.k
        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@m80.k AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.g0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.g
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z11) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat.this, z11);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.h
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z11) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat.this, z11);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.pendingVerticalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = e40.r.d(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
        this.paneDisplayed = new MutableIntSet(0, 1, null);
        this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.i
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$37(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new x00.l<ScrollObservationScope, g2>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ScrollObservationScope scrollObservationScope) {
                AndroidComposeViewAccessibilityDelegateCompat.this.scheduleScrollEventIfNeeded(scrollObservationScope);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i11);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (kotlin.jvm.internal.g0.g(str, this.ExtraDataTestTraversalBeforeVal)) {
            int orDefault = this.idToBeforeMap.getOrDefault(i11, -1);
            if (orDefault != -1) {
                accessibilityNodeInfoCompat.getExtras().putInt(str, orDefault);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.g0.g(str, this.ExtraDataTestTraversalAfterVal)) {
            int orDefault2 = this.idToAfterMap.getOrDefault(i11, -1);
            if (orDefault2 != -1) {
                accessibilityNodeInfoCompat.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || bundle == null || !kotlin.jvm.internal.g0.g(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!unmergedConfig$ui_release.contains(semanticsProperties.getTestTag()) || bundle == null || !kotlin.jvm.internal.g0.g(str, ExtraDataTestTagKey)) {
                if (kotlin.jvm.internal.g0.g(str, ExtraDataIdKey)) {
                    accessibilityNodeInfoCompat.getExtras().putInt(str, semanticsNode.getId());
                    return;
                }
                return;
            } else {
                String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getTestTag());
                if (str2 != null) {
                    accessibilityNodeInfoCompat.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i13 > 0 && i12 >= 0) {
            if (i12 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release());
                if (textLayoutResult == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < i13; i14++) {
                    int i15 = i12 + i14;
                    if (i15 >= textLayoutResult.getLayoutInput().getText().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i15)));
                    }
                }
                accessibilityNodeInfoCompat.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e(LogTag, "Invalid arguments for accessibility character locations");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        AndroidComposeView androidComposeView = this.view;
        float f11 = adjustedBounds.left;
        float f12 = adjustedBounds.top;
        long mo3812localToScreenMKHz9U = androidComposeView.mo3812localToScreenMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32)));
        AndroidComposeView androidComposeView2 = this.view;
        float f13 = adjustedBounds.right;
        float f14 = adjustedBounds.bottom;
        long mo3812localToScreenMKHz9U2 = androidComposeView2.mo3812localToScreenMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L)));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U2 & 4294967295L))));
    }

    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m4234canScrollmoWRBKg(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, boolean z11, int i11, long j11) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        if (Offset.m2265equalsimpl0(j11, Offset.Companion.m2283getUnspecifiedF1C5BW0()) || (((9223372034707292159L & j11) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z11) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else {
            if (z11) {
                throw new NoWhenBranchMatchedException();
            }
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        }
        Object[] objArr = intObjectMap.values;
        long[] jArr = intObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i12 = 0;
        boolean z12 = false;
        while (true) {
            long j12 = jArr[i12];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((j12 & 255) < 128) {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i12 << 3) + i14];
                        if (RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m2294containsk4lQ0M(j11) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui_release(), horizontalScrollAxisRange)) != null) {
                            int i15 = scrollAxisRange.getReverseScrolling() ? -i11 : i11;
                            if (i11 == 0 && scrollAxisRange.getReverseScrolling()) {
                                i15 = -1;
                            }
                            if (i15 < 0) {
                                if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
                                    j12 >>= 8;
                                }
                                z12 = true;
                                j12 >>= 8;
                            } else {
                                if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue()) {
                                    j12 >>= 8;
                                }
                                z12 = true;
                                j12 >>= 8;
                            }
                        }
                    }
                    j12 >>= 8;
                }
                if (i13 != 8) {
                    return z12;
                }
            }
            if (i12 == length) {
                return z12;
            }
            i12++;
        }
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui_release()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            g2 g2Var = g2.f100423a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final boolean clearAccessibilityFocus(int i11) {
        if (!isAccessibilityFocused(i11)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i11, 65536, null, null, 12, null);
        return true;
    }

    @VisibleForTesting
    private final AccessibilityEvent createEvent(int i11, int i12) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i12);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i11);
        if (isEnabled$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i11)) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPassword()));
        }
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfoCompat createNodeInfo(int i11) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i11);
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (i11 == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            obtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer valueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (valueOf == null) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + i11 + " has null parent");
                throw new KotlinNothingValueException();
            }
            int intValue = valueOf.intValue();
            obtain.setParent(this.view, intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? intValue : -1);
        }
        obtain.setSource(this.view, i11);
        obtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(i11, obtain, semanticsNode);
        return obtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i11, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent = createEvent(i11, 8192);
        if (num != null) {
            createEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent.getText().add(charSequence);
        }
        return createEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z11) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = z11 ? androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1) : a00.h0.J();
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m4554getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m4563unboximpl());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m4559getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m4563unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            if (isEnabled$ui_release()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) a00.r0.L2(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i11) {
        String iterableTextForAccessibility;
        TextLayoutResult textLayoutResult;
        if (semanticsNode == null || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (i11 == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator companion = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
            return companion;
        }
        if (i11 == 2) {
            AccessibilityIterators.WordTextSegmentIterator companion2 = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        }
        if (i11 != 4) {
            if (i11 == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator companion3 = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                companion3.initialize(iterableTextForAccessibility);
                return companion3;
            }
            if (i11 != 16) {
                return null;
            }
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release())) == null) {
            return null;
        }
        if (i11 == 4) {
            AccessibilityIterators.LineTextSegmentIterator companion4 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
            companion4.initialize(iterableTextForAccessibility, textLayoutResult);
            return companion4;
        }
        AccessibilityIterators.PageTextSegmentIterator companion5 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
        companion5.initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
        return companion5;
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isAccessibilityFocused(int i11) {
        return this.accessibilityFocusedVirtualViewId == i11;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText());
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.m(g2.f100423a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x01b6 -> B:93:0x01b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performActionHelper(int r20, int r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f11) {
        if (f11 >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f11 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    private static final float performActionHelper$scrollDelta(float f11, float f12) {
        if (Math.signum(f11) == Math.signum(f12)) {
            return Math.abs(f11) < Math.abs(f12) ? f11 : f12;
        }
        return 0.0f;
    }

    private final void populateAccessibilityNodeInfoProperties(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        String infoStateDescriptionOrNull;
        boolean infoIsCheckable;
        boolean enabled;
        boolean enabled2;
        boolean enabled3;
        boolean isScreenReaderFocusable;
        View semanticsIdToView;
        boolean enabled4;
        boolean enabled5;
        boolean isRtl;
        boolean isRtl2;
        boolean enabled6;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean z11;
        boolean enabled8;
        boolean z12;
        Resources resources = this.view.getContext().getResources();
        accessibilityNodeInfoCompat.setClassName("android.view.View");
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getEditableText())) {
            accessibilityNodeInfoCompat.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getText())) {
            accessibilityNodeInfoCompat.setClassName(TextClassName);
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        if (role != null) {
            role.m4322unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.Companion;
                if (Role.m4319equalsimpl0(role.m4322unboximpl(), companion.m4330getTabo7Vup1c())) {
                    accessibilityNodeInfoCompat.setRoleDescription(resources.getString(R.string.tab));
                } else if (Role.m4319equalsimpl0(role.m4322unboximpl(), companion.m4329getSwitcho7Vup1c())) {
                    accessibilityNodeInfoCompat.setRoleDescription(resources.getString(R.string.switch_role));
                } else {
                    String m4299toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m4299toLegacyClassNameV4PA4sw(role.m4322unboximpl());
                    if (!Role.m4319equalsimpl0(role.m4322unboximpl(), companion.m4327getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                        accessibilityNodeInfoCompat.setClassName(m4299toLegacyClassNameV4PA4sw);
                    }
                }
            }
            g2 g2Var = g2.f100423a;
        }
        accessibilityNodeInfoCompat.setPackageName(this.view.getContext().getPackageName());
        accessibilityNodeInfoCompat.setImportantForAccessibility(SemanticsUtils_androidKt.isImportantForAccessibility(semanticsNode));
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i12);
            if (getCurrentSemanticsNodes().containsKey(semanticsNode2.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode$ui_release());
                if (semanticsNode2.getId() != -1) {
                    if (androidViewHolder != null) {
                        accessibilityNodeInfoCompat.addChild(androidViewHolder);
                    } else {
                        accessibilityNodeInfoCompat.addChild(this.view, semanticsNode2.getId());
                    }
                }
            }
        }
        if (i11 == this.accessibilityFocusedVirtualViewId) {
            accessibilityNodeInfoCompat.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            accessibilityNodeInfoCompat.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, accessibilityNodeInfoCompat);
        setContentInvalid(semanticsNode, accessibilityNodeInfoCompat);
        infoStateDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoStateDescriptionOrNull(semanticsNode, resources);
        accessibilityNodeInfoCompat.setStateDescription(infoStateDescriptionOrNull);
        infoIsCheckable = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoIsCheckable(semanticsNode);
        accessibilityNodeInfoCompat.setCheckable(infoIsCheckable);
        SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release2, semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                accessibilityNodeInfoCompat.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                accessibilityNodeInfoCompat.setChecked(false);
            }
            g2 g2Var2 = g2.f100423a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m4319equalsimpl0(role.m4322unboximpl(), Role.Companion.m4330getTabo7Vup1c())) {
                accessibilityNodeInfoCompat.setSelected(booleanValue);
            } else {
                accessibilityNodeInfoCompat.setChecked(booleanValue);
            }
            g2 g2Var3 = g2.f100423a;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getContentDescription());
            accessibilityNodeInfoCompat.setContentDescription(list != null ? (String) a00.r0.L2(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z12 = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig$ui_release3 = semanticsNode3.getUnmergedConfig$ui_release();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui_release3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    z12 = ((Boolean) semanticsNode3.getUnmergedConfig$ui_release().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                semanticsNode3 = semanticsNode3.getParent();
            }
            if (z12) {
                accessibilityNodeInfoCompat.setViewIdResourceName(str);
            }
        }
        SemanticsConfiguration unmergedConfig$ui_release4 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((g2) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release4, semanticsProperties3.getHeading())) != null) {
            accessibilityNodeInfoCompat.setHeading(true);
            g2 g2Var4 = g2.f100423a;
        }
        accessibilityNodeInfoCompat.setPassword(semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getPassword()));
        accessibilityNodeInfoCompat.setEditable(semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getIsEditable()));
        Integer num = (Integer) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getMaxTextLength());
        accessibilityNodeInfoCompat.setMaxTextLength(num != null ? num.intValue() : -1);
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        accessibilityNodeInfoCompat.setEnabled(enabled);
        accessibilityNodeInfoCompat.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getFocused()));
        if (accessibilityNodeInfoCompat.isFocusable()) {
            accessibilityNodeInfoCompat.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties3.getFocused())).booleanValue());
            if (accessibilityNodeInfoCompat.isFocused()) {
                accessibilityNodeInfoCompat.addAction(2);
                this.focusedVirtualViewId = i11;
            } else {
                accessibilityNodeInfoCompat.addAction(1);
            }
        }
        accessibilityNodeInfoCompat.setVisibleToUser(!SemanticsUtils_androidKt.isHidden(semanticsNode));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int m4313unboximpl = liveRegionMode.m4313unboximpl();
            LiveRegionMode.Companion companion2 = LiveRegionMode.Companion;
            accessibilityNodeInfoCompat.setLiveRegion((LiveRegionMode.m4310equalsimpl0(m4313unboximpl, companion2.m4315getPolite0phEisY()) || !LiveRegionMode.m4310equalsimpl0(m4313unboximpl, companion2.m4314getAssertive0phEisY())) ? 1 : 2);
            g2 g2Var5 = g2.f100423a;
        }
        accessibilityNodeInfoCompat.setClickable(false);
        SemanticsConfiguration unmergedConfig$ui_release5 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release5, semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean g11 = kotlin.jvm.internal.g0.g(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getSelected()), Boolean.TRUE);
            Role.Companion companion3 = Role.Companion;
            if (!(role == null ? false : Role.m4319equalsimpl0(role.m4322unboximpl(), companion3.m4330getTabo7Vup1c()))) {
                if (!(role == null ? false : Role.m4319equalsimpl0(role.m4322unboximpl(), companion3.m4328getRadioButtono7Vup1c()))) {
                    z11 = false;
                    accessibilityNodeInfoCompat.setClickable(z11 || (z11 && !g11));
                    enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                    if (enabled8 && accessibilityNodeInfoCompat.isClickable()) {
                        accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
                    }
                    g2 g2Var6 = g2.f100423a;
                }
            }
            z11 = true;
            accessibilityNodeInfoCompat.setClickable(z11 || (z11 && !g11));
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            g2 g2Var62 = g2.f100423a;
        }
        accessibilityNodeInfoCompat.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfoCompat.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            g2 g2Var7 = g2.f100423a;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            g2 g2Var8 = g2.f100423a;
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                g2 g2Var9 = g2.f100423a;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnImeAction());
            if (accessibilityAction5 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                g2 g2Var10 = g2.f100423a;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                g2 g2Var11 = g2.f100423a;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null) {
                if (accessibilityNodeInfoCompat.isFocused() && this.view.getClipboardManager().hasText()) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                g2 g2Var12 = g2.f100423a;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            accessibilityNodeInfoCompat.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetSelection());
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            accessibilityNodeInfoCompat.addAction(256);
            accessibilityNodeInfoCompat.addAction(512);
            accessibilityNodeInfoCompat.setMovementGranularities(11);
            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getContentDescription());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat.getMovementGranularities() | 20);
                }
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence text = accessibilityNodeInfoCompat.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            accessibilityNodeInfoCompat.setAvailableExtraData(arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                accessibilityNodeInfoCompat.setClassName("android.widget.SeekBar");
            } else {
                accessibilityNodeInfoCompat.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    if (progressBarRangeInfo.getCurrent() < g10.u.t(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > g10.u.A(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        Api24Impl.addSetProgressAction(accessibilityNodeInfoCompat, semanticsNode);
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, accessibilityNodeInfoCompat);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, accessibilityNodeInfoCompat);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            enabled5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    isRtl2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    accessibilityNodeInfoCompat.addAction(!isRtl2 ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT : AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    accessibilityNodeInfoCompat.addAction(!isRtl ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT : AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            enabled4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (i13 >= 29) {
            Api29Impl.addPageActions(accessibilityNodeInfoCompat, semanticsNode);
        }
        accessibilityNodeInfoCompat.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getExpand());
            if (accessibilityAction10 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                g2 g2Var13 = g2.f100423a;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCollapse());
            if (accessibilityAction11 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                g2 g2Var14 = g2.f100423a;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getDismiss());
            if (accessibilityAction12 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                g2 g2Var15 = g2.f100423a;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getCustomActions())) {
                List list3 = (List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getCustomActions());
                int size2 = list3.size();
                IntList intList = AccessibilityActionsResourceIds;
                if (size2 >= intList._size) {
                    throw new IllegalStateException("Can't have more than " + intList._size + " custom actions for one widget");
                }
                SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>(0, 1, null);
                MutableObjectIntMap<CharSequence> mutableObjectIntMapOf = ObjectIntMapKt.mutableObjectIntMapOf();
                if (this.labelToActionId.containsKey(i11)) {
                    MutableObjectIntMap<CharSequence> mutableObjectIntMap = this.labelToActionId.get(i11);
                    MutableIntList mutableIntList = new MutableIntList(0, 1, null);
                    int[] iArr = intList.content;
                    int i14 = intList._size;
                    for (int i15 = 0; i15 < i14; i15++) {
                        mutableIntList.add(iArr[i15]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i16);
                        kotlin.jvm.internal.g0.m(mutableObjectIntMap);
                        if (mutableObjectIntMap.containsKey(customAccessibilityAction.getLabel())) {
                            int i17 = mutableObjectIntMap.get(customAccessibilityAction.getLabel());
                            sparseArrayCompat.put(i17, customAccessibilityAction.getLabel());
                            mutableObjectIntMapOf.set(customAccessibilityAction.getLabel(), i17);
                            mutableIntList.remove(i17);
                            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i17, customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i18);
                        int i19 = mutableIntList.get(i18);
                        sparseArrayCompat.put(i19, customAccessibilityAction2.getLabel());
                        mutableObjectIntMapOf.set(customAccessibilityAction2.getLabel(), i19);
                        accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i19, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i21 = 0; i21 < size5; i21++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i21);
                        int i22 = AccessibilityActionsResourceIds.get(i21);
                        sparseArrayCompat.put(i22, customAccessibilityAction3.getLabel());
                        mutableObjectIntMapOf.set(customAccessibilityAction3.getLabel(), i22);
                        accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i22, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.put(i11, sparseArrayCompat);
                this.labelToActionId.put(i11, mutableObjectIntMapOf);
            }
        }
        isScreenReaderFocusable = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isScreenReaderFocusable(semanticsNode, resources);
        accessibilityNodeInfoCompat.setScreenReaderFocusable(isScreenReaderFocusable);
        int orDefault = this.idToBeforeMap.getOrDefault(i11, -1);
        if (orDefault != -1) {
            View semanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), orDefault);
            if (semanticsIdToView2 != null) {
                accessibilityNodeInfoCompat.setTraversalBefore(semanticsIdToView2);
            } else {
                accessibilityNodeInfoCompat.setTraversalBefore(this.view, orDefault);
            }
            addExtraDataToAccessibilityNodeInfoHelper(i11, accessibilityNodeInfoCompat, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int orDefault2 = this.idToAfterMap.getOrDefault(i11, -1);
        if (orDefault2 == -1 || (semanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), orDefault2)) == null) {
            return;
        }
        accessibilityNodeInfoCompat.setTraversalAfter(semanticsIdToView);
        addExtraDataToAccessibilityNodeInfoHelper(i11, accessibilityNodeInfoCompat, this.ExtraDataTestTraversalAfterVal, null);
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final boolean registerScrollingId(int i11, List<ScrollObservationScope> list) {
        boolean z11;
        ScrollObservationScope findById = SemanticsUtils_androidKt.findById(list, i11);
        if (findById != null) {
            z11 = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(i11, this.scrollObservationScopes, null, null, null, null);
            z11 = true;
            findById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(findById);
        return z11;
    }

    private final boolean requestAccessibilityFocus(int i11) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i11)) {
            return false;
        }
        int i12 = this.accessibilityFocusedVirtualViewId;
        if (i12 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i12, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = i11;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i11, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new x00.a<g2>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
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
                    int semanticsNodeIdToAccessibilityVirtualNodeId;
                    IntObjectMap currentSemanticsNodes;
                    IntObjectMap currentSemanticsNodes2;
                    IntObjectMap currentSemanticsNodes3;
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode$ui_release;
                    MutableIntObjectMap mutableIntObjectMap;
                    MutableIntObjectMap mutableIntObjectMap2;
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
                    Rect boundsInScreen;
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
                    Rect boundsInScreen2;
                    ScrollAxisRange horizontalScrollAxisRange = ScrollObservationScope.this.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = ScrollObservationScope.this.getVerticalScrollAxisRange();
                    Float oldXValue = ScrollObservationScope.this.getOldXValue();
                    Float oldYValue = ScrollObservationScope.this.getOldYValue();
                    float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        semanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(ScrollObservationScope.this.getSemanticsNodeId());
                        currentSemanticsNodes = this.getCurrentSemanticsNodes();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes.get(this.accessibilityFocusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                                if (accessibilityNodeInfoCompat2 != null) {
                                    boundsInScreen2 = androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds);
                                    accessibilityNodeInfoCompat2.setBoundsInScreen(boundsInScreen2);
                                    g2 g2Var = g2.f100423a;
                                }
                            } catch (IllegalStateException unused) {
                                g2 g2Var2 = g2.f100423a;
                            }
                        }
                        currentSemanticsNodes2 = this.getCurrentSemanticsNodes();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes2.get(this.focusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds2 != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            try {
                                accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                                if (accessibilityNodeInfoCompat != null) {
                                    boundsInScreen = androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(semanticsNodeWithAdjustedBounds2);
                                    accessibilityNodeInfoCompat.setBoundsInScreen(boundsInScreen);
                                    g2 g2Var3 = g2.f100423a;
                                }
                            } catch (IllegalStateException unused2) {
                                g2 g2Var4 = g2.f100423a;
                            }
                        }
                        this.getView().invalidate();
                        currentSemanticsNodes3 = this.getCurrentSemanticsNodes();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes3.get(semanticsNodeIdToAccessibilityVirtualNodeId);
                        if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode$ui_release = semanticsNode.getLayoutNode$ui_release()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this;
                            if (horizontalScrollAxisRange != null) {
                                mutableIntObjectMap2 = androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents;
                                mutableIntObjectMap2.set(semanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                mutableIntObjectMap = androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents;
                                mutableIntObjectMap.set(semanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat3.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode$ui_release);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$37(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            g2 g2Var = g2.f100423a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i11) {
        if (i11 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i11;
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        MutableIntSet mutableIntSetOf = IntSetKt.mutableIntSetOf();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i11);
            if (getCurrentSemanticsNodes().containsKey(semanticsNode2.getId())) {
                if (!semanticsNodeCopy.getChildren().contains(semanticsNode2.getId())) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                    return;
                }
                mutableIntSetOf.add(semanticsNode2.getId());
            }
        }
        MutableIntSet children = semanticsNodeCopy.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128 && !mutableIntSetOf.contains(iArr[(i12 << 3) + i14])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                            return;
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i15);
            if (getCurrentSemanticsNodes().containsKey(semanticsNode3.getId())) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(semanticsNode3.getId());
                kotlin.jvm.internal.g0.m(semanticsNodeCopy2);
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(accessibilityEvent).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int i11, int i12, Integer num, List<String> list) {
        if (i11 == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(i11, i12);
        if (num != null) {
            createEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(createEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i11, int i12, Integer num, List list, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i11, i12, num, list);
    }

    private final void sendPaneChangeEvents(int i11, int i12, String str) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i11), 32);
        createEvent.setContentChangeTypes(i12);
        if (str != null) {
            createEvent.getText().add(str);
        }
        sendEvent(createEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i11) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i11 != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0558, code lost:
    
        if (r2.containsAll(r4) != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x055b, code lost:
    
        r32 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0567, code lost:
    
        if (r2.isEmpty() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x057c, code lost:
    
        if (r1 == false) goto L167;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSemanticsPropertyChangeEvents(androidx.collection.IntObjectMap<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r54) {
        /*
            Method dump skipped, instructions count: 1701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(androidx.collection.IntObjectMap):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode r8, androidx.collection.MutableIntSet r9) {
        /*
            r7 = this;
            boolean r0 = r8.isAttached()
            if (r0 != 0) goto L7
            goto L65
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.view
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L18
            goto L65
        L18:
            androidx.compose.ui.node.NodeChain r0 = r8.getNodes$ui_release()
            r1 = 8
            int r1 = androidx.compose.ui.node.NodeKind.m4118constructorimpl(r1)
            boolean r0 = r0.m4079hasH91voCI$ui_release(r1)
            if (r0 == 0) goto L29
            goto L2f
        L29:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = new x00.l<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                static {
                    /*
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT 
  (r0 I:androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1)
 androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.<init>():void");
                }

                @Override // x00.l
                public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r2) {
                    /*
                        r1 = this;
                        androidx.compose.ui.node.NodeChain r2 = r2.getNodes$ui_release()
                        r0 = 8
                        int r0 = androidx.compose.ui.node.NodeKind.m4118constructorimpl(r0)
                        boolean r2 = r2.m4079hasH91voCI$ui_release(r0)
                        java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r1) {
                    /*
                        r0 = this;
                        androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                        java.lang.Boolean r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.ui.node.LayoutNode r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
        L2f:
            if (r8 == 0) goto L65
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r8.getSemanticsConfiguration()
            if (r0 != 0) goto L38
            goto L65
        L38:
            boolean r0 = r0.isMergingSemanticsOfDescendants()
            if (r0 != 0) goto L47
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = new x00.l<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                static {
                    /*
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT 
  (r0 I:androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1)
 androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.<init>():void");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r1) {
                    /*
                        r0 = this;
                        androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                        java.lang.Boolean r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.invoke(java.lang.Object):java.lang.Object");
                }

                @Override // x00.l
                public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r3) {
                    /*
                        r2 = this;
                        androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getSemanticsConfiguration()
                        r0 = 0
                        if (r3 == 0) goto Lf
                        boolean r3 = r3.isMergingSemanticsOfDescendants()
                        r1 = 1
                        if (r3 != r1) goto Lf
                        r0 = r1
                    Lf:
                        java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                }
            }
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
            if (r0 == 0) goto L47
            r8 = r0
        L47:
            int r8 = r8.getSemanticsId()
            boolean r9 = r9.add(r8)
            if (r9 != 0) goto L52
            goto L65
        L52:
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r8)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r7
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode, androidx.collection.MutableIntSet):void");
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(semanticsId);
            ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                createEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                createEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                createEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                createEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(createEvent);
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i11, int i12, boolean z11) {
        String iterableTextForAccessibility;
        boolean enabled;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                x00.q qVar = (x00.q) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getSetSelection())).getAction();
                if (qVar != null) {
                    return ((Boolean) qVar.invoke(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
                }
                return false;
            }
        }
        if ((i11 == i12 && i12 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        if (i11 < 0 || i11 != i12 || i12 > iterableTextForAccessibility.length()) {
            i11 = -1;
        }
        this.accessibilityCursorPosition = i11;
        boolean z12 = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), z12 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z12 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z12 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getError()));
        }
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnnotatedString infoText;
        infoText = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoText(semanticsNode);
        accessibilityNodeInfoCompat.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, androidx.compose.ui.geometry.Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m2305translatek4lQ0M = rect.m2305translatek4lQ0M(semanticsNode.m4333getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect intersect = m2305translatek4lQ0M.overlaps(boundsInRoot) ? m2305translatek4lQ0M.intersect(boundsInRoot) : null;
        if (intersect == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.view;
        float left = intersect.getLeft();
        long mo3812localToScreenMKHz9U = androidComposeView.mo3812localToScreenMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(intersect.getTop()) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        long mo3812localToScreenMKHz9U2 = this.view.mo3812localToScreenMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(intersect.getRight()) << 32) | (Float.floatToRawIntBits(intersect.getBottom()) & 4294967295L)));
        return new RectF(Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U >> 32)), Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U & 4294967295L)), Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U2 >> 32)), Float.intBitsToFloat((int) (mo3812localToScreenMKHz9U2 & 4294967295L)));
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z11) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int id2 = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id2 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        boolean z13 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(semanticsNode, i11);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = z11 ? 0 : iterableTextForAccessibility.length();
            }
            int[] following = z11 ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (following == null) {
                return false;
            }
            int i14 = following[0];
            z13 = true;
            int i15 = following[1];
            if (z12 && isAccessibilitySelectionExtendable(semanticsNode)) {
                i12 = getAccessibilitySelectionStart(semanticsNode);
                if (i12 == -1) {
                    i12 = z11 ? i14 : i15;
                }
                i13 = z11 ? i15 : i14;
            } else {
                i12 = z11 ? i15 : i14;
                i13 = i12;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z11 ? 256 : 512, i11, i14, i15, SystemClock.uptimeMillis());
            setAccessibilitySelection(semanticsNode, i12, i13, true);
        }
        return z13;
    }

    private final <T extends CharSequence> T trimToSize(T t11, @IntRange(from = 1) int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (t11 == null || t11.length() == 0) {
            return t11;
        }
        if (t11.length() <= i11) {
            return t11;
        }
        int i12 = i11 - 1;
        if (Character.isHighSurrogate(t11.charAt(i12)) && Character.isLowSurrogate(t11.charAt(i11))) {
            i11 = i12;
        }
        T t12 = (T) t11.subSequence(0, i11);
        kotlin.jvm.internal.g0.n(t12, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t12;
    }

    private final void updateHoveredVirtualView(int i11) {
        int i12 = this.hoveredVirtualViewId;
        if (i12 == i11) {
            return;
        }
        this.hoveredVirtualViewId = i11;
        sendEventForVirtualView$default(this, i11, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i12, 256, null, null, 12, null);
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        long j11;
        long j12;
        long j13;
        long j14;
        SemanticsConfiguration unmergedConfig;
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        MutableIntSet mutableIntSet2 = this.paneDisplayed;
        int[] iArr = mutableIntSet2.elements;
        long[] jArr = mutableIntSet2.metadata;
        int length = jArr.length - 2;
        long j15 = 128;
        long j16 = 255;
        char c11 = 7;
        long j17 = -9187201950435737472L;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j18 = jArr[i11];
                int[] iArr2 = iArr;
                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j18 & j16) < j15) {
                            j13 = j15;
                            int i14 = iArr2[(i11 << 3) + i13];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i14);
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode != null) {
                                j14 = j16;
                                if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                }
                            } else {
                                j14 = j16;
                            }
                            mutableIntSet.add(i14);
                            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i14);
                            sendPaneChangeEvents(i14, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle()));
                        } else {
                            j13 = j15;
                            j14 = j16;
                        }
                        j18 >>= 8;
                        i13++;
                        j15 = j13;
                        j16 = j14;
                    }
                    j11 = j15;
                    j12 = j16;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    j11 = j15;
                    j12 = j16;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr = iArr2;
                j15 = j11;
                j16 = j12;
            }
        } else {
            j11 = 128;
            j12 = 255;
        }
        this.paneDisplayed.removeAll(mutableIntSet);
        this.previousSemanticsNodes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr3 = currentSemanticsNodes.keys;
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr2 = currentSemanticsNodes.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j19 = jArr2[i15];
                if ((((~j19) << c11) & j19 & j17) != j17) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j19 & j12) < j11) {
                            int i18 = (i15 << 3) + i17;
                            int i19 = iArr3[i18];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i18];
                            SemanticsConfiguration unmergedConfig$ui_release = semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig$ui_release();
                            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                            if (unmergedConfig$ui_release.contains(semanticsProperties.getPaneTitle()) && this.paneDisplayed.add(i19)) {
                                sendPaneChangeEvents(i19, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig$ui_release().get(semanticsProperties.getPaneTitle()));
                            }
                            this.previousSemanticsNodes.set(i19, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getCurrentSemanticsNodes()));
                        }
                        j19 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length2) {
                    break;
                }
                i15++;
                c11 = 7;
                j17 = -9187201950435737472L;
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (c40.a1.b(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0035, B:14:0x0065, B:20:0x0077, B:22:0x007f, B:24:0x0088, B:26:0x0091, B:28:0x00a2, B:30:0x00a9, B:31:0x00b2, B:39:0x0051), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cf -> B:13:0x0038). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(@m80.k j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(j00.c):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m4235canScroll0AR0LA0$ui_release(boolean z11, int i11, long j11) {
        if (kotlin.jvm.internal.g0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m4234canScrollmoWRBKg(getCurrentSemanticsNodes(), z11, i11, j11);
        }
        return false;
    }

    public final boolean dispatchHoverEvent$ui_release(@m80.k MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
            if (hitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    @m80.k
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@m80.k View view) {
        return this.nodeProvider;
    }

    @m80.k
    public final String getExtraDataTestTraversalAfterVal$ui_release() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    @m80.k
    public final String getExtraDataTestTraversalBeforeVal$ui_release() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    @m80.k
    public final MutableIntIntMap getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    @m80.k
    public final MutableIntIntMap getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    @m80.k
    public final x00.l<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui_release() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    @m80.k
    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float f11, float f12) {
        int i11;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m4028hitTestSemantics6fMxITs$ui_release$default(this.view.getRoot(), Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32)), hitTestResult, 0, false, 12, null);
        int L = a00.h0.L(hitTestResult);
        while (true) {
            i11 = Integer.MIN_VALUE;
            if (-1 >= L) {
                break;
            }
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(L));
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(requireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (requireLayoutNode.getNodes$ui_release().m4079hasH91voCI$ui_release(NodeKind.m4118constructorimpl(8))) {
                i11 = semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode.getSemanticsId());
                SemanticsNode SemanticsNode = SemanticsNodeKt.SemanticsNode(requireLayoutNode, false);
                if (SemanticsUtils_androidKt.isImportantForAccessibility(SemanticsNode) && !SemanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker())) {
                    break;
                }
            }
            L--;
        }
        return i11;
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    public final void onLayoutChange$ui_release(@m80.k LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z11) {
        this.accessibilityForceEnabledForTesting = z11;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setHoveredVirtualViewId$ui_release(int i11) {
        this.hoveredVirtualViewId = i11;
    }

    public final void setIdToAfterMap$ui_release(@m80.k MutableIntIntMap mutableIntIntMap) {
        this.idToAfterMap = mutableIntIntMap;
    }

    public final void setIdToBeforeMap$ui_release(@m80.k MutableIntIntMap mutableIntIntMap) {
        this.idToBeforeMap = mutableIntIntMap;
    }

    public final void setOnSendAccessibilityEvent$ui_release(@m80.k x00.l<? super AccessibilityEvent, Boolean> lVar) {
        this.onSendAccessibilityEvent = lVar;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long j11) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j11;
    }

    @VisibleForTesting
    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }
}
