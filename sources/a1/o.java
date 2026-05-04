package a1;

import a00.a0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.Arrays;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends Lambda implements x00.l<k1.b<T>, T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State<x00.l<k1.b<T>, T>> f1359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(State<? extends x00.l<? super k1.b<T>, ? extends T>> state) {
            super(1);
            this.f1359a = state;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(@m80.k k1.b<T> it) {
            g0.p(it, "it");
            return (T) o.f(this.f1359a).invoke(it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends k1.j<T> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<k1.b<T>, T> f1360d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.l<? super k1.b<T>, ? extends T> lVar) {
            this.f1360d = lVar;
        }

        @Override // k1.j
        public T a(@m80.k k1.b<T> frameInfo) {
            g0.p(frameInfo, "frameInfo");
            return this.f1360d.invoke(frameInfo);
        }
    }

    @Composable
    @m80.k
    public static final n c(@m80.k p<?>[] properties, @m80.l Composer composer, int i11) {
        g0.p(properties, "properties");
        composer.startReplaceableGroup(34467846);
        Integer valueOf = Integer.valueOf(Arrays.hashCode(properties));
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new n(a0.dz(properties));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        n nVar = (n) rememberedValue;
        composer.endReplaceableGroup();
        return nVar;
    }

    @Composable
    @m80.k
    public static final <T> p<T> d(T t11, T t12, @m80.k String[] keyPath, @m80.l Composer composer, int i11) {
        g0.p(keyPath, "keyPath");
        composer.startReplaceableGroup(1613443783);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(keyPath);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new c1.d((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        c1.d dVar = (c1.d) rememberedValue;
        composer.startReplaceableGroup(-3686095);
        boolean changed2 = composer.changed(dVar) | composer.changed(t11) | composer.changed(t12);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new p(t11, dVar, t12);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        p<T> pVar = (p) rememberedValue2;
        composer.endReplaceableGroup();
        return pVar;
    }

    @Composable
    @m80.k
    public static final <T> p<T> e(T t11, @m80.k String[] keyPath, @m80.k x00.l<? super k1.b<T>, ? extends T> callback, @m80.l Composer composer, int i11) {
        g0.p(keyPath, "keyPath");
        g0.p(callback, "callback");
        composer.startReplaceableGroup(1613444845);
        Object valueOf = Integer.valueOf(Arrays.hashCode(keyPath));
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new c1.d((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        c1.d dVar = (c1.d) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(callback, composer, (i11 >> 6) & 14);
        composer.startReplaceableGroup(-3686552);
        boolean changed2 = composer.changed(dVar) | composer.changed(t11);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new p((Object) t11, dVar, (x00.l) new a(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        p<T> pVar = (p) rememberedValue2;
        composer.endReplaceableGroup();
        return pVar;
    }

    public static final <T> x00.l<k1.b<T>, T> f(State<? extends x00.l<? super k1.b<T>, ? extends T>> state) {
        return state.getValue();
    }

    public static final <T> b g(x00.l<? super k1.b<T>, ? extends T> lVar) {
        return new b(lVar);
    }
}
