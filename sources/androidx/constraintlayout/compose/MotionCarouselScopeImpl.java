package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.MotionLayoutScope;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MotionCarouselScopeImpl implements MotionCarouselScope, MotionItemsProvider {
    private int itemsCount;

    @l
    private q<? super Integer, ? super Composer, ? super Integer, g2> itemsProvider;

    @l
    private r<? super Integer, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, g2> itemsProviderWithProperties;

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public int count() {
        return this.itemsCount;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    @k
    public p<Composer, Integer, g2> getContent(final int i11) {
        return ComposableLambdaKt.composableLambdaInstance(752436001, true, new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionCarouselScopeImpl$getContent$1
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
                if ((i12 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(752436001, i12, -1, "androidx.constraintlayout.compose.MotionCarouselScopeImpl.getContent.<anonymous> (MotionCarousel.kt:354)");
                }
                q<Integer, Composer, Integer, g2> itemsProvider = MotionCarouselScopeImpl.this.getItemsProvider();
                if (itemsProvider != null) {
                    itemsProvider.invoke(Integer.valueOf(i11), composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public final int getItemsCount() {
        return this.itemsCount;
    }

    @l
    public final q<Integer, Composer, Integer, g2> getItemsProvider() {
        return this.itemsProvider;
    }

    @l
    public final r<Integer, androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, Composer, Integer, g2> getItemsProviderWithProperties() {
        return this.itemsProviderWithProperties;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public boolean hasItemsWithProperties() {
        return this.itemsProviderWithProperties != null;
    }

    @Override // androidx.constraintlayout.compose.MotionCarouselScope
    public void items(int i11, @k q<? super Integer, ? super Composer, ? super Integer, g2> qVar) {
        this.itemsCount = i11;
        this.itemsProvider = qVar;
    }

    @Override // androidx.constraintlayout.compose.MotionCarouselScope
    public void itemsWithProperties(int i11, @k r<? super Integer, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, g2> rVar) {
        this.itemsCount = i11;
        this.itemsProviderWithProperties = rVar;
    }

    public final void setItemsCount(int i11) {
        this.itemsCount = i11;
    }

    public final void setItemsProvider(@l q<? super Integer, ? super Composer, ? super Integer, g2> qVar) {
        this.itemsProvider = qVar;
    }

    public final void setItemsProviderWithProperties(@l r<? super Integer, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, g2> rVar) {
        this.itemsProviderWithProperties = rVar;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    @k
    public p<Composer, Integer, g2> getContent(final int i11, @k final androidx.compose.runtime.State<MotionLayoutScope.MotionProperties> state) {
        return ComposableLambdaKt.composableLambdaInstance(1612828220, true, new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionCarouselScopeImpl$getContent$2
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
                if ((i12 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1612828220, i12, -1, "androidx.constraintlayout.compose.MotionCarouselScopeImpl.getContent.<anonymous> (MotionCarousel.kt:361)");
                }
                r<Integer, androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, Composer, Integer, g2> itemsProviderWithProperties = MotionCarouselScopeImpl.this.getItemsProviderWithProperties();
                if (itemsProviderWithProperties != null) {
                    itemsProviderWithProperties.invoke(Integer.valueOf(i11), state, composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
