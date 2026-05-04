package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import c40.k;
import c40.r0;
import j00.c;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultFloatingActionButtonElevation$elevation$2$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFloatingActionButtonElevation$elevation$2$1(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, c<? super DefaultFloatingActionButtonElevation$elevation$2$1> cVar) {
        super(2, cVar);
        this.$interactionSource = interactionSource;
        this.$animatable = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DefaultFloatingActionButtonElevation$elevation$2$1 defaultFloatingActionButtonElevation$elevation$2$1 = new DefaultFloatingActionButtonElevation$elevation$2$1(this.$interactionSource, this.$animatable, cVar);
        defaultFloatingActionButtonElevation$elevation$2$1.L$0 = obj;
        return defaultFloatingActionButtonElevation$elevation$2$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final r0 r0Var = (r0) this.L$0;
            final ArrayList arrayList = new ArrayList();
            i<Interaction> interactions = this.$interactionSource.getInteractions();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            j<? super Interaction> jVar = new j() { // from class: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1.1

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @d(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00731 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
                    final /* synthetic */ Interaction $targetInteraction;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00731(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, c<? super C00731> cVar) {
                        super(2, cVar);
                        this.$animatable = floatingActionButtonElevationAnimatable;
                        this.$targetInteraction = interaction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final c<g2> create(Object obj, c<?> cVar) {
                        return new C00731(this.$animatable, this.$targetInteraction, cVar);
                    }

                    @Override // x00.p
                    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                        return ((C00731) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object l11 = b.l();
                        int i11 = this.label;
                        if (i11 == 0) {
                            e.n(obj);
                            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
                            Interaction interaction = this.$targetInteraction;
                            this.label = 1;
                            if (floatingActionButtonElevationAnimatable.animateElevation(interaction, this) == l11) {
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

                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((Interaction) obj2, (c<? super g2>) cVar);
                }

                public final Object emit(Interaction interaction, c<? super g2> cVar) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    k.f(r0Var, null, null, new C00731(floatingActionButtonElevationAnimatable, (Interaction) a00.r0.A3(arrayList), null), 3, null);
                    return g2.f100423a;
                }
            };
            this.label = 1;
            if (interactions.collect(jVar, this) == l11) {
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
