package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;

    @k
    private final x00.a<LazyLayoutItemProvider> itemProvider;

    @k
    private final MutableScatterMap<Object, CachedItemContent> lambdasCache = ScatterMapKt.mutableScatterMapOf();

    @k
    private final SaveableStateHolder saveableStateHolder;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public final class CachedItemContent {

        @l
        private p<? super Composer, ? super Integer, g2> _content;

        @l
        private final Object contentType;
        private int index;

        @k
        private final Object key;

        public CachedItemContent(int i11, @k Object obj, @l Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i11;
        }

        private final p<Composer, Integer, g2> createContentLambda() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
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
                public final void invoke(Composer composer, int i11) {
                    Composer composer2;
                    SaveableStateHolder saveableStateHolder;
                    if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1403994769, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:87)");
                    }
                    LazyLayoutItemProvider invoke = LazyLayoutItemContentFactory.this.getItemProvider().invoke();
                    int index = this.getIndex();
                    if ((index >= invoke.getItemCount() || !g0.g(invoke.getKey(index), this.getKey())) && (index = invoke.getIndex(this.getKey())) != -1) {
                        this.index = index;
                    }
                    int i12 = index;
                    if (i12 != -1) {
                        composer.startReplaceGroup(-660404355);
                        saveableStateHolder = LazyLayoutItemContentFactory.this.saveableStateHolder;
                        composer2 = composer;
                        LazyLayoutItemContentFactoryKt.m897SkippableItemJVlU9Rs(invoke, StableValue.m919constructorimpl(saveableStateHolder), i12, StableValue.m919constructorimpl(this.getKey()), composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = composer;
                        composer2.startReplaceGroup(-660169871);
                        composer2.endReplaceGroup();
                    }
                    Object key = this.getKey();
                    boolean changedInstance = composer2.changedInstance(this);
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                    Object rememberedValue = composer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = LazyLayoutItemContentFactory.CachedItemContent.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        LazyLayoutItemContentFactory.CachedItemContent.this._content = null;
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    EffectsKt.DisposableEffect(key, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
        }

        @k
        public final p<Composer, Integer, g2> getContent() {
            p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            p<Composer, Integer, g2> createContentLambda = createContentLambda();
            this._content = createContentLambda;
            return createContentLambda;
        }

        @l
        public final Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        @k
        public final Object getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(@k SaveableStateHolder saveableStateHolder, @k x00.a<? extends LazyLayoutItemProvider> aVar) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = aVar;
    }

    @k
    public final p<Composer, Integer, g2> getContent(int i11, @k Object obj, @l Object obj2) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i11 && g0.g(cachedItemContent.getContentType(), obj2)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i11, obj, obj2);
        this.lambdasCache.set(obj, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    @l
    public final Object getContentType(@l Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider invoke = this.itemProvider.invoke();
        int index = invoke.getIndex(obj);
        if (index != -1) {
            return invoke.getContentType(index);
        }
        return null;
    }

    @k
    public final x00.a<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }
}
