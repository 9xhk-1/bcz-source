package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c40.r0;
import com.jiongji.andriod.card.R;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {

    @k
    private final l<Object, Integer> indexForKeyMapping = new l<Object, Integer>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$indexForKeyMapping$1
        {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final Integer invoke(Object obj) {
            x00.a aVar;
            aVar = LazyLayoutSemanticsModifierNode.this.itemProviderLambda;
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) aVar.invoke();
            int itemCount = lazyLayoutItemProvider.getItemCount();
            int i11 = 0;
            while (true) {
                if (i11 >= itemCount) {
                    i11 = -1;
                    break;
                }
                if (g0.g(lazyLayoutItemProvider.getKey(i11), obj)) {
                    break;
                }
                i11++;
            }
            return Integer.valueOf(i11);
        }
    };

    @k
    private x00.a<? extends LazyLayoutItemProvider> itemProviderLambda;

    @k
    private Orientation orientation;
    private boolean reverseScrolling;
    private ScrollAxisRange scrollAxisRange;

    @m80.l
    private l<? super Integer, Boolean> scrollToIndexAction;

    @k
    private LazyLayoutSemanticState state;
    private boolean userScrollEnabled;

    public LazyLayoutSemanticsModifierNode(@k x00.a<? extends LazyLayoutItemProvider> aVar, @k LazyLayoutSemanticState lazyLayoutSemanticState, @k Orientation orientation, boolean z11, boolean z12) {
        this.itemProviderLambda = aVar;
        this.state = lazyLayoutSemanticState;
        this.orientation = orientation;
        this.userScrollEnabled = z11;
        this.reverseScrolling = z12;
        updateCachedSemanticsValues();
    }

    private final CollectionInfo getCollectionInfo() {
        return this.state.collectionInfo();
    }

    private final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    private final void updateCachedSemanticsValues() {
        this.scrollAxisRange = new ScrollAxisRange(new x00.a<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                LazyLayoutSemanticState lazyLayoutSemanticState;
                lazyLayoutSemanticState = LazyLayoutSemanticsModifierNode.this.state;
                return Float.valueOf(lazyLayoutSemanticState.getScrollOffset());
            }
        }, new x00.a<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                LazyLayoutSemanticState lazyLayoutSemanticState;
                lazyLayoutSemanticState = LazyLayoutSemanticsModifierNode.this.state;
                return Float.valueOf(lazyLayoutSemanticState.getMaxScrollOffset());
            }
        }, this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new l<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", i = {}, l = {R.styleable.Theme_drawable_reset_plan}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                final /* synthetic */ int $index;
                int label;
                final /* synthetic */ LazyLayoutSemanticsModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i11, c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.this$0 = lazyLayoutSemanticsModifierNode;
                    this.$index = i11;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final c<g2> create(Object obj, c<?> cVar) {
                    return new AnonymousClass2(this.this$0, this.$index, cVar);
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                    return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    LazyLayoutSemanticState lazyLayoutSemanticState;
                    Object l11 = b.l();
                    int i11 = this.label;
                    if (i11 == 0) {
                        e.n(obj);
                        lazyLayoutSemanticState = this.this$0.state;
                        int i12 = this.$index;
                        this.label = 1;
                        if (lazyLayoutSemanticState.scrollToItem(i12, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.n(obj);
                    }
                    return g2.f100423a;
                }
            }

            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Boolean invoke(int i11) {
                x00.a aVar;
                aVar = LazyLayoutSemanticsModifierNode.this.itemProviderLambda;
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) aVar.invoke();
                if (!(i11 >= 0 && i11 < lazyLayoutItemProvider.getItemCount())) {
                    InlineClassHelperKt.throwIllegalArgumentException("Can't scroll to index " + i11 + ", it is out of bounds [0, " + lazyLayoutItemProvider.getItemCount() + ')');
                }
                c40.k.f(LazyLayoutSemanticsModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass2(LazyLayoutSemanticsModifierNode.this, i11, null), 3, null);
                return Boolean.TRUE;
            }
        } : null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, this.indexForKeyMapping);
        if (isVertical()) {
            ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
            if (scrollAxisRange == null) {
                g0.S("scrollAxisRange");
                scrollAxisRange = null;
            }
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.scrollAxisRange;
            if (scrollAxisRange2 == null) {
                g0.S("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange2);
        }
        l<? super Integer, Boolean> lVar = this.scrollToIndexAction;
        if (lVar != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, lVar, 1, null);
        }
        SemanticsPropertiesKt.getScrollViewportLength$default(semanticsPropertyReceiver, null, new x00.a<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$applySemantics$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                LazyLayoutSemanticState lazyLayoutSemanticState;
                LazyLayoutSemanticState lazyLayoutSemanticState2;
                lazyLayoutSemanticState = LazyLayoutSemanticsModifierNode.this.state;
                int viewport = lazyLayoutSemanticState.getViewport();
                lazyLayoutSemanticState2 = LazyLayoutSemanticsModifierNode.this.state;
                return Float.valueOf(viewport - lazyLayoutSemanticState2.getContentPadding());
            }
        }, 1, null);
        SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, getCollectionInfo());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void update(@k x00.a<? extends LazyLayoutItemProvider> aVar, @k LazyLayoutSemanticState lazyLayoutSemanticState, @k Orientation orientation, boolean z11, boolean z12) {
        this.itemProviderLambda = aVar;
        this.state = lazyLayoutSemanticState;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (this.userScrollEnabled == z11 && this.reverseScrolling == z12) {
            return;
        }
        this.userScrollEnabled = z11;
        this.reverseScrolling = z12;
        updateCachedSemanticsValues();
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }
}
