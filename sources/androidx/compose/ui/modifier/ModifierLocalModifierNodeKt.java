package androidx.compose.ui.modifier;

import a00.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v0;
import m80.k;
import yz.h1;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,235:1\n1#2:236\n11065#3:237\n11400#3,3:238\n37#4,2:241\n37#4,2:253\n37#4,2:255\n150#5,3:243\n34#5,6:246\n153#5:252\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n*L\n198#1:237\n198#1:238,3\n198#1:241,2\n221#1:253,2\n233#1:255,2\n221#1:243,3\n221#1:246,6\n221#1:252\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalModifierNodeKt {
    @k
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    @k
    public static final <T> ModifierLocalMap modifierLocalMapOf(@k ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    @k
    public static final <T> ModifierLocalMap modifierLocalMapOf(@k Pair<? extends ModifierLocal<T>, ? extends T> pair) {
        SingleLocalMap singleLocalMap = new SingleLocalMap(pair.getFirst());
        singleLocalMap.mo3963set$ui_release(pair.getFirst(), pair.getSecond());
        return singleLocalMap;
    }

    @k
    public static final ModifierLocalMap modifierLocalMapOf(@k ModifierLocal<?> modifierLocal, @k ModifierLocal<?> modifierLocal2, @k ModifierLocal<?>... modifierLocalArr) {
        Pair a11 = h1.a(modifierLocal, null);
        v0 v0Var = new v0(2);
        v0Var.a(h1.a(modifierLocal2, null));
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList.add(h1.a(modifierLocal3, null));
        }
        v0Var.b(arrayList.toArray(new Pair[0]));
        return new MultiLocalMap(a11, (Pair[]) v0Var.d(new Pair[v0Var.c()]));
    }

    @k
    public static final ModifierLocalMap modifierLocalMapOf(@k Pair<? extends ModifierLocal<?>, ? extends Object> pair, @k Pair<? extends ModifierLocal<?>, ? extends Object> pair2, @k Pair<? extends ModifierLocal<?>, ? extends Object>... pairArr) {
        v0 v0Var = new v0(2);
        v0Var.a(pair2);
        v0Var.b(pairArr);
        return new MultiLocalMap(pair, (Pair[]) v0Var.d(new Pair[v0Var.c()]));
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            Pair a11 = h1.a(a0.jc(modifierLocalArr), null);
            List D9 = a0.D9(modifierLocalArr, 1);
            ArrayList arrayList = new ArrayList(D9.size());
            int size = D9.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(h1.a((ModifierLocal) D9.get(i11), null));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            return new MultiLocalMap(a11, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        return new SingleLocalMap((ModifierLocal) a0.jc(modifierLocalArr));
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(Pair... pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            Pair pair = (Pair) a0.jc(pairArr);
            Pair[] pairArr2 = (Pair[]) a0.D9(pairArr, 1).toArray(new Pair[0]);
            return new MultiLocalMap(pair, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
        }
        return new MultiLocalMap((Pair) a0.jc(pairArr), new Pair[0]);
    }
}
