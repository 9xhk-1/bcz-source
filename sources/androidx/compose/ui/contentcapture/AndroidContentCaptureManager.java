package androidx.compose.ui.contentcapture;

import a00.r0;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import e40.o;
import e40.r;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,655:1\n395#1,4:810\n399#1,5:815\n390#2,3:656\n354#2,6:659\n364#2,3:666\n367#2,2:670\n425#2:672\n370#2,6:673\n393#2:679\n425#2:684\n425#2:685\n390#2,3:694\n354#2,6:697\n364#2,3:704\n367#2,2:708\n370#2,6:765\n393#2:771\n382#2,4:779\n354#2,6:783\n364#2,3:790\n367#2,9:794\n386#2:803\n425#2:814\n397#2,3:832\n354#2,6:835\n364#2,3:842\n367#2,9:846\n400#2:855\n397#2,3:856\n354#2,6:859\n364#2,3:866\n367#2,9:870\n400#2:879\n397#2,3:880\n354#2,6:883\n364#2,3:890\n367#2,9:894\n400#2:903\n1399#3:665\n1270#3:669\n1399#3:703\n1270#3:707\n1399#3:726\n1270#3:730\n1399#3:750\n1270#3:754\n1399#3:789\n1270#3:793\n1399#3:841\n1270#3:845\n1399#3:865\n1270#3:869\n1399#3:889\n1270#3:893\n34#4,4:680\n39#4:693\n34#4,6:820\n34#4,6:826\n76#5,7:686\n76#5,7:710\n76#5,7:772\n365#6,3:717\n329#6,6:720\n339#6,3:727\n342#6,9:731\n368#6:740\n365#6,3:741\n329#6,6:744\n339#6,3:751\n342#6,9:755\n368#6:764\n56#7,6:804\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n*L\n387#1:810,4\n387#1:815,5\n215#1:656,3\n215#1:659,6\n215#1:666,3\n215#1:670,2\n216#1:672\n215#1:673,6\n215#1:679\n234#1:684\n235#1:685\n250#1:694,3\n250#1:697,6\n250#1:704,3\n250#1:708,2\n250#1:765,6\n250#1:771\n305#1:779,4\n305#1:783,6\n305#1:790,3\n305#1:794,9\n305#1:803\n388#1:814\n512#1:832,3\n512#1:835,6\n512#1:842,3\n512#1:846,9\n512#1:855\n521#1:856,3\n521#1:859,6\n521#1:866,3\n521#1:870,9\n521#1:879\n530#1:880,3\n530#1:883,6\n530#1:890,3\n530#1:894,9\n530#1:903\n215#1:665\n215#1:669\n250#1:703\n250#1:707\n261#1:726\n261#1:730\n271#1:750\n271#1:754\n305#1:789\n305#1:793\n512#1:841\n512#1:845\n521#1:865\n521#1:869\n530#1:889\n530#1:893\n232#1:680,4\n232#1:693\n441#1:820,6\n476#1:826,6\n238#1:686,7\n255#1:710,7\n298#1:772,7\n261#1:717,3\n261#1:720,6\n261#1:727,3\n261#1:731,9\n261#1:740\n271#1:741,3\n271#1:744,6\n271#1:751,3\n271#1:755,9\n271#1:764\n379#1:804,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    @m80.k
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";

    @m80.k
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP = "android.view.contentcapture.EventTimestamp";
    private boolean checkingForSemanticsChanges;

    @l
    private ContentCaptureSessionCompat contentCaptureSession;
    private long currentSemanticsNodesSnapshotTimestampMillis;

    @m80.k
    private x00.a<? extends ContentCaptureSessionCompat> onContentCaptureSession;

    @m80.k
    private SemanticsNodeCopy previousSemanticsRoot;

    @m80.k
    private final AndroidComposeView view;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @m80.k
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;

    @m80.k
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;

    @m80.k
    private final o<g2> boundsUpdateChannel = r.d(1, null, null, 6, null);

    @m80.k
    private final Handler handler = new Handler(Looper.getMainLooper());

    @m80.k
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();

    @m80.k
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();

    @m80.k
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: androidx.compose.ui.contentcapture.a
        @Override // java.lang.Runnable
        public final void run() {
            AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager.this);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TranslateStatus {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL = new TranslateStatus("SHOW_ORIGINAL", 0);
        public static final TranslateStatus SHOW_TRANSLATED = new TranslateStatus("SHOW_TRANSLATED", 1);

        private static final /* synthetic */ TranslateStatus[] $values() {
            return new TranslateStatus[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
        }

        static {
            TranslateStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private TranslateStatus(String str, int i11) {
        }

        @m80.k
        public static m00.a<TranslateStatus> getEntries() {
            return $ENTRIES;
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,655:1\n13337#2,2:656\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n*L\n549#1:656,2\n*E\n"})
    @RequiresApi(31)
    public static final class ViewTranslationHelperMethods {

        @m80.k
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            r4 = r4.getValue("android:text");
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            r4 = r4.getText();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void doTranslation(androidx.compose.ui.contentcapture.AndroidContentCaptureManager r8, android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> r9) {
            /*
                r7 = this;
                int r0 = r9.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L64
                long r2 = r9.keyAt(r1)
                java.lang.Object r4 = r9.get(r2)
                android.view.translation.ViewTranslationResponse r4 = androidx.compose.ui.contentcapture.b.a(r4)
                if (r4 == 0) goto L61
                java.lang.String r5 = "android:text"
                android.view.translation.TranslationResponseValue r4 = androidx.compose.ui.contentcapture.c.a(r4, r5)
                if (r4 == 0) goto L61
                java.lang.CharSequence r4 = androidx.compose.ui.contentcapture.d.a(r4)
                if (r4 == 0) goto L61
                androidx.collection.IntObjectMap r5 = r8.getCurrentSemanticsNodes$ui_release()
                int r2 = (int) r2
                java.lang.Object r2 = r5.get(r2)
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r2
                if (r2 == 0) goto L61
                androidx.compose.ui.semantics.SemanticsNode r2 = r2.getSemanticsNode()
                if (r2 == 0) goto L61
                androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getUnmergedConfig$ui_release()
                androidx.compose.ui.semantics.SemanticsActions r3 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.getSetTextSubstitution()
                java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r3)
                androidx.compose.ui.semantics.AccessibilityAction r2 = (androidx.compose.ui.semantics.AccessibilityAction) r2
                if (r2 == 0) goto L61
                yz.w r2 = r2.getAction()
                x00.l r2 = (x00.l) r2
                if (r2 == 0) goto L61
                androidx.compose.ui.text.AnnotatedString r3 = new androidx.compose.ui.text.AnnotatedString
                java.lang.String r4 = r4.toString()
                r5 = 2
                r6 = 0
                r3.<init>(r4, r6, r5, r6)
                java.lang.Object r2 = r2.invoke(r3)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
            L61:
                int r1 = r1 + 1
                goto L5
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.ViewTranslationHelperMethods.doTranslation(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, android.util.LongSparseArray):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @RequiresApi(31)
        public final void onCreateVirtualViewTranslationRequests(@m80.k AndroidContentCaptureManager androidContentCaptureManager, @m80.k long[] jArr, @m80.k int[] iArr, @m80.k Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            AutofillId autofillId;
            String fastJoinToString$default;
            TranslationRequestValue forText;
            ViewTranslationRequest build;
            for (long j11 : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = androidContentCaptureManager.getCurrentSemanticsNodes$ui_release().get((int) j11);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    j.a();
                    autofillId = androidContentCaptureManager.getView().getAutofillId();
                    ViewTranslationRequest.Builder a11 = i.a(autofillId, semanticsNode.getId());
                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
                    if (list != null && (fastJoinToString$default = ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        forText = TranslationRequestValue.forText(new AnnotatedString(fastJoinToString$default, null, 2, 0 == true ? 1 : 0));
                        a11.setValue("android:text", forText);
                        build = a11.build();
                        consumer.accept(build);
                    }
                }
            }
        }

        @RequiresApi(31)
        public final void onVirtualViewTranslationResponses(@m80.k final AndroidContentCaptureManager androidContentCaptureManager, @m80.k final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (g0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(androidContentCaptureManager, longSparseArray);
            } else {
                androidContentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$1(AndroidContentCaptureManager.this, longSparseArray);
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidContentCaptureManager(@m80.k AndroidComposeView androidComposeView, @m80.k x00.a<? extends ContentCaptureSessionCompat> aVar) {
        this.view = androidComposeView;
        this.onContentCaptureSession = aVar;
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
    }

    private final void bufferContentCaptureViewAppeared(int i11, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(i11, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructureCompat));
    }

    private final void bufferContentCaptureViewDisappeared(int i11) {
        this.bufferedEvents.add(new ContentCaptureEvent(i11, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void checkForContentCapturePropertyChanges(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j11;
        char c11;
        long j12;
        int i11;
        SemanticsNode semanticsNode;
        int i12;
        SemanticsNode semanticsNode2;
        long j13;
        int i13;
        long[] jArr3;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap2 = intObjectMap;
        int[] iArr3 = intObjectMap2.keys;
        long[] jArr4 = intObjectMap2.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j14 = jArr4[i14];
            char c12 = 7;
            long j15 = -9187201950435737472L;
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j14 & 255) < 128) {
                        int i18 = iArr3[(i14 << 3) + i17];
                        c11 = c12;
                        SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i18);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap2.get(i18);
                        SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode3 == null) {
                            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (semanticsNodeCopy == null) {
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release = semanticsNode3.getUnmergedConfig$ui_release().getProps$ui_release();
                            j12 = j15;
                            Object[] objArr = props$ui_release.keys;
                            long[] jArr5 = props$ui_release.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i19 = 0;
                                int i21 = i15;
                                while (true) {
                                    long j16 = jArr5[i19];
                                    iArr2 = iArr3;
                                    if ((((~j16) << c11) & j16 & j12) != j12) {
                                        int i22 = 8 - ((~(i19 - length2)) >>> 31);
                                        int i23 = 0;
                                        while (i23 < i22) {
                                            if ((j16 & 255) < 128) {
                                                i13 = i23;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i19 << 3) + i23];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                jArr3 = jArr4;
                                                if (g0.g(semanticsPropertyKey, semanticsProperties.getText())) {
                                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode3.getUnmergedConfig$ui_release(), semanticsProperties.getText());
                                                    sendContentCaptureTextUpdateEvent(semanticsNode3.getId(), String.valueOf(list != null ? (AnnotatedString) r0.L2(list) : null));
                                                }
                                            } else {
                                                i13 = i23;
                                                jArr3 = jArr4;
                                            }
                                            j16 >>= i21;
                                            i23 = i13 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i22 != i21) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i19 == length2) {
                                        break;
                                    }
                                    i19++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i21 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j12 = j15;
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release2 = semanticsNode3.getUnmergedConfig$ui_release().getProps$ui_release();
                            Object[] objArr2 = props$ui_release2.keys;
                            long[] jArr6 = props$ui_release2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i24 = 0;
                                while (true) {
                                    long j17 = jArr6[i24];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j17) << c11) & j17 & j12) != j12) {
                                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                                        int i26 = 0;
                                        while (i26 < i25) {
                                            if ((j17 & 255) < 128) {
                                                i12 = i26;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i24 << 3) + i26];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                semanticsNode2 = semanticsNode3;
                                                if (g0.g(semanticsPropertyKey2, semanticsProperties2.getText())) {
                                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) r0.L2(list2) : null;
                                                    j13 = j14;
                                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig$ui_release(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) r0.L2(list3) : null;
                                                    if (!g0.g(annotatedString, annotatedString2)) {
                                                        sendContentCaptureTextUpdateEvent(semanticsNode2.getId(), String.valueOf(annotatedString2));
                                                    }
                                                    j17 >>= 8;
                                                    i26 = i12 + 1;
                                                    semanticsNode3 = semanticsNode2;
                                                    j14 = j13;
                                                }
                                            } else {
                                                i12 = i26;
                                                semanticsNode2 = semanticsNode3;
                                            }
                                            j13 = j14;
                                            j17 >>= 8;
                                            i26 = i12 + 1;
                                            semanticsNode3 = semanticsNode2;
                                            j14 = j13;
                                        }
                                        semanticsNode = semanticsNode3;
                                        j11 = j14;
                                        if (i25 != 8) {
                                            break;
                                        }
                                    } else {
                                        semanticsNode = semanticsNode3;
                                        j11 = j14;
                                    }
                                    if (i24 == length3) {
                                        break;
                                    }
                                    i24++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    semanticsNode3 = semanticsNode;
                                    j14 = j11;
                                }
                                i11 = 8;
                            }
                        }
                        j11 = j14;
                        i11 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j11 = j14;
                        c11 = c12;
                        j12 = j15;
                        i11 = i15;
                    }
                    j14 = j11 >> i11;
                    i17++;
                    intObjectMap2 = intObjectMap;
                    i15 = i11;
                    c12 = c11;
                    j15 = j12;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i16 != i15) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i14 == length) {
                return;
            }
            i14++;
            intObjectMap2 = intObjectMap;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        x00.a aVar;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i11 << 3) + i13]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (aVar = (x00.a) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.isEnabled$ui_release()) {
            Owner.measureAndLayout$default(androidContentCaptureManager.view, false, 1, null);
            androidContentCaptureManager.sendContentCaptureDisappearEvents();
            androidContentCaptureManager.sendContentCaptureAppearEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui_release());
            androidContentCaptureManager.updateSemanticsCopy();
            androidContentCaptureManager.checkingForSemanticsChanges = false;
        }
    }

    private final <T> void fastForEachIndexedWithFilter(List<? extends T> list, p<? super Integer, ? super T, g2> pVar, x00.l<? super T, Boolean> lVar) {
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t11 = list.get(i12);
            if (lVar.invoke(t11).booleanValue()) {
                pVar.invoke(Integer.valueOf(i11), t11);
                i11++;
            }
        }
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, p<? super Integer, ? super SemanticsNode, g2> pVar) {
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i12);
            if (getCurrentSemanticsNodes$ui_release().containsKey(semanticsNode2.getId())) {
                pVar.invoke(Integer.valueOf(i11), semanticsNode2);
                i11++;
            }
        }
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        x00.l lVar;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i11 << 3) + i13]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (g0.g(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (lVar = (x00.l) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final void notifyContentCaptureChanges() {
        AutofillId newAutofillId;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i11);
            int i12 = WhenMappings.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i12 == 1) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionCompat.notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else if (i12 == 2 && (newAutofillId = contentCaptureSessionCompat.newAutofillId(contentCaptureEvent.getId())) != null) {
                contentCaptureSessionCompat.notifyViewDisappeared(newAutofillId);
            }
        }
        contentCaptureSessionCompat.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.m(g2.f100423a);
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode semanticsNode, final SemanticsNodeCopy semanticsNodeCopy) {
        fastForEachReplacedVisibleChildren(semanticsNode, new p<Integer, SemanticsNode, g2>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Integer num, SemanticsNode semanticsNode2) {
                invoke(num.intValue(), semanticsNode2);
                return g2.f100423a;
            }

            public final void invoke(int i11, SemanticsNode semanticsNode2) {
                if (SemanticsNodeCopy.this.getChildren().contains(semanticsNode2.getId())) {
                    return;
                }
                this.updateBuffersOnAppeared(i11, semanticsNode2);
                this.notifySubtreeStateChangeIfNeeded();
            }
        });
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i11);
            if (getCurrentSemanticsNodes$ui_release().containsKey(semanticsNode2.getId()) && this.previousSemanticsNodes.containsKey(semanticsNode2.getId())) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(semanticsNode2.getId());
                if (semanticsNodeCopy2 == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
                sendContentCaptureAppearEvents(semanticsNode2, semanticsNodeCopy2);
            }
        }
    }

    private final void sendContentCaptureDisappearEvents() {
        MutableIntObjectMap<SemanticsNodeCopy> mutableIntObjectMap = this.previousSemanticsNodes;
        int[] iArr = mutableIntObjectMap.keys;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = iArr[(i11 << 3) + i13];
                        if (!getCurrentSemanticsNodes$ui_release().containsKey(i14)) {
                            bufferContentCaptureViewDisappeared(i14);
                            notifySubtreeStateChangeIfNeeded();
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int i11, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.contentCaptureSession) != null) {
            AutofillId newAutofillId = contentCaptureSessionCompat.newAutofillId(i11);
            if (newAutofillId != null) {
                contentCaptureSessionCompat.notifyViewTextChanged(newAutofillId, str);
            } else {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        x00.l lVar;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i11 << 3) + i13]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (g0.g(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (lVar = (x00.l) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode, int i11) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String m4299toLegacyClassNameV4PA4sw;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        if (semanticsNode.getParent() != null) {
            autofillId2 = contentCaptureSessionCompat.newAutofillId(r4.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        ViewStructureCompat newVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (newVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle extras = newVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong(VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP, this.currentSemanticsNodesSnapshotTimestampMillis);
            extras.putInt(VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX, i11);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getTestTag());
        if (str != null) {
            newVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getIsTraversalGroup())) != null) {
            newVirtualViewStructure.setClassName("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getText());
        if (list != null) {
            newVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            newVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            newVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            newVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getContentDescription());
        if (list2 != null) {
            newVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null && (m4299toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m4299toLegacyClassNameV4PA4sw(role.m4322unboximpl())) != null) {
            newVirtualViewStructure.setClassName(m4299toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui_release);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            newVirtualViewStructure.setTextStyle(TextUnit.m5309getValueimpl(layoutInput.getStyle().m4590getFontSizeXSAIIZE()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        Rect boundsInParent$ui_release = semanticsNode.getBoundsInParent$ui_release();
        newVirtualViewStructure.setDimens((int) boundsInParent$ui_release.getLeft(), (int) boundsInParent$ui_release.getTop(), 0, 0, (int) (boundsInParent$ui_release.getRight() - boundsInParent$ui_release.getLeft()), (int) (boundsInParent$ui_release.getBottom() - boundsInParent$ui_release.getTop()));
        return newVirtualViewStructure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int i11, SemanticsNode semanticsNode) {
        if (isEnabled$ui_release()) {
            updateTranslationOnAppeared(semanticsNode);
            bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode, i11));
            fastForEachReplacedVisibleChildren(semanticsNode, new p<Integer, SemanticsNode, g2>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Integer num, SemanticsNode semanticsNode2) {
                    invoke(num.intValue(), semanticsNode2);
                    return g2.f100423a;
                }

                public final void invoke(int i12, SemanticsNode semanticsNode2) {
                    AndroidContentCaptureManager.this.updateBuffersOnAppeared(i12, semanticsNode2);
                }
            });
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (isEnabled$ui_release()) {
            bufferContentCaptureViewDisappeared(semanticsNode.getId());
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i11 = 0; i11 < size; i11++) {
                updateBuffersOnDisappeared(replacedChildren$ui_release.get(i11));
            }
        }
    }

    private final void updateSemanticsCopy() {
        this.previousSemanticsNodes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        int[] iArr = currentSemanticsNodes$ui_release.keys;
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            this.previousSemanticsNodes.set(iArr[i14], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr[i14]).getSemanticsNode(), getCurrentSemanticsNodes$ui_release()));
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui_release());
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        x00.l lVar;
        x00.l lVar2;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && g0.g(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (lVar2 = (x00.l) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !g0.g(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (lVar = (x00.l) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (c40.a1.b(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0092 -> B:11:0x0033). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(@m80.k j00.c<? super yz.g2> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r2 = r0.L$1
            e40.q r2 = (e40.q) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.e.n(r10)
        L33:
            r10 = r2
            r2 = r5
            goto L54
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            java.lang.Object r2 = r0.L$1
            e40.q r2 = (e40.q) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.e.n(r10)
            goto L65
        L4a:
            kotlin.e.n(r10)
            e40.o<yz.g2> r10 = r9.boundsUpdateChannel
            e40.q r10 = r10.iterator()
            r2 = r9
        L54:
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r5 = r10.a(r0)
            if (r5 != r1) goto L61
            goto L94
        L61:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L95
            r2.next()
            boolean r10 = r5.isEnabled$ui_release()
            if (r10 == 0) goto L79
            r5.notifyContentCaptureChanges()
        L79:
            boolean r10 = r5.checkingForSemanticsChanges
            if (r10 != 0) goto L86
            r5.checkingForSemanticsChanges = r4
            android.os.Handler r10 = r5.handler
            java.lang.Runnable r6 = r5.contentCaptureChangeChecker
            r10.post(r6)
        L86:
            long r6 = r5.SendRecurringContentCaptureEventsIntervalMillis
            r0.L$0 = r5
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r10 = c40.a1.b(r6, r0)
            if (r10 != r1) goto L33
        L94:
            return r1
        L95:
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.boundsUpdatesEventLoop$ui_release(j00.c):java.lang.Object");
    }

    @l
    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.contentCaptureSession;
    }

    @m80.k
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    @m80.k
    public final Handler getHandler$ui_release() {
        return this.handler;
    }

    @m80.k
    public final x00.a<ContentCaptureSessionCompat> getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    @m80.k
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean isEnabled$ui_release() {
        return ContentCaptureManager.Companion.isEnabled() && this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @RequiresApi(31)
    public final void onCreateVirtualViewTranslationRequests$ui_release(@m80.k long[] jArr, @m80.k int[] iArr, @m80.k Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeStateChangeIfNeeded();
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@m80.k LifecycleOwner lifecycleOwner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@m80.k LifecycleOwner lifecycleOwner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@m80.k View view) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    @RequiresApi(31)
    public final void onVirtualViewTranslationResponses$ui_release(@m80.k AndroidContentCaptureManager androidContentCaptureManager, @m80.k LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(androidContentCaptureManager, longSparseArray);
    }

    public final void setContentCaptureSession$ui_release(@l ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final void setCurrentSemanticsNodes$ui_release(@m80.k IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        this.currentSemanticsNodes = intObjectMap;
    }

    public final void setOnContentCaptureSession(@m80.k x00.a<? extends ContentCaptureSessionCompat> aVar) {
        this.onContentCaptureSession = aVar;
    }

    @VisibleForTesting
    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@m80.k View view) {
    }
}
