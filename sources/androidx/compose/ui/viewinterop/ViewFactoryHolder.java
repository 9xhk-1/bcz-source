package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ViewRootForInspector;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    private final int compositeKeyHash;

    @k
    private final NestedScrollDispatcher dispatcher;

    @k
    private l<? super T, g2> releaseBlock;

    @k
    private l<? super T, g2> resetBlock;

    @m80.l
    private SaveableStateRegistry.Entry savableRegistryEntry;

    @k
    private final String saveStateKey;

    @m80.l
    private final SaveableStateRegistry saveStateRegistry;

    @k
    private final T typedView;

    @k
    private l<? super T, g2> updateBlock;

    public /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i11, Owner owner, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : compositionContext, view, (i12 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i11, owner);
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new x00.a<Object>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                final /* synthetic */ ViewFactoryHolder<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // x00.a
                public final Object invoke() {
                    View view;
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    view = ((ViewFactoryHolder) this.this$0).typedView;
                    view.saveHierarchyState(sparseArray);
                    return sparseArray;
                }
            }));
        }
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }

    @k
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @k
    public final l<T, g2> getReleaseBlock() {
        return this.releaseBlock;
    }

    @k
    public final l<T, g2> getResetBlock() {
        return this.resetBlock;
    }

    @k
    public final l<T, g2> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setReleaseBlock(@k l<? super T, g2> lVar) {
        this.releaseBlock = lVar;
        setRelease(new x00.a<g2>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View view;
                view = ((ViewFactoryHolder) this.this$0).typedView;
                this.this$0.getReleaseBlock().invoke(view);
                this.this$0.unregisterSaveStateProvider();
            }
        });
    }

    public final void setResetBlock(@k l<? super T, g2> lVar) {
        this.resetBlock = lVar;
        setReset(new x00.a<g2>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View view;
                view = ((ViewFactoryHolder) this.this$0).typedView;
                this.this$0.getResetBlock().invoke(view);
            }
        });
    }

    public final void setUpdateBlock(@k l<? super T, g2> lVar) {
        this.updateBlock = lVar;
        setUpdate(new x00.a<g2>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View view;
                view = ((ViewFactoryHolder) this.this$0).typedView;
                this.this$0.getUpdateBlock().invoke(view);
            }
        });
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t11, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i11, Owner owner) {
        super(context, compositionContext, i11, nestedScrollDispatcher, t11, owner);
        this.typedView = t11;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.compositeKeyHash = i11;
        setClipChildren(false);
        String valueOf = String.valueOf(i11);
        this.saveStateKey = valueOf;
        Object consumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(valueOf) : null;
        SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
        if (sparseArray != null) {
            t11.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, l lVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i11, Owner owner, int i12, v vVar) {
        this(context, lVar, (i12 & 4) != 0 ? null : compositionContext, saveableStateRegistry, i11, owner);
    }

    public ViewFactoryHolder(@k Context context, @k l<? super Context, ? extends T> lVar, @m80.l CompositionContext compositionContext, @m80.l SaveableStateRegistry saveableStateRegistry, int i11, @k Owner owner) {
        this(context, compositionContext, lVar.invoke(context), null, saveableStateRegistry, i11, owner, 8, null);
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @k
    public View getViewRoot() {
        return this;
    }
}
