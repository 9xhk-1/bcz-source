package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c40.l2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n+ 2 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1327:1\n397#2,3:1328\n354#2,6:1331\n364#2,3:1338\n367#2,9:1342\n400#2:1351\n397#2,3:1352\n354#2,6:1355\n364#2,3:1362\n367#2,9:1366\n400#2:1375\n1399#3:1337\n1270#3:1341\n1399#3:1361\n1270#3:1365\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n*L\n948#1:1328,3\n948#1:1331,6\n948#1:1338,3\n948#1:1342,9\n948#1:1351\n952#1:1352,3\n952#1:1355,6\n952#1:1362,3\n952#1:1366,9\n952#1:1375\n948#1:1337\n948#1:1341\n952#1:1361\n952#1:1365\n*E\n"})
/* loaded from: classes.dex */
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {

    @m80.k
    private final MutableLongObjectMap<DoubleKeyClickState> doubleKeyClickStates;
    private boolean hapticFeedbackEnabled;

    @m80.k
    private final MutableLongObjectMap<l2> longKeyPressJobs;

    @l
    private x00.a<g2> onDoubleClick;

    @l
    private x00.a<g2> onLongClick;

    @l
    private String onLongClickLabel;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class DoubleKeyClickState {
        public static final int $stable = 8;
        private boolean doubleTapMinTimeMillisElapsed;

        @m80.k
        private final l2 job;

        public DoubleKeyClickState(@m80.k l2 l2Var) {
            this.job = l2Var;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        @m80.k
        public final l2 getJob() {
            return this.job;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean z11) {
            this.doubleTapMinTimeMillisElapsed = z11;
        }
    }

    public /* synthetic */ CombinedClickableNode(x00.a aVar, String str, x00.a aVar2, x00.a aVar3, boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, String str2, Role role, v vVar) {
        this(aVar, str, aVar2, aVar3, z11, mutableInteractionSource, indicationNodeFactory, z12, str2, role);
    }

    private final void resetKeyPressState() {
        long j11;
        long j12;
        long j13;
        MutableLongObjectMap<l2> mutableLongObjectMap = this.longKeyPressJobs;
        Object[] objArr = mutableLongObjectMap.values;
        long[] jArr = mutableLongObjectMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            j11 = 128;
            j12 = 255;
            while (true) {
                long j14 = jArr[i11];
                j13 = -9187201950435737472L;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j14 & 255) < 128) {
                            l2.a.b((l2) objArr[(i11 << 3) + i13], null, 1, null);
                        }
                        j14 >>= 8;
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
        } else {
            j11 = 128;
            j12 = 255;
            j13 = -9187201950435737472L;
        }
        mutableLongObjectMap.clear();
        MutableLongObjectMap<DoubleKeyClickState> mutableLongObjectMap2 = this.doubleKeyClickStates;
        Object[] objArr2 = mutableLongObjectMap2.values;
        long[] jArr2 = mutableLongObjectMap2.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j15 = jArr2[i14];
                if ((((~j15) << 7) & j15 & j13) != j13) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j15 & j12) < j11) {
                            l2.a.b(((DoubleKeyClickState) objArr2[(i14 << 3) + i16]).getJob(), null, 1, null);
                        }
                        j15 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length2) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        mutableLongObjectMap2.clear();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new x00.a<Boolean>() { // from class: androidx.compose.foundation.CombinedClickableNode$applyAdditionalSemantics$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    x00.a aVar;
                    aVar = CombinedClickableNode.this.onLongClick;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    return Boolean.TRUE;
                }
            });
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    @l
    public Object clickPointerInput(@m80.k PointerInputScope pointerInputScope, @m80.k j00.c<? super g2> cVar) {
        Object detectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, (!getEnabled() || this.onDoubleClick == null) ? null : new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                m285invokek4lQ0M(offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m285invokek4lQ0M(long j11) {
                x00.a aVar;
                aVar = CombinedClickableNode.this.onDoubleClick;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }, (!getEnabled() || this.onLongClick == null) ? null : new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$3
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                m286invokek4lQ0M(offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m286invokek4lQ0M(long j11) {
                x00.a aVar;
                aVar = CombinedClickableNode.this.onLongClick;
                if (aVar != null) {
                    aVar.invoke();
                }
                if (CombinedClickableNode.this.getHapticFeedbackEnabled()) {
                    ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalHapticFeedback())).mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3243getLongPress5zf0vsI());
                }
            }
        }, new CombinedClickableNode$clickPointerInput$4(this, null), new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$5
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                m288invokek4lQ0M(offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m288invokek4lQ0M(long j11) {
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode.this.getOnClick().invoke();
                }
            }
        }, cVar);
        return detectTapGestures == kotlin.coroutines.intrinsics.b.l() ? detectTapGestures : g2.f100423a;
    }

    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void onCancelKeyInput() {
        resetKeyPressState();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public boolean mo202onClickKeyDownEventZmokQxo(@m80.k KeyEvent keyEvent) {
        boolean z11;
        l2 f11;
        long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
        if (this.onLongClick == null || this.longKeyPressJobs.get(m3588getKeyZmokQxo) != null) {
            z11 = false;
        } else {
            MutableLongObjectMap<l2> mutableLongObjectMap = this.longKeyPressJobs;
            f11 = c40.k.f(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3, null);
            mutableLongObjectMap.set(m3588getKeyZmokQxo, f11);
            z11 = true;
        }
        DoubleKeyClickState doubleKeyClickState = this.doubleKeyClickStates.get(m3588getKeyZmokQxo);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().isActive()) {
                l2.a.b(doubleKeyClickState.getJob(), null, 1, null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.doubleKeyClickStates.remove(m3588getKeyZmokQxo);
                    return z11;
                }
            } else {
                this.doubleKeyClickStates.remove(m3588getKeyZmokQxo);
            }
        }
        return z11;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public boolean mo203onClickKeyUpEventZmokQxo(@m80.k KeyEvent keyEvent) {
        x00.a<g2> aVar;
        l2 f11;
        long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
        boolean z11 = false;
        if (this.longKeyPressJobs.get(m3588getKeyZmokQxo) != null) {
            l2 l2Var = this.longKeyPressJobs.get(m3588getKeyZmokQxo);
            if (l2Var != null) {
                if (l2Var.isActive()) {
                    l2.a.b(l2Var, null, 1, null);
                } else {
                    z11 = true;
                }
            }
            this.longKeyPressJobs.remove(m3588getKeyZmokQxo);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.get(m3588getKeyZmokQxo) != null) {
                if (!z11 && (aVar = this.onDoubleClick) != null) {
                    aVar.invoke();
                }
                this.doubleKeyClickStates.remove(m3588getKeyZmokQxo);
            } else if (!z11) {
                MutableLongObjectMap<DoubleKeyClickState> mutableLongObjectMap = this.doubleKeyClickStates;
                f11 = c40.k.f(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, m3588getKeyZmokQxo, null), 3, null);
                mutableLongObjectMap.set(m3588getKeyZmokQxo, new DoubleKeyClickState(f11));
            }
        } else if (!z11) {
            getOnClick().invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        resetKeyPressState();
    }

    public final void setHapticFeedbackEnabled(boolean z11) {
        this.hapticFeedbackEnabled = z11;
    }

    /* renamed from: update-nSzSaCc, reason: not valid java name */
    public final void m284updatenSzSaCc(@m80.k x00.a<g2> aVar, @l String str, @l x00.a<g2> aVar2, @l x00.a<g2> aVar3, @l MutableInteractionSource mutableInteractionSource, @l IndicationNodeFactory indicationNodeFactory, boolean z11, @l String str2, @l Role role) {
        boolean z12;
        if (!g0.g(this.onLongClickLabel, str)) {
            this.onLongClickLabel = str;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if ((this.onLongClick == null) != (aVar2 == null)) {
            disposeInteractions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
            z12 = true;
        } else {
            z12 = false;
        }
        this.onLongClick = aVar2;
        if ((this.onDoubleClick == null) != (aVar3 == null)) {
            z12 = true;
        }
        this.onDoubleClick = aVar3;
        boolean z13 = getEnabled() == z11 ? z12 : true;
        m207updateCommonQzZPfjk(mutableInteractionSource, indicationNodeFactory, z11, str2, role, aVar);
        if (z13) {
            resetPointerInputHandler();
        }
    }

    private CombinedClickableNode(x00.a<g2> aVar, String str, x00.a<g2> aVar2, x00.a<g2> aVar3, boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z12, str2, role, aVar, null);
        this.onLongClickLabel = str;
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
        this.hapticFeedbackEnabled = z11;
        this.longKeyPressJobs = LongObjectMapKt.mutableLongObjectMapOf();
        this.doubleKeyClickStates = LongObjectMapKt.mutableLongObjectMapOf();
    }
}
