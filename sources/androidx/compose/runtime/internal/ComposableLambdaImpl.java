package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import x00.b;
import x00.c;
import x00.e;
import x00.f;
import x00.g;
import x00.h;
import x00.i;
import x00.j;
import x00.m;
import x00.n;
import x00.p;
import x00.q;
import x00.r;
import x00.s;
import x00.t;
import x00.u;
import x00.v;
import x00.w;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class ComposableLambdaImpl implements ComposableLambda {
    public static final int $stable = 0;

    @l
    private Object _block;
    private final int key;

    @l
    private RecomposeScope scope;

    @l
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaImpl(int i11, boolean z11, @l Object obj) {
        this.key = i11;
        this.tracked = z11;
        this._block = obj;
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

    public final int getKey() {
        return this.key;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }

    public final void update(@k Object obj) {
        if (g0.g(this._block, obj)) {
            return;
        }
        boolean z11 = this._block == null;
        this._block = obj;
        if (z11) {
            return;
        }
        trackWrite();
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer, Integer num) {
        return invoke(obj, composer, num.intValue());
    }

    @Override // x00.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Composer composer, Integer num) {
        return invoke(obj, obj2, composer, num.intValue());
    }

    @Override // x00.s
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, composer, num.intValue());
    }

    @Override // x00.t
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, composer, num.intValue());
    }

    @Override // x00.u
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, composer, num.intValue());
    }

    @Override // x00.v
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, composer, num.intValue());
    }

    @Override // x00.w
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer, num.intValue());
    }

    @Override // x00.b
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer, num.intValue());
    }

    @Override // x00.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer, num.intValue());
    }

    @Override // x00.e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, composer, num.intValue(), num2.intValue());
    }

    @Override // x00.f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer, num.intValue(), num2.intValue());
    }

    @Override // x00.g
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composer, num.intValue(), num2.intValue());
    }

    @Override // x00.h
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composer, num.intValue(), num2.intValue());
    }

    @Override // x00.i
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, composer, num.intValue(), num2.intValue());
    }

    @Override // x00.j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composer, num.intValue(), num2.intValue());
    }

    @Override // x00.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, composer, num.intValue(), num2.intValue());
    }

    @Override // x00.m
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer, num.intValue(), num2.intValue());
    }

    @Override // x00.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composer, num.intValue(), num2.intValue());
    }

    @l
    public Object invoke(@k Composer composer, int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = i11 | (startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(0) : ComposableLambdaKt.sameBits(0));
        Object obj = this._block;
        g0.n(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((p) x0.q(obj, 2)).invoke(startRestartGroup, Integer.valueOf(differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$1(this));
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(1) : ComposableLambdaKt.sameBits(1);
        Object obj2 = this._block;
        g0.n(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((q) x0.q(obj2, 3)).invoke(obj, startRestartGroup, Integer.valueOf(differentBits | i11));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(2) : ComposableLambdaKt.sameBits(2);
        Object obj3 = this._block;
        g0.n(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((r) x0.q(obj3, 4)).invoke(obj, obj2, startRestartGroup, Integer.valueOf(differentBits | i11));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(3) : ComposableLambdaKt.sameBits(3);
        Object obj4 = this._block;
        g0.n(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((s) x0.q(obj4, 5)).invoke(obj, obj2, obj3, startRestartGroup, Integer.valueOf(differentBits | i11));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(4) : ComposableLambdaKt.sameBits(4);
        Object obj5 = this._block;
        g0.n(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((t) x0.q(obj5, 6)).invoke(obj, obj2, obj3, obj4, startRestartGroup, Integer.valueOf(differentBits | i11));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(5) : ComposableLambdaKt.sameBits(5);
        Object obj6 = this._block;
        g0.n(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((u) x0.q(obj6, 7)).invoke(obj, obj2, obj3, obj4, obj5, startRestartGroup, Integer.valueOf(i11 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(6) : ComposableLambdaKt.sameBits(6);
        Object obj7 = this._block;
        g0.n(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((v) x0.q(obj7, 8)).invoke(obj, obj2, obj3, obj4, obj5, obj6, startRestartGroup, Integer.valueOf(i11 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(7) : ComposableLambdaKt.sameBits(7);
        Object obj8 = this._block;
        g0.n(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((w) x0.q(obj8, 9)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, startRestartGroup, Integer.valueOf(i11 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(8) : ComposableLambdaKt.sameBits(8);
        Object obj9 = this._block;
        g0.n(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((b) x0.q(obj9, 10)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, startRestartGroup, Integer.valueOf(i11 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @k Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(9) : ComposableLambdaKt.sameBits(9);
        Object obj10 = this._block;
        g0.n(obj10, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((c) x0.q(obj10, 11)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, startRestartGroup, Integer.valueOf(i11 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @k Composer composer, final int i11, int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(10) : ComposableLambdaKt.sameBits(10);
        Object obj11 = this._block;
        g0.n(obj11, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((e) x0.q(obj11, 13)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj12 = obj;
                    Object obj13 = obj2;
                    Object obj14 = obj3;
                    Object obj15 = obj4;
                    Object obj16 = obj5;
                    Object obj17 = obj6;
                    Object obj18 = obj7;
                    Object obj19 = obj8;
                    Object obj20 = obj9;
                    Object obj21 = obj10;
                    int i14 = i11;
                    composableLambdaImpl.invoke(obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, composer2, i14 | 1, i14);
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @l final Object obj11, @k Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(11) : ComposableLambdaKt.sameBits(11);
        Object obj12 = this._block;
        g0.n(obj12, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((f) x0.q(obj12, 14)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return invoke;
        }
        endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return g2.f100423a;
            }

            public final void invoke(Composer composer2, int i13) {
                ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1, RecomposeScopeImplKt.updateChangedFlags(i12));
            }
        });
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @l final Object obj11, @l final Object obj12, @k Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(12) : ComposableLambdaKt.sameBits(12);
        Object obj13 = this._block;
        g0.n(obj13, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((g) x0.q(obj13, 15)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1, RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @l final Object obj11, @l final Object obj12, @l final Object obj13, @k Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(13) : ComposableLambdaKt.sameBits(13);
        Object obj14 = this._block;
        g0.n(obj14, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((h) x0.q(obj14, 16)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$14
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1, RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @l final Object obj11, @l final Object obj12, @l final Object obj13, @l final Object obj14, @k Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(14) : ComposableLambdaKt.sameBits(14);
        Object obj15 = this._block;
        g0.n(obj15, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((i) x0.q(obj15, 17)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$15
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1, RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @l final Object obj11, @l final Object obj12, @l final Object obj13, @l final Object obj14, @l final Object obj15, @k Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(15) : ComposableLambdaKt.sameBits(15);
        Object obj16 = this._block;
        g0.n(obj16, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((j) x0.q(obj16, 18)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1, RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @l final Object obj11, @l final Object obj12, @l final Object obj13, @l final Object obj14, @l final Object obj15, @l final Object obj16, @k Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(16) : ComposableLambdaKt.sameBits(16);
        Object obj17 = this._block;
        g0.n(obj17, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((x00.k) x0.q(obj17, 19)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$17
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1, RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @l final Object obj11, @l final Object obj12, @l final Object obj13, @l final Object obj14, @l final Object obj15, @l final Object obj16, @l final Object obj17, @k Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(17) : ComposableLambdaKt.sameBits(17);
        Object obj18 = this._block;
        g0.n(obj18, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"p17\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((m) x0.q(obj18, 20)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$18
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1, RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
        return invoke;
    }

    @l
    public Object invoke(@l final Object obj, @l final Object obj2, @l final Object obj3, @l final Object obj4, @l final Object obj5, @l final Object obj6, @l final Object obj7, @l final Object obj8, @l final Object obj9, @l final Object obj10, @l final Object obj11, @l final Object obj12, @l final Object obj13, @l final Object obj14, @l final Object obj15, @l final Object obj16, @l final Object obj17, @l final Object obj18, @k Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(18) : ComposableLambdaKt.sameBits(18);
        Object obj19 = this._block;
        g0.n(obj19, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"p17\")] kotlin.Any?, @[ParameterName(name = \"p18\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((n) x0.q(obj19, 21)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, startRestartGroup, Integer.valueOf(i11), Integer.valueOf(i12 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$19
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composer2, RecomposeScopeImplKt.updateChangedFlags(i11) | 1, RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
        return invoke;
    }
}
