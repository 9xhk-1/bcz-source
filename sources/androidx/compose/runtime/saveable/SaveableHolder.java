package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1#2:265\n*E\n"})
/* loaded from: classes.dex */
final class SaveableHolder<T> implements SaverScope, RememberObserver {

    @l
    private SaveableStateRegistry.Entry entry;

    @k
    private Object[] inputs;

    @k
    private String key;

    @l
    private SaveableStateRegistry registry;

    @k
    private Saver<T, Object> saver;
    private T value;

    @k
    private final a<Object> valueProvider = new a<Object>(this) { // from class: androidx.compose.runtime.saveable.SaveableHolder$valueProvider$1
        final /* synthetic */ SaveableHolder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // x00.a
        public final Object invoke() {
            Saver saver;
            Object obj;
            saver = ((SaveableHolder) this.this$0).saver;
            SaveableHolder<T> saveableHolder = this.this$0;
            obj = ((SaveableHolder) saveableHolder).value;
            if (obj != null) {
                return saver.save(saveableHolder, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    };

    public SaveableHolder(@k Saver<T, Object> saver, @l SaveableStateRegistry saveableStateRegistry, @k String str, T t11, @k Object[] objArr) {
        this.saver = saver;
        this.registry = saveableStateRegistry;
        this.key = str;
        this.value = t11;
        this.inputs = objArr;
    }

    private final void register() {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (this.entry == null) {
            if (saveableStateRegistry != null) {
                RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, this.valueProvider.invoke());
                this.entry = saveableStateRegistry.registerProvider(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public boolean canBeSaved(@k Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        return saveableStateRegistry == null || saveableStateRegistry.canBeSaved(obj);
    }

    @l
    public final T getValueIfInputsDidntChange(@k Object[] objArr) {
        if (Arrays.equals(objArr, this.inputs)) {
            return this.value;
        }
        return null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        register();
    }

    public final void update(@k Saver<T, Object> saver, @l SaveableStateRegistry saveableStateRegistry, @k String str, T t11, @k Object[] objArr) {
        boolean z11;
        boolean z12 = true;
        if (this.registry != saveableStateRegistry) {
            this.registry = saveableStateRegistry;
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0.g(this.key, str)) {
            z12 = z11;
        } else {
            this.key = str;
        }
        this.saver = saver;
        this.value = t11;
        this.inputs = objArr;
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry == null || !z12) {
            return;
        }
        if (entry != null) {
            entry.unregister();
        }
        this.entry = null;
        register();
    }
}
