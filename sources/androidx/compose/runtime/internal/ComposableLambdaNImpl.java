package androidx.compose.runtime.internal;

import a00.a0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import g10.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v0;
import m80.k;
import m80.l;
import x00.p;
import x00.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n37#2,2:182\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n114#1:182,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;

    @l
    private Object _block;
    private final int arity;
    private final int key;

    @l
    private RecomposeScope scope;

    @l
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i11, boolean z11, int i12) {
        this.key = i11;
        this.tracked = z11;
        this.arity = i12;
    }

    private final int realParamCount(int i11) {
        int i12 = i11 - 2;
        for (int i13 = 1; i13 * 10 < i12; i13++) {
            i12--;
        }
        return i12;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (ComposableLambdaKt.replacableWith(list.get(i11), recomposeScope)) {
                list.set(i11, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // x00.x, kotlin.jvm.internal.c0
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // x00.x
    @l
    public Object invoke(@k final Object... objArr) {
        final int realParamCount = realParamCount(objArr.length);
        Object obj = objArr[realParamCount];
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = a0.ku(objArr, u.W1(0, objArr.length - 1)).toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        g0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Composer startRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = intValue | (startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(realParamCount) : ComposableLambdaKt.sameBits(realParamCount));
        Object obj3 = this._block;
        g0.n(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        v0 v0Var = new v0(2);
        v0Var.b(array);
        v0Var.a(Integer.valueOf(differentBits));
        Object invoke = ((x) obj3).invoke(v0Var.d(new Object[v0Var.c()]));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl$invoke$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer, int i11) {
                    Object[] array2 = a0.ku(objArr, u.W1(0, realParamCount)).toArray(new Object[0]);
                    Object obj4 = objArr[realParamCount + 1];
                    g0.n(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int updateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj4).intValue());
                    int length = (objArr.length - realParamCount) - 2;
                    Object[] objArr2 = new Object[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        Object obj5 = objArr[realParamCount + 2 + i12];
                        g0.n(obj5, "null cannot be cast to non-null type kotlin.Int");
                        objArr2[i12] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj5).intValue()));
                    }
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    v0 v0Var2 = new v0(4);
                    v0Var2.b(array2);
                    v0Var2.a(composer);
                    v0Var2.a(Integer.valueOf(updateChangedFlags | 1));
                    v0Var2.b(objArr2);
                    composableLambdaNImpl.invoke(v0Var2.d(new Object[v0Var2.c()]));
                }
            });
        }
        return invoke;
    }

    public final void update(@k Object obj) {
        if (g0.g(obj, this._block)) {
            return;
        }
        boolean z11 = this._block == null;
        g0.n(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (x) obj;
        if (z11) {
            return;
        }
        trackWrite();
    }
}
