package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import c40.l2;
import c40.n;
import c40.n2;
import c40.p2;
import c40.r0;
import com.jiongji.andriod.card.R;
import j00.c;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {R.styleable.Theme_drawable_revocation}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ UpdatableAnimationState $animationState;
    final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<NestedScrollScope, c<? super g2>, Object> {
        final /* synthetic */ l2 $animationJob;
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, l2 l2Var, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$animationState = updatableAnimationState;
            this.this$0 = contentInViewNode;
            this.$bringIntoViewSpec = bringIntoViewSpec;
            this.$animationJob = l2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(NestedScrollScope nestedScrollScope, c<? super g2> cVar) {
            return ((AnonymousClass1) create(nestedScrollScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float calculateScrollDelta;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                UpdatableAnimationState updatableAnimationState = this.$animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta(this.$bringIntoViewSpec);
                updatableAnimationState.setValue(calculateScrollDelta);
                final UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                final ContentInViewNode contentInViewNode = this.this$0;
                final l2 l2Var = this.$animationJob;
                l<Float, g2> lVar = new l<Float, g2>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Float f11) {
                        invoke(f11.floatValue());
                        return g2.f100423a;
                    }

                    public final void invoke(float f11) {
                        boolean z11;
                        ScrollingLogic scrollingLogic;
                        z11 = ContentInViewNode.this.reverseDirection;
                        float f12 = z11 ? 1.0f : -1.0f;
                        scrollingLogic = ContentInViewNode.this.scrollingLogic;
                        float m515toFloatk4lQ0M = f12 * scrollingLogic.m515toFloatk4lQ0M(scrollingLogic.m513reverseIfNeededMKHz9U(nestedScrollScope.mo469scrollByOzD1aCk(scrollingLogic.m513reverseIfNeededMKHz9U(scrollingLogic.m516toOffsettuRUvjQ(f12 * f11)), NestedScrollSource.Companion.m3625getUserInputWNlRxjI())));
                        if (Math.abs(m515toFloatk4lQ0M) < Math.abs(f11)) {
                            p2.i(l2Var, "Scroll animation cancelled because scroll was not consumed (" + m515toFloatk4lQ0M + " < " + f11 + ')', null, 2, null);
                        }
                    }
                };
                final ContentInViewNode contentInViewNode2 = this.this$0;
                final UpdatableAnimationState updatableAnimationState3 = this.$animationState;
                final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                a<g2> aVar = new a<g2>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
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
                        boolean z11;
                        float calculateScrollDelta2;
                        Rect focusedChildBounds;
                        BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = ContentInViewNode.this.bringIntoViewRequests;
                        ContentInViewNode contentInViewNode3 = ContentInViewNode.this;
                        while (true) {
                            if (bringIntoViewRequestPriorityQueue.requests.getSize() != 0) {
                                Rect invoke = ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                if (!(invoke == null ? true : ContentInViewNode.m408isMaxVisibleO0kMr_c$default(contentInViewNode3, invoke, 0L, 1, null))) {
                                    break;
                                }
                                n<g2> continuation = ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation();
                                g2 g2Var = g2.f100423a;
                                Result.a aVar2 = Result.Companion;
                                continuation.resumeWith(Result.m6308constructorimpl(g2Var));
                            } else {
                                break;
                            }
                        }
                        z11 = ContentInViewNode.this.trackingFocusedChild;
                        if (z11) {
                            focusedChildBounds = ContentInViewNode.this.getFocusedChildBounds();
                            if (focusedChildBounds != null && ContentInViewNode.m408isMaxVisibleO0kMr_c$default(ContentInViewNode.this, focusedChildBounds, 0L, 1, null)) {
                                ContentInViewNode.this.trackingFocusedChild = false;
                            }
                        }
                        UpdatableAnimationState updatableAnimationState4 = updatableAnimationState3;
                        calculateScrollDelta2 = ContentInViewNode.this.calculateScrollDelta(bringIntoViewSpec);
                        updatableAnimationState4.setValue(calculateScrollDelta2);
                    }
                };
                this.label = 1;
                if (updatableAnimationState2.animateToZero(lVar, aVar, this) == l11) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, c<? super ContentInViewNode$launchAnimation$2> cVar) {
        super(2, cVar);
        this.this$0 = contentInViewNode;
        this.$animationState = updatableAnimationState;
        this.$bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, cVar);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((ContentInViewNode$launchAnimation$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Object l11 = b.l();
        int i11 = this.label;
        try {
            try {
                if (i11 == 0) {
                    e.n(obj);
                    l2 A = n2.A(((r0) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    scrollingLogic = this.this$0.scrollingLogic;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, A, null);
                    this.label = 1;
                    if (scrollingLogic.scroll(mutatePriority, anonymousClass1, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return g2.f100423a;
            } catch (CancellationException e11) {
                throw e11;
            }
        } catch (Throwable th2) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
            this.this$0.trackingFocusedChild = false;
            throw th2;
        }
    }
}
